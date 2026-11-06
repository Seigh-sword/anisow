package U1;

import X1.C;
import X1.D;
import X1.E;
import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import android.util.Log;
import b2.AbstractC0338c;
import f2.C0698b;
import j2.AbstractC0847b;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.concurrent.Callable;
import t0.AbstractC1332d;

/* JADX INFO: loaded from: classes.dex */
public abstract class r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final m f3611a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final m f3612b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static volatile E f3613c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final Object f3614d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static Context f3615e;

    static {
        new m(0, n.e("0\u0082\u0005È0\u0082\u0003° \u0003\u0002\u0001\u0002\u0002\u0014\u0010\u008ae\bsù/\u008eQí"));
        new m(1, n.e("0\u0082\u0006\u00040\u0082\u0003ì \u0003\u0002\u0001\u0002\u0002\u0014\u0003£²\u00ad×árÊkì"));
        f3611a = new m(2, n.e("0\u0082\u0004C0\u0082\u0003+ \u0003\u0002\u0001\u0002\u0002\t\u0000Âà\u0087FdJ0\u008d0"));
        f3612b = new m(3, n.e("0\u0082\u0004¨0\u0082\u0003\u0090 \u0003\u0002\u0001\u0002\u0002\t\u0000Õ\u0085¸l}ÓNõ0"));
        f3614d = new Object();
    }

    /* JADX WARN: Type inference failed for: r13v3, types: [U1.l] */
    public static w a(final String str, final n nVar, final boolean z5, boolean z6) {
        n nVar2;
        try {
            b();
            AbstractC1332d.m(f3615e);
            try {
                E e6 = f3613c;
                e2.b bVar = new e2.b(f3615e.getPackageManager());
                C c6 = (C) e6;
                Parcel parcelD = c6.D();
                int i6 = AbstractC0847b.f9445a;
                boolean z7 = true;
                parcelD.writeInt(1);
                int iJ0 = AbstractC1332d.J0(parcelD, 20293);
                AbstractC1332d.F0(parcelD, 1, str);
                if (nVar == null) {
                    Log.w("GoogleCertificatesQuery", "certificate binder is null");
                    nVar2 = null;
                } else {
                    nVar2 = nVar;
                }
                AbstractC1332d.z0(parcelD, 2, nVar2);
                AbstractC1332d.N0(parcelD, 3, 4);
                parcelD.writeInt(z5 ? 1 : 0);
                AbstractC1332d.N0(parcelD, 4, 4);
                parcelD.writeInt(z6 ? 1 : 0);
                AbstractC1332d.L0(parcelD, iJ0);
                AbstractC0847b.c(parcelD, bVar);
                Parcel parcelS = c6.s(parcelD, 5);
                if (parcelS.readInt() == 0) {
                    z7 = false;
                }
                parcelS.recycle();
                return z7 ? w.f3631d : new v(new Callable() { // from class: U1.l
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        MessageDigest messageDigest;
                        boolean z8 = z5;
                        String str2 = str;
                        n nVar3 = nVar;
                        String str3 = (z8 || !r.a(str2, nVar3, true, false).f3632a) ? "not allowed" : "debug cert rejected";
                        int i7 = 0;
                        while (true) {
                            if (i7 >= 2) {
                                messageDigest = null;
                                break;
                            }
                            try {
                                messageDigest = MessageDigest.getInstance("SHA-256");
                            } catch (NoSuchAlgorithmException unused) {
                            }
                            if (messageDigest != null) {
                                break;
                            }
                            i7++;
                        }
                        AbstractC1332d.m(messageDigest);
                        byte[] bArrDigest = messageDigest.digest(nVar3.s());
                        int length = bArrDigest.length;
                        char[] cArr = new char[length + length];
                        int i8 = 0;
                        for (byte b6 : bArrDigest) {
                            char[] cArr2 = AbstractC0338c.f5917b;
                            cArr[i8] = cArr2[(b6 & 255) >>> 4];
                            cArr[i8 + 1] = cArr2[b6 & 15];
                            i8 += 2;
                        }
                        return str3 + ": pkg=" + str2 + ", sha256=" + new String(cArr) + ", atk=" + z8 + ", ver=12451000.false";
                    }
                });
            } catch (RemoteException e7) {
                Log.e("GoogleCertificates", "Failed to get Google certificates from remote", e7);
                return new w(false, "module call", e7);
            }
        } catch (C0698b e8) {
            Log.e("GoogleCertificates", "Failed to get Google certificates from remote", e8);
            return new w(false, "module init: ".concat(String.valueOf(e8.getMessage())), e8);
        }
    }

    public static void b() {
        E c6;
        if (f3613c != null) {
            return;
        }
        AbstractC1332d.m(f3615e);
        synchronized (f3614d) {
            try {
                if (f3613c == null) {
                    IBinder iBinderB = f2.f.c(f3615e, f2.f.f8404c, "com.google.android.gms.googlecertificates").b("com.google.android.gms.common.GoogleCertificatesImpl");
                    int i6 = D.f4519c;
                    if (iBinderB == null) {
                        c6 = null;
                    } else {
                        IInterface iInterfaceQueryLocalInterface = iBinderB.queryLocalInterface("com.google.android.gms.common.internal.IGoogleCertificatesApi");
                        c6 = iInterfaceQueryLocalInterface instanceof E ? (E) iInterfaceQueryLocalInterface : new C(iBinderB, "com.google.android.gms.common.internal.IGoogleCertificatesApi", 1);
                    }
                    f3613c = c6;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
