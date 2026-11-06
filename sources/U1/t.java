package U1;

import X1.M;
import android.os.Parcel;
import android.os.Parcelable;
import t0.AbstractC1332d;

/* JADX INFO: loaded from: classes.dex */
public final class t extends Y1.a {
    public static final Parcelable.Creator<t> CREATOR = new M(5);

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final boolean f3622w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final String f3623x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final int f3624y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final int f3625z;

    public t(int i6, int i7, String str, boolean z5) {
        this.f3622w = z5;
        this.f3623x = str;
        this.f3624y = f2.h.K(i6) - 1;
        this.f3625z = AbstractC1332d.I0(i7) - 1;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i6) {
        int iJ0 = AbstractC1332d.J0(parcel, 20293);
        AbstractC1332d.N0(parcel, 1, 4);
        parcel.writeInt(this.f3622w ? 1 : 0);
        AbstractC1332d.F0(parcel, 2, this.f3623x);
        AbstractC1332d.N0(parcel, 3, 4);
        parcel.writeInt(this.f3624y);
        AbstractC1332d.N0(parcel, 4, 4);
        parcel.writeInt(this.f3625z);
        AbstractC1332d.L0(parcel, iJ0);
    }
}
