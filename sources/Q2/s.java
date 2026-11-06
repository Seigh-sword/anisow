package q2;

import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;
import t0.AbstractC1332d;
import w1.C1474r;

/* JADX INFO: loaded from: classes.dex */
public final class s extends i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f12374a = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C1474r f12375b = new C1474r(3);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f12376c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public volatile boolean f12377d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Object f12378e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Exception f12379f;

    @Override // q2.i
    public final s a(Executor executor, InterfaceC1262e interfaceC1262e) {
        this.f12375b.k(new p(executor, interfaceC1262e));
        p();
        return this;
    }

    @Override // q2.i
    public final s b(Executor executor, f fVar) {
        this.f12375b.k(new p(executor, fVar));
        p();
        return this;
    }

    @Override // q2.i
    public final Exception c() {
        Exception exc;
        synchronized (this.f12374a) {
            exc = this.f12379f;
        }
        return exc;
    }

    @Override // q2.i
    public final Object d() {
        Object obj;
        synchronized (this.f12374a) {
            try {
                AbstractC1332d.o("Task is not yet complete", this.f12376c);
                if (this.f12377d) {
                    throw new CancellationException("Task is already canceled.");
                }
                Exception exc = this.f12379f;
                if (exc != null) {
                    throw new g(exc);
                }
                obj = this.f12378e;
            } catch (Throwable th) {
                throw th;
            }
        }
        return obj;
    }

    @Override // q2.i
    public final boolean e() {
        boolean z5;
        synchronized (this.f12374a) {
            z5 = this.f12376c;
        }
        return z5;
    }

    @Override // q2.i
    public final boolean f() {
        boolean z5;
        synchronized (this.f12374a) {
            try {
                z5 = false;
                if (this.f12376c && !this.f12377d && this.f12379f == null) {
                    z5 = true;
                }
            } finally {
            }
        }
        return z5;
    }

    @Override // q2.i
    public final s g(Executor executor, h hVar) {
        s sVar = new s();
        this.f12375b.k(new p(executor, hVar, sVar));
        p();
        return sVar;
    }

    public final s h(Executor executor, InterfaceC1261d interfaceC1261d) {
        this.f12375b.k(new p(executor, interfaceC1261d));
        p();
        return this;
    }

    public final s i(Executor executor, InterfaceC1258a interfaceC1258a) {
        s sVar = new s();
        this.f12375b.k(new n(executor, interfaceC1258a, sVar, 0));
        p();
        return sVar;
    }

    public final s j(Executor executor, InterfaceC1258a interfaceC1258a) {
        s sVar = new s();
        this.f12375b.k(new n(executor, interfaceC1258a, sVar, 1));
        p();
        return sVar;
    }

    public final void k(Exception exc) {
        AbstractC1332d.n(exc, "Exception must not be null");
        synchronized (this.f12374a) {
            o();
            this.f12376c = true;
            this.f12379f = exc;
        }
        this.f12375b.l(this);
    }

    public final void l(Object obj) {
        synchronized (this.f12374a) {
            o();
            this.f12376c = true;
            this.f12378e = obj;
        }
        this.f12375b.l(this);
    }

    public final void m() {
        synchronized (this.f12374a) {
            try {
                if (this.f12376c) {
                    return;
                }
                this.f12376c = true;
                this.f12377d = true;
                this.f12375b.l(this);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final boolean n(Object obj) {
        synchronized (this.f12374a) {
            try {
                if (this.f12376c) {
                    return false;
                }
                this.f12376c = true;
                this.f12378e = obj;
                this.f12375b.l(this);
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void o() {
        if (this.f12376c) {
            int i6 = C1259b.f12350w;
            if (!e()) {
                throw new IllegalStateException("DuplicateTaskCompletionException can only be created from completed Task.");
            }
            Exception excC = c();
        }
    }

    public final void p() {
        synchronized (this.f12374a) {
            try {
                if (this.f12376c) {
                    this.f12375b.l(this);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
