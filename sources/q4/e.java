package Q4;

import M4.InterfaceC0080z;
import P4.InterfaceC0147h;
import s4.C1316l;
import v4.InterfaceC1427e;
import w4.EnumC1481a;

/* JADX INFO: loaded from: classes.dex */
public final class e extends x4.h implements C4.p {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public int f2836A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public /* synthetic */ Object f2837B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0147h f2838C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public final /* synthetic */ g f2839D;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(InterfaceC1427e interfaceC1427e, InterfaceC0147h interfaceC0147h, g gVar) {
        super(2, interfaceC1427e);
        this.f2838C = interfaceC0147h;
        this.f2839D = gVar;
    }

    @Override // C4.p
    public final Object h(Object obj, Object obj2) {
        return ((e) l((InterfaceC0080z) obj, (InterfaceC1427e) obj2)).n(C1316l.f12640a);
    }

    @Override // x4.AbstractC1492a
    public final InterfaceC1427e l(Object obj, InterfaceC1427e interfaceC1427e) {
        e eVar = new e(interfaceC1427e, this.f2838C, this.f2839D);
        eVar.f2837B = obj;
        return eVar;
    }

    @Override // x4.AbstractC1492a
    public final Object n(Object obj) throws Throwable {
        EnumC1481a enumC1481a = EnumC1481a.f13592w;
        int i6 = this.f2836A;
        C1316l c1316l = C1316l.f12640a;
        if (i6 == 0) {
            S3.a.O(obj);
            O4.q qVarI = this.f2839D.i((InterfaceC0080z) this.f2837B);
            this.f2836A = 1;
            Object objN = S3.a.n(this.f2838C, qVarI, true, this);
            if (objN != enumC1481a) {
                objN = c1316l;
            }
            if (objN == enumC1481a) {
                return enumC1481a;
            }
        } else {
            if (i6 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            S3.a.O(obj);
        }
        return c1316l;
    }
}
