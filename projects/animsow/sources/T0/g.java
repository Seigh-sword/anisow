package T0;

import F0.C0023j;
import d.AbstractC0628i;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes.dex */
public abstract class g implements X2.a {

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public static final com.bumptech.glide.c f3396B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public static final Object f3397C;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public volatile Object f3399w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public volatile c f3400x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public volatile f f3401y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final boolean f3398z = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public static final Logger f3395A = Logger.getLogger(g.class.getName());

    static {
        com.bumptech.glide.c c0023j;
        try {
            c0023j = new d(AtomicReferenceFieldUpdater.newUpdater(f.class, Thread.class, "a"), AtomicReferenceFieldUpdater.newUpdater(f.class, f.class, "b"), AtomicReferenceFieldUpdater.newUpdater(g.class, f.class, "y"), AtomicReferenceFieldUpdater.newUpdater(g.class, c.class, "x"), AtomicReferenceFieldUpdater.newUpdater(g.class, Object.class, "w"));
            th = null;
        } catch (Throwable th) {
            th = th;
            c0023j = new C0023j();
        }
        f3396B = c0023j;
        if (th != null) {
            f3395A.log(Level.SEVERE, "SafeAtomicHelper is broken!", th);
        }
        f3397C = new Object();
    }

    public static void c(g gVar) {
        c cVar;
        c cVar2;
        c cVar3 = null;
        while (true) {
            f fVar = gVar.f3401y;
            if (f3396B.l(gVar, fVar, f.f3392c)) {
                while (fVar != null) {
                    Thread thread = fVar.f3393a;
                    if (thread != null) {
                        fVar.f3393a = null;
                        LockSupport.unpark(thread);
                    }
                    fVar = fVar.f3394b;
                }
                do {
                    cVar = gVar.f3400x;
                } while (!f3396B.h(gVar, cVar, c.f3381d));
                while (true) {
                    cVar2 = cVar3;
                    cVar3 = cVar;
                    if (cVar3 == null) {
                        break;
                    }
                    cVar = cVar3.f3384c;
                    cVar3.f3384c = cVar2;
                }
                while (cVar2 != null) {
                    cVar3 = cVar2.f3384c;
                    Runnable runnable = cVar2.f3382a;
                    if (runnable instanceof e) {
                        e eVar = (e) runnable;
                        gVar = eVar.f3390w;
                        if (gVar.f3399w == eVar) {
                            if (f3396B.j(gVar, eVar, f(eVar.f3391x))) {
                                break;
                            }
                        } else {
                            continue;
                        }
                    } else {
                        d(runnable, cVar2.f3383b);
                    }
                    cVar2 = cVar3;
                }
                return;
            }
        }
    }

    public static void d(Runnable runnable, Executor executor) {
        try {
            executor.execute(runnable);
        } catch (RuntimeException e6) {
            f3395A.log(Level.SEVERE, "RuntimeException while executing runnable " + runnable + " with executor " + executor, (Throwable) e6);
        }
    }

    public static Object e(Object obj) throws ExecutionException {
        if (obj instanceof a) {
            Throwable th = ((a) obj).f3378b;
            CancellationException cancellationException = new CancellationException("Task was cancelled.");
            cancellationException.initCause(th);
            throw cancellationException;
        }
        if (obj instanceof b) {
            throw new ExecutionException(((b) obj).f3380a);
        }
        if (obj == f3397C) {
            return null;
        }
        return obj;
    }

    public static Object f(X2.a aVar) {
        if (aVar instanceof g) {
            Object obj = ((g) aVar).f3399w;
            if (!(obj instanceof a)) {
                return obj;
            }
            a aVar2 = (a) obj;
            return aVar2.f3377a ? aVar2.f3378b != null ? new a(aVar2.f3378b, false) : a.f3376d : obj;
        }
        boolean zIsCancelled = aVar.isCancelled();
        if ((!f3398z) && zIsCancelled) {
            return a.f3376d;
        }
        try {
            Object objG = g(aVar);
            return objG == null ? f3397C : objG;
        } catch (CancellationException e6) {
            if (zIsCancelled) {
                return new a(e6, false);
            }
            return new b(new IllegalArgumentException("get() threw CancellationException, despite reporting isCancelled() == false: " + aVar, e6));
        } catch (ExecutionException e7) {
            return new b(e7.getCause());
        } catch (Throwable th) {
            return new b(th);
        }
    }

    public static Object g(Future future) {
        Object obj;
        boolean z5 = false;
        while (true) {
            try {
                obj = future.get();
                break;
            } catch (InterruptedException unused) {
                z5 = true;
            } catch (Throwable th) {
                if (z5) {
                    Thread.currentThread().interrupt();
                }
                throw th;
            }
        }
        if (z5) {
            Thread.currentThread().interrupt();
        }
        return obj;
    }

    @Override // X2.a
    public final void a(Runnable runnable, Executor executor) {
        executor.getClass();
        c cVar = this.f3400x;
        c cVar2 = c.f3381d;
        if (cVar != cVar2) {
            c cVar3 = new c(runnable, executor);
            do {
                cVar3.f3384c = cVar;
                if (f3396B.h(this, cVar, cVar3)) {
                    return;
                } else {
                    cVar = this.f3400x;
                }
            } while (cVar != cVar2);
        }
        d(runnable, executor);
    }

