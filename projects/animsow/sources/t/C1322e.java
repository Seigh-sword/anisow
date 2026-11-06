package t;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: renamed from: t.e, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1322e extends com.bumptech.glide.c {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public final AtomicReferenceFieldUpdater f12653A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public final AtomicReferenceFieldUpdater f12654B;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final AtomicReferenceFieldUpdater f12655x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final AtomicReferenceFieldUpdater f12656y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final AtomicReferenceFieldUpdater f12657z;

    public C1322e(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater3, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater4, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater5) {
        this.f12655x = atomicReferenceFieldUpdater;
        this.f12656y = atomicReferenceFieldUpdater2;
        this.f12657z = atomicReferenceFieldUpdater3;
        this.f12653A = atomicReferenceFieldUpdater4;
        this.f12654B = atomicReferenceFieldUpdater5;
    }

    @Override // com.bumptech.glide.c
    public final void K(C1323f c1323f, C1323f c1323f2) {
        this.f12656y.lazySet(c1323f, c1323f2);
    }

    @Override // com.bumptech.glide.c
    public final void M(C1323f c1323f, Thread thread) {
        this.f12655x.lazySet(c1323f, thread);
    }

    @Override // com.bumptech.glide.c
    public final boolean i(AbstractC1324g abstractC1324g, C1321d c1321d, C1321d c1321d2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = this.f12653A;
            if (atomicReferenceFieldUpdater.compareAndSet(abstractC1324g, c1321d, c1321d2)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(abstractC1324g) == c1321d);
        return false;
    }

    @Override // com.bumptech.glide.c
    public final boolean k(AbstractC1324g abstractC1324g, Object obj, Object obj2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = this.f12654B;
            if (atomicReferenceFieldUpdater.compareAndSet(abstractC1324g, obj, obj2)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(abstractC1324g) == obj);
        return false;
    }

    @Override // com.bumptech.glide.c
    public final boolean m(AbstractC1324g abstractC1324g, C1323f c1323f, C1323f c1323f2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = this.f12657z;
            if (atomicReferenceFieldUpdater.compareAndSet(abstractC1324g, c1323f, c1323f2)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(abstractC1324g) == c1323f);
        return false;
    }
}
