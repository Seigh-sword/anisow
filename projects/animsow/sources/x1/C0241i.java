package X1;

import android.accounts.Account;
import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.api.Scope;
import j2.AbstractC0847b;

/* JADX INFO: renamed from: X1.i, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0241i extends Y1.a {
    public static final Parcelable.Creator<C0241i> CREATOR = new M(1);

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    public static final Scope[] f4603K = new Scope[0];

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public static final U1.d[] f4604L = new U1.d[0];

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public IBinder f4605A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public Scope[] f4606B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public Bundle f4607C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public Account f4608D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public U1.d[] f4609E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public U1.d[] f4610F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public final boolean f4611G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public final int f4612H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public final boolean f4613I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    public final String f4614J;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final int f4615w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final int f4616x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final int f4617y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public String f4618z;

    public C0241i(int i6, int i7, int i8, String str, IBinder iBinder, Scope[] scopeArr, Bundle bundle, Account account, U1.d[] dVarArr, U1.d[] dVarArr2, boolean z5, int i9, boolean z6, String str2) {
        Account account2;
        Scope[] scopeArr2 = scopeArr == null ? f4603K : scopeArr;
        Bundle bundle2 = bundle == null ? new Bundle() : bundle;
        U1.d[] dVarArr3 = f4604L;
        U1.d[] dVarArr4 = dVarArr == null ? dVarArr3 : dVarArr;
        dVarArr3 = dVarArr2 != null ? dVarArr2 : dVarArr3;
        this.f4615w = i6;
        this.f4616x = i7;
        this.f4617y = i8;
        if ("com.google.android.gms".equals(str)) {
            this.f4618z = "com.google.android.gms";
        } else {
            this.f4618z = str;
        }
        if (i6 < 2) {
            account2 = null;
            if (iBinder != null) {
                int i10 = AbstractBinderC0233a.f4558c;
                IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IAccountAccessor");
                IInterface q5 = iInterfaceQueryLocalInterface instanceof InterfaceC0243k ? (InterfaceC0243k) iInterfaceQueryLocalInterface : new Q(iBinder, "com.google.android.gms.common.internal.IAccountAccessor", 1);
                if (q5 != null) {
                    long jClearCallingIdentity = Binder.clearCallingIdentity();
                    try {
                        try {
                            Q q6 = (Q) q5;
                            Parcel parcelS = q6.s(q6.D(), 2);
                            Account account3 = (Account) AbstractC0847b.a(parcelS, Account.CREATOR);
                            parcelS.recycle();
                            Binder.restoreCallingIdentity(jClearCallingIdentity);
                            account2 = account3;
                        } catch (RemoteException unused) {
                            Log.w("AccountAccessor", "Remote account accessor probably died");
                            Binder.restoreCallingIdentity(jClearCallingIdentity);
                        }
                    } catch (Throwable th) {
                        Binder.restoreCallingIdentity(jClearCallingIdentity);
                        throw th;
                    }
                }
            }
        } else {
            this.f4605A = iBinder;
            account2 = account;
        }
        this.f4608D = account2;
        this.f4606B = scopeArr2;
        this.f4607C = bundle2;
        this.f4609E = dVarArr4;
        this.f4610F = dVarArr3;
        this.f4611G = z5;
        this.f4612H = i9;
        this.f4613I = z6;
        this.f4614J = str2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i6) {
        M.a(this, parcel, i6);
    }
}
