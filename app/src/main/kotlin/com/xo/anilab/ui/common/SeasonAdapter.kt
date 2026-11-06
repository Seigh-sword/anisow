package com.xo.anilab.ui.common

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.xo.anilab.core.loadPoster
import com.xo.anilab.data.model.Season
import com.xo.anilab.databinding.ItemSeasonBinding

class SeasonAdapter(
    private val onClick: (Season) -> Unit,
) : ListAdapter<Season, SeasonAdapter.SeasonViewHolder>(DIFF) {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): SeasonViewHolder {
        val binding = ItemSeasonBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return SeasonViewHolder(binding, onClick)
    }

    override fun onBindViewHolder(holder: SeasonViewHolder, position: Int) =
        holder.bind(getItem(position))

    class SeasonViewHolder(
        private val binding: ItemSeasonBinding,
        onClick: (Season) -> Unit,
    ) : RecyclerView.ViewHolder(binding.root) {

        private var bound: Season? = null

        init {
            binding.root.setOnClickListener { bound?.let(onClick) }
        }

        fun bind(season: Season) {
            bound = season
            binding.title.text = season.title.orEmpty()
            binding.image.loadPoster(season.poster)
        }
    }

    private companion object {
        val DIFF = object : DiffUtil.ItemCallback<Season>() {
            override fun areItemsTheSame(oldItem: Season, newItem: Season) = oldItem.id == newItem.id
            override fun areContentsTheSame(oldItem: Season, newItem: Season) = oldItem == newItem
        }
    }
}
