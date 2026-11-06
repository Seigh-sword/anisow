package W;

import java.util.List;
import s4.C1316l;
import v4.InterfaceC1427e;
import w4.EnumC1481a;

/* JADX INFO: renamed from: W.e, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0186e extends x4.h implements C4.p {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public int f4101A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public /* synthetic */ Object f4102B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public final /* synthetic */ List f4103C;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0186e(List list, InterfaceC1427e interfaceC1427e) {
        super(2, interfaceC1427e);
        this.f4103C = list;
    }

    @Override // C4.p
    public final Object h(Object obj, Object obj2) {
        return ((C0186e) l((C0194m) obj, (InterfaceC1427e) obj2)).n(C1316l.f12640a);
    }

    @Override // x4.AbstractC1492a
    public final InterfaceC1427e l(Object obj, InterfaceC1427e interfaceC1427e) {
        C0186e c0186e = new C0186e(this.f4103C, interfaceC1427e);
        c0186e.f4102B = obj;
        return c0186e;
    }

    @Override // x4.AbstractC1492a
    public final Object n(Object obj) throws Throwable {
        EnumC1481a enumC1481a = EnumC1481a.f13592w;
        int i6 = this.f4101A;
        if (i6 == 0) {
            S3.a.O(obj);
            C0194m c0194m = (C0194m) this.f4102B;
            m0 m0Var = AbstractC0190i.f4129a;
            this.f4101A = 1;
            if (m0.a(m0Var, this.f4103C, c0194m, this) == enumC1481a) {
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
