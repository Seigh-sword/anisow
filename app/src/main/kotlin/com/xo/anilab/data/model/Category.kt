package com.xo.anilab.data.model

import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = false)
data class Category(
    val id: Int,
    val name: String,
)
