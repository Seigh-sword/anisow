package com.xo.anilab.di

import android.content.Context
import com.xo.anilab.data.prefs.NoticeStore
import com.xo.anilab.data.prefs.WatchListStore
import com.xo.anilab.data.remote.AniLabApi
import com.xo.anilab.data.remote.NetworkModule
import com.xo.anilab.data.repository.AniLabRepository
import com.xo.anilab.player.PlayerLauncher

/**
 * The app has a handful of singletons; a locator keeps them explicit without
 * pulling in a DI framework.
 */
object ServiceLocator {

    private var applicationContext: Context? = null

    fun attach(context: Context) {
        applicationContext = context.applicationContext
    }

    fun context(): Context = checkNotNull(applicationContext) {
        "ServiceLocator.attach() has not run yet"
    }

    val api: AniLabApi by lazy { NetworkModule.api }

    val repository: AniLabRepository by lazy { AniLabRepository(api) }

    val watchList: WatchListStore by lazy { WatchListStore(context()) }

    val notices: NoticeStore by lazy { NoticeStore(context()) }

    fun player(): PlayerLauncher = PlayerLauncher(context())
}
