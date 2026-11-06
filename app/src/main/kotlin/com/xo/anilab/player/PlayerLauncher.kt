package com.xo.anilab.player

import android.content.ActivityNotFoundException
import android.content.ComponentName
import android.content.Context
import android.content.Intent
import android.net.Uri
import com.xo.anilab.data.model.PlayerConfig
import com.xo.anilab.data.remote.responses.PostResponse

/**
 * Hands an episode to the external player the backend names.
 *
 * The contract belongs to the player apps, not to this app: a component intent
 * with the player's package and activity, carrying the episode id and title as
 * strings. Nothing streams here, which is why the app ships without a player and
 * why a missing component is an expected state rather than an error.
 */
class PlayerLauncher(private val context: Context) {

    sealed interface Result {
        /** The player accepted the episode. */
        data object Played : Result

        /** No app handles the intent: the player is not installed. */
        data object PlayerMissing : Result
    }

    fun play(post: PostResponse): Result {
        val config = post.playerConfig ?: return Result.PlayerMissing

        val intent = Intent().apply {
            component = ComponentName(config.packageName, config.activityName)
            putExtra(EXTRA_POST_ID, post.id.toString())
            putExtra(EXTRA_POST_TITLE, post.title.orEmpty())
        }

        return try {
            context.startActivity(intent)
            Result.Played
        } catch (e: ActivityNotFoundException) {
            Result.PlayerMissing
        } catch (e: SecurityException) {
            // A player can export its activity without letting other apps launch
            // it; from here that is indistinguishable from not being installed.
            Result.PlayerMissing
        }
    }

    /** Store page of the player, used by the "install" sheet. */
    fun installPlayer(config: PlayerConfig): Intent =
        Intent(Intent.ACTION_VIEW, Uri.parse(config.downloadUrl))

    companion object {
        const val EXTRA_POST_ID = "POST_ID"
        const val EXTRA_POST_TITLE = "POST_TITLE"
    }
}
