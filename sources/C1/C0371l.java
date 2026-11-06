package c1;

import o0.K0;
import s4.AbstractC1305a;
import s4.C1316l;
import v4.InterfaceC1427e;
import w4.EnumC1481a;

/* JADX INFO: renamed from: c1.l, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0371l extends x4.h implements C4.p {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public int f6206A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public /* synthetic */ Object f6207B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public final /* synthetic */ C0373n f6208C;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0371l(C0373n c0373n, InterfaceC1427e interfaceC1427e) {
        super(2, interfaceC1427e);
        this.f6208C = c0373n;
    }

    @Override // C4.p
    public final Object h(Object obj, Object obj2) {
        return ((C0371l) l((K0) obj, (InterfaceC1427e) obj2)).n(C1316l.f12640a);
    }

    @Override // x4.AbstractC1492a
    public final InterfaceC1427e l(Object obj, InterfaceC1427e interfaceC1427e) {
        C0371l c0371l = new C0371l(this.f6208C, interfaceC1427e);
        c0371l.f6207B = obj;
        return c0371l;
    }

    @Override // x4.AbstractC1492a
    public final Object n(Object obj) throws Throwable {
        EnumC1481a enumC1481a = EnumC1481a.f13592w;
        int i6 = this.f6206A;
        if (i6 == 0) {
            S3.a.O(obj);
            K0 k02 = (K0) this.f6207B;
            X0.e eVar = this.f6208C.f6214D0;
            if (eVar == null) {
                AbstractC1305a.W("postsAdapter");
                throw null;
            }
            this.f6206A = 1;
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
