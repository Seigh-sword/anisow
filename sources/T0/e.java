package T0;

/* JADX INFO: loaded from: classes.dex */
public final class e implements Runnable {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final g f3390w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final X2.a f3391x;

    public e(g gVar, X2.a aVar) {
        this.f3390w = gVar;
        this.f3391x = aVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.f3390w.f3399w != this) {
            return;
        }
        if (g.f3396B.j(this.f3390w, this, g.f(this.f3391x))) {
            g.c(this.f3390w);
        }
    }
}
