package v0;

import java.util.Collections;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

/* JADX INFO: renamed from: v0.N, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1385N extends W {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final C1399h f13057d;

    public AbstractC1385N(X0.a aVar) {
        C1384M c1384m = new C1384M(this);
        C1390c c1390c = new C1390c(this);
        C1392d c1392d = new C1392d();
        if (c1392d.f13097a == null) {
            synchronized (C1392d.f13095b) {
                try {
                    if (C1392d.f13096c == null) {
                        C1392d.f13096c = Executors.newFixedThreadPool(2);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            c1392d.f13097a = C1392d.f13096c;
        }
        C1399h c1399h = new C1399h(c1390c, new C1402k(c1392d.f13097a, aVar));
        this.f13057d = c1399h;
        c1399h.f13133d.add(c1384m);
    }

    @Override // v0.W
    public final int a() {
        return this.f13057d.f13135f.size();
    }

    public final void e(List list) {
        C1399h c1399h = this.f13057d;
        int i6 = c1399h.f13136g + 1;
        c1399h.f13136g = i6;
        List list2 = c1399h.f13134e;
        if (list == list2) {
            return;
        }
        O o3 = c1399h.f13130a;
        if (list == null) {
            int size = list2.size();
            c1399h.f13134e = null;
            c1399h.f13135f = Collections.emptyList();
            o3.a(0, size);
        } else if (list2 != null) {
            ((Executor) c1399h.f13131b.f13147c).execute(new RunnableC1396f(c1399h, list2, list, i6));
            return;
        } else {
            c1399h.f13134e = list;
            c1399h.f13135f = Collections.unmodifiableList(list);
            o3.b(0, list.size());
        }
        c1399h.a(null);
    }
}
