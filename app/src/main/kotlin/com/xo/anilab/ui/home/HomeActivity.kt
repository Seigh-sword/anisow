package com.xo.anilab.ui.home

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.view.View
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.core.splashscreen.SplashScreen.Companion.installSplashScreen
import androidx.fragment.app.Fragment
import androidx.lifecycle.Lifecycle
import androidx.lifecycle.lifecycleScope
import androidx.lifecycle.repeatOnLifecycle
import com.onesignal.OneSignal
import com.xo.anilab.R
import com.xo.anilab.core.NoticeController
import com.xo.anilab.core.Resource
import com.xo.anilab.databinding.ActivityHomeBinding
import com.xo.anilab.di.ServiceLocator
import com.xo.anilab.ui.categories.CategoriesFragment
import com.xo.anilab.ui.latest.LatestFragment
import com.xo.anilab.ui.mylist.MyListFragment
import com.xo.anilab.ui.post.PostActivity
import com.xo.anilab.ui.search.SearchFragment
import kotlinx.coroutines.launch

/**
 * The single entry screen. Five fragment containers are swapped by the bottom
 * navigation instead of a navigation graph: the tabs are not a back stack, and
 * each keeps its state in its own view model.
 */
class HomeActivity : AppCompatActivity() {

    private lateinit var binding: ActivityHomeBinding
    private val viewModel: HomeViewModel by viewModels { HomeViewModel.factory() }

    /** Notices get exactly one shot per process, so a refresh cannot re-show one. */
    private var noticesChecked = false

    /** The start-up retry is one second chance, not a retry loop. */
    private var retriedStartup = false

    override fun onCreate(savedInstanceState: Bundle?) {
        installSplashScreen()
        super.onCreate(savedInstanceState)

        binding = ActivityHomeBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.bottomNav.setOnItemSelectedListener { item ->
            showTab(item.itemId)
            true
        }

        binding.bottomNav.setOnItemReselectedListener { item ->
            // Reselecting the current tab scrolls it back to the top.
            findTabFragment(item.itemId)?.let(::scrollToTop)
        }

        if (savedInstanceState == null) {
            binding.bottomNav.selectedItemId = R.id.home
        }

        viewModel.start()
        handleIntent(intent)
        observe()
        startPush()
    }

    /**
     * Two start-up side effects ride on the home feed.
     *
     * Notices are shown once, and only after a successful load: the original
     * app asked for them after the feed came back, and only then.
     *
     * A failed first load also has nobody to retry it. The fragment shows the
     * message and stops, and it has no retry control of its own, so the first
     * failure gets one retry here; after that pull-to-refresh is the recovery.
     */
    private fun observe() {
        lifecycleScope.launch {
            repeatOnLifecycle(Lifecycle.State.STARTED) {
                viewModel.home.collect { result ->
                    when {
                        result is Resource.Success && !noticesChecked -> {
                            noticesChecked = true
                            NoticeController(
                                repository = ServiceLocator.repository,
                                store = ServiceLocator.notices,
                                fragmentManager = supportFragmentManager,
                            ).showPending()
                        }

                        result is Resource.Failure && !retriedStartup -> {
                            retriedStartup = true
                            viewModel.load()
                        }
                    }
                }
            }
        }
    }

    override fun onNewIntent(intent: Intent) {
        super.onNewIntent(intent)
        setIntent(intent)
        handleIntent(intent)
    }

    /**
     * Push is optional: the app id ships empty, so a build without it has no
     * notification code path at all. When it is set, the prompt is asked for
     * once, after the first screen is up — the request suspends since OneSignal
     * 5.x, so it needs a lifecycle-scoped coroutine.
     */
    private fun startPush() {
        val appId = getString(R.string.one_signal_app_id)
        if (appId.isBlank()) return

        OneSignal.initWithContext(this, appId)
        lifecycleScope.launch {
            OneSignal.Notifications.requestPermission(false)
        }
    }

    private fun showTab(itemId: Int) {
        val target = containerFor(itemId)
        val others = listOf(
            binding.homeFragment,
            binding.moviesFragment,
            binding.seriesFragment,
            binding.searchFragment,
            binding.myListFragment,
        )
        others.forEach { it.visibility = if (it === target) View.VISIBLE else View.GONE }

        val tag = tagFor(itemId)
        if (supportFragmentManager.findFragmentByTag(tag) == null) {
            supportFragmentManager.beginTransaction()
                .replace(target.id, createTab(itemId), tag)
                .commitNow()
        }
    }

    private fun containerFor(itemId: Int): View = when (itemId) {
        R.id.latest -> binding.moviesFragment
        R.id.categories -> binding.seriesFragment
        R.id.search -> binding.searchFragment
        R.id.watchlist -> binding.myListFragment
        else -> binding.homeFragment
    }

    private fun tagFor(itemId: Int): String = "tab_$itemId"

    private fun findTabFragment(itemId: Int): Fragment? =
        supportFragmentManager.findFragmentByTag(tagFor(itemId))

    /**
     * Only the home tab scrolls to a well-known view; for the others the top of
     * the list is the recycler itself.
     */
    private fun scrollToTop(fragment: Fragment) {
        val recycler = fragment.view?.findViewById<androidx.recyclerview.widget.RecyclerView>(
            R.id.section_list
        ) ?: fragment.view?.findViewById<androidx.recyclerview.widget.RecyclerView>(R.id.post_list)
        recycler?.smoothScrollToPosition(0)
    }

    private fun createTab(itemId: Int): Fragment = when (itemId) {
        R.id.latest -> LatestFragment.newInstance(R.string.latest)
        R.id.categories -> CategoriesFragment()
        R.id.search -> SearchFragment()
        R.id.watchlist -> MyListFragment()
        else -> HomeFragment()
    }

    /**
     * A notification can ask for either a raw link or a specific post.
     */
    private fun handleIntent(intent: Intent?) {
        intent ?: return

        intent.getStringExtra(EXTRA_OPEN_WEB_URL)?.let { url ->
            runCatching { startActivity(Intent(Intent.ACTION_VIEW, Uri.parse(url))) }
            intent.removeExtra(EXTRA_OPEN_WEB_URL)
        }

        val postId = intent.getIntExtra(EXTRA_OPEN_POST, NO_POST)
        if (postId > 0) {
            startActivity(PostActivity.intent(this, postId))
            intent.removeExtra(EXTRA_OPEN_POST)
        }
    }

    companion object {
        const val EXTRA_OPEN_WEB_URL = "OPEN_WEB_URL"
        const val EXTRA_OPEN_POST = "OPEN_POST"
        private const val NO_POST = -1
    }
}
