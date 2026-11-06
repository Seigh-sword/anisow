package com.xo.anilab.core

import androidx.fragment.app.FragmentManager
import com.xo.anilab.data.prefs.NoticeStore
import com.xo.anilab.data.repository.AniLabRepository
import com.xo.anilab.ui.notice.NoticeSheet

/**
 * Shows server notices. One is shown per launch, newest unread first, so a
 * batch of pending messages does not stack sheets on top of each other.
 */
class NoticeController(
    private val repository: AniLabRepository,
    private val store: NoticeStore,
    private val fragmentManager: FragmentManager,
) {

    suspend fun showPending() {
        val notices = when (val result = repository.messages()) {
            is Resource.Success -> result.data
            is Resource.Failure -> return
            is Resource.Loading -> return
        }
        if (notices.isEmpty()) return

        val seen = store.seen()
        val next = notices.firstOrNull { it.persistent || it.id !in seen } ?: return

        NoticeSheet.newInstance(
            title = next.title,
            message = next.message,
            icon = next.icon,
            action = next.action,
            url = next.url,
            force = next.force,
        ).show(fragmentManager, NoticeSheet.TAG)

        // A persistent notice is meant to come back next launch, so it is not
        // recorded as seen.
        if (!next.persistent) next.id?.let { store.markSeen(it) }
    }
}
