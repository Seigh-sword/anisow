package com.xo.anilab.data.remote.responses

import com.squareup.moshi.JsonClass
import com.xo.anilab.data.model.Message

@JsonClass(generateAdapter = false)
data class ConfigResponse(
    val messages: List<Message> = emptyList(),
)
