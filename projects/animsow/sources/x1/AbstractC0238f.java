package X1;

import android.accounts.Account;
import android.content.Context;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.api.Scope;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.Locale;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;
import t0.AbstractC1332d;
import w1.C1474r;

/* JADX INFO: renamed from: X1.f, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0238f {

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public static final U1.d[] f4560C = new U1.d[0];

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f4563a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f4564b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f4565c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f4566d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f4567e;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public C1474r f4569g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Context f4570h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final P f4571i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final U1.f f4572j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final G f4573k;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public B f4576n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public InterfaceC0236d f4577o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public IInterface f4578p;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public I f4580r;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final InterfaceC0234b f4582t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final InterfaceC0235c f4583u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final int f4584v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final String f4585w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public volatile String f4586x;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public volatile String f4568f = null;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final Object f4574l = new Object();

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final Object f4575m = new Object();

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final ArrayList f4579q = new ArrayList();

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f4581s = 1;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public U1.b f4587y = null;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public boolean f4588z = false;

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public volatile L f4561A = null;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public final AtomicInteger f4562B = new AtomicInteger(0);

    public AbstractC0238f(Context context, Looper looper, P p5, U1.f fVar, int i6, InterfaceC0234b interfaceC0234b, InterfaceC0235c interfaceC0235c, String str) {
        AbstractC1332d.n(context, "Context must not be null");
        this.f4570h = context;
        AbstractC1332d.n(looper, "Looper must not be null");
        AbstractC1332d.n(p5, "Supervisor must not be null");
        this.f4571i = p5;
        AbstractC1332d.n(fVar, "API availability must not be null");
        this.f4572j = fVar;
        this.f4573k = new G(this, looper);
        this.f4584v = i6;
        this.f4582t = interfaceC0234b;
        this.f4583u = interfaceC0235c;
        this.f4585w = str;
    }

    public static /* bridge */ /* synthetic */ boolean y(AbstractC0238f abstractC0238f, int i6, int i7, IInterface iInterface) {
        synchronized (abstractC0238f.f4574l) {
            try {
                if (abstractC0238f.f4581s != i6) {
                    return false;
                }
                abstractC0238f.z(i7, iInterface);
                return true;
            } finally {
            }
        }
    }

    public final boolean a() {
        boolean z5;
        synchronized (this.f4574l) {
            z5 = this.f4581s == 4;
        }
        return z5;
    }

    public final void b(String str, PrintWriter printWriter) {
        int i6;
        IInterface iInterface;
        B b6;
        synchronized (this.f4574l) {
            i6 = this.f4581s;
            iInterface = this.f4578p;
        }
        synchronized (this.f4575m) {
            b6 = this.f4576n;
        }
        printWriter.append((CharSequence) str).append("mConnectState=");
        printWriter.print(i6 != 1 ? i6 != 2 ? i6 != 3 ? i6 != 4 ? i6 != 5 ? "UNKNOWN" : "DISCONNECTING" : "CONNECTED" : "LOCAL_CONNECTING" : "REMOTE_CONNECTING" : "DISCONNECTED");
        printWriter.append(" mService=");
        if (iInterface == null) {
            printWriter.append("null");
        } else {
            printWriter.append((CharSequence) u()).append("@").append((CharSequence) Integer.toHexString(System.identityHashCode(iInterface.asBinder())));
        }
        printWriter.append(" mServiceBroker=");
        if (b6 == null) {
            printWriter.println("null");
        } else {
            printWriter.append("IGmsServiceBroker@").println(Integer.toHexString(System.identityHashCode(b6.f4518c)));
        }
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS", Locale.US);
        if (this.f4565c > 0) {
            PrintWriter printWriterAppend = printWriter.append((CharSequence) str).append("lastConnectedTime=");
            long j6 = this.f4565c;
            printWriterAppend.println(j6 + " " + simpleDateFormat.format(new Date(j6)));
        }
        if (this.f4564b > 0) {
            printWriter.append((CharSequence) str).append("lastSuspendedCause=");
            int i7 = this.f4563a;
            printWriter.append((CharSequence) (i7 != 1 ? i7 != 2 ? i7 != 3 ? String.valueOf(i7) : "CAUSE_DEAD_OBJECT_EXCEPTION" : "CAUSE_NETWORK_LOST" : "CAUSE_SERVICE_DISCONNECTED"));
            PrintWriter printWriterAppend2 = printWriter.append(" lastSuspendedTime=");
            long j7 = this.f4564b;
            printWriterAppend2.println(j7 + " " + simpleDateFormat.format(new Date(j7)));
        }
        if (this.f4567e > 0) {
            printWriter.append((CharSequence) str).append("lastFailedStatus=").append((CharSequence) AbstractC1332d.I(this.f4566d));
            PrintWriter printWriterAppend3 = printWriter.append(" lastFailedTime=");
            long j8 = this.f4567e;
            printWriterAppend3.println(j8 + " " + simpleDateFormat.format(new Date(j8)));
        }
    }

    public final void c(InterfaceC0243k interfaceC0243k, Set set) {
        Bundle bundleR = r();
        String str = this.f4586x;
        int i6 = U1.f.f3587a;
        Scope[] scopeArr = C0241i.f4603K;
        Bundle bundle = new Bundle();
        int i7 = this.f4584v;
        U1.d[] dVarArr = C0241i.f4604L;
        C0241i c0241i = new C0241i(6, i7, i6, null, null, scopeArr, bundle, null, dVarArr, dVarArr, true, 0, false, str);
        c0241i.f4618z = this.f4570h.getPackageName();
        c0241i.f4607C = bundleR;
        if (set != null) {
            c0241i.f4606B = (Scope[]) set.toArray(new Scope[0]);
        }
        if (j()) {
            Account accountP = p();
            if (accountP == null) {
                accountP = new Account("<<default account>>", "com.google");
            }
            c0241i.f4608D = accountP;
            if (interfaceC0243k != null) {
                c0241i.f4605A = interfaceC0243k.asBinder();
            }
        }
        c0241i.f4609E = f4560C;
        c0241i.f4610F = q();
        try {
            synchronized (this.f4575m) {
                try {
                    B b6 = this.f4576n;
                    if (b6 != null) {
                        b6.b(new H(this, this.f4562B.get()), c0241i);
                    } else {
                        Log.w("GmsClient", "mServiceBroker is null, client disconnected");
                    }
                } finally {
                }
            }
        } catch (DeadObjectException e6) {
            Log.w("GmsClient", "IGmsServiceBroker.getService failed", e6);
            int i8 = this.f4562B.get();
            G g4 = this.f4573k;
            g4.sendMessage(g4.obtainMessage(6, i8, 3));
        } catch (RemoteException e7) {
            e = e7;
            Log.w("GmsClient", "IGmsServiceBroker.getService failed", e);
            int i9 = this.f4562B.get();
            J j6 = new J(this, 8, null, null);
            G g6 = this.f4573k;
            g6.sendMessage(g6.obtainMessage(1, i9, -1, j6));
        } catch (SecurityException e8) {
            throw e8;
        } catch (RuntimeException e9) {
            e = e9;
            Log.w("GmsClient", "IGmsServiceBroker.getService failed", e);
            int i92 = this.f4562B.get();
            J j62 = new J(this, 8, null, null);
            G g62 = this.f4573k;
            g62.sendMessage(g62.obtainMessage(1, i92, -1, j62));
        }
    }

    public final void g(InterfaceC0236d interfaceC0236d) {
        AbstractC1332d.n(interfaceC0236d, "Connection progress callbacks cannot be null.");
        this.f4577o = interfaceC0236d;
        z(2, null);
    }

    public final void h() {
        this.f4562B.incrementAndGet();
        synchronized (this.f4579q) {
            try {
                int size = this.f4579q.size();
                for (int i6 = 0; i6 < size; i6++) {
                    z zVar = (z) this.f4579q.get(i6);
                    synchronized (zVar) {
                        zVar.f4667a = null;
                    }
                }
                this.f4579q.clear();
            } catch (Throwable th) {
                throw th;
            }
        }
        synchronized (this.f4575m) {
            this.f4576n = null;
        }
        z(1, null);
    }

    public final void i(String str) {
        this.f4568f = str;
        h();
    }

    public boolean j() {
        return false;
    }

    public abstract int m();

    public final void n() {
        int iB = this.f4572j.b(this.f4570h, m());
        if (iB == 0) {
            g(new C0237e(this));
            return;
        }
        z(1, null);
        this.f4577o = new C0237e(this);
        int i6 = this.f4562B.get();
        G g4 = this.f4573k;
        g4.sendMessage(g4.obtainMessage(3, i6, iB, null));
    }

    public abstract IInterface o(IBinder iBinder);

    public Account p() {
        return null;
    }

    public U1.d[] q() {
        return f4560C;
    }

    public Bundle r() {
        return new Bundle();
    }

    public Set s() {
        return Collections.emptySet();
    }

    public final IInterface t() {
        IInterface iInterface;
        synchronized (this.f4574l) {
            try {
                if (this.f4581s == 5) {
                    throw new DeadObjectException();
                }
                if (!a()) {
                    throw new IllegalStateException("Not connected. Call connect() and wait for onConnected() to be called.");
                }
                iInterface = this.f4578p;
                AbstractC1332d.n(iInterface, "Client is connected but service is null");
            } catch (Throwable th) {
                throw th;
            }
        }
        return iInterface;
    }

    public abstract String u();

    public abstract String v();

    public boolean w() {
        return m() >= 211700000;
    }

    public final boolean x() {
        boolean z5;
        synchronized (this.f4574l) {
            int i6 = this.f4581s;
            z5 = true;
            if (i6 != 2 && i6 != 3) {
                z5 = false;
            }
        }
        return z5;
    }

    public final void z(int i6, IInterface iInterface) {
        C1474r c1474r;
        AbstractC1332d.c((i6 == 4) == (iInterface != null));
        synchronized (this.f4574l) {
            try {
                this.f4581s = i6;
                this.f4578p = iInterface;
                if (i6 == 1) {
                    I i7 = this.f4580r;
                    if (i7 != null) {
                        P p5 = this.f4571i;
                        String str = (String) this.f4569g.f13586z;
                        AbstractC1332d.m(str);
                        String str2 = (String) this.f4569g.f13584x;
                        if (this.f4585w == null) {
                            this.f4570h.getClass();
                        }
                        p5.b(str, str2, i7, this.f4569g.f13585y);
                        this.f4580r = null;
                    }
                } else if (i6 == 2 || i6 == 3) {
                    I i8 = this.f4580r;
                    if (i8 != null && (c1474r = this.f4569g) != null) {
                        Log.e("GmsClient", "Calling connect() while still connected, missing disconnect() for " + ((String) c1474r.f13586z) + " on " + ((String) c1474r.f13584x));
                        P p6 = this.f4571i;
                        String str3 = (String) this.f4569g.f13586z;
                        AbstractC1332d.m(str3);
                        String str4 = (String) this.f4569g.f13584x;
                        if (this.f4585w == null) {
                            this.f4570h.getClass();
                        }
                        p6.b(str3, str4, i8, this.f4569g.f13585y);
                        this.f4562B.incrementAndGet();
                    }
                    I i9 = new I(this, this.f4562B.get());
                    this.f4580r = i9;
                    C1474r c1474r2 = new C1474r(v(), w(), 0);
                    this.f4569g = c1474r2;
                    if (c1474r2.f13585y && m() < 17895000) {
                        throw new IllegalStateException("Internal Error, the minimum apk version of this BaseGmsClient is too low to support dynamic lookup. Start service action: ".concat(String.valueOf((String) this.f4569g.f13586z)));
                    }
                    P p7 = this.f4571i;
                    String str5 = (String) this.f4569g.f13586z;
                    AbstractC1332d.m(str5);
                    String str6 = (String) this.f4569g.f13584x;
                    String name = this.f4585w;
                    if (name == null) {
                        name = this.f4570h.getClass().getName();
                    }
                    if (!p7.c(new N(str5, str6, this.f4569g.f13585y), i9, name, null)) {
                        C1474r c1474r3 = this.f4569g;
                        Log.w("GmsClient", "unable to connect to service: " + ((String) c1474r3.f13586z) + " on " + ((String) c1474r3.f13584x));
                        int i10 = this.f4562B.get();
                        K k5 = new K(this, 16);
                        G g4 = this.f4573k;
                        g4.sendMessage(g4.obtainMessage(7, i10, -1, k5));
                    }
                } else if (i6 == 4) {
                    AbstractC1332d.m(iInterface);
                    this.f4565c = System.currentTimeMillis();
                }
            } finally {
            }
        }
    }
}
