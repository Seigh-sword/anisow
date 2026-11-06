package com.xo.anilab.data.repository

import com.xo.anilab.core.Resource
import com.xo.anilab.data.model.Category
import com.xo.anilab.data.model.Message
import com.xo.anilab.data.model.MyList
import com.xo.anilab.data.model.Post
import com.xo.anilab.data.remote.AniLabApi
import com.xo.anilab.data.remote.responses.HomeResponse
import com.xo.anilab.data.remote.responses.PostResponse
import kotlinx.coroutines.CoroutineDispatcher
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import retrofit2.HttpException
import java.io.IOException

/**
 * The only place that talks to the network. Failures are turned into
 * [Resource.Failure] with a message the UI can show directly, so no caller has
 * to catch a transport exception.
 */
class AniLabRepository(
    private val api: AniLabApi,
    private val io: CoroutineDispatcher = Dispatchers.IO,
) {

    suspend fun home(): Resource<HomeResponse> = call { api.home() }

    suspend fun latest(page: Int): Resource<List<Post>> = call { api.latest(page).posts }

    suspend fun category(id: Int, page: Int): Resource<List<Post>> =
        call { api.category(id, page).posts }

    suspend fun categories(): Resource<List<Category>> = call { api.categories().categories }

    suspend fun post(id: Int): Resource<PostResponse> = call { api.post(id) }

    suspend fun search(query: String, page: Int): Resource<List<Post>> =
        call { api.search(query, page).posts }

    suspend fun messages(): Resource<List<Message>> = call { api.config().messages }

    /**
     * The watch list is not stored server-side: it is sent as a body and the
     * backend answers with the matching posts. An empty list short-circuits
     * instead of asking the server for nothing.
     */
    suspend fun watchList(ids: List<Int>): Resource<List<Post>> {
        if (ids.isEmpty()) return Resource.Success(emptyList())
        return call { api.watchList(MyList(ids)).posts }
    }

    private suspend fun <T> call(block: suspend () -> T): Resource<T> = withContext(io) {
        try {
            Resource.Success(block())
        } catch (e: IOException) {
            Resource.Failure(e.message ?: "Network unavailable")
        } catch (e: HttpException) {
            Resource.Failure("Server error ${e.code()}")
        } catch (e: Exception) {
            Resource.Failure(e.message ?: "Unexpected error")
        }
    }
}
