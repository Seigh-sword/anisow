package o0;

import P4.C0150k;
import P4.C0157s;
import P4.InterfaceC0146g;
import d2.AbstractC0651b;
import s4.C1316l;
import v4.InterfaceC1427e;
import w4.EnumC1481a;

/* JADX INFO: loaded from: classes.dex */
public final class X extends x4.h implements C4.p {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public int f11876A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public /* synthetic */ Object f11877B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public final /* synthetic */ C1180d0 f11878C;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public X(C1180d0 c1180d0, InterfaceC1427e interfaceC1427e) {
        super(2, interfaceC1427e);
        this.f11878C = c1180d0;
    }

    @Override // C4.p
    public final Object h(Object obj, Object obj2) {
        return ((X) l((p1) obj, (InterfaceC1427e) obj2)).n(C1316l.f12640a);
    }

    @Override // x4.AbstractC1492a
    public final InterfaceC1427e l(Object obj, InterfaceC1427e interfaceC1427e) {
        X x5 = new X(this.f11878C, interfaceC1427e);
        x5.f11877B = obj;
        return x5;
    }

    @Override // x4.AbstractC1492a
    public final Object n(Object obj) throws Throwable {
        EnumC1481a enumC1481a = EnumC1481a.f13592w;
        int i6 = this.f11876A;
        if (i6 == 0) {
            S3.a.O(obj);
            p1 p1Var = (p1) this.f11877B;
            C1180d0 c1180d0 = this.f11878C;
            C0157s c0157s = new C0157s(new S(2, null), (InterfaceC0146g) c1180d0.f11911d.f6776y);
            T t5 = new T(c1180d0, null);
            Object obj2 = AbstractC1218x.f12151a;
            InterfaceC0146g interfaceC0146gC = AbstractC0651b.C(new C1216w(new W.C(new C0150k(new C1212u(null, c0157s, t5, null)), 2), new W(c1180d0, null), null));
            V v5 = new V(p1Var);
            this.f11876A = 1;
            if (interfaceC0146gC.d(v5, this) == enumC1481a) {
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
