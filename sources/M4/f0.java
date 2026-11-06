package M4;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import s4.AbstractC1305a;

/* JADX INFO: loaded from: classes.dex */
public abstract class f0 extends R4.k implements Y, K, V {

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public k0 f1884z;

    @Override // M4.K
    public final void a() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2;
        k0 k0VarK = k();
        while (true) {
            Object objK = k0VarK.K();
            if (objK instanceof f0) {
                if (objK != this) {
                    return;
                }
                L l5 = B.f1845j;
                do {
                    atomicReferenceFieldUpdater2 = k0.f1905w;
                    if (atomicReferenceFieldUpdater2.compareAndSet(k0VarK, objK, l5)) {
                        return;
                    }
                } while (atomicReferenceFieldUpdater2.get(k0VarK) == objK);
            } else {
                if (!(objK instanceof V) || ((V) objK).e() == null) {
                    return;
                }
                while (true) {
                    Object objH = h();
                    if (objH instanceof R4.r) {
                        R4.k kVar = ((R4.r) objH).f3038a;
                        return;
                    }
                    if (objH == this) {
                        return;
                    }
                    AbstractC1305a.m(objH, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode{ kotlinx.coroutines.internal.LockFreeLinkedListKt.Node }");
                    R4.k kVar2 = (R4.k) objH;
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater3 = R4.k.f3027y;
                    R4.r rVar = (R4.r) atomicReferenceFieldUpdater3.get(kVar2);
                    if (rVar == null) {
                        rVar = new R4.r(kVar2);
                        atomicReferenceFieldUpdater3.set(kVar2, rVar);
                    }
                    do {
                        atomicReferenceFieldUpdater = R4.k.f3025w;
                        if (atomicReferenceFieldUpdater.compareAndSet(this, objH, rVar)) {
                            kVar2.f();
                            return;
                        }
                    } while (atomicReferenceFieldUpdater.get(this) == objH);
                }
            }
        }
    }

    @Override // M4.V
    public final boolean c() {
        return true;
    }

    @Override // M4.V
    public final n0 e() {
        return null;
    }

    public b0 getParent() {
        return k();
    }

    public final k0 k() {
        k0 k0Var = this.f1884z;
        if (k0Var != null) {
            return k0Var;
        }
        AbstractC1305a.W("job");
        throw null;
    }

    @Override // R4.k
    public final String toString() {
        return getClass().getSimpleName() + '@' + B.d(this) + "[job@" + B.d(k()) + ']';
    }
}
