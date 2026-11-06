package S4;

import I0.o;
import M4.B;
import R4.s;
import d.AbstractC0628i;
import j3.C0848A;
import java.io.Closeable;
import java.util.ArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import s4.AbstractC1305a;

/* JADX INFO: loaded from: classes.dex */
public final class c implements Executor, Closeable {

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public static final /* synthetic */ AtomicLongFieldUpdater f3308D = AtomicLongFieldUpdater.newUpdater(c.class, "parkedWorkersStack$volatile");

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public static final /* synthetic */ AtomicLongFieldUpdater f3309E = AtomicLongFieldUpdater.newUpdater(c.class, "controlState$volatile");

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f3310F = AtomicIntegerFieldUpdater.newUpdater(c.class, "_isTerminated$volatile");

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public static final C0848A f3311G = new C0848A(2, "NOT_IN_STACK");

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public final f f3312A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public final f f3313B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public final s f3314C;
    private volatile /* synthetic */ int _isTerminated$volatile;
    private volatile /* synthetic */ long controlState$volatile;
    private volatile /* synthetic */ long parkedWorkersStack$volatile;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final int f3315w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final int f3316x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final long f3317y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final String f3318z;

    public c(int i6, int i7, long j6, String str) {
        this.f3315w = i6;
        this.f3316x = i7;
        this.f3317y = j6;
        this.f3318z = str;
        if (i6 < 1) {
            throw new IllegalArgumentException(H1.a.j("Core pool size ", i6, " should be at least 1").toString());
        }
        if (i7 < i6) {
            throw new IllegalArgumentException(H1.a.k("Max pool size ", i7, " should be greater than or equals to core pool size ", i6).toString());
        }
        if (i7 > 2097150) {
            throw new IllegalArgumentException(H1.a.j("Max pool size ", i7, " should not exceed maximal supported number of threads 2097150").toString());
        }
        if (j6 <= 0) {
            throw new IllegalArgumentException(("Idle worker keep alive time " + j6 + " must be positive").toString());
        }
        this.f3312A = new f();
        this.f3313B = new f();
        this.f3314C = new s((i6 + 1) * 2);
        this.controlState$volatile = ((long) i6) << 42;
        this._isTerminated$volatile = 0;
    }

    public static /* synthetic */ void g(c cVar, Runnable runnable, boolean z5, int i6) {
        o oVar = k.f3333g;
        if ((i6 & 4) != 0) {
            z5 = false;
        }
        cVar.c(runnable, oVar, z5);
    }

