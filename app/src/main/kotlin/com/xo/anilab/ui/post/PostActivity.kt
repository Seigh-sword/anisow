package com.xo.anilab.ui.post

import android.content.Context
import android.content.Intent
import android.net.Uri
import android.os.Build
import android.os.Bundle
import android.provider.Settings
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.Lifecycle
import androidx.lifecycle.lifecycleScope
import androidx.lifecycle.repeatOnLifecycle
import androidx.recyclerview.widget.LinearLayoutManager
import com.google.android.material.bottomsheet.BottomSheetDialog
import com.xo.anilab.R
import com.xo.anilab.core.GradientText
import com.xo.anilab.core.Resource
import com.xo.anilab.core.loadPoster
import com.xo.anilab.core.setVisible
import com.xo.anilab.core.toast
import com.xo.anilab.data.model.PlayerConfig
import com.xo.anilab.data.model.Season
import com.xo.anilab.data.remote.responses.PostResponse
import com.xo.anilab.databinding.ActivityPostBinding
import com.xo.anilab.databinding.BottomSheetPlayerBinding
import com.xo.anilab.di.ServiceLocator
import com.xo.anilab.player.PlayerInstaller
import com.xo.anilab.player.PlayerLauncher
import com.xo.anilab.ui.common.PostAdapter
import com.xo.anilab.ui.common.SeasonAdapter
import kotlinx.coroutines.flow.collectLatest
import kotlinx.coroutines.launch

/**
 * The detail screen: metadata, the watch and watch-list actions, and the three
 * strips the backend fills (seasons, related, similar).
 *
 * Playing hands the episode to an external player. When no app handles that
 * intent, a sheet offers the download instead of failing silently.
 */
class PostActivity : AppCompatActivity() {

    private lateinit var binding: ActivityPostBinding
    private val viewModel: PostViewModel by viewModels { PostViewModel.factory() }

    private lateinit var relatedAdapter: PostAdapter
    private lateinit var similarAdapter: PostAdapter
    private lateinit var seasonsAdapter: SeasonAdapter

    private var current: PostResponse? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityPostBinding.inflate(layoutInflater)
        setContentView(binding.root)

        GradientText.apply(binding.title)

        binding.backBtn.setOnClickListener { finish() }
        binding.swipeRefresh.setOnRefreshListener { viewModel.load(postId) }
        binding.watch.setOnClickListener { play() }
        binding.watchlist.setOnClickListener { toggleWatchList() }
        binding.share.setOnClickListener { share() }

        relatedAdapter = PostAdapter { post -> openPost(post.id) }
        similarAdapter = PostAdapter { post -> openPost(post.id) }
        seasonsAdapter = SeasonAdapter { season -> openSeason(season) }

        binding.relatedPostList.apply {
            layoutManager = LinearLayoutManager(this@PostActivity, LinearLayoutManager.HORIZONTAL, false)
            adapter = relatedAdapter
            setHasFixedSize(true)
        }
        binding.similarPostList.apply {
            layoutManager = LinearLayoutManager(this@PostActivity, LinearLayoutManager.HORIZONTAL, false)
            adapter = similarAdapter
            setHasFixedSize(true)
        }
        binding.seasonsPostList.apply {
            layoutManager = LinearLayoutManager(this@PostActivity, LinearLayoutManager.HORIZONTAL, false)
            adapter = seasonsAdapter
            setHasFixedSize(true)
        }

        lifecycleScope.launch {
            repeatOnLifecycle(Lifecycle.State.STARTED) {
                launch { viewModel.post.collectLatest(::render) }
                launch { viewModel.inWatchList.collect(::renderWatchList) }
            }
        }

