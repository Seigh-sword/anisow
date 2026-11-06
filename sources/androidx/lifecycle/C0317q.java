package androidx.lifecycle;

import M4.C0078x;
import M4.InterfaceC0080z;
import s4.AbstractC1305a;
import v4.InterfaceC1432j;

/* JADX INFO: renamed from: androidx.lifecycle.q, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0317q implements InterfaceC0319t, InterfaceC0080z {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final AbstractC0315o f5638w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final InterfaceC1432j f5639x;

    public C0317q(AbstractC0315o abstractC0315o, InterfaceC1432j interfaceC1432j) {
        M4.b0 b0Var;
        AbstractC1305a.o(interfaceC1432j, "coroutineContext");
        this.f5638w = abstractC0315o;
        this.f5639x = interfaceC1432j;
        if (((C0323x) abstractC0315o).f5645d != EnumC0314n.f5631w || (b0Var = (M4.b0) interfaceC1432j.n(C0078x.f1930x)) == null) {
            return;
        }
        b0Var.b(null);
    }

    @Override // androidx.lifecycle.InterfaceC0319t
    public final void b(InterfaceC0321v interfaceC0321v, EnumC0313m enumC0313m) {
        AbstractC0315o abstractC0315o = this.f5638w;
        if (((C0323x) abstractC0315o).f5645d.compareTo(EnumC0314n.f5631w) <= 0) {
            abstractC0315o.b(this);
            M4.b0 b0Var = (M4.b0) this.f5639x.n(C0078x.f1930x);
            if (b0Var != null) {
                b0Var.b(null);
            }
        }
    }

    @Override // M4.InterfaceC0080z
    public final InterfaceC1432j u() {
        return this.f5639x;
    }
}
