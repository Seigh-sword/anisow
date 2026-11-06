package i;

import d.RunnableC0637r;
import java.util.ArrayDeque;
import java.util.concurrent.Executor;

/* JADX INFO: renamed from: i.q, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class ExecutorC0817q implements Executor {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final Object f9327w = new Object();

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final ArrayDeque f9328x = new ArrayDeque();

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final Executor f9329y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public Runnable f9330z;

    public ExecutorC0817q(r rVar) {
        this.f9329y = rVar;
    }

    public final void a() {
        synchronized (this.f9327w) {
            try {
                Runnable runnable = (Runnable) this.f9328x.poll();
                this.f9330z = runnable;
                if (runnable != null) {
                    this.f9329y.execute(runnable);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        synchronized (this.f9327w) {
            try {
                this.f9328x.add(new RunnableC0637r(this, 1, runnable));
                if (this.f9330z == null) {
                    a();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
