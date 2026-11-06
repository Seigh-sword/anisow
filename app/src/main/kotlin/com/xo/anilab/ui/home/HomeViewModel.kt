package com.xo.anilab.ui.home

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.viewModelScope
import com.xo.anilab.core.Resource
import com.xo.anilab.data.prefs.WatchListStore
import com.xo.anilab.data.remote.responses.HomeResponse
import com.xo.anilab.data.repository.AniLabRepository
import com.xo.anilab.di.ServiceLocator
import com.xo.anilab.ui.common.viewModelFactory
import kotlinx.coroutines.Job
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.launch

class HomeViewModel(
    private val repository: AniLabRepository,
    private val watchList: WatchListStore,
) : ViewModel() {

    private val _home = MutableStateFlow<Resource<HomeResponse>>(Resource.Loading())
    val home: StateFlow<Resource<HomeResponse>> = _home.asStateFlow()

    private var started = false
    private var inFlight: Job? = null

    fun start() {
        // The fragment is recreated on every tab switch; the feed is not.
        if (started) return
        started = true
        load()
    }

    /**
     * A retry tap can land while the first request is still running; the older
     * coroutine is cancelled so the newest response is the one on screen.
     */
    fun load() {
        val previous = _home.value.data
        inFlight?.cancel()
        inFlight = viewModelScope.launch {
            _home.value = Resource.Loading(previous)
            _home.value = repository.home()
        }
    }

    suspend fun toggleWatchList(id: Int): Boolean = watchList.toggle(id)

    suspend fun isInWatchList(id: Int): Boolean = watchList.snapshot().contains(id)

    companion object {
        fun factory(): ViewModelProvider.Factory = viewModelFactory {
            HomeViewModel(ServiceLocator.repository, ServiceLocator.watchList)
        }
    }
}
