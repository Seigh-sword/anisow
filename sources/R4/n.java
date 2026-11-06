package R4;

import j3.C0848A;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: loaded from: classes.dex */
public final class n {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f3030e = AtomicReferenceFieldUpdater.newUpdater(n.class, Object.class, "_next$volatile");

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ AtomicLongFieldUpdater f3031f = AtomicLongFieldUpdater.newUpdater(n.class, "_state$volatile");

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final C0848A f3032g = new C0848A(2, "REMOVE_FROZEN");
    private volatile /* synthetic */ Object _next$volatile;
    private volatile /* synthetic */ long _state$volatile;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f3033a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f3034b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f3035c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ AtomicReferenceArray f3036d;

    public n(int i6, boolean z5) {
        this.f3033a = i6;
        this.f3034b = z5;
        int i7 = i6 - 1;
        this.f3035c = i7;
        this.f3036d = new AtomicReferenceArray(i6);
        if (i7 > 1073741823) {
            throw new IllegalStateException("Check failed.".toString());
        }
        if ((i6 & i7) != 0) {
            throw new IllegalStateException("Check failed.".toString());
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0050, code lost:
    
        return 1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int a(java.lang.Object r14) {
        /*
            r13 = this;
        L0:
            java.util.concurrent.atomic.AtomicLongFieldUpdater r0 = R4.n.f3031f
            long r3 = r0.get(r13)
            r1 = 3458764513820540928(0x3000000000000000, double:1.727233711018889E-77)
            long r1 = r1 & r3
            r7 = 0
            int r1 = (r1 > r7 ? 1 : (r1 == r7 ? 0 : -1))
            r2 = 1
            if (r1 == 0) goto L19
            r0 = 2305843009213693952(0x2000000000000000, double:1.4916681462400413E-154)
            long r0 = r0 & r3
            int r14 = (r0 > r7 ? 1 : (r0 == r7 ? 0 : -1))
            if (r14 == 0) goto L18
            r2 = 2
        L18:
            return r2
        L19:
            r5 = 1073741823(0x3fffffff, double:5.304989472E-315)
            long r5 = r5 & r3
            int r1 = (int) r5
            r5 = 1152921503533105152(0xfffffffc0000000, double:1.2882296003504729E-231)
            long r5 = r5 & r3
            r9 = 30
            long r5 = r5 >> r9
            int r10 = (int) r5
            int r5 = r10 + 2
            int r11 = r13.f3035c
            r5 = r5 & r11
            r6 = r1 & r11
            if (r5 != r6) goto L32
            return r2
        L32:
            boolean r5 = r13.f3034b
            r6 = 1073741823(0x3fffffff, float:1.9999999)
            java.util.concurrent.atomic.AtomicReferenceArray r12 = r13.f3036d
            if (r5 != 0) goto L51
            r5 = r10 & r11
            java.lang.Object r5 = r12.get(r5)
            if (r5 == 0) goto L51
            r0 = 1024(0x400, float:1.435E-42)
            int r3 = r13.f3033a
            if (r3 < r0) goto L50
            int r10 = r10 - r1
            r0 = r10 & r6
            int r1 = r3 >> 1
            if (r0 <= r1) goto L0
        L50:
            return r2
        L51:
            int r1 = r10 + 1
            r1 = r1 & r6
            r5 = -1152921503533105153(0xf00000003fffffff, double:-3.1050369248997324E231)
            long r5 = r5 & r3
            long r1 = (long) r1
            long r1 = r1 << r9
            long r5 = r5 | r1
            java.util.concurrent.atomic.AtomicLongFieldUpdater r1 = R4.n.f3031f
            r2 = r13
            boolean r1 = r1.compareAndSet(r2, r3, r5)
            if (r1 == 0) goto L0
            r1 = r10 & r11
            r12.set(r1, r14)
            r1 = r13
        L6c:
            long r2 = r0.get(r1)
            r4 = 1152921504606846976(0x1000000000000000, double:1.2882297539194267E-231)
            long r2 = r2 & r4
            int r2 = (r2 > r7 ? 1 : (r2 == r7 ? 0 : -1))
            if (r2 == 0) goto L95
            R4.n r1 = r1.c()
            java.util.concurrent.atomic.AtomicReferenceArray r2 = r1.f3036d
            int r3 = r1.f3035c
            r3 = r3 & r10
            java.lang.Object r4 = r2.get(r3)
            boolean r5 = r4 instanceof R4.m
            if (r5 == 0) goto L92
            R4.m r4 = (R4.m) r4
            int r4 = r4.f3029a
            if (r4 != r10) goto L92
            r2.set(r3, r14)
            goto L93
        L92:
            r1 = 0
        L93:
            if (r1 != 0) goto L6c
        L95:
            r14 = 0
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: R4.n.a(java.lang.Object):int");
    }

    public final boolean b() {
        AtomicLongFieldUpdater atomicLongFieldUpdater;
        long j6;
        do {
            atomicLongFieldUpdater = f3031f;
            j6 = atomicLongFieldUpdater.get(this);
            if ((j6 & 2305843009213693952L) != 0) {
                return true;
            }
            if ((1152921504606846976L & j6) != 0) {
                return false;
            }
        } while (!atomicLongFieldUpdater.compareAndSet(this, j6, 2305843009213693952L | j6));
        return true;
    }

    public final n c() {
        AtomicLongFieldUpdater atomicLongFieldUpdater;
        long j6;
        while (true) {
            atomicLongFieldUpdater = f3031f;
            j6 = atomicLongFieldUpdater.get(this);
            if ((j6 & 1152921504606846976L) != 0) {
                break;
            }
            long j7 = j6 | 1152921504606846976L;
            if (atomicLongFieldUpdater.compareAndSet(this, j6, j7)) {
                j6 = j7;
                break;
            }
        }
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f3030e;
            n nVar = (n) atomicReferenceFieldUpdater.get(this);
            if (nVar != null) {
                return nVar;
            }
            n nVar2 = new n(this.f3033a * 2, this.f3034b);
            int i6 = (int) (1073741823 & j6);
            int i7 = (int) ((1152921503533105152L & j6) >> 30);
            while (true) {
                int i8 = this.f3035c;
                int i9 = i6 & i8;
                if (i9 == (i8 & i7)) {
                    break;
                }
                Object mVar = this.f3036d.get(i9);
                if (mVar == null) {
                    mVar = new m(i6);
                }
                nVar2.f3036d.set(nVar2.f3035c & i6, mVar);
                i6++;
            }
            atomicLongFieldUpdater.set(nVar2, (-1152921504606846977L) & j6);
            while (!atomicReferenceFieldUpdater.compareAndSet(this, null, nVar2) && atomicReferenceFieldUpdater.get(this) == null) {
            }
        }
    }

    public final Object d() {
        while (true) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = f3031f;
            long j6 = atomicLongFieldUpdater.get(this);
            if ((j6 & 1152921504606846976L) != 0) {
                return f3032g;
            }
            int i6 = (int) (j6 & 1073741823);
            int i7 = this.f3035c;
            int i8 = i6 & i7;
            if ((((int) ((1152921503533105152L & j6) >> 30)) & i7) == i8) {
                return null;
            }
            AtomicReferenceArray atomicReferenceArray = this.f3036d;
            Object obj = atomicReferenceArray.get(i8);
            boolean z5 = this.f3034b;
            if (obj == null) {
                if (z5) {
                    return null;
                }
            } else {
                if (obj instanceof m) {
                    return null;
                }
                long j7 = (i6 + 1) & 1073741823;
                if (atomicLongFieldUpdater.compareAndSet(this, j6, (j6 & (-1073741824)) | j7)) {
                    atomicReferenceArray.set(i8, null);
                    return obj;
                }
                if (z5) {
                    n nVarC = this;
                    while (true) {
                        AtomicLongFieldUpdater atomicLongFieldUpdater2 = f3031f;
                        long j8 = atomicLongFieldUpdater2.get(nVarC);
                        int i9 = (int) (j8 & 1073741823);
                        if ((j8 & 1152921504606846976L) != 0) {
                            nVarC = nVarC.c();
                        } else {
                            if (atomicLongFieldUpdater2.compareAndSet(nVarC, j8, (j8 & (-1073741824)) | j7)) {
                                nVarC.f3036d.set(nVarC.f3035c & i9, null);
                                nVarC = null;
                            } else {
                                continue;
                            }
                        }
                        if (nVarC == null) {
                            return obj;
                        }
                    }
                }
            }
        }
    }
}
