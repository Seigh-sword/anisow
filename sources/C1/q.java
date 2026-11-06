package c1;

import M4.InterfaceC0080z;
import P4.InterfaceC0146g;
import androidx.lifecycle.V;
import d1.AbstractC0649a;
import g1.C0727m;
import m2.C0;
import o0.C1180d0;
import o0.I0;
import o0.J0;
import s4.AbstractC1305a;
import s4.C1316l;
import v4.InterfaceC1427e;
import w4.EnumC1481a;

/* JADX INFO: loaded from: classes.dex */
public final class q extends x4.h implements C4.p {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public int f6220A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public final /* synthetic */ t f6221B;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(t tVar, InterfaceC1427e interfaceC1427e) {
        super(2, interfaceC1427e);
        this.f6221B = tVar;
    }

    @Override // C4.p
    public final Object h(Object obj, Object obj2) {
        return ((q) l((InterfaceC0080z) obj, (InterfaceC1427e) obj2)).n(C1316l.f12640a);
    }

    @Override // x4.AbstractC1492a
    public final InterfaceC1427e l(Object obj, InterfaceC1427e interfaceC1427e) {
        return new q(this.f6221B, interfaceC1427e);
    }

    @Override // x4.AbstractC1492a
    public final Object n(Object obj) throws Throwable {
        t tVar = this.f6221B;
        EnumC1481a enumC1481a = EnumC1481a.f13592w;
        int i6 = this.f6220A;
        try {
            if (i6 == 0) {
                S3.a.O(obj);
                C0727m c0727m = (C0727m) tVar.f6230D0.getValue();
                String str = tVar.f6231F0;
                c0727m.getClass();
                AbstractC1305a.o(str, "query");
                J0 j02 = AbstractC0649a.f8163a;
                V v5 = new V(4, str);
                AbstractC1305a.o(j02, "config");
                InterfaceC0146g interfaceC0146g = new C1180d0(new I0(v5, null), null, j02).f11913f;
                p pVar = new p(tVar, null);
                this.f6220A = 1;
                if (AbstractC1305a.q(interfaceC0146g, pVar, this) == enumC1481a) {
                    return enumC1481a;
                }
            } else {
                if (i6 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                S3.a.O(obj);
            }
        } catch (Exception e6) {
            C0.h().a(e6);
        }
        return C1316l.f12640a;
    }
}
