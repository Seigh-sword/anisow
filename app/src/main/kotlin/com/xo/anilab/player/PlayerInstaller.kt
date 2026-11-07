package com.xo.anilab.player

import android.content.Context
import android.content.Intent
import android.net.Uri
import androidx.core.content.FileProvider
import com.xo.anilab.data.model.PlayerConfig
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import okhttp3.OkHttpClient
import okhttp3.Request
import java.io.File
import java.io.IOException

/**
 * Fetches a player APK so the tap on "Download player" produces a file the
 * system can install.
 *
 * The original app only fired an `ACTION_VIEW` intent at the store link. In an
 * emulator without the Play Store that lands on nothing, which is what makes
 * "Watch" look broken: the user taps, the browser cannot resolve `market://`,
 * and the screen simply does not change. Downloading the APK ourselves removes
 * the Play Store from the path entirely.
 *
 * Two details matter for the install to work:
 *
 *  * the file has to be readable by the package installer, so it goes in the
 *    app's external files dir and is exposed through a [FileProvider];
 *  * the caller has to hold `REQUEST_INSTALL_PACKAGES` and the user has to allow
 *    installs from this app once.
 */
class PlayerInstaller(private val context: Context) {

    sealed interface Progress {
        data class Downloading(val percent: Int) : Progress
        data class Ready(val apk: File) : Progress
        data object Failed : Progress
    }

    private val client = OkHttpClient.Builder()
        .connectTimeout(20, java.util.concurrent.TimeUnit.SECONDS)
        .readTimeout(60, java.util.concurrent.TimeUnit.SECONDS)
        .followRedirects(true)
        .build()

    /**
     * The payload's `downloadUrl` is usually a Play Store page, which cannot be
     * downloaded as a file. In that case [apkUrl] is null and the caller should
     * offer the store instead of pretending to download.
     */
    fun apkUrl(config: PlayerConfig): String? =
        config.downloadUrl.takeIf { it.endsWith(".apk", ignoreCase = true) }

    suspend fun download(config: PlayerConfig, onProgress: (Int) -> Unit): Progress =
        withContext(Dispatchers.IO) {
            val url = apkUrl(config) ?: return@withContext Progress.Failed
            val target = File(apkDir(), fileName(config))

            try {
                val request = Request.Builder().url(url).build()
                client.newCall(request).execute().use { response ->
                    if (!response.isSuccessful) return@withContext Progress.Failed
                    val body = response.body ?: return@withContext Progress.Failed
                    val total = body.contentLength()

                    body.byteStream().use { input ->
                        target.outputStream().use { output ->
                            val buffer = ByteArray(BUFFER_BYTES)
                            var written = 0L
                            var lastPercent = -1

                            while (true) {
                                val read = input.read(buffer)
                                if (read == -1) break
                                output.write(buffer, 0, read)
                                written += read

                                // Only cross a coroutine boundary when the number
                                // on screen would actually change.
                                if (total > 0) {
                                    val percent = (written * 100 / total).toInt()
                                    if (percent != lastPercent) {
                                        lastPercent = percent
                                        onProgress(percent)
                                    }
                                }
                            }
                        }
                    }

                    if (target.length() == 0L) {
                        target.delete()
                        return@withContext Progress.Failed
                    }
                    Progress.Ready(target)
                }
            } catch (e: IOException) {
                target.delete()
                Progress.Failed
            }
        }

    /** Hands the downloaded file to the package installer. */
    fun install(apk: File): Intent {
        val uri = FileProvider.getUriForFile(context, "${context.packageName}.fileprovider", apk)
        return Intent(Intent.ACTION_VIEW).apply {
            setDataAndType(uri, APK_MIME)
            addFlags(Intent.FLAG_GRANT_READ_URI_PERMISSION)
            addFlags(Intent.FLAG_ACTIVITY_NEW_TASK)
        }
    }

    /** Store page, used when the payload has no APK link. */
    fun storeIntent(config: PlayerConfig): Intent =
        Intent(Intent.ACTION_VIEW, Uri.parse(config.downloadUrl))
            .addFlags(Intent.FLAG_ACTIVITY_NEW_TASK)

    private fun apkDir(): File =
        File(context.getExternalFilesDir(null) ?: context.filesDir, "players").apply { mkdirs() }

    private fun fileName(config: PlayerConfig): String {
        val safe = config.playerName
            .replace(Regex("[^A-Za-z0-9]+"), "-")
            .trim('-')
            .ifBlank { "player" }
            .take(40)
        return "$safe.apk"
    }

    private companion object {
        const val APK_MIME = "application/vnd.android.package-archive"
        const val BUFFER_BYTES = 8 * 1024
    }
}
