package m4;

import android.app.Activity;
import android.app.Application;
import d.AbstractActivityC0638s;
import o4.InterfaceC1229b;

/* JADX INFO: renamed from: m4.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1129b implements InterfaceC1229b {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public volatile V0.a f11656w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final Object f11657x = new Object();

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final Activity f11658y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final C1133f f11659z;

    public C1129b(Activity activity) {
        this.f11658y = activity;
        this.f11659z = new C1133f((AbstractActivityC0638s) activity);
    }

    public final V0.a a() {
        String str;
        Activity activity = this.f11658y;
        if (activity.getApplication() instanceof InterfaceC1229b) {
            V0.c cVar = (V0.c) ((InterfaceC1128a) S3.a.r(InterfaceC1128a.class, this.f11659z));
            return new V0.a(cVar.f3683a, cVar.f3684b);
        }
        StringBuilder sb = new StringBuilder("Hilt Activity must be attached to an @HiltAndroidApp Application. ");
        if (Application.class.equals(activity.getApplication().getClass())) {
            str = "Did you forget to specify your Application's class name in your manifest's <application />'s android:name attribute?";
        } else {
            str = "Found: " + activity.getApplication().getClass();
        }
        sb.append(str);
        throw new IllegalStateException(sb.toString());
    }

    @Override // o4.InterfaceC1229b
    public final Object c() {
        if (this.f11656w == null) {
            synchronized (this.f11657x) {
                try {
                    if (this.f11656w == null) {
                        this.f11656w = a();
                    }
                } finally {
                }
            }
        }
        return this.f11656w;
    }
}
