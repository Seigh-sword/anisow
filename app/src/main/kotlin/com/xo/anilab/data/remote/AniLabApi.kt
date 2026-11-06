package com.xo.anilab.data.remote

import com.xo.anilab.data.model.MyList
import com.xo.anilab.data.remote.responses.CategoriesResponse
import com.xo.anilab.data.remote.responses.ConfigResponse
import com.xo.anilab.data.remote.responses.HomeResponse
import com.xo.anilab.data.remote.responses.PostResponse
import com.xo.anilab.data.remote.responses.PostsResponse
import retrofit2.http.Body
import retrofit2.http.GET
import retrofit2.http.POST
import retrofit2.http.Query

/**
 * The AniLab backend. Endpoint names and parameters are the ones the shipped
 * client called; the list endpoint is a POST because the watch list is sent as
 * a body.
 */
interface AniLabApi {

    @GET("home")
    suspend fun home(): HomeResponse

    @GET("latest")
    suspend fun latest(@Query("page") page: Int = 1): PostsResponse

    @GET("category")
    suspend fun category(@Query("id") id: Int, @Query("page") page: Int = 1): PostsResponse

    @GET("categories")
    suspend fun categories(): CategoriesResponse

    @GET("post")
    suspend fun post(@Query("id") id: Int): PostResponse

    @GET("search")
    suspend fun search(@Query("query") query: String, @Query("page") page: Int = 1): PostsResponse

    @GET("config")
    suspend fun config(): ConfigResponse

    @POST("list")
    suspend fun watchList(@Body body: MyList): PostsResponse
}
