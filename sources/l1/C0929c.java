package l1;

import j.RunnableC0835a;
import java.lang.ref.ReferenceQueue;
import java.util.HashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* JADX INFO: renamed from: l1.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0929c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f9883a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final HashMap f9884b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ReferenceQueue f9885c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public x f9886d;

    public C0929c() {
        ExecutorService executorServiceNewSingleThreadExecutor = Executors.newSingleThreadExecutor(new ThreadFactoryC0927a(0));
        this.f9884b = new HashMap();
        this.f9885c = new ReferenceQueue();
        this.f9883a = false;
        executorServiceNewSingleThreadExecutor.execute(new RunnableC0835a(16, this));
    }

    public final synchronized void a(j1.i iVar, y yVar) {
        C0928b c0928b = (C0928b) this.f9884b.put(iVar, new C0928b(iVar, yVar, this.f9885c, this.f9883a));
        if (c0928b != null) {
            c0928b.f9882c = null;
            c0928b.clear();
        }
    }

    public final void b(C0928b c0928b) {
        F f6;
        synchronized (this) {
            this.f9884b.remove(c0928b.f9880a);
            if (c0928b.f9881b && (f6 = c0928b.f9882c) != null) {
                ((q) this.f9886d).e(c0928b.f9880a, new y(f6, true, false, c0928b.f9880a, this.f9886d));
            }
        }
    }
}
