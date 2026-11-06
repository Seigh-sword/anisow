package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import h2.AbstractC0769a;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.f0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0412f0 extends AbstractC0769a implements InterfaceC0400d0 {
    public C0412f0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.measurement.api.internal.IEventHandlerProxy", 2);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC0400d0
    public final void B(long j6, Bundle bundle, String str, String str2) {
        Parcel parcelB = b();
        parcelB.writeString(str);
        parcelB.writeString(str2);
        G.c(parcelB, bundle);
        parcelB.writeLong(j6);
        F(parcelB, 1);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC0400d0
    public final int a() {
        Parcel parcelE = E(b(), 2);
        int i6 = parcelE.readInt();
        parcelE.recycle();
        return i6;
    }
}
