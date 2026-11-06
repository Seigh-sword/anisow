package m2;

import android.os.Handler;
import b2.C0337b;
import m.RunnableC0969k;
import t0.AbstractC1332d;

/* JADX INFO: renamed from: m2.n, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1059n {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static volatile com.google.android.gms.internal.measurement.X f11033d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InterfaceC1079w0 f11034a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final RunnableC0969k f11035b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public volatile long f11036c;

    public AbstractC1059n(InterfaceC1079w0 interfaceC1079w0) {
        AbstractC1332d.m(interfaceC1079w0);
        this.f11034a = interfaceC1079w0;
        this.f11035b = new RunnableC0969k(this, 21, interfaceC1079w0);
    }

    public final void a() {
        this.f11036c = 0L;
        d().removeCallbacks(this.f11035b);
    }

    public final void b(long j6) {
        a();
        if (j6 >= 0) {
            ((C0337b) this.f11034a.h()).getClass();
            this.f11036c = System.currentTimeMillis();
            if (d().postDelayed(this.f11035b, j6)) {
                return;
            }
            this.f11034a.f().f10715B.c(Long.valueOf(j6), "Failed to schedule delayed post. time");
        }
    }

    public abstract void c();

    public final Handler d() {
        com.google.android.gms.internal.measurement.X x5;
        if (f11033d != null) {
            return f11033d;
        }
        synchronized (AbstractC1059n.class) {
            try {
                if (f11033d == null) {
                    f11033d = new com.google.android.gms.internal.measurement.X(this.f11034a.a().getMainLooper());
                }
                x5 = f11033d;
            } catch (Throwable th) {
                throw th;
            }
        }
        return x5;
    }
}
