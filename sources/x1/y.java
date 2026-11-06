package X1;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import t0.AbstractC1332d;

/* JADX INFO: loaded from: classes.dex */
public final class y extends Y1.a {
    public static final Parcelable.Creator<y> CREATOR = new android.support.v4.media.a(27);

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public final boolean f4662A;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final int f4663w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final IBinder f4664x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final U1.b f4665y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final boolean f4666z;

    public y(int i6, IBinder iBinder, U1.b bVar, boolean z5, boolean z6) {
        this.f4663w = i6;
        this.f4664x = iBinder;
        this.f4665y = bVar;
        this.f4666z = z5;
        this.f4662A = z6;
    }

    public final boolean equals(Object obj) {
        Object q5;
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y)) {
            return false;
        }
        y yVar = (y) obj;
        if (this.f4665y.equals(yVar.f4665y)) {
            Object q6 = null;
            IBinder iBinder = this.f4664x;
            if (iBinder == null) {
                q5 = null;
            } else {
                int i6 = AbstractBinderC0233a.f4558c;
                IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IAccountAccessor");
                q5 = iInterfaceQueryLocalInterface instanceof InterfaceC0243k ? (InterfaceC0243k) iInterfaceQueryLocalInterface : new Q(iBinder, "com.google.android.gms.common.internal.IAccountAccessor", 1);
            }
            IBinder iBinder2 = yVar.f4664x;
            if (iBinder2 != null) {
                int i7 = AbstractBinderC0233a.f4558c;
                IInterface iInterfaceQueryLocalInterface2 = iBinder2.queryLocalInterface("com.google.android.gms.common.internal.IAccountAccessor");
                q6 = iInterfaceQueryLocalInterface2 instanceof InterfaceC0243k ? (InterfaceC0243k) iInterfaceQueryLocalInterface2 : new Q(iBinder2, "com.google.android.gms.common.internal.IAccountAccessor", 1);
            }
            if (AbstractC1332d.D(q5, q6)) {
                return true;
            }
        }
        return false;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i6) {
        int iJ0 = AbstractC1332d.J0(parcel, 20293);
        AbstractC1332d.N0(parcel, 1, 4);
        parcel.writeInt(this.f4663w);
        AbstractC1332d.z0(parcel, 2, this.f4664x);
        AbstractC1332d.D0(parcel, 3, this.f4665y, i6);
        AbstractC1332d.N0(parcel, 4, 4);
        parcel.writeInt(this.f4666z ? 1 : 0);
        AbstractC1332d.N0(parcel, 5, 4);
        parcel.writeInt(this.f4662A ? 1 : 0);
        AbstractC1332d.L0(parcel, iJ0);
    }
}
