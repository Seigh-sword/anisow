package U1;

import X1.M;
import android.content.Context;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import t0.AbstractC1332d;

/* JADX INFO: loaded from: classes.dex */
public final class s extends Y1.a {
    public static final Parcelable.Creator<s> CREATOR = new M(4);

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public final boolean f3616A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public final boolean f3617B;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final String f3618w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final boolean f3619x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final boolean f3620y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final Context f3621z;

    public s(String str, boolean z5, boolean z6, IBinder iBinder, boolean z7, boolean z8) {
        this.f3618w = str;
        this.f3619x = z5;
        this.f3620y = z6;
        this.f3621z = (Context) e2.b.s(e2.b.e(iBinder));
        this.f3616A = z7;
        this.f3617B = z8;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i6) {
        int iJ0 = AbstractC1332d.J0(parcel, 20293);
        AbstractC1332d.F0(parcel, 1, this.f3618w);
        AbstractC1332d.N0(parcel, 2, 4);
        parcel.writeInt(this.f3619x ? 1 : 0);
        AbstractC1332d.N0(parcel, 3, 4);
        parcel.writeInt(this.f3620y ? 1 : 0);
        AbstractC1332d.z0(parcel, 4, new e2.b(this.f3621z));
        AbstractC1332d.N0(parcel, 5, 4);
        parcel.writeInt(this.f3616A ? 1 : 0);
        AbstractC1332d.N0(parcel, 6, 4);
        parcel.writeInt(this.f3617B ? 1 : 0);
        AbstractC1332d.L0(parcel, iJ0);
    }
}
