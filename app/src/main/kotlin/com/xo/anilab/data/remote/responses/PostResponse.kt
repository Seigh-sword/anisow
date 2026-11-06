package com.xo.anilab.data.remote.responses

import com.squareup.moshi.JsonClass
import com.xo.anilab.data.model.PlayerConfig
import com.xo.anilab.data.model.Post
import com.xo.anilab.data.model.Season

@JsonClass(generateAdapter = false)
data class PostResponse(
    val id: Int,
    val title: String? = null,
    val type: String? = null,
    val poster: String? = null,
    val overview: String? = null,
    val status: String? = null,
    val runtime: String? = null,
    val premiered: String? = null,
    val rating: String? = null,
    val age: String? = null,
    val score: Float? = null,
    val genres: String? = null,
    val share: String? = null,
    val seasons: List<Season> = emptyList(),
    val related: List<Post> = emptyList(),
    val similar: List<Post> = emptyList(),
    val playerConfig: PlayerConfig? = null,
    val isDemo: Boolean = false,
)
