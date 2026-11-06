package R1;

import T1.p;
import U1.f;
import a2.C0259a;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import android.os.SystemClock;
import android.util.Log;
import g2.AbstractC0728a;
import g2.c;
import g2.d;
import java.io.IOException;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;
import o1.C1224a;
import t0.AbstractC1332d;
import w0.q;

/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public U1.a f2931a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public d f2932b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f2933c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Object f2934d = new Object();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public b f2935e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Context f2936f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final long f2937g;

    public a(Context context) {
        AbstractC1332d.m(context);
        Context applicationContext = context.getApplicationContext();
        this.f2936f = applicationContext != null ? applicationContext : context;
        this.f2933c = false;
        this.f2937g = -1L;
    }

    public static q a(Context context) {
        a aVar = new a(context);
        try {
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            aVar.c();
            q qVarE = aVar.e();
            d(qVarE, SystemClock.elapsedRealtime() - jElapsedRealtime, null);
            return qVarE;
        } finally {
        }
    }

    public static void d(q qVar, long j6, Throwable th) {
        if (Math.random() <= 0.0d) {
            HashMap map = new HashMap();
            map.put("app_context", "1");
            if (qVar != null) {
                map.put("limit_ad_tracking", true != qVar.f13542c ? "0" : "1");
                String str = qVar.f13541b;
                if (str != null) {
                    map.put("ad_id_size", Integer.toString(str.length()));
                }
            }
            if (th != null) {
                map.put("error", th.getClass().getName());
            }
            map.put("tag", "AdvertisingIdClient");
            map.put("time_spent", Long.toString(j6));
            new C1224a(map).start();
        }
    }

    public final void b() {
        AbstractC1332d.j("Calling this from your main thread can lead to deadlock");
        synchronized (this) {
            try {
                if (this.f2936f == null || this.f2931a == null) {
                    return;
                }
                try {
                    if (this.f2933c) {
                        C0259a.b().c(this.f2936f, this.f2931a);
                    }
                } catch (Throwable th) {
                    Log.i("AdvertisingIdClient", "AdvertisingIdClient unbindService failed.", th);
                }
                this.f2933c = false;
                this.f2932b = null;
                this.f2931a = null;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void c() {
        AbstractC1332d.j("Calling this from your main thread can lead to deadlock");
        synchronized (this) {
            try {
                if (this.f2933c) {
                    b();
                }
                Context context = this.f2936f;
                try {
                    context.getPackageManager().getPackageInfo("com.android.vending", 0);
                    int iB = f.f3588b.b(context, 12451000);
                    if (iB != 0 && iB != 2) {
                        throw new IOException("Google Play services not available");
                    }
                    U1.a aVar = new U1.a();
                    Intent intent = new Intent("com.google.android.gms.ads.identifier.service.START");
                    intent.setPackage("com.google.android.gms");
                    try {
                        if (!C0259a.b().a(context, intent, aVar, 1)) {
                            throw new IOException("Connection failure");
                        }
                        this.f2931a = aVar;
                        try {
                            IBinder iBinderA = aVar.a(TimeUnit.MILLISECONDS);
                            int i6 = c.f8527c;
                            IInterface iInterfaceQueryLocalInterface = iBinderA.queryLocalInterface("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
                            this.f2932b = iInterfaceQueryLocalInterface instanceof d ? (d) iInterfaceQueryLocalInterface : new g2.b(iBinderA);
                            this.f2933c = true;
                        } catch (InterruptedException unused) {
                            throw new IOException("Interrupted exception");
                        } catch (Throwable th) {
                            throw new IOException(th);
                        }
                    } finally {
                        IOException iOException = new IOException(th);
                    }
                } catch (PackageManager.NameNotFoundException unused2) {
                    throw new p();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final q e() {
        q qVar;
        AbstractC1332d.j("Calling this from your main thread can lead to deadlock");
        synchronized (this) {
            try {
                if (!this.f2933c) {
                    synchronized (this.f2934d) {
                        b bVar = this.f2935e;
                        if (bVar == null || !bVar.f2941z) {
                            throw new IOException("AdvertisingIdClient is not connected.");
                        }
                    }
                    try {
                        c();
                        if (!this.f2933c) {
                            throw new IOException("AdvertisingIdClient cannot reconnect.");
                        }
                    } catch (Exception e6) {
                        throw new IOException("AdvertisingIdClient cannot reconnect.", e6);
                    }
                }
                AbstractC1332d.m(this.f2931a);
                AbstractC1332d.m(this.f2932b);
                try {
                    g2.b bVar2 = (g2.b) this.f2932b;
                    bVar2.getClass();
                    Parcel parcelObtain = Parcel.obtain();
                    parcelObtain.writeInterfaceToken("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
                    boolean z5 = true;
                    Parcel parcelB = bVar2.b(parcelObtain, 1);
                    String string = parcelB.readString();
                    parcelB.recycle();
                    g2.b bVar3 = (g2.b) this.f2932b;
                    bVar3.getClass();
                    Parcel parcelObtain2 = Parcel.obtain();
                    parcelObtain2.writeInterfaceToken("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
                    int i6 = AbstractC0728a.f8525a;
                    parcelObtain2.writeInt(1);
                    Parcel parcelB2 = bVar3.b(parcelObtain2, 2);
                    if (parcelB2.readInt() == 0) {
                        z5 = false;
                    }
                    parcelB2.recycle();
                    qVar = new q(string, z5);
                } catch (RemoteException e7) {
                    Log.i("AdvertisingIdClient", "GMS remote exception ", e7);
                    throw new IOException("Remote exception");
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        f();
        return qVar;
    }

    public final void f() {
        synchronized (this.f2934d) {
            b bVar = this.f2935e;
            if (bVar != null) {
                bVar.f2940y.countDown();
                try {
                    this.f2935e.join();
                } catch (InterruptedException unused) {
                }
            }
            long j6 = this.f2937g;
            if (j6 > 0) {
                this.f2935e = new b(this, j6);
            }
        }
    }

    public final void finalize() throws Throwable {
        b();
        super.finalize();
    }
}
