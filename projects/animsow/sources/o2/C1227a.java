package o2;

import V1.j;
import X1.AbstractC0242j;
import X1.C0237e;
import X1.C0239g;
import X1.InterfaceC0243k;
import X1.x;
import android.accounts.Account;
import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.Parcel;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import h2.AbstractC0770b;
import org.json.JSONException;
import t0.AbstractC1332d;

/* JADX INFO: renamed from: o2.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1227a extends AbstractC0242j implements n2.c {

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public final boolean f12183F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public final C0239g f12184G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public final Bundle f12185H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public final Integer f12186I;

    public C1227a(Context context, Looper looper, C0239g c0239g, Bundle bundle, V1.i iVar, j jVar) {
        super(context, looper, 44, c0239g, iVar, jVar);
        this.f12183F = true;
        this.f12184G = c0239g;
        this.f12185H = bundle;
        this.f12186I = c0239g.f4596h;
    }

    @Override // n2.c
    public final void d(e eVar) {
        GoogleSignInAccount googleSignInAccountB;
        AbstractC1332d.n(eVar, "Expecting a valid ISignInCallbacks");
        try {
            Account account = this.f12184G.f4589a;
            if (account == null) {
                account = new Account("<<default account>>", "com.google");
            }
            if ("<<default account>>".equals(account.name)) {
                S1.a aVarA = S1.a.a(this.f4570h);
                String strB = aVarA.b("defaultGoogleSignInAccount");
                if (!TextUtils.isEmpty(strB)) {
                    String strB2 = aVarA.b("googleSignInAccount:" + strB);
                    if (strB2 != null) {
                        try {
                            googleSignInAccountB = GoogleSignInAccount.b(strB2);
                        } catch (JSONException unused) {
                            googleSignInAccountB = null;
                        }
                    }
                }
                googleSignInAccountB = null;
            } else {
                googleSignInAccountB = null;
            }
            Integer num = this.f12186I;
            AbstractC1332d.m(num);
            x xVar = new x(2, account, num.intValue(), googleSignInAccountB);
            f fVar = (f) t();
            Parcel parcelObtain = Parcel.obtain();
            parcelObtain.writeInterfaceToken(fVar.f8976d);
            int i6 = AbstractC0770b.f8977a;
            parcelObtain.writeInt(1);
            int iJ0 = AbstractC1332d.J0(parcelObtain, 20293);
            AbstractC1332d.N0(parcelObtain, 1, 4);
            parcelObtain.writeInt(1);
            AbstractC1332d.D0(parcelObtain, 2, xVar, 0);
            AbstractC1332d.L0(parcelObtain, iJ0);
            parcelObtain.writeStrongBinder(eVar.asBinder());
            fVar.e(parcelObtain, 12);
        } catch (RemoteException e6) {
            Log.w("SignInClientImpl", "Remote service probably died when signIn is called");
            try {
                eVar.n(new i(1, new U1.b(8, null), null));
            } catch (RemoteException unused2) {
                Log.wtf("SignInClientImpl", "ISignInCallbacks#onSignInComplete should be executed from the same process, unexpected RemoteException.", e6);
            }
        }
    }

    @Override // n2.c
    public final void e() {
        try {
            f fVar = (f) t();
            Integer num = this.f12186I;
            AbstractC1332d.m(num);
            int iIntValue = num.intValue();
            Parcel parcelObtain = Parcel.obtain();
            parcelObtain.writeInterfaceToken(fVar.f8976d);
            parcelObtain.writeInt(iIntValue);
            fVar.e(parcelObtain, 7);
        } catch (RemoteException unused) {
            Log.w("SignInClientImpl", "Remote service probably died when clearAccountFromSessionStore is called");
        }
    }

    @Override // X1.AbstractC0238f, V1.b
    public final boolean j() {
        return this.f12183F;
    }

    @Override // n2.c
    public final void k() {
        g(new C0237e(this));
    }

    @Override // n2.c
    public final void l(InterfaceC0243k interfaceC0243k, boolean z5) {
        try {
            f fVar = (f) t();
            Integer num = this.f12186I;
            AbstractC1332d.m(num);
            int iIntValue = num.intValue();
            Parcel parcelObtain = Parcel.obtain();
            parcelObtain.writeInterfaceToken(fVar.f8976d);
            int i6 = AbstractC0770b.f8977a;
            parcelObtain.writeStrongBinder(interfaceC0243k.asBinder());
            parcelObtain.writeInt(iIntValue);
            parcelObtain.writeInt(z5 ? 1 : 0);
            fVar.e(parcelObtain, 9);
        } catch (RemoteException unused) {
            Log.w("SignInClientImpl", "Remote service probably died when saveDefaultAccount is called");
        }
    }

    @Override // X1.AbstractC0238f, V1.b
    public final int m() {
        return 12451000;
    }

    @Override // X1.AbstractC0238f
    public final IInterface o(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.signin.internal.ISignInService");
        return iInterfaceQueryLocalInterface instanceof f ? (f) iInterfaceQueryLocalInterface : new f(iBinder, "com.google.android.gms.signin.internal.ISignInService", 0);
    }

    @Override // X1.AbstractC0238f
    public final Bundle r() {
        C0239g c0239g = this.f12184G;
        boolean zEquals = this.f4570h.getPackageName().equals(c0239g.f4593e);
        Bundle bundle = this.f12185H;
        if (!zEquals) {
            bundle.putString("com.google.android.gms.signin.internal.realClientPackageName", c0239g.f4593e);
        }
        return bundle;
    }

    @Override // X1.AbstractC0238f
    public final String u() {
        return "com.google.android.gms.signin.internal.ISignInService";
    }

    @Override // X1.AbstractC0238f
    public final String v() {
        return "com.google.android.gms.signin.service.START";
    }
}
