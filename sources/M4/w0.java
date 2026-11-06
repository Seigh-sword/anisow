package M4;

import s4.AbstractC1305a;
import s4.C1311g;
import v4.C1428f;
import v4.InterfaceC1427e;
import v4.InterfaceC1432j;

/* JADX INFO: loaded from: classes.dex */
public final class w0 extends R4.t {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public final ThreadLocal f1928A;
    private volatile boolean threadLocalIsSet;

    /* JADX WARN: Illegal instructions before constructor call */
    public w0(InterfaceC1427e interfaceC1427e, InterfaceC1432j interfaceC1432j) {
        x0 x0Var = x0.f1931w;
        super(interfaceC1427e, interfaceC1432j.n(x0Var) == null ? interfaceC1432j.k(x0Var) : interfaceC1432j);
        this.f1928A = new ThreadLocal();
        if (interfaceC1427e.i().n(C1428f.f13308w) instanceof AbstractC0077w) {
            return;
        }
        Object objF = R4.a.f(interfaceC1432j, null);
        R4.a.b(interfaceC1432j, objF);
        h0(interfaceC1432j, objF);
    }

    public final boolean g0() {
        boolean z5 = this.threadLocalIsSet && this.f1928A.get() == null;
        this.f1928A.remove();
        return !z5;
    }

    public final void h0(InterfaceC1432j interfaceC1432j, Object obj) {
        this.threadLocalIsSet = true;
        this.f1928A.set(new C1311g(interfaceC1432j, obj));
    }

    @Override // R4.t, M4.k0
    public final void w(Object obj) {
        if (this.threadLocalIsSet) {
            C1311g c1311g = (C1311g) this.f1928A.get();
            if (c1311g != null) {
                R4.a.b((InterfaceC1432j) c1311g.f12632w, c1311g.f12633x);
            }
            this.f1928A.remove();
        }
        Object objR = AbstractC1305a.R(obj);
        InterfaceC1427e interfaceC1427e = this.f3039z;
        InterfaceC1432j interfaceC1432jI = interfaceC1427e.i();
        Object objF = R4.a.f(interfaceC1432jI, null);
        w0 w0VarY = objF != R4.a.f3006f ? AbstractC1305a.Y(interfaceC1427e, interfaceC1432jI, objF) : null;
        try {
            this.f3039z.o(objR);
        } finally {
            if (w0VarY == null || w0VarY.g0()) {
                R4.a.b(interfaceC1432jI, objF);
            }
        }
    }
}
