package N3;

import P4.InterfaceC0147h;
import a0.C0254b;
import android.util.Log;
import s4.C1316l;
import v4.InterfaceC1427e;
import w4.EnumC1481a;

/* JADX INFO: loaded from: classes.dex */
public final class B extends x4.h implements C4.q {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public int f2119A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public /* synthetic */ InterfaceC0147h f2120B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public /* synthetic */ Throwable f2121C;

    @Override // C4.q
    public final Object g(Object obj, Object obj2, Object obj3) {
        B b6 = new B(3, (InterfaceC1427e) obj3);
        b6.f2120B = (InterfaceC0147h) obj;
        b6.f2121C = (Throwable) obj2;
        return b6.n(C1316l.f12640a);
    }

    @Override // x4.AbstractC1492a
    public final Object n(Object obj) throws Throwable {
        EnumC1481a enumC1481a = EnumC1481a.f13592w;
        int i6 = this.f2119A;
        boolean z5 = true;
        if (i6 == 0) {
            S3.a.O(obj);
            InterfaceC0147h interfaceC0147h = this.f2120B;
            Log.e("FirebaseSessionsRepo", "Error reading stored session data.", this.f2121C);
            C0254b c0254b = new C0254b(z5);
            this.f2120B = null;
            this.f2119A = 1;
            if (interfaceC0147h.k(c0254b, this) == enumC1481a) {
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
