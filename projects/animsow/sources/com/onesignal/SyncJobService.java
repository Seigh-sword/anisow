package com.onesignal;

import android.app.job.JobParameters;
import android.app.job.JobService;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes.dex */
public class SyncJobService extends JobService {
    @Override // android.app.job.JobService
    public final boolean onStartJob(JobParameters jobParameters) {
        Z0 z0C = Z0.c();
        X0 x02 = new X0(1);
        x02.f7728x = new WeakReference(this);
        x02.f7729y = jobParameters;
        z0C.getClass();
        AbstractC0603w1.b(EnumC0600v1.f7992B, "OSBackground sync, calling initWithContext", null);
        AbstractC0603w1.B(this);
        Thread thread = new Thread(x02, "OS_SYNCSRV_BG_SYNC");
        z0C.f7739b = thread;
        thread.start();
        return true;
    }

    @Override // android.app.job.JobService
    public final boolean onStopJob(JobParameters jobParameters) {
        Z0 z0C = Z0.c();
        Thread thread = z0C.f7739b;
        boolean z5 = false;
        if (thread != null && thread.isAlive()) {
            z0C.f7739b.interrupt();
            z5 = true;
        }
        AbstractC0603w1.b(EnumC0600v1.f7992B, "SyncJobService onStopJob called, system conditions not available reschedule: " + z5, null);
        return z5;
    }
}
