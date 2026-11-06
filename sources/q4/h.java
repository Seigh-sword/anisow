package Q4;

import P4.InterfaceC0147h;
import s4.C1316l;
import v4.InterfaceC1427e;
import w4.EnumC1481a;

/* JADX INFO: loaded from: classes.dex */
public final class h extends x4.h implements C4.p {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public int f2846A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public /* synthetic */ Object f2847B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public final /* synthetic */ i f2848C;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(i iVar, InterfaceC1427e interfaceC1427e) {
        super(2, interfaceC1427e);
        this.f2848C = iVar;
    }

    @Override // C4.p
    public final Object h(Object obj, Object obj2) {
        return ((h) l((InterfaceC0147h) obj, (InterfaceC1427e) obj2)).n(C1316l.f12640a);
    }

    @Override // x4.AbstractC1492a
    public final InterfaceC1427e l(Object obj, InterfaceC1427e interfaceC1427e) {
        h hVar = new h(this.f2848C, interfaceC1427e);
        hVar.f2847B = obj;
        return hVar;
    }

    @Override // x4.AbstractC1492a
    public final Object n(Object obj) throws Throwable {
        EnumC1481a enumC1481a = EnumC1481a.f13592w;
        int i6 = this.f2846A;
        if (i6 == 0) {
            S3.a.O(obj);
            InterfaceC0147h interfaceC0147h = (InterfaceC0147h) this.f2847B;
            this.f2846A = 1;
            if (this.f2848C.j(interfaceC0147h, this) == enumC1481a) {
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
