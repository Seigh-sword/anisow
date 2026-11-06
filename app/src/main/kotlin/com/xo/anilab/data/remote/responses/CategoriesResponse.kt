package com.xo.anilab.data.remote.responses

import com.squareup.moshi.JsonClass
import com.xo.anilab.data.model.Category

@JsonClass(generateAdapter = false)
data class CategoriesResponse(
    val categories: List<Category> = emptyList(),
)
