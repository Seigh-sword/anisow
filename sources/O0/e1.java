package o0;

import android.util.Log;
import s4.AbstractC1305a;
import v4.InterfaceC1427e;

/* JADX INFO: loaded from: classes.dex */
public abstract class e1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c0.v f11923a = new c0.v();

    public abstract Integer a(f1 f1Var);

    public final void b() {
        if (this.f11923a.d() && Log.isLoggable("Paging", 3)) {
            String str = "Invalidated PagingSource " + this;
            AbstractC1305a.o(str, "message");
            Log.d("Paging", str, null);
        }
    }

    public abstract Object c(Z0 z02, InterfaceC1427e interfaceC1427e);
}
