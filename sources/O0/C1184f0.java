package o0;

import P4.C0149j;
import P4.InterfaceC0146g;
import P4.InterfaceC0147h;
import d.AbstractC0628i;
import i.C0803c;
import s4.AbstractC1305a;
import s4.C1316l;
import v4.InterfaceC1427e;
import w4.EnumC1481a;

/* JADX INFO: renamed from: o0.f0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1184f0 extends x4.h implements C4.q {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public int f11926A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public /* synthetic */ InterfaceC0147h f11927B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public /* synthetic */ Object f11928C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public final /* synthetic */ A0 f11929D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public final /* synthetic */ I f11930E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public T4.d f11931F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public int f11932G;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1184f0(InterfaceC1427e interfaceC1427e, A0 a02, I i6) {
        super(3, interfaceC1427e);
        this.f11929D = a02;
        this.f11930E = i6;
    }

    @Override // C4.q
    public final Object g(Object obj, Object obj2, Object obj3) {
        C1184f0 c1184f0 = new C1184f0((InterfaceC1427e) obj3, this.f11929D, this.f11930E);
        c1184f0.f11927B = (InterfaceC0147h) obj;
        c1184f0.f11928C = obj2;
        return c1184f0.n(C1316l.f12640a);
    }

    @Override // x4.AbstractC1492a
    public final Object n(Object obj) throws Throwable {
        InterfaceC0147h interfaceC0147h;
        int iIntValue;
        B0 b02;
        T4.d dVar;
        InterfaceC0146g c1192j0;
        I i6 = this.f11930E;
        EnumC1481a enumC1481a = EnumC1481a.f13592w;
        int i7 = this.f11926A;
        C1316l c1316l = C1316l.f12640a;
        A0 a02 = this.f11929D;
        try {
            if (i7 == 0) {
                S3.a.O(obj);
                interfaceC0147h = this.f11927B;
                iIntValue = ((Number) this.f11928C).intValue();
                b02 = a02.f11729i;
                dVar = b02.f11736a;
                this.f11927B = interfaceC0147h;
                this.f11928C = b02;
                this.f11931F = dVar;
                this.f11932G = iIntValue;
                this.f11926A = 1;
                if (dVar.d(this) == enumC1481a) {
                    return enumC1481a;
                }
            } else {
                if (i7 != 1) {
                    if (i7 == 2) {
                        S3.a.O(obj);
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                iIntValue = this.f11932G;
                dVar = this.f11931F;
                b02 = (B0) this.f11928C;
                interfaceC0147h = this.f11927B;
                S3.a.O(obj);
            }
            C0803c c0803c = b02.f11737b.f11760l;
            if (AbstractC1305a.c(c0803c.q(i6), F.f11747b)) {
                c1192j0 = new C0149j(new C1220y[0]);
            } else {
                if (!(c0803c.q(i6) instanceof C1168D)) {
                    c0803c.P(i6, F.f11748c);
                }
                dVar.f(null);
                P4.c0 c0VarD = a02.f11726f.D(i6);
                int i8 = iIntValue == 0 ? 0 : 1;
                if (i8 < 0) {
                    throw new IllegalArgumentException(AbstractC0628i.f("Drop count should be non-negative, but had ", i8).toString());
                }
                c1192j0 = new C1192j0(new C1192j0(c0VarD, i8, 1), iIntValue, 0);
            }
            this.f11927B = null;
            this.f11928C = null;
            this.f11931F = null;
            this.f11926A = 2;
            if (interfaceC0147h instanceof P4.s0) {
                throw ((P4.s0) interfaceC0147h).f2752w;
            }
            Object objD = c1192j0.d(interfaceC0147h, this);
            if (objD != enumC1481a) {
                objD = c1316l;
            }
            return objD == enumC1481a ? enumC1481a : c1316l;
        } finally {
            dVar.f(null);
        }
    }
}
