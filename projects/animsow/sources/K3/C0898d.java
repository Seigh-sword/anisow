package k3;

import android.util.Log;
import d.C0617E;

/* JADX INFO: renamed from: k3.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0898d {
    public static void a(C0617E c0617e, C0897c c0897c) {
        if (((Boolean) c0617e.b()).booleanValue()) {
            return;
        }
        String str = (String) c0897c.b();
        if (Log.isLoggable("FirebaseCrashlytics", 3)) {
            Log.d("FirebaseCrashlytics", str, null);
        }
    }
}
