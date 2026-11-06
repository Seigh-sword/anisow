package D;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import android.util.Log;
import m.RunnableC0969k;

/* JADX INFO: renamed from: D.g, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0006g implements Application.ActivityLifecycleCallbacks {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public Object f193w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public Activity f194x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final int f195y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public boolean f196z = false;

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public boolean f191A = false;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public boolean f192B = false;

    public C0006g(Activity activity) {
        this.f194x = activity;
        this.f195y = activity.hashCode();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        if (this.f194x == activity) {
            this.f194x = null;
            this.f191A = true;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        if (!this.f191A || this.f192B || this.f196z) {
            return;
        }
        Object obj = this.f193w;
        try {
            Object obj2 = AbstractC0007h.f199c.get(activity);
            if (obj2 == obj && activity.hashCode() == this.f195y) {
                AbstractC0007h.f203g.postAtFrontOfQueue(new RunnableC0969k(AbstractC0007h.f198b.get(activity), obj2, 4));
                this.f192B = true;
                this.f193w = null;
            }
        } catch (Throwable th) {
            Log.e("ActivityRecreator", "Exception while fetching field values", th);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        if (this.f194x == activity) {
            this.f196z = true;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }
}
