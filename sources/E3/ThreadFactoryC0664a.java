package e3;

import android.os.StrictMode;
import d.RunnableC0637r;
import java.util.Locale;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: renamed from: e3.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class ThreadFactoryC0664a implements ThreadFactory {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final ThreadFactory f8257e = Executors.defaultThreadFactory();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AtomicLong f8258a = new AtomicLong();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f8259b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f8260c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final StrictMode.ThreadPolicy f8261d;

    public ThreadFactoryC0664a(String str, int i6, StrictMode.ThreadPolicy threadPolicy) {
        this.f8259b = str;
        this.f8260c = i6;
        this.f8261d = threadPolicy;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        Thread threadNewThread = f8257e.newThread(new RunnableC0637r(this, 12, runnable));
        Locale locale = Locale.ROOT;
        threadNewThread.setName(this.f8259b + " Thread #" + this.f8258a.getAndIncrement());
        return threadNewThread;
    }
}
