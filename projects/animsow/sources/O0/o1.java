package o0;

import P4.InterfaceC0147h;
import s4.C1316l;
import v4.InterfaceC1427e;
import w4.EnumC1481a;

/* JADX INFO: loaded from: classes.dex */
public final class o1 extends x4.h implements C4.p {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public int f12050A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public /* synthetic */ Object f12051B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public final /* synthetic */ C4.p f12052C;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o1(C4.p pVar, InterfaceC1427e interfaceC1427e) {
        super(2, interfaceC1427e);
        this.f12052C = pVar;
    }

    @Override // C4.p
    public final Object h(Object obj, Object obj2) {
        return ((o1) l((InterfaceC0147h) obj, (InterfaceC1427e) obj2)).n(C1316l.f12640a);
    }

    @Override // x4.AbstractC1492a
    public final InterfaceC1427e l(Object obj, InterfaceC1427e interfaceC1427e) {
        o1 o1Var = new o1(this.f12052C, interfaceC1427e);
        o1Var.f12051B = obj;
        return o1Var;
    }

    @Override // x4.AbstractC1492a
    public final Object n(Object obj) throws Throwable {
        EnumC1481a enumC1481a = EnumC1481a.f13592w;
        int i6 = this.f12050A;
        if (i6 == 0) {
            S3.a.O(obj);
            n1 n1Var = new n1((InterfaceC0147h) this.f12051B, this.f12052C, null);
            this.f12050A = 1;
            if (S3.a.l(n1Var, this) == enumC1481a) {
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
