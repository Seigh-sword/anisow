package m2;

import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import b2.C0337b;
import b2.InterfaceC0336a;
import com.google.android.gms.internal.measurement.AbstractC0420g2;
import com.google.android.gms.internal.measurement.C0396c2;
import com.google.android.gms.internal.measurement.C0432i2;
import com.google.android.gms.internal.measurement.C0436j0;
import com.google.android.gms.internal.measurement.C0460n0;
import com.google.android.gms.internal.measurement.C0462n2;
import com.google.android.gms.internal.measurement.Y1;
import com.google.android.gms.internal.measurement.Z1;
import java.util.concurrent.atomic.AtomicInteger;
import m.RunnableC0969k;
import t0.AbstractC1332d;

/* JADX INFO: renamed from: m2.k0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1051k0 implements InterfaceC1079w0 {

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public static volatile C1051k0 f10978e0;

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public final boolean f10979A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public final V0.m f10980B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public final C1032e f10981C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public final Y f10982D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public final N f10983E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public final C1042h0 f10984F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public final C1052k1 f10985G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public final K1 f10986H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public final K f10987I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    public final C0337b f10988J;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    public final U0 f10989K;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public final G0 f10990L;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    public final C1067q f10991M;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    public final R0 f10992N;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public final String f10993O;

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    public I f10994P;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    public Y0 f10995Q;

    /* JADX INFO: renamed from: R, reason: collision with root package name */
    public C1065p f10996R;

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    public J f10997S;

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    public Boolean f10999U;

    /* JADX INFO: renamed from: V, reason: collision with root package name */
    public long f11000V;

    /* JADX INFO: renamed from: W, reason: collision with root package name */
    public volatile Boolean f11001W;

    /* JADX INFO: renamed from: X, reason: collision with root package name */
    public final Boolean f11002X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public final Boolean f11003Y;

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    public volatile boolean f11004Z;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public int f11005a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public int f11006b0;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public final long f11008d0;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final Context f11009w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final String f11010x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final String f11011y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final String f11012z;

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    public boolean f10998T = false;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    public final AtomicInteger f11007c0 = new AtomicInteger(0);

    public C1051k0(E0 e02) {
        Bundle bundle;
        int i6 = 0;
        Context context = e02.f10551a;
        int i7 = 1;
        V0.m mVar = new V0.m(i7, i6);
        this.f10980B = mVar;
        f2.h.f8419c = mVar;
        this.f11009w = context;
        this.f11010x = e02.f10552b;
        this.f11011y = e02.f10553c;
        this.f11012z = e02.f10554d;
        this.f10979A = e02.f10558h;
        this.f11001W = e02.f10555e;
        this.f10993O = e02.f10560j;
        this.f11004Z = true;
        C0436j0 c0436j0 = e02.f10557g;
        if (c0436j0 != null && (bundle = c0436j0.f6842C) != null) {
            Object obj = bundle.get("measurementEnabled");
            if (obj instanceof Boolean) {
                this.f11002X = (Boolean) obj;
            }
            Object obj2 = c0436j0.f6842C.get("measurementDeactivated");
            if (obj2 instanceof Boolean) {
                this.f11003Y = (Boolean) obj2;
            }
        }
        if (AbstractC0420g2.f6818h == null && context != null) {
            Object obj3 = AbstractC0420g2.f6817g;
            synchronized (obj3) {
                try {
                    if (AbstractC0420g2.f6818h == null) {
                        synchronized (obj3) {
                            Z1 z12 = AbstractC0420g2.f6818h;
                            Context applicationContext = context.getApplicationContext();
                            applicationContext = applicationContext == null ? context : applicationContext;
                            if (z12 == null || z12.f6752a != applicationContext) {
                                if (z12 != null) {
                                    Y1.d();
                                    C0462n2.a();
                                    C0396c2.S();
                                }
                                C0432i2 c0432i2 = new C0432i2();
                                c0432i2.f6836w = applicationContext;
                                AbstractC0420g2.f6818h = new Z1(applicationContext, f2.h.z(c0432i2));
                                AbstractC0420g2.f6820j.incrementAndGet();
                            }
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                } finally {
                }
            }
        }
        this.f10988J = C0337b.f5915a;
        Long l5 = e02.f10559i;
        this.f11008d0 = l5 != null ? l5.longValue() : System.currentTimeMillis();
        C1032e c1032e = new C1032e(this);
        c1032e.f10887z = new P2.e();
        this.f10981C = c1032e;
        Y y5 = new Y(this);
        y5.t();
        this.f10982D = y5;
        N n5 = new N(this);
        n5.t();
        this.f10983E = n5;
        K1 k12 = new K1(this);
        k12.t();
        this.f10986H = k12;
        this.f10987I = new K(new K1.b(this));
        this.f10991M = new C1067q(this);
        U0 u02 = new U0(this);
        u02.z();
        this.f10989K = u02;
        G0 g02 = new G0(this);
        g02.z();
        this.f10990L = g02;
        C1052k1 c1052k1 = new C1052k1(this);
        c1052k1.z();
        this.f10985G = c1052k1;
        R0 r02 = new R0(this);
        r02.t();
        this.f10992N = r02;
        C1042h0 c1042h0 = new C1042h0(this);
        c1042h0.t();
        this.f10984F = c1042h0;
        C0436j0 c0436j02 = e02.f10557g;
        if (c0436j02 != null && c0436j02.f6845x != 0) {
            i6 = 1;
        }
        int i8 = i6 ^ 1;
        if (context.getApplicationContext() instanceof Application) {
            d(g02);
            if (g02.a().getApplicationContext() instanceof Application) {
                Application application = (Application) g02.a().getApplicationContext();
                if (g02.f10630y == null) {
                    g02.f10630y = new C0460n0(i7, g02);
                }
                if (i8 != 0) {
                    application.unregisterActivityLifecycleCallbacks(g02.f10630y);
                    application.registerActivityLifecycleCallbacks(g02.f10630y);
                    g02.f().f10723J.d("Registered activity lifecycle callback");
                }
            }
        } else {
            i(n5);
            n5.f10718E.d("Application context is not an Application");
        }
        c1042h0.A(new RunnableC0969k(this, 22, e02));
    }

    public static C1051k0 b(Context context, C0436j0 c0436j0, Long l5) {
        Bundle bundle;
        if (c0436j0 != null && (c0436j0.f6840A == null || c0436j0.f6841B == null)) {
            c0436j0 = new C0436j0(c0436j0.f6844w, c0436j0.f6845x, c0436j0.f6846y, c0436j0.f6847z, null, null, c0436j0.f6842C, null);
        }
        AbstractC1332d.m(context);
        AbstractC1332d.m(context.getApplicationContext());
        if (f10978e0 == null) {
            synchronized (C1051k0.class) {
                try {
                    if (f10978e0 == null) {
                        f10978e0 = new C1051k0(new E0(context, c0436j0, l5));
                    }
                } finally {
                }
            }
        } else if (c0436j0 != null && (bundle = c0436j0.f6842C) != null && bundle.containsKey("dataCollectionDefaultEnabled")) {
            AbstractC1332d.m(f10978e0);
            f10978e0.f11001W = Boolean.valueOf(c0436j0.f6842C.getBoolean("dataCollectionDefaultEnabled"));
        }
        AbstractC1332d.m(f10978e0);
        return f10978e0;
    }

    public static void d(X x5) {
        if (x5 == null) {
            throw new IllegalStateException("Component not created");
        }
        if (!x5.f10797x) {
            throw new IllegalStateException("Component not initialized: ".concat(String.valueOf(x5.getClass())));
        }
    }

    public static void e(AbstractC1081x0 abstractC1081x0) {
        if (abstractC1081x0 == null) {
            throw new IllegalStateException("Component not created");
        }
    }

    public static void i(AbstractC1081x0 abstractC1081x0) {
        if (abstractC1081x0 == null) {
            throw new IllegalStateException("Component not created");
        }
        if (!abstractC1081x0.f11239x) {
            throw new IllegalStateException("Component not initialized: ".concat(String.valueOf(abstractC1081x0.getClass())));
        }
    }

    @Override // m2.InterfaceC1079w0
    public final Context a() {
        return this.f11009w;
    }

    @Override // m2.InterfaceC1079w0
    public final V0.m c() {
        return this.f10980B;
    }

    @Override // m2.InterfaceC1079w0
    public final N f() {
        N n5 = this.f10983E;
        i(n5);
        return n5;
    }

    @Override // m2.InterfaceC1079w0
    public final C1042h0 g() {
        C1042h0 c1042h0 = this.f10984F;
        i(c1042h0);
        return c1042h0;
    }

    @Override // m2.InterfaceC1079w0
    public final InterfaceC0336a h() {
        return this.f10988J;
    }

    public final boolean j() {
        return l() == 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x007f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean k() {
        /*
            r6 = this;
            boolean r0 = r6.f10998T
            if (r0 == 0) goto Lb4
            m2.h0 r0 = r6.f10984F
            i(r0)
            r0.r()
            java.lang.Boolean r0 = r6.f10999U
            b2.b r1 = r6.f10988J
            if (r0 == 0) goto L34
            long r2 = r6.f11000V
            r4 = 0
            int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r2 == 0) goto L34
            boolean r0 = r0.booleanValue()
            if (r0 != 0) goto Lad
            r1.getClass()
            long r2 = android.os.SystemClock.elapsedRealtime()
            long r4 = r6.f11000V
            long r2 = r2 - r4
            long r2 = java.lang.Math.abs(r2)
            r4 = 1000(0x3e8, double:4.94E-321)
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 <= 0) goto Lad
        L34:
            r1.getClass()
            long r0 = android.os.SystemClock.elapsedRealtime()
            r6.f11000V = r0
            m2.K1 r0 = r6.f10986H
            e(r0)
            java.lang.String r1 = "android.permission.INTERNET"
            boolean r1 = r0.t0(r1)
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L76
            java.lang.String r1 = "android.permission.ACCESS_NETWORK_STATE"
            boolean r1 = r0.t0(r1)
            if (r1 == 0) goto L76
            android.content.Context r1 = r6.f11009w
            p1.j r4 = d2.C0652c.a(r1)
            boolean r4 = r4.h()
            if (r4 != 0) goto L74
            m2.e r4 = r6.f10981C
            boolean r4 = r4.G()
            if (r4 != 0) goto L74
            boolean r4 = m2.K1.Y(r1)
            if (r4 == 0) goto L76
            boolean r1 = m2.K1.q0(r1)
            if (r1 == 0) goto L76
        L74:
            r1 = r2
            goto L77
        L76:
            r1 = r3
        L77:
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r1)
            r6.f10999U = r4
            if (r1 == 0) goto Lad
            m2.J r1 = r6.o()
            java.lang.String r1 = r1.C()
            m2.J r4 = r6.o()
            r4.y()
            java.lang.String r4 = r4.f10660I
            boolean r0 = r0.b0(r1, r4)
            if (r0 != 0) goto La7
            m2.J r0 = r6.o()
            r0.y()
            java.lang.String r0 = r0.f10660I
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto La6
            goto La7
        La6:
            r2 = r3
        La7:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r2)
            r6.f10999U = r0
        Lad:
            java.lang.Boolean r0 = r6.f10999U
            boolean r0 = r0.booleanValue()
            return r0
        Lb4:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "AppMeasurement is not initialized"
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: m2.C1051k0.k():boolean");
    }

    public final int l() {
        C1042h0 c1042h0 = this.f10984F;
        i(c1042h0);
        c1042h0.r();
        Boolean boolB = this.f10981C.B("firebase_analytics_collection_deactivated");
        if (boolB != null && boolB.booleanValue()) {
            return 1;
        }
        Boolean bool = this.f11003Y;
        if (bool != null && bool.booleanValue()) {
            return 2;
        }
        C1042h0 c1042h02 = this.f10984F;
        i(c1042h02);
        c1042h02.r();
        if (!this.f11004Z) {
            return 8;
        }
        Y y5 = this.f10982D;
        e(y5);
        y5.r();
        Boolean boolValueOf = y5.A().contains("measurement_enabled") ? Boolean.valueOf(y5.A().getBoolean("measurement_enabled", true)) : null;
        if (boolValueOf != null) {
            return boolValueOf.booleanValue() ? 0 : 3;
        }
        Boolean boolB2 = this.f10981C.B("firebase_analytics_collection_enabled");
        if (boolB2 != null) {
            return boolB2.booleanValue() ? 0 : 4;
        }
        Boolean bool2 = this.f11002X;
        return bool2 != null ? bool2.booleanValue() ? 0 : 5 : (this.f11001W == null || this.f11001W.booleanValue()) ? 0 : 7;
    }

    public final C1067q m() {
        C1067q c1067q = this.f10991M;
        if (c1067q != null) {
            return c1067q;
        }
        throw new IllegalStateException("Component not created");
    }

    public final C1065p n() {
        i(this.f10996R);
        return this.f10996R;
    }

    public final J o() {
        d(this.f10997S);
        return this.f10997S;
    }

    public final K p() {
        return this.f10987I;
    }

    public final Y0 q() {
        d(this.f10995Q);
        return this.f10995Q;
    }

    public final void r() {
        e(this.f10986H);
    }
}
