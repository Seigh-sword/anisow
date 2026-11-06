package P4;

import s4.C1316l;
import v4.InterfaceC1427e;

/* JADX INFO: loaded from: classes.dex */
public final class m0 extends x4.h implements C4.p {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public /* synthetic */ Object f2719A;

    @Override // C4.p
    public final Object h(Object obj, Object obj2) {
        return ((m0) l((f0) obj, (InterfaceC1427e) obj2)).n(C1316l.f12640a);
    }

    @Override // x4.AbstractC1492a
    public final InterfaceC1427e l(Object obj, InterfaceC1427e interfaceC1427e) {
        m0 m0Var = new m0(2, interfaceC1427e);
        m0Var.f2719A = obj;
        return m0Var;
    }

    @Override // x4.AbstractC1492a
    public final Object n(Object obj) throws Throwable {
        S3.a.O(obj);
        return Boolean.valueOf(((f0) this.f2719A) != f0.f2685w);
    }
}
