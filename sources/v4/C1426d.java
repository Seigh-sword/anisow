package v4;

import C4.p;
import java.io.Serializable;
import s4.AbstractC1305a;

/* JADX INFO: renamed from: v4.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1426d implements InterfaceC1432j, Serializable {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final InterfaceC1432j f13306w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final InterfaceC1430h f13307x;

    public C1426d(InterfaceC1430h interfaceC1430h, InterfaceC1432j interfaceC1432j) {
        AbstractC1305a.o(interfaceC1432j, "left");
        AbstractC1305a.o(interfaceC1430h, "element");
        this.f13306w = interfaceC1432j;
        this.f13307x = interfaceC1430h;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C1426d) {
                C1426d c1426d = (C1426d) obj;
                c1426d.getClass();
                int i6 = 2;
                C1426d c1426d2 = c1426d;
                int i7 = 2;
                while (true) {
                    InterfaceC1432j interfaceC1432j = c1426d2.f13306w;
                    c1426d2 = interfaceC1432j instanceof C1426d ? (C1426d) interfaceC1432j : null;
                    if (c1426d2 == null) {
                        break;
                    }
                    i7++;
                }
                C1426d c1426d3 = this;
                while (true) {
                    InterfaceC1432j interfaceC1432j2 = c1426d3.f13306w;
                    c1426d3 = interfaceC1432j2 instanceof C1426d ? (C1426d) interfaceC1432j2 : null;
                    if (c1426d3 == null) {
                        break;
                    }
                    i6++;
                }
                if (i7 == i6) {
                    C1426d c1426d4 = this;
                    while (true) {
                        InterfaceC1430h interfaceC1430h = c1426d4.f13307x;
                        if (!AbstractC1305a.c(c1426d.n(interfaceC1430h.getKey()), interfaceC1430h)) {
                            break;
                        }
                        InterfaceC1432j interfaceC1432j3 = c1426d4.f13306w;
                        if (interfaceC1432j3 instanceof C1426d) {
                            c1426d4 = (C1426d) interfaceC1432j3;
                        } else {
                            AbstractC1305a.m(interfaceC1432j3, "null cannot be cast to non-null type kotlin.coroutines.CoroutineContext.Element");
                            InterfaceC1430h interfaceC1430h2 = (InterfaceC1430h) interfaceC1432j3;
                            if (AbstractC1305a.c(c1426d.n(interfaceC1430h2.getKey()), interfaceC1430h2)) {
                            }
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    @Override // v4.InterfaceC1432j
    public final Object g(Object obj, p pVar) {
        return pVar.h(this.f13306w.g(obj, pVar), this.f13307x);
    }

    public final int hashCode() {
        return this.f13307x.hashCode() + this.f13306w.hashCode();
    }

    @Override // v4.InterfaceC1432j
    public final InterfaceC1432j k(InterfaceC1432j interfaceC1432j) {
        AbstractC1305a.o(interfaceC1432j, "context");
        return interfaceC1432j == C1433k.f13309w ? this : (InterfaceC1432j) interfaceC1432j.g(this, C1425c.f13304z);
    }

    @Override // v4.InterfaceC1432j
    public final InterfaceC1432j l(InterfaceC1431i interfaceC1431i) {
        AbstractC1305a.o(interfaceC1431i, "key");
        InterfaceC1430h interfaceC1430h = this.f13307x;
        InterfaceC1430h interfaceC1430hN = interfaceC1430h.n(interfaceC1431i);
        InterfaceC1432j interfaceC1432j = this.f13306w;
        if (interfaceC1430hN != null) {
            return interfaceC1432j;
        }
        InterfaceC1432j interfaceC1432jL = interfaceC1432j.l(interfaceC1431i);
        return interfaceC1432jL == interfaceC1432j ? this : interfaceC1432jL == C1433k.f13309w ? interfaceC1430h : new C1426d(interfaceC1430h, interfaceC1432jL);
    }

    @Override // v4.InterfaceC1432j
    public final InterfaceC1430h n(InterfaceC1431i interfaceC1431i) {
        AbstractC1305a.o(interfaceC1431i, "key");
        C1426d c1426d = this;
        while (true) {
            InterfaceC1430h interfaceC1430hN = c1426d.f13307x.n(interfaceC1431i);
            if (interfaceC1430hN != null) {
                return interfaceC1430hN;
            }
            InterfaceC1432j interfaceC1432j = c1426d.f13306w;
            if (!(interfaceC1432j instanceof C1426d)) {
                return interfaceC1432j.n(interfaceC1431i);
            }
            c1426d = (C1426d) interfaceC1432j;
        }
    }

    public final String toString() {
        return "[" + ((String) g("", C1425c.f13303y)) + ']';
    }
}
