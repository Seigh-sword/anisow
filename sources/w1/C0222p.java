package W1;

import X1.InterfaceC0236d;
import android.os.Looper;
import java.lang.ref.WeakReference;
import java.util.concurrent.locks.Lock;
import t0.AbstractC1332d;

/* JADX INFO: renamed from: W1.p, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0222p implements InterfaceC0236d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final WeakReference f4339a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final V1.d f4340b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f4341c;

    public C0222p(C0226u c0226u, V1.d dVar, boolean z5) {
        this.f4339a = new WeakReference(c0226u);
        this.f4340b = dVar;
        this.f4341c = z5;
    }

    @Override // X1.InterfaceC0236d
    public final void a(U1.b bVar) {
        C0226u c0226u = (C0226u) this.f4339a.get();
        if (c0226u == null) {
            return;
        }
        AbstractC1332d.o("onReportServiceBinding must be called on the GoogleApiClient handler thread", Looper.myLooper() == c0226u.f4350a.f4223o.f4379g);
        Lock lock = c0226u.f4351b;
        lock.lock();
        try {
            if (c0226u.m(0)) {
                if (!bVar.c()) {
                    c0226u.k(bVar, this.f4340b, this.f4341c);
                }
                if (c0226u.n()) {
                    c0226u.l();
                }
            }
        } finally {
            lock.unlock();
        }
    }
}
