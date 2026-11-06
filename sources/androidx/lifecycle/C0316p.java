package androidx.lifecycle;

import M4.C0078x;
import M4.InterfaceC0080z;
import s4.C1316l;
import v4.InterfaceC1427e;

/* JADX INFO: renamed from: androidx.lifecycle.p, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0316p extends x4.h implements C4.p {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public /* synthetic */ Object f5636A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public final /* synthetic */ C0317q f5637B;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0316p(C0317q c0317q, InterfaceC1427e interfaceC1427e) {
        super(2, interfaceC1427e);
        this.f5637B = c0317q;
    }

    @Override // C4.p
    public final Object h(Object obj, Object obj2) throws Throwable {
        C0316p c0316p = (C0316p) l((InterfaceC0080z) obj, (InterfaceC1427e) obj2);
        C1316l c1316l = C1316l.f12640a;
        c0316p.n(c1316l);
        return c1316l;
    }

    @Override // x4.AbstractC1492a
    public final InterfaceC1427e l(Object obj, InterfaceC1427e interfaceC1427e) {
        C0316p c0316p = new C0316p(this.f5637B, interfaceC1427e);
        c0316p.f5636A = obj;
        return c0316p;
    }

    @Override // x4.AbstractC1492a
    public final Object n(Object obj) throws Throwable {
        S3.a.O(obj);
        InterfaceC0080z interfaceC0080z = (InterfaceC0080z) this.f5636A;
        C0317q c0317q = this.f5637B;
        if (((C0323x) c0317q.f5638w).f5645d.compareTo(EnumC0314n.f5632x) >= 0) {
            c0317q.f5638w.a(c0317q);
        } else {
            M4.b0 b0Var = (M4.b0) interfaceC0080z.u().n(C0078x.f1930x);
            if (b0Var != null) {
                b0Var.b(null);
            }
        }
        return C1316l.f12640a;
    }
}
