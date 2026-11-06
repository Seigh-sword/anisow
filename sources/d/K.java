package D;

import android.app.Notification;
import android.app.NotificationManager;
import android.content.Context;
import android.os.Bundle;
import java.util.HashSet;

/* JADX INFO: loaded from: classes.dex */
public final class K {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static String f183d;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static I f186g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f187a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final NotificationManager f188b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Object f182c = new Object();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static HashSet f184e = new HashSet();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final Object f185f = new Object();

    public K(Context context) {
        this.f187a = context;
        this.f188b = (NotificationManager) context.getSystemService("notification");
    }

    public final void a(int i6, Notification notification) {
        Bundle bundle = notification.extras;
        NotificationManager notificationManager = this.f188b;
        if (bundle == null || !bundle.getBoolean("android.support.useSideChannel")) {
            notificationManager.notify(null, i6, notification);
            return;
        }
        F f6 = new F(this.f187a.getPackageName(), i6, notification);
        synchronized (f185f) {
            try {
                if (f186g == null) {
                    f186g = new I(this.f187a.getApplicationContext());
                }
                f186g.f179x.obtainMessage(0, f6).sendToTarget();
            } catch (Throwable th) {
                throw th;
            }
        }
        notificationManager.cancel(null, i6);
    }
}
