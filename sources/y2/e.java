package Y2;

import W1.InterfaceC0208b;
import android.util.Log;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes.dex */
public final class e implements InterfaceC0208b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final AtomicReference f4811a = new AtomicReference();

    @Override // W1.InterfaceC0208b
    public final void a(boolean z5) {
        synchronized (g.f4814k) {
            try {
                for (g gVar : new ArrayList(g.f4815l.values())) {
                    if (gVar.f4820e.get()) {
                        Log.d("FirebaseApp", "Notifying background state change listeners.");
                        Iterator it = gVar.f4824i.iterator();
                        while (it.hasNext()) {
                            g gVar2 = ((d) it.next()).f4810a;
                            if (z5) {
                                gVar2.getClass();
                            } else {
                                ((B3.d) gVar2.f4823h.get()).b();
                            }
                        }
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
