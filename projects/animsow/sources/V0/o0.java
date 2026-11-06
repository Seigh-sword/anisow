package v0;

import android.os.Parcel;
import android.os.Parcelable;
import m.g1;

/* JADX INFO: loaded from: classes.dex */
public final class o0 extends U.b {
    public static final Parcelable.Creator<o0> CREATOR = new g1(3);

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public Parcelable f13182y;

    public o0(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.f13182y = parcel.readParcelable(classLoader == null ? AbstractC1397f0.class.getClassLoader() : classLoader);
    }

    @Override // U.b, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i6) {
        super.writeToParcel(parcel, i6);
        parcel.writeParcelable(this.f13182y, 0);
    }
}
