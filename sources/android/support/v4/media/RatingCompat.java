package android.support.v4.media;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public final class RatingCompat implements Parcelable {
    public static final Parcelable.Creator<RatingCompat> CREATOR = new a(3);

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final int f5062w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final float f5063x;

    public RatingCompat(int i6, float f6) {
        this.f5062w = i6;
        this.f5063x = f6;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return this.f5062w;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Rating:style=");
        sb.append(this.f5062w);
        sb.append(" rating=");
        float f6 = this.f5063x;
        sb.append(f6 < 0.0f ? "unrated" : String.valueOf(f6));
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i6) {
        parcel.writeInt(this.f5062w);
        parcel.writeFloat(this.f5063x);
    }
}
