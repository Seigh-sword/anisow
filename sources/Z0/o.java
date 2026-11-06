package Z0;

import M4.InterfaceC0080z;
import a0.C0256d;
import m2.C0;
import s4.C1316l;
import t0.AbstractC1332d;
import v4.InterfaceC1427e;
import w4.EnumC1481a;

/* JADX INFO: loaded from: classes.dex */
public final class o extends x4.h implements C4.p {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public int f4950A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public final /* synthetic */ p f4951B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public final /* synthetic */ boolean f4952C;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(p pVar, boolean z5, InterfaceC1427e interfaceC1427e) {
        super(2, interfaceC1427e);
        this.f4951B = pVar;
        this.f4952C = z5;
    }

    @Override // C4.p
    public final Object h(Object obj, Object obj2) {
        return ((o) l((InterfaceC0080z) obj, (InterfaceC1427e) obj2)).n(C1316l.f12640a);
    }

    @Override // x4.AbstractC1492a
    public final InterfaceC1427e l(Object obj, InterfaceC1427e interfaceC1427e) {
        return new o(this.f4951B, this.f4952C, interfaceC1427e);
    }

    @Override // x4.AbstractC1492a
    public final Object n(Object obj) throws Throwable {
        EnumC1481a enumC1481a = EnumC1481a.f13592w;
        int i6 = this.f4950A;
        C1316l c1316l = C1316l.f12640a;
        try {
            if (i6 == 0) {
                S3.a.O(obj);
                e eVar = this.f4951B.f4953b;
                boolean z5 = this.f4952C;
                this.f4950A = 1;
                eVar.getClass();
                Object objA = ((C0256d) f.a(eVar.f4927a)).a(new a0.i(new c(new a0.f("MY_LIST_RELOAD"), z5, null), null), this);
                if (objA != enumC1481a) {
                    objA = c1316l;
                }
                if (objA == enumC1481a) {
                    return enumC1481a;
                }
            } else {
                if (i6 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                S3.a.O(obj);
            }
        } catch (Exception e6) {
            C0.h().a(e6);
            AbstractC1332d.X("setMyListReload ## " + e6.getMessage());
        }
        return c1316l;
    }
}
