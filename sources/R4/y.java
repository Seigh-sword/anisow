package R4;

import M4.N;
import M4.O;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import s4.AbstractC1305a;

/* JADX INFO: loaded from: classes.dex */
public class y {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f3048b = AtomicIntegerFieldUpdater.newUpdater(y.class, "_size$volatile");
    private volatile /* synthetic */ int _size$volatile;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public N[] f3049a;

    public final void a(N n5) {
        n5.e((O) this);
        N[] nArr = this.f3049a;
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f3048b;
        if (nArr == null) {
            nArr = new N[4];
            this.f3049a = nArr;
        } else if (atomicIntegerFieldUpdater.get(this) >= nArr.length) {
            Object[] objArrCopyOf = Arrays.copyOf(nArr, atomicIntegerFieldUpdater.get(this) * 2);
            AbstractC1305a.n(objArrCopyOf, "copyOf(...)");
            nArr = (N[]) objArrCopyOf;
            this.f3049a = nArr;
        }
        int i6 = atomicIntegerFieldUpdater.get(this);
        atomicIntegerFieldUpdater.set(this, i6 + 1);
        nArr[i6] = n5;
        n5.f1857x = i6;
        c(i6);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:26:? A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final M4.N b(int r9) {
        /*
            r8 = this;
            M4.N[] r0 = r8.f3049a
            s4.AbstractC1305a.l(r0)
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r1 = R4.y.f3048b
            int r2 = r1.get(r8)
            r3 = -1
            int r2 = r2 + r3
            r1.set(r8, r2)
            int r2 = r1.get(r8)
            if (r9 >= r2) goto L7a
            int r2 = r1.get(r8)
            r8.d(r9, r2)
            int r2 = r9 + (-1)
            int r2 = r2 / 2
            if (r9 <= 0) goto L3a
            r4 = r0[r9]
            s4.AbstractC1305a.l(r4)
            r5 = r0[r2]
            s4.AbstractC1305a.l(r5)
            int r4 = r4.compareTo(r5)
            if (r4 >= 0) goto L3a
            r8.d(r9, r2)
            r8.c(r2)
            goto L7a
        L3a:
            int r2 = r9 * 2
            int r4 = r2 + 1
            int r5 = r1.get(r8)
            if (r4 < r5) goto L45
            goto L7a
        L45:
            M4.N[] r5 = r8.f3049a
            s4.AbstractC1305a.l(r5)
            int r2 = r2 + 2
            int r6 = r1.get(r8)
            if (r2 >= r6) goto L63
            r6 = r5[r2]
            s4.AbstractC1305a.l(r6)
            r7 = r5[r4]
            s4.AbstractC1305a.l(r7)
            int r6 = r6.compareTo(r7)
            if (r6 >= 0) goto L63
            goto L64
        L63:
            r2 = r4
        L64:
            r4 = r5[r9]
            s4.AbstractC1305a.l(r4)
            r5 = r5[r2]
            s4.AbstractC1305a.l(r5)
            int r4 = r4.compareTo(r5)
            if (r4 > 0) goto L75
            goto L7a
        L75:
            r8.d(r9, r2)
            r9 = r2
            goto L3a
        L7a:
            int r9 = r1.get(r8)
            r9 = r0[r9]
            s4.AbstractC1305a.l(r9)
            r2 = 0
            r9.e(r2)
            r9.f1857x = r3
            int r1 = r1.get(r8)
            r0[r1] = r2
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: R4.y.b(int):M4.N");
    }

    public final void c(int i6) {
        while (i6 > 0) {
            N[] nArr = this.f3049a;
            AbstractC1305a.l(nArr);
            int i7 = (i6 - 1) / 2;
            N n5 = nArr[i7];
            AbstractC1305a.l(n5);
            N n6 = nArr[i6];
            AbstractC1305a.l(n6);
            if (n5.compareTo(n6) <= 0) {
                return;
            }
            d(i6, i7);
            i6 = i7;
        }
    }

    public final void d(int i6, int i7) {
        N[] nArr = this.f3049a;
        AbstractC1305a.l(nArr);
        N n5 = nArr[i7];
        AbstractC1305a.l(n5);
        N n6 = nArr[i6];
        AbstractC1305a.l(n6);
        nArr[i6] = n5;
        nArr[i7] = n6;
        n5.f1857x = i6;
        n6.f1857x = i7;
    }
}
