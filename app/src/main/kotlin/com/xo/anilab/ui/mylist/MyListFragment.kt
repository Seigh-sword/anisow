package com.xo.anilab.ui.mylist

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.lifecycle.Lifecycle
import androidx.lifecycle.lifecycleScope
import androidx.lifecycle.repeatOnLifecycle
import androidx.recyclerview.widget.GridLayoutManager
import com.xo.anilab.R
import com.xo.anilab.core.GradientText
import com.xo.anilab.core.Resource
import com.xo.anilab.core.setVisible
import com.xo.anilab.core.toast
import com.xo.anilab.data.model.Post
import com.xo.anilab.databinding.FragmentMyListBinding
import com.xo.anilab.ui.common.PostAdapter
import com.xo.anilab.ui.post.PostActivity
import kotlinx.coroutines.flow.collectLatest
import kotlinx.coroutines.launch

class MyListFragment : Fragment() {

    private var _binding: FragmentMyListBinding? = null
    private val binding get() = requireNotNull(_binding)

    private val viewModel: MyListViewModel by viewModels { MyListViewModel.factory() }

    private lateinit var adapter: PostAdapter

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View {
        _binding = FragmentMyListBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        adapter = PostAdapter { post ->
            startActivity(PostActivity.intent(requireContext(), post.id))
        }

        binding.postList.apply {
            layoutManager = GridLayoutManager(requireContext(), GRID_COLUMNS)
            this.adapter = this@MyListFragment.adapter
            setHasFixedSize(true)
        }

        GradientText.apply(binding.title)

        binding.swipeRefresh.setOnRefreshListener { viewModel.refresh() }

        viewLifecycleOwner.lifecycleScope.launch {
            viewLifecycleOwner.repeatOnLifecycle(Lifecycle.State.STARTED) {
                viewModel.posts.collectLatest(::render)
            }
        }
    }

    private fun render(result: Resource<List<Post>>) {
        binding.loader.setVisible(result is Resource.Loading)
        if (result !is Resource.Loading) binding.swipeRefresh.isRefreshing = false

        when (result) {
            is Resource.Loading -> Unit
            is Resource.Failure -> toast(result.message)
            is Resource.Success -> {
                adapter.submitList(result.data)
                binding.title.setText(
                    if (result.data.isEmpty()) R.string.empty_result else R.string.watchlist
                )
            }
        }
    }

    override fun onResume() {
        super.onResume()
        // Titles are added and removed from the detail screen.
        viewModel.refresh()
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
