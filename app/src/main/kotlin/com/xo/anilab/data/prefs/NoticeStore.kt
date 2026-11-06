package com.xo.anilab.data.prefs

import android.content.Context
import androidx.datastore.preferences.core.edit
import androidx.datastore.preferences.core.stringSetPreferencesKey
import androidx.datastore.preferences.preferencesDataStore
import kotlinx.coroutines.flow.first
import kotlinx.coroutines.flow.map

private val Context.noticeDataStore by preferencesDataStore(name = "notices")

/**
 * Remembers which server messages have already been shown so a notice appears
 * once per install. Messages flagged persistent bypass this by design.
 */
class NoticeStore(private val context: Context) {

    private val seenKey = stringSetPreferencesKey("seen")

    suspend fun seen(): Set<String> = context.noticeDataStore.data.map { it[seenKey].orEmpty() }.first()

    suspend fun markSeen(id: String) {
        context.noticeDataStore.edit { prefs ->
            prefs[seenKey] = prefs[seenKey].orEmpty() + id
        }
    }
}
