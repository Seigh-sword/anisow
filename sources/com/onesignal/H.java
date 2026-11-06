package com.onesignal;

import android.app.Service;
import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.AsyncTask;
import android.os.Build;
import android.os.Bundle;
import android.os.IBinder;
import android.os.PowerManager;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import org.json.JSONException;

/* JADX INFO: loaded from: classes.dex */
public abstract class H extends Service {

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public static final Object f7565B = new Object();

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public static final HashMap f7566C = new HashMap();

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public JobIntentService$JobServiceEngineImpl f7568w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public JobIntentService$WorkEnqueuer f7569x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public JobIntentService$CommandProcessor f7570y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public boolean f7571z = false;

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public final ArrayList f7567A = new ArrayList();

    public static JobIntentService$WorkEnqueuer b(final Context context, final ComponentName componentName, boolean z5, final int i6, final boolean z6) {
        JobIntentService$WorkEnqueuer jobIntentService$WorkEnqueuer;
        Object obj = new Object(componentName, z6) { // from class: com.onesignal.JobIntentService$ComponentNameWithWakeful
            private ComponentName componentName;
            private boolean useWakefulService;

            {
                this.componentName = componentName;
                this.useWakefulService = z6;
            }
        };
        HashMap map = f7566C;
        JobIntentService$WorkEnqueuer jobIntentService$WorkEnqueuer2 = (JobIntentService$WorkEnqueuer) map.get(obj);
        if (jobIntentService$WorkEnqueuer2 == null) {
            if (Build.VERSION.SDK_INT < 26 || z6) {
                jobIntentService$WorkEnqueuer = new JobIntentService$WorkEnqueuer(context, componentName) { // from class: com.onesignal.JobIntentService$CompatWorkEnqueuer
                    private final Context mContext;
                    private final PowerManager.WakeLock mLaunchWakeLock;
                    boolean mLaunchingService;
                    private final PowerManager.WakeLock mRunWakeLock;
                    boolean mServiceProcessing;

                    {
                        super(componentName);
                        this.mContext = context.getApplicationContext();
                        PowerManager powerManager = (PowerManager) context.getSystemService("power");
                        PowerManager.WakeLock wakeLockNewWakeLock = powerManager.newWakeLock(1, componentName.getClassName() + ":launch");
                        this.mLaunchWakeLock = wakeLockNewWakeLock;
                        wakeLockNewWakeLock.setReferenceCounted(false);
                        PowerManager.WakeLock wakeLockNewWakeLock2 = powerManager.newWakeLock(1, componentName.getClassName() + ":run");
                        this.mRunWakeLock = wakeLockNewWakeLock2;
                        wakeLockNewWakeLock2.setReferenceCounted(false);
                    }

                    @Override // com.onesignal.JobIntentService$WorkEnqueuer
                    public void enqueueWork(Intent intent) {
                        Intent intent2 = new Intent(intent);
                        intent2.setComponent(this.mComponentName);
                        if (this.mContext.startService(intent2) != null) {
                            synchronized (this) {
                                try {
                                    if (!this.mLaunchingService) {
                                        this.mLaunchingService = true;
                                        if (!this.mServiceProcessing) {
                                            this.mLaunchWakeLock.acquire(60000L);
                                        }
                                    }
                                } finally {
                                }
                            }
                        }
                    }

                    @Override // com.onesignal.JobIntentService$WorkEnqueuer
                    public void serviceProcessingFinished() {
                        synchronized (this) {
                            try {
                                if (this.mServiceProcessing) {
                                    if (this.mLaunchingService) {
                                        this.mLaunchWakeLock.acquire(60000L);
                                    }
                                    this.mServiceProcessing = false;
                                    this.mRunWakeLock.release();
                                }
                            } catch (Throwable th) {
                                throw th;
                            }
                        }
                    }

                    @Override // com.onesignal.JobIntentService$WorkEnqueuer
                    public void serviceProcessingStarted() {
                        synchronized (this) {
                            try {
                                if (!this.mServiceProcessing) {
                                    this.mServiceProcessing = true;
                                    this.mRunWakeLock.acquire(600000L);
                                    this.mLaunchWakeLock.release();
                                }
                            } catch (Throwable th) {
                                throw th;
                            }
                        }
                    }

                    @Override // com.onesignal.JobIntentService$WorkEnqueuer
                    public void serviceStartReceived() {
                        synchronized (this) {
                            this.mLaunchingService = false;
                        }
                    }
                };
            } else {
                if (!z5) {
                    throw new IllegalArgumentException("Can't be here without a job id");
                }
                jobIntentService$WorkEnqueuer = new JobIntentService$WorkEnqueuer(context, componentName, i6) { // from class: com.onesignal.JobIntentService$JobWorkEnqueuer
                    private final JobInfo mJobInfo;
                    private final JobScheduler mJobScheduler;

                    {
                        super(componentName);
                        ensureJobId(i6);
                        this.mJobInfo = new JobInfo.Builder(i6, this.mComponentName).setOverrideDeadline(0L).build();
                        this.mJobScheduler = (JobScheduler) context.getApplicationContext().getSystemService("jobscheduler");
                    }

                    @Override // com.onesignal.JobIntentService$WorkEnqueuer
                    public void enqueueWork(Intent intent) {
                        this.mJobScheduler.enqueue(this.mJobInfo, G.f(intent));
                    }
                };
            }
            jobIntentService$WorkEnqueuer2 = jobIntentService$WorkEnqueuer;
            map.put(obj, jobIntentService$WorkEnqueuer2);
        }
        return jobIntentService$WorkEnqueuer2;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [com.onesignal.JobIntentService$CommandProcessor] */
    public final void a(boolean z5) {
        if (this.f7570y == null) {
            this.f7570y = new AsyncTask<Void, Void, Void>() { // from class: com.onesignal.JobIntentService$CommandProcessor
                @Override // android.os.AsyncTask
                public Void doInBackground(Void... voidArr) throws JSONException, IllegalAccessException, NoSuchFieldException, InstantiationException, IOException, ClassNotFoundException {
                    JobIntentService$GenericWorkItem jobIntentService$GenericWorkItemDequeueWork;
                    while (true) {
                        H h4 = this.this$0;
                        JobIntentService$JobServiceEngineImpl jobIntentService$JobServiceEngineImpl = h4.f7568w;
                        if (jobIntentService$JobServiceEngineImpl == null || (jobIntentService$GenericWorkItemDequeueWork = jobIntentService$JobServiceEngineImpl.dequeueWork()) == null) {
                            synchronized (h4.f7567A) {
                                try {
                                    jobIntentService$GenericWorkItemDequeueWork = h4.f7567A.size() > 0 ? (JobIntentService$GenericWorkItem) h4.f7567A.remove(0) : null;
                                } finally {
                                }
                            }
                        }
                        if (jobIntentService$GenericWorkItemDequeueWork == null) {
                            return null;
                        }
                        H h6 = this.this$0;
                        Intent intent = jobIntentService$GenericWorkItemDequeueWork.getIntent();
                        FCMIntentJobService fCMIntentJobService = (FCMIntentJobService) h6;
                        fCMIntentJobService.getClass();
                        Bundle extras = intent.getExtras();
                        if (extras != null) {
                            AbstractC0603w1.B(fCMIntentJobService);
                            AbstractC0571l1.K(fCMIntentJobService, extras, new T1.j(1, fCMIntentJobService));
                        }
                        jobIntentService$GenericWorkItemDequeueWork.complete();
                    }
                }

                @Override // android.os.AsyncTask
                public void onCancelled(Void r12) {
                    this.this$0.c();
                }

                @Override // android.os.AsyncTask
                public void onPostExecute(Void r12) {
                    this.this$0.c();
                }
            };
            JobIntentService$WorkEnqueuer jobIntentService$WorkEnqueuer = this.f7569x;
            if (jobIntentService$WorkEnqueuer != null && z5) {
                jobIntentService$WorkEnqueuer.serviceProcessingStarted();
            }
            executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Void[0]);
        }
    }

