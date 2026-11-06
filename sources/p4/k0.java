package P4;

import h0.C0733A;
import o0.C1188h0;
import s4.C1316l;
import v4.InterfaceC1427e;
import w4.EnumC1481a;

/* JADX INFO: loaded from: classes.dex */
public final class k0 extends x4.h implements C4.p {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public int f2705A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public /* synthetic */ Object f2706B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public final /* synthetic */ o0 f2707C;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k0(o0 o0Var, InterfaceC1427e interfaceC1427e) {
        super(2, interfaceC1427e);
        this.f2707C = o0Var;
    }

    @Override // C4.p
    public final Object h(Object obj, Object obj2) throws Throwable {
        ((k0) l((InterfaceC0147h) obj, (InterfaceC1427e) obj2)).n(C1316l.f12640a);
        return EnumC1481a.f13592w;
    }

    @Override // x4.AbstractC1492a
    public final InterfaceC1427e l(Object obj, InterfaceC1427e interfaceC1427e) {
        k0 k0Var = new k0(this.f2707C, interfaceC1427e);
        k0Var.f2706B = obj;
        return k0Var;
    }

    @Override // x4.AbstractC1492a
    public final Object n(Object obj) throws Throwable {
        EnumC1481a enumC1481a = EnumC1481a.f13592w;
        int i6 = this.f2705A;
        if (i6 == 0) {
            S3.a.O(obj);
            C1188h0 c1188h0 = new C1188h0(new D4.o(), 4, (InterfaceC0147h) this.f2706B);
            this.f2705A = 1;
            if (this.f2707C.d(c1188h0, this) == enumC1481a) {
                return enumC1481a;
            }
        } else {
            if (i6 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            S3.a.O(obj);
        }
        throw new C0733A();
    }
}
