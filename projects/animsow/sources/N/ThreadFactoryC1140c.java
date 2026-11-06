package n;

import H1.q;
import j3.C0872v;
import java.io.Serializable;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: renamed from: n.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class ThreadFactoryC1140c implements ThreadFactory {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f11677a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Serializable f11678b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f11679c;

    public ThreadFactoryC1140c(String str) {
        this.f11677a = 1;
        this.f11679c = Executors.defaultThreadFactory();
        this.f11678b = str;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        int i6 = this.f11677a;
        Object obj = this.f11679c;
        Serializable serializable = this.f11678b;
        switch (i6) {
            case com.bumptech.glide.d.f6312l /* 0 */:
                Thread thread = new Thread(runnable);
                thread.setName("arch_disk_io_" + ((AtomicInteger) serializable).getAndIncrement());
                return thread;
            case 1:
                Thread threadNewThread = ((ThreadFactory) obj).newThread(new q(runnable, 0));
                threadNewThread.setName((String) serializable);
                return threadNewThread;
            default:
                Thread threadNewThread2 = Executors.defaultThreadFactory().newThread(new C0872v(runnable));
                threadNewThread2.setName(((String) serializable) + ((AtomicLong) obj).getAndIncrement());
                return threadNewThread2;
        }
    }

    public ThreadFactoryC1140c(AtomicLong atomicLong) {
        this.f11677a = 2;
        this.f11678b = "awaitEvenIfOnMainThread task continuation executor";
        this.f11679c = atomicLong;
    }

    public ThreadFactoryC1140c(C1142e c1142e) {
        this.f11677a = 0;
        this.f11679c = c1142e;
        this.f11678b = new AtomicInteger(0);
    }
}