    public final int b() {
        synchronized (this.f3314C) {
            try {
                if (f3310F.get(this) != 0) {
                    return -1;
                }
                AtomicLongFieldUpdater atomicLongFieldUpdater = f3309E;
                long j6 = atomicLongFieldUpdater.get(this);
                int i6 = (int) (j6 & 2097151);
                int i7 = i6 - ((int) ((j6 & 4398044413952L) >> 21));
                if (i7 < 0) {
                    i7 = 0;
                }
                if (i7 >= this.f3315w) {
                    return 0;
                }
                if (i6 >= this.f3316x) {
                    return 0;
                }
                int i8 = ((int) (atomicLongFieldUpdater.get(this) & 2097151)) + 1;
                if (i8 <= 0 || this.f3314C.b(i8) != null) {
                    throw new IllegalArgumentException("Failed requirement.".toString());
                }
                a aVar = new a(this, i8);
                this.f3314C.c(i8, aVar);
                if (i8 != ((int) (2097151 & atomicLongFieldUpdater.incrementAndGet(this)))) {
                    throw new IllegalArgumentException("Failed requirement.".toString());
                }
                int i9 = i7 + 1;
                aVar.start();
                return i9;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void c(Runnable runnable, o oVar, boolean z5) {
        i jVar;
        b bVar;
        k.f3332f.getClass();
        long jNanoTime = System.nanoTime();
        if (runnable instanceof i) {
            jVar = (i) runnable;
            jVar.f3324w = jNanoTime;
            jVar.f3325x = oVar;
        } else {
            jVar = new j(runnable, jNanoTime, oVar);
        }
        boolean z6 = false;
        boolean z7 = jVar.f3325x.f1108w == 1;
        AtomicLongFieldUpdater atomicLongFieldUpdater = f3309E;
        long jAddAndGet = z7 ? atomicLongFieldUpdater.addAndGet(this, 2097152L) : 0L;
        Thread threadCurrentThread = Thread.currentThread();
        a aVar = threadCurrentThread instanceof a ? (a) threadCurrentThread : null;
        if (aVar == null || !AbstractC1305a.c(aVar.f3297D, this)) {
            aVar = null;
        }
        if (aVar != null && (bVar = aVar.f3300y) != b.f3302A && (jVar.f3325x.f1108w != 0 || bVar != b.f3305x)) {
            aVar.f3296C = true;
            m mVar = aVar.f3298w;
            if (z5) {
                jVar = mVar.a(jVar);
            } else {
                mVar.getClass();
                i iVar = (i) m.f3336b.getAndSet(mVar, jVar);
                jVar = iVar == null ? null : mVar.a(iVar);
            }
        }
        if (jVar != null) {
            if (!(jVar.f3325x.f1108w == 1 ? this.f3313B : this.f3312A).a(jVar)) {
                throw new RejectedExecutionException(AbstractC0628i.m(new StringBuilder(), this.f3318z, " was terminated"));
            }
        }
        if (z5 && aVar != null) {
            z6 = true;
        }
        if (z7) {
            if (z6 || l() || k(jAddAndGet)) {
                return;
            }
            l();
            return;
        }
        if (z6 || l() || k(atomicLongFieldUpdater.get(this))) {
            return;
        }
        l();
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x008b  */
    @Override // java.io.Closeable, java.lang.AutoCloseable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void close() throws java.lang.InterruptedException {
        /*
            r8 = this;
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r0 = S4.c.f3310F
            r1 = 0
            r2 = 1
            boolean r0 = r0.compareAndSet(r8, r1, r2)
            if (r0 != 0) goto Lc
            goto Lb2
        Lc:
            java.lang.Thread r0 = java.lang.Thread.currentThread()
            boolean r1 = r0 instanceof S4.a
            r3 = 0
            if (r1 == 0) goto L18
            S4.a r0 = (S4.a) r0
            goto L19
        L18:
            r0 = r3
        L19:
            if (r0 == 0) goto L24
            S4.c r1 = r0.f3297D
            boolean r1 = s4.AbstractC1305a.c(r1, r8)
            if (r1 == 0) goto L24
            goto L25
        L24:
            r0 = r3
        L25:
            R4.s r1 = r8.f3314C
            monitor-enter(r1)
            java.util.concurrent.atomic.AtomicLongFieldUpdater r4 = S4.c.f3309E     // Catch: java.lang.Throwable -> Lc4
            long r4 = r4.get(r8)     // Catch: java.lang.Throwable -> Lc4
            r6 = 2097151(0x1fffff, double:1.0361303E-317)
            long r4 = r4 & r6
            int r4 = (int) r4
            monitor-exit(r1)
            if (r2 > r4) goto L79
            r1 = r2
        L37:
            R4.s r5 = r8.f3314C
            java.lang.Object r5 = r5.b(r1)
            s4.AbstractC1305a.l(r5)
            S4.a r5 = (S4.a) r5
            if (r5 == r0) goto L74
        L44:
            java.lang.Thread$State r6 = r5.getState()
            java.lang.Thread$State r7 = java.lang.Thread.State.TERMINATED
            if (r6 == r7) goto L55
            java.util.concurrent.locks.LockSupport.unpark(r5)
            r6 = 10000(0x2710, double:4.9407E-320)
            r5.join(r6)
            goto L44
        L55:
            S4.m r5 = r5.f3298w
            S4.f r6 = r8.f3313B
            r5.getClass()
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r7 = S4.m.f3336b
            java.lang.Object r7 = r7.getAndSet(r5, r3)
            S4.i r7 = (S4.i) r7
            if (r7 == 0) goto L69
            r6.a(r7)
        L69:
            S4.i r7 = r5.b()
            if (r7 != 0) goto L70
            goto L74
        L70:
            r6.a(r7)
            goto L69
        L74:
            if (r1 == r4) goto L79
            int r1 = r1 + 1
            goto L37
        L79:
            S4.f r1 = r8.f3313B
            r1.b()
            S4.f r1 = r8.f3312A
            r1.b()
        L83:
            if (r0 == 0) goto L8b
            S4.i r1 = r0.a(r2)
            if (r1 != 0) goto Lb3
        L8b:
            S4.f r1 = r8.f3312A
            java.lang.Object r1 = r1.d()
            S4.i r1 = (S4.i) r1
            if (r1 != 0) goto Lb3
            S4.f r1 = r8.f3313B
            java.lang.Object r1 = r1.d()
            S4.i r1 = (S4.i) r1
            if (r1 != 0) goto Lb3
            if (r0 == 0) goto La6
            S4.b r1 = S4.b.f3302A
            r0.h(r1)
        La6:
            java.util.concurrent.atomic.AtomicLongFieldUpdater r0 = S4.c.f3308D
            r1 = 0
            r0.set(r8, r1)
            java.util.concurrent.atomic.AtomicLongFieldUpdater r0 = S4.c.f3309E
            r0.set(r8, r1)
        Lb2:
            return
        Lb3:
            r1.run()     // Catch: java.lang.Throwable -> Lb7
            goto L83
        Lb7:
            r1 = move-exception
            java.lang.Thread r3 = java.lang.Thread.currentThread()
            java.lang.Thread$UncaughtExceptionHandler r4 = r3.getUncaughtExceptionHandler()
            r4.uncaughtException(r3, r1)
            goto L83
        Lc4:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: S4.c.close():void");
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        g(this, runnable, false, 6);
    }

    public final void h(a aVar, int i6, int i7) {
        while (true) {
            long j6 = f3308D.get(this);
            int i8 = (int) (2097151 & j6);
            long j7 = (2097152 + j6) & (-2097152);
            if (i8 == i6) {
                if (i7 == 0) {
                    Object objC = aVar.c();
                    while (true) {
                        if (objC == f3311G) {
                            i8 = -1;
                            break;
                        }
                        if (objC == null) {
                            i8 = 0;
                            break;
                        }
                        a aVar2 = (a) objC;
                        int iB = aVar2.b();
                        if (iB != 0) {
                            i8 = iB;
                            break;
                        }
                        objC = aVar2.c();
                    }
                } else {
                    i8 = i7;
                }
            }
            if (i8 >= 0) {
                if (f3308D.compareAndSet(this, j6, ((long) i8) | j7)) {
                    return;
                }
            }
        }
    }

    public final boolean k(long j6) {
        int i6 = ((int) (2097151 & j6)) - ((int) ((j6 & 4398044413952L) >> 21));
        if (i6 < 0) {
            i6 = 0;
        }
        int i7 = this.f3315w;
        if (i6 < i7) {
            int iB = b();
            if (iB == 1 && i7 > 1) {
                b();
            }
            if (iB > 0) {
                return true;
            }
        }
        return false;
    }

    public final boolean l() {
        C0848A c0848a;
        int iB;
        while (true) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = f3308D;
            long j6 = atomicLongFieldUpdater.get(this);
            a aVar = (a) this.f3314C.b((int) (2097151 & j6));
            if (aVar == null) {
                aVar = null;
            } else {
                long j7 = (2097152 + j6) & (-2097152);
                Object objC = aVar.c();
                while (true) {
                    c0848a = f3311G;
                    if (objC == c0848a) {
                        iB = -1;
                        break;
                    }
                    if (objC == null) {
                        iB = 0;
                        break;
                    }
                    a aVar2 = (a) objC;
                    iB = aVar2.b();
                    if (iB != 0) {
                        break;
                    }
                    objC = aVar2.c();
                }
                if (iB >= 0 && atomicLongFieldUpdater.compareAndSet(this, j6, j7 | ((long) iB))) {
                    aVar.g(c0848a);
                }
            }
            if (aVar == null) {
                return false;
            }
            if (a.f3293E.compareAndSet(aVar, -1, 0)) {
                LockSupport.unpark(aVar);
                return true;
            }
        }
    }

    public final String toString() {
        StringBuilder sb;
        char c6;
        ArrayList arrayList = new ArrayList();
        s sVar = this.f3314C;
        int iA = sVar.a();
        int i6 = 0;
        int i7 = 0;
        int i8 = 0;
        int i9 = 0;
        int i10 = 0;
        for (int i11 = 1; i11 < iA; i11++) {
            a aVar = (a) sVar.b(i11);
            if (aVar != null) {
                m mVar = aVar.f3298w;
                mVar.getClass();
                int i12 = m.f3336b.get(mVar) != null ? (m.f3337c.get(mVar) - m.f3338d.get(mVar)) + 1 : m.f3337c.get(mVar) - m.f3338d.get(mVar);
                int iOrdinal = aVar.f3300y.ordinal();
                if (iOrdinal == 0) {
                    i6++;
                    sb = new StringBuilder();
                    sb.append(i12);
                    c6 = 'c';
                } else if (iOrdinal == 1) {
                    i7++;
                    sb = new StringBuilder();
                    sb.append(i12);
                    c6 = 'b';
                } else if (iOrdinal == 2) {
                    i8++;
                } else if (iOrdinal == 3) {
                    i9++;
                    if (i12 > 0) {
                        sb = new StringBuilder();
                        sb.append(i12);
                        c6 = 'd';
                    }
                } else if (iOrdinal == 4) {
                    i10++;
                }
                sb.append(c6);
                arrayList.add(sb.toString());
            }
        }
        long j6 = f3309E.get(this);
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f3318z);
        sb2.append('@');
        sb2.append(B.d(this));
        sb2.append("[Pool Size {core = ");
        int i13 = this.f3315w;
        sb2.append(i13);
        sb2.append(", max = ");
        sb2.append(this.f3316x);
        sb2.append("}, Worker States {CPU = ");
        sb2.append(i6);
        sb2.append(", blocking = ");
        sb2.append(i7);
        sb2.append(", parked = ");
        sb2.append(i8);
        sb2.append(", dormant = ");
        sb2.append(i9);
        sb2.append(", terminated = ");
        sb2.append(i10);
        sb2.append("}, running workers queues = ");
        sb2.append(arrayList);
        sb2.append(", global CPU queue size = ");
        sb2.append(this.f3312A.c());
        sb2.append(", global blocking queue size = ");
        sb2.append(this.f3313B.c());
        sb2.append(", Control State {created workers= ");
        sb2.append((int) (2097151 & j6));
        sb2.append(", blocking tasks = ");
        sb2.append((int) ((4398044413952L & j6) >> 21));
        sb2.append(", CPUs acquired = ");
        sb2.append(i13 - ((int) ((j6 & 9223367638808264704L) >> 42)));
        sb2.append("}]");
        return sb2.toString();
    }
}
