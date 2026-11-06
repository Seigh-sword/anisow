package d;

import java.util.ArrayList;
import java.util.Iterator;
import s4.AbstractC1305a;

/* JADX INFO: renamed from: d.u, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0640u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f8146a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f8147b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayList f8148c;

    public C0640u(ViewTreeObserverOnDrawListenerC0633n viewTreeObserverOnDrawListenerC0633n, C0636q c0636q) {
        AbstractC1305a.o(viewTreeObserverOnDrawListenerC0633n, "executor");
        this.f8146a = new Object();
        this.f8148c = new ArrayList();
    }

    public final void a() {
        synchronized (this.f8146a) {
            try {
                this.f8147b = true;
                Iterator it = this.f8148c.iterator();
                while (it.hasNext()) {
                    ((C4.a) it.next()).b();
                }
                this.f8148c.clear();
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
