package v4;

import C4.p;
import s4.AbstractC1305a;

/* JADX INFO: renamed from: v4.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1423a implements InterfaceC1430h {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final InterfaceC1431i f13300w;

    public AbstractC1423a(InterfaceC1431i interfaceC1431i) {
        this.f13300w = interfaceC1431i;
    }

    @Override // v4.InterfaceC1432j
    public final Object g(Object obj, p pVar) {
        return pVar.h(obj, this);
    }

    @Override // v4.InterfaceC1430h
    public final InterfaceC1431i getKey() {
        return this.f13300w;
    }

    @Override // v4.InterfaceC1432j
    public final InterfaceC1432j k(InterfaceC1432j interfaceC1432j) {
        return AbstractC1305a.Q(this, interfaceC1432j);
    }

    @Override // v4.InterfaceC1432j
    public InterfaceC1432j l(InterfaceC1431i interfaceC1431i) {
        return AbstractC1305a.N(this, interfaceC1431i);
    }

    @Override // v4.InterfaceC1432j
    public InterfaceC1430h n(InterfaceC1431i interfaceC1431i) {
        return AbstractC1305a.C(this, interfaceC1431i);
    }
}
