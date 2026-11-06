package o2;

import X1.M;
import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import t0.AbstractC1332d;

/* JADX INFO: loaded from: classes.dex */
public final class b extends Y1.a {
    public static final Parcelable.Creator<b> CREATOR = new M(14);

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final int f12187w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final int f12188x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final Intent f12189y;

    public b(int i6, int i7, Intent intent) {
        this.f12187w = i6;
        this.f12188x = i7;
        this.f12189y = intent;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i6) {
        int iJ0 = AbstractC1332d.J0(parcel, 20293);
        AbstractC1332d.N0(parcel, 1, 4);
        parcel.writeInt(this.f12187w);
        AbstractC1332d.N0(parcel, 2, 4);
        parcel.writeInt(this.f12188x);
        AbstractC1332d.D0(parcel, 3, this.f12189y, i6);
        AbstractC1332d.L0(parcel, iJ0);
    }
}
