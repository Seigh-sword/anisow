package com.xo.anilab.ui.post

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.viewModelScope
import com.xo.anilab.core.Resource
import com.xo.anilab.data.prefs.WatchListStore
import com.xo.anilab.data.remote.responses.PostResponse
import com.xo.anilab.data.repository.AniLabRepository
import com.xo.anilab.di.ServiceLocator
import com.xo.anilab.ui.common.viewModelFactory
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.launch

class PostViewModel(
    private val repository: AniLabRepository,
    private val watchList: WatchListStore,
) : ViewModel() {

    private val _post = MutableStateFlow<Resource<PostResponse>>(Resource.Loading())
    val post: StateFlow<Resource<PostResponse>> = _post.asStateFlow()

    private val _inWatchList = MutableStateFlow(false)
    val inWatchList: StateFlow<Boolean> = _inWatchList.asStateFlow()

    private var postId = NO_POST

    /**
     * The screen reloads for a season as well as for a fresh post, so [id] can
     * change while the same view model is alive.
     */
    fun load(id: Int) {
        if (id == NO_POST) return
        // A refresh of the same title keeps its content on screen; a new title
        // (a season, a related post) starts from an empty state.
        val previous = if (id == postId) _post.value.data else null
        postId = id
        viewModelScope.launch {
            _post.value = Resource.Loading(previous)
            _post.value = repository.post(id)
            _inWatchList.value = watchList.snapshot().contains(id)
        }
    }

    fun toggleWatchList(onResult: (Boolean) -> Unit) {
        if (postId == NO_POST) return
        viewModelScope.launch {
            val added = watchList.toggle(postId)
            _inWatchList.value = added
            onResult(added)
        }
    }

    companion object {
        private const val NO_POST = 0

        fun factory(): ViewModelProvider.Factory = viewModelFactory {
            PostViewModel(ServiceLocator.repository, ServiceLocator.watchList)
        }
    }
}
