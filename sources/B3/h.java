package B3;

import android.app.NotificationChannel;
import android.graphics.drawable.AdaptiveIconDrawable;
import android.graphics.drawable.Drawable;

/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class h {
    public static /* synthetic */ NotificationChannel B(String str) {
        return new NotificationChannel("com.google.android.gms.availability", str, 4);
    }

    public static /* synthetic */ NotificationChannel c(String str) {
        return new NotificationChannel("fcm_fallback_notification_channel", str, 3);
    }

    public static /* synthetic */ NotificationChannel d(String str, String str2) {
        return new NotificationChannel(str, str2, 3);
    }

    public static /* bridge */ /* synthetic */ boolean y(Drawable drawable) {
        return drawable instanceof AdaptiveIconDrawable;
    }
}
