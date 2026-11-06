package v0;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class B0 implements Parcelable {
    public static final Parcelable.Creator<B0> CREATOR = new android.support.v4.media.a(17);

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public int f12939A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public int[] f12940B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public List f12941C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public boolean f12942D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public boolean f12943E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public boolean f12944F;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f12945w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f12946x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f12947y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public int[] f12948z;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i6) {
        parcel.writeInt(this.f12945w);
        parcel.writeInt(this.f12946x);
        parcel.writeInt(this.f12947y);
        if (this.f12947y > 0) {
            parcel.writeIntArray(this.f12948z);
        }
        parcel.writeInt(this.f12939A);
        if (this.f12939A > 0) {
            parcel.writeIntArray(this.f12940B);
        }
        parcel.writeInt(this.f12942D ? 1 : 0);
        parcel.writeInt(this.f12943E ? 1 : 0);
        parcel.writeInt(this.f12944F ? 1 : 0);
        parcel.writeList(this.f12941C);
    }
}
