package O4;

import M4.C0063h;
import M4.InterfaceC0062g;
import M4.y0;
import R4.u;
import h0.C0733A;
import j3.C0848A;
import java.lang.reflect.InvocationTargetException;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import s4.AbstractC1305a;
import s4.C1316l;
import v4.InterfaceC1427e;
import w4.EnumC1481a;

/* JADX INFO: loaded from: classes.dex */
public class c implements g {
    private volatile /* synthetic */ Object _closeCause$volatile;
    private volatile /* synthetic */ long bufferEnd$volatile;
    private volatile /* synthetic */ Object bufferEndSegment$volatile;
    private volatile /* synthetic */ Object closeHandler$volatile;
    private volatile /* synthetic */ long completedExpandBuffersAndPauseFlag$volatile;
    private volatile /* synthetic */ Object receiveSegment$volatile;
    private volatile /* synthetic */ long receivers$volatile;
    private volatile /* synthetic */ Object sendSegment$volatile;
    private volatile /* synthetic */ long sendersAndCloseStatus$volatile;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final int f2358w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final C4.l f2359x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final /* synthetic */ AtomicLongFieldUpdater f2356y = AtomicLongFieldUpdater.newUpdater(c.class, "sendersAndCloseStatus$volatile");

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final /* synthetic */ AtomicLongFieldUpdater f2357z = AtomicLongFieldUpdater.newUpdater(c.class, "receivers$volatile");

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public static final /* synthetic */ AtomicLongFieldUpdater f2349A = AtomicLongFieldUpdater.newUpdater(c.class, "bufferEnd$volatile");

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public static final /* synthetic */ AtomicLongFieldUpdater f2350B = AtomicLongFieldUpdater.newUpdater(c.class, "completedExpandBuffersAndPauseFlag$volatile");

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f2351C = AtomicReferenceFieldUpdater.newUpdater(c.class, Object.class, "sendSegment$volatile");

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f2352D = AtomicReferenceFieldUpdater.newUpdater(c.class, Object.class, "receiveSegment$volatile");

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f2353E = AtomicReferenceFieldUpdater.newUpdater(c.class, Object.class, "bufferEndSegment$volatile");

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f2354F = AtomicReferenceFieldUpdater.newUpdater(c.class, Object.class, "_closeCause$volatile");

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f2355G = AtomicReferenceFieldUpdater.newUpdater(c.class, Object.class, "closeHandler$volatile");

    public c(int i6, C4.l lVar) {
        this.f2358w = i6;
        this.f2359x = lVar;
        if (i6 < 0) {
            throw new IllegalArgumentException(H1.a.j("Invalid channel capacity: ", i6, ", should be >=0").toString());
        }
        k kVar = e.f2361a;
        this.bufferEnd$volatile = i6 != 0 ? i6 != Integer.MAX_VALUE ? i6 : Long.MAX_VALUE : 0L;
        this.completedExpandBuffersAndPauseFlag$volatile = f2349A.get(this);
        k kVar2 = new k(0L, null, this, 3);
        this.sendSegment$volatile = kVar2;
        this.receiveSegment$volatile = kVar2;
        if (x()) {
            kVar2 = e.f2361a;
            AbstractC1305a.m(kVar2, "null cannot be cast to non-null type kotlinx.coroutines.channels.ChannelSegment<E of kotlinx.coroutines.channels.BufferedChannel>");
        }
        this.bufferEndSegment$volatile = kVar2;
        this._closeCause$volatile = e.f2379s;
    }

    public static boolean C(Object obj) {
        if (obj instanceof InterfaceC0062g) {
            AbstractC1305a.m(obj, "null cannot be cast to non-null type kotlinx.coroutines.CancellableContinuation<kotlin.Unit>");
            return e.a((InterfaceC0062g) obj, C1316l.f12640a, null);
        }
        throw new IllegalStateException(("Unexpected waiter: " + obj).toString());
    }

