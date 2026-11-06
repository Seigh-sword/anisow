package T1;

import android.os.Bundle;
import android.util.Log;
import java.io.IOException;
import q2.InterfaceC1258a;
import q2.s;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class c implements InterfaceC1258a, q2.h {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final /* synthetic */ c f3415w = new c();

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final /* synthetic */ c f3416x = new c();

    @Override // q2.InterfaceC1258a
    public Object b(q2.i iVar) throws IOException {
        if (iVar.f()) {
            return (Bundle) iVar.d();
        }
        if (Log.isLoggable("Rpc", 3)) {
            Log.d("Rpc", "Error making request: ".concat(String.valueOf(iVar.c())));
        }
        throw new IOException("SERVICE_NOT_AVAILABLE", iVar.c());
    }

    @Override // q2.h
    public s l(Object obj) {
        Bundle bundle = (Bundle) obj;
        int i6 = b.f3405h;
        if (bundle != null && bundle.containsKey("google.messenger")) {
            bundle = null;
        }
        return f2.h.l(bundle);
    }
}
