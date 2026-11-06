package o0;

import P4.InterfaceC0147h;
import s4.C1316l;
import v4.InterfaceC1427e;

/* JADX INFO: loaded from: classes.dex */
public final class D0 extends x4.h implements C4.p {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public final /* synthetic */ F0 f11744A;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public D0(F0 f02, InterfaceC1427e interfaceC1427e) {
        super(2, interfaceC1427e);
        this.f11744A = f02;
    }

    @Override // C4.p
    public final Object h(Object obj, Object obj2) throws Throwable {
        D0 d02 = (D0) l((InterfaceC0147h) obj, (InterfaceC1427e) obj2);
        C1316l c1316l = C1316l.f12640a;
        d02.n(c1316l);
        return c1316l;
    }

    @Override // x4.AbstractC1492a
    public final InterfaceC1427e l(Object obj, InterfaceC1427e interfaceC1427e) {
        return new D0(this.f11744A, interfaceC1427e);
    }

    @Override // x4.AbstractC1492a
    public final Object n(Object obj) throws Throwable {
        S3.a.O(obj);
        F0 f02 = this.f11744A;
        f02.f11758j.m(new Integer(f02.f11756h));
        return C1316l.f12640a;
    }
}
