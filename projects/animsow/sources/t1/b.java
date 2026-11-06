package T1;

import android.app.PendingIntent;
import android.content.Context;
import android.os.Bundle;
import android.os.Looper;
import android.os.Messenger;
import android.util.Log;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static int f3405h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static PendingIntent f3406i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final Pattern f3407j = Pattern.compile("\\|ID\\|([^|]+)\\|:?+(.*)");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Context f3409b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e0.b f3410c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ScheduledThreadPoolExecutor f3411d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Messenger f3413f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public h f3414g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final s.k f3408a = new s.k();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Messenger f3412e = new Messenger(new f(this, Looper.getMainLooper()));

    public b(Context context) {
        this.f3409b = context;
        this.f3410c = new e0.b(context);
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = new ScheduledThreadPoolExecutor(1);
        scheduledThreadPoolExecutor.setKeepAliveTime(60L, TimeUnit.SECONDS);
        scheduledThreadPoolExecutor.allowCoreThreadTimeOut(true);
        this.f3411d = scheduledThreadPoolExecutor;
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00dc  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final q2.s a(android.os.Bundle r9) {
        /*
            Method dump skipped, instruction units count: 265
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: T1.b.a(android.os.Bundle):q2.s");
    }

    public final void b(String str, Bundle bundle) {
        synchronized (this.f3408a) {
            try {
                q2.j jVar = (q2.j) this.f3408a.remove(str);
                if (jVar != null) {
                    jVar.a(bundle);
                    return;
                }
                Log.w("Rpc", "Missing callback for " + str);
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
