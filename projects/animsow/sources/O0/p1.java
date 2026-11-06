package o0;

import M4.InterfaceC0080z;
import s4.AbstractC1305a;
import v4.InterfaceC1427e;
import v4.InterfaceC1432j;

/* JADX INFO: loaded from: classes.dex */
public final class p1 implements InterfaceC0080z, O4.r {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final O4.r f12061w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0080z f12062x;

    public p1(InterfaceC0080z interfaceC0080z, O4.g gVar) {
        AbstractC1305a.o(interfaceC0080z, "scope");
        AbstractC1305a.o(gVar, "channel");
        this.f12061w = gVar;
        this.f12062x = interfaceC0080z;
    }

    @Override // O4.r
    public final Object a(Object obj, InterfaceC1427e interfaceC1427e) {
        return this.f12061w.a(obj, interfaceC1427e);
    }

    @Override // O4.r
    public final boolean j(Throwable th) {
        return this.f12061w.j(th);
    }

    @Override // M4.InterfaceC0080z
    public final InterfaceC1432j u() {
        return this.f12062x.u();
    }
}
