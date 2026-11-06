package X1;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import t0.AbstractC1332d;

/* JADX INFO: loaded from: classes.dex */
public final class L extends Y1.a {
    public static final Parcelable.Creator<L> CREATOR = new android.support.v4.media.a(29);

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public Bundle f4531w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public U1.d[] f4532x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f4533y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public C0240h f4534z;

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i6) {
        int iJ0 = AbstractC1332d.J0(parcel, 20293);
        AbstractC1332d.y0(parcel, 1, this.f4531w);
        AbstractC1332d.G0(parcel, 2, this.f4532x, i6);
        AbstractC1332d.N0(parcel, 3, 4);
        parcel.writeInt(this.f4533y);
        AbstractC1332d.D0(parcel, 4, this.f4534z, i6);
        AbstractC1332d.L0(parcel, iJ0);
    }
}
