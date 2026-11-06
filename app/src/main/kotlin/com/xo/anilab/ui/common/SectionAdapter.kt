package com.xo.anilab.ui.common

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.xo.anilab.data.model.Post
import com.xo.anilab.data.model.Section
import com.xo.anilab.databinding.ItemSectionBinding

/** One row of the home feed: a heading and a horizontally scrolling strip. */
class SectionAdapter(
    private val onPostClick: (Post) -> Unit,
) : ListAdapter<Section, SectionAdapter.SectionViewHolder>(DIFF) {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): SectionViewHolder {
        val binding = ItemSectionBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return SectionViewHolder(binding, onPostClick)
    }

    override fun onBindViewHolder(holder: SectionViewHolder, position: Int) =
        holder.bind(getItem(position))

    class SectionViewHolder(
        private val binding: ItemSectionBinding,
        onPostClick: (Post) -> Unit,
    ) : RecyclerView.ViewHolder(binding.root) {

        private val adapter = PostAdapter(compact = true, onClick = onPostClick)

        init {
            binding.postList.apply {
                layoutManager = LinearLayoutManager(context, RecyclerView.HORIZONTAL, false)
                this.adapter = this@SectionViewHolder.adapter
                setHasFixedSize(true)
            }
        }

        fun bind(section: Section) {
            binding.name.text = section.name
            binding.name.visibility = if (section.name.isBlank()) View.GONE else View.VISIBLE
            adapter.submitList(section.posts)
        }
    }

    private companion object {
        val DIFF = object : DiffUtil.ItemCallback<Section>() {
            override fun areItemsTheSame(oldItem: Section, newItem: Section) =
                oldItem.name == newItem.name

            override fun areContentsTheSame(oldItem: Section, newItem: Section) =
                oldItem == newItem
        }
    }
}
