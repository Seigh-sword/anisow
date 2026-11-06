package Z0;

import M4.InterfaceC0080z;
import m2.C0;
import s4.C1316l;
import t0.AbstractC1332d;
import v4.InterfaceC1427e;
import w4.EnumC1481a;

/* JADX INFO: loaded from: classes.dex */
public final class k extends x4.h implements C4.p {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public int f4940A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public final /* synthetic */ p f4941B;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(p pVar, InterfaceC1427e interfaceC1427e) {
        super(2, interfaceC1427e);
        this.f4941B = pVar;
    }

    @Override // C4.p
    public final Object h(Object obj, Object obj2) {
        return ((k) l((InterfaceC0080z) obj, (InterfaceC1427e) obj2)).n(C1316l.f12640a);
    }

    @Override // x4.AbstractC1492a
    public final InterfaceC1427e l(Object obj, InterfaceC1427e interfaceC1427e) {
        return new k(this.f4941B, interfaceC1427e);
    }

    @Override // x4.AbstractC1492a
    public final Object n(Object obj) throws Throwable {
        boolean zBooleanValue;
        EnumC1481a enumC1481a = EnumC1481a.f13592w;
        int i6 = this.f4940A;
        try {
            if (i6 == 0) {
                S3.a.O(obj);
                e eVar = this.f4941B.f4953b;
                this.f4940A = 1;
                obj = eVar.a("MY_LIST_RELOAD", this);
                if (obj == enumC1481a) {
                    return enumC1481a;
                }
            } else {
                if (i6 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                S3.a.O(obj);
            }
            zBooleanValue = ((Boolean) obj).booleanValue();
        } catch (Exception e6) {
            C0.h().a(e6);
            AbstractC1332d.X("isMyListReload ## " + e6.getMessage());
            zBooleanValue = false;
        }
        return Boolean.valueOf(zBooleanValue);
    }
}
