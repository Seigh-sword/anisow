package m2;

import android.os.Parcel;
import android.os.Parcelable;
import t0.AbstractC1332d;

/* JADX INFO: renamed from: m2.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1029d extends Y1.a {
    public static final Parcelable.Creator<C1029d> CREATOR = new X1.M(7);

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public boolean f10864A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public String f10865B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public final C1076v f10866C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public long f10867D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public C1076v f10868E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public final long f10869F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public final C1076v f10870G;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public String f10871w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public String f10872x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public G1 f10873y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public long f10874z;

    public C1029d(String str, String str2, G1 g12, long j6, boolean z5, String str3, C1076v c1076v, long j7, C1076v c1076v2, long j8, C1076v c1076v3) {
        this.f10871w = str;
        this.f10872x = str2;
        this.f10873y = g12;
        this.f10874z = j6;
        this.f10864A = z5;
        this.f10865B = str3;
        this.f10866C = c1076v;
        this.f10867D = j7;
        this.f10868E = c1076v2;
        this.f10869F = j8;
        this.f10870G = c1076v3;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i6) {
        int iJ0 = AbstractC1332d.J0(parcel, 20293);
        AbstractC1332d.F0(parcel, 2, this.f10871w);
        AbstractC1332d.F0(parcel, 3, this.f10872x);
        AbstractC1332d.D0(parcel, 4, this.f10873y, i6);
        long j6 = this.f10874z;
        AbstractC1332d.N0(parcel, 5, 8);
        parcel.writeLong(j6);
        boolean z5 = this.f10864A;
        AbstractC1332d.N0(parcel, 6, 4);
        parcel.writeInt(z5 ? 1 : 0);
        AbstractC1332d.F0(parcel, 7, this.f10865B);
        AbstractC1332d.D0(parcel, 8, this.f10866C, i6);
        long j7 = this.f10867D;
        AbstractC1332d.N0(parcel, 9, 8);
        parcel.writeLong(j7);
        AbstractC1332d.D0(parcel, 10, this.f10868E, i6);
        AbstractC1332d.N0(parcel, 11, 8);
        parcel.writeLong(this.f10869F);
        AbstractC1332d.D0(parcel, 12, this.f10870G, i6);
        AbstractC1332d.L0(parcel, iJ0);
    }

    public C1029d(C1029d c1029d) {
        AbstractC1332d.m(c1029d);
        this.f10871w = c1029d.f10871w;
        this.f10872x = c1029d.f10872x;
        this.f10873y = c1029d.f10873y;
        this.f10874z = c1029d.f10874z;
        this.f10864A = c1029d.f10864A;
        this.f10865B = c1029d.f10865B;
        this.f10866C = c1029d.f10866C;
        this.f10867D = c1029d.f10867D;
        this.f10868E = c1029d.f10868E;
        this.f10869F = c1029d.f10869F;
        this.f10870G = c1029d.f10870G;
    }
}
