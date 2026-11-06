package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import h2.AbstractC0769a;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.e0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0406e0 extends AbstractC0769a implements InterfaceC0394c0 {
    public C0406e0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.measurement.api.internal.IBundleReceiver", 2);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC0394c0
    public final void d(Bundle bundle) {
        Parcel parcelB = b();
        G.c(parcelB, bundle);
        F(parcelB, 1);
    }
}
