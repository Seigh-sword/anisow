package m2;

import android.os.Parcel;
import android.os.Parcelable;
import t0.AbstractC1332d;

/* JADX INFO: renamed from: m2.v, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1076v extends Y1.a {
    public static final Parcelable.Creator<C1076v> CREATOR = new X1.M(10);

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final String f11113w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final C1074u f11114x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final String f11115y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final long f11116z;

    public C1076v(String str, C1074u c1074u, String str2, long j6) {
        this.f11113w = str;
        this.f11114x = c1074u;
        this.f11115y = str2;
        this.f11116z = j6;
    }

    public final String toString() {
        return "origin=" + this.f11115y + ",name=" + this.f11113w + ",params=" + String.valueOf(this.f11114x);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i6) {
        int iJ0 = AbstractC1332d.J0(parcel, 20293);
        AbstractC1332d.F0(parcel, 2, this.f11113w);
        AbstractC1332d.D0(parcel, 3, this.f11114x, i6);
        AbstractC1332d.F0(parcel, 4, this.f11115y);
        AbstractC1332d.N0(parcel, 5, 8);
        parcel.writeLong(this.f11116z);
        AbstractC1332d.L0(parcel, iJ0);
    }

    public C1076v(C1076v c1076v, long j6) {
        AbstractC1332d.m(c1076v);
        this.f11113w = c1076v.f11113w;
        this.f11114x = c1076v.f11114x;
        this.f11115y = c1076v.f11115y;
        this.f11116z = j6;
    }
}
