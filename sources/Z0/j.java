package Z0;

import M4.InterfaceC0080z;
import m2.C0;
import s4.C1316l;
import t0.AbstractC1332d;
import v4.InterfaceC1427e;

/* JADX INFO: loaded from: classes.dex */
public final class j extends x4.h implements C4.p {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public final /* synthetic */ p f4938A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public final /* synthetic */ int f4939B;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(p pVar, int i6, InterfaceC1427e interfaceC1427e) {
        super(2, interfaceC1427e);
        this.f4938A = pVar;
        this.f4939B = i6;
    }

    @Override // C4.p
    public final Object h(Object obj, Object obj2) {
        return ((j) l((InterfaceC0080z) obj, (InterfaceC1427e) obj2)).n(C1316l.f12640a);
    }

    @Override // x4.AbstractC1492a
    public final InterfaceC1427e l(Object obj, InterfaceC1427e interfaceC1427e) {
        return new j(this.f4938A, this.f4939B, interfaceC1427e);
    }

    @Override // x4.AbstractC1492a
    public final Object n(Object obj) throws Throwable {
        boolean zContains;
        S3.a.O(obj);
        try {
            zContains = this.f4938A.e().contains(new Integer(this.f4939B));
        } catch (Exception e6) {
            C0.h().a(e6);
            AbstractC1332d.X("inMyList ## " + e6.getMessage());
            zContains = false;
        }
        return Boolean.valueOf(zContains);
    }
}
