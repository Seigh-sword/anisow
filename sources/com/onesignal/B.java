package com.onesignal;

import android.location.Location;
import com.huawei.hms.location.FusedLocationProviderClient;
import com.huawei.hms.location.LocationServices;

/* JADX INFO: loaded from: classes.dex */
public abstract class B extends M {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static FusedLocationProviderClient f7467j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static A f7468k;

    public static void g() {
        synchronized (M.f7630d) {
            try {
                AbstractC0603w1.a(EnumC0600v1.f7992B, "HMSLocationController onFocusChange!");
                if (M.f() && f7467j == null) {
                    return;
                }
                FusedLocationProviderClient fusedLocationProviderClient = f7467j;
                if (fusedLocationProviderClient != null) {
                    A a6 = f7468k;
                    if (a6 != null) {
                        fusedLocationProviderClient.removeLocationUpdates(a6);
                    }
                    f7468k = new A(f7467j);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static void k() {
        synchronized (M.f7630d) {
            if (f7467j == null) {
                try {
                    f7467j = LocationServices.getFusedLocationProviderClient(M.f7633g);
                } catch (Exception e6) {
                    AbstractC0603w1.a(EnumC0600v1.f7997y, "Huawei LocationServices getFusedLocationProviderClient failed! " + e6);
                    synchronized (M.f7630d) {
                        f7467j = null;
                        return;
                    }
                }
            }
            Location location = M.f7634h;
            if (location != null) {
                M.b(location);
            } else {
                f7467j.getLastLocation().addOnSuccessListener(new C0610z()).addOnFailureListener(new C0607y());
            }
        }
    }
}
