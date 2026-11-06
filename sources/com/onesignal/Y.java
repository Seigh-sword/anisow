package com.onesignal;

import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.Context;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public abstract class Y {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Object f7737c = new Object();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f7738a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Thread f7739b;

    public final void a(Context context) {
        AbstractC0603w1.b(EnumC0600v1.f7992B, getClass().getSimpleName().concat(" cancel background sync"), null);
        synchronized (f7737c) {
            ((JobScheduler) context.getSystemService("jobscheduler")).cancel(2071862118);
        }
    }

    public final void b(Context context, long j6) {
        Thread thread;
        EnumC0600v1 enumC0600v1 = EnumC0600v1.f7993C;
        AbstractC0603w1.b(enumC0600v1, "OSBackgroundSync scheduleSyncServiceAsJob:atTime: " + j6, null);
        Iterator<JobInfo> it = ((JobScheduler) context.getSystemService("jobscheduler")).getAllPendingJobs().iterator();
        while (it.hasNext()) {
            if (it.next().getId() == 2071862118 && (thread = this.f7739b) != null && thread.isAlive()) {
                AbstractC0603w1.b(enumC0600v1, "OSBackgroundSync scheduleSyncServiceAsJob Scheduler already running!", null);
                this.f7738a = true;
                return;
            }
        }
        JobInfo.Builder builder = new JobInfo.Builder(2071862118, new ComponentName(context, (Class<?>) SyncJobService.class));
        builder.setMinimumLatency(j6).setRequiredNetworkType(1);
        if (AbstractC0571l1.g(context, "android.permission.RECEIVE_BOOT_COMPLETED") == 0) {
            builder.setPersisted(true);
        }
        try {
            int iSchedule = ((JobScheduler) context.getSystemService("jobscheduler")).schedule(builder.build());
            AbstractC0603w1.b(EnumC0600v1.f7991A, "OSBackgroundSync scheduleSyncServiceAsJob:result: " + iSchedule, null);
        } catch (NullPointerException e6) {
            AbstractC0603w1.b(EnumC0600v1.f7997y, "scheduleSyncServiceAsJob called JobScheduler.jobScheduler which triggered an internal null Android error. Skipping job.", e6);
        }
    }
}
