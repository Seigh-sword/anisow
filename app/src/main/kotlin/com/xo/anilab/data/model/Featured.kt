package com.xo.anilab.data.model

import com.squareup.moshi.JsonClass

/**
 * The hero card on the home screen. It carries the fields the detail screen
 * needs as well, because tapping it opens the same post.
 */
@JsonClass(generateAdapter = false)
data class Featured(
    val id: Int,
    val title: String? = null,
    val poster: String? = null,
    val type: String? = null,
    val status: String? = null,
    val premiered: String? = null,
    val runtime: String? = null,
    val age: String? = null,
    val rating: String? = null,
    val score: Float? = null,
    val genres: String? = null,
    val share: String? = null,
)
