package S0;

import java.util.HashMap;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public final class r {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final String f3101e = I0.o.y("WorkTimer");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ScheduledExecutorService f3102a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final HashMap f3103b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final HashMap f3104c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Object f3105d;

    public r() {
        K.j jVar = new K.j(this);
        this.f3103b = new HashMap();
        this.f3104c = new HashMap();
        this.f3105d = new Object();
        this.f3102a = Executors.newSingleThreadScheduledExecutor(jVar);
    }

    public final void a(String str, p pVar) {
        synchronized (this.f3105d) {
            I0.o.w().u(f3101e, "Starting timer for " + str, new Throwable[0]);
            b(str);
            q qVar = new q(this, str);
            this.f3103b.put(str, qVar);
            this.f3104c.put(str, pVar);
            this.f3102a.schedule(qVar, 600000L, TimeUnit.MILLISECONDS);
        }
    }

    public final void b(String str) {
        synchronized (this.f3105d) {
            try {
                if (((q) this.f3103b.remove(str)) != null) {
                    I0.o.w().u(f3101e, "Stopping timer for " + str, new Throwable[0]);
                    this.f3104c.remove(str);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
