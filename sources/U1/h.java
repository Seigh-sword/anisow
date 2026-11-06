package U1;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageInstaller;
import android.content.pm.PackageManager;
import android.os.Build;
import android.util.Log;
import d2.C0652c;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes.dex */
public abstract class h {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static boolean f3591b = false;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static boolean f3592c = false;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final AtomicBoolean f3590a = new AtomicBoolean();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final AtomicBoolean f3593d = new AtomicBoolean();

    public static boolean a(Context context) {
        if (!f3592c) {
            try {
                try {
                    PackageInfo packageInfoG = C0652c.a(context).g(64, "com.google.android.gms");
                    i.c(context);
                    if (packageInfoG == null || i.f(packageInfoG, false) || !i.f(packageInfoG, true)) {
                        f3591b = false;
                    } else {
                        f3591b = true;
                    }
                } catch (PackageManager.NameNotFoundException e6) {
                    Log.w("GooglePlayServicesUtil", "Cannot find Google Play services package name.", e6);
                }
                f3592c = true;
            } catch (Throwable th) {
                f3592c = true;
                throw th;
            }
        }
        return f3591b || !"user".equals(Build.TYPE);
    }

    public static boolean b(Context context) {
        try {
            Iterator<PackageInstaller.SessionInfo> it = context.getPackageManager().getPackageInstaller().getAllSessions().iterator();
            while (it.hasNext()) {
                if ("com.google.android.gms".equals(it.next().getAppPackageName())) {
                    return true;
                }
            }
            return context.getPackageManager().getApplicationInfo("com.google.android.gms", 8192).enabled;
        } catch (PackageManager.NameNotFoundException | Exception unused) {
            return false;
        }
    }
}
