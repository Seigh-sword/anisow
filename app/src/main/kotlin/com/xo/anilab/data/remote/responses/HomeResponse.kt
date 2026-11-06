package com.xo.anilab.data.remote.responses

import com.squareup.moshi.JsonClass
import com.xo.anilab.data.model.Featured
import com.xo.anilab.data.model.Section

@JsonClass(generateAdapter = false)
data class HomeResponse(
    val featured: Featured,
    val sections: List<Section> = emptyList(),
)
