package androidx.lifecycle;

import android.app.Activity;
import android.app.Application;
import s4.AbstractC1305a;

/* JADX INFO: loaded from: classes.dex */
public abstract class H {
    public static final void a(Activity activity, Application.ActivityLifecycleCallbacks activityLifecycleCallbacks) {
        AbstractC1305a.o(activity, "activity");
        AbstractC1305a.o(activityLifecycleCallbacks, "callback");
        activity.registerActivityLifecycleCallbacks(activityLifecycleCallbacks);
    }
}
