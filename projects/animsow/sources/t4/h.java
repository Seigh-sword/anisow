package T4;

import M4.C0063h;
import M4.InterfaceC0062g;
import R4.u;
import W.Q;
import j3.C0848A;
import java.lang.reflect.InvocationTargetException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import s4.AbstractC1305a;
import s4.C1316l;

/* JADX INFO: loaded from: classes.dex */
public class h {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f3554c = AtomicReferenceFieldUpdater.newUpdater(h.class, Object.class, "head$volatile");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ AtomicLongFieldUpdater f3555d = AtomicLongFieldUpdater.newUpdater(h.class, "deqIdx$volatile");

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f3556e = AtomicReferenceFieldUpdater.newUpdater(h.class, Object.class, "tail$volatile");

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ AtomicLongFieldUpdater f3557f = AtomicLongFieldUpdater.newUpdater(h.class, "enqIdx$volatile");

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f3558g = AtomicIntegerFieldUpdater.newUpdater(h.class, "_availablePermits$volatile");
    private volatile /* synthetic */ int _availablePermits$volatile;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f3559a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Q f3560b;
    private volatile /* synthetic */ long deqIdx$volatile;
    private volatile /* synthetic */ long enqIdx$volatile;
    private volatile /* synthetic */ Object head$volatile;
    private volatile /* synthetic */ Object tail$volatile;

    public h(int i6) {
        if (i6 < 0 || i6 > 1) {
            throw new IllegalArgumentException("The number of acquired permits should be in 0..1".toString());
        }
        j jVar = new j(0L, null, 2);
        this.head$volatile = jVar;
        this.tail$volatile = jVar;
        this._availablePermits$volatile = 1 - i6;
        this.f3560b = new Q(20, this);
    }

    public final void a(c cVar) throws IllegalAccessException, InvocationTargetException {
        Object objA;
        C1316l c1316l;
        C0063h c0063h;
        f fVar;
        long j6;
        while (true) {
            int andDecrement = f3558g.getAndDecrement(this);
            if (andDecrement <= this.f3559a) {
                int i6 = 0;
                C1316l c1316l2 = C1316l.f12640a;
                C0063h c0063h2 = cVar.f3547w;
                d dVar = cVar.f3549y;
                Object obj = cVar.f3548x;
                if (andDecrement > 0) {
                    d.f3550h.set(dVar, obj);
                    c0063h2.D(c1316l2, new b(dVar, cVar, i6));
                    return;
                }
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f3556e;
                j jVar = (j) atomicReferenceFieldUpdater.get(this);
                long andIncrement = f3557f.getAndIncrement(this);
                f fVar2 = f.f3552E;
                long j7 = andIncrement / ((long) i.f3566f);
                while (true) {
                    objA = R4.a.a(jVar, j7, fVar2);
                    if (!AbstractC1305a.K(objA)) {
                        u uVarF = AbstractC1305a.F(objA);
                        while (true) {
                            u uVar = (u) atomicReferenceFieldUpdater.get(this);
                            fVar = fVar2;
                            j6 = j7;
                            c1316l = c1316l2;
                            c0063h = c0063h2;
                            if (uVar.f3041c >= uVarF.f3041c) {
                                break;
                            }
                            if (!uVarF.i()) {
                                break;
                            }
                            while (!atomicReferenceFieldUpdater.compareAndSet(this, uVar, uVarF)) {
                                if (atomicReferenceFieldUpdater.get(this) != uVar) {
                                    if (uVarF.e()) {
                                        uVarF.d();
                                    }
                                    c1316l2 = c1316l;
                                    fVar2 = fVar;
                                    j7 = j6;
                                    c0063h2 = c0063h;
                                }
                            }
                            if (uVar.e()) {
                                uVar.d();
                            }
                        }
                    } else {
                        c1316l = c1316l2;
                        c0063h = c0063h2;
                        break;
                    }
                    c1316l2 = c1316l;
                    fVar2 = fVar;
                    j7 = j6;
                    c0063h2 = c0063h;
                }
                j jVar2 = (j) AbstractC1305a.F(objA);
                int i7 = (int) (andIncrement % ((long) i.f3566f));
                AtomicReferenceArray atomicReferenceArray = jVar2.f3567e;
                while (!atomicReferenceArray.compareAndSet(i7, null, cVar)) {
                    if (atomicReferenceArray.get(i7) != null) {
                        C0848A c0848a = i.f3562b;
                        C0848A c0848a2 = i.f3563c;
                        while (!atomicReferenceArray.compareAndSet(i7, c0848a, c0848a2)) {
                            C0063h c0063h3 = c0063h;
                            if (atomicReferenceArray.get(i7) != c0848a) {
                                break;
                            } else {
                                c0063h = c0063h3;
                            }
                        }
                        d.f3550h.set(dVar, obj);
                        c0063h.D(c1316l, new b(dVar, cVar, 0));
                        return;
                    }
                }
                cVar.a(jVar2, i7);
                return;
            }
        }
    }

