package o0;

import M4.InterfaceC0080z;
import P4.InterfaceC0146g;
import W.C0199s;
import s4.C1316l;
import v4.InterfaceC1427e;
import w4.EnumC1481a;

/* JADX INFO: renamed from: o0.p0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1204p0 extends x4.h implements C4.p {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public int f12058A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public final /* synthetic */ A0 f12059B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public final /* synthetic */ O4.g f12060C;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1204p0(A0 a02, InterfaceC1427e interfaceC1427e, O4.g gVar) {
        super(2, interfaceC1427e);
        this.f12059B = a02;
        this.f12060C = gVar;
    }

    @Override // C4.p
    public final Object h(Object obj, Object obj2) {
        return ((C1204p0) l((InterfaceC0080z) obj, (InterfaceC1427e) obj2)).n(C1316l.f12640a);
    }

    @Override // x4.AbstractC1492a
    public final InterfaceC1427e l(Object obj, InterfaceC1427e interfaceC1427e) {
        return new C1204p0(this.f12059B, interfaceC1427e, this.f12060C);
    }

    @Override // x4.AbstractC1492a
    public final Object n(Object obj) throws Throwable {
        EnumC1481a enumC1481a = EnumC1481a.f13592w;
        int i6 = this.f12058A;
        if (i6 == 0) {
            S3.a.O(obj);
            InterfaceC0146g interfaceC0146g = this.f12059B.f11724d;
            C0199s c0199s = new C0199s(3, this.f12060C);
            this.f12058A = 1;
            if (interfaceC0146g.d(c0199s, this) == enumC1481a) {
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
