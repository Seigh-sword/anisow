package m2;

import java.util.concurrent.Callable;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.Semaphore;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import t0.AbstractC1332d;

/* JADX INFO: renamed from: m2.h0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1042h0 extends AbstractC1081x0 {

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public static final AtomicLong f10928G = new AtomicLong(Long.MIN_VALUE);

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public final PriorityBlockingQueue f10929A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public final LinkedBlockingQueue f10930B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public final C1048j0 f10931C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public final C1048j0 f10932D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public final Object f10933E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public final Semaphore f10934F;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public C1054l0 f10935y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public C1054l0 f10936z;

    public C1042h0(C1051k0 c1051k0) {
        super(c1051k0);
        this.f10933E = new Object();
        this.f10934F = new Semaphore(2);
        this.f10929A = new PriorityBlockingQueue();
        this.f10930B = new LinkedBlockingQueue();
        this.f10931C = new C1048j0(this, "Thread death: Uncaught exception on worker thread");
        this.f10932D = new C1048j0(this, "Thread death: Uncaught exception on network thread");
    }

    public final void A(Runnable runnable) {
        s();
        AbstractC1332d.m(runnable);
        x(new C1045i0(this, runnable, false, "Task exception on worker thread"));
    }

    public final void B(Runnable runnable) {
        s();
        x(new C1045i0(this, runnable, true, "Task exception on worker thread"));
    }

    public final boolean C() {
        return Thread.currentThread() == this.f10935y;
    }

    public final void D() {
        if (Thread.currentThread() != this.f10936z) {
            throw new IllegalStateException("Call expected from network thread");
        }
    }

    @Override // L.i
    public final void r() {
        if (Thread.currentThread() != this.f10935y) {
            throw new IllegalStateException("Call expected from worker thread");
        }
    }

    @Override // m2.AbstractC1081x0
    public final boolean u() {
        return false;
    }

    public final Object v(AtomicReference atomicReference, long j6, String str, Runnable runnable) {
        synchronized (atomicReference) {
            g().A(runnable);
            try {
                atomicReference.wait(j6);
            } catch (InterruptedException unused) {
                f().f10718E.d("Interrupted waiting for ".concat(str));
                return null;
            }
        }
        Object obj = atomicReference.get();
        if (obj == null) {
            f().f10718E.d("Timed out waiting for ".concat(str));
        }
        return obj;
    }

    public final C1045i0 w(Callable callable) {
        s();
        C1045i0 c1045i0 = new C1045i0(this, callable, false);
        if (Thread.currentThread() == this.f10935y) {
            if (!this.f10929A.isEmpty()) {
                f().f10718E.d("Callable skipped the worker queue.");
            }
            c1045i0.run();
        } else {
            x(c1045i0);
        }
        return c1045i0;
    }

    public final void x(C1045i0 c1045i0) {
        synchronized (this.f10933E) {
            try {
                this.f10929A.add(c1045i0);
                C1054l0 c1054l0 = this.f10935y;
                if (c1054l0 == null) {
                    C1054l0 c1054l02 = new C1054l0(this, "Measurement Worker", this.f10929A);
                    this.f10935y = c1054l02;
                    c1054l02.setUncaughtExceptionHandler(this.f10931C);
                    this.f10935y.start();
                } else {
                    synchronized (c1054l0.f11021w) {
                        c1054l0.f11021w.notifyAll();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void y(Runnable runnable) {
        s();
        C1045i0 c1045i0 = new C1045i0(this, runnable, false, "Task exception on network thread");
        synchronized (this.f10933E) {
            try {
                this.f10930B.add(c1045i0);
                C1054l0 c1054l0 = this.f10936z;
                if (c1054l0 == null) {
                    C1054l0 c1054l02 = new C1054l0(this, "Measurement Network", this.f10930B);
                    this.f10936z = c1054l02;
                    c1054l02.setUncaughtExceptionHandler(this.f10932D);
                    this.f10936z.start();
                } else {
                    synchronized (c1054l0.f11021w) {
                        c1054l0.f11021w.notifyAll();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final C1045i0 z(Callable callable) {
        s();
        C1045i0 c1045i0 = new C1045i0(this, callable, true);
        if (Thread.currentThread() == this.f10935y) {
            c1045i0.run();
        } else {
            x(c1045i0);
        }
        return c1045i0;
    }
}
