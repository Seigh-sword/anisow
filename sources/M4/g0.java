package M4;

import v4.InterfaceC1427e;

/* JADX INFO: loaded from: classes.dex */
public final class g0 extends C0063h {

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public final k0 f1885E;

    public g0(InterfaceC1427e interfaceC1427e, k0 k0Var) {
        super(1, interfaceC1427e);
        this.f1885E = k0Var;
    }

    @Override // M4.C0063h
    public final String B() {
        return "AwaitContinuation";
    }

    @Override // M4.C0063h
    public final Throwable t(k0 k0Var) {
        Throwable thB;
        Object objK = this.f1885E.K();
        return (!(objK instanceof i0) || (thB = ((i0) objK).b()) == null) ? objK instanceof r ? ((r) objK).f1916a : k0Var.F() : thB;
    }
}
