package m;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public final class h1 extends U.b {
    public static final Parcelable.Creator<h1> CREATOR = new g1(0);

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f10279y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public boolean f10280z;

    public h1(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.f10279y = parcel.readInt();
        this.f10280z = parcel.readInt() != 0;
    }

    @Override // U.b, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i6) {
        super.writeToParcel(parcel, i6);
        parcel.writeInt(this.f10279y);
        parcel.writeInt(this.f10280z ? 1 : 0);
    }
}
