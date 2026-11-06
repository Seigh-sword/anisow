package c1;

import o0.K0;
import s4.AbstractC1305a;
import s4.C1316l;
import v4.InterfaceC1427e;
import w4.EnumC1481a;

/* JADX INFO: loaded from: classes.dex */
public final class p extends x4.h implements C4.p {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public int f6217A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public /* synthetic */ Object f6218B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public final /* synthetic */ t f6219C;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(t tVar, InterfaceC1427e interfaceC1427e) {
        super(2, interfaceC1427e);
        this.f6219C = tVar;
    }

    @Override // C4.p
    public final Object h(Object obj, Object obj2) {
        return ((p) l((K0) obj, (InterfaceC1427e) obj2)).n(C1316l.f12640a);
    }

    @Override // x4.AbstractC1492a
    public final InterfaceC1427e l(Object obj, InterfaceC1427e interfaceC1427e) {
        p pVar = new p(this.f6219C, interfaceC1427e);
        pVar.f6218B = obj;
        return pVar;
    }

    @Override // x4.AbstractC1492a
    public final Object n(Object obj) throws Throwable {
        EnumC1481a enumC1481a = EnumC1481a.f13592w;
        int i6 = this.f6217A;
        if (i6 == 0) {
            S3.a.O(obj);
            K0 k02 = (K0) this.f6218B;
            X0.e eVar = this.f6219C.E0;
            if (eVar == null) {
                AbstractC1305a.W("postsAdapter");
                throw null;
            }
            this.f6217A = 1;
            if (eVar.g(k02, this) == enumC1481a) {
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
