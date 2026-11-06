package R4;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import s4.AbstractC1305a;

/* JADX INFO: loaded from: classes.dex */
public abstract class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f3009a = AtomicReferenceFieldUpdater.newUpdater(d.class, Object.class, "_next$volatile");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f3010b = AtomicReferenceFieldUpdater.newUpdater(d.class, Object.class, "_prev$volatile");
    private volatile /* synthetic */ Object _next$volatile;
    private volatile /* synthetic */ Object _prev$volatile;

    public d(d dVar) {
        this._prev$volatile = dVar;
    }

    public final void a() {
        f3010b.set(this, null);
    }

    public final d b() {
        Object obj = f3009a.get(this);
        if (obj == a.f3002b) {
            return null;
        }
        return (d) obj;
    }

    public abstract boolean c();

    public final void d() {
        d dVarB;
        if (b() == null) {
            return;
        }
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f3010b;
            d dVar = (d) atomicReferenceFieldUpdater.get(this);
            while (dVar != null && dVar.c()) {
                dVar = (d) atomicReferenceFieldUpdater.get(dVar);
            }
            d dVarB2 = b();
            AbstractC1305a.l(dVarB2);
            while (dVarB2.c() && (dVarB = dVarB2.b()) != null) {
                dVarB2 = dVarB;
            }
            while (true) {
                Object obj = atomicReferenceFieldUpdater.get(dVarB2);
                d dVar2 = ((d) obj) == null ? null : dVar;
                while (!atomicReferenceFieldUpdater.compareAndSet(dVarB2, obj, dVar2)) {
                    if (atomicReferenceFieldUpdater.get(dVarB2) != obj) {
                        break;
                    }
                }
            }
            if (dVar != null) {
                f3009a.set(dVar, dVarB2);
            }
            if (!dVarB2.c() || dVarB2.b() == null) {
                if (dVar == null || !dVar.c()) {
                    return;
                }
            }
        }
    }
}
