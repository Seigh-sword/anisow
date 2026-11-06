package com.xo.anilab.ui.latest

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
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.launch

/**
 * The latest feed, paged. A failed page does not advance the counter, so a
 * retry asks for the same page again instead of skipping it.
 */
class LatestViewModel(
    private val repository: AniLabRepository,
) : ViewModel() {

    private val _posts = MutableStateFlow<Resource<Paged<Post>>>(Resource.Loading())
    val posts: StateFlow<Resource<Paged<Post>>> = _posts.asStateFlow()

    private val _appending = MutableStateFlow(false)
    val appending: StateFlow<Boolean> = _appending.asStateFlow()

    private var inFlight = false
    private var firstPage: Job? = null

    init {
        refresh()
    }

    fun refresh() {
        // A pull-to-refresh during the first load replaces it instead of being
        // dropped; the spinner would otherwise stop with nothing new on screen.
        if (inFlight) {
            firstPage?.cancel()
            inFlight = false
        }
        inFlight = true
        firstPage = viewModelScope.launch {
            _posts.value = Resource.Loading()
            when (val result = repository.latest(page = 1)) {
                is Resource.Success -> _posts.value = Resource.Success(Paged.first(result.data))
                is Resource.Failure -> _posts.value = Resource.Failure(result.message)
                is Resource.Loading -> Unit
            }
            inFlight = false
        }
    }

    fun loadMore() {
        val current = _posts.value.data ?: return
        if (inFlight || !current.hasMore) return

        inFlight = true
        _appending.value = true
        viewModelScope.launch {
            when (val result = repository.latest(page = current.page + 1)) {
                is Resource.Success -> _posts.value =
                    Resource.Success(current.append(result.data))

                // A failed page keeps what is already on screen; scrolling
                // again retries the same page.
                is Resource.Failure -> _posts.value =
                    Resource.Failure(result.message, current)
                is Resource.Loading -> Unit
            }
            _appending.value = false
            inFlight = false
        }
    }

    companion object {
        fun factory(): ViewModelProvider.Factory = viewModelFactory {
            LatestViewModel(ServiceLocator.repository)
        }
    }
}
