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
 * Debounced search: the shipped screen fired a request per keystroke, this one
 * waits for a pause. A new query cancels the pending wait, not the request that
 * is already running, so results never arrive out of order.
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
    private var inFlight = false

    fun onQueryChanged(raw: String) {
        val query = raw.trim()
        _query.value = query
        debounce?.cancel()

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
        if (query.isEmpty() || inFlight) return
        inFlight = true
        viewModelScope.launch {
            _posts.value = Resource.Loading()
            when (val result = repository.search(query, page = 1)) {
                is Resource.Success -> _posts.value = Resource.Success(Paged.first(result.data))
                is Resource.Failure -> _posts.value = Resource.Failure(result.message)
                is Resource.Loading -> Unit
            }
            inFlight = false
        }
    }

    fun loadMore() {
        val current = _posts.value.data ?: return
        val query = _query.value
        if (query.isEmpty() || inFlight || !current.hasMore) return

        inFlight = true
        _appending.value = true
        viewModelScope.launch {
            when (val result = repository.search(query, current.page + 1)) {
                is Resource.Success -> _posts.value = Resource.Success(current.append(result.data))
                is Resource.Failure -> _posts.value = Resource.Failure(result.message, current)
                is Resource.Loading -> Unit
            }
            _appending.value = false
            inFlight = false
        }
    }

    companion object {
        private const val DEBOUNCE_MS = 350L

        fun factory(): ViewModelProvider.Factory = viewModelFactory {
            SearchViewModel(ServiceLocator.repository)
        }
    }
}
