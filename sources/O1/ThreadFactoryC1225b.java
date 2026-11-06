package o1;

import I0.o;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;
import l1.ThreadFactoryC0927a;
import m.RunnableC0969k;

/* JADX INFO: renamed from: o1.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class ThreadFactoryC1225b implements ThreadFactory {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ThreadFactory f12174a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f12175b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final InterfaceC1226c f12176c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f12177d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final AtomicInteger f12178e;

    public ThreadFactoryC1225b(ThreadFactoryC0927a threadFactoryC0927a, String str, boolean z5) {
        o oVar = InterfaceC1226c.f12179v;
        this.f12178e = new AtomicInteger();
        this.f12174a = threadFactoryC0927a;
        this.f12175b = str;
        this.f12176c = oVar;
        this.f12177d = z5;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        Thread threadNewThread = this.f12174a.newThread(new RunnableC0969k(this, 14, runnable));
        threadNewThread.setName("glide-" + this.f12175b + "-thread-" + this.f12178e.getAndIncrement());
        return threadNewThread;
    }
}
