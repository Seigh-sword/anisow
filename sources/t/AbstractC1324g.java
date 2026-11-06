package t;

import F0.C0023j;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: renamed from: t.g, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1324g implements X2.a {

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public static final com.bumptech.glide.c f12662B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public static final Object f12663C;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public volatile Object f12665w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public volatile C1321d f12666x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public volatile C1323f f12667y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final boolean f12664z = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public static final Logger f12661A = Logger.getLogger(AbstractC1324g.class.getName());

    static {
        com.bumptech.glide.c c0023j;
        try {
            c0023j = new C1322e(AtomicReferenceFieldUpdater.newUpdater(C1323f.class, Thread.class, "a"), AtomicReferenceFieldUpdater.newUpdater(C1323f.class, C1323f.class, "b"), AtomicReferenceFieldUpdater.newUpdater(AbstractC1324g.class, C1323f.class, "y"), AtomicReferenceFieldUpdater.newUpdater(AbstractC1324g.class, C1321d.class, "x"), AtomicReferenceFieldUpdater.newUpdater(AbstractC1324g.class, Object.class, "w"));
            th = null;
        } catch (Throwable th) {
            th = th;
            c0023j = new C0023j();
        }
        f12662B = c0023j;
        if (th != null) {
            f12661A.log(Level.SEVERE, "SafeAtomicHelper is broken!", th);
        }
        f12663C = new Object();
    }

    public static void d(AbstractC1324g abstractC1324g) {
        C1323f c1323f;
        C1321d c1321d;
        C1321d c1321d2;
        C1321d c1321d3;
        do {
            c1323f = abstractC1324g.f12667y;
        } while (!f12662B.m(abstractC1324g, c1323f, C1323f.f12658c));
        while (true) {
            c1321d = null;
            if (c1323f == null) {
                break;
            }
            Thread thread = c1323f.f12659a;
            if (thread != null) {
                c1323f.f12659a = null;
                LockSupport.unpark(thread);
            }
            c1323f = c1323f.f12660b;
        }
        abstractC1324g.c();
        do {
            c1321d2 = abstractC1324g.f12666x;
        } while (!f12662B.i(abstractC1324g, c1321d2, C1321d.f12649d));
        while (true) {
            c1321d3 = c1321d;
            c1321d = c1321d2;
            if (c1321d == null) {
                break;
            }
            c1321d2 = c1321d.f12652c;
            c1321d.f12652c = c1321d3;
        }
        while (c1321d3 != null) {
            C1321d c1321d4 = c1321d3.f12652c;
            e(c1321d3.f12650a, c1321d3.f12651b);
            c1321d3 = c1321d4;
        }
    }

    public static void e(Runnable runnable, Executor executor) {
        try {
            executor.execute(runnable);
        } catch (RuntimeException e6) {
            f12661A.log(Level.SEVERE, "RuntimeException while executing runnable " + runnable + " with executor " + executor, (Throwable) e6);
        }
    }

    public static Object f(Object obj) throws ExecutionException {
        if (obj instanceof C1318a) {
            Throwable th = ((C1318a) obj).f12646b;
            CancellationException cancellationException = new CancellationException("Task was cancelled.");
            cancellationException.initCause(th);
            throw cancellationException;
        }
        if (obj instanceof C1320c) {
            throw new ExecutionException(((C1320c) obj).f12648a);
        }
        if (obj == f12663C) {
            return null;
        }
        return obj;
    }

    @Override // X2.a
    public final void a(Runnable runnable, Executor executor) {
        executor.getClass();
        C1321d c1321d = this.f12666x;
        C1321d c1321d2 = C1321d.f12649d;
        if (c1321d != c1321d2) {
            C1321d c1321d3 = new C1321d(runnable, executor);
            do {
                c1321d3.f12652c = c1321d;
                if (f12662B.i(this, c1321d, c1321d3)) {
                    return;
                } else {
                    c1321d = this.f12666x;
                }
            } while (c1321d != c1321d2);
        }
        e(runnable, executor);
    }

    public final void b(StringBuilder sb) {
        Object obj;
        String str = "]";
        boolean z5 = false;
        while (true) {
            try {
                try {
                    obj = get();
                    break;
                } catch (InterruptedException unused) {
                    z5 = true;
                } catch (Throwable th) {
                    if (z5) {
                        Thread.currentThread().interrupt();
                    }
                    throw th;
                }
            } catch (CancellationException unused2) {
                str = "CANCELLED";
                sb.append(str);
                return;
            } catch (RuntimeException e6) {
                sb.append("UNKNOWN, cause=[");
                sb.append(e6.getClass());
                str = " thrown from get()]";
                sb.append(str);
                return;
            } catch (ExecutionException e7) {
                sb.append("FAILURE, cause=[");
                sb.append(e7.getCause());
                sb.append(str);
                return;
            }
        }
        if (z5) {
            Thread.currentThread().interrupt();
        }
        sb.append("SUCCESS, result=[");
        sb.append(obj == this ? "this future" : String.valueOf(obj));
        sb.append("]");
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z5) {
        Object obj = this.f12665w;
        if (obj == null) {
            if (f12662B.k(this, obj, f12664z ? new C1318a(new CancellationException("Future.cancel() was called."), z5) : z5 ? C1318a.f12643c : C1318a.f12644d)) {
                d(this);
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public String g() {
        if (!(this instanceof ScheduledFuture)) {
            return null;
        }
        return "remaining delay=[" + ((ScheduledFuture) this).getDelay(TimeUnit.MILLISECONDS) + " ms]";
    }

    @Override // java.util.concurrent.Future
    public final Object get() throws InterruptedException {
        Object obj;
        if (Thread.interrupted()) {
            throw new InterruptedException();
        }
        Object obj2 = this.f12665w;
        if ((obj2 != null) && true) {
            return f(obj2);
        }
        C1323f c1323f = this.f12667y;
        C1323f c1323f2 = C1323f.f12658c;
        if (c1323f != c1323f2) {
            C1323f c1323f3 = new C1323f();
            do {
                com.bumptech.glide.c cVar = f12662B;
                cVar.K(c1323f3, c1323f);
                if (cVar.m(this, c1323f, c1323f3)) {
                    do {
                        LockSupport.park(this);
                        if (Thread.interrupted()) {
                            h(c1323f3);
                            throw new InterruptedException();
                        }
                        obj = this.f12665w;
                    } while (!((obj != null) & true));
                    return f(obj);
                }
                c1323f = this.f12667y;
            } while (c1323f != c1323f2);
        }
        return f(this.f12665w);
    }

    public final void h(C1323f c1323f) {
        c1323f.f12659a = null;
        while (true) {
            C1323f c1323f2 = this.f12667y;
            if (c1323f2 == C1323f.f12658c) {
                return;
            }
            C1323f c1323f3 = null;
            while (c1323f2 != null) {
                C1323f c1323f4 = c1323f2.f12660b;
                if (c1323f2.f12659a != null) {
                    c1323f3 = c1323f2;
                } else if (c1323f3 != null) {
                    c1323f3.f12660b = c1323f4;
                    if (c1323f3.f12659a == null) {
                        break;
                    }
                } else if (!f12662B.m(this, c1323f2, c1323f4)) {
                    break;
                }
                c1323f2 = c1323f4;
            }
            return;
        }
    }

    public boolean i(Object obj) {
        if (obj == null) {
            obj = f12663C;
        }
        if (!f12662B.k(this, null, obj)) {
            return false;
        }
        d(this);
        return true;
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.f12665w instanceof C1318a;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return (this.f12665w != null) & true;
    }

    public boolean j(Throwable th) {
        th.getClass();
        if (!f12662B.k(this, null, new C1320c(th))) {
            return false;
        }
        d(this);
        return true;
    }

    public final String toString() {
        String strG;
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("[status=");
        if (!(this.f12665w instanceof C1318a)) {
            if (isDone()) {
                b(sb);
            } else {
                try {
                    strG = g();
                } catch (RuntimeException e6) {
                    strG = "Exception thrown from implementation: " + e6.getClass();
                }
                if (strG == null || strG.isEmpty()) {
                    str = isDone() ? "CANCELLED" : "PENDING";
                    b(sb);
                } else {
                    sb.append("PENDING, info=[");
                    sb.append(strG);
                    sb.append("]");
                }
            }
            sb.append("]");
            return sb.toString();
        }
        sb.append(str);
        sb.append("]");
        return sb.toString();
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00ac  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:56:0x009f -> B:36:0x006e). Please report as a decompilation issue!!! */
    @Override // java.util.concurrent.Future
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object get(long r20, java.util.concurrent.TimeUnit r22) throws java.lang.InterruptedException, java.util.concurrent.TimeoutException {
        /*
            Method dump skipped, instruction units count: 370
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: t.AbstractC1324g.get(long, java.util.concurrent.TimeUnit):java.lang.Object");
    }

    public void c() {
    }
}