        viewModel.load(postId)
    }

    /** A season is a different post id on the same screen. */
    private fun openSeason(season: Season) {
        startActivity(intent(this, season.id))
        finish()
    }

    private fun openPost(id: Int) = startActivity(intent(this, id))

    private fun render(result: Resource<PostResponse>) {
        binding.loader.setVisible(result is Resource.Loading)
        if (result !is Resource.Loading) binding.swipeRefresh.isRefreshing = false

        when (result) {
            is Resource.Loading -> Unit
            is Resource.Failure -> toast(result.message)
            is Resource.Success -> bind(result.data)
        }
    }

    private fun bind(post: PostResponse) {
        current = post

        binding.background.loadPoster(post.poster)
        binding.title.text = post.title.orEmpty()
        binding.overview.text = post.overview.orEmpty()
        binding.genres.text = post.genres.orEmpty()

        binding.score.text = post.score.orEmpty()
        binding.scoreBlock.setVisible(!post.score.isNullOrBlank())

        binding.rating.text = post.rating.orEmpty()
        binding.ratingBlock.setVisible(!post.rating.isNullOrBlank())

        binding.age.text = post.age.orEmpty()
        binding.ageBlock.setVisible(!post.age.isNullOrBlank())

        binding.status.text = post.status.orEmpty()
        binding.premiered.text = post.premiered.orEmpty()
        binding.runtime.text = post.runtime.orEmpty()
        binding.type.text = post.type.orEmpty()

        binding.seasonsBlock.setVisible(post.seasons.isNotEmpty())
        seasonsAdapter.submitList(post.seasons)

        binding.relatedBlock.setVisible(post.related.isNotEmpty())
        relatedAdapter.submitList(post.related)

        binding.similarBlock.setVisible(post.similar.isNotEmpty())
        similarAdapter.submitList(post.similar)

        binding.share.setVisible(!post.share.isNullOrBlank())

        // A demo entry has no episode behind it; the original disabled the
        // watch action for these instead of hiding the whole screen.
        binding.watch.isEnabled = !post.isDemo
        binding.watch.alpha = if (post.isDemo) DISABLED_ALPHA else 1f
    }

    private fun renderWatchList(inList: Boolean) {
        binding.watchlistAdd.setVisible(!inList)
        binding.watchlistRemove.setVisible(inList)
    }

    private fun toggleWatchList() {
        viewModel.toggleWatchList { added ->
            toast(if (added) R.string.added_to_my_list else R.string.removed_from_my_list)
        }
    }

    private fun play() {
        val post = current ?: return
        if (post.isDemo) {
            toast(R.string.demo_unavailable)
            return
        }

        // The server decides which player an episode opens in. A missing
        // config is a server-side gap, not a missing install, so it must not
        // open the "install this player" sheet with nothing to name.
        val config = post.playerConfig ?: run {
            toast(R.string.player_missing_title)
            return
        }

        when (ServiceLocator.player().play(post)) {
            is PlayerLauncher.Result.Played -> Unit
            is PlayerLauncher.Result.PlayerMissing -> showPlayerSheet(config)
        }
    }

    /**
     * Playback is handed to a separate player app, and the payload's download
     * link is usually a Play Store page. This sheet is the path when that app is
     * not installed: it names the player, can fetch its APK with real progress,
     * and keeps the store link as the fallback.
     *
     * Without this the tap opened a `market://` URL that an emulator cannot
     * resolve, so nothing happened at all.
     */
    private fun showPlayerSheet(config: PlayerConfig) {
        val installer = PlayerInstaller(this)
        val sheet = BottomSheetDialog(this)
        val sheetBinding = BottomSheetPlayerBinding.inflate(layoutInflater)
        sheet.setContentView(sheetBinding.root)

        sheetBinding.title.text = config.playerName
        // The payload embeds a literal "\n" in the description; as-is it renders
        // as a stray backslash-n in the middle of a sentence.
        sheetBinding.status.text = config.playerDesc
            .replace("\\n", "\n")
            .ifBlank { getString(R.string.player_missing_message) }
        sheetBinding.closeIcon.setOnClickListener { sheet.dismiss() }

        val canDownload = installer.apkUrl(config) != null
        sheetBinding.actionBtn.setVisible(canDownload)
        sheetBinding.secondaryBtn.setVisible(!canDownload)

        sheetBinding.actionBtn.setOnClickListener {
            sheetBinding.actionBtn.setVisible(false)
            sheetBinding.progress.setVisible(true)

            lifecycleScope.launch {
                val result = installer.download(config) { percent ->
                    sheetBinding.progress.isIndeterminate = false
                    sheetBinding.progress.setProgressCompat(percent, true)
                    sheetBinding.status.text = getString(R.string.player_downloading, percent)
                }

                sheetBinding.progress.setVisible(false)
                when (result) {
                    is PlayerInstaller.Progress.Ready -> {
                        sheetBinding.status.setText(R.string.player_download_done)
                        openInstaller(installer, result.apk, sheet)
                    }

                    else -> {
                        sheetBinding.status.setText(R.string.player_download_failed)
                        sheetBinding.actionBtn.setVisible(false)
                        sheetBinding.secondaryBtn.setVisible(true)
                    }
                }
            }
        }

        sheetBinding.secondaryBtn.setOnClickListener {
            sheet.dismiss()
            runCatching { startActivity(installer.storeIntent(config)) }
                .onFailure { toast(R.string.player_no_link) }
        }

        sheet.show()
    }

    /**
     * The installer needs permission to install unknown apps. Sending the user to
     * that one settings page is the difference between "nothing happened" and an
     * actual install.
     */
    private fun openInstaller(installer: PlayerInstaller, apk: java.io.File, sheet: BottomSheetDialog) {
        val needsPermission = Build.VERSION.SDK_INT >= Build.VERSION_CODES.O &&
            !packageManager.canRequestPackageInstalls()

        if (needsPermission) {
            toast(R.string.player_download_done)
            runCatching {
                startActivity(
                    Intent(
                        Settings.ACTION_MANAGE_UNKNOWN_APP_SOURCES,
                        Uri.parse("package:$packageName"),
                    )
                )
            }
            return
        }

        runCatching { startActivity(installer.install(apk)) }
            .onFailure { toast(R.string.player_download_failed) }
        sheet.dismiss()
    }

    private fun share() {
        val link = current?.share?.takeIf { it.isNotBlank() } ?: return
        val send = Intent(Intent.ACTION_SEND).apply {
            type = "text/plain"
            putExtra(Intent.EXTRA_TEXT, link)
        }
        startActivity(Intent.createChooser(send, getString(R.string.share)))
    }

    private val postId: Int
        get() = intent.getIntExtra(EXTRA_POST_ID, NO_POST)

    companion object {
        private const val EXTRA_POST_ID = "POST_ID"
        private const val NO_POST = 0
        private const val DISABLED_ALPHA = 0.5f

        fun intent(context: Context, postId: Int): Intent =
            Intent(context, PostActivity::class.java).apply {
                putExtra(EXTRA_POST_ID, postId)
            }
    }
}
