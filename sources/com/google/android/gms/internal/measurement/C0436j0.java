package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import t0.AbstractC1332d;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.j0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0436j0 extends Y1.a {
    public static final Parcelable.Creator<C0436j0> CREATOR = new C0430i0();

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public final String f6840A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public final String f6841B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public final Bundle f6842C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public final String f6843D;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final long f6844w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final long f6845x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final boolean f6846y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final String f6847z;

    public C0436j0(long j6, long j7, boolean z5, String str, String str2, String str3, Bundle bundle, String str4) {
        this.f6844w = j6;
        this.f6845x = j7;
        this.f6846y = z5;
        this.f6847z = str;
        this.f6840A = str2;
        this.f6841B = str3;
        this.f6842C = bundle;
        this.f6843D = str4;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i6) {
        int iJ0 = AbstractC1332d.J0(parcel, 20293);
        AbstractC1332d.N0(parcel, 1, 8);
        parcel.writeLong(this.f6844w);
        AbstractC1332d.N0(parcel, 2, 8);
        parcel.writeLong(this.f6845x);
        AbstractC1332d.N0(parcel, 3, 4);
        parcel.writeInt(this.f6846y ? 1 : 0);
        AbstractC1332d.F0(parcel, 4, this.f6847z);
        AbstractC1332d.F0(parcel, 5, this.f6840A);
        AbstractC1332d.F0(parcel, 6, this.f6841B);
        AbstractC1332d.y0(parcel, 7, this.f6842C);
        AbstractC1332d.F0(parcel, 8, this.f6843D);
        AbstractC1332d.L0(parcel, iJ0);
    }
}
