package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.Parcel;
import b3.C0342b;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.m0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class BinderC0454m0 extends H implements InterfaceC0400d0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final m2.D0 f6880c;

    public BinderC0454m0(C0342b c0342b) {
        super("com.google.android.gms.measurement.api.internal.IEventHandlerProxy");
        this.f6880c = c0342b;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC0400d0
    public final void B(long j6, Bundle bundle, String str, String str2) {
        this.f6880c.a(j6, bundle, str, str2);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC0400d0
    public final int a() {
        return System.identityHashCode(this.f6880c);
    }

    @Override // com.google.android.gms.internal.measurement.H
    public final boolean b(int i6, Parcel parcel, Parcel parcel2) {
        if (i6 != 1) {
            if (i6 != 2) {
                return false;
            }
            int iIdentityHashCode = System.identityHashCode(this.f6880c);
            parcel2.writeNoException();
            parcel2.writeInt(iIdentityHashCode);
            return true;
        }
        String string = parcel.readString();
        String string2 = parcel.readString();
        Bundle bundle = (Bundle) G.a(parcel, Bundle.CREATOR);
        long j6 = parcel.readLong();
        G.d(parcel);
        B(j6, bundle, string, string2);
        parcel2.writeNoException();
        return true;
    }
}
