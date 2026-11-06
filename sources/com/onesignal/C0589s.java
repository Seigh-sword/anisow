package com.onesignal;

import android.location.Location;
import android.os.Bundle;
import com.google.android.gms.common.api.GoogleApiClient;

/* JADX INFO: renamed from: com.onesignal.s, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0589s implements V1.i, V1.j {
    @Override // W1.InterfaceC0210d
    public final void D(Bundle bundle) {
        synchronized (M.f7630d) {
            try {
                X1 x12 = AbstractC0595u.f7980j;
                if (x12 != null && ((GoogleApiClient) x12.f7736y) != null) {
                    EnumC0600v1 enumC0600v1 = EnumC0600v1.f7992B;
                    AbstractC0603w1.b(enumC0600v1, "GMSLocationController GoogleApiClientListener onConnected lastLocation: " + M.f7634h, null);
                    if (M.f7634h == null) {
                        M.f7634h = r.a((GoogleApiClient) AbstractC0595u.f7980j.f7736y);
                        AbstractC0603w1.b(enumC0600v1, "GMSLocationController GoogleApiClientListener lastLocation: " + M.f7634h, null);
                        Location location = M.f7634h;
                        if (location != null) {
                            M.b(location);
                        }
                    }
                    AbstractC0595u.f7981k = new C0592t((GoogleApiClient) AbstractC0595u.f7980j.f7736y);
                    return;
                }
                AbstractC0603w1.b(EnumC0600v1.f7992B, "GMSLocationController GoogleApiClientListener onConnected googleApiClient not available, returning", null);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // W1.InterfaceC0210d
    public final void b(int i6) {
        AbstractC0603w1.b(EnumC0600v1.f7992B, "GMSLocationController GoogleApiClientListener onConnectionSuspended i: " + i6, null);
        AbstractC0595u.c();
    }

    @Override // W1.InterfaceC0216j
    public final void e(U1.b bVar) {
        AbstractC0603w1.b(EnumC0600v1.f7992B, "GMSLocationController GoogleApiClientListener onConnectionSuspended connectionResult: " + bVar, null);
        AbstractC0595u.c();
    }
}
