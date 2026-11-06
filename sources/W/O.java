package W;

import P4.InterfaceC0146g;
import P4.InterfaceC0147h;
import s4.AbstractC1305a;
import s4.C1316l;
import v4.InterfaceC1427e;
import w4.EnumC1481a;

/* JADX INFO: loaded from: classes.dex */
public final class O extends x4.h implements C4.p {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public int f4048A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public final /* synthetic */ W f4049B;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public O(W w5, InterfaceC1427e interfaceC1427e) {
        super(2, interfaceC1427e);
        this.f4049B = w5;
    }

    @Override // C4.p
    public final Object h(Object obj, Object obj2) {
        return ((O) l((InterfaceC0147h) obj, (InterfaceC1427e) obj2)).n(C1316l.f12640a);
    }

    @Override // x4.AbstractC1492a
    public final InterfaceC1427e l(Object obj, InterfaceC1427e interfaceC1427e) {
        return new O(this.f4049B, interfaceC1427e);
    }

    @Override // x4.AbstractC1492a
    public final Object n(Object obj) throws Throwable {
        EnumC1481a enumC1481a = EnumC1481a.f13592w;
        int i6 = this.f4048A;
        C1316l c1316l = C1316l.f12640a;
        W w5 = this.f4049B;
        int i7 = 1;
        if (i6 == 0) {
            S3.a.O(obj);
            C0196o c0196o = w5.f4078h;
            this.f4048A = 1;
            Object objD0 = c0196o.f4094b.d0(this);
            if (objD0 != enumC1481a) {
                objD0 = c1316l;
            }
            if (objD0 == enumC1481a) {
                return enumC1481a;
            }
        } else {
            if (i6 != 1) {
                if (i6 == 2) {
                    S3.a.O(obj);
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            S3.a.O(obj);
        }
        InterfaceC0146g interfaceC0146gH = AbstractC1305a.h(w5.f().f4132c, -1);
        C0199s c0199s = new C0199s(i7, w5);
        this.f4048A = 2;
        return interfaceC0146gH.d(c0199s, this) == enumC1481a ? enumC1481a : c1316l;
    }
}
