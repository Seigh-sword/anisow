package R4;

import j3.C0848A;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: loaded from: classes.dex */
public abstract class b extends q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f3007a = AtomicReferenceFieldUpdater.newUpdater(b.class, Object.class, "_consensus$volatile");
    private volatile /* synthetic */ Object _consensus$volatile = a.f3001a;

    @Override // R4.q
    public final Object a(Object obj) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f3007a;
        Object obj2 = atomicReferenceFieldUpdater.get(this);
        C0848A c0848a = a.f3001a;
        if (obj2 == c0848a) {
            C0848A c0848aC = c(obj);
            obj2 = atomicReferenceFieldUpdater.get(this);
            if (obj2 == c0848a) {
                while (true) {
                    if (atomicReferenceFieldUpdater.compareAndSet(this, c0848a, c0848aC)) {
                        obj2 = c0848aC;
                        break;
                    }
                    if (atomicReferenceFieldUpdater.get(this) != c0848a) {
                        obj2 = atomicReferenceFieldUpdater.get(this);
                        break;
                    }
                }
            }
        }
        b(obj, obj2);
        return obj2;
    }

    public abstract void b(Object obj, Object obj2);

    public abstract C0848A c(Object obj);
}
