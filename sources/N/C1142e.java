package n;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import d2.AbstractC0651b;
import java.lang.reflect.InvocationTargetException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* JADX INFO: renamed from: n.e, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1142e extends AbstractC0651b {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Object f11680h = new Object();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final ExecutorService f11681i = Executors.newFixedThreadPool(4, new ThreadFactoryC1140c(this));

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public volatile Handler f11682j;

    public static Handler H(Looper looper) {
        if (Build.VERSION.SDK_INT >= 28) {
            return AbstractC1141d.a(looper);
        }
        try {
            return (Handler) Handler.class.getDeclaredConstructor(Looper.class, Handler.Callback.class, Boolean.TYPE).newInstance(looper, null, Boolean.TRUE);
        } catch (IllegalAccessException | InstantiationException | NoSuchMethodException unused) {
            return new Handler(looper);
        } catch (InvocationTargetException unused2) {
            return new Handler(looper);
        }
    }

    public final void I(Runnable runnable) {
        this.f11681i.execute(runnable);
    }

    public final boolean J() {
        return Looper.getMainLooper().getThread() == Thread.currentThread();
    }

    public final void K(Runnable runnable) {
        if (this.f11682j == null) {
            synchronized (this.f11680h) {
                try {
                    if (this.f11682j == null) {
                        this.f11682j = H(Looper.getMainLooper());
                    }
                } finally {
                }
            }
        }
        this.f11682j.post(runnable);
    }
}
