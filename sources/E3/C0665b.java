package e3;

import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: e3.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0665b implements InterfaceC0670g {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public final /* synthetic */ long f8262A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public final /* synthetic */ TimeUnit f8263B;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ int f8264w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ ScheduledExecutorServiceC0669f f8265x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ Runnable f8266y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final /* synthetic */ long f8267z;

    public /* synthetic */ C0665b(ScheduledExecutorServiceC0669f scheduledExecutorServiceC0669f, Runnable runnable, long j6, long j7, TimeUnit timeUnit, int i6) {
        this.f8264w = i6;
        this.f8265x = scheduledExecutorServiceC0669f;
        this.f8266y = runnable;
        this.f8267z = j6;
        this.f8262A = j7;
        this.f8263B = timeUnit;
    }

    @Override // e3.InterfaceC0670g
    public final ScheduledFuture a(K1.b bVar) {
        int i6 = this.f8264w;
        Runnable runnable = this.f8266y;
        ScheduledExecutorServiceC0669f scheduledExecutorServiceC0669f = this.f8265x;
        scheduledExecutorServiceC0669f.getClass();
        switch (i6) {
            case com.bumptech.glide.d.f6312l /* 0 */:
                return scheduledExecutorServiceC0669f.f8279x.scheduleAtFixedRate(new RunnableC0666c(scheduledExecutorServiceC0669f, runnable, bVar, 0), this.f8267z, this.f8262A, this.f8263B);
            default:
                return scheduledExecutorServiceC0669f.f8279x.scheduleWithFixedDelay(new RunnableC0666c(scheduledExecutorServiceC0669f, runnable, bVar, 2), this.f8267z, this.f8262A, this.f8263B);
        }
    }
}
