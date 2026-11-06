package m2;

import com.google.android.gms.internal.measurement.InterfaceC0394c0;
import com.google.android.gms.measurement.internal.AppMeasurementDynamiteService;

/* JADX INFO: renamed from: m2.m0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC1057m0 implements Runnable {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ int f11027w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0394c0 f11028x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ AppMeasurementDynamiteService f11029y;

    public /* synthetic */ RunnableC1057m0(AppMeasurementDynamiteService appMeasurementDynamiteService, InterfaceC0394c0 interfaceC0394c0, int i6) {
        this.f11027w = i6;
        this.f11028x = interfaceC0394c0;
        this.f11029y = appMeasurementDynamiteService;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i6 = this.f11027w;
        InterfaceC0394c0 interfaceC0394c0 = this.f11028x;
        AppMeasurementDynamiteService appMeasurementDynamiteService = this.f11029y;
        boolean z5 = false;
        switch (i6) {
            case com.bumptech.glide.d.f6312l /* 0 */:
                Y0 y0Q = appMeasurementDynamiteService.f7026c.q();
                y0Q.r();
                y0Q.y();
                y0Q.B(new K.a(y0Q, y0Q.N(false), interfaceC0394c0, 17));
                break;
            default:
                K1 k12 = appMeasurementDynamiteService.f7026c.f10986H;
                C1051k0.e(k12);
                C1051k0 c1051k0 = appMeasurementDynamiteService.f7026c;
                if (c1051k0.f11001W != null && c1051k0.f11001W.booleanValue()) {
                    z5 = true;
                }
                k12.P(interfaceC0394c0, z5);
                break;
        }
    }
}
