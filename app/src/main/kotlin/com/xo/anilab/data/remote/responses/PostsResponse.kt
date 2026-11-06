package com.xo.anilab.data.remote.responses

import com.squareup.moshi.JsonClass
import com.xo.anilab.data.model.Post

@JsonClass(generateAdapter = false)
data class PostsResponse(
    val posts: List<Post> = emptyList(),
)
