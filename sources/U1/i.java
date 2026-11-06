package U1;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.Signature;
import android.util.Log;
import java.util.concurrent.CopyOnWriteArraySet;
import n1.AbstractC1147c;
import n1.InterfaceC1145a;
import t0.AbstractC1332d;

/* JADX INFO: loaded from: classes.dex */
public final class i implements C1.g {

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static i f3594y;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final Object f3595w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public volatile Object f3596x;

    public i() {
        this.f3595w = new CopyOnWriteArraySet();
    }

    public static i c(Context context) {
        AbstractC1332d.m(context);
        synchronized (i.class) {
            try {
                if (f3594y == null) {
                    m mVar = r.f3611a;
                    synchronized (r.class) {
                        if (r.f3615e == null) {
                            r.f3615e = context.getApplicationContext();
                        } else {
                            Log.w("GoogleCertificates", "GoogleCertificates has been initialized already");
                        }
                    }
                    f3594y = new i(context);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return f3594y;
    }

    public static final n e(PackageInfo packageInfo, n... nVarArr) {
        Signature[] signatureArr = packageInfo.signatures;
        if (signatureArr != null) {
            if (signatureArr.length != 1) {
                Log.w("GoogleSignatureVerifier", "Package has more than one signature.");
                return null;
            }
            o oVar = new o(packageInfo.signatures[0].toByteArray());
            for (int i6 = 0; i6 < nVarArr.length; i6++) {
                if (nVarArr[i6].equals(oVar)) {
                    return nVarArr[i6];
                }
            }
        }
        return null;
    }

    public static final boolean f(PackageInfo packageInfo, boolean z5) {
        PackageInfo packageInfo2;
        if (!z5) {
            packageInfo2 = packageInfo;
        } else if (packageInfo != null) {
            if ("com.android.vending".equals(packageInfo.packageName) || "com.google.android.gms".equals(packageInfo.packageName)) {
                ApplicationInfo applicationInfo = packageInfo.applicationInfo;
                z5 = (applicationInfo == null || (applicationInfo.flags & 129) == 0) ? false : true;
            }
            packageInfo2 = packageInfo;
        } else {
            packageInfo2 = null;
        }
        if (packageInfo != null && packageInfo2.signatures != null) {
            n[] nVarArr = q.f3610a;
            if ((z5 ? e(packageInfo2, nVarArr) : e(packageInfo2, nVarArr[0])) != null) {
                return true;
            }
        }
        return false;
    }

    @Override // C1.g
    public final Object a() {
        if (this.f3596x == null) {
            synchronized (this) {
                try {
                    if (this.f3596x == null) {
                        Object objA = ((C1.g) this.f3595w).a();
                        AbstractC1332d.l(objA, "Argument must not be null");
                        this.f3596x = objA;
                    }
                } finally {
                }
            }
        }
        return this.f3596x;
    }

    public final InterfaceC1145a b() {
        if (((InterfaceC1145a) this.f3596x) == null) {
            synchronized (this) {
                try {
                    if (((InterfaceC1145a) this.f3596x) == null) {
                        this.f3596x = ((AbstractC1147c) this.f3595w).a();
                    }
                    if (((InterfaceC1145a) this.f3596x) == null) {
                        this.f3596x = new I0.o(8);
                    }
                } finally {
                }
            }
        }
        return (InterfaceC1145a) this.f3596x;
    }

    /* JADX WARN: Removed duplicated region for block: B:78:0x01ab  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean d(int r18) {
        /*
            Method dump skipped, instruction units count: 530
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: U1.i.d(int):boolean");
    }

    public i(Context context) {
        this.f3595w = context.getApplicationContext();
    }

    public /* synthetic */ i(Object obj) {
        this.f3595w = obj;
    }
}
