package J3;

import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.PowerManager;
import android.util.Log;
import com.google.firebase.messaging.FirebaseMessaging;
import java.io.IOException;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import n.ThreadFactoryC1140c;

/* JADX INFO: loaded from: classes.dex */
public final class z implements Runnable {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final long f1455w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final PowerManager.WakeLock f1456x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final FirebaseMessaging f1457y;

    public z(FirebaseMessaging firebaseMessaging, long j6) {
        new ThreadPoolExecutor(0, 1, 30L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new ThreadFactoryC1140c("firebase-iid-executor"));
        this.f1457y = firebaseMessaging;
        this.f1455w = j6;
        PowerManager.WakeLock wakeLockNewWakeLock = ((PowerManager) firebaseMessaging.f7441b.getSystemService("power")).newWakeLock(1, "fiid-sync");
        this.f1456x = wakeLockNewWakeLock;
        wakeLockNewWakeLock.setReferenceCounted(false);
    }

    public final boolean a() {
        ConnectivityManager connectivityManager = (ConnectivityManager) this.f1457y.f7441b.getSystemService("connectivity");
        NetworkInfo activeNetworkInfo = connectivityManager != null ? connectivityManager.getActiveNetworkInfo() : null;
        return activeNetworkInfo != null && activeNetworkInfo.isConnected();
    }

    public final boolean b() throws IOException {
        try {
            if (this.f1457y.a() == null) {
                Log.e("FirebaseMessaging", "Token retrieval failed: null");
                return false;
            }
            if (!Log.isLoggable("FirebaseMessaging", 3)) {
                return true;
            }
            Log.d("FirebaseMessaging", "Token successfully retrieved");
            return true;
        } catch (IOException e6) {
            String message = e6.getMessage();
            if (!"SERVICE_NOT_AVAILABLE".equals(message) && !"INTERNAL_SERVER_ERROR".equals(message) && !"InternalServerError".equals(message)) {
                if (e6.getMessage() != null) {
                    throw e6;
                }
                Log.w("FirebaseMessaging", "Token retrieval failed without exception message. Will retry token retrieval");
                return false;
            }
            Log.w("FirebaseMessaging", "Token retrieval failed: " + e6.getMessage() + ". Will retry token retrieval");
            return false;
        } catch (SecurityException unused) {
            Log.w("FirebaseMessaging", "Token retrieval failed with SecurityException. Will retry token retrieval");
            return false;
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        w wVarK = w.k();
        FirebaseMessaging firebaseMessaging = this.f1457y;
        boolean zN = wVarK.n(firebaseMessaging.f7441b);
        PowerManager.WakeLock wakeLock = this.f1456x;
        if (zN) {
            wakeLock.acquire();
        }
        try {
            try {
                synchronized (firebaseMessaging) {
                    firebaseMessaging.f7448i = true;
                }
            } catch (IOException e6) {
                Log.e("FirebaseMessaging", "Topic sync or token retrieval failed on hard failure exceptions: " + e6.getMessage() + ". Won't retry the operation.");
                synchronized (firebaseMessaging) {
                    firebaseMessaging.f7448i = false;
                    if (!w.k().n(firebaseMessaging.f7441b)) {
                        return;
                    }
                }
            }
            if (!firebaseMessaging.f7447h.j()) {
                synchronized (firebaseMessaging) {
                    firebaseMessaging.f7448i = false;
                }
                if (w.k().n(firebaseMessaging.f7441b)) {
                    wakeLock.release();
                    return;
                }
                return;
            }
            if (w.k().m(firebaseMessaging.f7441b) && !a()) {
                new i.D(this, 5).a();
                if (w.k().n(firebaseMessaging.f7441b)) {
                    wakeLock.release();
                    return;
                }
                return;
            }
            if (b()) {
                synchronized (firebaseMessaging) {
                    firebaseMessaging.f7448i = false;
                }
            } else {
                firebaseMessaging.g(this.f1455w);
            }
            if (!w.k().n(firebaseMessaging.f7441b)) {
                return;
            }
            wakeLock.release();
        } catch (Throwable th) {
            if (w.k().n(firebaseMessaging.f7441b)) {
                wakeLock.release();
            }
            throw th;
        }
    }
}
