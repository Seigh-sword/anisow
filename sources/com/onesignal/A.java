package com.onesignal;

import com.huawei.hms.location.FusedLocationProviderClient;
import com.huawei.hms.location.LocationCallback;
import com.huawei.hms.location.LocationRequest;

/* JADX INFO: loaded from: classes.dex */
public final class A extends LocationCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final FusedLocationProviderClient f7459a;

    public A(FusedLocationProviderClient fusedLocationProviderClient) {
        this.f7459a = fusedLocationProviderClient;
        a();
    }

    public final void a() {
        long j6 = AbstractC0603w1.D() ? 270000L : 570000L;
        LocationRequest priority = LocationRequest.create().setFastestInterval(j6).setInterval(j6).setMaxWaitTime((long) (j6 * 1.5d)).setPriority(102);
        AbstractC0603w1.a(EnumC0600v1.f7992B, "HMSLocationController Huawei LocationServices requestLocationUpdates!");
        this.f7459a.requestLocationUpdates(priority, this, M.e().getLooper());
    }
}
