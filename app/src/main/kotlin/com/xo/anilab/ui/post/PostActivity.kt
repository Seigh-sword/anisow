package com.xo.anilab.ui.post

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.Lifecycle
import androidx.lifecycle.lifecycleScope
import androidx.lifecycle.repeatOnLifecycle
import androidx.recyclerview.widget.LinearLayoutManager
import com.google.android.material.bottomsheet.BottomSheetDialog
import com.xo.anilab.R
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

        binding.score.text = post.score?.toString().orEmpty()
        binding.scoreBlock.setVisible(post.score != null)

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
            toast(R.string.player_missing_title)
            return
        }
        val config = post.playerConfig

        if (config == null) {
            toast(R.string.player_missing_title)
            return
        }

        when (ServiceLocator.player().play(post)) {
            is PlayerLauncher.Result.Played -> Unit
            is PlayerLauncher.Result.PlayerMissing -> showPlayerSheet(config)
        }
    }

    /**
     * The player is a separate app; the sheet names it and links to its store
     * page rather than leaving the watch button dead.
     */
    private fun showPlayerSheet(config: PlayerConfig) {
        val sheet = BottomSheetDialog(this)
        val sheetBinding = BottomSheetPlayerBinding.inflate(layoutInflater)
        sheet.setContentView(sheetBinding.root)

        sheetBinding.title.text = config.playerName
        sheetBinding.message.text = config.playerDesc.ifBlank {
            getString(R.string.player_missing_message)
        }
        sheetBinding.closeIcon.setOnClickListener { sheet.dismiss() }
        sheetBinding.actionBtn.setOnClickListener {
            sheet.dismiss()
            runCatching { startActivity(ServiceLocator.player().installPlayer(config)) }
                .onFailure { toast(R.string.player_missing_title) }
        }

        sheet.show()
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
