package t;

import java.lang.ref.WeakReference;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: t.j, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1327j implements X2.a {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final WeakReference f12673w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final C1326i f12674x = new C1326i(this);

    public C1327j(C1325h c1325h) {
        this.f12673w = new WeakReference(c1325h);
    }

    @Override // X2.a
    public final void a(Runnable runnable, Executor executor) {
        this.f12674x.a(runnable, executor);
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z5) {
        C1325h c1325h = (C1325h) this.f12673w.get();
        boolean zCancel = this.f12674x.cancel(z5);
        if (zCancel && c1325h != null) {
            c1325h.f12668a = null;
            c1325h.f12669b = null;
            c1325h.f12670c.i(null);
        }
        return zCancel;
    }

    @Override // java.util.concurrent.Future
    public final Object get() {
        return this.f12674x.get();
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.f12674x.f12665w instanceof C1318a;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return this.f12674x.isDone();
    }

    public final String toString() {
        return this.f12674x.toString();
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j6, TimeUnit timeUnit) {
        return this.f12674x.get(j6, timeUnit);
    }
}
