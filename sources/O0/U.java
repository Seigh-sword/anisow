package o0;

import android.util.Log;
import s4.AbstractC1305a;
import s4.C1316l;
import v4.InterfaceC1427e;

/* JADX INFO: loaded from: classes.dex */
public final class U extends x4.h implements C4.p {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public /* synthetic */ Object f11846A;

    @Override // C4.p
    public final Object h(Object obj, Object obj2) throws Throwable {
        U u5 = (U) l((O) obj, (InterfaceC1427e) obj2);
        C1316l c1316l = C1316l.f12640a;
        u5.n(c1316l);
        return c1316l;
    }

    @Override // x4.AbstractC1492a
    public final InterfaceC1427e l(Object obj, InterfaceC1427e interfaceC1427e) {
        U u5 = new U(2, interfaceC1427e);
        u5.f11846A = obj;
        return u5;
    }

    @Override // x4.AbstractC1492a
    public final Object n(Object obj) throws Throwable {
        S3.a.O(obj);
        O o3 = (O) this.f11846A;
        if (Log.isLoggable("Paging", 2)) {
            String str = "Sent " + o3;
            AbstractC1305a.o(str, "message");
            Log.v("Paging", str, null);
        }
        return C1316l.f12640a;
    }
}
