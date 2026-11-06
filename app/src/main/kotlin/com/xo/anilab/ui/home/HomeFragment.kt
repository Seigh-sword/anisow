package com.xo.anilab.ui.home

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.activityViewModels
import androidx.lifecycle.Lifecycle
import androidx.lifecycle.lifecycleScope
import androidx.lifecycle.repeatOnLifecycle
import androidx.recyclerview.widget.LinearLayoutManager
import com.xo.anilab.R
import com.xo.anilab.core.Resource
import com.xo.anilab.core.loadPoster
import com.xo.anilab.core.setVisible
import com.xo.anilab.core.toast
import com.xo.anilab.data.model.Featured
import com.xo.anilab.data.remote.responses.HomeResponse
import com.xo.anilab.databinding.FragmentHomeBinding
import com.xo.anilab.ui.common.SectionAdapter
import com.xo.anilab.ui.post.PostActivity
import kotlinx.coroutines.flow.collectLatest
import kotlinx.coroutines.launch

/**
 * Tab 1: a featured title, then one row per section the backend returns.
 */
class HomeFragment : Fragment() {

    private var _binding: FragmentHomeBinding? = null
    private val binding get() = requireNotNull(_binding)

    // Shared with the activity: the feed loads once when the app starts,
    // not again each time the tab is rebuilt.
    private val viewModel: HomeViewModel by activityViewModels { HomeViewModel.factory() }

    private lateinit var sectionAdapter: SectionAdapter
    private var featured: Featured? = null
    private var inWatchList = false

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View {
        _binding = FragmentHomeBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        sectionAdapter = SectionAdapter { post -> openPost(post.id) }
        binding.sectionList.apply {
            layoutManager = LinearLayoutManager(requireContext())
            adapter = sectionAdapter
            setHasFixedSize(true)
        }

        binding.swipeRefresh.setOnRefreshListener { viewModel.load() }
        binding.featuredWatch.setOnClickListener { featured?.let { openPost(it.id) } }
        binding.featuredShare.setOnClickListener { shareFeatured() }
        binding.featuredWatchlist.setOnClickListener { toggleWatchList() }

        viewLifecycleOwner.lifecycleScope.launch {
            viewLifecycleOwner.repeatOnLifecycle(Lifecycle.State.STARTED) {
                viewModel.home.collectLatest(::render)
            }
        }
    }

    private fun render(result: Resource<HomeResponse>) {
        binding.loader.setVisible(result is Resource.Loading)
        if (result !is Resource.Loading) binding.swipeRefresh.isRefreshing = false

        when (result) {
            is Resource.Loading -> Unit
            is Resource.Failure -> toast(result.message)
            is Resource.Success -> bind(result.data)
        }
    }

    private fun bind(home: HomeResponse) {
        val item = home.featured
        featured = item

        binding.featuredImage.loadPoster(item.poster)
        binding.featuredTitle.text = item.title.orEmpty()
        binding.featuredType.text = item.type.orEmpty()
        binding.featuredGenres.text = item.genres.orEmpty()
        binding.featuredStatus.text = item.status.orEmpty()
        binding.featuredPremiered.text = item.premiered.orEmpty()
        binding.featuredRuntime.text = item.runtime.orEmpty()

        binding.featuredScore.text = item.score?.toString().orEmpty()
        binding.featuredScoreblock.setVisible(item.score != null)

        binding.featuredRating.text = item.rating.orEmpty()
        binding.featuredRatingBlock.setVisible(!item.rating.isNullOrBlank())

        binding.featuredAge.text = item.age.orEmpty()
        binding.featuredAgeBlock.setVisible(!item.age.isNullOrBlank())

        binding.badges.setVisible(
            item.score != null || !item.rating.isNullOrBlank() || !item.age.isNullOrBlank()
        )

        // The two descriptive lines are empty for unreleased titles.
        binding.featuredPremiered.setVisible(!item.premiered.isNullOrBlank())
        binding.featuredRuntime.setVisible(!item.runtime.isNullOrBlank())
        binding.featuredStatus.setVisible(!item.status.isNullOrBlank())
        binding.featuredGenres.setVisible(!item.genres.isNullOrBlank())
        binding.featuredShare.setVisible(!item.share.isNullOrBlank())

        sectionAdapter.submitList(home.sections)

        viewLifecycleOwner.lifecycleScope.launch {
            inWatchList = viewModel.isInWatchList(item.id)
            renderWatchList()
        }
    }

    private fun renderWatchList() {
        binding.watchlistAdd.setVisible(!inWatchList)
        binding.watchlistRemove.setVisible(inWatchList)
    }

    private fun toggleWatchList() {
        val id = featured?.id ?: return
        viewLifecycleOwner.lifecycleScope.launch {
            inWatchList = viewModel.toggleWatchList(id)
            renderWatchList()
            toast(if (inWatchList) R.string.added_to_my_list else R.string.removed_from_my_list)
        }
    }

    private fun shareFeatured() {
        val link = featured?.share?.takeIf { it.isNotBlank() } ?: return
        val send = Intent(Intent.ACTION_SEND).apply {
            type = "text/plain"
            putExtra(Intent.EXTRA_TEXT, link)
        }
        startActivity(Intent.createChooser(send, getString(R.string.share)))
    }

    private fun openPost(id: Int) = startActivity(PostActivity.intent(requireContext(), id))

    override fun onResume() {
        super.onResume()
        // The list can change on the detail screen.
        val id = featured?.id ?: return
        viewLifecycleOwner.lifecycleScope.launch {
            inWatchList = viewModel.isInWatchList(id)
            renderWatchList()
        }
    }

    override fun onDestroyView() {
        binding.sectionList.adapter = null
        _binding = null
        super.onDestroyView()
    }
}
