package L0;

import I0.o;
import J0.k;
import S0.r;
import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.Looper;
import android.os.PowerManager;
import android.text.TextUtils;
import androidx.work.impl.background.systemalarm.SystemAlarmService;
import i.C0803c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: loaded from: classes.dex */
public final class h implements J0.a {

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public static final String f1696G = o.y("SystemAlarmDispatcher");

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public final k f1697A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public final b f1698B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public final Handler f1699C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public final ArrayList f1700D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public Intent f1701E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public g f1702F;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final Context f1703w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final C0803c f1704x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final r f1705y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final J0.b f1706z;

    public h(Context context) {
        Context applicationContext = context.getApplicationContext();
        this.f1703w = applicationContext;
        this.f1698B = new b(applicationContext);
        this.f1705y = new r();
        k kVarJ = k.J(context);
        this.f1697A = kVarJ;
        J0.b bVar = kVarJ.f1211m;
        this.f1706z = bVar;
        this.f1704x = kVarJ.f1209k;
        bVar.b(this);
        this.f1700D = new ArrayList();
        this.f1701E = null;
        this.f1699C = new Handler(Looper.getMainLooper());
    }

    @Override // J0.a
    public final void a(String str, boolean z5) {
        String str2 = b.f1675z;
        Intent intent = new Intent(this.f1703w, (Class<?>) SystemAlarmService.class);
        intent.setAction("ACTION_EXECUTION_COMPLETED");
        intent.putExtra("KEY_WORKSPEC_ID", str);
        intent.putExtra("KEY_NEEDS_RESCHEDULE", z5);
        e(new c.d(0, this, intent));
    }

    public final void b(Intent intent, int i6) {
        o oVarW = o.w();
        String str = f1696G;
        oVarW.u(str, String.format("Adding command %s (%s)", intent, Integer.valueOf(i6)), new Throwable[0]);
        c();
        String action = intent.getAction();
        if (TextUtils.isEmpty(action)) {
            o.w().z(str, "Unknown command. Ignoring", new Throwable[0]);
            return;
        }
        if ("ACTION_CONSTRAINTS_CHANGED".equals(action)) {
            c();
            synchronized (this.f1700D) {
                try {
                    Iterator it = this.f1700D.iterator();
                    while (it.hasNext()) {
                        if ("ACTION_CONSTRAINTS_CHANGED".equals(((Intent) it.next()).getAction())) {
                            return;
                        }
                    }
                } finally {
                }
            }
        }
        intent.putExtra("KEY_START_ID", i6);
        synchronized (this.f1700D) {
            try {
                boolean z5 = !this.f1700D.isEmpty();
                this.f1700D.add(intent);
                if (!z5) {
                    f();
                }
            } finally {
            }
        }
    }

    public final void c() {
        if (this.f1699C.getLooper().getThread() != Thread.currentThread()) {
            throw new IllegalStateException("Needs to be invoked on the main thread.");
        }
    }

    public final void d() {
        o.w().u(f1696G, "Destroying SystemAlarmDispatcher", new Throwable[0]);
        this.f1706z.e(this);
        ScheduledExecutorService scheduledExecutorService = this.f1705y.f3102a;
        if (!scheduledExecutorService.isShutdown()) {
            scheduledExecutorService.shutdownNow();
        }
        this.f1702F = null;
    }

    public final void e(Runnable runnable) {
        this.f1699C.post(runnable);
    }

    public final void f() {
        c();
        PowerManager.WakeLock wakeLockA = S0.k.a(this.f1703w, "ProcessCommand");
        try {
            wakeLockA.acquire();
            this.f1697A.f1209k.p(new f(this, 0));
        } finally {
            wakeLockA.release();
        }
    }
}
