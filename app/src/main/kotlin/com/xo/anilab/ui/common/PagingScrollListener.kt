package com.xo.anilab.ui.common

import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

/**
 * Calls [onLoadMore] when the list is close enough to the end that the next
 * page can arrive before the user reaches it.
 */
class PagingScrollListener(
    private val prefetchDistance: Int = 6,
    private val onLoadMore: () -> Unit,
) : RecyclerView.OnScrollListener() {

    override fun onScrolled(recyclerView: RecyclerView, dx: Int, dy: Int) {
        if (dy <= 0) return
        val layoutManager = recyclerView.layoutManager as? LinearLayoutManager ?: return
        val adapter = recyclerView.adapter ?: return
        val lastVisible = layoutManager.findLastVisibleItemPosition()
        if (lastVisible >= adapter.itemCount - prefetchDistance) onLoadMore()
    }
}
