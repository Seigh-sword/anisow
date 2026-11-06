package com.xo.anilab.push

import android.Manifest
import android.app.NotificationChannel
import android.app.NotificationManager
import android.app.PendingIntent
import android.content.Intent
import android.content.pm.PackageManager
import android.os.Build
import androidx.core.app.NotificationCompat
import androidx.core.app.NotificationManagerCompat
import androidx.core.content.ContextCompat
import com.google.firebase.messaging.FirebaseMessagingService
import com.google.firebase.messaging.RemoteMessage
import com.xo.anilab.R
import com.xo.anilab.ui.home.HomeActivity
import timber.log.Timber

/**
 * Push notifications carry two optional targets: a raw `url` to open in the
 * browser, and a `post` id to open on the detail screen. Both are forwarded to
 * [HomeActivity], which knows how to route them.
 */
class AniLabMessagingService : FirebaseMessagingService() {

    override fun onNewToken(token: String) {
        Timber.d("FCM token refreshed: %s", token)
    }

    override fun onMessageReceived(message: RemoteMessage) {
        val data = message.data
        val title = data["title"] ?: message.notification?.title ?: getString(R.string.app_name)
        val body = data["message"] ?: data["body"] ?: message.notification?.body ?: return

        ensureChannel()

        val contentIntent = Intent(this, HomeActivity::class.java).apply {
            addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP or Intent.FLAG_ACTIVITY_NEW_TASK)
            data["url"]?.let { putExtra(HomeActivity.EXTRA_OPEN_WEB_URL, it) }
            data["post"]?.toIntOrNull()?.let { putExtra(HomeActivity.EXTRA_OPEN_POST, it) }
        }

        val pendingIntent = PendingIntent.getActivity(
            this,
            data["id"]?.hashCode() ?: REQUEST_CODE_DEFAULT,
            contentIntent,
            PendingIntent.FLAG_UPDATE_CURRENT or PendingIntent.FLAG_IMMUTABLE,
        )

        val notification = NotificationCompat.Builder(this, CHANNEL_ID)
            .setSmallIcon(R.drawable.ic_stat_notification)
            .setContentTitle(title)
            .setContentText(body)
            .setStyle(NotificationCompat.BigTextStyle().bigText(body))
            .setAutoCancel(true)
            .setContentIntent(pendingIntent)
            .build()

        if (canPostNotifications()) {
            NotificationManagerCompat.from(this)
                .notify((System.currentTimeMillis() % Int.MAX_VALUE).toInt(), notification)
        }
    }

    private fun canPostNotifications(): Boolean =
        Build.VERSION.SDK_INT < Build.VERSION_CODES.TIRAMISU ||
            ContextCompat.checkSelfPermission(
                this,
                Manifest.permission.POST_NOTIFICATIONS,
            ) == PackageManager.PERMISSION_GRANTED

    private fun ensureChannel() {
        if (Build.VERSION.SDK_INT < Build.VERSION_CODES.O) return
        val manager = getSystemService(NotificationManager::class.java) ?: return
        if (manager.getNotificationChannel(CHANNEL_ID) != null) return

        manager.createNotificationChannel(
            NotificationChannel(
                CHANNEL_ID,
                getString(R.string.fcm_default_notification_channel_title),
                NotificationManager.IMPORTANCE_DEFAULT,
            )
        )
    }

    private companion object {
        const val CHANNEL_ID = "anilab_default"
        const val REQUEST_CODE_DEFAULT = 0
    }
}
