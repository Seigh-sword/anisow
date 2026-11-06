package m2;

import com.google.android.gms.internal.measurement.I3;

/* JADX INFO: loaded from: classes.dex */
public final class O0 implements Runnable {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public final /* synthetic */ C1085z0 f10736A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public final /* synthetic */ G0 f10737B;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ C1085z0 f10738w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ long f10739x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ long f10740y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final /* synthetic */ boolean f10741z;

    public O0(G0 g02, C1085z0 c1085z0, long j6, long j7, boolean z5, C1085z0 c1085z02) {
        this.f10738w = c1085z0;
        this.f10739x = j6;
        this.f10740y = j7;
        this.f10741z = z5;
        this.f10736A = c1085z02;
        this.f10737B = g02;
    }

    @Override // java.lang.Runnable
    public final void run() {
        G0 g02 = this.f10737B;
        C1085z0 c1085z0 = this.f10738w;
        g02.K(c1085z0);
        I3.a();
        if (!g02.n().D(null, AbstractC1078w.f11165W0)) {
            g02.O(false, this.f10739x);
        }
        G0.M(this.f10737B, this.f10738w, this.f10740y, true, this.f10741z);
        G0.N(g02, c1085z0, this.f10736A);
    }
}
