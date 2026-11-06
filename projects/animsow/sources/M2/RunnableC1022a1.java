package m2;

import t0.AbstractC1332d;

/* JADX INFO: renamed from: m2.a1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC1022a1 implements Runnable {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ B1 f10842w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ boolean f10843x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ G1 f10844y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final /* synthetic */ Y0 f10845z;

    public RunnableC1022a1(Y0 y02, B1 b1, boolean z5, G1 g12) {
        this.f10842w = b1;
        this.f10843x = z5;
        this.f10844y = g12;
        this.f10845z = y02;
    }

    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        Y0 y02 = this.f10845z;
        G g4 = y02.f10831z;
        if (g4 == null) {
            y02.f().f10715B.d("Discarding data. Failed to set user property");
            return;
        }
        B1 b1 = this.f10842w;
        AbstractC1332d.m(b1);
        y02.E(g4, this.f10843x ? null : this.f10844y, b1);
        y02.M();
    }
}
