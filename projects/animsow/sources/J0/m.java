package J0;

import I0.n;
import I0.o;
import android.content.Context;
import androidx.work.ListenableWorker;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.background.systemalarm.RescheduleReceiver;
import d.AbstractC0628i;
import i.C0803c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class m implements Runnable {

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public static final String f1224O = o.y("WorkerWrapper");

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public ListenableWorker f1225A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public C0803c f1226B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public n f1227C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public I0.b f1228D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public Q0.a f1229E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public WorkDatabase f1230F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public R0.k f1231G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public R0.c f1232H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public R0.c f1233I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    public ArrayList f1234J;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    public String f1235K;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public T0.i f1236L;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    public X2.a f1237M;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    public volatile boolean f1238N;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public Context f1239w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public String f1240x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public List f1241y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public R0.i f1242z;

    public final void a(n nVar) {
        boolean z5 = nVar instanceof I0.m;
        String str = f1224O;
        if (z5) {
            o.w().x(str, AbstractC0628i.q("Worker result SUCCESS for ", this.f1235K), new Throwable[0]);
            if (!this.f1242z.c()) {
                R0.c cVar = this.f1232H;
                String str2 = this.f1240x;
                R0.k kVar = this.f1231G;
                WorkDatabase workDatabase = this.f1230F;
                workDatabase.c();
                try {
                    kVar.t(3, str2);
                    kVar.r(str2, ((I0.m) this.f1227C).f1106a);
                    long jCurrentTimeMillis = System.currentTimeMillis();
                    for (String str3 : cVar.a(str2)) {
                        if (kVar.h(str3) == 5 && cVar.d(str3)) {
                            o.w().x(str, "Setting status to enqueued for " + str3, new Throwable[0]);
                            kVar.t(1, str3);
                            kVar.s(str3, jCurrentTimeMillis);
                        }
                    }
                    workDatabase.h();
                    workDatabase.f();
                    f(false);
                    return;
                } catch (Throwable th) {
                    workDatabase.f();
                    f(false);
                    throw th;
                }
            }
        } else if (nVar instanceof I0.l) {
            o.w().x(str, AbstractC0628i.q("Worker result RETRY for ", this.f1235K), new Throwable[0]);
            d();
            return;
        } else {
            o.w().x(str, AbstractC0628i.q("Worker result FAILURE for ", this.f1235K), new Throwable[0]);
            if (!this.f1242z.c()) {
                h();
                return;
            }
        }
        e();
    }

    public final void b(String str) {
        LinkedList linkedList = new LinkedList();
        linkedList.add(str);
        while (!linkedList.isEmpty()) {
            String str2 = (String) linkedList.remove();
            R0.k kVar = this.f1231G;
            if (kVar.h(str2) != 6) {
                kVar.t(4, str2);
            }
            linkedList.addAll(this.f1232H.a(str2));
        }
    }

    public final void c() {
        boolean zI = i();
        String str = this.f1240x;
        WorkDatabase workDatabase = this.f1230F;
        if (!zI) {
            workDatabase.c();
            try {
                int iH = this.f1231G.h(str);
                workDatabase.m().c(str);
                if (iH == 0) {
                    f(false);
                } else if (iH == 2) {
                    a(this.f1227C);
                } else if (!H1.a.a(iH)) {
                    d();
                }
                workDatabase.h();
                workDatabase.f();
            } catch (Throwable th) {
                workDatabase.f();
                throw th;
            }
        }
        List list = this.f1241y;
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                ((c) it.next()).b(str);
            }
            d.a(this.f1228D, workDatabase, list);
        }
    }

    public final void d() {
        String str = this.f1240x;
        R0.k kVar = this.f1231G;
        WorkDatabase workDatabase = this.f1230F;
        workDatabase.c();
        try {
            kVar.t(1, str);
            kVar.s(str, System.currentTimeMillis());
            kVar.o(str, -1L);
            workDatabase.h();
        } finally {
            workDatabase.f();
            f(true);
        }
    }

    public final void e() {
        String str = this.f1240x;
        R0.k kVar = this.f1231G;
        WorkDatabase workDatabase = this.f1230F;
        workDatabase.c();
        try {
            kVar.s(str, System.currentTimeMillis());
            kVar.t(1, str);
            kVar.p(str);
            kVar.o(str, -1L);
            workDatabase.h();
        } finally {
            workDatabase.f();
            f(false);
        }
    }

    public final void f(boolean z5) {
        ListenableWorker listenableWorker;
        this.f1230F.c();
        try {
            if (!this.f1230F.n().m()) {
                S0.g.a(this.f1239w, RescheduleReceiver.class, false);
            }
            if (z5) {
                this.f1231G.t(1, this.f1240x);
                this.f1231G.o(this.f1240x, -1L);
            }
            if (this.f1242z != null && (listenableWorker = this.f1225A) != null && listenableWorker.a()) {
                Q0.a aVar = this.f1229E;
                String str = this.f1240x;
                b bVar = (b) aVar;
                synchronized (bVar.f1176G) {
                    bVar.f1171B.remove(str);
                    bVar.h();
                }
            }
            this.f1230F.h();
            this.f1230F.f();
            this.f1236L.j(Boolean.valueOf(z5));
        } catch (Throwable th) {
            this.f1230F.f();
            throw th;
        }
    }

    public final void g() {
        R0.k kVar = this.f1231G;
        String str = this.f1240x;
        int iH = kVar.h(str);
        String str2 = f1224O;
        if (iH == 2) {
            o.w().u(str2, AbstractC0628i.j("Status for ", str, " is RUNNING;not doing any work and rescheduling for later execution"), new Throwable[0]);
            f(true);
            return;
        }
        o oVarW = o.w();
        StringBuilder sbN = AbstractC0628i.n("Status for ", str, " is ");
        sbN.append(H1.a.B(iH));
        sbN.append("; not doing any work");
        oVarW.u(str2, sbN.toString(), new Throwable[0]);
        f(false);
    }

    public final void h() {
        String str = this.f1240x;
        WorkDatabase workDatabase = this.f1230F;
        workDatabase.c();
        try {
            b(str);
            this.f1231G.r(str, ((I0.k) this.f1227C).f1105a);
            workDatabase.h();
        } finally {
            workDatabase.f();
            f(false);
        }
    }

    public final boolean i() {
        if (!this.f1238N) {
            return false;
        }
        o.w().u(f1224O, AbstractC0628i.q("Work interrupted for ", this.f1235K), new Throwable[0]);
        if (this.f1231G.h(this.f1240x) == 0) {
            f(false);
        } else {
            f(!H1.a.a(r0));
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x00b8 A[Catch: all -> 0x007c, TryCatch #3 {all -> 0x007c, blocks: (B:14:0x0052, B:17:0x005c, B:18:0x0074, B:22:0x007f, B:24:0x0083, B:25:0x00a8, B:27:0x00ae, B:29:0x00b4, B:37:0x00f1, B:31:0x00b8, B:34:0x00c7, B:36:0x00cf), top: B:98:0x0052 }] */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void run() {
        /*
            Method dump skipped, instruction units count: 658
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: J0.m.run():void");
    }
}
