package W1;

import android.os.Bundle;
import java.util.Collections;
import java.util.Iterator;
import java.util.WeakHashMap;

/* JADX INFO: renamed from: W1.i, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0215i implements InterfaceC0230y, X1.v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f4318a;

    public C0215i() {
        this.f4318a = Collections.newSetFromMap(new WeakHashMap());
    }

    @Override // X1.v
    public final boolean a() {
        return ((C0229x) this.f4318a).d();
    }

    @Override // W1.InterfaceC0230y
    public final void b() {
        A a6 = (A) this.f4318a;
        a6.f4211c.lock();
        try {
            a6.f4221m = new C0226u(a6, a6.f4218j, a6.f4219k, a6.f4214f, a6.f4220l, a6.f4211c, a6.f4213e);
            a6.f4221m.g();
            a6.f4212d.signalAll();
        } finally {
            a6.f4211c.unlock();
        }
    }

    @Override // W1.InterfaceC0230y
    public final boolean e() {
        return true;
    }

    @Override // W1.InterfaceC0230y
    public final void g() {
        Object obj = this.f4318a;
        Iterator it = ((A) obj).f4216h.values().iterator();
        while (it.hasNext()) {
            ((V1.b) it.next()).h();
        }
        ((A) obj).f4223o.f4388p = Collections.emptySet();
    }

    public /* synthetic */ C0215i(Object obj) {
        this.f4318a = obj;
    }

    @Override // W1.InterfaceC0230y
    public final void d(Bundle bundle) {
    }

    @Override // W1.InterfaceC0230y
    public final void f(int i6) {
    }

    @Override // W1.InterfaceC0230y
    public final void c(U1.b bVar, V1.d dVar, boolean z5) {
    }
}
