package M4;

import s4.AbstractC1305a;
import v4.InterfaceC1430h;
import v4.InterfaceC1431i;
import v4.InterfaceC1432j;

/* JADX INFO: loaded from: classes.dex */
public final class x0 implements InterfaceC1430h, InterfaceC1431i {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final x0 f1931w = new x0();

    @Override // v4.InterfaceC1432j
    public final Object g(Object obj, C4.p pVar) {
        return pVar.h(obj, this);
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

    @Override // v4.InterfaceC1430h
    public final InterfaceC1431i getKey() {
        return this;
    }
}
