package com.onesignal;

import android.location.Location;
import android.os.Looper;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.location.LocationListener;
import com.google.android.gms.location.LocationRequest;
import com.google.android.gms.location.LocationServices;

/* JADX INFO: loaded from: classes.dex */
public abstract class r {
    public static Location a(GoogleApiClient googleApiClient) {
        synchronized (M.f7630d) {
            try {
                if (!googleApiClient.d()) {
                    return null;
                }
                return LocationServices.FusedLocationApi.getLastLocation(googleApiClient);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static void b(GoogleApiClient googleApiClient, LocationRequest locationRequest, LocationListener locationListener) {
        try {
            synchronized (M.f7630d) {
                try {
                    if (Looper.myLooper() == null) {
                        Looper.prepare();
                    }
                    if (googleApiClient.d()) {
                        LocationServices.FusedLocationApi.requestLocationUpdates(googleApiClient, locationRequest, locationListener);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        } catch (Throwable th2) {
            AbstractC0603w1.b(EnumC0600v1.f7998z, "FusedLocationApi.requestLocationUpdates failed!", th2);
        }
    }
}
