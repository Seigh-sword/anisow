package com.onesignal;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: renamed from: com.onesignal.g, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0554g implements Application.ActivityLifecycleCallbacks {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static C0554g f7811w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static C0548e f7812x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static ComponentCallbacksC0551f f7813y;

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        C0548e c0548e = f7812x;
        if (c0548e != null) {
            c0548e.getClass();
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        C0548e c0548e = f7812x;
        if (c0548e != null) {
            AbstractC0603w1.b(EnumC0600v1.f7992B, "onActivityDestroyed: " + activity, null);
            C0548e.f7787f.clear();
            if (activity == c0548e.f7789b) {
                c0548e.f7789b = null;
                c0548e.b();
            }
            c0548e.c();
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        C0548e c0548e = f7812x;
        if (c0548e != null) {
            c0548e.getClass();
            AbstractC0603w1.b(EnumC0600v1.f7992B, "onActivityPaused: " + activity, null);
            if (activity == c0548e.f7789b) {
                c0548e.f7789b = null;
                c0548e.b();
            }
            c0548e.c();
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        C0548e c0548e = f7812x;
        if (c0548e != null) {
            c0548e.getClass();
            AbstractC0603w1.b(EnumC0600v1.f7992B, "onActivityResumed: " + activity, null);
            c0548e.d(activity);
            c0548e.c();
            c0548e.a();
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        C0548e c0548e = f7812x;
        if (c0548e != null) {
            boolean z5 = C0546d0.f7780b;
            C0546d0 c0546d0 = c0548e.f7788a;
            if (!z5) {
                c0546d0.getClass();
                C0546d0.f7780b = false;
                RunnableC0604x runnableC0604x = c0546d0.f7783a;
                if (runnableC0604x != null) {
                    HandlerThreadC0556g1.b().a(runnableC0604x);
                    return;
                }
                return;
            }
            c0546d0.getClass();
            C0546d0.f7780b = false;
            c0546d0.f7783a = null;
            AbstractC0603w1.b(EnumC0600v1.f7992B, "OSFocusHandler running onAppStartFocusLogic", null);
            S0 s0L = AbstractC0603w1.l(AbstractC0603w1.f8028b);
            s0L.getClass();
            boolean zA = OSUtils.a();
            boolean z6 = s0L.f7699x != zA;
            s0L.f7699x = zA;
            if (z6) {
                s0L.f7698w.h(s0L);
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
        C0548e c0548e = f7812x;
        if (c0548e != null) {
            AbstractC0603w1.b(EnumC0600v1.f7992B, "onActivityStopped: " + activity, null);
            if (activity == c0548e.f7789b) {
                c0548e.f7789b = null;
                c0548e.b();
            }
            Iterator it = C0548e.f7785d.entrySet().iterator();
            while (it.hasNext()) {
                ((AbstractC0542c) ((Map.Entry) it.next()).getValue()).b(activity);
            }
            c0548e.c();
            if (c0548e.f7789b == null) {
                C0546d0 c0546d0 = c0548e.f7788a;
                c0546d0.getClass();
                RunnableC0604x runnableC0604x = RunnableC0604x.f8061x;
                HandlerThreadC0556g1.b().c(runnableC0604x, 1500L);
                c0546d0.f7783a = runnableC0604x;
            }
        }
    }
}
