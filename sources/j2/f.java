package J2;

import X1.M;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public final class f implements Parcelable {
    public static final Parcelable.Creator<f> CREATOR = new M(23);

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f1319w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public H2.f f1320x;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i6) {
        parcel.writeInt(this.f1319w);
        parcel.writeParcelable(this.f1320x, 0);
    }
}
