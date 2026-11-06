package com.google.android.gms.internal.measurement;

import a3.C0262c;
import a3.InterfaceC0260a;
import android.app.Activity;
import android.app.Application;
import android.content.Intent;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Log;
import b2.C0337b;
import b3.AbstractC0341a;
import java.util.ArrayDeque;
import java.util.Queue;
import m2.C1051k0;
import m2.C1052k1;
import m2.C1067q;
import m2.RunnableC1058m1;
import m2.RunnableC1080x;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.n0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0460n0 implements Application.ActivityLifecycleCallbacks {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ int f6893w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final Object f6894x;

    public C0460n0() {
        this.f6893w = 2;
        this.f6894x = new ArrayDeque(10);
    }

    public final void a(Intent intent) {
        Object obj = this.f6894x;
        Bundle bundle = null;
        try {
            Bundle extras = intent.getExtras();
            if (extras != null) {
                String string = extras.getString("google.message_id");
                if (string == null) {
                    string = extras.getString("message_id");
                }
                if (!TextUtils.isEmpty(string)) {
                    if (((Queue) obj).contains(string)) {
                        return;
                    } else {
                        ((Queue) obj).add(string);
                    }
                }
                bundle = extras.getBundle("gcm.n.analytics_data");
            }
        } catch (RuntimeException e6) {
            Log.w("FirebaseMessaging", "Failed trying to get analytics data from Intent extras.", e6);
        }
        if (bundle != null && "1".equals(bundle.getString("google.c.a.e"))) {
            if (bundle != null) {
                if ("1".equals(bundle.getString("google.c.a.tc"))) {
                    InterfaceC0260a interfaceC0260a = (InterfaceC0260a) Y2.g.c().b(InterfaceC0260a.class);
                    if (Log.isLoggable("FirebaseMessaging", 3)) {
                        Log.d("FirebaseMessaging", "Received event with track-conversion=true. Setting user property and reengagement event");
                    }
                    if (interfaceC0260a != null) {
                        String string2 = bundle.getString("google.c.a.c_id");
                        C0262c c0262c = (C0262c) interfaceC0260a;
                        if (!AbstractC0341a.f5926c.contains("fcm")) {
                            C0466o0 c0466o0 = (C0466o0) c0262c.f5014a.f1515x;
                            c0466o0.getClass();
                            c0466o0.b(new C0483r0(c0466o0, string2));
                        }
                        Bundle bundle2 = new Bundle();
                        bundle2.putString("source", "Firebase");
                        bundle2.putString("medium", "notification");
                        bundle2.putString("campaign", string2);
                        c0262c.a("fcm", "_cmp", bundle2);
                    } else {
                        Log.w("FirebaseMessaging", "Unable to set user property for conversion tracking:  analytics library is missing");
                    }
                } else if (Log.isLoggable("FirebaseMessaging", 3)) {
                    Log.d("FirebaseMessaging", "Received event with track-conversion=false. Do not set user property");
                }
            }
            Y2.b.s("_no", bundle);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0075  */
    @Override // android.app.Application.ActivityLifecycleCallbacks
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onActivityCreated(android.app.Activity r10, android.os.Bundle r11) {
        /*
            Method dump skipped, instruction units count: 224
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.C0460n0.onActivityCreated(android.app.Activity, android.os.Bundle):void");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        switch (this.f6893w) {
            case com.bumptech.glide.d.f6312l /* 0 */:
                ((C0466o0) this.f6894x).b(new C0531z0(this, activity, 4));
                return;
            case 1:
                m2.U0 u0V = ((m2.G0) this.f6894x).v();
                synchronized (u0V.f10778H) {
                    try {
                        if (activity == u0V.f10773C) {
                            u0V.f10773C = null;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                    break;
                }
                if (u0V.n().F()) {
                    u0V.f10772B.remove(Integer.valueOf(activity.hashCode()));
                    return;
                }
                return;
            default:
                return;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        int i6;
        int i7;
        switch (this.f6893w) {
            case com.bumptech.glide.d.f6312l /* 0 */:
                ((C0466o0) this.f6894x).b(new C0531z0(this, activity, 3));
                return;
            case 1:
                m2.U0 u0V = ((m2.G0) this.f6894x).v();
                synchronized (u0V.f10778H) {
                    i6 = 0;
                    u0V.f10777G = false;
                    i7 = 1;
                    u0V.f10774D = true;
                    break;
                }
                ((C0337b) u0V.h()).getClass();
                long jElapsedRealtime = SystemClock.elapsedRealtime();
                if (u0V.n().F()) {
                    m2.V0 v0H = u0V.H(activity);
                    u0V.f10780z = u0V.f10779y;
                    u0V.f10779y = null;
                    u0V.g().A(new m2.J0(u0V, v0H, jElapsedRealtime));
                } else {
                    u0V.f10779y = null;
                    u0V.g().A(new RunnableC1080x(u0V, jElapsedRealtime, i7));
                }
                C1052k1 c1052k1X = ((m2.G0) this.f6894x).x();
                ((C0337b) c1052k1X.h()).getClass();
                c1052k1X.g().A(new RunnableC1058m1(c1052k1X, SystemClock.elapsedRealtime(), i6));
                return;
            default:
                return;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        int i6 = 0;
        switch (this.f6893w) {
            case com.bumptech.glide.d.f6312l /* 0 */:
                ((C0466o0) this.f6894x).b(new C0531z0(this, activity, 0));
                return;
            case 1:
                C1052k1 c1052k1X = ((m2.G0) this.f6894x).x();
                ((C0337b) c1052k1X.h()).getClass();
                int i7 = 1;
                c1052k1X.g().A(new RunnableC1058m1(c1052k1X, SystemClock.elapsedRealtime(), i7));
                m2.U0 u0V = ((m2.G0) this.f6894x).v();
                synchronized (u0V.f10778H) {
                    u0V.f10777G = true;
                    if (activity != u0V.f10773C) {
                        synchronized (u0V.f10778H) {
                            u0V.f10773C = activity;
                            u0V.f10774D = false;
                            break;
                        }
                        if (u0V.n().F()) {
                            u0V.f10775E = null;
                            u0V.g().A(new m2.W0(u0V, i7));
                        }
                    }
                }
                if (!u0V.n().F()) {
                    u0V.f10779y = u0V.f10775E;
                    u0V.g().A(new m2.W0(u0V, i6));
                    return;
                }
                u0V.E(activity, u0V.H(activity), false);
                C1067q c1067qM = ((C1051k0) u0V.f1668w).m();
                ((C0337b) c1067qM.h()).getClass();
                c1067qM.g().A(new RunnableC1080x(c1067qM, SystemClock.elapsedRealtime(), i6));
                return;
            default:
                return;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        m2.V0 v02;
        int i6 = this.f6893w;
        Object obj = this.f6894x;
        switch (i6) {
            case com.bumptech.glide.d.f6312l /* 0 */:
                Z z5 = new Z();
                ((C0466o0) obj).b(new C0519x0(this, activity, z5));
                Bundle bundleE = z5.e(50L);
                if (bundleE != null) {
                    bundle.putAll(bundleE);
                }
                break;
            case 1:
                m2.U0 u0V = ((m2.G0) obj).v();
                if (u0V.n().F() && bundle != null && (v02 = (m2.V0) u0V.f10772B.get(Integer.valueOf(activity.hashCode()))) != null) {
                    Bundle bundle2 = new Bundle();
                    bundle2.putLong("id", v02.f10786c);
                    bundle2.putString("name", v02.f10784a);
                    bundle2.putString("referrer_name", v02.f10785b);
                    bundle.putBundle("com.google.app_measurement.screen_service", bundle2);
                }
                break;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        switch (this.f6893w) {
            case com.bumptech.glide.d.f6312l /* 0 */:
                ((C0466o0) this.f6894x).b(new C0531z0(this, activity, 1));
                break;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
        switch (this.f6893w) {
            case com.bumptech.glide.d.f6312l /* 0 */:
                ((C0466o0) this.f6894x).b(new C0531z0(this, activity, 2));
                break;
        }
    }

    public /* synthetic */ C0460n0(int i6, Object obj) {
        this.f6893w = i6;
        this.f6894x = obj;
    }
}
