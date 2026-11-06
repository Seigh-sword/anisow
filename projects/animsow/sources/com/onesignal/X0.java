package com.onesignal;

import android.app.job.JobParameters;
import android.app.job.JobService;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes.dex */
public final class X0 extends AbstractRunnableC0563j {

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public WeakReference f7728x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public JobParameters f7729y;

    @Override // com.onesignal.AbstractRunnableC0563j
    public final void a() {
        AbstractC0603w1.b(EnumC0600v1.f7992B, "LollipopSyncRunnable:JobFinished needsJobReschedule: " + Z0.c().f7738a, null);
        boolean z5 = Z0.c().f7738a;
        Z0.c().f7738a = false;
        WeakReference weakReference = this.f7728x;
        if (weakReference.get() != null) {
            ((JobService) weakReference.get()).jobFinished(this.f7729y, z5);
        }
    }
}
