package K0;

import I0.o;
import J0.c;
import J0.k;
import R0.i;
import S0.h;
import S0.j;
import android.content.Context;
import android.os.Handler;
import android.text.TextUtils;
import d.AbstractC0628i;
import i.C0803c;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import m.RunnableC0969k;

/* JADX INFO: loaded from: classes.dex */
public final class b implements c, N0.b, J0.a {

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public static final String f1500E = o.y("GreedyScheduler");

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public final a f1501A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public boolean f1502B;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public Boolean f1504D;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final Context f1505w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final k f1506x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final N0.c f1507y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final HashSet f1508z = new HashSet();

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public final Object f1503C = new Object();

    public b(Context context, I0.b bVar, C0803c c0803c, k kVar) {
        this.f1505w = context;
        this.f1506x = kVar;
        this.f1507y = new N0.c(context, c0803c, this);
        this.f1501A = new a(this, bVar.f1081e);
    }

    @Override // J0.a
    public final void a(String str, boolean z5) {
        synchronized (this.f1503C) {
            try {
                Iterator it = this.f1508z.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    i iVar = (i) it.next();
                    if (iVar.f2900a.equals(str)) {
                        o.w().u(f1500E, "Stopping tracking for " + str, new Throwable[0]);
                        this.f1508z.remove(iVar);
                        this.f1507y.b(this.f1508z);
                        break;
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // J0.c
    public final void b(String str) {
        Runnable runnable;
        Boolean bool = this.f1504D;
        k kVar = this.f1506x;
        if (bool == null) {
            this.f1504D = Boolean.valueOf(h.a(this.f1505w, kVar.f1207i));
        }
        boolean zBooleanValue = this.f1504D.booleanValue();
        String str2 = f1500E;
        if (!zBooleanValue) {
            o.w().x(str2, "Ignoring schedule request in non-main process", new Throwable[0]);
            return;
        }
        if (!this.f1502B) {
            kVar.f1211m.b(this);
            this.f1502B = true;
        }
        o.w().u(str2, AbstractC0628i.q("Cancelling work ID ", str), new Throwable[0]);
        a aVar = this.f1501A;
        if (aVar != null && (runnable = (Runnable) aVar.f1499c.remove(str)) != null) {
            ((Handler) aVar.f1498b.f1734x).removeCallbacks(runnable);
        }
        kVar.f1209k.p(new j(kVar, str, false));
    }

    @Override // N0.b
    public final void c(List list) {
        for (String str : (ArrayList) list) {
            o.w().u(f1500E, AbstractC0628i.q("Constraints met: Scheduling work ID ", str), new Throwable[0]);
            this.f1506x.N(str, null);
        }
    }

    @Override // N0.b
    public final void d(ArrayList arrayList) {
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            o.w().u(f1500E, AbstractC0628i.q("Constraints not met: Cancelling work ID ", str), new Throwable[0]);
            k kVar = this.f1506x;
            kVar.f1209k.p(new j(kVar, str, false));
        }
    }

    @Override // J0.c
    public final boolean e() {
        return false;
    }

    @Override // J0.c
    public final void f(i... iVarArr) {
        if (this.f1504D == null) {
            this.f1504D = Boolean.valueOf(h.a(this.f1505w, this.f1506x.f1207i));
        }
        if (!this.f1504D.booleanValue()) {
            o.w().x(f1500E, "Ignoring schedule request in a secondary process", new Throwable[0]);
            return;
        }
        if (!this.f1502B) {
            this.f1506x.f1211m.b(this);
            this.f1502B = true;
        }
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        for (i iVar : iVarArr) {
            long jA = iVar.a();
            long jCurrentTimeMillis = System.currentTimeMillis();
            if (iVar.f2901b == 1) {
                if (jCurrentTimeMillis < jA) {
                    a aVar = this.f1501A;
                    if (aVar != null) {
                        HashMap map = aVar.f1499c;
                        Runnable runnable = (Runnable) map.remove(iVar.f2900a);
                        L3.c cVar = aVar.f1498b;
                        if (runnable != null) {
                            ((Handler) cVar.f1734x).removeCallbacks(runnable);
                        }
                        RunnableC0969k runnableC0969k = new RunnableC0969k(aVar, 9, iVar);
                        map.put(iVar.f2900a, runnableC0969k);
                        ((Handler) cVar.f1734x).postDelayed(runnableC0969k, iVar.a() - System.currentTimeMillis());
                    }
                } else if (iVar.b()) {
                    I0.c cVar2 = iVar.f2909j;
                    if (cVar2.f1088c) {
                        o.w().u(f1500E, "Ignoring WorkSpec " + iVar + ", Requires device idle.", new Throwable[0]);
                    } else if (cVar2.f1093h.f1096a.size() > 0) {
                        o.w().u(f1500E, "Ignoring WorkSpec " + iVar + ", Requires ContentUri triggers.", new Throwable[0]);
                    } else {
                        hashSet.add(iVar);
                        hashSet2.add(iVar.f2900a);
                    }
                } else {
                    o.w().u(f1500E, AbstractC0628i.q("Starting work for ", iVar.f2900a), new Throwable[0]);
                    this.f1506x.N(iVar.f2900a, null);
                }
            }
        }
        synchronized (this.f1503C) {
            try {
                if (!hashSet.isEmpty()) {
                    o.w().u(f1500E, "Starting tracking for [" + TextUtils.join(",", hashSet2) + "]", new Throwable[0]);
                    this.f1508z.addAll(hashSet);
                    this.f1507y.b(this.f1508z);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
