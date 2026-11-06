package S4;

import M4.S;
import v4.InterfaceC1432j;

/* JADX INFO: loaded from: classes.dex */
public abstract class h extends S {

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final c f3323y;

    public h(int i6, int i7, long j6, String str) {
        this.f3323y = new c(i6, i7, j6, str);
    }

    @Override // M4.AbstractC0077w
    public final void J(InterfaceC1432j interfaceC1432j, Runnable runnable) {
        c.g(this.f3323y, runnable, false, 6);
    }

    @Override // M4.AbstractC0077w
    public final void K(InterfaceC1432j interfaceC1432j, Runnable runnable) {
        c.g(this.f3323y, runnable, true, 2);
    }
}
