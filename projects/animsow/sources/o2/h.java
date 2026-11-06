package o2;

import X1.M;
import X1.x;
import android.os.Parcel;
import android.os.Parcelable;
import t0.AbstractC1332d;

/* JADX INFO: loaded from: classes.dex */
public final class h extends Y1.a {
    public static final Parcelable.Creator<h> CREATOR = new M(16);

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final int f12192w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final x f12193x;

    public h(int i6, x xVar) {
        this.f12192w = i6;
        this.f12193x = xVar;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i6) {
        int iJ0 = AbstractC1332d.J0(parcel, 20293);
        AbstractC1332d.N0(parcel, 1, 4);
        parcel.writeInt(this.f12192w);
        AbstractC1332d.D0(parcel, 2, this.f12193x, i6);
        AbstractC1332d.L0(parcel, iJ0);
    }
}
