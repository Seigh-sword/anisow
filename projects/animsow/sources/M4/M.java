package M4;

/* JADX INFO: loaded from: classes.dex */
public final class M extends N {

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final InterfaceC0062g f1854y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final /* synthetic */ P f1855z;

    public M(P p5, long j6, C0063h c0063h) {
        this.f1855z = p5;
        this.f1856w = j6;
        this.f1857x = -1;
        this.f1854y = c0063h;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f1854y.d(this.f1855z);
    }

    @Override // M4.N
    public final String toString() {
        return super.toString() + this.f1854y;
    }
}
