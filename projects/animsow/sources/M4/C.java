package M4;

import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public final class C extends P implements Runnable {

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public static final C f1846F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public static final long f1847G;
    private static volatile Thread _thread;
    private static volatile int debugStatus;

    static {
        Long l5;
        C c6 = new C();
        f1846F = c6;
        c6.P(false);
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        try {
            l5 = Long.getLong("kotlinx.coroutines.DefaultExecutor.keepAlive", 1000L);
        } catch (SecurityException unused) {
            l5 = 1000L;
        }
        f1847G = timeUnit.toNanos(l5.longValue());
    }

    @Override // M4.Q
    public final Thread O() {
        Thread thread = _thread;
        if (thread == null) {
            synchronized (this) {
                thread = _thread;
                if (thread == null) {
                    thread = new Thread(this, "kotlinx.coroutines.DefaultExecutor");
                    _thread = thread;
                    thread.setContextClassLoader(C.class.getClassLoader());
                    thread.setDaemon(true);
                    thread.start();
                }
            }
        }
        return thread;
    }

    @Override // M4.Q
    public final void T(long j6, N n5) {
        throw new RejectedExecutionException("DefaultExecutor was shut down. This error indicates that Dispatchers.shutdown() was invoked prior to completion of exiting coroutines, leaving coroutines in incomplete state. Please refer to Dispatchers.shutdown documentation for more details");
    }

    @Override // M4.P
    public final void U(Runnable runnable) {
        if (debugStatus == 4) {
            throw new RejectedExecutionException("DefaultExecutor was shut down. This error indicates that Dispatchers.shutdown() was invoked prior to completion of exiting coroutines, leaving coroutines in incomplete state. Please refer to Dispatchers.shutdown documentation for more details");
        }
        super.U(runnable);
    }

    public final synchronized void Y() {
        int i6 = debugStatus;
        if (i6 == 2 || i6 == 3) {
            debugStatus = 3;
            P.f1859C.set(this, null);
            P.f1860D.set(this, null);
            notifyAll();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:41:0x0072, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:?, code lost:
    
        return;
     */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void run() {
        /*
            r14 = this;
            java.lang.ThreadLocal r0 = M4.u0.f1925a
            r0.set(r14)
            r0 = 0
            monitor-enter(r14)     // Catch: java.lang.Throwable -> L37
            int r1 = M4.C.debugStatus     // Catch: java.lang.Throwable -> L73
            r2 = 2
            if (r1 == r2) goto L75
            r3 = 3
            if (r1 != r3) goto L11
            goto L75
        L11:
            r1 = 1
            M4.C.debugStatus = r1     // Catch: java.lang.Throwable -> L73
            r14.notifyAll()     // Catch: java.lang.Throwable -> L73
            monitor-exit(r14)     // Catch: java.lang.Throwable -> L37
            r4 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            r6 = r4
        L1e:
            java.lang.Thread.interrupted()     // Catch: java.lang.Throwable -> L37
            long r8 = r14.R()     // Catch: java.lang.Throwable -> L37
            int r1 = (r8 > r4 ? 1 : (r8 == r4 ? 0 : -1))
            r10 = 0
            if (r1 != 0) goto L54
            long r12 = java.lang.System.nanoTime()     // Catch: java.lang.Throwable -> L37
            int r1 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r1 != 0) goto L39
            long r6 = M4.C.f1847G     // Catch: java.lang.Throwable -> L37
            long r6 = r6 + r12
            goto L39
        L37:
            r1 = move-exception
            goto L87
        L39:
            long r12 = r6 - r12
            int r1 = (r12 > r10 ? 1 : (r12 == r10 ? 0 : -1))
            if (r1 > 0) goto L4e
            M4.C._thread = r0
            r14.Y()
            boolean r0 = r14.W()
            if (r0 != 0) goto L4d
            r14.O()
        L4d:
            return
        L4e:
            int r1 = (r8 > r12 ? 1 : (r8 == r12 ? 0 : -1))
            if (r1 <= 0) goto L55
            r8 = r12
            goto L55
        L54:
            r6 = r4
        L55:
            int r1 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r1 <= 0) goto L1e
            int r1 = M4.C.debugStatus     // Catch: java.lang.Throwable -> L37
            if (r1 == r2) goto L64
            if (r1 != r3) goto L60
            goto L64
        L60:
            java.util.concurrent.locks.LockSupport.parkNanos(r14, r8)     // Catch: java.lang.Throwable -> L37
            goto L1e
        L64:
            M4.C._thread = r0
            r14.Y()
            boolean r0 = r14.W()
            if (r0 != 0) goto L72
            r14.O()
        L72:
            return
        L73:
            r1 = move-exception
            goto L85
        L75:
            monitor-exit(r14)     // Catch: java.lang.Throwable -> L37
            M4.C._thread = r0
            r14.Y()
            boolean r0 = r14.W()
            if (r0 != 0) goto L84
            r14.O()
        L84:
            return
        L85:
            monitor-exit(r14)     // Catch: java.lang.Throwable -> L37
            throw r1     // Catch: java.lang.Throwable -> L37
        L87:
            M4.C._thread = r0
            r14.Y()
            boolean r0 = r14.W()
            if (r0 != 0) goto L95
            r14.O()
        L95:
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: M4.C.run():void");
    }

    @Override // M4.P, M4.Q
    public final void shutdown() {
        debugStatus = 4;
        super.shutdown();
    }
}
