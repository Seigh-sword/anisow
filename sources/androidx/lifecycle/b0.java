package androidx.lifecycle;

import java.util.Iterator;
import m0.C1001b;

/* JADX INFO: loaded from: classes.dex */
public abstract class b0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C1001b f5607a = new C1001b();

    public final void a(String str, AutoCloseable autoCloseable) {
        AutoCloseable autoCloseable2;
        C1001b c1001b = this.f5607a;
        if (c1001b != null) {
            if (c1001b.f10436d) {
                C1001b.a(autoCloseable);
                return;
            }
            synchronized (c1001b.f10433a) {
                autoCloseable2 = (AutoCloseable) c1001b.f10434b.put(str, autoCloseable);
            }
            C1001b.a(autoCloseable2);
        }
    }

    public final void b() {
        C1001b c1001b = this.f5607a;
        if (c1001b != null && !c1001b.f10436d) {
            c1001b.f10436d = true;
            synchronized (c1001b.f10433a) {
                try {
                    Iterator it = c1001b.f10434b.values().iterator();
                    while (it.hasNext()) {
                        C1001b.a((AutoCloseable) it.next());
                    }
                    Iterator it2 = c1001b.f10435c.iterator();
                    while (it2.hasNext()) {
                        C1001b.a((AutoCloseable) it2.next());
                    }
                    c1001b.f10435c.clear();
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        d();
    }

    public final AutoCloseable c(String str) {
        AutoCloseable autoCloseable;
        C1001b c1001b = this.f5607a;
        if (c1001b == null) {
            return null;
        }
        synchronized (c1001b.f10433a) {
            autoCloseable = (AutoCloseable) c1001b.f10434b.get(str);
        }
        return autoCloseable;
    }

    public void d() {
    }
}
