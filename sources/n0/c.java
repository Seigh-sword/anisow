package N0;

import I0.o;
import O0.d;
import O0.e;
import P0.f;
import P0.h;
import android.content.Context;
import i.C0803c;
import java.util.ArrayList;
import java.util.Collection;

/* JADX INFO: loaded from: classes.dex */
public final class c implements O0.b {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final String f2072d = o.y("WorkConstraintsTracker");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b f2073a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final O0.c[] f2074b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f2075c;

    public c(Context context, C0803c c0803c, b bVar) {
        Context applicationContext = context.getApplicationContext();
        this.f2073a = bVar;
        this.f2074b = new O0.c[]{new O0.a(applicationContext, c0803c, 0), new O0.a(applicationContext, c0803c, 1), new O0.a(applicationContext, c0803c, 4), new O0.a(applicationContext, c0803c, 2), new O0.a(applicationContext, c0803c, 3), new e((f) h.f(applicationContext, c0803c).f2409c), new d((f) h.f(applicationContext, c0803c).f2409c)};
        this.f2075c = new Object();
    }

    public final boolean a(String str) {
        synchronized (this.f2075c) {
            try {
                for (O0.c cVar : this.f2074b) {
                    Object obj = cVar.f2309b;
                    if (obj != null && cVar.b(obj) && cVar.f2308a.contains(str)) {
                        o.w().u(f2072d, "Work " + str + " constrained by " + cVar.getClass().getSimpleName(), new Throwable[0]);
                        return false;
                    }
                }
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void b(Collection collection) {
        synchronized (this.f2075c) {
            try {
                for (O0.c cVar : this.f2074b) {
                    if (cVar.f2311d != null) {
                        cVar.f2311d = null;
                        cVar.d(null, cVar.f2309b);
                    }
                }
                for (O0.c cVar2 : this.f2074b) {
                    cVar2.c(collection);
                }
                for (O0.c cVar3 : this.f2074b) {
                    if (cVar3.f2311d != this) {
                        cVar3.f2311d = this;
                        cVar3.d(this, cVar3.f2309b);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void c() {
        synchronized (this.f2075c) {
            try {
                for (O0.c cVar : this.f2074b) {
                    ArrayList arrayList = cVar.f2308a;
                    if (!arrayList.isEmpty()) {
                        arrayList.clear();
                        cVar.f2310c.b(cVar);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
