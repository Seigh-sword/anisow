package M4;

import java.lang.reflect.Method;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import m2.RunnableC1028c1;
import v4.InterfaceC1432j;

/* JADX INFO: loaded from: classes.dex */
public final class T extends S implements G {

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final Executor f1866y;

    public T(Executor executor) {
        Method method;
        this.f1866y = executor;
        Method method2 = R4.c.f3008a;
        try {
            ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = executor instanceof ScheduledThreadPoolExecutor ? (ScheduledThreadPoolExecutor) executor : null;
            if (scheduledThreadPoolExecutor != null && (method = R4.c.f3008a) != null) {
                method.invoke(scheduledThreadPoolExecutor, Boolean.TRUE);
            }
        } catch (Throwable unused) {
        }
    }

    @Override // M4.AbstractC0077w
    public final void J(InterfaceC1432j interfaceC1432j, Runnable runnable) {
        try {
            this.f1866y.execute(runnable);
        } catch (RejectedExecutionException e6) {
            CancellationException cancellationException = new CancellationException("The task was rejected");
            cancellationException.initCause(e6);
            b0 b0Var = (b0) interfaceC1432j.n(C0078x.f1930x);
            if (b0Var != null) {
                b0Var.b(cancellationException);
            }
            J.f1852b.J(interfaceC1432j, runnable);
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        Executor executor = this.f1866y;
        ExecutorService executorService = executor instanceof ExecutorService ? (ExecutorService) executor : null;
        if (executorService != null) {
            executorService.shutdown();
        }
    }

    public final boolean equals(Object obj) {
        return (obj instanceof T) && ((T) obj).f1866y == this.f1866y;
    }

    public final int hashCode() {
        return System.identityHashCode(this.f1866y);
    }

    @Override // M4.AbstractC0077w
    public final String toString() {
        return this.f1866y.toString();
    }

    @Override // M4.G
    public final void u(long j6, C0063h c0063h) {
        Executor executor = this.f1866y;
        ScheduledFuture<?> scheduledFutureSchedule = null;
        ScheduledExecutorService scheduledExecutorService = executor instanceof ScheduledExecutorService ? (ScheduledExecutorService) executor : null;
        if (scheduledExecutorService != null) {
            try {
                scheduledFutureSchedule = scheduledExecutorService.schedule(new RunnableC1028c1(this, c0063h, 12), j6, TimeUnit.MILLISECONDS);
            } catch (RejectedExecutionException e6) {
                CancellationException cancellationException = new CancellationException("The task was rejected");
                cancellationException.initCause(e6);
                b0 b0Var = (b0) c0063h.f1889A.n(C0078x.f1930x);
                if (b0Var != null) {
                    b0Var.b(cancellationException);
                }
            }
        }
        if (scheduledFutureSchedule != null) {
            S3.a.y(c0063h, new C0060e(0, scheduledFutureSchedule));
        } else {
            C.f1846F.u(j6, c0063h);
        }
    }
}