    public final void c() {
        ArrayList arrayList = this.f7567A;
        if (arrayList != null) {
            synchronized (arrayList) {
                try {
                    this.f7570y = null;
                    ArrayList arrayList2 = this.f7567A;
                    if (arrayList2 != null && arrayList2.size() > 0) {
                        a(false);
                    } else if (!this.f7571z) {
                        this.f7569x.serviceProcessingFinished();
                    }
                } finally {
                }
            }
        }
    }

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        JobIntentService$JobServiceEngineImpl jobIntentService$JobServiceEngineImpl = this.f7568w;
        if (jobIntentService$JobServiceEngineImpl != null) {
            return jobIntentService$JobServiceEngineImpl.compatGetBinder();
        }
        return null;
    }

    @Override // android.app.Service
    public final void onCreate() {
        super.onCreate();
        if (Build.VERSION.SDK_INT >= 26) {
            this.f7568w = new JobIntentService$JobServiceEngineImpl(this);
            this.f7569x = null;
        }
        this.f7569x = b(this, new ComponentName(this, getClass()), false, 0, true);
    }

    @Override // android.app.Service
    public final void onDestroy() {
        super.onDestroy();
        JobIntentService$CommandProcessor jobIntentService$CommandProcessor = this.f7570y;
        if (jobIntentService$CommandProcessor != null) {
            jobIntentService$CommandProcessor.cancel(false);
        }
        synchronized (this.f7567A) {
            this.f7571z = true;
            this.f7569x.serviceProcessingFinished();
        }
    }

    @Override // android.app.Service
    public final int onStartCommand(final Intent intent, int i6, final int i7) {
        this.f7569x.serviceStartReceived();
        synchronized (this.f7567A) {
            ArrayList arrayList = this.f7567A;
            if (intent == null) {
                intent = new Intent();
            }
            arrayList.add(new JobIntentService$GenericWorkItem(intent, i7) { // from class: com.onesignal.JobIntentService$CompatWorkItem
                final Intent mIntent;
                final int mStartId;

                {
                    this.mIntent = intent;
                    this.mStartId = i7;
                }

                @Override // com.onesignal.JobIntentService$GenericWorkItem
                public void complete() {
                    this.this$0.stopSelf(this.mStartId);
                }

                @Override // com.onesignal.JobIntentService$GenericWorkItem
                public Intent getIntent() {
                    return this.mIntent;
                }
            });
            a(true);
        }
        return 3;
    }
}
