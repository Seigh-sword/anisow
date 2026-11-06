package androidx.lifecycle;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import s4.AbstractC1305a;

/* JADX INFO: loaded from: classes.dex */
public final class N implements Application.ActivityLifecycleCallbacks {
    public static final M Companion = new M();

    public static final void registerIn(Activity activity) {
        Companion.getClass();
        AbstractC1305a.o(activity, "activity");
        activity.registerActivityLifecycleCallbacks(new N());
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(Activity activity, Bundle bundle) {
        AbstractC1305a.o(activity, "activity");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(Activity activity) {
        AbstractC1305a.o(activity, "activity");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(Activity activity) {
        AbstractC1305a.o(activity, "activity");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPostCreated(Activity activity, Bundle bundle) {
        AbstractC1305a.o(activity, "activity");
        int i6 = O.f5570x;
        B3.e.n(activity, EnumC0313m.ON_CREATE);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPostResumed(Activity activity) {
        AbstractC1305a.o(activity, "activity");
        int i6 = O.f5570x;
        B3.e.n(activity, EnumC0313m.ON_RESUME);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPostStarted(Activity activity) {
        AbstractC1305a.o(activity, "activity");
        int i6 = O.f5570x;
        B3.e.n(activity, EnumC0313m.ON_START);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPreDestroyed(Activity activity) {
        AbstractC1305a.o(activity, "activity");
        int i6 = O.f5570x;
        B3.e.n(activity, EnumC0313m.ON_DESTROY);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPrePaused(Activity activity) {
        AbstractC1305a.o(activity, "activity");
        int i6 = O.f5570x;
        B3.e.n(activity, EnumC0313m.ON_PAUSE);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPreStopped(Activity activity) {
        AbstractC1305a.o(activity, "activity");
        int i6 = O.f5570x;
        B3.e.n(activity, EnumC0313m.ON_STOP);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityResumed(Activity activity) {
        AbstractC1305a.o(activity, "activity");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        AbstractC1305a.o(activity, "activity");
        AbstractC1305a.o(bundle, "bundle");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStarted(Activity activity) {
        AbstractC1305a.o(activity, "activity");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(Activity activity) {
        AbstractC1305a.o(activity, "activity");
    }
}
