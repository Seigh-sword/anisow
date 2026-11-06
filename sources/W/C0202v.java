package W;

import M4.r0;
import P4.C0156q;
import P4.C0157s;
import s4.C1316l;
import v4.InterfaceC1427e;
import w4.EnumC1481a;

/* JADX INFO: renamed from: W.v, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0202v extends x4.h implements C4.p {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public int f4176A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public /* synthetic */ Object f4177B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public final /* synthetic */ W f4178C;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0202v(W w5, InterfaceC1427e interfaceC1427e) {
        super(2, interfaceC1427e);
        this.f4178C = w5;
    }

    @Override // C4.p
    public final Object h(Object obj, Object obj2) {
        return ((C0202v) l((O4.p) obj, (InterfaceC1427e) obj2)).n(C1316l.f12640a);
    }

    @Override // x4.AbstractC1492a
    public final InterfaceC1427e l(Object obj, InterfaceC1427e interfaceC1427e) {
        C0202v c0202v = new C0202v(this.f4178C, interfaceC1427e);
        c0202v.f4177B = obj;
        return c0202v;
    }

    @Override // x4.AbstractC1492a
    public final Object n(Object obj) throws Throwable {
        EnumC1481a enumC1481a = EnumC1481a.f13592w;
        int i6 = this.f4176A;
        if (i6 == 0) {
            S3.a.O(obj);
            O4.p pVar = (O4.p) this.f4177B;
            M4.A a6 = M4.A.f1833x;
            W w5 = this.f4178C;
            r0 r0VarB = S3.a.B(pVar, null, a6, new C0201u(w5, null), 1);
            C0156q c0156q = new C0156q(new C0157s(new C0198q(r0VarB, null), w5.f4075e), new r(r0VarB, null));
            C0199s c0199s = new C0199s(0, pVar);
            this.f4176A = 1;
            if (c0156q.d(c0199s, this) == enumC1481a) {
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
