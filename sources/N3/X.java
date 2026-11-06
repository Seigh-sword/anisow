package N3;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import s4.AbstractC1305a;
import s4.C1316l;

/* JADX INFO: loaded from: classes.dex */
public final class X implements Application.ActivityLifecycleCallbacks {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final X f2191w = new X();

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static boolean f2192x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static T f2193y;

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        AbstractC1305a.o(activity, "activity");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        AbstractC1305a.o(activity, "activity");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        AbstractC1305a.o(activity, "activity");
        T t5 = f2193y;
        if (t5 != null) {
            t5.c(2);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        C1316l c1316l;
        AbstractC1305a.o(activity, "activity");
        T t5 = f2193y;
        if (t5 != null) {
            t5.c(1);
            c1316l = C1316l.f12640a;
        } else {
            c1316l = null;
        }
        if (c1316l == null) {
            f2192x = true;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        AbstractC1305a.o(activity, "activity");
        AbstractC1305a.o(bundle, "outState");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        AbstractC1305a.o(activity, "activity");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
        AbstractC1305a.o(activity, "activity");
    }
}
