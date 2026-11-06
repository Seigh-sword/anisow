package o0;

import P4.InterfaceC0147h;
import X1.C0245m;
import s4.AbstractC1305a;
import s4.C1316l;
import v4.InterfaceC1427e;
import w4.EnumC1481a;

/* JADX INFO: loaded from: classes.dex */
public final class W extends x4.h implements C4.q {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public int f11871A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public /* synthetic */ InterfaceC0147h f11872B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public /* synthetic */ Object f11873C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public final /* synthetic */ C1180d0 f11874D;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public W(C1180d0 c1180d0, InterfaceC1427e interfaceC1427e) {
        super(3, interfaceC1427e);
        this.f11874D = c1180d0;
    }

    @Override // C4.q
    public final Object g(Object obj, Object obj2, Object obj3) {
        W w5 = new W(this.f11874D, (InterfaceC1427e) obj3);
        w5.f11872B = (InterfaceC0147h) obj;
        w5.f11873C = obj2;
        return w5.n(C1316l.f12640a);
    }

    @Override // x4.AbstractC1492a
    public final Object n(Object obj) throws Throwable {
        EnumC1481a enumC1481a = EnumC1481a.f13592w;
        int i6 = this.f11871A;
        if (i6 == 0) {
            S3.a.O(obj);
            InterfaceC0147h interfaceC0147h = this.f11872B;
            P p5 = (P) this.f11873C;
            A0 a02 = p5.f11821a;
            C1180d0 c1180d0 = this.f11874D;
            c1180d0.getClass();
            P4.A a6 = new P4.A(a02.f11731k, new U(2, null), 2);
            AbstractC1305a.o(c1180d0.f11912e, "retryEventBus");
            K0 k02 = new K0(a6, new C0245m(), new Q(p5.f11821a));
            this.f11871A = 1;
            if (interfaceC0147h.k(k02, this) == enumC1481a) {
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
