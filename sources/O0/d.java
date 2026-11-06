package O0;

import I0.o;
import R0.i;
import android.os.Build;

/* JADX INFO: loaded from: classes.dex */
public final class d extends c {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final String f2312e = o.y("NetworkMeteredCtrlr");

    @Override // O0.c
    public final boolean a(i iVar) {
        return iVar.f2909j.f1086a == 5;
    }

    @Override // O0.c
    public final boolean b(Object obj) {
        N0.a aVar = (N0.a) obj;
        boolean z5 = true;
        if (Build.VERSION.SDK_INT < 26) {
            o.w().u(f2312e, "Metered network constraint is not supported before API 26, only checking for connected state.", new Throwable[0]);
            return !aVar.f2068a;
        }
        if (aVar.f2068a && aVar.f2070c) {
            z5 = false;
        }
        return z5;
    }
}