    public final void b() {
        int i6;
        Object objA;
        while (true) {
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f3558g;
            int andIncrement = atomicIntegerFieldUpdater.getAndIncrement(this);
            int i7 = this.f3559a;
            if (andIncrement >= i7) {
                do {
                    i6 = atomicIntegerFieldUpdater.get(this);
                    if (i6 <= i7) {
                        break;
                    }
                } while (!atomicIntegerFieldUpdater.compareAndSet(this, i6, i7));
                throw new IllegalStateException(("The number of released permits cannot be greater than " + i7).toString());
            }
            if (andIncrement >= 0) {
                return;
            }
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f3554c;
            j jVar = (j) atomicReferenceFieldUpdater.get(this);
            long andIncrement2 = f3555d.getAndIncrement(this);
            long j6 = andIncrement2 / ((long) i.f3566f);
            g gVar = g.f3553E;
            while (true) {
                objA = R4.a.a(jVar, j6, gVar);
                if (AbstractC1305a.K(objA)) {
                    break;
                }
                u uVarF = AbstractC1305a.F(objA);
                while (true) {
                    u uVar = (u) atomicReferenceFieldUpdater.get(this);
                    if (uVar.f3041c >= uVarF.f3041c) {
                        break;
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
            }
            j jVar2 = (j) AbstractC1305a.F(objA);
            jVar2.a();
            if (jVar2.f3041c <= j6) {
                int i8 = (int) (andIncrement2 % ((long) i.f3566f));
                C0848A c0848a = i.f3562b;
                AtomicReferenceArray atomicReferenceArray = jVar2.f3567e;
                Object andSet = atomicReferenceArray.getAndSet(i8, c0848a);
                if (andSet == null) {
                    int i9 = i.f3561a;
                    boolean z5 = false;
                    for (int i10 = 0; i10 < i9; i10++) {
                        if (atomicReferenceArray.get(i8) == i.f3563c) {
                            return;
                        }
                    }
                    C0848A c0848a2 = i.f3562b;
                    C0848A c0848a3 = i.f3564d;
                    while (true) {
                        if (!atomicReferenceArray.compareAndSet(i8, c0848a2, c0848a3)) {
                            if (atomicReferenceArray.get(i8) != c0848a2) {
                                break;
                            }
                        } else {
                            z5 = true;
                            break;
                        }
                    }
                    if (!z5) {
                        return;
                    }
                } else if (andSet == i.f3565e) {
                    continue;
                } else {
                    if (!(andSet instanceof InterfaceC0062g)) {
                        throw new IllegalStateException(("unexpected: " + andSet).toString());
                    }
                    InterfaceC0062g interfaceC0062g = (InterfaceC0062g) andSet;
                    C0848A c0848aQ = interfaceC0062g.q(C1316l.f12640a, this.f3560b);
                    if (c0848aQ != null) {
                        interfaceC0062g.r(c0848aQ);
                        return;
                    }
                }
            }
        }
    }
}
