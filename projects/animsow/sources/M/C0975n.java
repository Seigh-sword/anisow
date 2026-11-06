package m;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: renamed from: m.n, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0975n implements Parcelable {
    public static final Parcelable.Creator<C0975n> CREATOR = new android.support.v4.media.a(12);

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f10334w;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i6) {
        parcel.writeInt(this.f10334w);
    }
}
