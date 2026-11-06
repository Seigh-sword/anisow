package W1;

import android.os.Bundle;
import java.util.concurrent.locks.Lock;
import t0.AbstractC1332d;

/* JADX INFO: renamed from: W1.t, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0225t implements V1.i, V1.j {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C0226u f4349c;

    public /* synthetic */ C0225t(C0226u c0226u) {
        this.f4349c = c0226u;
    }

    @Override // W1.InterfaceC0210d
    public final void D(Bundle bundle) {
        C0226u c0226u = this.f4349c;
        AbstractC1332d.m(c0226u.f4367r);
        n2.c cVar = c0226u.f4360k;
        AbstractC1332d.m(cVar);
        cVar.d(new BinderC0224s(c0226u));
    }

    @Override // W1.InterfaceC0216j
    public final void e(U1.b bVar) {
        C0226u c0226u = this.f4349c;
        Lock lock = c0226u.f4351b;
        Lock lock2 = c0226u.f4351b;
        lock.lock();
        try {
            if (c0226u.f4361l && !bVar.b()) {
                c0226u.a();
                c0226u.l();
            } else {
                c0226u.j(bVar);
            }
            lock2.unlock();
        } catch (Throwable th) {
            lock2.unlock();
            throw th;
        }
    }

    @Override // W1.InterfaceC0210d
    public final void b(int i6) {
    }
}
