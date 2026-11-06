package X1;

import a2.C0259a;
import android.content.Context;
import android.os.HandlerThread;
import android.os.Looper;
import com.google.android.gms.internal.measurement.X;
import java.util.HashMap;
import java.util.concurrent.Executor;
import u1.C1364h;

/* JADX INFO: loaded from: classes.dex */
public final class P {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final Object f4547h = new Object();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static P f4548i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static HandlerThread f4549j;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HashMap f4550a = new HashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Context f4551b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public volatile X f4552c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final C0259a f4553d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f4554e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long f4555f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public volatile Executor f4556g;

    public P(Context context, Looper looper) {
        C1364h c1364h = new C1364h(this);
        this.f4551b = context.getApplicationContext();
        this.f4552c = new X(looper, c1364h, 2);
        this.f4553d = C0259a.b();
        this.f4554e = 5000L;
        this.f4555f = 300000L;
        this.f4556g = null;
    }

    public static P a(Context context) {
        synchronized (f4547h) {
            try {
                if (f4548i == null) {
                    f4548i = new P(context.getApplicationContext(), context.getMainLooper());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return f4548i;
    }

    public final void b(String str, String str2, I i6, boolean z5) {
        N n5 = new N(str, str2, z5);
        synchronized (this.f4550a) {
            try {
                O o3 = (O) this.f4550a.get(n5);
                if (o3 == null) {
                    throw new IllegalStateException("Nonexistent connection status for service config: ".concat(n5.toString()));
                }
                if (!o3.f4543w.containsKey(i6)) {
                    throw new IllegalStateException("Trying to unbind a GmsServiceConnection  that was not bound before.  config=".concat(n5.toString()));
                }
                o3.f4543w.remove(i6);
                if (o3.f4543w.isEmpty()) {
                    this.f4552c.sendMessageDelayed(this.f4552c.obtainMessage(0, n5), this.f4554e);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final boolean c(N n5, I i6, String str, Executor executor) {
        boolean z5;
        synchronized (this.f4550a) {
            try {
                O o3 = (O) this.f4550a.get(n5);
                if (executor == null) {
                    executor = this.f4556g;
                }
                if (o3 == null) {
                    o3 = new O(this, n5);
                    o3.f4543w.put(i6, i6);
                    o3.a(str, executor);
                    this.f4550a.put(n5, o3);
                } else {
                    this.f4552c.removeMessages(0, n5);
                    if (o3.f4543w.containsKey(i6)) {
                        throw new IllegalStateException("Trying to bind a GmsServiceConnection that was already connected before.  config=".concat(n5.toString()));
                    }
                    o3.f4543w.put(i6, i6);
                    int i7 = o3.f4544x;
                    if (i7 == 1) {
                        i6.onServiceConnected(o3.f4541B, o3.f4546z);
                    } else if (i7 == 2) {
                        o3.a(str, executor);
                    }
                }
                z5 = o3.f4545y;
            } catch (Throwable th) {
                throw th;
            }
        }
        return z5;
    }
}
