package com.google.android.gms.measurement.internal;

import T1.k;
import X1.C0247o;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.net.Uri;
import android.os.Bundle;
import android.os.RemoteException;
import android.text.TextUtils;
import com.google.android.gms.common.util.DynamiteApi;
import com.google.android.gms.internal.measurement.AbstractBinderC0388b0;
import com.google.android.gms.internal.measurement.C0436j0;
import com.google.android.gms.internal.measurement.C0460n0;
import com.google.android.gms.internal.measurement.InterfaceC0394c0;
import com.google.android.gms.internal.measurement.InterfaceC0400d0;
import com.google.android.gms.internal.measurement.InterfaceC0424h0;
import com.google.android.gms.internal.measurement.Q4;
import e2.InterfaceC0663a;
import e2.b;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;
import l.RunnableC0914g;
import m.RunnableC0969k;
import m2.AbstractC1078w;
import m2.C1020a;
import m2.C1042h0;
import m2.C1051k0;
import m2.C1074u;
import m2.C1076v;
import m2.D0;
import m2.G0;
import m2.H0;
import m2.I0;
import m2.J0;
import m2.K1;
import m2.L0;
import m2.N;
import m2.P;
import m2.RunnableC1057m0;
import m2.U0;
import m2.V0;
import s.C1280b;
import t0.AbstractC1332d;
import u1.C1358b;
import w1.RunnableC1473q;

