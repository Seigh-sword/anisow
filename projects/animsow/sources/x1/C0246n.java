package X1;

import android.os.Parcel;
import android.os.Parcelable;
import t0.AbstractC1332d;

/* JADX INFO: renamed from: X1.n, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0246n extends Y1.a {
    public static final Parcelable.Creator<C0246n> CREATOR = new android.support.v4.media.a(28);

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public final int f4631A;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final int f4632w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final boolean f4633x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final boolean f4634y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final int f4635z;

    public C0246n(int i6, boolean z5, boolean z6, int i7, int i8) {
        this.f4632w = i6;
        this.f4633x = z5;
        this.f4634y = z6;
        this.f4635z = i7;
        this.f4631A = i8;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i6) {
        int iJ0 = AbstractC1332d.J0(parcel, 20293);
        AbstractC1332d.N0(parcel, 1, 4);
        parcel.writeInt(this.f4632w);
        AbstractC1332d.N0(parcel, 2, 4);
        parcel.writeInt(this.f4633x ? 1 : 0);
        AbstractC1332d.N0(parcel, 3, 4);
        parcel.writeInt(this.f4634y ? 1 : 0);
        AbstractC1332d.N0(parcel, 4, 4);
        parcel.writeInt(this.f4635z);
        AbstractC1332d.N0(parcel, 5, 4);
        parcel.writeInt(this.f4631A);
        AbstractC1332d.L0(parcel, iJ0);
    }
}
