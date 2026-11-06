package T0;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: loaded from: classes.dex */
public final class d extends com.bumptech.glide.c {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public final AtomicReferenceFieldUpdater f3385A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public final AtomicReferenceFieldUpdater f3386B;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final AtomicReferenceFieldUpdater f3387x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final AtomicReferenceFieldUpdater f3388y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final AtomicReferenceFieldUpdater f3389z;

    public d(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater3, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater4, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater5) {
        this.f3387x = atomicReferenceFieldUpdater;
        this.f3388y = atomicReferenceFieldUpdater2;
        this.f3389z = atomicReferenceFieldUpdater3;
        this.f3385A = atomicReferenceFieldUpdater4;
        this.f3386B = atomicReferenceFieldUpdater5;
    }

    @Override // com.bumptech.glide.c
    public final void J(f fVar, f fVar2) {
        this.f3388y.lazySet(fVar, fVar2);
    }

    @Override // com.bumptech.glide.c
    public final void L(f fVar, Thread thread) {
        this.f3387x.lazySet(fVar, thread);
    }

    @Override // com.bumptech.glide.c
    public final boolean h(g gVar, c cVar, c cVar2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = this.f3385A;
            if (atomicReferenceFieldUpdater.compareAndSet(gVar, cVar, cVar2)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(gVar) == cVar);
        return false;
    }

    @Override // com.bumptech.glide.c
    public final boolean j(g gVar, Object obj, Object obj2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = this.f3386B;
            if (atomicReferenceFieldUpdater.compareAndSet(gVar, obj, obj2)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(gVar) == obj);
        return false;
    }

    @Override // com.bumptech.glide.c
    public final boolean l(g gVar, f fVar, f fVar2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = this.f3389z;
            if (atomicReferenceFieldUpdater.compareAndSet(gVar, fVar, fVar2)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(gVar) == fVar);
        return false;
    }
}
