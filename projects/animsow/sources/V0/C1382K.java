package v0;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: renamed from: v0.K, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1382K implements Parcelable {
    public static final Parcelable.Creator<C1382K> CREATOR = new android.support.v4.media.a(15);

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f13037w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f13038x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public boolean f13039y;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i6) {
        parcel.writeInt(this.f13037w);
        parcel.writeInt(this.f13038x);
        parcel.writeInt(this.f13039y ? 1 : 0);
    }
}
