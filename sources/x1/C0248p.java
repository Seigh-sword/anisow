package X1;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;
import t0.AbstractC1332d;

/* JADX INFO: renamed from: X1.p, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0248p extends Y1.a {
    public static final Parcelable.Creator<C0248p> CREATOR = new android.support.v4.media.a(24);

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final int f4638w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public List f4639x;

    public C0248p(int i6, List list) {
        this.f4638w = i6;
        this.f4639x = list;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i6) {
        int iJ0 = AbstractC1332d.J0(parcel, 20293);
        AbstractC1332d.N0(parcel, 1, 4);
        parcel.writeInt(this.f4638w);
        AbstractC1332d.H0(parcel, 2, this.f4639x);
        AbstractC1332d.L0(parcel, iJ0);
    }
}
