package W;

import M4.InterfaceC0080z;
import h0.C0733A;
import s4.C1316l;
import v4.InterfaceC1427e;
import w4.EnumC1481a;

/* JADX INFO: renamed from: W.u, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0201u extends x4.h implements C4.p {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public int f4174A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public final /* synthetic */ W f4175B;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0201u(W w5, InterfaceC1427e interfaceC1427e) {
        super(2, interfaceC1427e);
        this.f4175B = w5;
    }

    @Override // C4.p
    public final Object h(Object obj, Object obj2) throws Throwable {
        ((C0201u) l((InterfaceC0080z) obj, (InterfaceC1427e) obj2)).n(C1316l.f12640a);
        return EnumC1481a.f13592w;
    }

    @Override // x4.AbstractC1492a
    public final InterfaceC1427e l(Object obj, InterfaceC1427e interfaceC1427e) {
        return new C0201u(this.f4175B, interfaceC1427e);
    }

    @Override // x4.AbstractC1492a
    public final Object n(Object obj) throws Throwable {
        EnumC1481a enumC1481a = EnumC1481a.f13592w;
        int i6 = this.f4174A;
        if (i6 == 0) {
            S3.a.O(obj);
            P4.X x5 = this.f4175B.f4074d;
            C0200t c0200t = C0200t.f4173w;
            this.f4174A = 1;
            if (x5.f2640w.d(c0200t, this) == enumC1481a) {
                return enumC1481a;
            }
        } else {
            if (i6 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            S3.a.O(obj);
        }
        throw new C0733A();
    }
}
