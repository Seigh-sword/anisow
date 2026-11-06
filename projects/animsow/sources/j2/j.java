package J2;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import m.g1;

/* JADX INFO: loaded from: classes.dex */
public final class j extends U.b {
    public static final Parcelable.Creator<j> CREATOR = new g1(9);

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public Bundle f1324y;

    public j(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.f1324y = parcel.readBundle(classLoader == null ? j.class.getClassLoader() : classLoader);
    }

    @Override // U.b, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i6) {
        super.writeToParcel(parcel, i6);
        parcel.writeBundle(this.f1324y);
    }
}
