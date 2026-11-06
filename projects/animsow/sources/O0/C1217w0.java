package o0;

import s4.C1316l;
import v4.InterfaceC1427e;

/* JADX INFO: renamed from: o0.w0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1217w0 extends x4.h implements C4.p {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public /* synthetic */ Object f12148A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public final /* synthetic */ A0 f12149B;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1217w0(A0 a02, InterfaceC1427e interfaceC1427e) {
        super(2, interfaceC1427e);
        this.f12149B = a02;
    }

    @Override // C4.p
    public final Object h(Object obj, Object obj2) {
        return ((C1217w0) l((C1) obj, (InterfaceC1427e) obj2)).n(C1316l.f12640a);
    }

    @Override // x4.AbstractC1492a
    public final InterfaceC1427e l(Object obj, InterfaceC1427e interfaceC1427e) {
        C1217w0 c1217w0 = new C1217w0(this.f12149B, interfaceC1427e);
        c1217w0.f12148A = obj;
        return c1217w0;
    }

    @Override // x4.AbstractC1492a
    public final Object n(Object obj) throws Throwable {
        S3.a.O(obj);
        C1 c12 = (C1) this.f12148A;
        int i6 = c12.f11739a * (-1);
        int i7 = this.f12149B.f11723c.f11784d;
        return Boolean.valueOf(i6 > i7 || c12.f11740b * (-1) > i7);
    }
}
