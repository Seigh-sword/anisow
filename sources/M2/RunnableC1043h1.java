package m2;

import android.content.ComponentName;

/* JADX INFO: renamed from: m2.h1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC1043h1 implements Runnable {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ int f10937w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ ServiceConnectionC1040g1 f10938x;

    public /* synthetic */ RunnableC1043h1(ServiceConnectionC1040g1 serviceConnectionC1040g1, int i6) {
        this.f10937w = i6;
        this.f10938x = serviceConnectionC1040g1;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i6 = this.f10937w;
        ServiceConnectionC1040g1 serviceConnectionC1040g1 = this.f10938x;
        switch (i6) {
            case com.bumptech.glide.d.f6312l /* 0 */:
                Y0 y02 = serviceConnectionC1040g1.f10916y;
                y02.f10831z = null;
                y02.L();
                break;
            default:
                Y0 y03 = serviceConnectionC1040g1.f10916y;
                ComponentName componentName = new ComponentName(serviceConnectionC1040g1.f10916y.a(), "com.google.android.gms.measurement.AppMeasurementService");
                y03.r();
                if (y03.f10831z != null) {
                    y03.f10831z = null;
                    y03.f().f10723J.c(componentName, "Disconnected from device MeasurementService");
                    y03.r();
                    y03.G();
                }
                break;
        }
    }
}
