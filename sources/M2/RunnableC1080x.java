package m2;

/* JADX INFO: renamed from: m2.x, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC1080x implements Runnable {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ int f11236w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ long f11237x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ AbstractC1016A f11238y;

    public /* synthetic */ RunnableC1080x(AbstractC1016A abstractC1016A, long j6, int i6) {
        this.f11236w = i6;
        this.f11237x = j6;
        this.f11238y = abstractC1016A;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i6 = this.f11236w;
        long j6 = this.f11237x;
        AbstractC1016A abstractC1016A = this.f11238y;
        switch (i6) {
            case com.bumptech.glide.d.f6312l /* 0 */:
                ((C1067q) abstractC1016A).D(j6);
                break;
            default:
                U0 u02 = (U0) abstractC1016A;
                ((C1051k0) u02.f1668w).m().y(j6);
                u02.f10771A = null;
                break;
        }
    }
}
