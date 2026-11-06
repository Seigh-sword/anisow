package M4;

import v4.InterfaceC1432j;

/* JADX INFO: loaded from: classes.dex */
public final class v0 extends AbstractC0077w {

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final /* synthetic */ int f1926y = 0;

    static {
        new v0();
    }

    @Override // M4.AbstractC0077w
    public final void J(InterfaceC1432j interfaceC1432j, Runnable runnable) {
        z0 z0Var = (z0) interfaceC1432j.n(z0.f1932y);
        if (z0Var == null) {
            throw new UnsupportedOperationException("Dispatchers.Unconfined.dispatch function can only be used by the yield function. If you wrap Unconfined dispatcher in your code, make sure you properly delegate isDispatchNeeded and dispatch calls.");
        }
        z0Var.f1933x = true;
    }

    @Override // M4.AbstractC0077w
    public final String toString() {
        return "Dispatchers.Unconfined";
    }
}
