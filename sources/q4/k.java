package Q4;

import M4.InterfaceC0080z;
import P4.InterfaceC0147h;
import s4.C1316l;
import v4.InterfaceC1427e;
import w4.EnumC1481a;

/* JADX INFO: loaded from: classes.dex */
public final class k extends x4.h implements C4.p {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public int f2850A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public final /* synthetic */ o f2851B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0147h f2852C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public final /* synthetic */ Object f2853D;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(o oVar, InterfaceC0147h interfaceC0147h, Object obj, InterfaceC1427e interfaceC1427e) {
        super(2, interfaceC1427e);
        this.f2851B = oVar;
        this.f2852C = interfaceC0147h;
        this.f2853D = obj;
    }

    @Override // C4.p
    public final Object h(Object obj, Object obj2) {
        return ((k) l((InterfaceC0080z) obj, (InterfaceC1427e) obj2)).n(C1316l.f12640a);
    }

    @Override // x4.AbstractC1492a
    public final InterfaceC1427e l(Object obj, InterfaceC1427e interfaceC1427e) {
        return new k(this.f2851B, this.f2852C, this.f2853D, interfaceC1427e);
    }

    @Override // x4.AbstractC1492a
    public final Object n(Object obj) throws Throwable {
        EnumC1481a enumC1481a = EnumC1481a.f13592w;
        int i6 = this.f2850A;
        if (i6 == 0) {
            S3.a.O(obj);
            C4.q qVar = this.f2851B.f2867A;
            this.f2850A = 1;
            if (qVar.g(this.f2852C, this.f2853D, this) == enumC1481a) {
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
