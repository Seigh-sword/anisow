package m2;

/* JADX INFO: loaded from: classes.dex */
public final class P0 implements Runnable {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public final /* synthetic */ Object f10748A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public final /* synthetic */ X f10749B;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ int f10750w = 0;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ long f10751x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ boolean f10752y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final /* synthetic */ Object f10753z;

    public P0(G0 g02, C1085z0 c1085z0, long j6, boolean z5, C1085z0 c1085z02) {
        this.f10753z = c1085z0;
        this.f10751x = j6;
        this.f10752y = z5;
        this.f10748A = c1085z02;
        this.f10749B = g02;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i6 = this.f10750w;
        Object obj = this.f10748A;
        Object obj2 = this.f10753z;
        X x5 = this.f10749B;
        switch (i6) {
            case com.bumptech.glide.d.f6312l /* 0 */:
                G0 g02 = (G0) x5;
                C1085z0 c1085z0 = (C1085z0) obj2;
                g02.K(c1085z0);
                G0.M(g02, c1085z0, this.f10751x, false, this.f10752y);
                G0.N(g02, c1085z0, (C1085z0) obj);
                break;
            default:
                ((U0) x5).F((V0) obj2, (V0) obj, this.f10751x, this.f10752y, null);
                break;
        }
    }

    public P0(U0 u02, V0 v02, V0 v03, long j6, boolean z5) {
        this.f10753z = v02;
        this.f10748A = v03;
        this.f10751x = j6;
        this.f10752y = z5;
        this.f10749B = u02;
    }
}
