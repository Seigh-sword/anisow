package Q4;

import s4.C1316l;
import v4.InterfaceC1427e;
import w4.EnumC1481a;

/* JADX INFO: loaded from: classes.dex */
public final class f extends x4.h implements C4.p {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public int f2840A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public /* synthetic */ Object f2841B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public final /* synthetic */ g f2842C;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(g gVar, InterfaceC1427e interfaceC1427e) {
        super(2, interfaceC1427e);
        this.f2842C = gVar;
    }

    @Override // C4.p
    public final Object h(Object obj, Object obj2) {
        return ((f) l((O4.p) obj, (InterfaceC1427e) obj2)).n(C1316l.f12640a);
    }

    @Override // x4.AbstractC1492a
    public final InterfaceC1427e l(Object obj, InterfaceC1427e interfaceC1427e) {
        f fVar = new f(this.f2842C, interfaceC1427e);
        fVar.f2841B = obj;
        return fVar;
    }

    @Override // x4.AbstractC1492a
    public final Object n(Object obj) throws Throwable {
        EnumC1481a enumC1481a = EnumC1481a.f13592w;
        int i6 = this.f2840A;
        if (i6 == 0) {
            S3.a.O(obj);
            O4.p pVar = (O4.p) this.f2841B;
            this.f2840A = 1;
            if (this.f2842C.f(pVar, this) == enumC1481a) {
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
