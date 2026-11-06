package o0;

import P4.InterfaceC0146g;
import s4.C1316l;
import v4.InterfaceC1427e;
import w4.EnumC1481a;

/* JADX INFO: loaded from: classes.dex */
public final class T0 extends x4.h implements C4.l {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public int f11843A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public final /* synthetic */ V0 f11844B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public final /* synthetic */ K0 f11845C;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public T0(V0 v02, K0 k02, InterfaceC1427e interfaceC1427e) {
        super(1, interfaceC1427e);
        this.f11844B = v02;
        this.f11845C = k02;
    }

    @Override // C4.l
    public final Object j(Object obj) {
        return new T0(this.f11844B, this.f11845C, (InterfaceC1427e) obj).n(C1316l.f12640a);
    }

    @Override // x4.AbstractC1492a
    public final Object n(Object obj) throws Throwable {
        EnumC1481a enumC1481a = EnumC1481a.f13592w;
        int i6 = this.f11843A;
        if (i6 == 0) {
            S3.a.O(obj);
            K0 k02 = this.f11845C;
            z1 z1Var = k02.f11794b;
            V0 v02 = this.f11844B;
            v02.getClass();
            InterfaceC0146g interfaceC0146g = k02.f11793a;
            C1188h0 c1188h0 = new C1188h0(v02, 1, k02);
            this.f11843A = 1;
            if (interfaceC0146g.d(c1188h0, this) == enumC1481a) {
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
