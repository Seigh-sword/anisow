package m2;

import a2.C0259a;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.os.Looper;
import com.google.android.gms.internal.measurement.I3;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;
import t0.AbstractC1332d;
import v0.C1401j;

/* JADX INFO: loaded from: classes.dex */
public final class Y0 extends X {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public volatile Boolean f10825A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public final Z0 f10826B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public final C1401j f10827C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public final ArrayList f10828D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public final Z0 f10829E;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final ServiceConnectionC1040g1 f10830y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public G f10831z;

    public Y0(C1051k0 c1051k0) {
        super(c1051k0);
        this.f10828D = new ArrayList();
        this.f10827C = new C1401j(c1051k0.f10988J);
        this.f10830y = new ServiceConnectionC1040g1(this);
        this.f10826B = new Z0(this, c1051k0, 0);
        this.f10829E = new Z0(this, c1051k0, 1);
    }

    @Override // m2.X
    public final boolean A() {
        return false;
    }

    public final void B(Runnable runnable) {
        r();
        if (I()) {
            runnable.run();
            return;
        }
        ArrayList arrayList = this.f10828D;
        if (arrayList.size() >= 1000) {
            f().f10715B.d("Discarding data. Max runnable queue size reached");
            return;
        }
        arrayList.add(runnable);
        this.f10829E.b(60000L);
        G();
    }

    public final void C(AtomicReference atomicReference) {
        r();
        y();
        B(new K.a(this, atomicReference, N(false), 16));
    }

    public final void D(C1029d c1029d) {
        boolean zC;
        r();
        y();
        I iT = t();
        iT.q();
        byte[] bArrG0 = K1.g0(c1029d);
        if (bArrG0.length > 131072) {
            iT.f().f10716C.d("Conditional user property too long for local database. Sending directly to service");
            zC = false;
        } else {
            zC = iT.C(2, bArrG0);
        }
        boolean z5 = zC;
        B(new RunnableC1031d1(this, N(true), z5, new C1029d(c1029d), c1029d));
    }

