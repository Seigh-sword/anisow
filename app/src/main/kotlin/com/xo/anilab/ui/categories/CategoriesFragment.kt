package com.xo.anilab.ui.categories

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.lifecycle.Lifecycle
import androidx.lifecycle.lifecycleScope
import androidx.lifecycle.repeatOnLifecycle
import androidx.recyclerview.widget.LinearLayoutManager
import com.xo.anilab.core.Resource
import com.xo.anilab.core.setVisible
import com.xo.anilab.core.toast
import com.xo.anilab.data.model.Category
import com.xo.anilab.databinding.FragmentCategoriesBinding
import com.xo.anilab.ui.category.CategoryActivity
import com.xo.anilab.ui.common.CategoryAdapter
import kotlinx.coroutines.flow.collectLatest
import kotlinx.coroutines.launch

class CategoriesFragment : Fragment() {

    private var _binding: FragmentCategoriesBinding? = null
    private val binding get() = requireNotNull(_binding)

    private val viewModel: CategoriesViewModel by viewModels { CategoriesViewModel.factory() }

    private lateinit var adapter: CategoryAdapter

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View {
        _binding = FragmentCategoriesBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        adapter = CategoryAdapter { category ->
            startActivity(CategoryActivity.intent(requireContext(), category))
        }

        binding.categoryList.apply {
            layoutManager = LinearLayoutManager(requireContext())
            this.adapter = this@CategoriesFragment.adapter
            setHasFixedSize(true)
        }

        binding.swipeRefresh.setOnRefreshListener { viewModel.load() }

        viewLifecycleOwner.lifecycleScope.launch {
            viewLifecycleOwner.repeatOnLifecycle(Lifecycle.State.STARTED) {
                viewModel.categories.collectLatest(::render)
            }
        }
    }

    private fun render(result: Resource<List<Category>>) {
        binding.loader.setVisible(result is Resource.Loading)
        if (result !is Resource.Loading) binding.swipeRefresh.isRefreshing = false

        when (result) {
            is Resource.Loading -> Unit
            is Resource.Failure -> toast(result.message)
            is Resource.Success -> adapter.submitList(result.data)
        }
    }

    override fun onDestroyView() {
        binding.categoryList.adapter = null
        _binding = null
        super.onDestroyView()
    }
}
