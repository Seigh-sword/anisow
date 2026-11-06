package com.xo.anilab.data.prefs

import android.content.Context
import androidx.datastore.preferences.core.edit
import androidx.datastore.preferences.core.stringPreferencesKey
import androidx.datastore.preferences.preferencesDataStore
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.first
import kotlinx.coroutines.flow.map

private val Context.watchListDataStore by preferencesDataStore(name = "watch_list")

/**
 * Keeps the ids of the titles the user saved. The order is insertion order, so
 * the newest title is last; the list screen reverses it.
 */
class WatchListStore(private val context: Context) {

    private val idsKey = stringPreferencesKey("ids")

    val ids: Flow<List<Int>> = context.watchListDataStore.data.map { prefs ->
        prefs[idsKey].orEmpty().toIds()
    }

    fun contains(id: Int): Flow<Boolean> = ids.map { id in it }

    suspend fun snapshot(): List<Int> = ids.first()

    /**
     * Adds or removes one id and reports the resulting state, which is what the
     * screens toast about.
     */
    suspend fun toggle(id: Int): Boolean {
        var added = false
        context.watchListDataStore.edit { prefs ->
            val current = prefs[idsKey].orEmpty().toIds()
            added = id !in current
            val next = if (added) current + id else current - id
            prefs[idsKey] = next.joinToString(SEPARATOR)
        }
        return added
    }

    suspend fun remove(id: Int) {
        context.watchListDataStore.edit { prefs ->
            val next = prefs[idsKey].orEmpty().toIds() - id
            prefs[idsKey] = next.joinToString(SEPARATOR)
        }
    }

    private fun String.toIds(): List<Int> =
        split(SEPARATOR).mapNotNull(String::toIntOrNull).distinct()

    private companion object {
        const val SEPARATOR = ","
    }
}
