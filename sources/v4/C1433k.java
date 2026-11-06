package v4;

import C4.p;
import java.io.Serializable;
import s4.AbstractC1305a;

/* JADX INFO: renamed from: v4.k, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1433k implements InterfaceC1432j, Serializable {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final C1433k f13309w = new C1433k();

    public final int hashCode() {
        return 0;
    }

    @Override // v4.InterfaceC1432j
    public final InterfaceC1432j k(InterfaceC1432j interfaceC1432j) {
        AbstractC1305a.o(interfaceC1432j, "context");
        return interfaceC1432j;
    }

    @Override // v4.InterfaceC1432j
    public final InterfaceC1432j l(InterfaceC1431i interfaceC1431i) {
        AbstractC1305a.o(interfaceC1431i, "key");
        return this;
    }

    @Override // v4.InterfaceC1432j
    public final InterfaceC1430h n(InterfaceC1431i interfaceC1431i) {
        AbstractC1305a.o(interfaceC1431i, "key");
        return null;
    }

    public final String toString() {
        return "EmptyCoroutineContext";
    }

    @Override // v4.InterfaceC1432j
    public final Object g(Object obj, p pVar) {
        return obj;
    }
}
