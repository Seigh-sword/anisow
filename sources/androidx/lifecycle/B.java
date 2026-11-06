package androidx.lifecycle;

/* JADX INFO: loaded from: classes.dex */
public final class B extends C implements InterfaceC0319t {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public final InterfaceC0321v f5542A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public final /* synthetic */ E f5543B;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public B(E e6, InterfaceC0321v interfaceC0321v, W0.h hVar) {
        super(e6, hVar);
        this.f5543B = e6;
        this.f5542A = interfaceC0321v;
    }

    @Override // androidx.lifecycle.InterfaceC0319t
    public final void b(InterfaceC0321v interfaceC0321v, EnumC0313m enumC0313m) {
        InterfaceC0321v interfaceC0321v2 = this.f5542A;
        EnumC0314n enumC0314n = interfaceC0321v2.g().f5645d;
        if (enumC0314n != EnumC0314n.f5631w) {
            EnumC0314n enumC0314n2 = null;
            while (enumC0314n2 != enumC0314n) {
                a(e());
                enumC0314n2 = enumC0314n;
                enumC0314n = interfaceC0321v2.g().f5645d;
            }
            return;
        }
        E e6 = this.f5543B;
        e6.getClass();
        E.a("removeObserver");
        C c6 = (C) e6.f5551b.c(this.f5544w);
        if (c6 == null) {
            return;
        }
        c6.c();
        c6.a(false);
    }

    @Override // androidx.lifecycle.C
    public final void c() {
        this.f5542A.g().b(this);
    }

    @Override // androidx.lifecycle.C
    public final boolean d(InterfaceC0321v interfaceC0321v) {
        return this.f5542A == interfaceC0321v;
    }

    @Override // androidx.lifecycle.C
    public final boolean e() {
        return this.f5542A.g().f5645d.compareTo(EnumC0314n.f5634z) >= 0;
    }
}
