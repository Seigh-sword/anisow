package o0;

import M4.InterfaceC0080z;
import P4.C0141b;
import s4.AbstractC1305a;
import s4.C1316l;
import v4.InterfaceC1427e;
import w4.EnumC1481a;

/* JADX INFO: renamed from: o0.t0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1211t0 extends x4.h implements C4.p {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public int f12106A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public /* synthetic */ Object f12107B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public final /* synthetic */ O4.g f12108C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public final /* synthetic */ A0 f12109D;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1211t0(A0 a02, InterfaceC1427e interfaceC1427e, O4.g gVar) {
        super(2, interfaceC1427e);
        this.f12108C = gVar;
        this.f12109D = a02;
    }

    @Override // C4.p
    public final Object h(Object obj, Object obj2) {
        return ((C1211t0) l((InterfaceC0080z) obj, (InterfaceC1427e) obj2)).n(C1316l.f12640a);
    }

    @Override // x4.AbstractC1492a
    public final InterfaceC1427e l(Object obj, InterfaceC1427e interfaceC1427e) {
        C1211t0 c1211t0 = new C1211t0(this.f12109D, interfaceC1427e, this.f12108C);
        c1211t0.f12107B = obj;
        return c1211t0;
    }

    @Override // x4.AbstractC1492a
    public final Object n(Object obj) throws Throwable {
        EnumC1481a enumC1481a = EnumC1481a.f13592w;
        int i6 = this.f12106A;
        if (i6 == 0) {
            S3.a.O(obj);
            InterfaceC0080z interfaceC0080z = (InterfaceC0080z) this.f12107B;
            C0141b c0141bR = AbstractC1305a.r(this.f12108C);
            C1209s0 c1209s0 = new C1209s0(this.f12109D, interfaceC0080z);
            this.f12106A = 1;
            if (c0141bR.d(c1209s0, this) == enumC1481a) {
                return enumC1481a;
            }
        } else {
            if (i6 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            S3.a.O(obj);
        }
        return C1316l.f12640a;
    }
}
