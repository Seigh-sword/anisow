package o0;

import s4.C1316l;
import v4.InterfaceC1427e;
import w4.EnumC1481a;

/* JADX INFO: renamed from: o0.l, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1195l extends x4.h implements C4.p {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public int f11995A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public /* synthetic */ Object f11996B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public final /* synthetic */ M4.b0 f11997C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public final /* synthetic */ C4.p f11998D;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1195l(M4.b0 b0Var, C4.p pVar, InterfaceC1427e interfaceC1427e) {
        super(2, interfaceC1427e);
        this.f11997C = b0Var;
        this.f11998D = pVar;
    }

    @Override // C4.p
    public final Object h(Object obj, Object obj2) {
        return ((C1195l) l((p1) obj, (InterfaceC1427e) obj2)).n(C1316l.f12640a);
    }

    @Override // x4.AbstractC1492a
    public final InterfaceC1427e l(Object obj, InterfaceC1427e interfaceC1427e) {
        C1195l c1195l = new C1195l(this.f11997C, this.f11998D, interfaceC1427e);
        c1195l.f11996B = obj;
        return c1195l;
    }

    @Override // x4.AbstractC1492a
    public final Object n(Object obj) throws Throwable {
        EnumC1481a enumC1481a = EnumC1481a.f13592w;
        int i6 = this.f11995A;
        if (i6 == 0) {
            S3.a.O(obj);
            p1 p1Var = (p1) this.f11996B;
            ((M4.k0) this.f11997C).O(new W.Q(4, p1Var));
            this.f11995A = 1;
            if (this.f11998D.h(p1Var, this) == enumC1481a) {
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
