package X1;

import android.os.Parcel;
import android.os.Parcelable;
import t0.AbstractC1332d;

/* JADX INFO: renamed from: X1.l, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0244l extends Y1.a {
    public static final Parcelable.Creator<C0244l> CREATOR = new android.support.v4.media.a(25);

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public final long f4621A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public final String f4622B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public final String f4623C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public final int f4624D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public final int f4625E;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final int f4626w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final int f4627x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final int f4628y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final long f4629z;

    public C0244l(int i6, int i7, int i8, long j6, long j7, String str, String str2, int i9, int i10) {
        this.f4626w = i6;
        this.f4627x = i7;
        this.f4628y = i8;
        this.f4629z = j6;
        this.f4621A = j7;
        this.f4622B = str;
        this.f4623C = str2;
        this.f4624D = i9;
        this.f4625E = i10;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i6) {
        int iJ0 = AbstractC1332d.J0(parcel, 20293);
        AbstractC1332d.N0(parcel, 1, 4);
        parcel.writeInt(this.f4626w);
        AbstractC1332d.N0(parcel, 2, 4);
        parcel.writeInt(this.f4627x);
        AbstractC1332d.N0(parcel, 3, 4);
        parcel.writeInt(this.f4628y);
        AbstractC1332d.N0(parcel, 4, 8);
        parcel.writeLong(this.f4629z);
        AbstractC1332d.N0(parcel, 5, 8);
        parcel.writeLong(this.f4621A);
        AbstractC1332d.F0(parcel, 6, this.f4622B);
        AbstractC1332d.F0(parcel, 7, this.f4623C);
        AbstractC1332d.N0(parcel, 8, 4);
        parcel.writeInt(this.f4624D);
        AbstractC1332d.N0(parcel, 9, 4);
        parcel.writeInt(this.f4625E);
        AbstractC1332d.L0(parcel, iJ0);
    }
}
