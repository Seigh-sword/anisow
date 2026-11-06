package com.xo.anilab.core

/**
 * Immutable helper for the paged lists: appending a page keeps the page number
 * and the end-of-list flag in one place instead of in the fragment.
 */
data class Paged<T>(
    val items: List<T> = emptyList(),
    val page: Int = 0,
    val hasMore: Boolean = true,
) {
    fun append(next: List<T>): Paged<T> =
        copy(items = items + next, page = page + 1, hasMore = next.isNotEmpty())

    companion object {
        fun <T> first(items: List<T>): Paged<T> = Paged(items, page = 1, hasMore = items.isNotEmpty())
    }
}
