package S0;

/* JADX INFO: loaded from: classes.dex */
public final class q implements Runnable {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final r f3099w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final String f3100x;

    public q(r rVar, String str) {
        this.f3099w = rVar;
        this.f3100x = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.f3099w.f3105d) {
            try {
                if (((q) this.f3099w.f3103b.remove(this.f3100x)) != null) {
                    p pVar = (p) this.f3099w.f3104c.remove(this.f3100x);
                    if (pVar != null) {
                        String str = this.f3100x;
                        I0.o.w().u(L0.e.f1684F, "Exceeded time limits on execution for " + str, new Throwable[0]);
                        ((L0.e) pVar).f();
                    }
                } else {
                    I0.o.w().u("WrkTimerRunnable", "Timer with " + this.f3100x + " is already marked as complete.", new Throwable[0]);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
