package h0;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public final class S implements Parcelable {
    public static final Parcelable.Creator<S> CREATOR = new C0737b(2);

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public String f8673w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f8674x;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i6) {
        parcel.writeString(this.f8673w);
        parcel.writeInt(this.f8674x);
    }
}
