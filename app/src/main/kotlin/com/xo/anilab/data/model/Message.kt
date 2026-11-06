package com.xo.anilab.data.model

import com.squareup.moshi.JsonClass

/**
 * A server-driven notice, shown as a sheet on start-up. [force] means the
 * sheet cannot be dismissed, [persistent] means it comes back every launch.
 */
@JsonClass(generateAdapter = false)
data class Message(
    val id: String? = null,
    val title: String? = null,
    val message: String? = null,
    val icon: String? = null,
    val action: String? = null,
    val url: String? = null,
    val force: Boolean = false,
    val persistent: Boolean = false,
)
