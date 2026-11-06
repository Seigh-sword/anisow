package com.onesignal;

import a3.C0261b;
import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import android.util.Log;
import b4.C0344a;
import com.google.firebase.analytics.FirebaseAnalytics;
import d.AbstractC0628i;
import java.io.File;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.lang.ref.WeakReference;
import java.lang.reflect.Method;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collection;
import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.TimeZone;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicLong;
import m2.C1018C;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p1.C1243i;
import s4.AbstractC1305a;
import w1.C1474r;

/* JADX INFO: renamed from: com.onesignal.w1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0603w1 {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public static final C0594t1 f8000A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public static final C0261b f8001B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public static final C0584q f8002C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public static C0584q f8003D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public static J3.w f8004E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public static H0 f8005F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public static final C0594t1 f8006G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public static final String f8007H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public static String f8008I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    public static final OSUtils f8009J;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    public static boolean f8010K;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public static boolean f8011L;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    public static boolean f8012M;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    public static boolean f8013N;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public static boolean f8014O;

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    public static K f8015P;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    public static final ArrayList f8016Q;

    /* JADX INFO: renamed from: R, reason: collision with root package name */
    public static final HashSet f8017R;

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    public static final ArrayList f8018S;

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    public static X1 f8019T;

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    public static S0 f8020U;

    /* JADX INFO: renamed from: V, reason: collision with root package name */
    public static S0 f8021V;

    /* JADX INFO: renamed from: W, reason: collision with root package name */
    public static C1474r f8022W;

    /* JADX INFO: renamed from: X, reason: collision with root package name */
    public static OSSubscriptionState f8023X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public static OSSubscriptionState f8024Y;

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    public static C1474r f8025Z;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public static C0543c0 f8027a0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static Context f8028b;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public static C0543c0 f8029b0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static WeakReference f8030c;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    public static C1474r f8031c0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static String f8032d;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public static V0 f8033d0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static String f8034e;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public static V0 f8035e0;

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    public static C1474r f8037f0;

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    public static C1474r f8039g0;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    public static P1 f8041h0;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static P2.e f8047m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static boolean f8048n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static boolean f8049o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static Z1 f8050p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static W1 f8051q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static X1 f8052r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final C0594t1 f8053s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static C0584q f8054t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final C0582p0 f8055u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final C0594t1 f8056v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final C f8057w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final C0550e1 f8058x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final C0553f1 f8059y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final C0594t1 f8060z;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ArrayList f8026a = new ArrayList();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final EnumC0600v1 f8036f = EnumC0600v1.f7995w;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final EnumC0600v1 f8038g = EnumC0600v1.f7998z;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static String f8040h = null;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static String f8042i = null;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static String f8044j = null;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static int f8045k = Integer.MAX_VALUE;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static C0344a f8046l = null;

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    public static int f8043i0 = 3;

    static {
        C0594t1 c0594t1 = new C0594t1();
        f8053s = c0594t1;
        C0594t1 c0594t12 = new C0594t1();
        f8055u = new C0582p0();
        C0594t1 c0594t13 = new C0594t1();
        f8056v = c0594t13;
        C c6 = new C(1);
        f8057w = c6;
        f8058x = new C0550e1(c0594t1);
        f8059y = new C0553f1(c6, c0594t1);
        f8060z = new C0594t1();
        C0594t1 c0594t14 = new C0594t1();
        f8000A = c0594t14;
        C0261b c0261b = new C0261b(c0594t14, c0594t1, c0594t13);
        f8001B = c0261b;
        C0584q c0584q = new C0584q();
        c0584q.f7949x = c0594t12;
        c0584q.f7948w = c0261b;
        c0584q.f7950y = c0594t1;
        f8002C = c0584q;
        f8006G = new C0594t1();
        f8007H = "native";
        f8009J = new OSUtils();
        f8016Q = new ArrayList();
        f8017R = new HashSet();
        f8018S = new ArrayList();
    }

    public static synchronized void A(Context context) {
        try {
            f8053s.getClass();
            C0594t1.h("Starting OneSignal initialization!");
            D0.a(f8028b);
            int i6 = 1;
            if (M() || ((G1) f8057w.f7497b) == null) {
                C0594t1.h(((G1) f8057w.f7497b) != null ? "OneSignal SDK initialization delayed, waiting for privacy consent to be set." : "OneSignal SDK initialization delayed, waiting for remote params.");
                Context context2 = f8028b;
                String str = f8032d;
                f8019T = new X1(context2, i6, str);
                f8032d = null;
                if (str != null && context != null) {
                    F(str, v(), false);
                }
                return;
            }
            int iN = f8045k;
            if (iN == Integer.MAX_VALUE) {
                OSUtils oSUtils = f8009J;
                Context context3 = f8028b;
                String str2 = f8032d;
                oSUtils.getClass();
                iN = OSUtils.n(context3, str2);
            }
            f8045k = iN;
            if (iN == -999) {
                return;
            }
            if (f8048n) {
                if (f8047m != null) {
                    h();
                }
                C0594t1.d("OneSignal SDK initialization already completed.");
                return;
            }
            w(context);
            f8030c = null;
            M1.b().p();
            M1.a().p();
            M1.c().p();
            x();
            try {
                Class.forName("com.amazon.device.iap.PurchasingListener");
                f8051q = new W1(f8028b);
            } catch (ClassNotFoundException unused) {
            }
            OSPermissionChangedInternalObserver.a(l(f8028b));
            g();
            if (f8047m != null) {
                h();
            }
            Context context4 = f8028b;
            if (Z1.f7747i == -99) {
                Z1.f7747i = context4.checkCallingOrSelfPermission("com.android.vending.BILLING");
            }
            try {
                if (Z1.f7747i == 0) {
                    Z1.f7748j = Class.forName("com.android.vending.billing.IInAppBillingService");
                }
                if (Z1.f7747i == 0) {
                    f8050p = new Z1(f8028b);
                }
            } catch (Throwable unused2) {
                Z1.f7747i = 0;
            }
            try {
                X1.f7733z = FirebaseAnalytics.class;
                f8052r = new X1(f8028b);
            } catch (ClassNotFoundException unused3) {
            }
            f8048n = true;
            b(EnumC0600v1.f7993C, "OneSignal SDK initialization done.", null);
            C0584q c0584qR = r();
            c0584qR.getClass();
            new Thread(new R0(c0584qR, i6), "OS_SEND_SAVED_OUTCOMES").start();
            f8059y.c();
        } catch (Throwable th) {
            throw th;
        }
    }

    public static void B(Context context) {
        C0594t1 c0594t1 = f8053s;
        if (context == null) {
            c0594t1.getClass();
            C0594t1.i("initWithContext called with null context, ignoring!");
            return;
        }
        if (context instanceof Activity) {
            f8030c = new WeakReference((Activity) context);
        }
        int i6 = 0;
        int i7 = 1;
        boolean z5 = f8028b == null;
        Context applicationContext = context.getApplicationContext();
        f8028b = applicationContext;
        Application application = (Application) applicationContext;
        if (C0554g.f7811w == null) {
            C0554g c0554g = new C0554g();
            C0554g.f7811w = c0554g;
            application.registerActivityLifecycleCallbacks(c0554g);
        }
        if (C0554g.f7812x == null) {
            C0554g.f7812x = new C0548e(new C0546d0());
        }
        if (C0554g.f7813y == null) {
            ComponentCallbacksC0551f componentCallbacksC0551f = new ComponentCallbacksC0551f();
            C0554g.f7813y = componentCallbacksC0551f;
            application.registerComponentCallbacks(componentCallbacksC0551f);
        }
        if (z5) {
            C0344a c0344a = new C0344a();
            C0344a.f5933b = c0344a;
            C0594t1 c0594t12 = f8000A;
            c0594t12.getClass();
            c0344a.f5934a = E1.e(E1.f7517a, "PREFS_OS_LANGUAGE", null) != null ? new C1243i(28, c0594t12) : new C1018C(19);
            f8046l = c0344a;
            E1.i();
            C1 c1C = C1.c(f8028b);
            H0 h02 = new H0(c1C, c0594t1);
            f8005F = h02;
            AbstractC0571l1.Q(new C0567k0(h02, 2), "OS_NOTIFICATIONS_THREAD");
            C0579o0 c0579o0Q = q();
            c0579o0Q.getClass();
            AbstractC0571l1.Q(new C0567k0(c0579o0Q, i7), "OS_IAM_DB_ACCESS");
            if (f8004E == null) {
                f8004E = new J3.w(c0594t1, f8060z, c1C, c0594t12);
            }
            Collection collectionValues = ((ConcurrentHashMap) ((C0261b) f8002C.f7948w).f5011x).values();
            AbstractC1305a.n(collectionValues, "trackers.values");
            Iterator it = collectionValues.iterator();
            while (it.hasNext()) {
                ((Z3.a) it.next()).g();
            }
            C0584q c0584qR = r();
            c0584qR.getClass();
            new Thread(new R0(c0584qR, i6), "OS_DELETE_CACHED_UNIQUE_OUTCOMES_NOTIFICATIONS_THREAD").start();
        }
        Context context2 = f8028b;
        try {
            String string = context2.getPackageManager().getApplicationInfo(context2.getPackageName(), 128).metaData.getString("com.onesignal.PrivacyConsent");
            if (string != null) {
                boolean zEqualsIgnoreCase = "ENABLE".equalsIgnoreCase(string);
                G1 g12 = (G1) f8057w.f7497b;
                if (g12 != null && g12.f7562j != null) {
                    c0594t1.getClass();
                    C0594t1.i("setRequiresUserPrivacyConsent already called by remote params!, ignoring user set");
                } else if (!M() || zEqualsIgnoreCase) {
                    E1.h(E1.f7517a, "PREFS_OS_REQUIRES_USER_PRIVACY_CONSENT", zEqualsIgnoreCase);
                } else {
                    b(EnumC0600v1.f7997y, "Cannot change requiresUserPrivacyConsent() from TRUE to FALSE", null);
                }
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
        if (f8032d != null) {
            c0594t1.getClass();
            C0594t1.h("initWithContext called with: " + context);
            A(context);
            return;
        }
        String strT = t(f8028b);
        if (strT == null) {
            c0594t1.getClass();
            C0594t1.i("appContext set, but please call setAppId(appId) with a valid appId to complete OneSignal init!");
        } else {
            String strConcat = "appContext set and cached app id found, calling setAppId with: ".concat(strT);
            c0594t1.getClass();
            C0594t1.h(strConcat);
            Q(strT);
        }
    }

    public static void C() {
        ArrayList arrayList = f8018S;
        synchronized (arrayList) {
            try {
                if (arrayList.size() == 0) {
                    return;
                }
                new Thread(new RunnableC0604x(2), "OS_GETTAGS_CALLBACK").start();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static boolean D() {
        return f8049o;
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x001c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void E(java.lang.String r3, int r4, java.lang.Throwable r5, java.lang.String r6) {
        /*
            if (r6 == 0) goto L1c
            com.onesignal.v1 r0 = com.onesignal.EnumC0600v1.f7991A
            com.onesignal.v1 r1 = com.onesignal.AbstractC0603w1.f8036f
            int r1 = r0.compareTo(r1)
            r2 = 1
            if (r1 < r2) goto L15
            com.onesignal.v1 r1 = com.onesignal.AbstractC0603w1.f8038g
            int r0 = r0.compareTo(r1)
            if (r0 >= r2) goto L1c
        L15:
            java.lang.String r0 = "\n"
            java.lang.String r6 = d.AbstractC0628i.j(r0, r6, r0)
            goto L1e
        L1c:
            java.lang.String r6 = ""
        L1e:
            com.onesignal.v1 r0 = com.onesignal.EnumC0600v1.f7998z
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "HTTP code: "
            r1.<init>(r2)
            r1.append(r4)
            java.lang.String r4 = " "
            r1.append(r4)
            r1.append(r3)
            r1.append(r6)
            java.lang.String r3 = r1.toString()
            b(r0, r3, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.onesignal.AbstractC0603w1.E(java.lang.String, int, java.lang.Throwable, java.lang.String):void");
    }

    public static void F(String str, String str2, boolean z5) {
        if (((G1) f8057w.f7497b) != null || f8014O) {
            return;
        }
        f8014O = true;
        AbstractC0571l1.C(str, str2, new C0597u1(z5));
    }

    public static void G(Context context, JSONObject jSONObject, G0 g02) {
        if (f8005F == null) {
            f8005F = new H0(C1.c(context), f8053s);
        }
        H0 h02 = f8005F;
        h02.getClass();
        String strU = AbstractC0571l1.u(jSONObject);
        C0594t1 c0594t1 = h02.f7573h;
        if (strU == null) {
            c0594t1.getClass();
            C0594t1.d("Notification notValidOrDuplicated with id null");
            g02.a(true);
            return;
        }
        if ("".equals(strU)) {
            g02.a(false);
            return;
        }
        Set set = O0.f7652a;
        if (!TextUtils.isEmpty(strU)) {
            Set set2 = O0.f7652a;
            if (set2.contains(strU)) {
                b(EnumC0600v1.f7992B, "OSNotificationWorkManager notification with notificationId: " + strU + " already queued", null);
                c0594t1.getClass();
                C0594t1.d("Notification notValidOrDuplicated with id duplicated");
                g02.a(true);
                return;
            }
            set2.add(strU);
        }
        AbstractC0571l1.Q(new F0(h02, strU, g02), "OS_NOTIFICATIONS_THREAD");
    }

    public static void H() {
        AtomicLong atomicLong;
        if (S("onAppFocus")) {
            return;
        }
        p().c();
        g();
        Z1 z12 = f8050p;
        if (z12 != null) {
            z12.b();
        }
        N0.a(f8028b, false);
        S0 s0L = l(f8028b);
        s0L.getClass();
        boolean zA = OSUtils.a();
        boolean z5 = s0L.f7699x != zA;
        s0L.f7699x = zA;
        if (z5) {
            s0L.f7698w.h(s0L);
        }
        if (f8052r != null) {
            f8057w.getClass();
            if (E1.b(E1.f7517a, "GT_FIREBASE_TRACKING_ENABLED", false)) {
                X1 x12 = f8052r;
                x12.getClass();
                if (X1.f7730A != null && X1.f7732C != null) {
                    f8056v.getClass();
                    long jCurrentTimeMillis = System.currentTimeMillis();
                    if (jCurrentTimeMillis - X1.f7730A.get() <= 120000 && ((atomicLong = X1.f7731B) == null || jCurrentTimeMillis - atomicLong.get() >= 30000)) {
                        try {
                            Object objG = x12.g((Context) x12.f7735x);
                            Method methodI = X1.i(X1.f7733z);
                            Bundle bundle = new Bundle();
                            bundle.putString("source", "OneSignal");
                            bundle.putString("medium", "notification");
                            bundle.putString("notification_id", X1.f7732C.f7473d);
                            bundle.putString("campaign", X1.f(X1.f7732C));
                            methodI.invoke(objG, "os_notification_influence_open", bundle);
                        } catch (Throwable th) {
                            th.printStackTrace();
                        }
                    }
                }
            }
        }
        Z0 z0C = Z0.c();
        Context context = f8028b;
        z0C.getClass();
        synchronized (Y.f7737c) {
            try {
                z0C.f7746d = 0L;
                if (!M.h(context)) {
                    z0C.a(context);
                }
            } finally {
            }
        }
    }

    public static void I(Activity activity, JSONArray jSONArray) {
        Intent launchIntentForPackage;
        try {
            JSONObject jSONObject = jSONArray.getJSONObject(0);
            AbstractC1305a.o(activity, "context");
            AbstractC1305a.o(jSONObject, "fcmPayload");
            X1 x12 = new X1(activity, jSONObject);
            Uri uriJ = x12.j();
            Intent intentR = uriJ == null ? null : OSUtils.r(uriJ);
            boolean zH = (AbstractC0571l1.z(jSONObject) != null) | x12.h();
            if (intentR == null) {
                if (zH && (launchIntentForPackage = activity.getPackageManager().getLaunchIntentForPackage(activity.getPackageName())) != null) {
                    launchIntentForPackage.setPackage(null);
                    launchIntentForPackage.setFlags(270532608);
                    intentR = launchIntentForPackage;
                } else {
                    intentR = null;
                }
            }
            C0594t1 c0594t1 = f8053s;
            EnumC0600v1 enumC0600v1 = EnumC0600v1.f7991A;
            if (intentR == null) {
                c0594t1.getClass();
                b(enumC0600v1, "SDK not showing an Activity automatically due to it's settings.", null);
                return;
            }
            c0594t1.getClass();
            b(enumC0600v1, "SDK running startActivity with Intent: " + intentR, null);
            activity.startActivity(intentR);
        } catch (JSONException e6) {
            e6.printStackTrace();
        }
    }

    public static void J(C0584q c0584q, boolean z5) {
        C0553f1 c0553f1 = f8059y;
        if (c0553f1.d("promptLocation()")) {
            f8053s.getClass();
            C0594t1.e("Waiting for remote params. Moving promptLocation() operation to a pending queue.");
            c0553f1.a(new RunnableC0583p1(c0584q, z5));
        } else {
            if (S("promptLocation()")) {
                return;
            }
            M.d(f8028b, true, z5, new C0586q1(c0584q));
        }
    }

    public static void K() {
        P1 t12;
        P1 p12 = f8041h0;
        if (p12 == null) {
            if (OSUtils.b() == 2) {
                t12 = new C0594t1();
            } else if (OSUtils.b() == 1) {
                if (OSUtils.h()) {
                    J3.t tVar = ((G1) f8057w.f7497b).f7564l;
                    t12 = new R1(f8028b, tVar != null ? new J3.t(tVar.f1433a, tVar.f1434b, tVar.f1435c) : null);
                }
                p12 = f8041h0;
            } else {
                t12 = new T1();
            }
            f8041h0 = t12;
            p12 = f8041h0;
        }
        p12.a(f8028b, f8034e, new C0594t1());
    }

    public static void L(int i6) {
        C0553f1 c0553f1 = f8059y;
        if (c0553f1.d("removeNotification()") || f8005F == null) {
            f8053s.getClass();
            C0594t1.e("Waiting for remote params. Moving removeNotification() operation to a pending queue.");
            c0553f1.a(new RunnableC0588r1(i6));
        } else {
            if (S("removeNotification()")) {
                return;
            }
            H0 h02 = f8005F;
            WeakReference weakReference = new WeakReference(f8028b);
            h02.getClass();
            AbstractC0571l1.Q(new E0(h02, weakReference, i6), "OS_NOTIFICATIONS_THREAD");
        }
    }

    public static boolean M() {
        if (f8028b != null) {
            C c6 = f8057w;
            c6.getClass();
            String str = E1.f7517a;
            if (!E1.b(str, "PREFS_OS_REQUIRES_USER_PRIVACY_CONSENT", false)) {
                return false;
            }
            c6.getClass();
            if (E1.b(str, "ONESIGNAL_USER_PROVIDED_CONSENT", false)) {
                return false;
            }
        }
        return true;
    }

    public static void N(JSONArray jSONArray) {
        if (f8047m == null) {
            f8016Q.add(jSONArray);
            return;
        }
        L0 l0I = i(jSONArray);
        int i6 = 1;
        if (!u.h.a(f8043i0, 1)) {
            f8026a.add(l0I);
        }
        OSUtils.u(new K0(l0I, i6));
    }

    public static void O(JSONArray jSONArray, boolean z5, AbstractC0571l1 abstractC0571l1) {
        if (S("sendPurchases()")) {
            return;
        }
        if (v() == null) {
            C1474r c1474r = new C1474r(jSONArray);
            f8039g0 = c1474r;
            c1474r.f13585y = z5;
            c1474r.f13584x = abstractC0571l1;
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("app_id", t(f8028b));
            if (z5) {
                jSONObject.put("existing", true);
            }
            jSONObject.put("purchases", jSONArray);
            M1.e(jSONObject, abstractC0571l1);
        } catch (Throwable th) {
            b(EnumC0600v1.f7997y, "Failed to generate JSON for sendPurchases.", th);
        }
    }

    public static void P(JSONObject jSONObject) {
        RunnableC0574m1 runnableC0574m1;
        C0553f1 c0553f1 = f8059y;
        boolean zD = c0553f1.d("sendTags()");
        C0594t1 c0594t1 = f8053s;
        if (zD) {
            c0594t1.getClass();
            C0594t1.e("Waiting for remote params. Moving sendTags() operation to a pending task queue.");
            runnableC0574m1 = new RunnableC0574m1(jSONObject, 0);
        } else {
            if (S("sendTags()")) {
                return;
            }
            runnableC0574m1 = new RunnableC0574m1(jSONObject, 1);
            if (!c0553f1.b()) {
                runnableC0574m1.run();
                return;
            } else {
                c0594t1.getClass();
                C0594t1.d("Sending sendTags() operation to pending task queue.");
            }
        }
        c0553f1.a(runnableC0574m1);
    }

    public static void Q(String str) {
        String str2;
        C0594t1 c0594t1 = f8053s;
        if (str == null || str.isEmpty()) {
            str2 = "setAppId called with id: " + str + ", ignoring!";
            c0594t1.getClass();
        } else {
            if (!str.equals(f8032d)) {
                f8048n = false;
                StringBuilder sbN = AbstractC0628i.n("setAppId called with id: ", str, " changing id from: ");
                sbN.append(f8032d);
                String string = sbN.toString();
                c0594t1.getClass();
                C0594t1.h(string);
            }
            f8032d = str;
            if (f8028b != null) {
                WeakReference weakReference = f8030c;
                A((weakReference == null || weakReference.get() == null) ? f8028b : (Context) f8030c.get());
                return;
            } else {
                c0594t1.getClass();
                str2 = "appId set, but please call initWithContext(appContext) with Application context to complete OneSignal init!";
            }
        }
        C0594t1.i(str2);
    }

    public static void R(long j6) {
        String strG = AbstractC0628i.g("Last session time set to: ", j6);
        f8053s.getClass();
        C0594t1.d(strG);
        E1.g(E1.f7517a, "OS_LAST_SESSION_TIME", Long.valueOf(j6));
    }

    public static boolean S(String str) {
        if (!M()) {
            return false;
        }
        if (str == null) {
            return true;
        }
        b(EnumC0600v1.f7998z, "Method " + str + " was called before the user provided privacy consent. Your application is set to require the user's privacy consent before the OneSignal SDK can be initialized. Please ensure the user has provided consent before calling this method. You can check the latest OneSignal consent status by calling OneSignal.userProvidedPrivacyConsent()", null);
        return true;
    }

    public static void a(EnumC0600v1 enumC0600v1, String str) {
        b(enumC0600v1, str, null);
    }

    public static void b(EnumC0600v1 enumC0600v1, String str, Throwable th) {
        if (enumC0600v1.compareTo(f8038g) < 1) {
            if (enumC0600v1 == EnumC0600v1.f7993C) {
                Log.v("OneSignal", str, th);
            } else if (enumC0600v1 == EnumC0600v1.f7992B) {
                Log.d("OneSignal", str, th);
            } else if (enumC0600v1 == EnumC0600v1.f7991A) {
                Log.i("OneSignal", str, th);
            } else if (enumC0600v1 == EnumC0600v1.f7998z) {
                Log.w("OneSignal", str, th);
            } else if (enumC0600v1 == EnumC0600v1.f7997y || enumC0600v1 == EnumC0600v1.f7996x) {
                Log.e("OneSignal", str, th);
            }
        }
        if (enumC0600v1.compareTo(f8036f) >= 1 || j() == null) {
            return;
        }
        try {
            String str2 = str + "\n";
            if (th != null) {
                String str3 = str2 + th.getMessage();
                StringWriter stringWriter = new StringWriter();
                th.printStackTrace(new PrintWriter(stringWriter));
                str2 = str3 + stringWriter.toString();
            }
            OSUtils.u(new RunnableC0570l0(enumC0600v1, str2, 8));
        } catch (Throwable th2) {
            Log.e("OneSignal", "Error showing logging message.", th2);
        }
    }

    public static void c() throws JSONException {
        boolean z5;
        K k5;
        String packageName = f8028b.getPackageName();
        PackageManager packageManager = f8028b.getPackageManager();
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("app_id", t(f8028b));
        jSONObject.put("device_os", Build.VERSION.RELEASE);
        TimeZone timeZone = Calendar.getInstance().getTimeZone();
        int rawOffset = timeZone.getRawOffset();
        if (timeZone.inDaylightTime(new Date())) {
            rawOffset += timeZone.getDSTSavings();
        }
        jSONObject.put("timezone", rawOffset / 1000);
        jSONObject.put("timezone_id", Build.VERSION.SDK_INT >= 26 ? ZoneId.systemDefault().getId() : TimeZone.getDefault().getID());
        jSONObject.put("language", f8046l.f5934a.j());
        jSONObject.put("sdk", "040806");
        jSONObject.put("sdk_type", f8007H);
        jSONObject.put("android_package", packageName);
        jSONObject.put("device_model", Build.MODEL);
        try {
            jSONObject.put("game_version", packageManager.getPackageInfo(packageName, 0).versionCode);
        } catch (PackageManager.NameNotFoundException unused) {
        }
        f8009J.getClass();
        jSONObject.put("net_type", OSUtils.d());
        String str = null;
        try {
            String networkOperatorName = ((TelephonyManager) f8028b.getSystemService("phone")).getNetworkOperatorName();
            if (!"".equals(networkOperatorName)) {
                str = networkOperatorName;
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
        jSONObject.put("carrier", str);
        String[] strArr = {"/sbin/", "/system/bin/", "/system/xbin/", "/data/local/xbin/", "/data/local/bin/", "/system/sd/xbin/", "/system/bin/failsafe/", "/data/local/"};
        for (int i6 = 0; i6 < 8; i6++) {
            try {
                if (new File(strArr[i6] + "su").exists()) {
                    z5 = true;
                    break;
                }
            } catch (Throwable unused2) {
                z5 = false;
            }
        }
        z5 = false;
        jSONObject.put("rooted", z5);
        M1.b().z(jSONObject);
        M1.a().z(jSONObject);
        M1.c().z(jSONObject);
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("identifier", f8008I);
        jSONObject2.put("subscribableStatus", f8045k);
        f8057w.getClass();
        String str2 = E1.f7517a;
        jSONObject2.put("androidPermission", E1.b(str2, "PREFS_OS_UNSUBSCRIBE_WHEN_NOTIFICATIONS_DISABLED", true) ? OSUtils.a() : true);
        jSONObject2.put("device_type", OSUtils.b());
        M1.g(jSONObject2);
        f8057w.getClass();
        if (E1.b(str2, "PREFS_OS_LOCATION_SHARED", true) && (k5 = f8015P) != null) {
            M1.f(k5);
        }
        f8053s.getClass();
        C0594t1.d("registerUserTask calling readyToUpdate");
        M1.b().t();
        M1.a().t();
        M1.c().t();
        f8013N = false;
    }

    public static void d() {
        String str = "registerUser:registerForPushFired:" + f8010K + ", locationFired: " + f8011L + ", remoteParams: " + ((G1) f8057w.f7497b) + ", appId: " + f8032d;
        f8053s.getClass();
        C0594t1.d(str);
        if (!f8010K || !f8011L || ((G1) f8057w.f7497b) == null || f8032d == null) {
            C0594t1.d("registerUser not possible");
        } else {
            new Thread(new RunnableC0604x(5), "OS_REG_USER").start();
        }
    }

    public static void e(String str) {
        f8043i0 = 1;
        C0584q c0584q = f8002C;
        ((C0594t1) c0584q.f7950y).getClass();
        C0594t1.d("OneSignal SessionManager onDirectInfluenceFromNotificationOpen notificationId: " + str);
        if (str == null || str.isEmpty()) {
            return;
        }
        c0584q.e(1, str);
    }

    public static void f() {
        if (f8049o) {
            return;
        }
        W1 w12 = f8051q;
        if (w12 != null) {
            w12.c();
        }
        C0584q c0584qP = p();
        C0594t1 c0594t1 = (C0594t1) c0584qP.f7950y;
        String str = "Application backgrounded focus time: " + ((Long) c0584qP.f7948w);
        c0594t1.getClass();
        C0594t1.d(str);
        AbstractC0581p abstractC0581pA = ((C) c0584qP.f7949x).a();
        ArrayList arrayListC = abstractC0581pA.c();
        long jD = abstractC0581pA.d();
        b(EnumC0600v1.f7992B, abstractC0581pA.getClass().getSimpleName() + ":sendUnsentTimeNow with time: " + jD + " and influences: " + arrayListC.toString(), null);
        boolean z5 = true;
        abstractC0581pA.j(1);
        c0584qP.f7948w = null;
        boolean zS = M1.b().s();
        boolean zS2 = M1.a().s();
        boolean zS3 = M1.c().s();
        if (zS2) {
            zS2 = M1.a().m() != null;
        }
        if (zS3) {
            zS3 = M1.c().m() != null;
        }
        if (!zS && !zS2 && !zS3) {
            z5 = false;
        }
        f8053s.getClass();
        C0594t1.d("OneSignal scheduleSyncService unsyncedChanges: " + z5);
        if (z5) {
            Z0 z0C = Z0.c();
            Context context = f8028b;
            z0C.getClass();
            b(EnumC0600v1.f7993C, "OSSyncService scheduleSyncTask:SYNC_AFTER_BG_DELAY_MS: 30000", null);
            z0C.d(context, 30000L);
        }
        C0594t1.d("OneSignal scheduleSyncService locationScheduled: " + M.h(f8028b));
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x012a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void g() {
        /*
            Method dump skipped, instruction units count: 587
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.onesignal.AbstractC0603w1.g():void");
    }

    public static void h() {
        ArrayList arrayList = f8016Q;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            N((JSONArray) it.next());
        }
        arrayList.clear();
    }

    public static L0 i(JSONArray jSONArray) {
        int length = jSONArray.length();
        int iOptInt = jSONArray.optJSONObject(0).optInt("androidNotificationId");
        ArrayList arrayList = new ArrayList();
        boolean z5 = true;
        String strOptString = null;
        JSONObject jSONObject = null;
        for (int i6 = 0; i6 < length; i6++) {
            try {
                jSONObject = jSONArray.getJSONObject(i6);
                if (strOptString == null && jSONObject.has("actionId")) {
                    strOptString = jSONObject.optString("actionId", null);
                }
                if (z5) {
                    z5 = false;
                } else {
                    arrayList.add(new B0(jSONObject));
                }
            } catch (Throwable th) {
                b(EnumC0600v1.f7997y, "Error parsing JSON item " + i6 + "/" + length + " for callback.", th);
            }
        }
        return new L0(new B0(arrayList, jSONObject, iOptInt), new X1(strOptString != null ? C0.f7499x : C0.f7498w, strOptString, 8));
    }

    public static Activity j() {
        C0548e c0548e = C0554g.f7812x;
        if (c0548e != null) {
            return c0548e.f7789b;
        }
        return null;
    }

    public static C0543c0 k(Context context) {
        if (context == null) {
            return null;
        }
        if (f8027a0 == null) {
            C0543c0 c0543c0 = new C0543c0();
            C1474r c1474r = new C1474r("changed", false);
            c0543c0.f7773w = c1474r;
            c0543c0.f7774x = o();
            c0543c0.f7775y = M1.a().m();
            f8027a0 = c0543c0;
            ((List) c1474r.f13584x).add(new OSEmailSubscriptionChangedInternalObserver());
        }
        return f8027a0;
    }

    public static S0 l(Context context) {
        if (context == null) {
            return null;
        }
        if (f8020U == null) {
            S0 s02 = new S0();
            C1474r c1474r = new C1474r("changed", false);
            s02.f7698w = c1474r;
            boolean zA = OSUtils.a();
            boolean z5 = s02.f7699x != zA;
            s02.f7699x = zA;
            if (z5) {
                s02.f7698w.h(s02);
            }
            f8020U = s02;
            ((List) c1474r.f13584x).add(new OSPermissionChangedInternalObserver());
        }
        return f8020U;
    }

    public static V0 m(Context context) {
        if (context == null) {
            return null;
        }
        if (f8033d0 == null) {
            V0 v02 = new V0();
            C1474r c1474r = new C1474r("changed", false);
            v02.f7715w = c1474r;
            v02.f7716x = s();
            v02.f7717y = M1.c().m();
            f8033d0 = v02;
            ((List) c1474r.f13584x).add(new OSSMSSubscriptionChangedInternalObserver());
        }
        return f8033d0;
    }

    public static OSSubscriptionState n(Context context) {
        if (context == null) {
            return null;
        }
        if (f8023X == null) {
            boolean z5 = l(context).f7699x;
            OSSubscriptionState oSSubscriptionState = new OSSubscriptionState();
            oSSubscriptionState.f7654w = new C1474r("changed", false);
            oSSubscriptionState.f7653A = !((JSONObject) M1.b().n().d().f7497b).optBoolean("userSubscribePref", true);
            oSSubscriptionState.f7655x = v();
            oSSubscriptionState.f7656y = M1.b().m();
            oSSubscriptionState.f7657z = z5;
            f8023X = oSSubscriptionState;
            ((List) l(context).f7698w.f13584x).add(new WeakReference(f8023X));
            ((List) f8023X.f7654w.f13584x).add(new OSSubscriptionChangedInternalObserver());
        }
        return f8023X;
    }

    public static String o() {
        if (f8042i == null && f8028b != null) {
            f8042i = E1.e(E1.f7517a, "OS_EMAIL_ID", null);
        }
        if (TextUtils.isEmpty(f8042i)) {
            return null;
        }
        return f8042i;
    }

    public static C0584q p() {
        if (f8054t == null) {
            C c6 = new C(5);
            C0584q c0584q = new C0584q();
            c0584q.f7949x = c6;
            c0584q.f7950y = f8053s;
            f8054t = c0584q;
        }
        return f8054t;
    }

    public static C0579o0 q() {
        C0582p0 c0582p0 = f8055u;
        C1 c1C = C1.c(f8028b);
        C0550e1 c0550e1 = f8058x;
        C0594t1 c0594t1 = f8053s;
        C0594t1 c0594t12 = f8000A;
        C0344a c0344a = f8046l;
        if (c0582p0.f7933a == null) {
            synchronized (C0582p0.f7932b) {
                try {
                    if (c0582p0.f7933a == null) {
                        c0582p0.f7933a = new C0579o0(c1C, c0550e1, c0594t1, c0594t12, c0344a);
                    }
                } finally {
                }
            }
        }
        return c0582p0.f7933a;
    }

    public static C0584q r() {
        if (f8003D == null) {
            synchronized (f8006G) {
                try {
                    if (f8003D == null) {
                        if (f8004E == null) {
                            f8004E = new J3.w(f8053s, f8060z, C1.c(f8028b), f8000A);
                        }
                        f8003D = new C0584q(f8002C, f8004E);
                    }
                } finally {
                }
            }
        }
        return f8003D;
    }

    public static String s() {
        if (f8044j == null && f8028b != null) {
            f8044j = E1.e(E1.f7517a, "PREFS_OS_SMS_ID", null);
        }
        if (TextUtils.isEmpty(f8044j)) {
            return null;
        }
        return f8044j;
    }

    public static String t(Context context) {
        if (context == null) {
            return null;
        }
        return E1.e(E1.f7517a, "GT_APP_ID", null);
    }

    public static void u(C0558h0 c0558h0) {
        C0553f1 c0553f1 = f8059y;
        boolean zD = c0553f1.d("getTags()");
        C0594t1 c0594t1 = f8053s;
        if (zD) {
            c0594t1.getClass();
            C0594t1.e("Waiting for remote params. Moving getTags() operation to a pending queue.");
            c0553f1.a(new RunnableC0577n1(c0558h0, 0));
        } else {
            if (S("getTags()")) {
                return;
            }
            if (c0558h0 != null) {
                new Thread(new RunnableC0577n1(c0558h0, 1), "OS_GETTAGS").start();
            } else {
                c0594t1.getClass();
                C0594t1.e("getTags called with null GetTagsHandler!");
            }
        }
    }

    public static String v() {
        if (f8040h == null && f8028b != null) {
            f8040h = E1.e(E1.f7517a, "GT_PLAYER_ID", null);
        }
        return f8040h;
    }

    public static void w(Context context) {
        C0548e c0548e = C0554g.f7812x;
        boolean z5 = context instanceof Activity;
        boolean z6 = j() == null;
        f8049o = !z6 || z5;
        String str = "OneSignal handleActivityLifecycleHandler inForeground: " + f8049o;
        f8053s.getClass();
        C0594t1.d(str);
        if (!f8049o) {
            if (c0548e != null) {
                c0548e.f7790c = true;
                return;
            }
            return;
        }
        if (z6 && z5 && c0548e != null) {
            c0548e.d((Activity) context);
            c0548e.f7790c = true;
        }
        N0.a(context, false);
        p().c();
    }

    public static void x() {
        String strT = t(f8028b);
        EnumC0600v1 enumC0600v1 = EnumC0600v1.f7992B;
        if (strT == null) {
            b(enumC0600v1, "App id set for first time:  " + f8032d, null);
            Context context = f8028b;
            if (AbstractC0571l1.e(context)) {
                try {
                    e4.c.a(context, 0);
                } catch (e4.b unused) {
                }
            }
            String str = f8032d;
            if (f8028b == null) {
                return;
            }
            E1.g(E1.f7517a, "GT_APP_ID", str);
            return;
        }
        if (strT.equals(f8032d)) {
            return;
        }
        StringBuilder sbN = AbstractC0628i.n("App id has changed:\nFrom: ", strT, "\n To: ");
        sbN.append(f8032d);
        sbN.append("\nClearing the user id, app state, and remoteParams as they are no longer valid");
        b(enumC0600v1, sbN.toString(), null);
        String str2 = f8032d;
        if (f8028b != null) {
            E1.g(E1.f7517a, "GT_APP_ID", str2);
        }
        M1.b().u();
        M1.a().u();
        M1.c().u();
        M1.b().getClass();
        f8040h = null;
        if (f8028b != null) {
            E1.g(E1.f7517a, "GT_PLAYER_ID", f8040h);
        }
        M1.a().getClass();
        f8042i = null;
        if (f8028b != null) {
            E1.g(E1.f7517a, "OS_EMAIL_ID", "".equals(f8042i) ? null : f8042i);
        }
        M1.c().getClass();
        f8044j = null;
        if (f8028b != null) {
            E1.g(E1.f7517a, "PREFS_OS_SMS_ID", "".equals(f8044j) ? null : f8044j);
        }
        R(-3660L);
        f8057w.f7497b = null;
    }

    public static void y(Activity activity, JSONArray jSONArray, String str) {
        if (S(null)) {
            return;
        }
        for (int i6 = 0; i6 < jSONArray.length(); i6++) {
            try {
                String strOptString = new JSONObject(jSONArray.getJSONObject(i6).optString("custom", null)).optString("i", null);
                HashSet hashSet = f8017R;
                if (!hashSet.contains(strOptString)) {
                    hashSet.add(strOptString);
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("app_id", t(activity));
                    jSONObject.put("player_id", activity == null ? null : E1.e(E1.f7517a, "GT_PLAYER_ID", null));
                    jSONObject.put("opened", true);
                    f8009J.getClass();
                    jSONObject.put("device_type", OSUtils.b());
                    new Thread(new I1("notifications/" + strOptString, jSONObject, new C0580o1(), 0), "OS_REST_ASYNC_PUT").start();
                }
            } catch (Throwable th) {
                b(EnumC0600v1.f7997y, "Failed to generate JSON to send notification opened.", th);
            }
        }
        if (f8052r != null) {
            f8057w.getClass();
            if (E1.b(E1.f7517a, "GT_FIREBASE_TRACKING_ENABLED", false)) {
                X1 x12 = f8052r;
                B0 b02 = i(jSONArray).f7620c;
                x12.getClass();
                if (X1.f7731B == null) {
                    X1.f7731B = new AtomicLong();
                }
                AtomicLong atomicLong = X1.f7731B;
                f8056v.getClass();
                atomicLong.set(System.currentTimeMillis());
                try {
                    Object objG = x12.g((Context) x12.f7735x);
                    Method methodI = X1.i(X1.f7733z);
                    Bundle bundle = new Bundle();
                    bundle.putString("source", "OneSignal");
                    bundle.putString("medium", "notification");
                    bundle.putString("notification_id", b02.f7473d);
                    bundle.putString("campaign", X1.f(b02));
                    methodI.invoke(objG, "os_notification_opened", bundle);
                } catch (Throwable th2) {
                    th2.printStackTrace();
                }
            }
        }
        if (!f8049o) {
            try {
            } catch (JSONException e6) {
                e6.printStackTrace();
            }
            if (new X1(activity, jSONArray.getJSONObject(0)).h()) {
                e(str);
            }
        }
        I(activity, jSONArray);
        N(jSONArray);
    }

    public static void z(I0 i02) {
        try {
            JSONObject jSONObject = new JSONObject(i02.f7584c.toString());
            jSONObject.put("androidNotificationId", i02.a());
            L0 l0I = i(new JSONArray().put(jSONObject));
            if (f8052r != null) {
                f8057w.getClass();
                if (E1.b(E1.f7517a, "GT_FIREBASE_TRACKING_ENABLED", false)) {
                    f8052r.m(l0I);
                }
            }
        } catch (JSONException e6) {
            e6.printStackTrace();
        }
    }
}
