package U1;

import X1.A;
import X1.M;
import X1.S;
import X1.T;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import android.util.Log;
import e2.InterfaceC0663a;
import t0.AbstractC1332d;

/* JADX INFO: loaded from: classes.dex */
public final class u extends Y1.a {
    public static final Parcelable.Creator<u> CREATOR = new M(6);

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final String f3626w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final n f3627x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final boolean f3628y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final boolean f3629z;

    public u(String str, IBinder iBinder, boolean z5, boolean z6) {
        this.f3626w = str;
        o oVar = null;
        if (iBinder != null) {
            try {
                int i6 = T.f4557c;
                IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.ICertData");
                InterfaceC0663a interfaceC0663aC = (iInterfaceQueryLocalInterface instanceof A ? (A) iInterfaceQueryLocalInterface : new S(iBinder, "com.google.android.gms.common.internal.ICertData", 1)).c();
                byte[] bArr = interfaceC0663aC == null ? null : (byte[]) e2.b.s(interfaceC0663aC);
                if (bArr != null) {
                    oVar = new o(bArr);
                } else {
                    Log.e("GoogleCertificatesQuery", "Could not unwrap certificate");
                }
            } catch (RemoteException e6) {
                Log.e("GoogleCertificatesQuery", "Could not unwrap certificate", e6);
            }
        }
        this.f3627x = oVar;
        this.f3628y = z5;
        this.f3629z = z6;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i6) {
        int iJ0 = AbstractC1332d.J0(parcel, 20293);
        AbstractC1332d.F0(parcel, 1, this.f3626w);
        n nVar = this.f3627x;
        if (nVar == null) {
            Log.w("GoogleCertificatesQuery", "certificate binder is null");
            nVar = null;
        }
        AbstractC1332d.z0(parcel, 2, nVar);
        AbstractC1332d.N0(parcel, 3, 4);
        parcel.writeInt(this.f3628y ? 1 : 0);
        AbstractC1332d.N0(parcel, 4, 4);
        parcel.writeInt(this.f3629z ? 1 : 0);
        AbstractC1332d.L0(parcel, iJ0);
    }
}
