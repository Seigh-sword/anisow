package R4;

import M4.InterfaceC0080z;
import v4.InterfaceC1432j;

/* JADX INFO: loaded from: classes.dex */
public final class e implements InterfaceC0080z {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final InterfaceC1432j f3011w;

    public e(InterfaceC1432j interfaceC1432j) {
        this.f3011w = interfaceC1432j;
    }

    public final String toString() {
        return "CoroutineScope(coroutineContext=" + this.f3011w + ')';
    }

    @Override // M4.InterfaceC0080z
    public final InterfaceC1432j u() {
        return this.f3011w;
    }
}
