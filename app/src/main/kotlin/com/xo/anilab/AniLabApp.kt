package com.xo.anilab

import android.app.Application
import com.google.firebase.FirebaseApp
import com.google.firebase.analytics.FirebaseAnalytics
import com.google.firebase.crashlytics.FirebaseCrashlytics
import com.xo.anilab.di.ServiceLocator
import timber.log.Timber

class AniLabApp : Application() {

    override fun onCreate() {
        super.onCreate()

        ServiceLocator.attach(this)
        installErrorHandler()

        if (BuildConfig.DEBUG) {
            Timber.plant(Timber.DebugTree())
        }

        configureFirebase()
    }

    /**
     * The original caught exceptions per screen and printed them. One handler
     * here reports unexpected failures once, and keeps them out of release
     * logcat.
     */
    private fun installErrorHandler() {
        val previous = Thread.getDefaultUncaughtExceptionHandler()
        Thread.setDefaultUncaughtExceptionHandler { thread, throwable ->
            if (BuildConfig.DEBUG) {
                Timber.e(throwable, "Uncaught on %s", thread.name)
            } else if (FirebaseApp.getApps(this).isNotEmpty()) {
                FirebaseCrashlytics.getInstance().recordException(throwable)
            }
            previous?.uncaughtException(thread, throwable)
        }
    }

    /**
     * Firebase is optional: the config file is not committed, so a build without
     * it must still run. Both SDKs are quiet in debug builds.
     */
    private fun configureFirebase() {
        if (FirebaseApp.getApps(this).isEmpty()) return

        FirebaseAnalytics.getInstance(this).setAnalyticsCollectionEnabled(!BuildConfig.DEBUG)
        FirebaseCrashlytics.getInstance().setCrashlyticsCollectionEnabled(!BuildConfig.DEBUG)
    }
}
