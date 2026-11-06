package v0;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class A0 implements Parcelable {
    public static final Parcelable.Creator<A0> CREATOR = new android.support.v4.media.a(16);

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f12934w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f12935x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int[] f12936y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public boolean f12937z;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        return "FullSpanItem{mPosition=" + this.f12934w + ", mGapDir=" + this.f12935x + ", mHasUnwantedGapAfter=" + this.f12937z + ", mGapPerSpan=" + Arrays.toString(this.f12936y) + '}';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i6) {
        parcel.writeInt(this.f12934w);
        parcel.writeInt(this.f12935x);
        parcel.writeInt(this.f12937z ? 1 : 0);
        int[] iArr = this.f12936y;
        if (iArr == null || iArr.length <= 0) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(iArr.length);
            parcel.writeIntArray(this.f12936y);
        }
    }
}
