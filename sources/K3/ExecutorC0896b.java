package k3;

import J3.G;
import f2.h;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import q2.s;

/* JADX INFO: renamed from: k3.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class ExecutorC0896b implements Executor {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final ExecutorService f9647w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final Object f9648x = new Object();

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public s f9649y = h.l(null);

    public ExecutorC0896b(ExecutorService executorService) {
        this.f9647w = executorService;
    }

    public final s a(Runnable runnable) {
        s sVarJ;
        synchronized (this.f9648x) {
            sVarJ = this.f9649y.j(this.f9647w, new G(23, runnable));
            this.f9649y = sVarJ;
        }
        return sVarJ;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        this.f9647w.execute(runnable);
    }
}
