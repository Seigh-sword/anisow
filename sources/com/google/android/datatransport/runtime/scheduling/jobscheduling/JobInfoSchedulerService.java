package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import H1.j;
import H1.u;
import M1.f;
import Q1.a;
import android.app.job.JobParameters;
import android.app.job.JobService;
import android.util.Base64;
import d.RunnableC0637r;
import i.C0803c;

/* JADX INFO: loaded from: classes.dex */
public class JobInfoSchedulerService extends JobService {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final /* synthetic */ int f6416w = 0;

    @Override // android.app.job.JobService
    public final boolean onStartJob(JobParameters jobParameters) {
        String string = jobParameters.getExtras().getString("backendName");
        String string2 = jobParameters.getExtras().getString("extras");
        int i6 = jobParameters.getExtras().getInt("priority");
        int i7 = jobParameters.getExtras().getInt("attemptNumber");
        u.b(getApplicationContext());
        C0803c c0803cA = j.a();
        c0803cA.Q(string);
        c0803cA.R(a.b(i6));
        if (string2 != null) {
            c0803cA.f9278y = Base64.decode(string2, 0);
        }
        M1.j jVar = u.a().f962d;
        j jVarK = c0803cA.k();
        RunnableC0637r runnableC0637r = new RunnableC0637r(this, 8, jobParameters);
        jVar.getClass();
        jVar.f1790e.execute(new f(jVar, jVarK, i7, runnableC0637r));
        return true;
    }

    @Override // android.app.job.JobService
    public final boolean onStopJob(JobParameters jobParameters) {
        return true;
    }
}
