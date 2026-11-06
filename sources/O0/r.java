package o0;

import P4.InterfaceC0146g;
import P4.InterfaceC0147h;
import s4.C1316l;
import v4.InterfaceC1427e;
import w4.EnumC1481a;

/* JADX INFO: loaded from: classes.dex */
public final class r extends x4.h implements C4.p {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public int f12068A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public /* synthetic */ Object f12069B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0146g f12070C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public final /* synthetic */ C4.q f12071D;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(InterfaceC0146g interfaceC0146g, C4.q qVar, InterfaceC1427e interfaceC1427e) {
        super(2, interfaceC1427e);
        this.f12070C = interfaceC0146g;
        this.f12071D = qVar;
    }

    @Override // C4.p
    public final Object h(Object obj, Object obj2) {
        return ((r) l((InterfaceC0147h) obj, (InterfaceC1427e) obj2)).n(C1316l.f12640a);
    }

    @Override // x4.AbstractC1492a
    public final InterfaceC1427e l(Object obj, InterfaceC1427e interfaceC1427e) {
        r rVar = new r(this.f12070C, this.f12071D, interfaceC1427e);
        rVar.f12069B = obj;
        return rVar;
    }

    @Override // x4.AbstractC1492a
    public final Object n(Object obj) throws Throwable {
        EnumC1481a enumC1481a = EnumC1481a.f13592w;
        int i6 = this.f12068A;
        if (i6 == 0) {
            S3.a.O(obj);
            InterfaceC0147h interfaceC0147h = (InterfaceC0147h) this.f12069B;
            D4.r rVar = new D4.r();
            rVar.f377w = AbstractC1218x.f12151a;
            C1205q c1205q = new C1205q(rVar, this.f12071D, interfaceC0147h);
            this.f12068A = 1;
            if (this.f12070C.d(c1205q, this) == enumC1481a) {
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
