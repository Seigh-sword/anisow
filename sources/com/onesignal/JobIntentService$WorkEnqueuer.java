package com.onesignal;

import android.content.ComponentName;
import android.content.Intent;

/* JADX INFO: loaded from: classes.dex */
abstract class JobIntentService$WorkEnqueuer {
    final ComponentName mComponentName;
    boolean mHasJobId;
    int mJobId;

    public JobIntentService$WorkEnqueuer(ComponentName componentName) {
        this.mComponentName = componentName;
    }

    public abstract void enqueueWork(Intent intent);

    public void ensureJobId(int i6) {
        if (!this.mHasJobId) {
            this.mHasJobId = true;
            this.mJobId = i6;
        } else {
            if (this.mJobId == i6) {
                return;
            }
            StringBuilder sbL = H1.a.l("Given job ID ", i6, " is different than previous ");
            sbL.append(this.mJobId);
            throw new IllegalArgumentException(sbL.toString());
        }
    }

    public void serviceProcessingFinished() {
    }

    public void serviceProcessingStarted() {
    }

    public void serviceStartReceived() {
    }
}
