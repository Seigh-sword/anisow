package X1;

import android.os.Parcel;
import android.os.Parcelable;
import t0.AbstractC1332d;

/* JADX INFO: renamed from: X1.h, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0240h extends Y1.a {
    public static final Parcelable.Creator<C0240h> CREATOR = new M(0);

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public final int f4597A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public final int[] f4598B;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final C0246n f4599w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final boolean f4600x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final boolean f4601y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final int[] f4602z;

    public C0240h(C0246n c0246n, boolean z5, boolean z6, int[] iArr, int i6, int[] iArr2) {
        this.f4599w = c0246n;
        this.f4600x = z5;
        this.f4601y = z6;
        this.f4602z = iArr;
        this.f4597A = i6;
        this.f4598B = iArr2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i6) {
        int iJ0 = AbstractC1332d.J0(parcel, 20293);
        AbstractC1332d.D0(parcel, 1, this.f4599w, i6);
        AbstractC1332d.N0(parcel, 2, 4);
        parcel.writeInt(this.f4600x ? 1 : 0);
        AbstractC1332d.N0(parcel, 3, 4);
        parcel.writeInt(this.f4601y ? 1 : 0);
        int[] iArr = this.f4602z;
        if (iArr != null) {
            int iJ02 = AbstractC1332d.J0(parcel, 4);
            parcel.writeIntArray(iArr);
            AbstractC1332d.L0(parcel, iJ02);
        }
        AbstractC1332d.N0(parcel, 5, 4);
        parcel.writeInt(this.f4597A);
        int[] iArr2 = this.f4598B;
        if (iArr2 != null) {
            int iJ03 = AbstractC1332d.J0(parcel, 6);
            parcel.writeIntArray(iArr2);
            AbstractC1332d.L0(parcel, iJ03);
        }
        AbstractC1332d.L0(parcel, iJ0);
    }
}
