package m2;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.internal.measurement.InterfaceC0400d0;
import com.google.android.gms.measurement.internal.AppMeasurementDynamiteService;

/* JADX INFO: renamed from: m2.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1020a implements D0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InterfaceC0400d0 f10839a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AppMeasurementDynamiteService f10840b;

    public C1020a(AppMeasurementDynamiteService appMeasurementDynamiteService, InterfaceC0400d0 interfaceC0400d0) {
        this.f10840b = appMeasurementDynamiteService;
        this.f10839a = interfaceC0400d0;
    }

    @Override // m2.D0
    public final void a(long j6, Bundle bundle, String str, String str2) {
        try {
            this.f10839a.B(j6, bundle, str, str2);
        } catch (RemoteException e6) {
            C1051k0 c1051k0 = this.f10840b.f7026c;
            if (c1051k0 != null) {
                N n5 = c1051k0.f10983E;
                C1051k0.i(n5);
                n5.f10718E.c(e6, "Event listener threw exception");
            }
        }
    }
}
