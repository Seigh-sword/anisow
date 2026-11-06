package W;

import s4.C1316l;
import v4.InterfaceC1427e;

/* JADX INFO: renamed from: W.z, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0206z extends x4.h implements C4.p {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public /* synthetic */ Object f4188A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public final /* synthetic */ j0 f4189B;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0206z(j0 j0Var, InterfaceC1427e interfaceC1427e) {
        super(2, interfaceC1427e);
        this.f4189B = j0Var;
    }

    @Override // C4.p
    public final Object h(Object obj, Object obj2) {
        return ((C0206z) l((j0) obj, (InterfaceC1427e) obj2)).n(C1316l.f12640a);
    }

    @Override // x4.AbstractC1492a
    public final InterfaceC1427e l(Object obj, InterfaceC1427e interfaceC1427e) {
        C0206z c0206z = new C0206z(this.f4189B, interfaceC1427e);
        c0206z.f4188A = obj;
        return c0206z;
    }

    @Override // x4.AbstractC1492a
    public final Object n(Object obj) throws Throwable {
        S3.a.O(obj);
        j0 j0Var = (j0) this.f4188A;
        return Boolean.valueOf((j0Var instanceof C0185d) && j0Var.f4133a <= this.f4189B.f4133a);
    }
}
