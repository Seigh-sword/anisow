package P4;

import s4.C1316l;
import v4.InterfaceC1427e;

/* JADX INFO: loaded from: classes.dex */
public final class P extends x4.h implements C4.p {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public /* synthetic */ int f2621A;

    @Override // C4.p
    public final Object h(Object obj, Object obj2) {
        return ((P) l(Integer.valueOf(((Number) obj).intValue()), (InterfaceC1427e) obj2)).n(C1316l.f12640a);
    }

    @Override // x4.AbstractC1492a
    public final InterfaceC1427e l(Object obj, InterfaceC1427e interfaceC1427e) {
        P p5 = new P(2, interfaceC1427e);
        p5.f2621A = ((Number) obj).intValue();
        return p5;
    }

    @Override // x4.AbstractC1492a
    public final Object n(Object obj) throws Throwable {
        S3.a.O(obj);
        return Boolean.valueOf(this.f2621A > 0);
    }
}
