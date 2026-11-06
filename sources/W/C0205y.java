package W;

import s4.C1316l;
import v4.InterfaceC1427e;

/* JADX INFO: renamed from: W.y, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0205y extends x4.h implements C4.p {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public /* synthetic */ Object f4187A;

    @Override // C4.p
    public final Object h(Object obj, Object obj2) {
        return ((C0205y) l((j0) obj, (InterfaceC1427e) obj2)).n(C1316l.f12640a);
    }

    @Override // x4.AbstractC1492a
    public final InterfaceC1427e l(Object obj, InterfaceC1427e interfaceC1427e) {
        C0205y c0205y = new C0205y(2, interfaceC1427e);
        c0205y.f4187A = obj;
        return c0205y;
    }

    @Override // x4.AbstractC1492a
    public final Object n(Object obj) throws Throwable {
        S3.a.O(obj);
        return Boolean.valueOf(!(((j0) this.f4187A) instanceof X));
    }
}