    public final void b(StringBuilder sb) {
        String str = "]";
        try {
            Object objG = g(this);
            sb.append("SUCCESS, result=[");
            sb.append(objG == this ? "this future" : String.valueOf(objG));
            sb.append("]");
        } catch (CancellationException unused) {
            str = "CANCELLED";
            sb.append(str);
        } catch (RuntimeException e6) {
            sb.append("UNKNOWN, cause=[");
            sb.append(e6.getClass());
            str = " thrown from get()]";
            sb.append(str);
        } catch (ExecutionException e7) {
            sb.append("FAILURE, cause=[");
            sb.append(e7.getCause());
            sb.append(str);
        }
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z5) {
        Object obj = this.f3399w;
        if (!(obj == null) && !(obj instanceof e)) {
            return false;
        }
        a aVar = f3398z ? new a(new CancellationException("Future.cancel() was called."), z5) : z5 ? a.f3375c : a.f3376d;
        g gVar = this;
        boolean z6 = false;
        while (true) {
            if (f3396B.j(gVar, obj, aVar)) {
                c(gVar);
                if (!(obj instanceof e)) {
                    return true;
                }
                X2.a aVar2 = ((e) obj).f3391x;
                if (!(aVar2 instanceof g)) {
                    aVar2.cancel(z5);
                    return true;
                }
                gVar = (g) aVar2;
                obj = gVar.f3399w;
                if (!(obj == null) && !(obj instanceof e)) {
                    return true;
                }
                z6 = true;
            } else {
                obj = gVar.f3399w;
                if (!(obj instanceof e)) {
                    return z6;
                }
            }
        }
    }

    @Override // java.util.concurrent.Future
    public final Object get() throws InterruptedException {
        Object obj;
        if (Thread.interrupted()) {
            throw new InterruptedException();
        }
        Object obj2 = this.f3399w;
        if ((obj2 != null) && (!(obj2 instanceof e))) {
            return e(obj2);
        }
        f fVar = this.f3401y;
        f fVar2 = f.f3392c;
        if (fVar != fVar2) {
            f fVar3 = new f();
            do {
                com.bumptech.glide.c cVar = f3396B;
                cVar.J(fVar3, fVar);
                if (cVar.l(this, fVar, fVar3)) {
                    do {
                        LockSupport.park(this);
                        if (Thread.interrupted()) {
                            i(fVar3);
                            throw new InterruptedException();
                        }
                        obj = this.f3399w;
                    } while (!((obj != null) & (!(obj instanceof e))));
                    return e(obj);
                }
                fVar = this.f3401y;
            } while (fVar != fVar2);
        }
        return e(this.f3399w);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final String h() {
        Object obj = this.f3399w;
        if (obj instanceof e) {
            StringBuilder sb = new StringBuilder("setFuture=[");
            X2.a aVar = ((e) obj).f3391x;
            return AbstractC0628i.m(sb, aVar == this ? "this future" : String.valueOf(aVar), "]");
        }
        if (!(this instanceof ScheduledFuture)) {
            return null;
        }
        return "remaining delay=[" + ((ScheduledFuture) this).getDelay(TimeUnit.MILLISECONDS) + " ms]";
    }

    public final void i(f fVar) {
        fVar.f3393a = null;
        while (true) {
            f fVar2 = this.f3401y;
            if (fVar2 == f.f3392c) {
                return;
            }
            f fVar3 = null;
            while (fVar2 != null) {
                f fVar4 = fVar2.f3394b;
                if (fVar2.f3393a != null) {
                    fVar3 = fVar2;
                } else if (fVar3 != null) {
                    fVar3.f3394b = fVar4;
                    if (fVar3.f3393a == null) {
                        break;
                    }
                } else if (!f3396B.l(this, fVar2, fVar4)) {
                    break;
                }
                fVar2 = fVar4;
            }
            return;
        }
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.f3399w instanceof a;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return (!(r0 instanceof e)) & (this.f3399w != null);
    }

    public final String toString() {
        String strH;
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("[status=");
        if (!(this.f3399w instanceof a)) {
            if (isDone()) {
                b(sb);
            } else {
                try {
                    strH = h();
                } catch (RuntimeException e6) {
                    strH = "Exception thrown from implementation: " + e6.getClass();
                }
                if (strH == null || strH.isEmpty()) {
                    str = isDone() ? "CANCELLED" : "PENDING";
                    b(sb);
                } else {
                    sb.append("PENDING, info=[");
                    sb.append(strH);
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

    /* JADX WARN: Removed duplicated region for block: B:46:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00b5  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:56:0x00a8 -> B:36:0x0074). Please report as a decompilation issue!!! */
    @Override // java.util.concurrent.Future
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object get(long r20, java.util.concurrent.TimeUnit r22) throws java.lang.InterruptedException, java.util.concurrent.TimeoutException {
        /*
            Method dump skipped, instruction units count: 379
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: T0.g.get(long, java.util.concurrent.TimeUnit):java.lang.Object");
    }
}
