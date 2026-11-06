package com.google.android.material.datepicker;

import X1.M;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class d implements b {
    public static final Parcelable.Creator<d> CREATOR = new M(21);

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final long f7177w;

    public d(long j6) {
        this.f7177w = j6;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof d) && this.f7177w == ((d) obj).f7177w;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.f7177w)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i6) {
        parcel.writeLong(this.f7177w);
    }
}
