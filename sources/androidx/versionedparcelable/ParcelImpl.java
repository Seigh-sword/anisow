package androidx.versionedparcelable;

import H0.b;
import H0.c;
import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.media.a;

/* JADX INFO: loaded from: classes.dex */
@SuppressLint({"BanParcelableUsage"})
public class ParcelImpl implements Parcelable {
    public static final Parcelable.Creator<ParcelImpl> CREATOR = new a(18);

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final c f5822w;

    public ParcelImpl(Parcel parcel) {
        this.f5822w = new b(parcel).h();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i6) {
        new b(parcel).k(this.f5822w);
    }
}
