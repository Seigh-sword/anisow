package x4;

import v4.C1433k;
import v4.InterfaceC1427e;
import v4.InterfaceC1432j;

/* JADX INFO: loaded from: classes.dex */
public abstract class g extends AbstractC1492a {
    public g(InterfaceC1427e interfaceC1427e) {
        super(interfaceC1427e);
        if (interfaceC1427e != null && interfaceC1427e.i() != C1433k.f13309w) {
            throw new IllegalArgumentException("Coroutines with restricted suspension must have EmptyCoroutineContext".toString());
        }
    }

    @Override // v4.InterfaceC1427e
    public final InterfaceC1432j i() {
        return C1433k.f13309w;
    }
}
