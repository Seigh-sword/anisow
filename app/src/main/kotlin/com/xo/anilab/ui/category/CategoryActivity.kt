package com.xo.anilab.ui.category

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.Lifecycle
import androidx.lifecycle.lifecycleScope
import androidx.lifecycle.repeatOnLifecycle
import androidx.recyclerview.widget.GridLayoutManager
import com.xo.anilab.core.Paged
import com.xo.anilab.core.Resource
import com.xo.anilab.core.setVisible
import com.xo.anilab.core.toast
import com.xo.anilab.data.model.Category
import com.xo.anilab.data.model.Post
import com.xo.anilab.databinding.ActivityCategoryBinding
import com.xo.anilab.ui.common.PagingScrollListener
import com.xo.anilab.ui.common.PostAdapter
import com.xo.anilab.ui.post.PostActivity
import kotlinx.coroutines.flow.collectLatest
import kotlinx.coroutines.launch

/**
 * Every title in one category. The intent carries the category itself so the
 * toolbar can show its name before the first page arrives.
 */
class CategoryActivity : AppCompatActivity() {

    private lateinit var binding: ActivityCategoryBinding
    private val viewModel: CategoryViewModel by viewModels { CategoryViewModel.factory() }

    private lateinit var adapter: PostAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityCategoryBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val category = Category(
            id = intent.getIntExtra(EXTRA_CATEGORY_ID, NO_CATEGORY),
            name = intent.getStringExtra(EXTRA_CATEGORY_TITLE).orEmpty(),
        )

        binding.toolbarTitle.text = category.name
        binding.backBtn.setOnClickListener { finish() }
        binding.swipeRefresh.setOnRefreshListener { viewModel.refresh() }

        adapter = PostAdapter { post ->
            startActivity(PostActivity.intent(this, post.id))
        }

        binding.postList.apply {
            layoutManager = GridLayoutManager(this@CategoryActivity, GRID_COLUMNS)
            this.adapter = this@CategoryActivity.adapter
            setHasFixedSize(true)
            addOnScrollListener(PagingScrollListener { viewModel.loadMore() })
        }

        lifecycleScope.launch {
            repeatOnLifecycle(Lifecycle.State.STARTED) {
                launch { viewModel.posts.collectLatest(::render) }
                launch { viewModel.appending.collect { binding.loader.setVisible(it) } }
            }
        }

        viewModel.start(category.id)
    }

    private fun render(result: Resource<Paged<Post>>) {
        binding.loader.setVisible(result is Resource.Loading)
        if (result !is Resource.Loading) binding.swipeRefresh.isRefreshing = false

        when (result) {
            is Resource.Loading -> Unit
            is Resource.Failure -> toast(result.message)
            is Resource.Success -> adapter.submitList(result.data.items)
        }
    }

    companion object {
        private const val EXTRA_CATEGORY_ID = "CATEGORY_ID"
        private const val EXTRA_CATEGORY_TITLE = "CATEGORY_TITLE"
        private const val GRID_COLUMNS = 3
        private const val NO_CATEGORY = 0

        fun intent(context: Context, category: Category): Intent =
            Intent(context, CategoryActivity::class.java).apply {
                putExtra(EXTRA_CATEGORY_ID, category.id)
                putExtra(EXTRA_CATEGORY_TITLE, category.name)
            }
    }
}
