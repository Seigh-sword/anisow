package P4;

import v4.InterfaceC1427e;
import v4.InterfaceC1432j;

/* JADX INFO: loaded from: classes.dex */
public final class Y implements o0, InterfaceC0146g, Q4.s {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ o0 f2641w;

    public Y(W w5) {
        this.f2641w = w5;
    }

    @Override // Q4.s
    public final InterfaceC0146g b(InterfaceC1432j interfaceC1432j, int i6, O4.a aVar) {
        return (((i6 < 0 || i6 >= 2) && i6 != -2) || aVar != O4.a.f2343x) ? d0.d(this, interfaceC1432j, i6, aVar) : this;
    }

    @Override // P4.InterfaceC0146g
    public final Object d(InterfaceC0147h interfaceC0147h, InterfaceC1427e interfaceC1427e) {
        return this.f2641w.d(interfaceC0147h, interfaceC1427e);
    }

    @Override // P4.o0
    public final Object getValue() {
        return this.f2641w.getValue();
    }
}
