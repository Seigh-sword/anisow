package m2;

import t0.AbstractC1332d;

/* JADX INFO: renamed from: m2.d1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC1031d1 implements Runnable {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public final /* synthetic */ Y1.a f10878A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public final /* synthetic */ Object f10879B;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ int f10880w = 1;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ B1 f10881x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ boolean f10882y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final /* synthetic */ Y0 f10883z;

    public RunnableC1031d1(Y0 y02, B1 b1, boolean z5, C1029d c1029d, C1029d c1029d2) {
        this.f10881x = b1;
        this.f10882y = z5;
        this.f10878A = c1029d;
        this.f10883z = y02;
    }

    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        int i6 = this.f10880w;
        Y1.a aVar = this.f10878A;
        boolean z5 = this.f10882y;
        B1 b1 = this.f10881x;
        Y0 y02 = this.f10883z;
        switch (i6) {
            case com.bumptech.glide.d.f6312l /* 0 */:
                G g4 = y02.f10831z;
                if (g4 != null) {
                    AbstractC1332d.m(b1);
                    y02.E(g4, z5 ? null : (C1076v) aVar, b1);
                    y02.M();
                } else {
                    y02.f().f10715B.d("Discarding data. Failed to send event to service");
                }
                break;
            default:
                G g6 = y02.f10831z;
                if (g6 != null) {
                    AbstractC1332d.m(b1);
                    y02.E(g6, z5 ? null : (C1029d) aVar, b1);
                    y02.M();
                } else {
                    y02.f().f10715B.d("Discarding data. Failed to send conditional user property to service");
                }
                break;
        }
    }

    public RunnableC1031d1(Y0 y02, B1 b1, boolean z5, C1076v c1076v, String str) {
        this.f10881x = b1;
        this.f10882y = z5;
        this.f10878A = c1076v;
        this.f10883z = y02;
    }
}
