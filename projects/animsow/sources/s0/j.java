package S0;

import androidx.work.impl.WorkDatabase;

/* JADX INFO: loaded from: classes.dex */
public final class j implements Runnable {

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final String f3080z = I0.o.y("StopWorkRunnable");

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final J0.k f3081w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final String f3082x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final boolean f3083y;

    public j(J0.k kVar, String str, boolean z5) {
        this.f3081w = kVar;
        this.f3082x = str;
        this.f3083y = z5;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean zContainsKey;
        boolean zJ;
        J0.k kVar = this.f3081w;
        WorkDatabase workDatabase = kVar.f1208j;
        J0.b bVar = kVar.f1211m;
        R0.k kVarN = workDatabase.n();
        workDatabase.c();
        try {
            String str = this.f3082x;
            synchronized (bVar.f1176G) {
                zContainsKey = bVar.f1171B.containsKey(str);
            }
            if (this.f3083y) {
                zJ = this.f3081w.f1211m.i(this.f3082x);
            } else {
                if (!zContainsKey && kVarN.h(this.f3082x) == 2) {
                    kVarN.t(1, this.f3082x);
                }
                zJ = this.f3081w.f1211m.j(this.f3082x);
            }
            I0.o.w().u(f3080z, "StopWorkRunnable for " + this.f3082x + "; Processor.stopWork = " + zJ, new Throwable[0]);
            workDatabase.h();
            workDatabase.f();
        } catch (Throwable th) {
            workDatabase.f();
            throw th;
        }
    }
}
