package R4;

import java.util.concurrent.atomic.AtomicReferenceArray;

/* JADX INFO: loaded from: classes.dex */
public final class s {
    private volatile AtomicReferenceArray<Object> array;

    public s(int i6) {
        this.array = new AtomicReferenceArray<>(i6);
    }

    public final int a() {
        return this.array.length();
    }

    public final Object b(int i6) {
        AtomicReferenceArray<Object> atomicReferenceArray = this.array;
        if (i6 < atomicReferenceArray.length()) {
            return atomicReferenceArray.get(i6);
        }
        return null;
    }

    public final void c(int i6, S4.a aVar) {
        AtomicReferenceArray<Object> atomicReferenceArray = this.array;
        int length = atomicReferenceArray.length();
        if (i6 < length) {
            atomicReferenceArray.set(i6, aVar);
            return;
        }
        int i7 = i6 + 1;
        int i8 = length * 2;
        if (i7 < i8) {
            i7 = i8;
        }
        AtomicReferenceArray<Object> atomicReferenceArray2 = new AtomicReferenceArray<>(i7);
        for (int i9 = 0; i9 < length; i9++) {
            atomicReferenceArray2.set(i9, atomicReferenceArray.get(i9));
        }
        atomicReferenceArray2.set(i6, aVar);
        this.array = atomicReferenceArray2;
    }
}
