package P3;

import android.util.Log;
import s4.C1316l;
import v4.InterfaceC1427e;

/* JADX INFO: loaded from: classes.dex */
public final class e extends x4.h implements C4.p {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public /* synthetic */ Object f2524A;

    @Override // C4.p
    public final Object h(Object obj, Object obj2) throws Throwable {
        e eVar = (e) l((String) obj, (InterfaceC1427e) obj2);
        C1316l c1316l = C1316l.f12640a;
        eVar.n(c1316l);
        return c1316l;
    }

    @Override // x4.AbstractC1492a
    public final InterfaceC1427e l(Object obj, InterfaceC1427e interfaceC1427e) {
        e eVar = new e(2, interfaceC1427e);
        eVar.f2524A = obj;
        return eVar;
    }

    @Override // x4.AbstractC1492a
    public final Object n(Object obj) throws Throwable {
        S3.a.O(obj);
        Log.e("SessionConfigFetcher", "Error failing to fetch the remote configs: " + ((String) this.f2524A));
        return C1316l.f12640a;
    }
}
