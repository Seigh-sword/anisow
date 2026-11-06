package W0;

import C4.p;
import com.android.app.activities.CategoryActivity;
import o0.K0;
import s4.AbstractC1305a;
import s4.C1316l;
import v4.InterfaceC1427e;
import w4.EnumC1481a;

/* JADX INFO: loaded from: classes.dex */
public final class e extends x4.h implements p {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public int f4196A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public /* synthetic */ Object f4197B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public final /* synthetic */ CategoryActivity f4198C;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(CategoryActivity categoryActivity, InterfaceC1427e interfaceC1427e) {
        super(2, interfaceC1427e);
        this.f4198C = categoryActivity;
    }

    @Override // C4.p
    public final Object h(Object obj, Object obj2) {
        return ((e) l((K0) obj, (InterfaceC1427e) obj2)).n(C1316l.f12640a);
    }

    @Override // x4.AbstractC1492a
    public final InterfaceC1427e l(Object obj, InterfaceC1427e interfaceC1427e) {
        e eVar = new e(this.f4198C, interfaceC1427e);
        eVar.f4197B = obj;
        return eVar;
    }

    @Override // x4.AbstractC1492a
    public final Object n(Object obj) throws Throwable {
        EnumC1481a enumC1481a = EnumC1481a.f13592w;
        int i6 = this.f4196A;
        if (i6 == 0) {
            S3.a.O(obj);
            K0 k02 = (K0) this.f4197B;
            X0.e eVar = this.f4198C.f6269f0;
            if (eVar == null) {
                AbstractC1305a.W("postsAdapter");
                throw null;
            }
            this.f4196A = 1;
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
