package z2;

import android.os.Parcel;
import android.os.Parcelable;
import m.g1;

/* JADX INFO: loaded from: classes.dex */
public final class b extends U.b {
    public static final Parcelable.Creator<b> CREATOR = new g1(6);

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public boolean f14082y;

    public b(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        if (classLoader == null) {
            b.class.getClassLoader();
        }
        this.f14082y = parcel.readInt() == 1;
    }

    @Override // U.b, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i6) {
        super.writeToParcel(parcel, i6);
        parcel.writeInt(this.f14082y ? 1 : 0);
    }
}
