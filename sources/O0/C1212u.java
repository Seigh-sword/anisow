package o0;

import P4.InterfaceC0146g;
import P4.InterfaceC0147h;
import s4.C1316l;
import v4.InterfaceC1427e;
import w4.EnumC1481a;

/* JADX INFO: renamed from: o0.u, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1212u extends x4.h implements C4.p {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public D4.r f12115A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public int f12116B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public /* synthetic */ Object f12117C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public final /* synthetic */ Object f12118D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0146g f12119E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public final /* synthetic */ C4.q f12120F;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1212u(Object obj, InterfaceC0146g interfaceC0146g, C4.q qVar, InterfaceC1427e interfaceC1427e) {
        super(2, interfaceC1427e);
        this.f12118D = obj;
        this.f12119E = interfaceC0146g;
        this.f12120F = qVar;
    }

    @Override // C4.p
    public final Object h(Object obj, Object obj2) {
        return ((C1212u) l((InterfaceC0147h) obj, (InterfaceC1427e) obj2)).n(C1316l.f12640a);
    }

    @Override // x4.AbstractC1492a
    public final InterfaceC1427e l(Object obj, InterfaceC1427e interfaceC1427e) {
        C1212u c1212u = new C1212u(this.f12118D, this.f12119E, this.f12120F, interfaceC1427e);
        c1212u.f12117C = obj;
        return c1212u;
    }

    @Override // x4.AbstractC1492a
    public final Object n(Object obj) throws Throwable {
        D4.r rVar;
        InterfaceC0147h interfaceC0147h;
        EnumC1481a enumC1481a = EnumC1481a.f13592w;
        int i6 = this.f12116B;
        if (i6 == 0) {
            S3.a.O(obj);
            InterfaceC0147h interfaceC0147h2 = (InterfaceC0147h) this.f12117C;
            rVar = new D4.r();
            Object obj2 = this.f12118D;
            rVar.f377w = obj2;
            this.f12117C = interfaceC0147h2;
            this.f12115A = rVar;
            this.f12116B = 1;
            if (interfaceC0147h2.k(obj2, this) == enumC1481a) {
                return enumC1481a;
            }
            interfaceC0147h = interfaceC0147h2;
        } else {
            if (i6 != 1) {
                if (i6 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                S3.a.O(obj);
                return C1316l.f12640a;
            }
            rVar = this.f12115A;
            interfaceC0147h = (InterfaceC0147h) this.f12117C;
            S3.a.O(obj);
        }
        C1210t c1210t = new C1210t(rVar, this.f12120F, interfaceC0147h);
        this.f12117C = null;
        this.f12115A = null;
        this.f12116B = 2;
        if (this.f12119E.d(c1210t, this) == enumC1481a) {
            return enumC1481a;
        }
        return C1316l.f12640a;
    }
}
