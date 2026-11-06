package J3;

import android.content.Intent;
import android.os.Binder;
import android.os.Process;
import android.util.Log;
import n.ExecutorC1138a;
import p1.C1243i;

/* JADX INFO: loaded from: classes.dex */
public final class I extends Binder {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ int f1367d = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final C1243i f1368c;

    public I(C1243i c1243i) {
        this.f1368c = c1243i;
    }

    public final void a(J j6) {
        if (Binder.getCallingUid() != Process.myUid()) {
            throw new SecurityException("Binding only allowed within app");
        }
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "service received new intent via bind strategy");
        }
        Intent intent = j6.f1369a;
        AbstractServiceC0052h abstractServiceC0052h = (AbstractServiceC0052h) this.f1368c.f12254x;
        int i6 = AbstractServiceC0052h.f1402B;
        abstractServiceC0052h.getClass();
        q2.j jVar = new q2.j();
        abstractServiceC0052h.f1404w.execute(new c0.n(abstractServiceC0052h, intent, jVar, 4));
        jVar.f12351a.h(new ExecutorC1138a(20), new G(1, j6));
    }
}
