package com.xo.anilab.ui.search

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.viewModelScope
import com.xo.anilab.core.Paged
import com.xo.anilab.core.Resource
import com.xo.anilab.data.model.Post
import com.xo.anilab.data.repository.AniLabRepository
import com.xo.anilab.di.ServiceLocator
import com.xo.anilab.ui.common.viewModelFactory
import kotlinx.coroutines.Job
import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.launch

/**
 * Search, plus the one filter this backend actually supports.
 *
 * `/search` and `/latest` ignore every extra query parameter (sending
 * `category=`, `type=` and friends returns byte-identical payloads), and the list
 * items carry only `id`, `poster` and `age` — no title, no genre, no type. So a
 * "Movies / Series" chip could not be computed on the client either, and the
 * only server-side filter that exists is `/category?id=`.
 *
 * Hence: a genre row that browses a category, and free-text search for
 * everything else. Selecting a genre replaces the query; typing replaces the
 * genre.
 */
class SearchViewModel(
    private val repository: AniLabRepository,
) : ViewModel() {

    /**
     * A chip in the filter row. `id == null` is the leading "All" chip, which the
     * fragment labels from resources; `name` is only used for real categories.
     */
    data class Genre(val id: Int?, val name: String?)

    private val _query = MutableStateFlow("")
    val query: StateFlow<String> = _query.asStateFlow()

    private val _genres = MutableStateFlow<List<Genre>>(emptyList())
    val genres: StateFlow<List<Genre>> = _genres.asStateFlow()

    /** The active genre chip, or null when the results are a text search. */
    private val _selectedGenre = MutableStateFlow<Int?>(null)
    val selectedGenre: StateFlow<Int?> = _selectedGenre.asStateFlow()

    private val _posts = MutableStateFlow<Resource<Paged<Post>>>(Resource.Success(Paged()))
    val posts: StateFlow<Resource<Paged<Post>>> = _posts.asStateFlow()

    private val _appending = MutableStateFlow(false)
    val appending: StateFlow<Boolean> = _appending.asStateFlow()

    private var debounce: Job? = null
    private var firstPage: Job? = null
    private var nextPage: Job? = null

    init {
        loadGenres()
    }

    /**
     * Chips come from `/categories`. That endpoint repeats some names under
     * different ids (Comedy 5 and 560000, Suspense 18 and 550000, Supernatural
     * 10 and 540000), so the row keeps the first id per name.
     */
    private fun loadGenres() {
        viewModelScope.launch {
            val result = repository.categories()
            if (result !is Resource.Success) return@launch

            val curated = result.data
                .distinctBy { it.name.lowercase() }
                .take(MAX_CHIPS)
                .map { Genre(it.id, it.name) }

            _genres.value = listOf(Genre(null, null)) + curated
        }
    }

    fun onQueryChanged(raw: String) {
        val query = raw.trim()
        if (query == _query.value) return
        _query.value = query

        // Typing is a search, so it clears the genre selection.
        if (query.isNotEmpty() && _selectedGenre.value != null) {
            _selectedGenre.value = null
        }

        debounce?.cancel()
        firstPage?.cancel()
        nextPage?.cancel()
        _appending.value = false

        if (query.isEmpty()) {
            _posts.value = Resource.Success(Paged())
            return
        }

        debounce = viewModelScope.launch {
            delay(DEBOUNCE_MS)
            search(query)
        }
    }

    fun selectGenre(id: Int?) {
        debounce?.cancel()
        firstPage?.cancel()
        nextPage?.cancel()
        _appending.value = false

        _selectedGenre.value = id
        _query.value = ""

        if (id == null) {
            _posts.value = Resource.Success(Paged())
            return
        }

        firstPage = viewModelScope.launch {
            _posts.value = Resource.Loading()
            show(repository.category(id, page = 1), page = 1, current = null)
        }
    }

    fun search(query: String = _query.value) {
        if (query.isEmpty()) return

        debounce?.cancel()
        firstPage?.cancel()
        nextPage?.cancel()
        _appending.value = false

        firstPage = viewModelScope.launch {
            _posts.value = Resource.Loading()
            val result = repository.search(query, page = 1)
            // A later keystroke already asked for something else.
            if (query != _query.value) return@launch
            show(result, page = 1, current = null)
        }
    }

    fun loadMore() {
        val current = _posts.value.data ?: return
        if (!current.hasMore) return
        if (firstPage?.isActive == true || nextPage?.isActive == true) return

        val query = _query.value
        val genre = _selectedGenre.value
        if (query.isEmpty() && genre == null) return

        _appending.value = true
        nextPage = viewModelScope.launch {
            val result = if (genre != null) {
                repository.category(genre, current.page + 1)
            } else {
                repository.search(query, current.page + 1)
            }
            if (query == _query.value && genre == _selectedGenre.value) {
                show(result, current.page + 1, current)
            }
            _appending.value = false
        }
    }

    /** One place that turns a page result into state, for both modes. */
    private fun show(result: Resource<List<Post>>, page: Int, current: Paged<Post>?) {
        _posts.value = when (result) {
            is Resource.Success ->
                if (current == null) {
                    Resource.Success(Paged.first(result.data))
                } else {
                    Resource.Success(current.append(result.data))
                }

            is Resource.Failure -> Resource.Failure(result.message, current)
            is Resource.Loading -> Resource.Loading(current)
        }
    }

    companion object {
        private const val DEBOUNCE_MS = 350L
        private const val MAX_CHIPS = 14

        fun factory(): ViewModelProvider.Factory = viewModelFactory {
            SearchViewModel(ServiceLocator.repository)
        }
    }
}
