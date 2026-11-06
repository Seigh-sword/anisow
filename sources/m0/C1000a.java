package m0;

import M4.C0078x;
import M4.InterfaceC0080z;
import M4.b0;
import s4.AbstractC1305a;
import v4.InterfaceC1432j;

/* JADX INFO: renamed from: m0.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1000a implements AutoCloseable, InterfaceC0080z {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final InterfaceC1432j f10432w;

    public C1000a(InterfaceC1432j interfaceC1432j) {
        AbstractC1305a.o(interfaceC1432j, "coroutineContext");
        this.f10432w = interfaceC1432j;
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        b0 b0Var = (b0) this.f10432w.n(C0078x.f1930x);
        if (b0Var != null) {
            b0Var.b(null);
        }
    }

    @Override // M4.InterfaceC0080z
    public final InterfaceC1432j u() {
        return this.f10432w;
    }
}
