package H2;

import android.os.Parcel;
import android.os.Parcelable;
import m.g1;

/* JADX INFO: loaded from: classes.dex */
public final class a extends U.b {
    public static final Parcelable.Creator<a> CREATOR = new g1(7);

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public boolean f969y;

    public a(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.f969y = parcel.readInt() == 1;
    }

    @Override // U.b, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i6) {
        super.writeToParcel(parcel, i6);
        parcel.writeInt(this.f969y ? 1 : 0);
    }
}
