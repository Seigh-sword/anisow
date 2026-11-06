package S4;

import D4.r;
import j3.C0848A;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import s4.AbstractC1305a;

/* JADX INFO: loaded from: classes.dex */
public final class a extends Thread {

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f3293E = AtomicIntegerFieldUpdater.newUpdater(a.class, "workerCtl$volatile");

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public long f3294A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public int f3295B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public boolean f3296C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public final /* synthetic */ c f3297D;
    private volatile int indexInArray;
    private volatile Object nextParkedWorker;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final m f3298w;
    private volatile /* synthetic */ int workerCtl$volatile;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final r f3299x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public b f3300y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public long f3301z;

    public a(c cVar, int i6) {
        this.f3297D = cVar;
        setDaemon(true);
        setContextClassLoader(cVar.getClass().getClassLoader());
        this.f3298w = new m();
        this.f3299x = new r();
        this.f3300y = b.f3307z;
        this.nextParkedWorker = c.f3311G;
        int iNanoTime = (int) System.nanoTime();
        this.f3295B = iNanoTime == 0 ? 42 : iNanoTime;
        f(i6);
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0045, code lost:
    
        r13 = S4.m.f3338d.get(r3);
        r0 = S4.m.f3337c.get(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0051, code lost:
    
        if (r13 == r0) goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0059, code lost:
    
        if (S4.m.f3339e.get(r3) != 0) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x005c, code lost:
    
        r0 = r0 - 1;
        r1 = r3.c(r0, true);
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0062, code lost:
    
        if (r1 == null) goto L70;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0064, code lost:
    
        r2 = r1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final S4.i a(boolean r13) {
        /*
            Method dump skipped, instruction units count: 201
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: S4.a.a(boolean):S4.i");
    }

    public final int b() {
        return this.indexInArray;
    }

    public final Object c() {
        return this.nextParkedWorker;
    }

    public final int d(int i6) {
        int i7 = this.f3295B;
        int i8 = i7 ^ (i7 << 13);
        int i9 = i8 ^ (i8 >> 17);
        int i10 = i9 ^ (i9 << 5);
        this.f3295B = i10;
        int i11 = i6 - 1;
        return (i11 & i6) == 0 ? i10 & i11 : (i10 & Integer.MAX_VALUE) % i6;
    }

    public final i e() {
        f fVar;
        int iD = d(2);
        c cVar = this.f3297D;
        if (iD == 0) {
            i iVar = (i) cVar.f3312A.d();
            if (iVar != null) {
                return iVar;
            }
            fVar = cVar.f3313B;
        } else {
            i iVar2 = (i) cVar.f3313B.d();
            if (iVar2 != null) {
                return iVar2;
            }
            fVar = cVar.f3312A;
        }
        return (i) fVar.d();
    }

    public final void f(int i6) {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f3297D.f3318z);
        sb.append("-worker-");
        sb.append(i6 == 0 ? "TERMINATED" : String.valueOf(i6));
        setName(sb.toString());
        this.indexInArray = i6;
    }

    public final void g(Object obj) {
        this.nextParkedWorker = obj;
    }

    public final boolean h(b bVar) {
        b bVar2 = this.f3300y;
        boolean z5 = bVar2 == b.f3304w;
        if (z5) {
            c.f3309E.addAndGet(this.f3297D, 4398046511104L);
        }
        if (bVar2 != bVar) {
            this.f3300y = bVar;
        }
        return z5;
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x0082, code lost:
    
        r19 = r6;
        r6 = -2;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final S4.i i(int r24) {
        /*
            Method dump skipped, instruction units count: 249
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: S4.a.i(int):S4.i");
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        boolean z5;
        boolean z6 = false;
        loop0: while (true) {
            boolean z7 = z6;
            while (true) {
                c cVar = this.f3297D;
                cVar.getClass();
                if (c.f3310F.get(cVar) == 0) {
                    b bVar = this.f3300y;
                    b bVar2 = b.f3302A;
                    if (bVar == bVar2) {
                        break loop0;
                    }
                    i iVarA = a(this.f3296C);
                    long j6 = -2097152;
                    if (iVarA != null) {
                        this.f3294A = 0L;
                        int i6 = iVarA.f3325x.f1108w;
                        this.f3301z = 0L;
                        if (this.f3300y == b.f3306y) {
                            this.f3300y = b.f3305x;
                        }
                        c cVar2 = this.f3297D;
                        if (i6 != 0 && h(b.f3305x) && !cVar2.l() && !cVar2.k(c.f3309E.get(cVar2))) {
                            cVar2.l();
                        }
                        cVar2.getClass();
                        try {
                            iVarA.run();
                        } catch (Throwable th) {
                            Thread threadCurrentThread = Thread.currentThread();
                            threadCurrentThread.getUncaughtExceptionHandler().uncaughtException(threadCurrentThread, th);
                        }
                        if (i6 != 0) {
                            c.f3309E.addAndGet(cVar2, -2097152L);
                            if (this.f3300y != bVar2) {
                                this.f3300y = b.f3307z;
                            }
                        }
                    } else {
                        this.f3296C = z6;
                        if (this.f3294A == 0) {
                            Object obj = this.nextParkedWorker;
                            C0848A c0848a = c.f3311G;
                            if (obj != c0848a ? true : z6) {
                                f3293E.set(this, -1);
                                while (this.nextParkedWorker != c.f3311G) {
                                    AtomicIntegerFieldUpdater atomicIntegerFieldUpdater2 = f3293E;
                                    if (atomicIntegerFieldUpdater2.get(this) != -1) {
                                        break;
                                    }
                                    c cVar3 = this.f3297D;
                                    cVar3.getClass();
                                    AtomicIntegerFieldUpdater atomicIntegerFieldUpdater3 = c.f3310F;
                                    if (atomicIntegerFieldUpdater3.get(cVar3) != 0) {
                                        break;
                                    }
                                    b bVar3 = this.f3300y;
                                    b bVar4 = b.f3302A;
                                    if (bVar3 == bVar4) {
                                        break;
                                    }
                                    h(b.f3306y);
                                    Thread.interrupted();
                                    if (this.f3301z == 0) {
                                        atomicIntegerFieldUpdater = atomicIntegerFieldUpdater2;
                                        this.f3301z = System.nanoTime() + this.f3297D.f3317y;
                                    } else {
                                        atomicIntegerFieldUpdater = atomicIntegerFieldUpdater2;
                                    }
                                    LockSupport.parkNanos(this.f3297D.f3317y);
                                    if (System.nanoTime() - this.f3301z >= 0) {
                                        this.f3301z = 0L;
                                        c cVar4 = this.f3297D;
                                        synchronized (cVar4.f3314C) {
                                            try {
                                                if (!(atomicIntegerFieldUpdater3.get(cVar4) != 0)) {
                                                    AtomicLongFieldUpdater atomicLongFieldUpdater = c.f3309E;
                                                    if (((int) (atomicLongFieldUpdater.get(cVar4) & 2097151)) > cVar4.f3315w && atomicIntegerFieldUpdater.compareAndSet(this, -1, 1)) {
                                                        int i7 = this.indexInArray;
                                                        z5 = false;
                                                        f(0);
                                                        cVar4.h(this, i7, 0);
                                                        int andDecrement = (int) (atomicLongFieldUpdater.getAndDecrement(cVar4) & 2097151);
                                                        if (andDecrement != i7) {
                                                            Object objB = cVar4.f3314C.b(andDecrement);
                                                            AbstractC1305a.l(objB);
                                                            a aVar = (a) objB;
                                                            cVar4.f3314C.c(i7, aVar);
                                                            aVar.f(i7);
                                                            cVar4.h(aVar, andDecrement, i7);
                                                        }
                                                        cVar4.f3314C.c(andDecrement, null);
                                                        this.f3300y = bVar4;
                                                    }
                                                }
                                                z5 = false;
                                            } catch (Throwable th2) {
                                                throw th2;
                                            }
                                        }
                                    } else {
                                        z5 = false;
                                    }
                                    z6 = z5;
                                }
                            } else {
                                c cVar5 = this.f3297D;
                                cVar5.getClass();
                                if (this.nextParkedWorker == c0848a) {
                                    while (true) {
                                        AtomicLongFieldUpdater atomicLongFieldUpdater2 = c.f3308D;
                                        long j7 = atomicLongFieldUpdater2.get(cVar5);
                                        int i8 = this.indexInArray;
                                        this.nextParkedWorker = cVar5.f3314C.b((int) (j7 & 2097151));
                                        if (atomicLongFieldUpdater2.compareAndSet(cVar5, j7, ((2097152 + j7) & j6) | ((long) i8))) {
                                            break;
                                        } else {
                                            j6 = -2097152;
                                        }
                                    }
                                }
                            }
                            z6 = z6;
                        } else {
                            if (z7) {
                                h(b.f3306y);
                                Thread.interrupted();
                                LockSupport.parkNanos(this.f3294A);
                                this.f3294A = 0L;
                                break;
                            }
                            z7 = true;
                        }
                    }
                } else {
                    break loop0;
                }
            }
        }
        h(b.f3302A);
    }
}
