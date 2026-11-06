package com.xo.anilab.data.model

import com.squareup.moshi.JsonClass

/** A season of a show; selecting one reloads the post screen with its id. */
@JsonClass(generateAdapter = false)
data class Season(
    val id: Int,
    val title: String? = null,
    val poster: String? = null,
)
