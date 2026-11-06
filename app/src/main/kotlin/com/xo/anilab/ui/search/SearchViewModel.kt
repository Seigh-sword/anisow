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
 * Search is typed, so every keystroke can supersede the request before it.
 *
 * The first version guarded with an `inFlight` flag and returned early, which
 * silently dropped the second query and left the results of the first on
 * screen. Instead each search cancels its predecessor and the response is only
 * applied when it still belongs to the current query.
 */
class SearchViewModel(
    private val repository: AniLabRepository,
) : ViewModel() {

    private val _query = MutableStateFlow("")
    val query: StateFlow<String> = _query.asStateFlow()

    private val _posts = MutableStateFlow<Resource<Paged<Post>>>(Resource.Success(Paged()))
    val posts: StateFlow<Resource<Paged<Post>>> = _posts.asStateFlow()

    private val _appending = MutableStateFlow(false)
    val appending: StateFlow<Boolean> = _appending.asStateFlow()

    private var debounce: Job? = null
    private var firstPage: Job? = null
    private var nextPage: Job? = null

    fun onQueryChanged(raw: String) {
        val query = raw.trim()
        if (query == _query.value) return
        _query.value = query

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
            _posts.value = when (result) {
                is Resource.Success -> Resource.Success(Paged.first(result.data))
                is Resource.Failure -> Resource.Failure(result.message)
                is Resource.Loading -> Resource.Loading()
            }
        }
    }

    fun loadMore() {
        val current = _posts.value.data ?: return
        val query = _query.value
        if (query.isEmpty() || !current.hasMore) return
        if (firstPage?.isActive == true || nextPage?.isActive == true) return

        _appending.value = true
        nextPage = viewModelScope.launch {
            val result = repository.search(query, current.page + 1)
            if (query == _query.value) {
                _posts.value = when (result) {
                    is Resource.Success -> Resource.Success(current.append(result.data))
                    // A failed page keeps what is on screen; scrolling retries.
                    is Resource.Failure -> Resource.Failure(result.message, current)
                    is Resource.Loading -> Resource.Loading(current)
                }
            }
            _appending.value = false
        }
    }

    companion object {
        private const val DEBOUNCE_MS = 350L

        fun factory(): ViewModelProvider.Factory = viewModelFactory {
            SearchViewModel(ServiceLocator.repository)
        }
    }
}
