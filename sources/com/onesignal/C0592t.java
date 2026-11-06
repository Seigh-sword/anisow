package com.onesignal;

import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.location.LocationListener;
import com.google.android.gms.location.LocationRequest;

/* JADX INFO: renamed from: com.onesignal.t, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0592t implements LocationListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final GoogleApiClient f7976a;

    public C0592t(GoogleApiClient googleApiClient) {
        this.f7976a = googleApiClient;
        a();
    }

    public final void a() {
        long j6 = AbstractC0603w1.D() ? 270000L : 570000L;
        if (this.f7976a != null) {
            LocationRequest priority = LocationRequest.create().setFastestInterval(j6).setInterval(j6).setMaxWaitTime((long) (j6 * 1.5d)).setPriority(102);
            AbstractC0603w1.a(EnumC0600v1.f7992B, "GMSLocationController GoogleApiClient requestLocationUpdates!");
            r.b(this.f7976a, priority, this);
        }
    }
}
