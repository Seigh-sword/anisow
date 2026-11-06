package J0;

import I0.o;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.PowerManager;
import androidx.work.ListenableWorker;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.foreground.SystemForegroundService;
import d.AbstractC0628i;
import i.C0803c;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public final class b implements a, Q0.a {

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public static final String f1169H = o.y("Processor");

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public final WorkDatabase f1170A;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public final List f1173D;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final Context f1178x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final I0.b f1179y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final C0803c f1180z;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public final HashMap f1172C = new HashMap();

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public final HashMap f1171B = new HashMap();

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public final HashSet f1174E = new HashSet();

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public final ArrayList f1175F = new ArrayList();

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public PowerManager.WakeLock f1177w = null;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public final Object f1176G = new Object();

    public b(Context context, I0.b bVar, C0803c c0803c, WorkDatabase workDatabase, List list) {
        this.f1178x = context;
        this.f1179y = bVar;
        this.f1180z = c0803c;
        this.f1170A = workDatabase;
        this.f1173D = list;
    }

    public static boolean c(String str, m mVar) {
        boolean zIsDone;
        if (mVar == null) {
            o.w().u(f1169H, AbstractC0628i.q("WorkerWrapper could not be found for ", str), new Throwable[0]);
            return false;
        }
        mVar.f1238N = true;
        mVar.i();
        X2.a aVar = mVar.f1237M;
        if (aVar != null) {
            zIsDone = aVar.isDone();
            mVar.f1237M.cancel(true);
        } else {
            zIsDone = false;
        }
        ListenableWorker listenableWorker = mVar.f1225A;
        if (listenableWorker == null || zIsDone) {
            o.w().u(m.f1224O, "WorkSpec " + mVar.f1242z + " is already done. Not interrupting.", new Throwable[0]);
        } else {
            listenableWorker.f();
        }
        o.w().u(f1169H, AbstractC0628i.q("WorkerWrapper interrupted for ", str), new Throwable[0]);
        return true;
    }

    @Override // J0.a
    public final void a(String str, boolean z5) {
        synchronized (this.f1176G) {
            try {
                this.f1172C.remove(str);
                o.w().u(f1169H, b.class.getSimpleName() + " " + str + " executed; reschedule = " + z5, new Throwable[0]);
                Iterator it = this.f1175F.iterator();
                while (it.hasNext()) {
                    ((a) it.next()).a(str, z5);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void b(a aVar) {
        synchronized (this.f1176G) {
            this.f1175F.add(aVar);
        }
    }

    public final boolean d(String str) {
        boolean z5;
        synchronized (this.f1176G) {
            try {
                z5 = this.f1172C.containsKey(str) || this.f1171B.containsKey(str);
            } finally {
            }
        }
        return z5;
    }

    public final void e(a aVar) {
        synchronized (this.f1176G) {
            this.f1175F.remove(aVar);
        }
    }

    public final void f(String str, I0.h hVar) {
        synchronized (this.f1176G) {
            try {
                o.w().x(f1169H, "Moving WorkSpec (" + str + ") to the foreground", new Throwable[0]);
                m mVar = (m) this.f1172C.remove(str);
                if (mVar != null) {
                    if (this.f1177w == null) {
                        PowerManager.WakeLock wakeLockA = S0.k.a(this.f1178x, "ProcessorForegroundLck");
                        this.f1177w = wakeLockA;
                        wakeLockA.acquire();
                    }
                    this.f1171B.put(str, mVar);
                    Intent intentE = Q0.c.e(this.f1178x, str, hVar);
                    Context context = this.f1178x;
                    Object obj = E.f.f379a;
                    if (Build.VERSION.SDK_INT >= 26) {
                        E.d.b(context, intentE);
                    } else {
                        context.startService(intentE);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final boolean g(String str, C0803c c0803c) {
        synchronized (this.f1176G) {
            try {
                if (d(str)) {
                    o.w().u(f1169H, "Work " + str + " is already enqueued for processing", new Throwable[0]);
                    return false;
                }
                Context context = this.f1178x;
                I0.b bVar = this.f1179y;
                C0803c c0803c2 = this.f1180z;
                WorkDatabase workDatabase = this.f1170A;
                l lVar = new l();
                lVar.f1223i = new C0803c(13);
                lVar.f1216b = context.getApplicationContext();
                lVar.f1219e = c0803c2;
                lVar.f1218d = this;
                lVar.f1220f = bVar;
                lVar.f1221g = workDatabase;
                lVar.f1215a = str;
                lVar.f1222h = this.f1173D;
                if (c0803c != null) {
                    lVar.f1223i = c0803c;
                }
                m mVarA = lVar.a();
                T0.i iVar = mVarA.f1236L;
                iVar.a(new K.a(this, str, iVar, 3, 0), (Executor) this.f1180z.f9279z);
                this.f1172C.put(str, mVarA);
                ((S0.i) this.f1180z.f9277x).execute(mVarA);
                o.w().u(f1169H, b.class.getSimpleName() + ": processing " + str, new Throwable[0]);
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void h() {
        synchronized (this.f1176G) {
            try {
                if (!(!this.f1171B.isEmpty())) {
                    Context context = this.f1178x;
                    String str = Q0.c.f2775F;
                    Intent intent = new Intent(context, (Class<?>) SystemForegroundService.class);
                    intent.setAction("ACTION_STOP_FOREGROUND");
                    try {
                        this.f1178x.startService(intent);
                    } catch (Throwable th) {
                        o.w().v(f1169H, "Unable to stop foreground service", th);
                    }
                    PowerManager.WakeLock wakeLock = this.f1177w;
                    if (wakeLock != null) {
                        wakeLock.release();
                        this.f1177w = null;
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final boolean i(String str) {
        boolean zC;
        synchronized (this.f1176G) {
            o.w().u(f1169H, "Processor stopping foreground work " + str, new Throwable[0]);
            zC = c(str, (m) this.f1171B.remove(str));
        }
        return zC;
    }

    public final boolean j(String str) {
        boolean zC;
        synchronized (this.f1176G) {
            o.w().u(f1169H, "Processor stopping background work " + str, new Throwable[0]);
            zC = c(str, (m) this.f1172C.remove(str));
        }
        return zC;
    }
}
