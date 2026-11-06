package w0;

import android.database.Cursor;
import android.os.Looper;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* JADX INFO: loaded from: classes.dex */
public abstract class p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public volatile A0.a f13531a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Executor f13532b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public A0.d f13533c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final C1454i f13534d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f13535e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f13536f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public List f13537g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final ReentrantReadWriteLock f13538h = new ReentrantReadWriteLock();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final ThreadLocal f13539i = new ThreadLocal();

    public p() {
        new ConcurrentHashMap();
        this.f13534d = d();
    }

    public final void a() {
        if (!this.f13535e && Looper.getMainLooper().getThread() == Thread.currentThread()) {
            throw new IllegalStateException("Cannot access database on the main thread since it may potentially lock the UI for a long period of time.");
        }
    }

    public final void b() {
        if (!((B0.b) this.f13533c.C()).f62w.inTransaction() && this.f13539i.get() != null) {
            throw new IllegalStateException("Cannot access database on a different coroutine context inherited from a suspending transaction.");
        }
    }

    public final void c() {
        a();
        A0.a aVarC = this.f13533c.C();
        this.f13534d.c(aVarC);
        ((B0.b) aVarC).b();
    }

    public abstract C1454i d();

    public abstract A0.d e(C1446a c1446a);

    public final void f() {
        ((B0.b) this.f13533c.C()).c();
        if (((B0.b) this.f13533c.C()).f62w.inTransaction()) {
            return;
        }
        C1454i c1454i = this.f13534d;
        if (c1454i.f13508d.compareAndSet(false, true)) {
            c1454i.f13507c.f13532b.execute(c1454i.f13513i);
        }
    }

    public final Cursor g(A0.e eVar) {
        a();
        b();
        return ((B0.b) this.f13533c.C()).h(eVar);
    }

    public final void h() {
        ((B0.b) this.f13533c.C()).l();
    }
}
