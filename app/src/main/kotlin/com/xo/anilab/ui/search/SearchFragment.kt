package com.xo.anilab.ui.search

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.inputmethod.EditorInfo
import android.widget.TextView
import androidx.core.widget.doOnTextChanged
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.lifecycle.Lifecycle
import androidx.lifecycle.lifecycleScope
import androidx.lifecycle.repeatOnLifecycle
import androidx.recyclerview.widget.GridLayoutManager
import com.xo.anilab.R
import com.xo.anilab.core.Paged
import com.xo.anilab.core.Resource
import com.xo.anilab.core.setVisible
import com.xo.anilab.core.toast
import com.xo.anilab.data.model.Post
import com.xo.anilab.databinding.FragmentSearchBinding
import com.xo.anilab.ui.common.PagingScrollListener
import com.xo.anilab.ui.common.PostAdapter
import com.xo.anilab.ui.post.PostActivity
import kotlinx.coroutines.flow.collectLatest
import kotlinx.coroutines.launch

/**
 * Text search plus a genre row.
 *
 * The genre chips are built here rather than in XML because they come from
 * `/categories`, and a selected chip is just a different background on a plain
 * `TextView`. They are only inflated when there is something to filter.
 */
class SearchFragment : Fragment() {

    private var _binding: FragmentSearchBinding? = null
    private val binding get() = requireNotNull(_binding)

    private val viewModel: SearchViewModel by viewModels { SearchViewModel.factory() }

    private lateinit var adapter: PostAdapter

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View {
        _binding = FragmentSearchBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        adapter = PostAdapter { post ->
            startActivity(PostActivity.intent(requireContext(), post.id))
        }

        binding.postList.apply {
            layoutManager = GridLayoutManager(requireContext(), GRID_COLUMNS)
            this.adapter = this@SearchFragment.adapter
            setHasFixedSize(true)
            addOnScrollListener(PagingScrollListener { viewModel.loadMore() })
        }

        binding.searchInput.doOnTextChanged { text, _, _, _ ->
            binding.clearBtn.setVisible(!text.isNullOrEmpty())
            viewModel.onQueryChanged(text?.toString().orEmpty())
        }

        binding.searchInput.setOnEditorActionListener { _, actionId, _ ->
            if (actionId == EditorInfo.IME_ACTION_SEARCH) {
                viewModel.search()
                true
            } else {
                false
            }
        }

        binding.clearBtn.setOnClickListener {
            binding.searchInput.setText("")
            binding.searchInput.requestFocus()
        }

        binding.swipeRefresh.setOnRefreshListener { viewModel.search() }

        viewLifecycleOwner.lifecycleScope.launch {
            viewLifecycleOwner.repeatOnLifecycle(Lifecycle.State.STARTED) {
                launch { viewModel.genres.collect(::renderChips) }
                launch { viewModel.selectedGenre.collect(::renderChipsSelected) }
                launch { viewModel.posts.collectLatest(::render) }
                launch { viewModel.appending.collect { binding.loader.setVisible(it) } }
            }
        }
    }

    private fun renderChips(genres: List<SearchViewModel.Genre>) {
        binding.filterRow.removeAllViews()
        binding.filterScroll.setVisible(genres.isNotEmpty())

        val gap = resources.getDimensionPixelSize(R.dimen.chip_gap)

        genres.forEach { genre ->
            // The four-argument constructor is the only way a code-built view
            // gets a style: inflation is what normally applies it.
            val chip = TextView(requireContext(), null, 0, R.style.Widget_TryAnime_Chip).apply {
                text = genre.name ?: getString(R.string.filter_all)
                tag = genre.id
                layoutParams = ViewGroup.MarginLayoutParams(
                    ViewGroup.LayoutParams.WRAP_CONTENT,
                    ViewGroup.LayoutParams.WRAP_CONTENT,
                ).apply { marginEnd = gap }
                setOnClickListener { viewModel.selectGenre(genre.id) }
            }
            binding.filterRow.addView(chip)
        }

        renderChipsSelected(viewModel.selectedGenre.value)
    }

    /** Selected chip gets the gradient; the rest keep the glass pill. */
    private fun renderChipsSelected(selectedId: Int?) {
        for (index in 0 until binding.filterRow.childCount) {
            val chip = binding.filterRow.getChildAt(index) as? TextView ?: continue
            val isSelected = chip.tag == selectedId
            chip.setBackgroundResource(
                if (isSelected) R.drawable.bg_filter_chip_selected else R.drawable.bg_filter_chip
            )
            chip.setTextColor(
                requireContext().getColor(
                    if (isSelected) R.color.color_on_brand else R.color.filter_chip_text
                )
            )
        }
    }

    private fun render(result: Resource<Paged<Post>>) {
        binding.loader.setVisible(result is Resource.Loading)
        if (result !is Resource.Loading) binding.swipeRefresh.isRefreshing = false
        // A message about the previous query must not outlive it.
        if (result !is Resource.Success) binding.empty.setVisible(false)

        val hasQuery = viewModel.query.value.isNotEmpty()
        val hasGenre = viewModel.selectedGenre.value != null
        val browsing = hasQuery || hasGenre

        when (result) {
            is Resource.Loading -> Unit
            is Resource.Failure -> toast(result.message)
            is Resource.Success -> {
                val items = result.data.items
                adapter.submitList(items)

                // A counter above the grid; it is what "no results" refers to.
                binding.title.setVisible(browsing && items.isNotEmpty())
                binding.title.text = getString(R.string.search_hit, items.size)

                binding.empty.text = getString(R.string.empty_result)
                binding.empty.setVisible(browsing && items.isEmpty() && !result.data.hasMore)
            }
        }
    }

    override fun onDestroyView() {
        binding.postList.adapter = null
        _binding = null
        super.onDestroyView()
    }

    companion object {
        private const val GRID_COLUMNS = 3
    }
}
