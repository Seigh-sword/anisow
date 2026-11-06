package M4;

import h0.C0733A;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import s4.AbstractC1305a;
import s4.C1316l;
import v4.InterfaceC1430h;
import v4.InterfaceC1431i;
import v4.InterfaceC1432j;
import w4.EnumC1481a;

/* JADX INFO: loaded from: classes.dex */
public class k0 implements b0, InterfaceC0068m, q0 {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f1905w = AtomicReferenceFieldUpdater.newUpdater(k0.class, Object.class, "_state$volatile");

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f1906x = AtomicReferenceFieldUpdater.newUpdater(k0.class, Object.class, "_parentHandle$volatile");
    private volatile /* synthetic */ Object _parentHandle$volatile;
    private volatile /* synthetic */ Object _state$volatile;

    public k0(boolean z5) {
        this._state$volatile = z5 ? B.f1845j : B.f1844i;
    }

    public static C0067l V(R4.k kVar) {
        while (kVar.j()) {
            R4.k kVarF = kVar.f();
            if (kVarF == null) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = R4.k.f3026x;
                Object obj = atomicReferenceFieldUpdater.get(kVar);
                while (true) {
                    kVar = (R4.k) obj;
                    if (!kVar.j()) {
                        break;
                    }
                    obj = atomicReferenceFieldUpdater.get(kVar);
                }
            } else {
                kVar = kVarF;
            }
        }
        while (true) {
            kVar = kVar.i();
            if (!kVar.j()) {
                if (kVar instanceof C0067l) {
                    return (C0067l) kVar;
                }
                if (kVar instanceof n0) {
                    return null;
                }
            }
        }
    }

    public static String b0(Object obj) {
        if (!(obj instanceof i0)) {
            return obj instanceof V ? ((V) obj).c() ? "Active" : "New" : obj instanceof r ? "Cancelled" : "Completed";
        }
        i0 i0Var = (i0) obj;
        return i0Var.d() ? "Cancelling" : i0Var.f() ? "Completing" : "Active";
    }

    public String A() {
        return "Job was cancelled";
    }

    public boolean B(Throwable th) {
        if (th instanceof CancellationException) {
            return true;
        }
        return x(th) && H();
    }

    public final void C(V v5, Object obj) throws IllegalAccessException, InvocationTargetException {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f1906x;
        InterfaceC0066k interfaceC0066k = (InterfaceC0066k) atomicReferenceFieldUpdater.get(this);
        if (interfaceC0066k != null) {
            interfaceC0066k.a();
            atomicReferenceFieldUpdater.set(this, o0.f1909w);
        }
        C0733A c0733a = null;
        r rVar = obj instanceof r ? (r) obj : null;
        Throwable th = rVar != null ? rVar.f1916a : null;
        if (v5 instanceof f0) {
            try {
                ((f0) v5).d(th);
                return;
            } catch (Throwable th2) {
                M(new C0733A("Exception in completion handler " + v5 + " for " + this, th2));
                return;
            }
        }
        n0 n0VarE = v5.e();
        if (n0VarE != null) {
            Object objH = n0VarE.h();
            AbstractC1305a.m(objH, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode{ kotlinx.coroutines.internal.LockFreeLinkedListKt.Node }");
            for (R4.k kVarI = (R4.k) objH; !AbstractC1305a.c(kVarI, n0VarE); kVarI = kVarI.i()) {
                if (kVarI instanceof f0) {
                    f0 f0Var = (f0) kVarI;
                    try {
                        f0Var.d(th);
                    } catch (Throwable th3) {
                        if (c0733a != null) {
                            AbstractC1305a.b(c0733a, th3);
                        } else {
                            c0733a = new C0733A("Exception in completion handler " + f0Var + " for " + this, th3);
                        }
                    }
                }
            }
            if (c0733a != null) {
                M(c0733a);
            }
        }
    }

    public final Throwable D(Object obj) {
        Throwable thB;
        if (obj instanceof Throwable) {
            return (Throwable) obj;
        }
        k0 k0Var = (k0) ((q0) obj);
        Object objK = k0Var.K();
        if (objK instanceof i0) {
            thB = ((i0) objK).b();
        } else if (objK instanceof r) {
            thB = ((r) objK).f1916a;
        } else {
            if (objK instanceof V) {
                throw new IllegalStateException(("Cannot be cancelling child in this state: " + objK).toString());
            }
            thB = null;
        }
        CancellationException c0Var = thB instanceof CancellationException ? (CancellationException) thB : null;
        if (c0Var == null) {
            c0Var = new c0("Parent job is ".concat(b0(objK)), thB, k0Var);
        }
        return c0Var;
    }

    public final Object E(i0 i0Var, Object obj) throws IllegalAccessException, InvocationTargetException {
        Object obj2 = null;
        Throwable c0Var = null;
        r rVar = obj instanceof r ? (r) obj : null;
        Throwable th = rVar != null ? rVar.f1916a : null;
        synchronized (i0Var) {
            i0Var.d();
            ArrayList<Throwable> arrayListG = i0Var.g(th);
            if (!arrayListG.isEmpty()) {
                Iterator it = arrayListG.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    Object next = it.next();
                    if (!(((Throwable) next) instanceof CancellationException)) {
                        obj2 = next;
                        break;
                    }
                }
                c0Var = (Throwable) obj2;
                if (c0Var == null) {
                    c0Var = (Throwable) arrayListG.get(0);
                }
            } else if (i0Var.d()) {
                c0Var = new c0(A(), null, this);
            }
            if (c0Var != null && arrayListG.size() > 1) {
                Set setNewSetFromMap = Collections.newSetFromMap(new IdentityHashMap(arrayListG.size()));
                for (Throwable th2 : arrayListG) {
                    if (th2 != c0Var && th2 != c0Var && !(th2 instanceof CancellationException) && setNewSetFromMap.add(th2)) {
                        AbstractC1305a.b(c0Var, th2);
                    }
                }
            }
        }
        if (c0Var != null && c0Var != th) {
            obj = new r(c0Var, false);
        }
        if (c0Var != null && (z(c0Var) || L(c0Var))) {
            AbstractC1305a.m(obj, "null cannot be cast to non-null type kotlinx.coroutines.CompletedExceptionally");
            r.f1915b.compareAndSet((r) obj, 0, 1);
        }
        X(obj);
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f1905w;
        Object w5 = obj instanceof V ? new W((V) obj) : obj;
        while (!atomicReferenceFieldUpdater.compareAndSet(this, i0Var, w5) && atomicReferenceFieldUpdater.get(this) == i0Var) {
        }
        C(i0Var, obj);
        return obj;
    }

    public final CancellationException F() {
        CancellationException cancellationException;
        Object objK = K();
        if (!(objK instanceof i0)) {
            if (objK instanceof V) {
                throw new IllegalStateException(("Job is still new or active: " + this).toString());
            }
            if (!(objK instanceof r)) {
                return new c0(getClass().getSimpleName().concat(" has completed normally"), null, this);
            }
            Throwable th = ((r) objK).f1916a;
            cancellationException = th instanceof CancellationException ? (CancellationException) th : null;
            return cancellationException == null ? new c0(A(), th, this) : cancellationException;
        }
        Throwable thB = ((i0) objK).b();
        if (thB == null) {
            throw new IllegalStateException(("Job is still new or active: " + this).toString());
        }
        String strConcat = getClass().getSimpleName().concat(" is cancelling");
        cancellationException = thB instanceof CancellationException ? (CancellationException) thB : null;
        if (cancellationException != null) {
            return cancellationException;
        }
        if (strConcat == null) {
            strConcat = A();
        }
        return new c0(strConcat, thB, this);
    }

    public final Object G() throws Throwable {
        Object objK = K();
        if (!(!(objK instanceof V))) {
            throw new IllegalStateException("This job has not completed yet".toString());
        }
        if (objK instanceof r) {
            throw ((r) objK).f1916a;
        }
        return B.t(objK);
    }

    public boolean H() {
        return true;
    }

    public boolean I() {
        return this instanceof C0070o;
    }

    public final n0 J(V v5) {
        n0 n0VarE = v5.e();
        if (n0VarE != null) {
            return n0VarE;
        }
        if (v5 instanceof L) {
            return new n0();
        }
        if (v5 instanceof f0) {
            Z((f0) v5);
            return null;
        }
        throw new IllegalStateException(("State should have list: " + v5).toString());
    }

    public final Object K() {
        while (true) {
            Object obj = f1905w.get(this);
            if (!(obj instanceof R4.q)) {
                return obj;
            }
            ((R4.q) obj).a(this);
        }
    }

    public boolean L(Throwable th) {
        return false;
    }

    public final void N(b0 b0Var) {
        int iA0;
        o0 o0Var = o0.f1909w;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f1906x;
        if (b0Var == null) {
            atomicReferenceFieldUpdater.set(this, o0Var);
            return;
        }
        k0 k0Var = (k0) b0Var;
        do {
            iA0 = k0Var.a0(k0Var.K());
            if (iA0 == 0) {
                break;
            }
        } while (iA0 != 1);
        InterfaceC0066k interfaceC0066k = (InterfaceC0066k) S3.a.z(k0Var, true, new C0067l(this), 2);
        atomicReferenceFieldUpdater.set(this, interfaceC0066k);
        if (!(K() instanceof V)) {
            interfaceC0066k.a();
            atomicReferenceFieldUpdater.set(this, o0Var);
        }
    }

    public final K O(C4.l lVar) {
        return P(false, true, new X(lVar));
    }

    /* JADX WARN: Removed duplicated region for block: B:75:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x00b6 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final M4.K P(boolean r8, boolean r9, M4.Y r10) {
        /*
            Method dump skipped, instruction units count: 215
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: M4.k0.P(boolean, boolean, M4.Y):M4.K");
    }

    public boolean Q() {
        return this instanceof C0058c;
    }

    public final Object R(x4.c cVar) {
        Object objK;
        C1316l c1316l;
        do {
            objK = K();
            boolean z5 = objK instanceof V;
            c1316l = C1316l.f12640a;
            if (!z5) {
                S3.a.o(cVar.i());
                return c1316l;
            }
        } while (a0(objK) < 0);
        C0063h c0063h = new C0063h(1, AbstractC1305a.H(cVar));
        c0063h.v();
        S3.a.y(c0063h, new C0060e(2, S3.a.z(this, false, new a0(2, c0063h), 3)));
        Object objU = c0063h.u();
        EnumC1481a enumC1481a = EnumC1481a.f13592w;
        if (objU != enumC1481a) {
            objU = c1316l;
        }
        return objU == enumC1481a ? objU : c1316l;
    }

    public final boolean S(Object obj) throws IllegalAccessException, InvocationTargetException {
        Object objC0;
        do {
            objC0 = c0(K(), obj);
            if (objC0 == B.f1839d) {
                return false;
            }
            if (objC0 == B.f1840e) {
                return true;
            }
        } while (objC0 == B.f1841f);
        v(objC0);
        return true;
    }

    public final Object T(Object obj) throws IllegalAccessException, InvocationTargetException {
        Object objC0;
        do {
            objC0 = c0(K(), obj);
            if (objC0 == B.f1839d) {
                String str = "Job " + this + " is already complete or completing, but is being completed with " + obj;
                r rVar = obj instanceof r ? (r) obj : null;
                throw new IllegalStateException(str, rVar != null ? rVar.f1916a : null);
            }
        } while (objC0 == B.f1841f);
        return objC0;
    }

    public String U() {
        return getClass().getSimpleName();
    }

    public final void W(n0 n0Var, Throwable th) throws IllegalAccessException, InvocationTargetException {
        Object objH = n0Var.h();
        AbstractC1305a.m(objH, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode{ kotlinx.coroutines.internal.LockFreeLinkedListKt.Node }");
        C0733A c0733a = null;
        for (R4.k kVarI = (R4.k) objH; !AbstractC1305a.c(kVarI, n0Var); kVarI = kVarI.i()) {
            if (kVarI instanceof d0) {
                f0 f0Var = (f0) kVarI;
                try {
                    f0Var.d(th);
                } catch (Throwable th2) {
                    if (c0733a != null) {
                        AbstractC1305a.b(c0733a, th2);
                    } else {
                        c0733a = new C0733A("Exception in completion handler " + f0Var + " for " + this, th2);
                    }
                }
            }
        }
        if (c0733a != null) {
            M(c0733a);
        }
        z(th);
    }

    public final void Z(f0 f0Var) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        n0 n0Var = new n0();
        f0Var.getClass();
        R4.k.f3026x.set(n0Var, f0Var);
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = R4.k.f3025w;
        atomicReferenceFieldUpdater2.set(n0Var, f0Var);
        loop0: while (true) {
            if (f0Var.h() == f0Var) {
                while (!atomicReferenceFieldUpdater2.compareAndSet(f0Var, f0Var, n0Var)) {
                    if (atomicReferenceFieldUpdater2.get(f0Var) != f0Var) {
                        break;
                    }
                }
                n0Var.g(f0Var);
                break loop0;
            }
            break;
        }
        R4.k kVarI = f0Var.i();
        do {
            atomicReferenceFieldUpdater = f1905w;
            if (atomicReferenceFieldUpdater.compareAndSet(this, f0Var, kVarI)) {
                return;
            }
        } while (atomicReferenceFieldUpdater.get(this) == f0Var);
    }

    public final int a0(Object obj) {
        boolean z5 = obj instanceof L;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f1905w;
        if (z5) {
            if (((L) obj).f1853w) {
                return 0;
            }
            L l5 = B.f1845j;
            while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, l5)) {
                if (atomicReferenceFieldUpdater.get(this) != obj) {
                    return -1;
                }
            }
            Y();
            return 1;
        }
        if (!(obj instanceof U)) {
            return 0;
        }
        n0 n0Var = ((U) obj).f1867w;
        while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, n0Var)) {
            if (atomicReferenceFieldUpdater.get(this) != obj) {
                return -1;
            }
        }
        Y();
        return 1;
    }

    @Override // M4.b0
    public void b(CancellationException cancellationException) throws IllegalAccessException, InvocationTargetException {
        if (cancellationException == null) {
            cancellationException = new c0(A(), null, this);
        }
        y(cancellationException);
    }

    @Override // M4.b0
    public boolean c() {
        Object objK = K();
        return (objK instanceof V) && ((V) objK).c();
    }

    public final Object c0(Object obj, Object obj2) throws IllegalAccessException, InvocationTargetException {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        if (!(obj instanceof V)) {
            return B.f1839d;
        }
        if (((obj instanceof L) || (obj instanceof f0)) && !(obj instanceof C0067l) && !(obj2 instanceof r)) {
            V v5 = (V) obj;
            Object w5 = obj2 instanceof V ? new W((V) obj2) : obj2;
            do {
                atomicReferenceFieldUpdater = f1905w;
                if (atomicReferenceFieldUpdater.compareAndSet(this, v5, w5)) {
                    X(obj2);
                    C(v5, obj2);
                    return obj2;
                }
            } while (atomicReferenceFieldUpdater.get(this) == v5);
            return B.f1841f;
        }
        V v6 = (V) obj;
        n0 n0VarJ = J(v6);
        if (n0VarJ == null) {
            return B.f1841f;
        }
        C0067l c0067lV = null;
        i0 i0Var = v6 instanceof i0 ? (i0) v6 : null;
        if (i0Var == null) {
            i0Var = new i0(n0VarJ, null);
        }
        synchronized (i0Var) {
            try {
                if (i0Var.f()) {
                    return B.f1839d;
                }
                i0.f1896x.set(i0Var, 1);
                if (i0Var != v6) {
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = f1905w;
                    while (!atomicReferenceFieldUpdater2.compareAndSet(this, v6, i0Var)) {
                        if (atomicReferenceFieldUpdater2.get(this) != v6) {
                            return B.f1841f;
                        }
                    }
                }
                boolean zD = i0Var.d();
                r rVar = obj2 instanceof r ? (r) obj2 : null;
                if (rVar != null) {
                    i0Var.a(rVar.f1916a);
                }
                Throwable thB = i0Var.b();
                if (!(!zD)) {
                    thB = null;
                }
                if (thB != null) {
                    W(n0VarJ, thB);
                }
                C0067l c0067l = v6 instanceof C0067l ? (C0067l) v6 : null;
                if (c0067l == null) {
                    n0 n0VarE = v6.e();
                    if (n0VarE != null) {
                        c0067lV = V(n0VarE);
                    }
                } else {
                    c0067lV = c0067l;
                }
                if (c0067lV != null) {
                    while (S3.a.z(c0067lV.f1907A, false, new h0(this, i0Var, c0067lV, obj2), 1) == o0.f1909w) {
                        c0067lV = V(c0067lV);
                        if (c0067lV == null) {
                        }
                    }
                    return B.f1840e;
                }
                return E(i0Var, obj2);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // v4.InterfaceC1432j
    public final Object g(Object obj, C4.p pVar) {
        return pVar.h(obj, this);
    }

    @Override // v4.InterfaceC1430h
    public final InterfaceC1431i getKey() {
        return C0078x.f1930x;
    }

    public Object h() {
        return G();
    }

    @Override // v4.InterfaceC1432j
    public final InterfaceC1432j k(InterfaceC1432j interfaceC1432j) {
        return AbstractC1305a.Q(this, interfaceC1432j);
    }

    @Override // v4.InterfaceC1432j
    public final InterfaceC1432j l(InterfaceC1431i interfaceC1431i) {
        return AbstractC1305a.N(this, interfaceC1431i);
    }

    @Override // v4.InterfaceC1432j
    public final InterfaceC1430h n(InterfaceC1431i interfaceC1431i) {
        return AbstractC1305a.C(this, interfaceC1431i);
    }

    public final boolean t(Object obj, n0 n0Var, f0 f0Var) {
        char c6;
        j0 j0Var = new j0(f0Var, this, obj);
        do {
            R4.k kVarF = n0Var.f();
            if (kVarF == null) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = R4.k.f3026x;
                Object obj2 = atomicReferenceFieldUpdater.get(n0Var);
                while (true) {
                    kVarF = (R4.k) obj2;
                    if (!kVarF.j()) {
                        break;
                    }
                    obj2 = atomicReferenceFieldUpdater.get(kVarF);
                }
            }
            R4.k.f3026x.set(f0Var, kVarF);
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = R4.k.f3025w;
            atomicReferenceFieldUpdater2.set(f0Var, n0Var);
            j0Var.f1902c = n0Var;
            while (true) {
                if (atomicReferenceFieldUpdater2.compareAndSet(kVarF, n0Var, j0Var)) {
                    c6 = j0Var.a(kVarF) == null ? (char) 1 : (char) 2;
                } else if (atomicReferenceFieldUpdater2.get(kVarF) != n0Var) {
                    c6 = 0;
                    break;
                }
            }
            if (c6 == 1) {
                return true;
            }
        } while (c6 != 2);
        return false;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(U() + '{' + b0(K()) + '}');
        sb.append('@');
        sb.append(B.d(this));
        return sb.toString();
    }

    public void w(Object obj) {
        v(obj);
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x0058, code lost:
    
        r0 = r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0087, code lost:
    
        r10 = M4.B.f1839d;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean x(java.lang.Object r10) throws java.lang.IllegalAccessException, java.lang.reflect.InvocationTargetException {
        /*
            Method dump skipped, instruction units count: 258
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: M4.k0.x(java.lang.Object):boolean");
    }

    public void y(CancellationException cancellationException) throws IllegalAccessException, InvocationTargetException {
        x(cancellationException);
    }

    public final boolean z(Throwable th) {
        if (Q()) {
            return true;
        }
        boolean z5 = th instanceof CancellationException;
        InterfaceC0066k interfaceC0066k = (InterfaceC0066k) f1906x.get(this);
        return (interfaceC0066k == null || interfaceC0066k == o0.f1909w) ? z5 : interfaceC0066k.b(th) || z5;
    }

    public void Y() {
    }

    public void M(C0733A c0733a) {
        throw c0733a;
    }

    public void X(Object obj) {
    }

    public void v(Object obj) {
    }
}
