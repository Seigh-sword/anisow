package com.xo.anilab.ui.common

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.xo.anilab.core.loadPoster
import com.xo.anilab.data.model.Post
import com.xo.anilab.databinding.ItemPostBinding
import com.xo.anilab.databinding.ItemPosterBinding

/**
 * Poster tiles. [compact] selects the fixed-width variant used inside a home
 * section strip; the full variant fills a grid cell and keeps the age chip in
 * the corner of the artwork.
 */
class PostAdapter(
    private val compact: Boolean = false,
    private val onClick: (Post) -> Unit,
) : ListAdapter<Post, PostAdapter.PostViewHolder>(DIFF) {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PostViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        return if (compact) {
            PostViewHolder.Compact(ItemPosterBinding.inflate(inflater, parent, false), onClick)
        } else {
            PostViewHolder.Full(ItemPostBinding.inflate(inflater, parent, false), onClick)
        }
    }

    override fun onBindViewHolder(holder: PostViewHolder, position: Int) =
        holder.bind(getItem(position))

    abstract class PostViewHolder(view: View, onClick: (Post) -> Unit) :
        RecyclerView.ViewHolder(view) {

        private var bound: Post? = null

        init {
            view.setOnClickListener { bound?.let(onClick) }
        }

        fun bind(post: Post) {
            bound = post
            onBind(post)
        }

        protected abstract fun onBind(post: Post)
    }

    class Full(
        private val binding: ItemPostBinding,
        onClick: (Post) -> Unit,
    ) : PostViewHolder(binding.root, onClick) {

        override fun onBind(post: Post) {
            binding.image.loadPoster(post.poster)
            // The API leaves `age` null for older titles; an empty pill is worse
            // than no pill.
            binding.age.text = post.age.orEmpty()
            binding.ageBlock.visibility = if (post.age.isNullOrBlank()) View.GONE else View.VISIBLE
        }
    }

    class Compact(
        private val binding: ItemPosterBinding,
        onClick: (Post) -> Unit,
    ) : PostViewHolder(binding.root, onClick) {

        override fun onBind(post: Post) {
            binding.image.loadPoster(post.poster)
            binding.age.text = post.age.orEmpty()
            binding.age.visibility = if (post.age.isNullOrBlank()) View.GONE else View.VISIBLE
        }
    }

    private companion object {
        val DIFF = object : DiffUtil.ItemCallback<Post>() {
            override fun areItemsTheSame(oldItem: Post, newItem: Post) = oldItem.id == newItem.id
            override fun areContentsTheSame(oldItem: Post, newItem: Post) = oldItem == newItem
        }
    }
}
