package P4;

import Q4.C0167a;
import v4.InterfaceC1427e;

/* JADX INFO: loaded from: classes.dex */
public final class H implements InterfaceC0147h {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ D4.r f2593w;

    public H(D4.r rVar) {
        this.f2593w = rVar;
    }

    @Override // P4.InterfaceC0147h
    public final Object k(Object obj, InterfaceC1427e interfaceC1427e) {
        this.f2593w.f377w = obj;
        throw new C0167a(this);
    }
}
