package M4;

import j3.C0848A;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import s4.AbstractC1305a;

/* JADX INFO: loaded from: classes.dex */
public final class j0 extends R4.b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final R4.k f1901b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public R4.k f1902c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ k0 f1903d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f1904e;

    public j0(R4.k kVar, k0 k0Var, Object obj) {
        this.f1903d = k0Var;
        this.f1904e = obj;
        this.f1901b = kVar;
    }

    @Override // R4.b
    public final void b(Object obj, Object obj2) {
        R4.k kVar = (R4.k) obj;
        boolean z5 = obj2 == null;
        R4.k kVar2 = this.f1901b;
        R4.k kVar3 = z5 ? kVar2 : this.f1902c;
        if (kVar3 != null) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = R4.k.f3025w;
            while (!atomicReferenceFieldUpdater.compareAndSet(kVar, this, kVar3)) {
                if (atomicReferenceFieldUpdater.get(kVar) != this) {
                    return;
                }
            }
            if (z5) {
                R4.k kVar4 = this.f1902c;
                AbstractC1305a.l(kVar4);
                kVar2.g(kVar4);
            }
        }
    }

    @Override // R4.b
    public final C0848A c(Object obj) {
        if (this.f1903d.K() == this.f1904e) {
            return null;
        }
        return R4.a.f3005e;
    }
}
