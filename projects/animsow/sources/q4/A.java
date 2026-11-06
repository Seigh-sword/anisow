package Q4;

import v4.InterfaceC1427e;
import v4.InterfaceC1432j;

/* JADX INFO: loaded from: classes.dex */
public final class A implements InterfaceC1427e, x4.d {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final InterfaceC1427e f2824w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final InterfaceC1432j f2825x;

    public A(InterfaceC1427e interfaceC1427e, InterfaceC1432j interfaceC1432j) {
        this.f2824w = interfaceC1427e;
        this.f2825x = interfaceC1432j;
    }

    @Override // x4.d
    public final x4.d e() {
        InterfaceC1427e interfaceC1427e = this.f2824w;
        if (interfaceC1427e instanceof x4.d) {
            return (x4.d) interfaceC1427e;
        }
        return null;
    }

    @Override // v4.InterfaceC1427e
    public final InterfaceC1432j i() {
        return this.f2825x;
    }

    @Override // v4.InterfaceC1427e
    public final void o(Object obj) {
        this.f2824w.o(obj);
    }
}
