package androidx.work.impl.background.systemjob;

import I0.o;
import J0.a;
import J0.b;
import J0.k;
import S0.j;
import android.app.Application;
import android.app.job.JobParameters;
import android.app.job.JobService;
import android.os.Build;
import android.os.PersistableBundle;
import android.text.TextUtils;
import d.AbstractC0628i;
import i.C0803c;
import java.util.Arrays;
import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public class SystemJobService extends JobService implements a {

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final String f5849y = o.y("SystemJobService");

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public k f5850w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final HashMap f5851x = new HashMap();

    @Override // J0.a
    public final void a(String str, boolean z5) {
        JobParameters jobParameters;
        o.w().u(f5849y, AbstractC0628i.i(str, " executed on JobScheduler"), new Throwable[0]);
        synchronized (this.f5851x) {
            jobParameters = (JobParameters) this.f5851x.remove(str);
        }
        if (jobParameters != null) {
            jobFinished(jobParameters, z5);
        }
    }

    @Override // android.app.Service
    public final void onCreate() {
        super.onCreate();
        try {
            k kVarJ = k.J(getApplicationContext());
            this.f5850w = kVarJ;
            kVarJ.f1211m.b(this);
        } catch (IllegalStateException unused) {
            if (!Application.class.equals(getApplication().getClass())) {
                throw new IllegalStateException("WorkManager needs to be initialized via a ContentProvider#onCreate() or an Application#onCreate().");
            }
            o.w().z(f5849y, "Could not find WorkManager instance; this may be because an auto-backup is in progress. Ignoring JobScheduler commands for now. Please make sure that you are initializing WorkManager if you have manually disabled WorkManagerInitializer.", new Throwable[0]);
        }
    }

    @Override // android.app.Service
    public final void onDestroy() {
        super.onDestroy();
        k kVar = this.f5850w;
        if (kVar != null) {
            kVar.f1211m.e(this);
        }
    }

    @Override // android.app.job.JobService
    public final boolean onStartJob(JobParameters jobParameters) {
        PersistableBundle extras;
        if (this.f5850w == null) {
            o.w().u(f5849y, "WorkManager is not initialized; requesting retry.", new Throwable[0]);
            jobFinished(jobParameters, true);
            return false;
        }
        try {
            extras = jobParameters.getExtras();
        } catch (NullPointerException unused) {
        }
        String string = (extras == null || !extras.containsKey("EXTRA_WORK_SPEC_ID")) ? null : extras.getString("EXTRA_WORK_SPEC_ID");
        if (TextUtils.isEmpty(string)) {
            o.w().v(f5849y, "WorkSpec id not found!", new Throwable[0]);
            return false;
        }
        synchronized (this.f5851x) {
            try {
                if (this.f5851x.containsKey(string)) {
                    o.w().u(f5849y, "Job is already being executed by SystemJobService: " + string, new Throwable[0]);
                    return false;
                }
                o.w().u(f5849y, "onStartJob for " + string, new Throwable[0]);
                this.f5851x.put(string, jobParameters);
                int i6 = Build.VERSION.SDK_INT;
                C0803c c0803c = new C0803c(13);
                if (jobParameters.getTriggeredContentUris() != null) {
                    c0803c.f9278y = Arrays.asList(jobParameters.getTriggeredContentUris());
                }
                if (jobParameters.getTriggeredContentAuthorities() != null) {
                    c0803c.f9277x = Arrays.asList(jobParameters.getTriggeredContentAuthorities());
                }
                if (i6 >= 28) {
                    c0803c.f9279z = jobParameters.getNetwork();
                }
                this.f5850w.N(string, c0803c);
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // android.app.job.JobService
    public final boolean onStopJob(JobParameters jobParameters) {
        boolean zContains;
        PersistableBundle extras;
        if (this.f5850w == null) {
            o.w().u(f5849y, "WorkManager is not initialized; requesting retry.", new Throwable[0]);
            return true;
        }
        try {
            extras = jobParameters.getExtras();
        } catch (NullPointerException unused) {
        }
        String string = (extras == null || !extras.containsKey("EXTRA_WORK_SPEC_ID")) ? null : extras.getString("EXTRA_WORK_SPEC_ID");
        if (TextUtils.isEmpty(string)) {
            o.w().v(f5849y, "WorkSpec id not found!", new Throwable[0]);
            return false;
        }
        o.w().u(f5849y, AbstractC0628i.q("onStopJob for ", string), new Throwable[0]);
        synchronized (this.f5851x) {
            this.f5851x.remove(string);
        }
        k kVar = this.f5850w;
        kVar.f1209k.p(new j(kVar, string, false));
        b bVar = this.f5850w.f1211m;
        synchronized (bVar.f1176G) {
            zContains = bVar.f1174E.contains(string);
        }
        return !zContains;
    }
}
