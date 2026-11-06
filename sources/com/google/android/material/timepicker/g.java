package com.google.android.material.timepicker;

import X1.M;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class g implements Parcelable {
    public static final Parcelable.Creator<g> CREATOR = new M(24);

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final int f7417w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final int f7418x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final int f7419y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final int f7420z;

    public g(Parcel parcel) {
        int i6 = parcel.readInt();
        int i7 = parcel.readInt();
        int i8 = parcel.readInt();
        int i9 = parcel.readInt();
        this.f7418x = i6;
        this.f7419y = i7;
        this.f7420z = i8;
        this.f7417w = i9;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return this.f7418x == gVar.f7418x && this.f7419y == gVar.f7419y && this.f7417w == gVar.f7417w && this.f7420z == gVar.f7420z;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f7417w), Integer.valueOf(this.f7418x), Integer.valueOf(this.f7419y), Integer.valueOf(this.f7420z)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i6) {
        parcel.writeInt(this.f7418x);
        parcel.writeInt(this.f7419y);
        parcel.writeInt(this.f7420z);
        parcel.writeInt(this.f7417w);
    }
}