    /* JADX WARN: Removed duplicated region for block: B:127:0x020e A[Catch: all -> 0x00e8, TRY_ENTER, TryCatch #2 {all -> 0x00e8, blocks: (B:33:0x00b8, B:35:0x00be, B:37:0x00cc, B:39:0x00df, B:41:0x00e4, B:56:0x0113, B:57:0x0116, B:55:0x010f, B:60:0x011a, B:62:0x012e, B:77:0x0156, B:78:0x015a, B:79:0x015d, B:75:0x0150, B:82:0x0161, B:86:0x0177, B:100:0x0198, B:137:0x0231, B:127:0x020e, B:129:0x0214, B:130:0x0217, B:145:0x0247, B:101:0x019d, B:102:0x01a0, B:98:0x0192, B:105:0x01a6, B:106:0x01ae, B:107:0x01b2, B:110:0x01c8, B:112:0x01d6, B:114:0x01e2, B:119:0x01f2), top: B:217:0x00b8 }] */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0225  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x0238  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x023d A[PHI: r12 r14 r15 r18
      0x023d: PHI (r12v11 android.database.sqlite.SQLiteDatabase) = 
      (r12v8 android.database.sqlite.SQLiteDatabase)
      (r12v9 android.database.sqlite.SQLiteDatabase)
      (r12v12 android.database.sqlite.SQLiteDatabase)
     binds: [B:133:0x0228, B:148:0x0258, B:141:0x023b] A[DONT_GENERATE, DONT_INLINE]
      0x023d: PHI (r14v3 int) = (r14v1 int), (r14v1 int), (r14v4 int) binds: [B:133:0x0228, B:148:0x0258, B:141:0x023b] A[DONT_GENERATE, DONT_INLINE]
      0x023d: PHI (r15v8 int) = (r15v5 int), (r15v6 int), (r15v9 int) binds: [B:133:0x0228, B:148:0x0258, B:141:0x023b] A[DONT_GENERATE, DONT_INLINE]
      0x023d: PHI (r18v7 int) = (r18v4 int), (r18v5 int), (r18v8 int) binds: [B:133:0x0228, B:148:0x0258, B:141:0x023b] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:147:0x0255  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x0267  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x026c  */
    /* JADX WARN: Removed duplicated region for block: B:267:0x025b A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:268:0x025b A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:270:0x025b A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void E(m2.G r29, Y1.a r30, m2.B1 r31) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 950
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: m2.Y0.E(m2.G, Y1.a, m2.B1):void");
    }

    public final void F(boolean z5) {
        r();
        y();
        I3.a();
        if (!n().D(null, AbstractC1078w.f11165W0) && z5) {
            t().D();
        }
        if (J()) {
            B(new RunnableC1025b1(this, N(false), 4));
        }
    }

    public final void G() {
        r();
        y();
        if (I()) {
            return;
        }
        if (K()) {
            ServiceConnectionC1040g1 serviceConnectionC1040g1 = this.f10830y;
            serviceConnectionC1040g1.f10916y.r();
            Context contextA = serviceConnectionC1040g1.f10916y.a();
            synchronized (serviceConnectionC1040g1) {
                try {
                    if (serviceConnectionC1040g1.f10914w) {
                        serviceConnectionC1040g1.f10916y.f().f10723J.d("Connection attempt already in progress");
                    } else if (serviceConnectionC1040g1.f10915x == null || !(serviceConnectionC1040g1.f10915x.x() || serviceConnectionC1040g1.f10915x.a())) {
                        serviceConnectionC1040g1.f10915x = new L(contextA, Looper.getMainLooper(), X1.P.a(contextA), U1.f.f3588b, 93, serviceConnectionC1040g1, serviceConnectionC1040g1, null);
                        serviceConnectionC1040g1.f10916y.f().f10723J.d("Connecting to remote service");
                        serviceConnectionC1040g1.f10914w = true;
                        AbstractC1332d.m(serviceConnectionC1040g1.f10915x);
                        serviceConnectionC1040g1.f10915x.n();
                    } else {
                        serviceConnectionC1040g1.f10916y.f().f10723J.d("Already awaiting connection attempt");
                    }
                } finally {
                }
            }
            return;
        }
        if (n().G()) {
            return;
        }
        List<ResolveInfo> listQueryIntentServices = a().getPackageManager().queryIntentServices(new Intent().setClassName(a(), "com.google.android.gms.measurement.AppMeasurementService"), 65536);
        if (listQueryIntentServices == null || listQueryIntentServices.isEmpty()) {
            f().f10715B.d("Unable to use remote or local measurement implementation. Please register the AppMeasurementService service in the app manifest");
            return;
        }
        Intent intent = new Intent("com.google.android.gms.measurement.START");
        intent.setComponent(new ComponentName(a(), "com.google.android.gms.measurement.AppMeasurementService"));
        ServiceConnectionC1040g1 serviceConnectionC1040g12 = this.f10830y;
        serviceConnectionC1040g12.f10916y.r();
        Context contextA2 = serviceConnectionC1040g12.f10916y.a();
        C0259a c0259aB = C0259a.b();
        synchronized (serviceConnectionC1040g12) {
            try {
                if (serviceConnectionC1040g12.f10914w) {
                    serviceConnectionC1040g12.f10916y.f().f10723J.d("Connection attempt already in progress");
                } else {
                    serviceConnectionC1040g12.f10916y.f().f10723J.d("Using local app measurement service");
                    serviceConnectionC1040g12.f10914w = true;
                    c0259aB.a(contextA2, intent, serviceConnectionC1040g12.f10916y.f10830y, 129);
                }
            } finally {
            }
        }
    }

    public final void H() {
        r();
        y();
        ServiceConnectionC1040g1 serviceConnectionC1040g1 = this.f10830y;
        if (serviceConnectionC1040g1.f10915x != null && (serviceConnectionC1040g1.f10915x.a() || serviceConnectionC1040g1.f10915x.x())) {
            serviceConnectionC1040g1.f10915x.h();
        }
        serviceConnectionC1040g1.f10915x = null;
        try {
            C0259a.b().c(a(), this.f10830y);
        } catch (IllegalArgumentException | IllegalStateException unused) {
        }
        this.f10831z = null;
    }

    public final boolean I() {
        r();
        y();
        return this.f10831z != null;
    }

    public final boolean J() {
        r();
        y();
        return !K() || q().v0() >= ((Integer) AbstractC1078w.f11219s0.a(null)).intValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00fa  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean K() {
        /*
            Method dump skipped, instruction units count: 285
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: m2.Y0.K():boolean");
    }

    public final void L() {
        r();
        N nF = f();
        ArrayList arrayList = this.f10828D;
        nF.f10723J.c(Integer.valueOf(arrayList.size()), "Processing queued up service tasks");
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            try {
                ((Runnable) it.next()).run();
            } catch (RuntimeException e6) {
                f().f10715B.c(e6, "Task exception while flushing queue");
            }
        }
        arrayList.clear();
        this.f10829E.a();
    }

    public final void M() {
        r();
        this.f10827C.j();
        this.f10826B.b(((Long) AbstractC1078w.f11142L.a(null)).longValue());
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:6:0x0016  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final m2.B1 N(boolean r46) {
        /*
            Method dump skipped, instruction units count: 1041
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: m2.Y0.N(boolean):m2.B1");
    }
}
