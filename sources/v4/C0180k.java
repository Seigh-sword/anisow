package V4;

import java.util.ArrayDeque;
import java.util.concurrent.ThreadPoolExecutor;

/* JADX INFO: renamed from: V4.k, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0180k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public ThreadPoolExecutor f3879a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayDeque f3880b = new ArrayDeque();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayDeque f3881c = new ArrayDeque();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ArrayDeque f3882d = new ArrayDeque();

    public final z a(String str) {
        for (z zVar : this.f3881c) {
            if (zVar.f3985A.f3749y.f3751a.f3906d.equals(str)) {
                return zVar;
            }
        }
        for (z zVar2 : this.f3880b) {
            if (zVar2.f3985A.f3749y.f3751a.f3906d.equals(str)) {
                return zVar2;
            }
        }
        return null;
    }

    public final void b(z zVar) {
        zVar.f3987z.decrementAndGet();
        ArrayDeque arrayDeque = this.f3881c;
        synchronized (this) {
            if (!arrayDeque.remove(zVar)) {
                throw new AssertionError("Call wasn't in-flight!");
            }
        }
        c();
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0056  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void c() {
        /*
            r14 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            monitor-enter(r14)
            java.util.ArrayDeque r1 = r14.f3880b     // Catch: java.lang.Throwable -> L3e
            java.util.Iterator r1 = r1.iterator()     // Catch: java.lang.Throwable -> L3e
        Lc:
            boolean r2 = r1.hasNext()     // Catch: java.lang.Throwable -> L3e
            if (r2 == 0) goto L41
            java.lang.Object r2 = r1.next()     // Catch: java.lang.Throwable -> L3e
            V4.z r2 = (V4.z) r2     // Catch: java.lang.Throwable -> L3e
            java.util.ArrayDeque r3 = r14.f3881c     // Catch: java.lang.Throwable -> L3e
            int r3 = r3.size()     // Catch: java.lang.Throwable -> L3e
            r4 = 64
            if (r3 < r4) goto L23
            goto L41
        L23:
            java.util.concurrent.atomic.AtomicInteger r3 = r2.f3987z     // Catch: java.lang.Throwable -> L3e
            int r3 = r3.get()     // Catch: java.lang.Throwable -> L3e
            r4 = 5
            if (r3 < r4) goto L2d
            goto Lc
        L2d:
            r1.remove()     // Catch: java.lang.Throwable -> L3e
            java.util.concurrent.atomic.AtomicInteger r3 = r2.f3987z     // Catch: java.lang.Throwable -> L3e
            r3.incrementAndGet()     // Catch: java.lang.Throwable -> L3e
            r0.add(r2)     // Catch: java.lang.Throwable -> L3e
            java.util.ArrayDeque r3 = r14.f3881c     // Catch: java.lang.Throwable -> L3e
            r3.add(r2)     // Catch: java.lang.Throwable -> L3e
            goto Lc
        L3e:
            r0 = move-exception
            goto Lb9
        L41:
            monitor-enter(r14)     // Catch: java.lang.Throwable -> L3e
            java.util.ArrayDeque r1 = r14.f3881c     // Catch: java.lang.Throwable -> Lb6
            r1.size()     // Catch: java.lang.Throwable -> Lb6
            java.util.ArrayDeque r1 = r14.f3882d     // Catch: java.lang.Throwable -> Lb6
            r1.size()     // Catch: java.lang.Throwable -> Lb6
            monitor-exit(r14)     // Catch: java.lang.Throwable -> L3e
            monitor-exit(r14)     // Catch: java.lang.Throwable -> L3e
            int r1 = r0.size()
            r2 = 0
            r3 = r2
        L54:
            if (r3 >= r1) goto Lb5
            java.lang.Object r4 = r0.get(r3)
            V4.z r4 = (V4.z) r4
            monitor-enter(r14)
            java.util.concurrent.ThreadPoolExecutor r5 = r14.f3879a     // Catch: java.lang.Throwable -> L80
            if (r5 != 0) goto L82
            java.util.concurrent.ThreadPoolExecutor r5 = new java.util.concurrent.ThreadPoolExecutor     // Catch: java.lang.Throwable -> L80
            java.util.concurrent.TimeUnit r11 = java.util.concurrent.TimeUnit.SECONDS     // Catch: java.lang.Throwable -> L80
            java.util.concurrent.SynchronousQueue r12 = new java.util.concurrent.SynchronousQueue     // Catch: java.lang.Throwable -> L80
            r12.<init>()     // Catch: java.lang.Throwable -> L80
            java.lang.String r6 = "OkHttp Dispatcher"
            byte[] r7 = W4.b.f4484a     // Catch: java.lang.Throwable -> L80
            W4.a r13 = new W4.a     // Catch: java.lang.Throwable -> L80
            r13.<init>(r6, r2)     // Catch: java.lang.Throwable -> L80
            r9 = 60
            r7 = 0
            r8 = 2147483647(0x7fffffff, float:NaN)
            r6 = r5
            r6.<init>(r7, r8, r9, r11, r12, r13)     // Catch: java.lang.Throwable -> L80
            r14.f3879a = r5     // Catch: java.lang.Throwable -> L80
            goto L82
        L80:
            r0 = move-exception
            goto Lb3
        L82:
            java.util.concurrent.ThreadPoolExecutor r5 = r14.f3879a     // Catch: java.lang.Throwable -> L80
            monitor-exit(r14)
            V4.A r6 = r4.f3985A
            r5.execute(r4)     // Catch: java.util.concurrent.RejectedExecutionException -> L8b java.lang.Throwable -> Laa
            goto La7
        L8b:
            r5 = move-exception
            java.io.InterruptedIOException r7 = new java.io.InterruptedIOException     // Catch: java.lang.Throwable -> Laa
            java.lang.String r8 = "executor rejected"
            r7.<init>(r8)     // Catch: java.lang.Throwable -> Laa
            r7.initCause(r5)     // Catch: java.lang.Throwable -> Laa
            Y4.i r5 = r6.f3748x     // Catch: java.lang.Throwable -> Laa
            r5.f(r7)     // Catch: java.lang.Throwable -> Laa
            a3.b r5 = r4.f3986y     // Catch: java.lang.Throwable -> Laa
            r5.c(r7)     // Catch: java.lang.Throwable -> Laa
            V4.x r5 = r6.f3747w
            V4.k r5 = r5.f3973w
            r5.b(r4)
        La7:
            int r3 = r3 + 1
            goto L54
        Laa:
            r0 = move-exception
            V4.x r1 = r6.f3747w
            V4.k r1 = r1.f3973w
            r1.b(r4)
            throw r0
        Lb3:
            monitor-exit(r14)
            throw r0
        Lb5:
            return
        Lb6:
            r0 = move-exception
            monitor-exit(r14)     // Catch: java.lang.Throwable -> L3e
            throw r0     // Catch: java.lang.Throwable -> L3e
        Lb9:
            monitor-exit(r14)     // Catch: java.lang.Throwable -> L3e
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: V4.C0180k.c():void");
    }
}
