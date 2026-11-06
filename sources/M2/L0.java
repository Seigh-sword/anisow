package m2;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes.dex */
public final class L0 implements Runnable {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ int f10684w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ long f10685x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ G0 f10686y;

    public /* synthetic */ L0(G0 g02, long j6, int i6) {
        this.f10684w = i6;
        this.f10685x = j6;
        this.f10686y = g02;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i6 = this.f10684w;
        long j6 = this.f10685x;
        G0 g02 = this.f10686y;
        switch (i6) {
            case com.bumptech.glide.d.f6312l /* 0 */:
                g02.p().f10808H.b(j6);
                N nF = g02.f();
                nF.f10722I.c(Long.valueOf(j6), "Session timeout duration set");
                break;
            default:
                g02.O(true, j6);
                g02.w().C(new AtomicReference());
                break;
        }
    }
}
