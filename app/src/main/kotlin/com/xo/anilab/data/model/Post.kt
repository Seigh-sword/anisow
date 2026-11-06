package com.xo.anilab.data.model

import com.squareup.moshi.JsonClass

/** A poster tile: id, artwork and the age chip. */
@JsonClass(generateAdapter = false)
data class Post(
    val id: Int,
    val poster: String? = null,
    val age: String? = null,
)
