package com.onesignal;

import android.location.Location;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.location.LocationServices;

/* JADX INFO: renamed from: com.onesignal.u, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0595u extends M {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static X1 f7980j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static C0592t f7981k;

    public static void c() {
        synchronized (M.f7630d) {
            X1 x12 = f7980j;
            if (x12 != null) {
                try {
                    ((Class) x12.f7735x).getMethod("disconnect", new Class[0]).invoke((GoogleApiClient) x12.f7736y, new Object[0]);
                } catch (Throwable th) {
                    th.printStackTrace();
                }
                f7980j = null;
            } else {
                f7980j = null;
            }
        }
    }

    public static void g() {
        synchronized (M.f7630d) {
            try {
                AbstractC0603w1.a(EnumC0600v1.f7992B, "GMSLocationController onFocusChange!");
                X1 x12 = f7980j;
                if (x12 != null && x12.k().d()) {
                    X1 x13 = f7980j;
                    if (x13 != null) {
                        GoogleApiClient googleApiClientK = x13.k();
                        if (f7981k != null) {
                            LocationServices.FusedLocationApi.removeLocationUpdates(googleApiClientK, f7981k);
                        }
                        f7981k = new C0592t(googleApiClientK);
                    }
                }
            } finally {
            }
        }
    }

    public static void k() {
        Location location;
        if (M.f7632f != null) {
            return;
        }
        synchronized (M.f7630d) {
            try {
                Thread thread = new Thread(new RunnableC0604x(4), "OS_GMS_LOCATION_FALLBACK");
                M.f7632f = thread;
                thread.start();
                if (f7980j == null || (location = M.f7634h) == null) {
                    C0589s c0589s = new C0589s();
                    V1.h hVar = new V1.h(M.f7633g);
                    hVar.a(LocationServices.API);
                    hVar.b(c0589s);
                    hVar.c(c0589s);
                    hVar.e(M.e().f7592w);
                    X1 x12 = new X1(hVar.d());
                    f7980j = x12;
                    x12.e();
                } else {
                    M.b(location);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
