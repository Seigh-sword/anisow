package q3;

import E1.d;
import E1.g;
import H1.s;
import a3.C0261b;
import android.os.SystemClock;
import android.util.Log;
import d.RunnableC0637r;
import j3.AbstractC0850C;
import j3.C0851a;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import q2.j;
import r3.C1275a;

/* JADX INFO: renamed from: q3.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1265c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final double f12389a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final double f12390b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f12391c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f12392d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f12393e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final ArrayBlockingQueue f12394f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ThreadPoolExecutor f12395g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final s f12396h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final C0261b f12397i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f12398j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public long f12399k;

    public C1265c(s sVar, C1275a c1275a, C0261b c0261b) {
        double d6 = c1275a.f12476d;
        long j6 = ((long) c1275a.f12478f) * 1000;
        this.f12389a = d6;
        this.f12390b = c1275a.f12477e;
        this.f12391c = j6;
        this.f12396h = sVar;
        this.f12397i = c0261b;
        this.f12392d = SystemClock.elapsedRealtime();
        int i6 = (int) d6;
        this.f12393e = i6;
        ArrayBlockingQueue arrayBlockingQueue = new ArrayBlockingQueue(i6);
        this.f12394f = arrayBlockingQueue;
        this.f12395g = new ThreadPoolExecutor(1, 1, 0L, TimeUnit.MILLISECONDS, arrayBlockingQueue);
        this.f12398j = 0;
        this.f12399k = 0L;
    }

    public final int a() {
        if (this.f12399k == 0) {
            this.f12399k = System.currentTimeMillis();
        }
        int iCurrentTimeMillis = (int) ((System.currentTimeMillis() - this.f12399k) / this.f12391c);
        int iMin = this.f12394f.size() == this.f12393e ? Math.min(100, this.f12398j + iCurrentTimeMillis) : Math.max(0, this.f12398j - iCurrentTimeMillis);
        if (this.f12398j != iMin) {
            this.f12398j = iMin;
            this.f12399k = System.currentTimeMillis();
        }
        return iMin;
    }

    public final void b(final C0851a c0851a, final j jVar) {
        String str = "Sending report through Google DataTransport: " + c0851a.f9454b;
        if (Log.isLoggable("FirebaseCrashlytics", 3)) {
            Log.d("FirebaseCrashlytics", str, null);
        }
        final boolean z5 = SystemClock.elapsedRealtime() - this.f12392d < 2000;
        this.f12396h.a(new E1.a(c0851a.f9453a, d.f387y, null), new g() { // from class: q3.b
            @Override // E1.g
            public final void a(Exception exc) throws Throwable {
                C1265c c1265c = this.f12385w;
                c1265c.getClass();
                j jVar2 = jVar;
                if (exc != null) {
                    jVar2.b(exc);
                    return;
                }
                if (z5) {
                    boolean z6 = true;
                    CountDownLatch countDownLatch = new CountDownLatch(1);
                    new Thread(new RunnableC0637r(c1265c, 16, countDownLatch)).start();
                    TimeUnit timeUnit = TimeUnit.SECONDS;
                    ExecutorService executorService = AbstractC0850C.f9452a;
                    boolean z7 = false;
                    try {
                        long nanos = timeUnit.toNanos(2L);
                        long jNanoTime = System.nanoTime() + nanos;
                        while (true) {
                            try {
                                try {
                                    countDownLatch.await(nanos, TimeUnit.NANOSECONDS);
                                    break;
                                } catch (Throwable th) {
                                    th = th;
                                    if (z6) {
                                        Thread.currentThread().interrupt();
                                    }
                                    throw th;
                                }
                            } catch (InterruptedException unused) {
                                nanos = jNanoTime - System.nanoTime();
                                z7 = true;
                            }
                        }
                        if (z7) {
                            Thread.currentThread().interrupt();
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        z6 = z7;
                    }
                }
                jVar2.c(c0851a);
            }
        });
    }
}
