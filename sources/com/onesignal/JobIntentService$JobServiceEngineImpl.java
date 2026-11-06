package com.onesignal;

import android.app.job.JobParameters;
import android.app.job.JobServiceEngine;
import android.app.job.JobWorkItem;
import android.content.Intent;
import android.os.IBinder;
import android.util.Log;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: loaded from: classes.dex */
public final class JobIntentService$JobServiceEngineImpl extends JobServiceEngine implements JobIntentService$CompatJobEngine {
    static final boolean DEBUG = false;
    static final String TAG = "JobServiceEngineImpl";
    final Object mLock;
    JobParameters mParams;
    final H mService;

    public final class WrapperWorkItem implements JobIntentService$GenericWorkItem {
        final JobWorkItem mJobWork;

        public WrapperWorkItem(JobWorkItem jobWorkItem) {
            this.mJobWork = jobWorkItem;
        }

        @Override // com.onesignal.JobIntentService$GenericWorkItem
        public void complete() {
            String str;
            String str2;
            synchronized (JobIntentService$JobServiceEngineImpl.this.mLock) {
                JobParameters jobParameters = JobIntentService$JobServiceEngineImpl.this.mParams;
                if (jobParameters != null) {
                    try {
                        jobParameters.completeWork(this.mJobWork);
                    } catch (IllegalArgumentException e6) {
                        e = e6;
                        str = JobIntentService$JobServiceEngineImpl.TAG;
                        str2 = "IllegalArgumentException: Failed to run mParams.completeWork(mJobWork)!";
                        Log.e(str, str2, e);
                    } catch (SecurityException e7) {
                        e = e7;
                        str = JobIntentService$JobServiceEngineImpl.TAG;
                        str2 = "SecurityException: Failed to run mParams.completeWork(mJobWork)!";
                        Log.e(str, str2, e);
                    }
                }
            }
        }

        @Override // com.onesignal.JobIntentService$GenericWorkItem
        public Intent getIntent() {
            return this.mJobWork.getIntent();
        }
    }

    public JobIntentService$JobServiceEngineImpl(H h4) {
        super(h4);
        this.mLock = new Object();
        this.mService = h4;
    }

    @Override // com.onesignal.JobIntentService$CompatJobEngine
    public IBinder compatGetBinder() {
        return getBinder();
    }

    @Override // com.onesignal.JobIntentService$CompatJobEngine
    public JobIntentService$GenericWorkItem dequeueWork() {
        synchronized (this.mLock) {
            JobParameters jobParameters = this.mParams;
            if (jobParameters == null) {
                return null;
            }
            try {
                JobWorkItem jobWorkItemDequeueWork = jobParameters.dequeueWork();
                if (jobWorkItemDequeueWork == null) {
                    return null;
                }
                jobWorkItemDequeueWork.getIntent().setExtrasClassLoader(this.mService.getClassLoader());
                return new WrapperWorkItem(jobWorkItemDequeueWork);
            } catch (SecurityException e6) {
                Log.e(TAG, "Failed to run mParams.dequeueWork()!", e6);
                return null;
            }
        }
    }

    public boolean onStartJob(JobParameters jobParameters) {
        this.mParams = jobParameters;
        this.mService.a(DEBUG);
        return true;
    }

    public boolean onStopJob(JobParameters jobParameters) {
        JobIntentService$CommandProcessor jobIntentService$CommandProcessor = this.mService.f7570y;
        if (jobIntentService$CommandProcessor != null) {
            jobIntentService$CommandProcessor.cancel(DEBUG);
        }
        synchronized (this.mLock) {
            this.mParams = null;
        }
        return true;
    }
}
