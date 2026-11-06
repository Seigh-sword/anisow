package o0;

import M4.InterfaceC0080z;
import P4.C0141b;
import s4.AbstractC1305a;
import s4.C1316l;
import v4.InterfaceC1427e;
import w4.EnumC1481a;

/* JADX INFO: renamed from: o0.o0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1202o0 extends x4.h implements C4.p {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public int f12047A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public final /* synthetic */ A0 f12048B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public final /* synthetic */ p1 f12049C;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1202o0(A0 a02, p1 p1Var, InterfaceC1427e interfaceC1427e) {
        super(2, interfaceC1427e);
        this.f12048B = a02;
        this.f12049C = p1Var;
    }

    @Override // C4.p
    public final Object h(Object obj, Object obj2) {
        return ((C1202o0) l((InterfaceC0080z) obj, (InterfaceC1427e) obj2)).n(C1316l.f12640a);
    }

    @Override // x4.AbstractC1492a
    public final InterfaceC1427e l(Object obj, InterfaceC1427e interfaceC1427e) {
        return new C1202o0(this.f12048B, this.f12049C, interfaceC1427e);
    }

    @Override // x4.AbstractC1492a
    public final Object n(Object obj) throws Throwable {
        EnumC1481a enumC1481a = EnumC1481a.f13592w;
        int i6 = this.f12047A;
        if (i6 == 0) {
            S3.a.O(obj);
            C0141b c0141bR = AbstractC1305a.r(this.f12048B.f11728h);
            Z z5 = new Z(this.f12049C);
            this.f12047A = 1;
            if (c0141bR.d(z5, this) == enumC1481a) {
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
