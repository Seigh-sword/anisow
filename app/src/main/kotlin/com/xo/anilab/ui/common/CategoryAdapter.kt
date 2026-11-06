package com.xo.anilab.ui.common

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.xo.anilab.data.model.Category
import com.xo.anilab.databinding.ItemCategoryBinding

class CategoryAdapter(
    private val onClick: (Category) -> Unit,
) : ListAdapter<Category, CategoryAdapter.CategoryViewHolder>(DIFF) {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CategoryViewHolder {
        val binding = ItemCategoryBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return CategoryViewHolder(binding, onClick)
    }

    override fun onBindViewHolder(holder: CategoryViewHolder, position: Int) =
        holder.bind(getItem(position))

    class CategoryViewHolder(
        private val binding: ItemCategoryBinding,
        onClick: (Category) -> Unit,
    ) : RecyclerView.ViewHolder(binding.root) {

        private var bound: Category? = null

        init {
            binding.root.setOnClickListener { bound?.let(onClick) }
        }

        fun bind(category: Category) {
            bound = category
            binding.name.text = category.name
        }
    }

    private companion object {
        val DIFF = object : DiffUtil.ItemCallback<Category>() {
            override fun areItemsTheSame(oldItem: Category, newItem: Category) =
                oldItem.id == newItem.id

            override fun areContentsTheSame(oldItem: Category, newItem: Category) =
                oldItem == newItem
        }
    }
}
