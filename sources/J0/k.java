package J0;

import I0.o;
import I0.u;
import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.BroadcastReceiver;
import android.content.Context;
import androidx.work.impl.WorkDatabase;
import d2.AbstractC0651b;
import i.C0803c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import w0.p;
import w0.t;

/* JADX INFO: loaded from: classes.dex */
public final class k extends AbstractC0651b {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static k f1203q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static k f1204r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final Object f1205s;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Context f1206h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final I0.b f1207i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final WorkDatabase f1208j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final C0803c f1209k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final List f1210l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final b f1211m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final L3.c f1212n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f1213o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public BroadcastReceiver.PendingResult f1214p;

    static {
        o.y("WorkManagerImpl");
        f1203q = null;
        f1204r = null;
        f1205s = new Object();
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x014c  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0175  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0177 A[Catch: InstantiationException -> 0x0247, IllegalAccessException -> 0x025f, ClassNotFoundException -> 0x0277, TryCatch #3 {ClassNotFoundException -> 0x0277, IllegalAccessException -> 0x025f, InstantiationException -> 0x0247, blocks: (B:41:0x016f, B:45:0x018b, B:44:0x0177), top: B:79:0x016f }] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x019f  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x01a9  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x01ab  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x01d2 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public k(android.content.Context r25, I0.b r26, i.C0803c r27) {
        /*
            Method dump skipped, instruction units count: 684
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: J0.k.<init>(android.content.Context, I0.b, i.c):void");
    }

    public static k J(Context context) {
        k kVar;
        Object obj = f1205s;
        synchronized (obj) {
            try {
                synchronized (obj) {
                    kVar = f1203q;
                    if (kVar == null) {
                        kVar = f1204r;
                    }
                }
                return kVar;
            } catch (Throwable th) {
                throw th;
            } finally {
            }
        }
        if (kVar != null) {
            return kVar;
        }
        context.getApplicationContext();
        throw new IllegalStateException("WorkManager is not initialized properly.  You have explicitly disabled WorkManagerInitializer in your manifest, have not manually called WorkManager#initialize at this point, and your Application does not implement Configuration.Provider.");
    }

    public static void K(Context context, I0.b bVar) {
        synchronized (f1205s) {
            try {
                k kVar = f1203q;
                if (kVar != null && f1204r != null) {
                    throw new IllegalStateException("WorkManager is already initialized.  Did you try to initialize it manually without disabling WorkManagerInitializer? See WorkManager#initialize(Context, Configuration) or the class level Javadoc for more information.");
                }
                if (kVar == null) {
                    Context applicationContext = context.getApplicationContext();
                    if (f1204r == null) {
                        f1204r = new k(applicationContext, bVar, new C0803c(bVar.f1078b));
                    }
                    f1203q = f1204r;
                }
            } finally {
            }
        }
    }

    public final u H(List list) {
        if (list.isEmpty()) {
            throw new IllegalArgumentException("enqueue needs at least one WorkRequest.");
        }
        return new e(this, null, list).S();
    }

    public final u I(String str, List list) {
        return new e(this, str, list).S();
    }

    public final void L() {
        synchronized (f1205s) {
            try {
                this.f1213o = true;
                BroadcastReceiver.PendingResult pendingResult = this.f1214p;
                if (pendingResult != null) {
                    pendingResult.finish();
                    this.f1214p = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void M() {
        ArrayList arrayListC;
        Context context = this.f1206h;
        String str = M0.c.f1754A;
        JobScheduler jobScheduler = (JobScheduler) context.getSystemService("jobscheduler");
        if (jobScheduler != null && (arrayListC = M0.c.c(context, jobScheduler)) != null && !arrayListC.isEmpty()) {
            Iterator it = arrayListC.iterator();
            while (it.hasNext()) {
                M0.c.a(jobScheduler, ((JobInfo) it.next()).getId());
            }
        }
        R0.k kVarN = this.f1208j.n();
        ((p) kVarN.f2919a).b();
        B0.g gVarA = ((t) kVarN.f2927i).a();
        ((p) kVarN.f2919a).c();
        try {
            gVarA.f76x.executeUpdateDelete();
            ((p) kVarN.f2919a).h();
            ((p) kVarN.f2919a).f();
            ((t) kVarN.f2927i).c(gVarA);
            d.a(this.f1207i, this.f1208j, this.f1210l);
        } catch (Throwable th) {
            ((p) kVarN.f2919a).f();
            ((t) kVarN.f2927i).c(gVarA);
            throw th;
        }
    }

    public final void N(String str, C0803c c0803c) {
        this.f1209k.p(new K.a(this, str, c0803c, 7, 0));
    }
}
