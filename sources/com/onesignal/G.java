package com.onesignal;

import android.app.NotificationChannel;
import android.app.NotificationChannelGroup;
import android.app.job.JobWorkItem;
import android.content.Intent;

/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class G {
    public static /* synthetic */ NotificationChannel b() {
        return new NotificationChannel("restored_OS_notifications", "Restored", 2);
    }

    public static /* bridge */ /* synthetic */ NotificationChannel c(Object obj) {
        return (NotificationChannel) obj;
    }

    public static /* synthetic */ NotificationChannel d(String str, String str2, int i6) {
        return new NotificationChannel(str, str2, i6);
    }

    public static /* synthetic */ NotificationChannelGroup e(String str, String str2) {
        return new NotificationChannelGroup(str, str2);
    }

    public static /* synthetic */ JobWorkItem f(Intent intent) {
        return new JobWorkItem(intent);
    }

    public static /* synthetic */ NotificationChannel v() {
        return new NotificationChannel("fcm_fallback_notification_channel", "Miscellaneous", 3);
    }
}
