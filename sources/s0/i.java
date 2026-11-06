package S0;

import java.util.ArrayDeque;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import m.RunnableC0969k;

/* JADX INFO: loaded from: classes.dex */
public final class i implements Executor {

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final Executor f3077x;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public volatile Runnable f3079z;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final ArrayDeque f3076w = new ArrayDeque();

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final Object f3078y = new Object();

    public i(ExecutorService executorService) {
        this.f3077x = executorService;
    }

    public final void a() {
        synchronized (this.f3078y) {
            try {
                Runnable runnable = (Runnable) this.f3076w.poll();
                this.f3079z = runnable;
                if (runnable != null) {
                    this.f3077x.execute(this.f3079z);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        synchronized (this.f3078y) {
            try {
                this.f3076w.add(new RunnableC0969k(this, runnable, 11));
                if (this.f3079z == null) {
                    a();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
