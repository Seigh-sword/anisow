package a0;

import C4.p;
import P4.InterfaceC0146g;
import W.InterfaceC0191j;
import v4.InterfaceC1427e;

/* JADX INFO: renamed from: a0.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0256d implements InterfaceC0191j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InterfaceC0191j f4987a;

    public C0256d(InterfaceC0191j interfaceC0191j) {
        this.f4987a = interfaceC0191j;
    }

    @Override // W.InterfaceC0191j
    public final Object a(p pVar, InterfaceC1427e interfaceC1427e) {
        return this.f4987a.a(new C0255c(pVar, null), interfaceC1427e);
    }

    @Override // W.InterfaceC0191j
    public final InterfaceC0146g b() {
        return this.f4987a.b();
    }
}
