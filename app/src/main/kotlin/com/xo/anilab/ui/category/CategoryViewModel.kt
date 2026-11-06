package com.xo.anilab.ui.category

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

class CategoryViewModel(
    private val repository: AniLabRepository,
) : ViewModel() {

    private val _posts = MutableStateFlow<Resource<Paged<Post>>>(Resource.Loading())
    val posts: StateFlow<Resource<Paged<Post>>> = _posts.asStateFlow()

    private val _appending = MutableStateFlow(false)
    val appending: StateFlow<Boolean> = _appending.asStateFlow()

    private var categoryId = NO_CATEGORY
    private var inFlight = false
    private var firstPage: Job? = null

    /** The activity passes its intent extra once; later recreation re-reads it. */
    fun start(id: Int) {
        if (id == categoryId && _posts.value.data != null) return
        categoryId = id
        refresh()
    }

    fun refresh() {
        if (categoryId == NO_CATEGORY) return
        firstPage?.cancel()
        inFlight = true
        firstPage = viewModelScope.launch {
            _posts.value = Resource.Loading()
            when (val result = repository.category(categoryId, page = 1)) {
                is Resource.Success -> _posts.value = Resource.Success(Paged.first(result.data))
                is Resource.Failure -> _posts.value = Resource.Failure(result.message)
                is Resource.Loading -> Unit
            }
            inFlight = false
        }
    }

    fun loadMore() {
        val current = _posts.value.data ?: return
        if (inFlight || !current.hasMore || categoryId == NO_CATEGORY) return

        inFlight = true
        _appending.value = true
        viewModelScope.launch {
            when (val result = repository.category(categoryId, current.page + 1)) {
                is Resource.Success -> _posts.value = Resource.Success(current.append(result.data))
                is Resource.Failure -> _posts.value = Resource.Failure(result.message, current)
                is Resource.Loading -> Unit
            }
            _appending.value = false
            inFlight = false
        }
    }

    companion object {
        private const val NO_CATEGORY = 0

        fun factory(): ViewModelProvider.Factory = viewModelFactory {
            CategoryViewModel(ServiceLocator.repository)
        }
    }
}
