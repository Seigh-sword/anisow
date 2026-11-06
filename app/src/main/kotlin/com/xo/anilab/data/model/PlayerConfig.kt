package com.xo.anilab.data.model

import com.squareup.moshi.JsonClass

/**
 * Names the external player an episode opens in. The backend owns both the
 * component and the store link, which is why they are plain strings here.
 */
@JsonClass(generateAdapter = false)
data class PlayerConfig(
    val playerName: String,
    val playerDesc: String,
    val packageName: String,
    val activityName: String,
    val downloadUrl: String,
    val playerIcon: String? = null,
)
