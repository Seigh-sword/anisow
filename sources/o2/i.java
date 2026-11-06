package o2;

import X1.M;
import X1.y;
import android.os.Parcel;
import android.os.Parcelable;
import t0.AbstractC1332d;

/* JADX INFO: loaded from: classes.dex */
public final class i extends Y1.a {
    public static final Parcelable.Creator<i> CREATOR = new M(17);

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final int f12194w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final U1.b f12195x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final y f12196y;

    public i(int i6, U1.b bVar, y yVar) {
        this.f12194w = i6;
        this.f12195x = bVar;
        this.f12196y = yVar;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i6) {
        int iJ0 = AbstractC1332d.J0(parcel, 20293);
        AbstractC1332d.N0(parcel, 1, 4);
        parcel.writeInt(this.f12194w);
        AbstractC1332d.D0(parcel, 2, this.f12195x, i6);
        AbstractC1332d.D0(parcel, 3, this.f12196y, i6);
        AbstractC1332d.L0(parcel, iJ0);
    }
}
