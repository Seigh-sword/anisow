package android.support.v4.media.session;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public class ParcelableVolumeInfo implements Parcelable {
    public static final Parcelable.Creator<ParcelableVolumeInfo> CREATOR = new android.support.v4.media.a(7);

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public int f5077A;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f5078w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f5079x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f5080y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public int f5081z;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i6) {
        parcel.writeInt(this.f5078w);
        parcel.writeInt(this.f5080y);
        parcel.writeInt(this.f5081z);
        parcel.writeInt(this.f5077A);
        parcel.writeInt(this.f5079x);
    }
}
