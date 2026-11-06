package d;

import android.app.job.JobParameters;
import android.content.Context;
import android.content.Intent;
import android.graphics.Typeface;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.Process;
import android.os.StrictMode;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import androidx.profileinstaller.ProfileInstallerInitializer;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.JobInfoSchedulerService;
import com.google.android.gms.internal.measurement.C0460n0;
import com.google.firebase.messaging.FirebaseMessaging;
import e3.ScheduledFutureC0671h;
import e3.ThreadFactoryC0664a;
import h0.C0750o;
import h0.C0751p;
import h0.C0752q;
import h0.s0;
import i.ExecutorC0817q;
import i.RunnableC0814n;
import i0.AbstractC0823c;
import i0.AbstractC0825e;
import i0.C0822b;
import j3.C0863m;
import j3.C0868r;
import j3.C0870t;
import java.util.Iterator;
import java.util.Random;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.CountDownLatch;
import p1.C1243i;
import p3.C1251c;
import q3.C1265c;
import s4.AbstractC1305a;
import t0.AbstractC1332d;
import t0.AbstractC1335g;

/* JADX INFO: renamed from: d.r, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC0637r implements Runnable {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ int f8122w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ Object f8123x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ Object f8124y;

    public /* synthetic */ RunnableC0637r(Object obj, int i6, Object obj2) {
        this.f8122w = i6;
        this.f8123x = obj;
        this.f8124y = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        D3.a aVar;
        Set set;
        D3.c cVar;
        int i6 = 1;
        switch (this.f8122w) {
            case com.bumptech.glide.d.f6312l /* 0 */:
                AbstractActivityC0638s abstractActivityC0638s = (AbstractActivityC0638s) this.f8123x;
                C0618F c0618f = (C0618F) this.f8124y;
                AbstractC1305a.o(abstractActivityC0638s, "this$0");
                AbstractC1305a.o(c0618f, "$dispatcher");
                int i7 = AbstractActivityC0638s.f8125O;
                abstractActivityC0638s.f205w.a(new C0627h(abstractActivityC0638s, c0618f));
                return;
            case 1:
                ExecutorC0817q executorC0817q = (ExecutorC0817q) this.f8123x;
                Runnable runnable = (Runnable) this.f8124y;
                executorC0817q.getClass();
                try {
                    runnable.run();
                    return;
                } finally {
                    executorC0817q.a();
                }
            case Z.j.FLOAT_FIELD_NUMBER /* 2 */:
                ((com.bumptech.glide.d) this.f8123x).t((Typeface) this.f8124y);
                return;
            case Z.j.INTEGER_FIELD_NUMBER /* 3 */:
                C0752q c0752q = (C0752q) this.f8123x;
                s0 s0Var = (s0) this.f8124y;
                AbstractC1305a.o(c0752q, "this$0");
                AbstractC1305a.o(s0Var, "$operation");
                c0752q.a(s0Var);
                return;
            case Z.j.LONG_FIELD_NUMBER /* 4 */:
                C0750o c0750o = (C0750o) this.f8123x;
                ViewGroup viewGroup = (ViewGroup) this.f8124y;
                AbstractC1305a.o(c0750o, "this$0");
                AbstractC1305a.o(viewGroup, "$container");
                Iterator it = c0750o.f8858c.iterator();
                while (it.hasNext()) {
                    s0 s0Var2 = (s0) ((C0751p) it.next()).f1668w;
                    View view = s0Var2.f8888c.f8618c0;
                    if (view != null) {
                        AbstractC0628i.a(s0Var2.f8886a, view, viewGroup);
                    }
                }
                return;
            case Z.j.STRING_FIELD_NUMBER /* 5 */:
            case 11:
            default:
                J3.p pVar = (J3.p) this.f8123x;
                q2.j jVar = (q2.j) this.f8124y;
                pVar.getClass();
                try {
                    jVar.a(pVar.b());
                    return;
                } catch (Exception e6) {
                    jVar.f12351a.k(e6);
                    return;
                }
            case Z.j.STRING_SET_FIELD_NUMBER /* 6 */:
                String str = (String) this.f8123x;
                AbstractC0825e abstractC0825e = (AbstractC0825e) this.f8124y;
                C0822b c0822b = AbstractC0823c.f9359a;
                AbstractC1305a.o(abstractC0825e, "$violation");
                Log.e("FragmentStrictMode", "Policy violation with PENALTY_DEATH in " + str, abstractC0825e);
                throw abstractC0825e;
            case Z.j.DOUBLE_FIELD_NUMBER /* 7 */:
                ProfileInstallerInitializer profileInstallerInitializer = (ProfileInstallerInitializer) this.f8123x;
                Context context = (Context) this.f8124y;
                profileInstallerInitializer.getClass();
                (Build.VERSION.SDK_INT >= 28 ? AbstractC1335g.a(Looper.getMainLooper()) : new Handler(Looper.getMainLooper())).postDelayed(new RunnableC0814n(context, i6), new Random().nextInt(Math.max(1000, 1)) + 5000);
                return;
            case Z.j.BYTES_FIELD_NUMBER /* 8 */:
                JobInfoSchedulerService jobInfoSchedulerService = (JobInfoSchedulerService) this.f8123x;
                JobParameters jobParameters = (JobParameters) this.f8124y;
                int i8 = JobInfoSchedulerService.f6416w;
                jobInfoSchedulerService.jobFinished(jobParameters, false);
                return;
            case 9:
                d3.p pVar2 = (d3.p) this.f8123x;
                D3.c cVar2 = (D3.c) this.f8124y;
                if (pVar2.f8218b != d3.p.f8216d) {
                    throw new IllegalStateException("provide() can be called only once.");
                }
                synchronized (pVar2) {
                    aVar = pVar2.f8217a;
                    pVar2.f8217a = null;
                    pVar2.f8218b = cVar2;
                    break;
                }
                aVar.e(cVar2);
                return;
            case 10:
                d3.o oVar = (d3.o) this.f8123x;
                D3.c cVar3 = (D3.c) this.f8124y;
                synchronized (oVar) {
                    try {
                        if (oVar.f8214b == null) {
                            set = oVar.f8213a;
                            cVar = cVar3;
                        } else {
                            set = oVar.f8214b;
                            cVar = cVar3.get();
                        }
                        set.add(cVar);
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return;
            case 12:
                ThreadFactoryC0664a threadFactoryC0664a = (ThreadFactoryC0664a) this.f8123x;
                Runnable runnable2 = (Runnable) this.f8124y;
                Process.setThreadPriority(threadFactoryC0664a.f8260c);
                StrictMode.ThreadPolicy threadPolicy = threadFactoryC0664a.f8261d;
                if (threadPolicy != null) {
                    StrictMode.setThreadPolicy(threadPolicy);
                }
                runnable2.run();
                return;
            case 13:
                Callable callable = (Callable) this.f8123x;
                K1.b bVar = (K1.b) this.f8124y;
                try {
                    Object objCall = callable.call();
                    ScheduledFutureC0671h scheduledFutureC0671h = (ScheduledFutureC0671h) bVar.f1515x;
                    int i9 = ScheduledFutureC0671h.f8280E;
                    scheduledFutureC0671h.i(objCall);
                    return;
                } catch (Exception e7) {
                    ScheduledFutureC0671h scheduledFutureC0671h2 = (ScheduledFutureC0671h) bVar.f1515x;
                    int i10 = ScheduledFutureC0671h.f8280E;
                    scheduledFutureC0671h2.j(e7);
                    return;
                }
            case 14:
                ((C0863m) this.f8123x).c((String) this.f8124y, Boolean.FALSE);
                return;
            case 15:
                C0868r c0868r = (C0868r) this.f8123x;
                Throwable th2 = (Throwable) this.f8124y;
                C0863m c0863m = c0868r.f9519g;
                Thread threadCurrentThread = Thread.currentThread();
                c0863m.getClass();
                long jCurrentTimeMillis = System.currentTimeMillis();
                C0870t c0870t = c0863m.f9499n;
                if (c0870t == null || !c0870t.f9539e.get()) {
                    long j6 = jCurrentTimeMillis / 1000;
                    String strE = c0863m.e();
                    if (strE == null) {
                        Log.w("FirebaseCrashlytics", "Tried to write a non-fatal exception while no session was open.", null);
                        return;
                    }
                    C1251c c1251c = c0863m.f9498m;
                    c1251c.getClass();
                    String strConcat = "Persisting non-fatal event for session ".concat(strE);
                    if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                        Log.v("FirebaseCrashlytics", strConcat, null);
                    }
                    c1251c.p(th2, threadCurrentThread, strE, "error", j6, false);
                    return;
                }
                return;
            case 16:
                C1265c c1265c = (C1265c) this.f8123x;
                CountDownLatch countDownLatch = (CountDownLatch) this.f8124y;
                c1265c.getClass();
                try {
                    H1.s sVar = c1265c.f12396h;
                    E1.d dVar = E1.d.f387y;
                    if (sVar instanceof H1.s) {
                        H1.u.a().f962d.a(sVar.f953a.c(dVar), 1);
                    } else {
                        String strJ = AbstractC1332d.J("ForcedSender");
                        if (Log.isLoggable(strJ, 5)) {
                            Log.w(strJ, "Expected instance of `TransportImpl`, got `" + sVar + "`.");
                        }
                    }
                    break;
                } catch (Exception unused) {
                }
                countDownLatch.countDown();
                return;
            case 17:
                ((C0460n0) this.f8123x).a((Intent) this.f8124y);
                return;
            case 18:
                FirebaseMessaging firebaseMessaging = (FirebaseMessaging) this.f8123x;
                q2.j jVar2 = (q2.j) this.f8124y;
                C1243i c1243i = FirebaseMessaging.f7437k;
                firebaseMessaging.getClass();
                try {
                    jVar2.a(firebaseMessaging.a());
                    return;
                } catch (Exception e8) {
                    jVar2.f12351a.k(e8);
                    return;
                }
        }
    }
}