    public static final k c(c cVar, long j6, k kVar) throws IllegalAccessException, InvocationTargetException {
        Object objA;
        AtomicLongFieldUpdater atomicLongFieldUpdater;
        long j7;
        long j8;
        cVar.getClass();
        k kVar2 = e.f2361a;
        d dVar = d.f2360E;
        loop0: while (true) {
            objA = R4.a.a(kVar, j6, dVar);
            if (!AbstractC1305a.K(objA)) {
                u uVarF = AbstractC1305a.F(objA);
                while (true) {
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f2351C;
                    u uVar = (u) atomicReferenceFieldUpdater.get(cVar);
                    if (uVar.f3041c >= uVarF.f3041c) {
                        break loop0;
                    }
                    if (!uVarF.i()) {
                        break;
                    }
                    while (!atomicReferenceFieldUpdater.compareAndSet(cVar, uVar, uVarF)) {
                        if (atomicReferenceFieldUpdater.get(cVar) != uVar) {
                            if (uVarF.e()) {
                                uVarF.d();
                            }
                        }
                    }
                    if (uVar.e()) {
                        uVar.d();
                    }
                }
            } else {
                break;
            }
        }
        boolean zK = AbstractC1305a.K(objA);
        AtomicLongFieldUpdater atomicLongFieldUpdater2 = f2357z;
        if (zK) {
            cVar.k();
            if (kVar.f3041c * ((long) e.f2362b) >= atomicLongFieldUpdater2.get(cVar)) {
                return null;
            }
        } else {
            kVar = (k) AbstractC1305a.F(objA);
            long j9 = kVar.f3041c;
            if (j9 <= j6) {
                return kVar;
            }
            long j10 = ((long) e.f2362b) * j9;
            do {
                atomicLongFieldUpdater = f2356y;
                j7 = atomicLongFieldUpdater.get(cVar);
                j8 = 1152921504606846975L & j7;
                if (j8 >= j10) {
                    break;
                }
            } while (!atomicLongFieldUpdater.compareAndSet(cVar, j7, j8 + (((long) ((int) (j7 >> 60))) << 60)));
            if (j9 * ((long) e.f2362b) >= atomicLongFieldUpdater2.get(cVar)) {
                return null;
            }
        }
        kVar.a();
        return null;
    }

    public static final void d(c cVar, Object obj, C0063h c0063h) throws IllegalAccessException, InvocationTargetException {
        C0733A c0733aI;
        C4.l lVar = cVar.f2359x;
        if (lVar != null && (c0733aI = AbstractC1305a.i(lVar, obj, null)) != null) {
            S3.a.x(c0063h.f1889A, c0733aI);
        }
        c0063h.o(S3.a.m(cVar.s()));
    }

    public static final int e(c cVar, k kVar, int i6, Object obj, long j6, Object obj2, boolean z5) {
        cVar.getClass();
        kVar.m(i6, obj);
        if (!z5) {
            Object objK = kVar.k(i6);
            if (objK == null) {
                if (cVar.g(j6)) {
                    if (kVar.j(null, i6, e.f2364d)) {
                        return 1;
                    }
                } else {
                    if (obj2 == null) {
                        return 3;
                    }
                    if (kVar.j(null, i6, obj2)) {
                        return 2;
                    }
                }
            } else if (objK instanceof y0) {
                kVar.m(i6, null);
                if (cVar.B(objK, obj)) {
                    kVar.n(i6, e.f2369i);
                    return 0;
                }
                C0848A c0848a = e.f2371k;
                if (kVar.f2386f.getAndSet((i6 * 2) + 1, c0848a) != c0848a) {
                    kVar.l(i6, true);
                }
                return 5;
            }
        }
        return cVar.E(kVar, i6, obj, j6, obj2, z5);
    }

    public static void u(c cVar) {
        cVar.getClass();
        AtomicLongFieldUpdater atomicLongFieldUpdater = f2350B;
        if ((atomicLongFieldUpdater.addAndGet(cVar, 1L) & 4611686018427387904L) != 0) {
            while ((atomicLongFieldUpdater.get(cVar) & 4611686018427387904L) != 0) {
            }
        }
    }

