package Z0;

import D4.s;
import M4.B;
import W.InterfaceC0191j;
import android.content.Context;

/* JADX INFO: loaded from: classes.dex */
public abstract class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ I4.f[] f4928a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Z.c f4929b;

    static {
        D4.l lVar = new D4.l(D4.a.f357w, f.class, "dataStore", "getDataStore(Landroid/content/Context;)Landroidx/datastore/core/DataStore;", 1);
        s.f378a.getClass();
        f4928a = new I4.f[]{lVar};
        f4929b = B.i("com.xo.anilab_data_store", null, 14);
    }

    public static final InterfaceC0191j a(Context context) {
        return f4929b.a(context, f4928a[0]);
    }
}
