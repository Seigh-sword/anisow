package M0;

import I0.d;
import I0.o;
import J0.k;
import R0.e;
import R0.i;
import S0.f;
import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.Context;
import android.net.NetworkRequest;
import android.os.Build;
import android.os.PersistableBundle;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.background.systemjob.SystemJobService;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import u.h;

/* JADX INFO: loaded from: classes.dex */
public final class c implements J0.c {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public static final String f1754A = o.y("SystemJobScheduler");

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final Context f1755w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final JobScheduler f1756x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final k f1757y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final b f1758z;

    public c(Context context, k kVar) {
        JobScheduler jobScheduler = (JobScheduler) context.getSystemService("jobscheduler");
        b bVar = new b(context);
        this.f1755w = context;
        this.f1757y = kVar;
        this.f1756x = jobScheduler;
        this.f1758z = bVar;
    }

    public static void a(JobScheduler jobScheduler, int i6) {
        try {
            jobScheduler.cancel(i6);
        } catch (Throwable th) {
            o.w().v(f1754A, String.format(Locale.getDefault(), "Exception while trying to cancel job (%d)", Integer.valueOf(i6)), th);
        }
    }

    public static ArrayList c(Context context, JobScheduler jobScheduler) {
        List<JobInfo> allPendingJobs;
        try {
            allPendingJobs = jobScheduler.getAllPendingJobs();
        } catch (Throwable th) {
            o.w().v(f1754A, "getAllPendingJobs() is not reliable on this device.", th);
            allPendingJobs = null;
        }
        if (allPendingJobs == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(allPendingJobs.size());
        ComponentName componentName = new ComponentName(context, (Class<?>) SystemJobService.class);
        for (JobInfo jobInfo : allPendingJobs) {
            if (componentName.equals(jobInfo.getService())) {
                arrayList.add(jobInfo);
            }
        }
        return arrayList;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0035  */
    @Override // J0.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void b(java.lang.String r9) {
        /*
            r8 = this;
            android.content.Context r0 = r8.f1755w
            android.app.job.JobScheduler r1 = r8.f1756x
            java.util.ArrayList r0 = c(r0, r1)
            r2 = 0
            if (r0 != 0) goto Lc
            goto L49
        Lc:
            java.util.ArrayList r3 = new java.util.ArrayList
            r4 = 2
            r3.<init>(r4)
            java.util.Iterator r0 = r0.iterator()
        L16:
            boolean r4 = r0.hasNext()
            if (r4 == 0) goto L48
            java.lang.Object r4 = r0.next()
            android.app.job.JobInfo r4 = (android.app.job.JobInfo) r4
            java.lang.String r5 = "EXTRA_WORK_SPEC_ID"
            android.os.PersistableBundle r6 = r4.getExtras()
            if (r6 == 0) goto L35
            boolean r7 = r6.containsKey(r5)     // Catch: java.lang.NullPointerException -> L35
            if (r7 == 0) goto L35
            java.lang.String r5 = r6.getString(r5)     // Catch: java.lang.NullPointerException -> L35
            goto L36
        L35:
            r5 = r2
        L36:
            boolean r5 = r9.equals(r5)
            if (r5 == 0) goto L16
            int r4 = r4.getId()
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r3.add(r4)
            goto L16
        L48:
            r2 = r3
        L49:
            if (r2 == 0) goto L74
            boolean r0 = r2.isEmpty()
            if (r0 != 0) goto L74
            java.util.Iterator r0 = r2.iterator()
        L55:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L69
            java.lang.Object r2 = r0.next()
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            a(r1, r2)
            goto L55
        L69:
            J0.k r0 = r8.f1757y
            androidx.work.impl.WorkDatabase r0 = r0.f1208j
            i.c r0 = r0.k()
            r0.N(r9)
        L74:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: M0.c.b(java.lang.String):void");
    }

    public final void d(i iVar, int i6) {
        int i7;
        JobScheduler jobScheduler = this.f1756x;
        b bVar = this.f1758z;
        bVar.getClass();
        I0.c cVar = iVar.f2909j;
        PersistableBundle persistableBundle = new PersistableBundle();
        persistableBundle.putString("EXTRA_WORK_SPEC_ID", iVar.f2900a);
        persistableBundle.putBoolean("EXTRA_IS_PERIODIC", iVar.c());
        JobInfo.Builder extras = new JobInfo.Builder(i6, bVar.f1753a).setRequiresCharging(cVar.f1087b).setRequiresDeviceIdle(cVar.f1088c).setExtras(persistableBundle);
        int i8 = cVar.f1086a;
        int i9 = Build.VERSION.SDK_INT;
        if (i9 < 30 || i8 != 6) {
            int iB = h.b(i8);
            if (iB == 0) {
                i7 = 0;
            } else if (iB == 1) {
                i7 = 1;
            } else if (iB != 2) {
                i7 = 3;
                if (iB != 3) {
                    i7 = 4;
                    if (iB != 4 || i9 < 26) {
                        o.w().u(b.f1752b, "API version too low. Cannot convert network type value ".concat(H1.a.w(i8)), new Throwable[0]);
                        i7 = 1;
                    }
                }
            } else {
                i7 = 2;
            }
            extras.setRequiredNetworkType(i7);
        } else {
            extras.setRequiredNetwork(new NetworkRequest.Builder().addCapability(25).build());
        }
        if (!cVar.f1088c) {
            extras.setBackoffCriteria(iVar.f2912m, iVar.f2911l == 2 ? 0 : 1);
        }
        long jMax = Math.max(iVar.a() - System.currentTimeMillis(), 0L);
        if (i9 <= 28 || jMax > 0) {
            extras.setMinimumLatency(jMax);
        } else if (!iVar.f2916q) {
            extras.setImportantWhileForeground(true);
        }
        if (cVar.f1093h.f1096a.size() > 0) {
            for (d dVar : cVar.f1093h.f1096a) {
                extras.addTriggerContentUri(new JobInfo.TriggerContentUri(dVar.f1094a, dVar.f1095b ? 1 : 0));
            }
            extras.setTriggerContentUpdateDelay(cVar.f1091f);
            extras.setTriggerContentMaxDelay(cVar.f1092g);
        }
        extras.setPersisted(false);
        if (Build.VERSION.SDK_INT >= 26) {
            extras.setRequiresBatteryNotLow(cVar.f1089d);
            extras.setRequiresStorageNotLow(cVar.f1090e);
        }
        boolean z5 = iVar.f2910k > 0;
        boolean z6 = jMax > 0;
        if (J.b.a() && iVar.f2916q && !z5 && !z6) {
            extras.setExpedited(true);
        }
        JobInfo jobInfoBuild = extras.build();
        o oVarW = o.w();
        String str = iVar.f2900a;
        String str2 = f1754A;
        oVarW.u(str2, "Scheduling work ID " + str + " Job ID " + i6, new Throwable[0]);
        try {
            if (jobScheduler.schedule(jobInfoBuild) == 0) {
                o.w().z(str2, "Unable to schedule work ID " + iVar.f2900a, new Throwable[0]);
                if (iVar.f2916q && iVar.f2917r == 1) {
                    iVar.f2916q = false;
                    o.w().u(str2, "Scheduling a non-expedited job (work ID " + iVar.f2900a + ")", new Throwable[0]);
                    d(iVar, i6);
                }
            }
        } catch (IllegalStateException e6) {
            ArrayList arrayListC = c(this.f1755w, jobScheduler);
            int size = arrayListC != null ? arrayListC.size() : 0;
            Locale locale = Locale.getDefault();
            Integer numValueOf = Integer.valueOf(size);
            k kVar = this.f1757y;
            String str3 = String.format(locale, "JobScheduler 100 job limit exceeded.  We count %d WorkManager jobs in JobScheduler; we have %d tracked jobs in our DB; our Configuration limit is %d.", numValueOf, Integer.valueOf(kVar.f1208j.n().g().size()), Integer.valueOf(kVar.f1207i.f1084h));
            o.w().v(str2, str3, new Throwable[0]);
            throw new IllegalStateException(str3, e6);
        } catch (Throwable th) {
            o.w().v(str2, "Unable to schedule " + iVar, th);
        }
    }

    @Override // J0.c
    public final boolean e() {
        return true;
    }

    @Override // J0.c
    public final void f(i... iVarArr) {
        int i6;
        int i7;
        k kVar = this.f1757y;
        WorkDatabase workDatabase = kVar.f1208j;
        int i8 = 0;
        f fVar = new f(0, workDatabase);
        int length = iVarArr.length;
        int i9 = 0;
        while (i9 < length) {
            i iVar = iVarArr[i9];
            workDatabase.c();
            try {
                i iVarK = workDatabase.n().k(iVar.f2900a);
                String str = f1754A;
                if (iVarK == null) {
                    o.w().z(str, "Skipping scheduling " + iVar.f2900a + " because it's no longer in the DB", new Throwable[i8]);
                } else if (iVarK.f2901b != 1) {
                    o.w().z(str, "Skipping scheduling " + iVar.f2900a + " because it is no longer enqueued", new Throwable[i8]);
                } else {
                    e eVarD = workDatabase.k().D(iVar.f2900a);
                    if (eVarD != null) {
                        i7 = eVarD.f2893b;
                        i6 = length;
                    } else {
                        kVar.f1207i.getClass();
                        int i10 = kVar.f1207i.f1083g;
                        synchronized (f.class) {
                            int iE = fVar.E("next_job_scheduler_id");
                            if (iE < 0 || iE > i10) {
                                i6 = length;
                                ((WorkDatabase) fVar.f3073x).j().e(new R0.d("next_job_scheduler_id", 1));
                                i7 = 0;
                            } else {
                                i6 = length;
                                i7 = iE;
                            }
                        }
                    }
                    if (eVarD == null) {
                        kVar.f1208j.k().H(new e(i7, iVar.f2900a));
                    }
                    d(iVar, i7);
                    workDatabase.h();
                    i9++;
                    length = i6;
                    i8 = 0;
                }
                workDatabase.h();
                workDatabase.f();
                i6 = length;
                i9++;
                length = i6;
                i8 = 0;
            } finally {
                workDatabase.f();
            }
        }
    }
}
