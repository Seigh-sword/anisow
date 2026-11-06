package com.xo.anilab.ui.mylist

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.viewModelScope
import com.xo.anilab.core.Resource
import com.xo.anilab.data.model.Post
import com.xo.anilab.data.prefs.WatchListStore
import com.xo.anilab.data.repository.AniLabRepository
import com.xo.anilab.di.ServiceLocator
import com.xo.anilab.ui.common.viewModelFactory
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.launch

/**
 * The watch list lives on the device; the server only resolves ids to posts.
 * The response order is the server's, so the screen sorts newest first using
 * the stored order.
 */
class MyListViewModel(
    private val repository: AniLabRepository,
    private val watchList: WatchListStore,
) : ViewModel() {

    private val _posts = MutableStateFlow<Resource<List<Post>>>(Resource.Success(emptyList()))
    val posts: StateFlow<Resource<List<Post>>> = _posts.asStateFlow()

    fun refresh() {
        viewModelScope.launch {
            val ids = watchList.snapshot()
            if (ids.isEmpty()) {
                _posts.value = Resource.Success(emptyList())
                return@launch
            }

            _posts.value = Resource.Loading(_posts.value.data)
            when (val result = repository.watchList(ids)) {
                is Resource.Success -> {
                    // Keep the store order, newest first.
                    val byId = result.data.associateBy { it.id }
                    _posts.value = Resource.Success(
                        ids.asReversed().mapNotNull(byId::get)
                    )
                }
                is Resource.Failure -> _posts.value = result
                is Resource.Loading -> Unit
            }
        }
    }

    companion object {
        fun factory(): ViewModelProvider.Factory = viewModelFactory {
            MyListViewModel(ServiceLocator.repository, ServiceLocator.watchList)
        }
    }
}
