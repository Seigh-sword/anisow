package J3;

import android.content.res.Resources;
import android.os.Build;
import android.os.SystemClock;
import android.util.Log;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: renamed from: J3.e, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0049e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final AtomicInteger f1398a = new AtomicInteger((int) SystemClock.elapsedRealtime());

    public static boolean a(Resources resources, int i6) {
        if (Build.VERSION.SDK_INT != 26) {
            return true;
        }
        try {
            if (!B3.h.y(resources.getDrawable(i6, null))) {
                return true;
            }
            Log.e("FirebaseMessaging", "Adaptive icons cannot be used in notifications. Ignoring icon id: " + i6);
            return false;
        } catch (Resources.NotFoundException unused) {
            Log.e("FirebaseMessaging", "Couldn't find resource " + i6 + ", treating it as an invalid icon");
            return false;
        }
    }
}
