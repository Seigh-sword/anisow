package Z0;

import M4.InterfaceC0080z;
import java.util.List;
import m2.C0;
import s4.C1316l;
import t0.AbstractC1332d;
import v4.InterfaceC1427e;

/* JADX INFO: loaded from: classes.dex */
public final class l extends x4.h implements C4.p {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public final /* synthetic */ p f4942A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public final /* synthetic */ int f4943B;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(p pVar, int i6, InterfaceC1427e interfaceC1427e) {
        super(2, interfaceC1427e);
        this.f4942A = pVar;
        this.f4943B = i6;
    }

    @Override // C4.p
    public final Object h(Object obj, Object obj2) {
        return ((l) l((InterfaceC0080z) obj, (InterfaceC1427e) obj2)).n(C1316l.f12640a);
    }

    @Override // x4.AbstractC1492a
    public final InterfaceC1427e l(Object obj, InterfaceC1427e interfaceC1427e) {
        return new l(this.f4942A, this.f4943B, interfaceC1427e);
    }

    @Override // x4.AbstractC1492a
    public final Object n(Object obj) throws Throwable {
        boolean z5;
        p pVar = this.f4942A;
        S3.a.O(obj);
        try {
            List listE = pVar.e();
            listE.remove(new Integer(this.f4943B));
            S3.a.J(new n(pVar, t4.n.k0(listE), null));
            z5 = true;
        } catch (Exception e6) {
            C0.h().a(e6);
            AbstractC1332d.X("removeFromMyList ## " + e6.getMessage());
            z5 = false;
        }
        return Boolean.valueOf(z5);
    }
}
