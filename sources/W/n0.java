package W;

import s4.AbstractC1305a;
import v4.InterfaceC1430h;
import v4.InterfaceC1431i;
import v4.InterfaceC1432j;

/* JADX INFO: loaded from: classes.dex */
public final class n0 implements InterfaceC1430h {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final n0 f4161w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final W f4162x;

    public n0(n0 n0Var, W w5) {
        AbstractC1305a.o(w5, "instance");
        this.f4161w = n0Var;
        this.f4162x = w5;
    }

    public final void a(InterfaceC0191j interfaceC0191j) {
        AbstractC1305a.o(interfaceC0191j, "candidate");
        if (this.f4162x == interfaceC0191j) {
            throw new IllegalStateException("Calling updateData inside updateData on the same DataStore instance is not supported\nsince updates made in the parent updateData call will not be visible to the nested\nupdateData call. See https://issuetracker.google.com/issues/241760537 for details.".toString());
        }
        n0 n0Var = this.f4161w;
        if (n0Var != null) {
            n0Var.a(interfaceC0191j);
        }
    }

    @Override // v4.InterfaceC1432j
    public final Object g(Object obj, C4.p pVar) {
        return pVar.h(obj, this);
    }

    @Override // v4.InterfaceC1430h
    public final InterfaceC1431i getKey() {
        return m0.f4151w;
    }

    @Override // v4.InterfaceC1432j
    public final InterfaceC1432j k(InterfaceC1432j interfaceC1432j) {
        return AbstractC1305a.Q(this, interfaceC1432j);
    }

    @Override // v4.InterfaceC1432j
    public final InterfaceC1432j l(InterfaceC1431i interfaceC1431i) {
        return AbstractC1305a.N(this, interfaceC1431i);
    }

    @Override // v4.InterfaceC1432j
    public final InterfaceC1430h n(InterfaceC1431i interfaceC1431i) {
        return AbstractC1305a.C(this, interfaceC1431i);
    }
}
