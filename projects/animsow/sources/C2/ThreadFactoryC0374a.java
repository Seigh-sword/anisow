package c2;

import H1.q;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: renamed from: c2.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class ThreadFactoryC0374a implements ThreadFactory {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AtomicInteger f6235b = new AtomicInteger();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ThreadFactory f6236c = Executors.defaultThreadFactory();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f6234a = "GAC_Executor";

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        Thread threadNewThread = this.f6236c.newThread(new q(runnable, 0));
        threadNewThread.setName(this.f6234a + "[" + this.f6235b.getAndIncrement() + "]");
        return threadNewThread;
    }
}
