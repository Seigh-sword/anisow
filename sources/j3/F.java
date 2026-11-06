package J3;

import N.C0089e;
import android.content.Context;
import android.os.PowerManager;
import android.util.Log;
import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public final class F implements Runnable {

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public static final Object f1354B = new Object();

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public static Boolean f1355C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public static Boolean f1356D;

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public final long f1357A;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final Context f1358w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final C0089e f1359x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final PowerManager.WakeLock f1360y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final D f1361z;

    public F(D d6, Context context, C0089e c0089e, long j6) {
        this.f1361z = d6;
        this.f1358w = context;
        this.f1357A = j6;
        this.f1359x = c0089e;
        this.f1360y = ((PowerManager) context.getSystemService("power")).newWakeLock(1, "wake:com.google.firebase.messaging");
    }

    public static boolean a(Context context) {
        boolean zBooleanValue;
        synchronized (f1354B) {
            try {
                Boolean bool = f1356D;
                Boolean boolValueOf = Boolean.valueOf(bool == null ? b(context, "android.permission.ACCESS_NETWORK_STATE", bool) : bool.booleanValue());
                f1356D = boolValueOf;
                zBooleanValue = boolValueOf.booleanValue();
            } catch (Throwable th) {
                throw th;
            }
        }
        return zBooleanValue;
    }

    public static boolean b(Context context, String str, Boolean bool) {
        if (bool != null) {
            return bool.booleanValue();
        }
        boolean z5 = context.checkCallingOrSelfPermission(str) == 0;
        if (!z5 && Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "Missing Permission: " + str + ". This permission should normally be included by the manifest merger, but may needed to be manually added to your manifest");
        }
        return z5;
    }

    public static boolean c(Context context) {
        boolean zBooleanValue;
        synchronized (f1354B) {
            try {
                Boolean bool = f1355C;
                Boolean boolValueOf = Boolean.valueOf(bool == null ? b(context, "android.permission.WAKE_LOCK", bool) : bool.booleanValue());
                f1355C = boolValueOf;
                zBooleanValue = boolValueOf.booleanValue();
            } catch (Throwable th) {
                throw th;
            }
        }
        return zBooleanValue;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final synchronized boolean d() {
        /*
            r2 = this;
            monitor-enter(r2)
            android.content.Context r0 = r2.f1358w     // Catch: java.lang.Throwable -> L12
            java.lang.String r1 = "connectivity"
            java.lang.Object r0 = r0.getSystemService(r1)     // Catch: java.lang.Throwable -> L12
            android.net.ConnectivityManager r0 = (android.net.ConnectivityManager) r0     // Catch: java.lang.Throwable -> L12
            if (r0 == 0) goto L14
            android.net.NetworkInfo r0 = r0.getActiveNetworkInfo()     // Catch: java.lang.Throwable -> L12
            goto L15
        L12:
            r0 = move-exception
            goto L22
        L14:
            r0 = 0
        L15:
            if (r0 == 0) goto L1f
            boolean r0 = r0.isConnected()     // Catch: java.lang.Throwable -> L12
            if (r0 == 0) goto L1f
            r0 = 1
            goto L20
        L1f:
            r0 = 0
        L20:
            monitor-exit(r2)
            return r0
        L22:
            monitor-exit(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: J3.F.d():boolean");
    }

    @Override // java.lang.Runnable
    public final void run() {
        D d6 = this.f1361z;
        Context context = this.f1358w;
        boolean zC = c(context);
        PowerManager.WakeLock wakeLock = this.f1360y;
        if (zC) {
            wakeLock.acquire(AbstractC0050f.f1399a);
        }
        try {
            try {
                synchronized (d6) {
                    d6.f1350g = true;
                }
            } catch (IOException e6) {
                Log.e("FirebaseMessaging", "Failed to sync topics. Won't retry sync. " + e6.getMessage());
                synchronized (d6) {
                    d6.f1350g = false;
                    if (!c(context)) {
                        return;
                    }
                }
            }
            if (!this.f1359x.j()) {
                synchronized (d6) {
                    d6.f1350g = false;
                }
                if (c(context)) {
                    try {
                        wakeLock.release();
                        return;
                    } catch (RuntimeException unused) {
                        Log.i("FirebaseMessaging", "TopicsSyncTask's wakelock was already released due to timeout.");
                        return;
                    }
                }
                return;
            }
            if (a(context) && !d()) {
                new E(this, this).a();
                if (c(context)) {
                    try {
                        wakeLock.release();
                        return;
                    } catch (RuntimeException unused2) {
                        Log.i("FirebaseMessaging", "TopicsSyncTask's wakelock was already released due to timeout.");
                        return;
                    }
                }
                return;
            }
            if (d6.d()) {
                synchronized (d6) {
                    d6.f1350g = false;
                }
            } else {
                d6.e(this.f1357A);
            }
            if (!c(context)) {
                return;
            }
            try {
                wakeLock.release();
            } catch (RuntimeException unused3) {
                Log.i("FirebaseMessaging", "TopicsSyncTask's wakelock was already released due to timeout.");
            }
        } catch (Throwable th) {
            if (c(context)) {
                try {
                    wakeLock.release();
                } catch (RuntimeException unused4) {
                    Log.i("FirebaseMessaging", "TopicsSyncTask's wakelock was already released due to timeout.");
                }
            }
            throw th;
        }
    }
}
