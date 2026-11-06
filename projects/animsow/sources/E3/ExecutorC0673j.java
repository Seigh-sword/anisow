package e3;

import java.util.ArrayDeque;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.logging.Logger;
import t0.AbstractC1332d;

/* JADX INFO: renamed from: e3.j, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class ExecutorC0673j implements Executor {

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public static final Logger f8285B = Logger.getLogger(ExecutorC0673j.class.getName());

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final Executor f8287w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final ArrayDeque f8288x = new ArrayDeque();

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f8289y = 1;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public long f8290z = 0;

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public final RunnableC0672i f8286A = new RunnableC0672i(this, 0);

    public ExecutorC0673j(Executor executor) {
        AbstractC1332d.m(executor);
        this.f8287w = executor;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        AbstractC1332d.m(runnable);
        synchronized (this.f8288x) {
            int i6 = this.f8289y;
            if (i6 != 4 && i6 != 3) {
                long j6 = this.f8290z;
                RunnableC0672i runnableC0672i = new RunnableC0672i(this, runnable);
                this.f8288x.add(runnableC0672i);
                this.f8289y = 2;
                try {
                    this.f8287w.execute(this.f8286A);
                    if (this.f8289y != 2) {
                        return;
                    }
                    synchronized (this.f8288x) {
                        try {
                            if (this.f8290z == j6 && this.f8289y == 2) {
                                this.f8289y = 3;
                            }
                        } finally {
                        }
                    }
                    return;
                } catch (Error | RuntimeException e6) {
                    synchronized (this.f8288x) {
                        try {
                            int i7 = this.f8289y;
                            boolean z5 = true;
                            if ((i7 != 1 && i7 != 2) || !this.f8288x.removeLastOccurrence(runnableC0672i)) {
                                z5 = false;
                            }
                            if (!(e6 instanceof RejectedExecutionException) || z5) {
                                throw e6;
                            }
                        } finally {
                        }
                    }
                    return;
                }
            }
            this.f8288x.add(runnable);
        }
    }

    public final String toString() {
        return "SequentialExecutor@" + System.identityHashCode(this) + "{" + this.f8287w + "}";
    }
}
