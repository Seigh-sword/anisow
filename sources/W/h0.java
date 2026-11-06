package W;

import P4.InterfaceC0147h;
import s4.C1316l;
import v4.InterfaceC1427e;

/* JADX INFO: loaded from: classes.dex */
public final class h0 extends x4.h implements C4.p {
    @Override // C4.p
    public final Object h(Object obj, Object obj2) throws Throwable {
        h0 h0Var = (h0) l((InterfaceC0147h) obj, (InterfaceC1427e) obj2);
        C1316l c1316l = C1316l.f12640a;
        h0Var.n(c1316l);
        return c1316l;
    }

    @Override // x4.AbstractC1492a
    public final InterfaceC1427e l(Object obj, InterfaceC1427e interfaceC1427e) {
        return new h0(2, interfaceC1427e);
    }

    @Override // x4.AbstractC1492a
    public final Object n(Object obj) throws Throwable {
        S3.a.O(obj);
        return C1316l.f12640a;
    }
}