/* JADX INFO: loaded from: classes.dex */
@DynamiteApi
public class AppMeasurementDynamiteService extends AbstractBinderC0388b0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public C1051k0 f7026c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final C1280b f7027d;

    public AppMeasurementDynamiteService() {
        super("com.google.android.gms.measurement.api.internal.IAppMeasurementDynamiteService");
        this.f7026c = null;
        this.f7027d = new C1280b();
    }

    @Override // com.google.android.gms.internal.measurement.Y
    public void beginAdUnitExposure(String str, long j6) {
        e();
        this.f7026c.m().A(str, j6);
    }

    @Override // com.google.android.gms.internal.measurement.Y
    public void clearConditionalUserProperty(String str, String str2, Bundle bundle) {
        e();
        G0 g02 = this.f7026c.f10990L;
        C1051k0.d(g02);
        g02.F(str, str2, bundle);
    }

    @Override // com.google.android.gms.internal.measurement.Y
    public void clearMeasurementEnabled(long j6) {
        e();
        G0 g02 = this.f7026c.f10990L;
        C1051k0.d(g02);
        g02.y();
        g02.g().A(new RunnableC0969k(g02, 27, (Object) null));
    }

    public final void e() {
        if (this.f7026c == null) {
            throw new IllegalStateException("Attempting to perform action before initialize.");
        }
    }

    @Override // com.google.android.gms.internal.measurement.Y
    public void endAdUnitExposure(String str, long j6) {
        e();
        this.f7026c.m().C(str, j6);
    }

    @Override // com.google.android.gms.internal.measurement.Y
    public void generateEventId(InterfaceC0394c0 interfaceC0394c0) {
        e();
        K1 k12 = this.f7026c.f10986H;
        C1051k0.e(k12);
        long jB0 = k12.B0();
        e();
        K1 k13 = this.f7026c.f10986H;
        C1051k0.e(k13);
        k13.M(interfaceC0394c0, jB0);
    }

    @Override // com.google.android.gms.internal.measurement.Y
    public void getAppInstanceId(InterfaceC0394c0 interfaceC0394c0) {
        e();
        C1042h0 c1042h0 = this.f7026c.f10984F;
        C1051k0.i(c1042h0);
        c1042h0.A(new RunnableC1057m0(this, interfaceC0394c0, 0));
    }

    @Override // com.google.android.gms.internal.measurement.Y
    public void getCachedAppInstanceId(InterfaceC0394c0 interfaceC0394c0) {
        e();
        G0 g02 = this.f7026c.f10990L;
        C1051k0.d(g02);
        s((String) g02.f10614C.get(), interfaceC0394c0);
    }

    @Override // com.google.android.gms.internal.measurement.Y
    public void getConditionalUserProperties(String str, String str2, InterfaceC0394c0 interfaceC0394c0) {
        e();
        C1042h0 c1042h0 = this.f7026c.f10984F;
        C1051k0.i(c1042h0);
        c1042h0.A(new RunnableC0914g(this, interfaceC0394c0, str, str2, 3));
    }

    @Override // com.google.android.gms.internal.measurement.Y
    public void getCurrentScreenClass(InterfaceC0394c0 interfaceC0394c0) {
        e();
        G0 g02 = this.f7026c.f10990L;
        C1051k0.d(g02);
        U0 u02 = ((C1051k0) g02.f1668w).f10989K;
        C1051k0.d(u02);
        V0 v02 = u02.f10779y;
        s(v02 != null ? v02.f10785b : null, interfaceC0394c0);
    }

    @Override // com.google.android.gms.internal.measurement.Y
    public void getCurrentScreenName(InterfaceC0394c0 interfaceC0394c0) {
        e();
        G0 g02 = this.f7026c.f10990L;
        C1051k0.d(g02);
        U0 u02 = ((C1051k0) g02.f1668w).f10989K;
        C1051k0.d(u02);
        V0 v02 = u02.f10779y;
        s(v02 != null ? v02.f10784a : null, interfaceC0394c0);
    }

    @Override // com.google.android.gms.internal.measurement.Y
    public void getGmpAppId(InterfaceC0394c0 interfaceC0394c0) {
        e();
        G0 g02 = this.f7026c.f10990L;
        C1051k0.d(g02);
        Object obj = g02.f1668w;
        C1051k0 c1051k0 = (C1051k0) obj;
        String string = c1051k0.f11010x;
        if (string == null) {
            string = null;
            try {
                Context contextA = g02.a();
                String strB = ((C1051k0) obj).f10993O;
                AbstractC1332d.m(contextA);
                Resources resources = contextA.getResources();
                if (TextUtils.isEmpty(strB)) {
                    strB = C0247o.b(contextA);
                }
                int identifier = resources.getIdentifier("google_app_id", "string", strB);
                if (identifier != 0) {
                    try {
                        string = resources.getString(identifier);
                    } catch (Resources.NotFoundException unused) {
                    }
                }
            } catch (IllegalStateException e6) {
                N n5 = c1051k0.f10983E;
                C1051k0.i(n5);
                n5.f10715B.c(e6, "getGoogleAppId failed with exception");
            }
        }
        s(string, interfaceC0394c0);
    }

    @Override // com.google.android.gms.internal.measurement.Y
    public void getMaxUserProperties(String str, InterfaceC0394c0 interfaceC0394c0) {
        e();
        C1051k0.d(this.f7026c.f10990L);
        AbstractC1332d.g(str);
        e();
        K1 k12 = this.f7026c.f10986H;
        C1051k0.e(k12);
        k12.L(interfaceC0394c0, 25);
    }

    @Override // com.google.android.gms.internal.measurement.Y
    public void getSessionId(InterfaceC0394c0 interfaceC0394c0) {
        e();
        G0 g02 = this.f7026c.f10990L;
        C1051k0.d(g02);
        g02.g().A(new RunnableC0969k(g02, 26, interfaceC0394c0));
    }

    @Override // com.google.android.gms.internal.measurement.Y
    public void getTestFlag(InterfaceC0394c0 interfaceC0394c0, int i6) {
        e();
        int i7 = 2;
        if (i6 == 0) {
            K1 k12 = this.f7026c.f10986H;
            C1051k0.e(k12);
            G0 g02 = this.f7026c.f10990L;
            C1051k0.d(g02);
            AtomicReference atomicReference = new AtomicReference();
            k12.R((String) g02.g().v(atomicReference, 15000L, "String test flag value", new H0(g02, atomicReference, i7)), interfaceC0394c0);
            return;
        }
        int i8 = 4;
        int i9 = 1;
        if (i6 == 1) {
            K1 k13 = this.f7026c.f10986H;
            C1051k0.e(k13);
            G0 g03 = this.f7026c.f10990L;
            C1051k0.d(g03);
            AtomicReference atomicReference2 = new AtomicReference();
            k13.M(interfaceC0394c0, ((Long) g03.g().v(atomicReference2, 15000L, "long test flag value", new H0(g03, atomicReference2, i8))).longValue());
            return;
        }
        if (i6 == 2) {
            K1 k14 = this.f7026c.f10986H;
            C1051k0.e(k14);
            G0 g04 = this.f7026c.f10990L;
            C1051k0.d(g04);
            AtomicReference atomicReference3 = new AtomicReference();
            double dDoubleValue = ((Double) g04.g().v(atomicReference3, 15000L, "double test flag value", new H0(g04, atomicReference3, 5))).doubleValue();
            Bundle bundle = new Bundle();
            bundle.putDouble("r", dDoubleValue);
            try {
                interfaceC0394c0.d(bundle);
                return;
            } catch (RemoteException e6) {
                N n5 = ((C1051k0) k14.f1668w).f10983E;
                C1051k0.i(n5);
                n5.f10718E.c(e6, "Error returning double value to wrapper");
                return;
            }
        }
        int i10 = 3;
        if (i6 == 3) {
            K1 k15 = this.f7026c.f10986H;
            C1051k0.e(k15);
            G0 g05 = this.f7026c.f10990L;
            C1051k0.d(g05);
            AtomicReference atomicReference4 = new AtomicReference();
            k15.L(interfaceC0394c0, ((Integer) g05.g().v(atomicReference4, 15000L, "int test flag value", new H0(g05, atomicReference4, i10))).intValue());
            return;
        }
        if (i6 != 4) {
            return;
        }
        K1 k16 = this.f7026c.f10986H;
        C1051k0.e(k16);
        G0 g06 = this.f7026c.f10990L;
        C1051k0.d(g06);
        AtomicReference atomicReference5 = new AtomicReference();
        k16.P(interfaceC0394c0, ((Boolean) g06.g().v(atomicReference5, 15000L, "boolean test flag value", new H0(g06, atomicReference5, i9))).booleanValue());
    }

    @Override // com.google.android.gms.internal.measurement.Y
    public void getUserProperties(String str, String str2, boolean z5, InterfaceC0394c0 interfaceC0394c0) {
        e();
        C1042h0 c1042h0 = this.f7026c.f10984F;
        C1051k0.i(c1042h0);
        c1042h0.A(new k(this, interfaceC0394c0, str, str2, z5));
    }

    @Override // com.google.android.gms.internal.measurement.Y
    public void initForTests(Map map) {
        e();
    }

    @Override // com.google.android.gms.internal.measurement.Y
    public void initialize(InterfaceC0663a interfaceC0663a, C0436j0 c0436j0, long j6) {
        C1051k0 c1051k0 = this.f7026c;
        if (c1051k0 == null) {
            Context context = (Context) b.s(interfaceC0663a);
            AbstractC1332d.m(context);
            this.f7026c = C1051k0.b(context, c0436j0, Long.valueOf(j6));
        } else {
            N n5 = c1051k0.f10983E;
            C1051k0.i(n5);
            n5.f10718E.d("Attempting to initialize multiple times");
        }
    }

    @Override // com.google.android.gms.internal.measurement.Y
    public void isDataCollectionEnabled(InterfaceC0394c0 interfaceC0394c0) {
        e();
        C1042h0 c1042h0 = this.f7026c.f10984F;
        C1051k0.i(c1042h0);
        c1042h0.A(new RunnableC1057m0(this, interfaceC0394c0, 1));
    }

    @Override // com.google.android.gms.internal.measurement.Y
    public void logEvent(String str, String str2, Bundle bundle, boolean z5, boolean z6, long j6) {
        e();
        G0 g02 = this.f7026c.f10990L;
        C1051k0.d(g02);
        g02.G(str, str2, bundle, z5, z6, j6);
    }

    @Override // com.google.android.gms.internal.measurement.Y
    public void logEventAndBundle(String str, String str2, Bundle bundle, InterfaceC0394c0 interfaceC0394c0, long j6) {
        e();
        AbstractC1332d.g(str2);
        (bundle != null ? new Bundle(bundle) : new Bundle()).putString("_o", "app");
        C1076v c1076v = new C1076v(str2, new C1074u(bundle), "app", j6);
        C1042h0 c1042h0 = this.f7026c.f10984F;
        C1051k0.i(c1042h0);
        c1042h0.A(new RunnableC0914g(this, interfaceC0394c0, c1076v, str, 2));
    }

    @Override // com.google.android.gms.internal.measurement.Y
    public void logHealthData(int i6, String str, InterfaceC0663a interfaceC0663a, InterfaceC0663a interfaceC0663a2, InterfaceC0663a interfaceC0663a3) {
        e();
        Object objS = interfaceC0663a == null ? null : b.s(interfaceC0663a);
        Object objS2 = interfaceC0663a2 == null ? null : b.s(interfaceC0663a2);
        Object objS3 = interfaceC0663a3 != null ? b.s(interfaceC0663a3) : null;
        N n5 = this.f7026c.f10983E;
        C1051k0.i(n5);
        n5.y(i6, true, false, str, objS, objS2, objS3);
    }

    @Override // com.google.android.gms.internal.measurement.Y
    public void onActivityCreated(InterfaceC0663a interfaceC0663a, Bundle bundle, long j6) {
        e();
        G0 g02 = this.f7026c.f10990L;
        C1051k0.d(g02);
        C0460n0 c0460n0 = g02.f10630y;
        if (c0460n0 != null) {
            G0 g03 = this.f7026c.f10990L;
            C1051k0.d(g03);
            g03.R();
            c0460n0.onActivityCreated((Activity) b.s(interfaceC0663a), bundle);
        }
    }

    @Override // com.google.android.gms.internal.measurement.Y
    public void onActivityDestroyed(InterfaceC0663a interfaceC0663a, long j6) {
        e();
        G0 g02 = this.f7026c.f10990L;
        C1051k0.d(g02);
        C0460n0 c0460n0 = g02.f10630y;
        if (c0460n0 != null) {
            G0 g03 = this.f7026c.f10990L;
            C1051k0.d(g03);
            g03.R();
            c0460n0.onActivityDestroyed((Activity) b.s(interfaceC0663a));
        }
    }

    @Override // com.google.android.gms.internal.measurement.Y
    public void onActivityPaused(InterfaceC0663a interfaceC0663a, long j6) {
        e();
        G0 g02 = this.f7026c.f10990L;
        C1051k0.d(g02);
        C0460n0 c0460n0 = g02.f10630y;
        if (c0460n0 != null) {
            G0 g03 = this.f7026c.f10990L;
            C1051k0.d(g03);
            g03.R();
            c0460n0.onActivityPaused((Activity) b.s(interfaceC0663a));
        }
    }

    @Override // com.google.android.gms.internal.measurement.Y
    public void onActivityResumed(InterfaceC0663a interfaceC0663a, long j6) {
        e();
        G0 g02 = this.f7026c.f10990L;
        C1051k0.d(g02);
        C0460n0 c0460n0 = g02.f10630y;
        if (c0460n0 != null) {
            G0 g03 = this.f7026c.f10990L;
            C1051k0.d(g03);
            g03.R();
            c0460n0.onActivityResumed((Activity) b.s(interfaceC0663a));
        }
    }

    @Override // com.google.android.gms.internal.measurement.Y
    public void onActivitySaveInstanceState(InterfaceC0663a interfaceC0663a, InterfaceC0394c0 interfaceC0394c0, long j6) {
        e();
        G0 g02 = this.f7026c.f10990L;
        C1051k0.d(g02);
        C0460n0 c0460n0 = g02.f10630y;
        Bundle bundle = new Bundle();
        if (c0460n0 != null) {
            G0 g03 = this.f7026c.f10990L;
            C1051k0.d(g03);
            g03.R();
            c0460n0.onActivitySaveInstanceState((Activity) b.s(interfaceC0663a), bundle);
        }
        try {
            interfaceC0394c0.d(bundle);
        } catch (RemoteException e6) {
            N n5 = this.f7026c.f10983E;
            C1051k0.i(n5);
            n5.f10718E.c(e6, "Error returning bundle value to wrapper");
        }
    }

    @Override // com.google.android.gms.internal.measurement.Y
    public void onActivityStarted(InterfaceC0663a interfaceC0663a, long j6) {
        e();
        G0 g02 = this.f7026c.f10990L;
        C1051k0.d(g02);
        C0460n0 c0460n0 = g02.f10630y;
        if (c0460n0 != null) {
            G0 g03 = this.f7026c.f10990L;
            C1051k0.d(g03);
            g03.R();
            c0460n0.onActivityStarted((Activity) b.s(interfaceC0663a));
        }
    }

    @Override // com.google.android.gms.internal.measurement.Y
    public void onActivityStopped(InterfaceC0663a interfaceC0663a, long j6) {
        e();
        G0 g02 = this.f7026c.f10990L;
        C1051k0.d(g02);
        C0460n0 c0460n0 = g02.f10630y;
        if (c0460n0 != null) {
            G0 g03 = this.f7026c.f10990L;
            C1051k0.d(g03);
            g03.R();
            c0460n0.onActivityStopped((Activity) b.s(interfaceC0663a));
        }
    }

    @Override // com.google.android.gms.internal.measurement.Y
    public void performAction(Bundle bundle, InterfaceC0394c0 interfaceC0394c0, long j6) {
        e();
        interfaceC0394c0.d(null);
    }

    @Override // com.google.android.gms.internal.measurement.Y
    public void registerOnMeasurementEventListener(InterfaceC0400d0 interfaceC0400d0) {
        Object c1020a;
        e();
        synchronized (this.f7027d) {
            try {
                c1020a = (D0) this.f7027d.getOrDefault(Integer.valueOf(interfaceC0400d0.a()), null);
                if (c1020a == null) {
                    c1020a = new C1020a(this, interfaceC0400d0);
                    this.f7027d.put(Integer.valueOf(interfaceC0400d0.a()), c1020a);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        G0 g02 = this.f7026c.f10990L;
        C1051k0.d(g02);
        g02.y();
        if (g02.f10612A.add(c1020a)) {
            return;
        }
        g02.f().f10718E.d("OnEventListener already registered");
    }

    @Override // com.google.android.gms.internal.measurement.Y
    public void resetAnalyticsData(long j6) {
        e();
        G0 g02 = this.f7026c.f10990L;
        C1051k0.d(g02);
        g02.X(null);
        g02.g().A(new L0(g02, j6, 1));
    }

    public final void s(String str, InterfaceC0394c0 interfaceC0394c0) {
        e();
        K1 k12 = this.f7026c.f10986H;
        C1051k0.e(k12);
        k12.R(str, interfaceC0394c0);
    }

    @Override // com.google.android.gms.internal.measurement.Y
    public void setConditionalUserProperty(Bundle bundle, long j6) {
        e();
        if (bundle == null) {
            N n5 = this.f7026c.f10983E;
            C1051k0.i(n5);
            n5.f10715B.d("Conditional user property must not be null");
        } else {
            G0 g02 = this.f7026c.f10990L;
            C1051k0.d(g02);
            g02.W(bundle, j6);
        }
    }

    @Override // com.google.android.gms.internal.measurement.Y
    public void setConsent(Bundle bundle, long j6) {
        e();
        G0 g02 = this.f7026c.f10990L;
        C1051k0.d(g02);
        g02.g().B(new J0(g02, bundle, j6));
    }

    @Override // com.google.android.gms.internal.measurement.Y
    public void setConsentThirdParty(Bundle bundle, long j6) {
        e();
        G0 g02 = this.f7026c.f10990L;
        C1051k0.d(g02);
        g02.C(bundle, -20, j6);
    }

    @Override // com.google.android.gms.internal.measurement.Y
    public void setCurrentScreen(InterfaceC0663a interfaceC0663a, String str, String str2, long j6) {
        P p5;
        Integer numValueOf;
        String str3;
        P p6;
        String str4;
        e();
        U0 u02 = this.f7026c.f10989K;
        C1051k0.d(u02);
        Activity activity = (Activity) b.s(interfaceC0663a);
        if (u02.n().F()) {
            V0 v02 = u02.f10779y;
            if (v02 == null) {
                p6 = u02.f().f10720G;
                str4 = "setCurrentScreen cannot be called while no activity active";
            } else if (u02.f10772B.get(Integer.valueOf(activity.hashCode())) == null) {
                p6 = u02.f().f10720G;
                str4 = "setCurrentScreen must be called with an activity in the activity lifecycle";
            } else {
                if (str2 == null) {
                    str2 = u02.B(activity.getClass());
                }
                boolean zEquals = Objects.equals(v02.f10785b, str2);
                boolean zEquals2 = Objects.equals(v02.f10784a, str);
                if (!zEquals || !zEquals2) {
                    if (str != null && (str.length() <= 0 || str.length() > u02.n().t(null, false))) {
                        p5 = u02.f().f10720G;
                        numValueOf = Integer.valueOf(str.length());
                        str3 = "Invalid screen name length in setCurrentScreen. Length";
                    } else {
                        if (str2 == null || (str2.length() > 0 && str2.length() <= u02.n().t(null, false))) {
                            u02.f().f10723J.b(str == null ? "null" : str, str2, "Setting current screen to name, class");
                            V0 v03 = new V0(u02.q().B0(), str, str2);
                            u02.f10772B.put(Integer.valueOf(activity.hashCode()), v03);
                            u02.E(activity, v03, true);
                            return;
                        }
                        p5 = u02.f().f10720G;
                        numValueOf = Integer.valueOf(str2.length());
                        str3 = "Invalid class name length in setCurrentScreen. Length";
                    }
                    p5.c(numValueOf, str3);
                    return;
                }
                p6 = u02.f().f10720G;
                str4 = "setCurrentScreen cannot be called with the same class and name";
            }
        } else {
            p6 = u02.f().f10720G;
            str4 = "setCurrentScreen cannot be called while screen reporting is disabled.";
        }
        p6.d(str4);
    }

    @Override // com.google.android.gms.internal.measurement.Y
    public void setDataCollectionEnabled(boolean z5) {
        e();
        G0 g02 = this.f7026c.f10990L;
        C1051k0.d(g02);
        g02.y();
        g02.g().A(new RunnableC1473q(3, g02, z5));
    }

    @Override // com.google.android.gms.internal.measurement.Y
    public void setDefaultEventParameters(Bundle bundle) {
        e();
        G0 g02 = this.f7026c.f10990L;
        C1051k0.d(g02);
        g02.g().A(new I0(g02, bundle == null ? new Bundle() : new Bundle(bundle), 0));
    }

    @Override // com.google.android.gms.internal.measurement.Y
    public void setEventInterceptor(InterfaceC0400d0 interfaceC0400d0) {
        e();
        C1358b c1358b = new C1358b(this, interfaceC0400d0, 23);
        C1042h0 c1042h0 = this.f7026c.f10984F;
        C1051k0.i(c1042h0);
        if (!c1042h0.C()) {
            C1042h0 c1042h02 = this.f7026c.f10984F;
            C1051k0.i(c1042h02);
            c1042h02.A(new RunnableC0969k(this, 29, c1358b));
            return;
        }
        G0 g02 = this.f7026c.f10990L;
        C1051k0.d(g02);
        g02.r();
        g02.y();
        C1358b c1358b2 = g02.f10631z;
        if (c1358b != c1358b2) {
            AbstractC1332d.o("EventInterceptor already set.", c1358b2 == null);
        }
        g02.f10631z = c1358b;
    }

    @Override // com.google.android.gms.internal.measurement.Y
    public void setInstanceIdProvider(InterfaceC0424h0 interfaceC0424h0) {
        e();
    }

    @Override // com.google.android.gms.internal.measurement.Y
    public void setMeasurementEnabled(boolean z5, long j6) {
        e();
        G0 g02 = this.f7026c.f10990L;
        C1051k0.d(g02);
        Boolean boolValueOf = Boolean.valueOf(z5);
        g02.y();
        g02.g().A(new RunnableC0969k(g02, 27, boolValueOf));
    }

    @Override // com.google.android.gms.internal.measurement.Y
    public void setMinimumSessionDuration(long j6) {
        e();
    }

    @Override // com.google.android.gms.internal.measurement.Y
    public void setSessionTimeoutDuration(long j6) {
        e();
        G0 g02 = this.f7026c.f10990L;
        C1051k0.d(g02);
        g02.g().A(new L0(g02, j6, 0));
    }

    @Override // com.google.android.gms.internal.measurement.Y
    public void setSgtmDebugInfo(Intent intent) {
        e();
        G0 g02 = this.f7026c.f10990L;
        C1051k0.d(g02);
        Q4.a();
        if (g02.n().D(null, AbstractC1078w.f11229x0)) {
            Uri data = intent.getData();
            if (data == null) {
                g02.f().f10721H.d("Activity intent has no data. Preview Mode was not enabled.");
                return;
            }
            String queryParameter = data.getQueryParameter("sgtm_debug_enable");
            if (queryParameter == null || !queryParameter.equals("1")) {
                g02.f().f10721H.d("Preview Mode was not enabled.");
                g02.n().f10886y = null;
                return;
            }
            String queryParameter2 = data.getQueryParameter("sgtm_preview_key");
            if (TextUtils.isEmpty(queryParameter2)) {
                return;
            }
            g02.f().f10721H.c(queryParameter2, "Preview Mode was enabled. Using the sgtmPreviewKey: ");
            g02.n().f10886y = queryParameter2;
        }
    }

    @Override // com.google.android.gms.internal.measurement.Y
    public void setUserId(String str, long j6) {
        e();
        G0 g02 = this.f7026c.f10990L;
        C1051k0.d(g02);
        if (str == null || !TextUtils.isEmpty(str)) {
            g02.g().A(new RunnableC0969k(g02, str, 25));
            g02.I(null, "_id", str, true, j6);
        } else {
            N n5 = ((C1051k0) g02.f1668w).f10983E;
            C1051k0.i(n5);
            n5.f10718E.d("User ID must be non-empty or null");
        }
    }

    @Override // com.google.android.gms.internal.measurement.Y
    public void setUserProperty(String str, String str2, InterfaceC0663a interfaceC0663a, boolean z5, long j6) {
        e();
        Object objS = b.s(interfaceC0663a);
        G0 g02 = this.f7026c.f10990L;
        C1051k0.d(g02);
        g02.I(str, str2, objS, z5, j6);
    }

    @Override // com.google.android.gms.internal.measurement.Y
    public void unregisterOnMeasurementEventListener(InterfaceC0400d0 interfaceC0400d0) {
        Object c1020a;
        e();
        synchronized (this.f7027d) {
            c1020a = (D0) this.f7027d.remove(Integer.valueOf(interfaceC0400d0.a()));
        }
        if (c1020a == null) {
            c1020a = new C1020a(this, interfaceC0400d0);
        }
        G0 g02 = this.f7026c.f10990L;
        C1051k0.d(g02);
        g02.y();
        if (g02.f10612A.remove(c1020a)) {
            return;
        }
        g02.f().f10718E.d("OnEventListener had not been registered");
    }
}
