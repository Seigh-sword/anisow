package U;

import android.os.Parcel;
import android.os.Parcelable;
import m.g1;

/* JADX INFO: loaded from: classes.dex */
public abstract class b implements Parcelable {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final Parcelable f3569w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final a f3568x = new a();
    public static final Parcelable.Creator<b> CREATOR = new g1(2);

    public b() {
        this.f3569w = null;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i6) {
        parcel.writeParcelable(this.f3569w, i6);
    }

    public b(Parcel parcel, ClassLoader classLoader) {
        Parcelable parcelable = parcel.readParcelable(classLoader);
        this.f3569w = parcelable == null ? f3568x : parcelable;
    }

    public b(Parcelable parcelable) {
        if (parcelable == null) {
            throw new IllegalArgumentException("superState must not be null");
        }
        this.f3569w = parcelable == f3568x ? null : parcelable;
    }
}
