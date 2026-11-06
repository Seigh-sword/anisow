package M4;

import j3.C0848A;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import s4.AbstractC1305a;
import t4.C1351h;
import v4.InterfaceC1432j;

/* JADX INFO: loaded from: classes.dex */
public abstract class P extends Q implements G {

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f1859C = AtomicReferenceFieldUpdater.newUpdater(P.class, Object.class, "_queue$volatile");

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f1860D = AtomicReferenceFieldUpdater.newUpdater(P.class, Object.class, "_delayed$volatile");

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f1861E = AtomicIntegerFieldUpdater.newUpdater(P.class, "_isCompleted$volatile");
    private volatile /* synthetic */ Object _delayed$volatile;
    private volatile /* synthetic */ int _isCompleted$volatile = 0;
    private volatile /* synthetic */ Object _queue$volatile;

    @Override // M4.AbstractC0077w
    public final void J(InterfaceC1432j interfaceC1432j, Runnable runnable) {
        U(runnable);
    }

    /* JADX WARN: Code restructure failed: missing block: B:36:0x0054, code lost:
    
        r7 = null;
     */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00dc  */
    @Override // M4.Q
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final long R() {
        /*
            Method dump skipped, instruction units count: 257
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: M4.P.R():long");
    }

    public void U(Runnable runnable) {
        if (!V(runnable)) {
            C.f1846F.U(runnable);
            return;
        }
        Thread threadO = O();
        if (Thread.currentThread() != threadO) {
            LockSupport.unpark(threadO);
        }
    }

    public final boolean V(Runnable runnable) {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f1859C;
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (f1861E.get(this) != 0) {
                return false;
            }
            if (obj == null) {
                while (!atomicReferenceFieldUpdater.compareAndSet(this, null, runnable)) {
                    if (atomicReferenceFieldUpdater.get(this) != null) {
                        break;
                    }
                }
                return true;
            }
            if (!(obj instanceof R4.n)) {
                if (obj == B.f1838c) {
                    return false;
                }
                R4.n nVar = new R4.n(8, true);
                nVar.a((Runnable) obj);
                nVar.a(runnable);
                while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, nVar)) {
                    if (atomicReferenceFieldUpdater.get(this) != obj) {
                        break;
                    }
                }
                return true;
            }
            R4.n nVar2 = (R4.n) obj;
            int iA = nVar2.a(runnable);
            if (iA == 0) {
                return true;
            }
            if (iA == 1) {
                R4.n nVarC = nVar2.c();
                while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, nVarC) && atomicReferenceFieldUpdater.get(this) == obj) {
                }
            } else if (iA == 2) {
                return false;
            }
        }
    }

    public final boolean W() {
        C1351h c1351h = this.f1863A;
        if (!(c1351h != null ? c1351h.isEmpty() : true)) {
            return false;
        }
        O o3 = (O) f1860D.get(this);
        if (o3 != null && R4.y.f3048b.get(o3) != 0) {
            return false;
        }
        Object obj = f1859C.get(this);
        if (obj == null) {
            return true;
        }
        if (obj instanceof R4.n) {
            long j6 = R4.n.f3031f.get((R4.n) obj);
            if (((int) (1073741823 & j6)) == ((int) ((j6 & 1152921503533105152L) >> 30))) {
                return true;
            }
        } else if (obj == B.f1838c) {
            return true;
        }
        return false;
    }

    public final void X(long j6, N n5) {
        int iD;
        Thread threadO;
        boolean z5 = f1861E.get(this) != 0;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f1860D;
        if (z5) {
            iD = 1;
        } else {
            O o3 = (O) atomicReferenceFieldUpdater.get(this);
            if (o3 == null) {
                O o5 = new O();
                o5.f1858c = j6;
                while (!atomicReferenceFieldUpdater.compareAndSet(this, null, o5) && atomicReferenceFieldUpdater.get(this) == null) {
                }
                Object obj = atomicReferenceFieldUpdater.get(this);
                AbstractC1305a.l(obj);
                o3 = (O) obj;
            }
            iD = n5.d(j6, o3, this);
        }
        if (iD != 0) {
            if (iD == 1) {
                T(j6, n5);
                return;
            } else {
                if (iD != 2) {
                    throw new IllegalStateException("unexpected result".toString());
                }
                return;
            }
        }
        O o6 = (O) atomicReferenceFieldUpdater.get(this);
        if (o6 != null) {
            synchronized (o6) {
                N[] nArr = o6.f3049a;
                n = nArr != null ? nArr[0] : null;
            }
        }
        if (n != n5 || Thread.currentThread() == (threadO = O())) {
            return;
        }
        LockSupport.unpark(threadO);
    }

    @Override // M4.Q
    public void shutdown() {
        N nB;
        ThreadLocal threadLocal = u0.f1925a;
        u0.f1925a.set(null);
        f1861E.set(this, 1);
        loop0: while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f1859C;
            Object obj = atomicReferenceFieldUpdater.get(this);
            C0848A c0848a = B.f1838c;
            if (obj != null) {
                if (!(obj instanceof R4.n)) {
                    if (obj != c0848a) {
                        R4.n nVar = new R4.n(8, true);
                        nVar.a((Runnable) obj);
                        while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, nVar)) {
                            if (atomicReferenceFieldUpdater.get(this) != obj) {
                                break;
                            }
                        }
                        break loop0;
                    }
                    break;
                }
                ((R4.n) obj).b();
                break;
            }
            while (!atomicReferenceFieldUpdater.compareAndSet(this, null, c0848a)) {
                if (atomicReferenceFieldUpdater.get(this) != null) {
                    break;
                }
            }
            break loop0;
        }
        while (R() <= 0) {
        }
        long jNanoTime = System.nanoTime();
        while (true) {
            O o3 = (O) f1860D.get(this);
            if (o3 == null) {
                return;
            }
            synchronized (o3) {
                nB = R4.y.f3048b.get(o3) > 0 ? o3.b(0) : null;
            }
            if (nB == null) {
                return;
            } else {
                T(jNanoTime, nB);
            }
        }
    }

    @Override // M4.G
    public final void u(long j6, C0063h c0063h) {
        long j7 = j6 > 0 ? j6 >= 9223372036854L ? Long.MAX_VALUE : 1000000 * j6 : 0L;
        if (j7 < 4611686018427387903L) {
            long jNanoTime = System.nanoTime();
            M m5 = new M(this, j7 + jNanoTime, c0063h);
            X(jNanoTime, m5);
            S3.a.y(c0063h, new C0060e(2, m5));
        }
    }
}
