package W1;

import android.app.Activity;
import android.app.Application;
import android.content.ComponentCallbacks2;
import android.content.res.Configuration;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: renamed from: W1.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class ComponentCallbacks2C0209c implements Application.ActivityLifecycleCallbacks, ComponentCallbacks2 {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public static final ComponentCallbacks2C0209c f4292A = new ComponentCallbacks2C0209c();

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final AtomicBoolean f4293w = new AtomicBoolean();

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final AtomicBoolean f4294x = new AtomicBoolean();

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final ArrayList f4295y = new ArrayList();

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public boolean f4296z = false;

    public static void a(Application application) {
        ComponentCallbacks2C0209c componentCallbacks2C0209c = f4292A;
        synchronized (componentCallbacks2C0209c) {
            try {
                if (!componentCallbacks2C0209c.f4296z) {
                    application.registerActivityLifecycleCallbacks(componentCallbacks2C0209c);
                    application.registerComponentCallbacks(componentCallbacks2C0209c);
                    componentCallbacks2C0209c.f4296z = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void b(boolean z5) {
        synchronized (f4292A) {
            try {
                Iterator it = this.f4295y.iterator();
                while (it.hasNext()) {
                    ((InterfaceC0208b) it.next()).a(z5);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        AtomicBoolean atomicBoolean = this.f4294x;
        boolean zCompareAndSet = this.f4293w.compareAndSet(true, false);
        atomicBoolean.set(true);
        if (zCompareAndSet) {
            b(false);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        AtomicBoolean atomicBoolean = this.f4294x;
        boolean zCompareAndSet = this.f4293w.compareAndSet(true, false);
        atomicBoolean.set(true);
        if (zCompareAndSet) {
            b(false);
        }
    }

    @Override // android.content.ComponentCallbacks2
    public final void onTrimMemory(int i6) {
        if (i6 == 20 && this.f4293w.compareAndSet(false, true)) {
            this.f4294x.set(true);
            b(true);
        }
    }

    @Override // android.content.ComponentCallbacks
    public final void onLowMemory() {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
    }

    @Override // android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }
}
