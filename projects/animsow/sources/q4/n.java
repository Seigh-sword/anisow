package Q4;

import M4.InterfaceC0080z;
import P4.InterfaceC0146g;
import P4.InterfaceC0147h;
import s4.C1316l;
import v4.InterfaceC1427e;
import w4.EnumC1481a;

/* JADX INFO: loaded from: classes.dex */
public final class n extends x4.h implements C4.p {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public int f2863A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public /* synthetic */ Object f2864B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public final /* synthetic */ o f2865C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0147h f2866D;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(o oVar, InterfaceC0147h interfaceC0147h, InterfaceC1427e interfaceC1427e) {
        super(2, interfaceC1427e);
        this.f2865C = oVar;
        this.f2866D = interfaceC0147h;
    }

    @Override // C4.p
    public final Object h(Object obj, Object obj2) {
        return ((n) l((InterfaceC0080z) obj, (InterfaceC1427e) obj2)).n(C1316l.f12640a);
    }

    @Override // x4.AbstractC1492a
    public final InterfaceC1427e l(Object obj, InterfaceC1427e interfaceC1427e) {
        n nVar = new n(this.f2865C, this.f2866D, interfaceC1427e);
        nVar.f2864B = obj;
        return nVar;
    }

    @Override // x4.AbstractC1492a
    public final Object n(Object obj) throws Throwable {
        EnumC1481a enumC1481a = EnumC1481a.f13592w;
        int i6 = this.f2863A;
        if (i6 == 0) {
            S3.a.O(obj);
            InterfaceC0080z interfaceC0080z = (InterfaceC0080z) this.f2864B;
            D4.r rVar = new D4.r();
            o oVar = this.f2865C;
            InterfaceC0146g interfaceC0146g = oVar.f2849z;
            m mVar = new m(rVar, interfaceC0080z, oVar, this.f2866D);
            this.f2863A = 1;
            if (interfaceC0146g.d(mVar, this) == enumC1481a) {
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
