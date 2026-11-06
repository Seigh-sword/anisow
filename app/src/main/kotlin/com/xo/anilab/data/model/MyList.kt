package com.xo.anilab.data.model

import com.squareup.moshi.JsonClass

/** Request body of the watch-list endpoint. */
@JsonClass(generateAdapter = false)
data class MyList(
    val ids: List<Int> = emptyList(),
)
