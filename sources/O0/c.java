package O0;

import I0.o;
import R0.i;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public abstract class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f2308a = new ArrayList();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f2309b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final P0.d f2310c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public b f2311d;

    public c(P0.d dVar) {
        this.f2310c = dVar;
    }

    public abstract boolean a(i iVar);

    public abstract boolean b(Object obj);

    public final void c(Collection collection) {
        this.f2308a.clear();
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            i iVar = (i) it.next();
            if (a(iVar)) {
                this.f2308a.add(iVar.f2900a);
            }
        }
        if (this.f2308a.isEmpty()) {
            this.f2310c.b(this);
        } else {
            P0.d dVar = this.f2310c;
            synchronized (dVar.f2397c) {
                try {
                    if (dVar.f2398d.add(this)) {
                        if (dVar.f2398d.size() == 1) {
                            dVar.f2399e = dVar.a();
                            o.w().u(P0.d.f2394f, String.format("%s: initial state = %s", dVar.getClass().getSimpleName(), dVar.f2399e), new Throwable[0]);
                            dVar.d();
                        }
                        Object obj = dVar.f2399e;
                        this.f2309b = obj;
                        d(this.f2311d, obj);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        d(this.f2311d, this.f2309b);
    }

    public final void d(b bVar, Object obj) {
        if (this.f2308a.isEmpty() || bVar == null) {
            return;
        }
        if (obj == null || b(obj)) {
            ArrayList arrayList = this.f2308a;
            N0.c cVar = (N0.c) bVar;
            synchronized (cVar.f2075c) {
                N0.b bVar2 = cVar.f2073a;
                if (bVar2 != null) {
                    bVar2.d(arrayList);
                }
            }
            return;
        }
        ArrayList<String> arrayList2 = this.f2308a;
        N0.c cVar2 = (N0.c) bVar;
        synchronized (cVar2.f2075c) {
            try {
                ArrayList arrayList3 = new ArrayList();
                for (String str : arrayList2) {
                    if (cVar2.a(str)) {
                        o.w().u(N0.c.f2072d, "Constraints met for " + str, new Throwable[0]);
                        arrayList3.add(str);
                    }
                }
                N0.b bVar3 = cVar2.f2073a;
                if (bVar3 != null) {
                    bVar3.c(arrayList3);
                }
            } finally {
            }
        }
    }
}
