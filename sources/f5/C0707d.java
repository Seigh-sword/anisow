package f5;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;
import s4.AbstractC1305a;

/* JADX INFO: renamed from: f5.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C0707d extends G {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final ReentrantLock f8448h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final Condition f8449i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final long f8450j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final long f8451k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static C0707d f8452l;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f8453e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public C0707d f8454f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public long f8455g;

    static {
        ReentrantLock reentrantLock = new ReentrantLock();
        f8448h = reentrantLock;
        Condition conditionNewCondition = reentrantLock.newCondition();
        AbstractC1305a.n(conditionNewCondition, "lock.newCondition()");
        f8449i = conditionNewCondition;
        long millis = TimeUnit.SECONDS.toMillis(60L);
        f8450j = millis;
        f8451k = TimeUnit.MILLISECONDS.toNanos(millis);
    }

    public final void h() {
        long jC;
        C0707d c0707d;
        long j6 = this.f8436c;
        boolean z5 = this.f8434a;
        if (j6 != 0 || z5) {
            ReentrantLock reentrantLock = f8448h;
            reentrantLock.lock();
            try {
                if (!(!this.f8453e)) {
                    throw new IllegalStateException("Unbalanced enter/exit".toString());
                }
                this.f8453e = true;
                if (f8452l == null) {
                    f8452l = new C0707d();
                    new f2.g().start();
                }
                long jNanoTime = System.nanoTime();
                if (j6 != 0 && z5) {
                    jC = Math.min(j6, c() - jNanoTime) + jNanoTime;
                } else if (j6 != 0) {
                    jC = j6 + jNanoTime;
                } else {
                    if (!z5) {
                        throw new AssertionError();
                    }
                    jC = c();
                }
                this.f8455g = jC;
                long j7 = this.f8455g - jNanoTime;
                C0707d c0707d2 = f8452l;
                AbstractC1305a.l(c0707d2);
                while (true) {
                    c0707d = c0707d2.f8454f;
                    if (c0707d == null || j7 < c0707d.f8455g - jNanoTime) {
                        break;
                    } else {
                        c0707d2 = c0707d;
                    }
                }
                this.f8454f = c0707d;
                c0707d2.f8454f = this;
                if (c0707d2 == f8452l) {
                    f8449i.signal();
                }
                reentrantLock.unlock();
            } catch (Throwable th) {
                reentrantLock.unlock();
                throw th;
            }
        }
    }

    public final boolean i() {
        ReentrantLock reentrantLock = f8448h;
        reentrantLock.lock();
        try {
            if (this.f8453e) {
                this.f8453e = false;
                C0707d c0707d = f8452l;
                while (c0707d != null) {
                    C0707d c0707d2 = c0707d.f8454f;
                    if (c0707d2 == this) {
                        c0707d.f8454f = this.f8454f;
                        this.f8454f = null;
                    } else {
                        c0707d = c0707d2;
                    }
                }
                reentrantLock.unlock();
                return true;
            }
            return false;
        } finally {
            reentrantLock.unlock();
        }
    }

    public IOException j(IOException iOException) {
        InterruptedIOException interruptedIOException = new InterruptedIOException("timeout");
        if (iOException != null) {
            interruptedIOException.initCause(iOException);
        }
        return interruptedIOException;
    }

    public void k() {
    }
}
