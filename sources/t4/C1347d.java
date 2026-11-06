package t4;

import java.util.RandomAccess;
import m2.C1017B;
import s4.AbstractC1305a;

/* JADX INFO: renamed from: t4.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1347d extends AbstractC1348e implements RandomAccess {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final AbstractC1348e f12745w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final int f12746x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final int f12747y;

    public C1347d(AbstractC1348e abstractC1348e, int i6, int i7) {
        AbstractC1305a.o(abstractC1348e, "list");
        this.f12745w = abstractC1348e;
        this.f12746x = i6;
        C1017B.l(i6, i7, abstractC1348e.b());
        this.f12747y = i7 - i6;
    }

    @Override // t4.AbstractC1344a
    public final int b() {
        return this.f12747y;
    }

    @Override // java.util.List
    public final Object get(int i6) {
        int i7 = this.f12747y;
        if (i6 < 0 || i6 >= i7) {
            throw new IndexOutOfBoundsException(H1.a.k("index: ", i6, ", size: ", i7));
        }
        return this.f12745w.get(this.f12746x + i6);
    }
}
