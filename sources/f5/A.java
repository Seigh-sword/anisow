package f5;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes.dex */
public abstract class A {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final z f8427a = new z(new byte[0], 0, 0, false);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f8428b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final AtomicReference[] f8429c;

    static {
        int iHighestOneBit = Integer.highestOneBit((Runtime.getRuntime().availableProcessors() * 2) - 1);
        f8428b = iHighestOneBit;
        AtomicReference[] atomicReferenceArr = new AtomicReference[iHighestOneBit];
        for (int i6 = 0; i6 < iHighestOneBit; i6++) {
            atomicReferenceArr[i6] = new AtomicReference();
        }
        f8429c = atomicReferenceArr;
    }

    public static final void a(z zVar) {
        if (zVar.f8505f != null || zVar.f8506g != null) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
        if (zVar.f8503d) {
            return;
        }
        AtomicReference atomicReference = f8429c[(int) (Thread.currentThread().getId() & (((long) f8428b) - 1))];
        z zVar2 = f8427a;
        z zVar3 = (z) atomicReference.getAndSet(zVar2);
        if (zVar3 == zVar2) {
            return;
        }
        int i6 = zVar3 != null ? zVar3.f8502c : 0;
        if (i6 >= 65536) {
            atomicReference.set(zVar3);
            return;
        }
        zVar.f8505f = zVar3;
        zVar.f8501b = 0;
        zVar.f8502c = i6 + 8192;
        atomicReference.set(zVar);
    }

    public static final z b() {
        AtomicReference atomicReference = f8429c[(int) (Thread.currentThread().getId() & (((long) f8428b) - 1))];
        z zVar = f8427a;
        z zVar2 = (z) atomicReference.getAndSet(zVar);
        if (zVar2 == zVar) {
            return new z();
        }
        if (zVar2 == null) {
            atomicReference.set(null);
            return new z();
        }
        atomicReference.set(zVar2.f8505f);
        zVar2.f8505f = null;
        zVar2.f8502c = 0;
        return zVar2;
    }
}
