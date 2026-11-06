package M4;

import h0.C0733A;
import j3.C0848A;
import java.lang.reflect.InvocationTargetException;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Future;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import s4.AbstractC1305a;
import s4.AbstractC1313i;
import s4.C1316l;
import v4.InterfaceC1427e;
import v4.InterfaceC1432j;
import w4.EnumC1481a;

/* JADX INFO: renamed from: M4.h, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C0063h extends I implements InterfaceC0062g, x4.d, y0 {

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f1886B = AtomicIntegerFieldUpdater.newUpdater(C0063h.class, "_decisionAndIndex$volatile");

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f1887C = AtomicReferenceFieldUpdater.newUpdater(C0063h.class, Object.class, "_state$volatile");

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f1888D = AtomicReferenceFieldUpdater.newUpdater(C0063h.class, Object.class, "_parentHandle$volatile");

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public final InterfaceC1432j f1889A;
    private volatile /* synthetic */ int _decisionAndIndex$volatile;
    private volatile /* synthetic */ Object _parentHandle$volatile;
    private volatile /* synthetic */ Object _state$volatile;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final InterfaceC1427e f1890z;

    public C0063h(int i6, InterfaceC1427e interfaceC1427e) {
        super(i6);
        this.f1890z = interfaceC1427e;
        this.f1889A = interfaceC1427e.i();
        this._decisionAndIndex$volatile = 536870911;
        this._state$volatile = C0057b.f1875a;
    }

    public static void A(Object obj, Object obj2) {
        throw new IllegalStateException(("It's prohibited to register multiple handlers, tried to register " + obj + ", already has " + obj2).toString());
    }

    public static Object F(p0 p0Var, Object obj, int i6, C4.l lVar) {
        if ((obj instanceof r) || !AbstractC1305a.J(i6)) {
            return obj;
        }
        if (lVar != null || (p0Var instanceof InterfaceC0061f)) {
            return new C0072q(obj, p0Var instanceof InterfaceC0061f ? (InterfaceC0061f) p0Var : null, lVar, (CancellationException) null, 16);
        }
        return obj;
    }

    public String B() {
        return "CancellableContinuation";
    }

    public final void C() {
        InterfaceC1427e interfaceC1427e = this.f1890z;
        Throwable th = null;
        R4.h hVar = interfaceC1427e instanceof R4.h ? (R4.h) interfaceC1427e : null;
        if (hVar != null) {
            loop0: while (true) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = R4.h.f3014D;
                Object obj = atomicReferenceFieldUpdater.get(hVar);
                C0848A c0848a = R4.a.f3004d;
                if (obj == c0848a) {
                    while (!atomicReferenceFieldUpdater.compareAndSet(hVar, c0848a, this)) {
                        if (atomicReferenceFieldUpdater.get(hVar) != c0848a) {
                            break;
                        }
                    }
                    break loop0;
                } else {
                    if (!(obj instanceof Throwable)) {
                        throw new IllegalStateException(("Inconsistent state " + obj).toString());
                    }
                    while (!atomicReferenceFieldUpdater.compareAndSet(hVar, obj, null)) {
                        if (atomicReferenceFieldUpdater.get(hVar) != obj) {
                            throw new IllegalArgumentException("Failed requirement.".toString());
                        }
                    }
                    th = (Throwable) obj;
                }
            }
            if (th == null) {
                return;
            }
            n();
            s(th);
        }
    }

    public final void D(Object obj, C4.l lVar) throws IllegalAccessException, InvocationTargetException {
        E(obj, this.f1850y, lVar);
    }

    public final void E(Object obj, int i6, C4.l lVar) throws IllegalAccessException, InvocationTargetException {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f1887C;
            Object obj2 = atomicReferenceFieldUpdater.get(this);
            if (obj2 instanceof p0) {
                Object objF = F((p0) obj2, obj, i6, lVar);
                while (!atomicReferenceFieldUpdater.compareAndSet(this, obj2, objF)) {
                    if (atomicReferenceFieldUpdater.get(this) != obj2) {
                        break;
                    }
                }
                if (!z()) {
                    n();
                }
                p(i6);
                return;
            }
            if (obj2 instanceof C0064i) {
                C0064i c0064i = (C0064i) obj2;
                c0064i.getClass();
                if (C0064i.f1895c.compareAndSet(c0064i, 0, 1)) {
                    if (lVar != null) {
                        l(lVar, c0064i.f1916a);
                        return;
                    }
                    return;
                }
            }
            throw new IllegalStateException(("Already resumed, but proposed with update " + obj).toString());
        }
    }

    @Override // M4.y0
    public final void a(R4.u uVar, int i6) {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        int i7;
        do {
            atomicIntegerFieldUpdater = f1886B;
            i7 = atomicIntegerFieldUpdater.get(this);
            if ((i7 & 536870911) != 536870911) {
                throw new IllegalStateException("invokeOnCancellation should be called at most once".toString());
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i7, ((i7 >> 29) << 29) + i6));
        y(uVar);
    }

    @Override // M4.I
    public final void b(Object obj, CancellationException cancellationException) throws IllegalAccessException, InvocationTargetException {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f1887C;
            Object obj2 = atomicReferenceFieldUpdater.get(this);
            if (obj2 instanceof p0) {
                throw new IllegalStateException("Not completed".toString());
            }
            if (obj2 instanceof r) {
                return;
            }
            if (!(obj2 instanceof C0072q)) {
                C0072q c0072q = new C0072q(obj2, (InterfaceC0061f) null, (C4.l) null, cancellationException, 14);
                while (!atomicReferenceFieldUpdater.compareAndSet(this, obj2, c0072q)) {
                    if (atomicReferenceFieldUpdater.get(this) != obj2) {
                        break;
                    }
                }
                return;
            }
            C0072q c0072q2 = (C0072q) obj2;
            if (!(!(c0072q2.f1914e != null))) {
                throw new IllegalStateException("Must be called at most once".toString());
            }
            C0072q c0072qA = C0072q.a(c0072q2, null, cancellationException, 15);
            while (!atomicReferenceFieldUpdater.compareAndSet(this, obj2, c0072qA)) {
                if (atomicReferenceFieldUpdater.get(this) != obj2) {
                    break;
                }
            }
            InterfaceC0061f interfaceC0061f = c0072q2.f1911b;
            if (interfaceC0061f != null) {
                k(interfaceC0061f, cancellationException);
            }
            C4.l lVar = c0072q2.f1912c;
            if (lVar != null) {
                l(lVar, cancellationException);
                return;
            }
            return;
        }
    }

    @Override // M4.I
    public final InterfaceC1427e c() {
        return this.f1890z;
    }

    @Override // M4.InterfaceC0062g
    public final void d(AbstractC0077w abstractC0077w) throws IllegalAccessException, InvocationTargetException {
        C1316l c1316l = C1316l.f12640a;
        InterfaceC1427e interfaceC1427e = this.f1890z;
        R4.h hVar = interfaceC1427e instanceof R4.h ? (R4.h) interfaceC1427e : null;
        E(c1316l, (hVar != null ? hVar.f3018z : null) == abstractC0077w ? 4 : this.f1850y, null);
    }

    @Override // x4.d
    public final x4.d e() {
        InterfaceC1427e interfaceC1427e = this.f1890z;
        if (interfaceC1427e instanceof x4.d) {
            return (x4.d) interfaceC1427e;
        }
        return null;
    }

    @Override // M4.I
    public final Throwable f(Object obj) {
        Throwable thF = super.f(obj);
        if (thF != null) {
            return thF;
        }
        return null;
    }

    @Override // M4.I
    public final Object g(Object obj) {
        return obj instanceof C0072q ? ((C0072q) obj).f1910a : obj;
    }

    @Override // v4.InterfaceC1427e
    public final InterfaceC1432j i() {
        return this.f1889A;
    }

    @Override // M4.I
    public final Object j() {
        return f1887C.get(this);
    }

    public final void k(InterfaceC0061f interfaceC0061f, Throwable th) throws IllegalAccessException, InvocationTargetException {
        try {
            C0060e c0060e = (C0060e) interfaceC0061f;
            int i6 = c0060e.f1881a;
            Object obj = c0060e.f1882b;
            switch (i6) {
                case com.bumptech.glide.d.f6312l /* 0 */:
                    if (th != null) {
                        ((Future) obj).cancel(false);
                    }
                    break;
                case 1:
                    ((C4.l) obj).j(th);
                    break;
                default:
                    ((K) obj).a();
                    break;
            }
        } catch (Throwable th2) {
            S3.a.x(this.f1889A, new C0733A("Exception in invokeOnCancellation handler for " + this, th2));
        }
    }

    public final void l(C4.l lVar, Throwable th) throws IllegalAccessException, InvocationTargetException {
        try {
            lVar.j(th);
        } catch (Throwable th2) {
            S3.a.x(this.f1889A, new C0733A("Exception in resume onCancellation handler for " + this, th2));
        }
    }

    public final void m(R4.u uVar, Throwable th) throws IllegalAccessException, InvocationTargetException {
        InterfaceC1432j interfaceC1432j = this.f1889A;
        int i6 = f1886B.get(this) & 536870911;
        if (i6 == 536870911) {
            throw new IllegalStateException("The index for Segment.onCancellation(..) is broken".toString());
        }
        try {
            uVar.g(i6, interfaceC1432j);
        } catch (Throwable th2) {
            S3.a.x(interfaceC1432j, new C0733A("Exception in invokeOnCancellation handler for " + this, th2));
        }
    }

    public final void n() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f1888D;
        K k5 = (K) atomicReferenceFieldUpdater.get(this);
        if (k5 == null) {
            return;
        }
        k5.a();
        atomicReferenceFieldUpdater.set(this, o0.f1909w);
    }

    @Override // v4.InterfaceC1427e
    public final void o(Object obj) throws IllegalAccessException, InvocationTargetException {
        Throwable thA = AbstractC1313i.a(obj);
        if (thA != null) {
            obj = new r(thA, false);
        }
        E(obj, this.f1850y, null);
    }

    public final void p(int i6) {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        int i7;
        do {
            atomicIntegerFieldUpdater = f1886B;
            i7 = atomicIntegerFieldUpdater.get(this);
            int i8 = i7 >> 29;
            if (i8 != 0) {
                if (i8 != 1) {
                    throw new IllegalStateException("Already resumed".toString());
                }
                boolean z5 = i6 == 4;
                InterfaceC1427e interfaceC1427e = this.f1890z;
                if (z5 || !(interfaceC1427e instanceof R4.h) || AbstractC1305a.J(i6) != AbstractC1305a.J(this.f1850y)) {
                    AbstractC1305a.S(this, interfaceC1427e, z5);
                    return;
                }
                AbstractC0077w abstractC0077w = ((R4.h) interfaceC1427e).f3018z;
                InterfaceC1432j interfaceC1432jI = interfaceC1427e.i();
                if (abstractC0077w.L()) {
                    abstractC0077w.J(interfaceC1432jI, this);
                    return;
                }
                Q qA = u0.a();
                if (qA.Q()) {
                    qA.N(this);
                    return;
                }
                qA.P(true);
                try {
                    AbstractC1305a.S(this, interfaceC1427e, true);
                    do {
                    } while (qA.S());
                } finally {
                    try {
                    } finally {
                    }
                }
                return;
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i7, 1073741824 + (536870911 & i7)));
    }

    @Override // M4.InterfaceC0062g
    public final C0848A q(Object obj, C4.l lVar) {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f1887C;
            Object obj2 = atomicReferenceFieldUpdater.get(this);
            boolean z5 = obj2 instanceof p0;
            C0848A c0848a = B.f1836a;
            if (!z5) {
                boolean z6 = obj2 instanceof C0072q;
                return null;
            }
            Object objF = F((p0) obj2, obj, this.f1850y, lVar);
            while (!atomicReferenceFieldUpdater.compareAndSet(this, obj2, objF)) {
                if (atomicReferenceFieldUpdater.get(this) != obj2) {
                    break;
                }
            }
            if (z()) {
                return c0848a;
            }
            n();
            return c0848a;
        }
    }

    @Override // M4.InterfaceC0062g
    public final void r(Object obj) {
        p(this.f1850y);
    }

    @Override // M4.InterfaceC0062g
    public final boolean s(Throwable th) throws IllegalAccessException, InvocationTargetException {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f1887C;
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (!(obj instanceof p0)) {
                return false;
            }
            C0064i c0064i = new C0064i(this, th, (obj instanceof InterfaceC0061f) || (obj instanceof R4.u));
            while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, c0064i)) {
                if (atomicReferenceFieldUpdater.get(this) != obj) {
                    break;
                }
            }
            p0 p0Var = (p0) obj;
            if (p0Var instanceof InterfaceC0061f) {
                k((InterfaceC0061f) obj, th);
            } else if (p0Var instanceof R4.u) {
                m((R4.u) obj, th);
            }
            if (!z()) {
                n();
            }
            p(this.f1850y);
            return true;
        }
    }

    public Throwable t(k0 k0Var) {
        return k0Var.F();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(B());
        sb.append('(');
        sb.append(B.s(this.f1890z));
        sb.append("){");
        Object obj = f1887C.get(this);
        sb.append(obj instanceof p0 ? "Active" : obj instanceof C0064i ? "Cancelled" : "Completed");
        sb.append("}@");
        sb.append(B.d(this));
        return sb.toString();
    }

    public final Object u() {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        int i6;
        boolean z5 = z();
        do {
            atomicIntegerFieldUpdater = f1886B;
            i6 = atomicIntegerFieldUpdater.get(this);
            int i7 = i6 >> 29;
            if (i7 != 0) {
                if (i7 != 2) {
                    throw new IllegalStateException("Already suspended".toString());
                }
                if (z5) {
                    C();
                }
                Object obj = f1887C.get(this);
                if (obj instanceof r) {
                    throw ((r) obj).f1916a;
                }
                if (AbstractC1305a.J(this.f1850y)) {
                    b0 b0Var = (b0) this.f1889A.n(C0078x.f1930x);
                    if (b0Var != null && !b0Var.c()) {
                        CancellationException cancellationExceptionF = ((k0) b0Var).F();
                        b(obj, cancellationExceptionF);
                        throw cancellationExceptionF;
                    }
                }
                return g(obj);
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i6, 536870912 + (536870911 & i6)));
        if (((K) f1888D.get(this)) == null) {
            w();
        }
        if (z5) {
            C();
        }
        return EnumC1481a.f13592w;
    }

    public final void v() {
        K kW = w();
        if (kW != null && (!(f1887C.get(this) instanceof p0))) {
            kW.a();
            f1888D.set(this, o0.f1909w);
        }
    }

    public final K w() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        b0 b0Var = (b0) this.f1889A.n(C0078x.f1930x);
        if (b0Var == null) {
            return null;
        }
        K kZ = S3.a.z(b0Var, true, new C0065j(this), 2);
        do {
            atomicReferenceFieldUpdater = f1888D;
            if (atomicReferenceFieldUpdater.compareAndSet(this, null, kZ)) {
                break;
            }
        } while (atomicReferenceFieldUpdater.get(this) == null);
        return kZ;
    }

    public final void x(C4.l lVar) {
        S3.a.y(this, new C0060e(1, lVar));
    }

    /* JADX WARN: Code restructure failed: missing block: B:62:0x00ab, code lost:
    
        A(r10, r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x00ae, code lost:
    
        throw null;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void y(java.lang.Object r10) {
        /*
            r9 = this;
        L0:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = M4.C0063h.f1887C
            java.lang.Object r7 = r0.get(r9)
            boolean r1 = r7 instanceof M4.C0057b
            if (r1 == 0) goto L18
        La:
            boolean r1 = r0.compareAndSet(r9, r7, r10)
            if (r1 == 0) goto L11
            return
        L11:
            java.lang.Object r1 = r0.get(r9)
            if (r1 == r7) goto La
            goto L0
        L18:
            boolean r1 = r7 instanceof M4.InterfaceC0061f
            r2 = 0
            if (r1 != 0) goto Lab
            boolean r1 = r7 instanceof R4.u
            if (r1 != 0) goto Lab
            boolean r1 = r7 instanceof M4.r
            if (r1 == 0) goto L55
            r0 = r7
            M4.r r0 = (M4.r) r0
            r0.getClass()
            r3 = 1
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r4 = M4.r.f1915b
            r5 = 0
            boolean r3 = r4.compareAndSet(r0, r5, r3)
            if (r3 == 0) goto L51
            boolean r3 = r7 instanceof M4.C0064i
            if (r3 == 0) goto L50
            if (r1 == 0) goto L3c
            goto L3d
        L3c:
            r0 = r2
        L3d:
            if (r0 == 0) goto L41
            java.lang.Throwable r2 = r0.f1916a
        L41:
            boolean r0 = r10 instanceof M4.InterfaceC0061f
            if (r0 == 0) goto L4b
            M4.f r10 = (M4.InterfaceC0061f) r10
            r9.k(r10, r2)
            goto L50
        L4b:
            R4.u r10 = (R4.u) r10
            r9.m(r10, r2)
        L50:
            return
        L51:
            A(r10, r7)
            throw r2
        L55:
            boolean r1 = r7 instanceof M4.C0072q
            if (r1 == 0) goto L89
            r1 = r7
            M4.q r1 = (M4.C0072q) r1
            M4.f r3 = r1.f1911b
            if (r3 != 0) goto L85
            boolean r3 = r10 instanceof R4.u
            if (r3 == 0) goto L65
            return
        L65:
            r3 = r10
            M4.f r3 = (M4.InterfaceC0061f) r3
            java.lang.Throwable r4 = r1.f1914e
            if (r4 == 0) goto L70
            r9.k(r3, r4)
            return
        L70:
            r4 = 29
            M4.q r1 = M4.C0072q.a(r1, r3, r2, r4)
        L76:
            boolean r2 = r0.compareAndSet(r9, r7, r1)
            if (r2 == 0) goto L7d
            return
        L7d:
            java.lang.Object r2 = r0.get(r9)
            if (r2 == r7) goto L76
            goto L0
        L85:
            A(r10, r7)
            throw r2
        L89:
            boolean r1 = r10 instanceof R4.u
            if (r1 == 0) goto L8e
            return
        L8e:
            r3 = r10
            M4.f r3 = (M4.InterfaceC0061f) r3
            M4.q r8 = new M4.q
            r4 = 0
            r5 = 0
            r6 = 28
            r1 = r8
            r2 = r7
            r1.<init>(r2, r3, r4, r5, r6)
        L9c:
            boolean r1 = r0.compareAndSet(r9, r7, r8)
            if (r1 == 0) goto La3
            return
        La3:
            java.lang.Object r1 = r0.get(r9)
            if (r1 == r7) goto L9c
            goto L0
        Lab:
            A(r10, r7)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: M4.C0063h.y(java.lang.Object):void");
    }

    public final boolean z() {
        if (this.f1850y == 2) {
            InterfaceC1427e interfaceC1427e = this.f1890z;
            AbstractC1305a.m(interfaceC1427e, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<*>");
            if (R4.h.f3014D.get((R4.h) interfaceC1427e) != null) {
                return true;
            }
        }
        return false;
    }
}
