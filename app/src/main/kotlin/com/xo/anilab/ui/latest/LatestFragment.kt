package com.xo.anilab.ui.latest

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.annotation.StringRes
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.lifecycle.Lifecycle
import androidx.lifecycle.lifecycleScope
import androidx.lifecycle.repeatOnLifecycle
import androidx.recyclerview.widget.GridLayoutManager
import com.xo.anilab.core.Paged
import com.xo.anilab.core.GradientText
import com.xo.anilab.core.Resource
import com.xo.anilab.core.setVisible
import com.xo.anilab.core.toast
import com.xo.anilab.data.model.Post
import com.xo.anilab.R
import com.xo.anilab.databinding.FragmentLatestBinding
import com.xo.anilab.ui.common.PagingScrollListener
import com.xo.anilab.ui.common.PostAdapter
import com.xo.anilab.ui.post.PostActivity
import kotlinx.coroutines.flow.collectLatest
import kotlinx.coroutines.launch

/**
 * Grid of the newest titles, paged. Both the Movies and the Series tab are this
 * screen; only the heading differs.
 */
class LatestFragment : Fragment() {

    private var _binding: FragmentLatestBinding? = null
    private val binding get() = requireNotNull(_binding)

    private val viewModel: LatestViewModel by viewModels { LatestViewModel.factory() }

    private lateinit var adapter: PostAdapter

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View {
        _binding = FragmentLatestBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.title.setText(requireArguments().getInt(ARG_TITLE, R.string.latest))
        GradientText.apply(binding.title)

        adapter = PostAdapter { post ->
            startActivity(PostActivity.intent(requireContext(), post.id))
        }

        binding.postList.apply {
            layoutManager = GridLayoutManager(requireContext(), GRID_COLUMNS)
            this.adapter = this@LatestFragment.adapter
            setHasFixedSize(true)
            addOnScrollListener(PagingScrollListener { viewModel.loadMore() })
        }


        binding.swipeRefresh.setOnRefreshListener { viewModel.refresh() }

        viewLifecycleOwner.lifecycleScope.launch {
            viewLifecycleOwner.repeatOnLifecycle(Lifecycle.State.STARTED) {
                launch { viewModel.posts.collectLatest(::render) }
                launch { viewModel.appending.collect { binding.loader.setVisible(it) } }
            }
        }
    }

    private fun render(result: Resource<Paged<Post>>) {
        binding.loader.setVisible(result is Resource.Loading)
        if (result !is Resource.Loading) binding.swipeRefresh.isRefreshing = false

        when (result) {
            is Resource.Loading -> Unit
            is Resource.Failure -> {
                toast(result.message)
                if (result.data == null) adapter.submitList(emptyList())
            }
            is Resource.Success -> adapter.submitList(result.data.items)
        }
    }

    override fun onDestroyView() {
        binding.postList.adapter = null
        _binding = null
        super.onDestroyView()
    }

    companion object {
        private const val ARG_TITLE = "title"
        private const val GRID_COLUMNS = 3

        fun newInstance(@StringRes titleRes: Int) = LatestFragment().apply {
            arguments = Bundle().apply { putInt(ARG_TITLE, titleRes) }
        }
    }
}