    public final void A(y0 y0Var, boolean z5) throws IllegalAccessException, InvocationTargetException {
        if (y0Var instanceof InterfaceC0062g) {
            ((InterfaceC1427e) y0Var).o(S3.a.m(z5 ? r() : s()));
            return;
        }
        if (!(y0Var instanceof b)) {
            throw new IllegalStateException(("Unexpected waiter: " + y0Var).toString());
        }
        b bVar = (b) y0Var;
        C0063h c0063h = bVar.f2347x;
        AbstractC1305a.l(c0063h);
        bVar.f2347x = null;
        bVar.f2346w = e.f2372l;
        Throwable thQ = bVar.f2348y.q();
        c0063h.o(thQ == null ? Boolean.FALSE : S3.a.m(thQ));
    }

    public final boolean B(Object obj, Object obj2) {
        if (!(obj instanceof b)) {
            if (!(obj instanceof InterfaceC0062g)) {
                throw new IllegalStateException(("Unexpected receiver type: " + obj).toString());
            }
            AbstractC1305a.m(obj, "null cannot be cast to non-null type kotlinx.coroutines.CancellableContinuation<E of kotlinx.coroutines.channels.BufferedChannel>");
            InterfaceC0062g interfaceC0062g = (InterfaceC0062g) obj;
            C4.l lVar = this.f2359x;
            return e.a(interfaceC0062g, obj2, lVar != null ? AbstractC1305a.f(lVar, obj2, interfaceC0062g.i()) : null);
        }
        AbstractC1305a.m(obj, "null cannot be cast to non-null type kotlinx.coroutines.channels.BufferedChannel.BufferedChannelIterator<E of kotlinx.coroutines.channels.BufferedChannel>");
        b bVar = (b) obj;
        C0063h c0063h = bVar.f2347x;
        AbstractC1305a.l(c0063h);
        bVar.f2347x = null;
        bVar.f2346w = obj2;
        Boolean bool = Boolean.TRUE;
        C4.l lVar2 = bVar.f2348y.f2359x;
        return e.a(c0063h, bool, lVar2 != null ? AbstractC1305a.f(lVar2, obj2, c0063h.f1889A) : null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x005d, code lost:
    
        r11 = r2.get(r10 * 2);
        r9.m(r10, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0078, code lost:
    
        n();
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:?, code lost:
    
        return r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:?, code lost:
    
        return O4.e.f2375o;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object D(O4.k r9, int r10, long r11, java.lang.Object r13) {
        /*
            Method dump skipped, instruction units count: 210
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: O4.c.D(O4.k, int, long, java.lang.Object):java.lang.Object");
    }

    public final int E(k kVar, int i6, Object obj, long j6, Object obj2, boolean z5) throws IllegalAccessException, InvocationTargetException {
        while (true) {
            Object objK = kVar.k(i6);
            if (objK == null) {
                if (!g(j6) || z5) {
                    if (z5) {
                        if (kVar.j(null, i6, e.f2370j)) {
                            kVar.l(i6, false);
                            return 4;
                        }
                    } else {
                        if (obj2 == null) {
                            return 3;
                        }
                        if (kVar.j(null, i6, obj2)) {
                            return 2;
                        }
                    }
                } else if (kVar.j(null, i6, e.f2364d)) {
                    return 1;
                }
            } else {
                if (objK != e.f2365e) {
                    C0848A c0848a = e.f2371k;
                    if (objK == c0848a) {
                        kVar.m(i6, null);
                        return 5;
                    }
                    if (objK == e.f2368h) {
                        kVar.m(i6, null);
                        return 5;
                    }
                    if (objK == e.f2372l) {
                        kVar.m(i6, null);
                        k();
                        return 4;
                    }
                    kVar.m(i6, null);
                    if (objK instanceof s) {
                        objK = ((s) objK).f2389a;
                    }
                    if (B(objK, obj)) {
                        kVar.n(i6, e.f2369i);
                        return 0;
                    }
                    if (kVar.f2386f.getAndSet((i6 * 2) + 1, c0848a) != c0848a) {
                        kVar.l(i6, true);
                    }
                    return 5;
                }
                if (kVar.j(objK, i6, e.f2364d)) {
                    return 1;
                }
            }
        }
    }

    public final void F(long j6) {
        AtomicLongFieldUpdater atomicLongFieldUpdater;
        long j7;
        long j8;
        if (x()) {
            return;
        }
        do {
            atomicLongFieldUpdater = f2349A;
        } while (atomicLongFieldUpdater.get(this) <= j6);
        int i6 = e.f2363c;
        int i7 = 0;
        while (true) {
            AtomicLongFieldUpdater atomicLongFieldUpdater2 = f2350B;
            if (i7 >= i6) {
                do {
                    j7 = atomicLongFieldUpdater2.get(this);
                } while (!atomicLongFieldUpdater2.compareAndSet(this, j7, 4611686018427387904L + (j7 & 4611686018427387903L)));
                while (true) {
                    long j9 = atomicLongFieldUpdater.get(this);
                    long j10 = atomicLongFieldUpdater2.get(this);
                    long j11 = j10 & 4611686018427387903L;
                    boolean z5 = (j10 & 4611686018427387904L) != 0;
                    if (j9 == j11 && j9 == atomicLongFieldUpdater.get(this)) {
                        break;
                    } else if (!z5) {
                        atomicLongFieldUpdater2.compareAndSet(this, j10, j11 + 4611686018427387904L);
                    }
                }
                do {
                    j8 = atomicLongFieldUpdater2.get(this);
                } while (!atomicLongFieldUpdater2.compareAndSet(this, j8, j8 & 4611686018427387903L));
                return;
            }
            long j12 = atomicLongFieldUpdater.get(this);
            if (j12 == (atomicLongFieldUpdater2.get(this) & 4611686018427387903L) && j12 == atomicLongFieldUpdater.get(this)) {
                return;
            } else {
                i7++;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:149:?, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:150:?, code lost:
    
        return r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00ee, code lost:
    
        r5 = r28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00f2, code lost:
    
        d(r26, r27, r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x00f5, code lost:
    
        r2 = r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x00f6, code lost:
    
        r3 = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x00fa, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x00fb, code lost:
    
        r2 = r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x014c, code lost:
    
        if (r24 >= r5.get(r26)) goto L80;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x014e, code lost:
    
        r19.a();
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x0151, code lost:
    
        r1 = r27;
        r2 = r28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x0155, code lost:
    
        d(r26, r1, r2);
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:105:0x01cc  */
    /* JADX WARN: Removed duplicated region for block: B:151:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r2v32 */
    /* JADX WARN: Type inference failed for: r2v36 */
    /* JADX WARN: Type inference failed for: r2v8 */
    /* JADX WARN: Type inference failed for: r2v9, types: [M4.h] */
    @Override // O4.r
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object a(java.lang.Object r27, v4.InterfaceC1427e r28) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 492
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: O4.c.a(java.lang.Object, v4.e):java.lang.Object");
    }

    @Override // O4.q
    public final void b(CancellationException cancellationException) throws IllegalAccessException, InvocationTargetException {
        if (cancellationException == null) {
            cancellationException = new CancellationException("Channel was cancelled");
        }
        h(cancellationException, true);
    }

    @Override // O4.q
    public final Object f() {
        AtomicLongFieldUpdater atomicLongFieldUpdater = f2357z;
        long j6 = atomicLongFieldUpdater.get(this);
        AtomicLongFieldUpdater atomicLongFieldUpdater2 = f2356y;
        long j7 = atomicLongFieldUpdater2.get(this);
        if (v(true, j7)) {
            return new h(q());
        }
        long j8 = j7 & 1152921504606846975L;
        Object obj = j.f2384a;
        if (j6 >= j8) {
            return obj;
        }
        Object obj2 = e.f2371k;
        k kVar = (k) f2352D.get(this);
        while (!v(true, atomicLongFieldUpdater2.get(this))) {
            long andIncrement = atomicLongFieldUpdater.getAndIncrement(this);
            long j9 = e.f2362b;
            long j10 = andIncrement / j9;
            int i6 = (int) (andIncrement % j9);
            if (kVar.f3041c != j10) {
                k kVarO = o(j10, kVar);
                if (kVarO == null) {
                    continue;
                } else {
                    kVar = kVarO;
                }
            }
            Object objD = D(kVar, i6, andIncrement, obj2);
            if (objD == e.f2373m) {
                y0 y0Var = obj2 instanceof y0 ? (y0) obj2 : null;
                if (y0Var != null) {
                    y0Var.a(kVar, i6);
                }
                F(andIncrement);
                kVar.h();
            } else if (objD == e.f2375o) {
                if (andIncrement < t()) {
                    kVar.a();
                }
            } else {
                if (objD == e.f2374n) {
                    throw new IllegalStateException("unexpected".toString());
                }
                kVar.a();
                obj = objD;
            }
            return obj;
        }
        return new h(q());
    }

    public final boolean g(long j6) {
        return j6 < f2349A.get(this) || j6 < f2357z.get(this) + ((long) this.f2358w);
    }

    public final boolean h(Throwable th, boolean z5) throws IllegalAccessException, InvocationTargetException {
        boolean z6;
        long j6;
        long j7;
        long j8;
        Object obj;
        long j9;
        long j10;
        AtomicLongFieldUpdater atomicLongFieldUpdater = f2356y;
        if (z5) {
            do {
                j10 = atomicLongFieldUpdater.get(this);
                if (((int) (j10 >> 60)) != 0) {
                    break;
                }
                k kVar = e.f2361a;
            } while (!atomicLongFieldUpdater.compareAndSet(this, j10, (((long) 1) << 60) + (j10 & 1152921504606846975L)));
        }
        C0848A c0848a = e.f2379s;
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f2354F;
            if (atomicReferenceFieldUpdater.compareAndSet(this, c0848a, th)) {
                z6 = true;
                break;
            }
            if (atomicReferenceFieldUpdater.get(this) != c0848a) {
                z6 = false;
                break;
            }
        }
        if (z5) {
            do {
                j9 = atomicLongFieldUpdater.get(this);
            } while (!atomicLongFieldUpdater.compareAndSet(this, j9, (((long) 3) << 60) + (j9 & 1152921504606846975L)));
        } else {
            do {
                j6 = atomicLongFieldUpdater.get(this);
                int i6 = (int) (j6 >> 60);
                if (i6 == 0) {
                    j7 = j6 & 1152921504606846975L;
                    j8 = 2;
                } else {
                    if (i6 != 1) {
                        break;
                    }
                    j7 = j6 & 1152921504606846975L;
                    j8 = 3;
                }
            } while (!atomicLongFieldUpdater.compareAndSet(this, j6, (j8 << 60) + j7));
        }
        k();
        if (z6) {
            loop3: while (true) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = f2355G;
                obj = atomicReferenceFieldUpdater2.get(this);
                C0848A c0848a2 = obj == null ? e.f2377q : e.f2378r;
                while (!atomicReferenceFieldUpdater2.compareAndSet(this, obj, c0848a2)) {
                    if (atomicReferenceFieldUpdater2.get(this) != obj) {
                        break;
                    }
                }
            }
            if (obj != null) {
                S3.a.f(1, obj);
                ((C4.l) obj).j(q());
            }
        }
        return z6;
    }

    /* JADX WARN: Code restructure failed: missing block: B:37:0x008f, code lost:
    
        r1 = (O4.k) ((R4.d) R4.d.f3010b.get(r1));
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final O4.k i(long r13) throws java.lang.IllegalAccessException, java.lang.reflect.InvocationTargetException {
        /*
            Method dump skipped, instruction units count: 301
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: O4.c.i(long):O4.k");
    }

    @Override // O4.q
    public final b iterator() {
        return new b(this);
    }

    @Override // O4.r
    public final boolean j(Throwable th) {
        return h(th, false);
    }

    public final void k() throws IllegalAccessException, InvocationTargetException {
        v(false, f2356y.get(this));
    }

    public final void l(long j6) {
        C0733A c0733aI;
        k kVar = (k) f2352D.get(this);
        while (true) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = f2357z;
            long j7 = atomicLongFieldUpdater.get(this);
            if (j6 < Math.max(((long) this.f2358w) + j7, f2349A.get(this))) {
                return;
            }
            if (atomicLongFieldUpdater.compareAndSet(this, j7, j7 + 1)) {
                long j8 = e.f2362b;
                long j9 = j7 / j8;
                int i6 = (int) (j7 % j8);
                if (kVar.f3041c != j9) {
                    k kVarO = o(j9, kVar);
                    if (kVarO == null) {
                        continue;
                    } else {
                        kVar = kVarO;
                    }
                }
                Object objD = D(kVar, i6, j7, null);
                if (objD != e.f2375o) {
                    kVar.a();
                    C4.l lVar = this.f2359x;
                    if (lVar != null && (c0733aI = AbstractC1305a.i(lVar, objD, null)) != null) {
                        throw c0733aI;
                    }
                } else if (j7 < t()) {
                    kVar.a();
                }
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:65:?, code lost:
    
        return r1;
     */
    @Override // O4.r
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object m(java.lang.Object r23) throws java.lang.IllegalAccessException, java.lang.reflect.InvocationTargetException {
        /*
            Method dump skipped, instruction units count: 218
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: O4.c.m(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:102:0x0192, code lost:
    
        u(r16);
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x0195, code lost:
    
        return;
     */
    /* JADX WARN: Removed duplicated region for block: B:106:0x00d5 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0012 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void n() {
        /*
            Method dump skipped, instruction units count: 406
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: O4.c.n():void");
    }

    public final k o(long j6, k kVar) {
        Object objA;
        AtomicLongFieldUpdater atomicLongFieldUpdater;
        long j7;
        k kVar2 = e.f2361a;
        d dVar = d.f2360E;
        loop0: while (true) {
            objA = R4.a.a(kVar, j6, dVar);
            if (!AbstractC1305a.K(objA)) {
                u uVarF = AbstractC1305a.F(objA);
                while (true) {
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f2352D;
                    u uVar = (u) atomicReferenceFieldUpdater.get(this);
                    if (uVar.f3041c >= uVarF.f3041c) {
                        break loop0;
                    }
                    if (!uVarF.i()) {
                        break;
                    }
                    while (!atomicReferenceFieldUpdater.compareAndSet(this, uVar, uVarF)) {
                        if (atomicReferenceFieldUpdater.get(this) != uVar) {
                            if (uVarF.e()) {
                                uVarF.d();
                            }
                        }
                    }
                    if (uVar.e()) {
                        uVar.d();
                    }
                }
            } else {
                break;
            }
        }
        if (AbstractC1305a.K(objA)) {
            k();
            if (kVar.f3041c * ((long) e.f2362b) >= t()) {
                return null;
            }
        } else {
            kVar = (k) AbstractC1305a.F(objA);
            boolean zX = x();
            long j8 = kVar.f3041c;
            if (!zX && j6 <= f2349A.get(this) / ((long) e.f2362b)) {
                while (true) {
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = f2353E;
                    u uVar2 = (u) atomicReferenceFieldUpdater2.get(this);
                    if (uVar2.f3041c >= j8 || !kVar.i()) {
                        break;
                    }
                    while (!atomicReferenceFieldUpdater2.compareAndSet(this, uVar2, kVar)) {
                        if (atomicReferenceFieldUpdater2.get(this) != uVar2) {
                            if (kVar.e()) {
                                kVar.d();
                            }
                        }
                    }
                    if (uVar2.e()) {
                        uVar2.d();
                    }
                }
            }
            if (j8 <= j6) {
                return kVar;
            }
            long j9 = ((long) e.f2362b) * j8;
            do {
                atomicLongFieldUpdater = f2357z;
                j7 = atomicLongFieldUpdater.get(this);
                if (j7 >= j9) {
                    break;
                }
            } while (!atomicLongFieldUpdater.compareAndSet(this, j7, j9));
            if (j8 * ((long) e.f2362b) >= t()) {
                return null;
            }
        }
        kVar.a();
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00e1 A[Catch: all -> 0x008d, TryCatch #1 {all -> 0x008d, blocks: (B:26:0x0074, B:30:0x0081, B:32:0x0089, B:35:0x0090, B:36:0x0096, B:38:0x00a1, B:39:0x00ae, B:41:0x00c2, B:45:0x00cc, B:47:0x00dd, B:48:0x00e1, B:50:0x00e5, B:52:0x00ed, B:54:0x00f3, B:56:0x00f7, B:58:0x00fc, B:60:0x0102, B:61:0x0106, B:62:0x010f, B:63:0x0110, B:65:0x0117), top: B:81:0x0070 }] */
    /* JADX WARN: Removed duplicated region for block: B:91:0x00dd A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r15v1 */
    /* JADX WARN: Type inference failed for: r15v2, types: [M4.h] */
    /* JADX WARN: Type inference failed for: r15v6 */
    /* JADX WARN: Type inference failed for: r18v0, types: [O4.c, java.lang.Object] */
    @Override // O4.q
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object p(v4.InterfaceC1427e r19) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 319
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: O4.c.p(v4.e):java.lang.Object");
    }

    public final Throwable q() {
        return (Throwable) f2354F.get(this);
    }

    public final Throwable r() {
        Throwable thQ = q();
        return thQ == null ? new l("Channel was closed") : thQ;
    }

    public final Throwable s() {
        Throwable thQ = q();
        return thQ == null ? new m("Channel was closed") : thQ;
    }

    public final long t() {
        return f2356y.get(this) & 1152921504606846975L;
    }

    /* JADX WARN: Code restructure failed: missing block: B:77:0x0192, code lost:
    
        r3 = (O4.k) r3.b();
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x0199, code lost:
    
        if (r3 != null) goto L88;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x01d0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.String toString() {
        /*
            Method dump skipped, instruction units count: 470
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: O4.c.toString():java.lang.String");
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x005d, code lost:
    
        r0.m(r4, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x00bd, code lost:
    
        r0 = (O4.k) ((R4.d) R4.d.f3010b.get(r0));
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean v(boolean r19, long r20) throws java.lang.IllegalAccessException, java.lang.reflect.InvocationTargetException {
        /*
            Method dump skipped, instruction units count: 401
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: O4.c.v(boolean, long):boolean");
    }

    public boolean w() {
        return false;
    }

    public final boolean x() {
        long j6 = f2349A.get(this);
        return j6 == 0 || j6 == Long.MAX_VALUE;
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x0011, code lost:
    
        continue;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void y(long r5, O4.k r7) {
        /*
            r4 = this;
        L0:
            long r0 = r7.f3041c
            int r0 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r0 >= 0) goto L11
            R4.d r0 = r7.b()
            O4.k r0 = (O4.k) r0
            if (r0 != 0) goto Lf
            goto L11
        Lf:
            r7 = r0
            goto L0
        L11:
            boolean r5 = r7.c()
            if (r5 == 0) goto L22
            R4.d r5 = r7.b()
            O4.k r5 = (O4.k) r5
            if (r5 != 0) goto L20
            goto L22
        L20:
            r7 = r5
            goto L11
        L22:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r5 = O4.c.f2353E
            java.lang.Object r6 = r5.get(r4)
            R4.u r6 = (R4.u) r6
            long r0 = r6.f3041c
            long r2 = r7.f3041c
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 < 0) goto L33
            goto L49
        L33:
            boolean r0 = r7.i()
            if (r0 != 0) goto L3a
            goto L11
        L3a:
            boolean r0 = r5.compareAndSet(r4, r6, r7)
            if (r0 == 0) goto L4a
            boolean r5 = r6.e()
            if (r5 == 0) goto L49
            r6.d()
        L49:
            return
        L4a:
            java.lang.Object r0 = r5.get(r4)
            if (r0 == r6) goto L3a
            boolean r5 = r7.e()
            if (r5 == 0) goto L22
            r7.d()
            goto L22
        */
        throw new UnsupportedOperationException("Method not decompiled: O4.c.y(long, O4.k):void");
    }

    public final Object z(Object obj, InterfaceC1427e interfaceC1427e) throws IllegalAccessException, InvocationTargetException {
        Throwable thS;
        C0063h c0063h = new C0063h(1, AbstractC1305a.H(interfaceC1427e));
        c0063h.v();
        C4.l lVar = this.f2359x;
        if (lVar == null || (thS = AbstractC1305a.i(lVar, obj, null)) == null) {
            thS = s();
        } else {
            AbstractC1305a.b(thS, s());
        }
        c0063h.o(S3.a.m(thS));
        Object objU = c0063h.u();
        return objU == EnumC1481a.f13592w ? objU : C1316l.f12640a;
    }
}
