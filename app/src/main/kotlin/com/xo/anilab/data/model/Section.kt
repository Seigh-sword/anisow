package com.xo.anilab.data.model

import com.squareup.moshi.JsonClass

/** A titled row of the home feed. */
@JsonClass(generateAdapter = false)
data class Section(
    val name: String,
    val posts: List<Post> = emptyList(),
)
