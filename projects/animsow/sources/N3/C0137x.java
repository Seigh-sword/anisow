package N3;

import M4.InterfaceC0080z;
import W.C0199s;
import s4.C1316l;
import v4.InterfaceC1427e;
import w4.EnumC1481a;

/* JADX INFO: renamed from: N3.x, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0137x extends x4.h implements C4.p {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public int f2277A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public final /* synthetic */ F f2278B;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0137x(F f6, InterfaceC1427e interfaceC1427e) {
        super(2, interfaceC1427e);
        this.f2278B = f6;
    }

    @Override // C4.p
    public final Object h(Object obj, Object obj2) {
        return ((C0137x) l((InterfaceC0080z) obj, (InterfaceC1427e) obj2)).n(C1316l.f12640a);
    }

    @Override // x4.AbstractC1492a
    public final InterfaceC1427e l(Object obj, InterfaceC1427e interfaceC1427e) {
        return new C0137x(this.f2278B, interfaceC1427e);
    }

    @Override // x4.AbstractC1492a
    public final Object n(Object obj) throws Throwable {
        EnumC1481a enumC1481a = EnumC1481a.f13592w;
        int i6 = this.f2277A;
        if (i6 == 0) {
            S3.a.O(obj);
            F f6 = this.f2278B;
            P4.A a6 = f6.f2135d;
            C0199s c0199s = new C0199s(4, f6);
            this.f2277A = 1;
            if (a6.d(c0199s, this) == enumC1481a) {
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
