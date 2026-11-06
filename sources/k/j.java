package K;

import S0.r;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;

/* JADX INFO: loaded from: classes.dex */
public final class j implements ThreadFactory {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1493a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f1494b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f1495c;

    public j() {
        this.f1493a = 0;
        this.f1495c = "fonts-androidx";
        this.f1494b = 10;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        switch (this.f1493a) {
            case com.bumptech.glide.d.f6312l /* 0 */:
                return new i(runnable, (String) this.f1495c, this.f1494b);
            default:
                Thread threadNewThread = Executors.defaultThreadFactory().newThread(runnable);
                threadNewThread.setName("WorkManager-WorkTimer-thread-" + this.f1494b);
                this.f1494b = this.f1494b + 1;
                return threadNewThread;
        }
    }

    public j(r rVar) {
        this.f1493a = 1;
        this.f1495c = rVar;
        this.f1494b = 0;
    }
}
