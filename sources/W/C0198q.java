package W;

import P4.InterfaceC0147h;
import s4.C1316l;
import v4.InterfaceC1427e;

/* JADX INFO: renamed from: W.q, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0198q extends x4.h implements C4.p {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public final /* synthetic */ M4.b0 f4167A;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0198q(M4.b0 b0Var, InterfaceC1427e interfaceC1427e) {
        super(2, interfaceC1427e);
        this.f4167A = b0Var;
    }

    @Override // C4.p
    public final Object h(Object obj, Object obj2) throws Throwable {
        C0198q c0198q = (C0198q) l((InterfaceC0147h) obj, (InterfaceC1427e) obj2);
        C1316l c1316l = C1316l.f12640a;
        c0198q.n(c1316l);
        return c1316l;
    }

    @Override // x4.AbstractC1492a
    public final InterfaceC1427e l(Object obj, InterfaceC1427e interfaceC1427e) {
        return new C0198q(this.f4167A, interfaceC1427e);
    }

    @Override // x4.AbstractC1492a
    public final Object n(Object obj) throws Throwable {
        int iA0;
        S3.a.O(obj);
        M4.k0 k0Var = (M4.k0) this.f4167A;
        do {
            iA0 = k0Var.a0(k0Var.K());
            if (iA0 == 0) {
                break;
            }
        } while (iA0 != 1);
        return C1316l.f12640a;
    }
}
