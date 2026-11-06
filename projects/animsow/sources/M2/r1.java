package m2;

import android.os.Parcel;
import android.os.Parcelable;
import t0.AbstractC1332d;

/* JADX INFO: loaded from: classes.dex */
public final class r1 extends Y1.a {
    public static final Parcelable.Creator<r1> CREATOR = new X1.M(11);

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final String f11073w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final long f11074x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final int f11075y;

    public r1(int i6, long j6, String str) {
        this.f11073w = str;
        this.f11074x = j6;
        this.f11075y = i6;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i6) {
        int iJ0 = AbstractC1332d.J0(parcel, 20293);
        AbstractC1332d.F0(parcel, 1, this.f11073w);
        AbstractC1332d.N0(parcel, 2, 8);
        parcel.writeLong(this.f11074x);
        AbstractC1332d.N0(parcel, 3, 4);
        parcel.writeInt(this.f11075y);
        AbstractC1332d.L0(parcel, iJ0);
    }
}
