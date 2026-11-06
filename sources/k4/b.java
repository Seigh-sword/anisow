package K4;

import java.util.Iterator;
import java.util.NoSuchElementException;
import s4.AbstractC1305a;

/* JADX INFO: loaded from: classes.dex */
public final class b implements Iterator, E4.a {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public int f1638A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public final /* synthetic */ c f1639B;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f1640w = -1;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f1641x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f1642y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public H4.c f1643z;

    public b(c cVar) {
        this.f1639B = cVar;
        int i6 = cVar.f1645b;
        int length = cVar.f1644a.length();
        if (length < 0) {
            throw new IllegalArgumentException(H1.a.j("Cannot coerce value to an empty range: maximum ", length, " is less than minimum 0."));
        }
        if (i6 < 0) {
            i6 = 0;
        } else if (i6 > length) {
            i6 = length;
        }
        this.f1641x = i6;
        this.f1642y = i6;
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x001a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void a() {
        /*
            r7 = this;
            int r0 = r7.f1642y
            r1 = 0
            if (r0 >= 0) goto Lb
            r7.f1640w = r1
            r0 = 0
            r7.f1643z = r0
            goto L77
        Lb:
            K4.c r2 = r7.f1639B
            int r3 = r2.f1646c
            r4 = -1
            r5 = 1
            if (r3 <= 0) goto L1a
            int r6 = r7.f1638A
            int r6 = r6 + r5
            r7.f1638A = r6
            if (r6 >= r3) goto L22
        L1a:
            java.lang.CharSequence r3 = r2.f1644a
            int r3 = r3.length()
            if (r0 <= r3) goto L34
        L22:
            H4.c r0 = new H4.c
            int r1 = r7.f1641x
            java.lang.CharSequence r2 = r2.f1644a
            int r2 = K4.h.Y(r2)
            r0.<init>(r1, r2, r5)
        L2f:
            r7.f1643z = r0
            r7.f1642y = r4
            goto L75
        L34:
            C4.p r0 = r2.f1647d
            java.lang.CharSequence r3 = r2.f1644a
            int r6 = r7.f1642y
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            java.lang.Object r0 = r0.h(r3, r6)
            s4.g r0 = (s4.C1311g) r0
            if (r0 != 0) goto L54
            H4.c r0 = new H4.c
            int r1 = r7.f1641x
            java.lang.CharSequence r2 = r2.f1644a
            int r2 = K4.h.Y(r2)
            r0.<init>(r1, r2, r5)
            goto L2f
        L54:
            java.lang.Object r2 = r0.f12632w
            java.lang.Number r2 = (java.lang.Number) r2
            int r2 = r2.intValue()
            java.lang.Object r0 = r0.f12633x
            java.lang.Number r0 = (java.lang.Number) r0
            int r0 = r0.intValue()
            int r3 = r7.f1641x
            H4.c r3 = S3.a.T(r3, r2)
            r7.f1643z = r3
            int r2 = r2 + r0
            r7.f1641x = r2
            if (r0 != 0) goto L72
            r1 = r5
        L72:
            int r2 = r2 + r1
            r7.f1642y = r2
        L75:
            r7.f1640w = r5
        L77:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: K4.b.a():void");
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.f1640w == -1) {
            a();
        }
        return this.f1640w == 1;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (this.f1640w == -1) {
            a();
        }
        if (this.f1640w == 0) {
            throw new NoSuchElementException();
        }
        H4.c cVar = this.f1643z;
        AbstractC1305a.m(cVar, "null cannot be cast to non-null type kotlin.ranges.IntRange");
        this.f1643z = null;
        this.f1640w = -1;
        return cVar;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
