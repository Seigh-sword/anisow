package o0;

import P4.InterfaceC0147h;
import s4.C1316l;
import v4.InterfaceC1427e;
import w4.EnumC1481a;

/* JADX INFO: loaded from: classes.dex */
public final class S extends x4.h implements C4.p {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public int f11833A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public /* synthetic */ Object f11834B;

    @Override // C4.p
    public final Object h(Object obj, Object obj2) {
        return ((S) l((InterfaceC0147h) obj, (InterfaceC1427e) obj2)).n(C1316l.f12640a);
    }

    @Override // x4.AbstractC1492a
    public final InterfaceC1427e l(Object obj, InterfaceC1427e interfaceC1427e) {
        S s5 = new S(2, interfaceC1427e);
        s5.f11834B = obj;
        return s5;
    }

    @Override // x4.AbstractC1492a
    public final Object n(Object obj) throws Throwable {
        InterfaceC0147h interfaceC0147h;
        j1 j1Var;
        EnumC1481a enumC1481a = EnumC1481a.f13592w;
        int i6 = this.f11833A;
        if (i6 == 0) {
            S3.a.O(obj);
            interfaceC0147h = (InterfaceC0147h) this.f11834B;
            j1Var = null;
        } else {
            if (i6 != 1) {
                if (i6 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                S3.a.O(obj);
                return C1316l.f12640a;
            }
            interfaceC0147h = (InterfaceC0147h) this.f11834B;
            S3.a.O(obj);
            j1Var = (j1) obj;
        }
        Boolean boolValueOf = Boolean.valueOf(j1Var == j1.f11971w);
        this.f11834B = null;
        this.f11833A = 2;
        if (interfaceC0147h.k(boolValueOf, this) == enumC1481a) {
            return enumC1481a;
        }
        return C1316l.f12640a;
    }
}
