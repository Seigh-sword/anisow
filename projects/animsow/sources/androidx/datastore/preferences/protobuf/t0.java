package androidx.datastore.preferences.protobuf;

import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class t0 {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final t0 f5516f = new t0(0, new int[0], new Object[0], false);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f5517a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int[] f5518b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object[] f5519c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f5520d = -1;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f5521e;

    public t0(int i6, int[] iArr, Object[] objArr, boolean z5) {
        this.f5517a = i6;
        this.f5518b = iArr;
        this.f5519c = objArr;
        this.f5521e = z5;
    }

    public final void a(int i6) {
        int[] iArr = this.f5518b;
        if (i6 > iArr.length) {
            int i7 = this.f5517a;
            int i8 = (i7 / 2) + i7;
            if (i8 >= i6) {
                i6 = i8;
            }
            if (i6 < 8) {
                i6 = 8;
            }
            this.f5518b = Arrays.copyOf(iArr, i6);
            this.f5519c = Arrays.copyOf(this.f5519c, i6);
        }
    }

    public final int b() {
        int iY;
        int i6 = this.f5520d;
        if (i6 != -1) {
            return i6;
        }
        int iB = 0;
        for (int i7 = 0; i7 < this.f5517a; i7++) {
            int i8 = this.f5518b[i7];
            int i9 = i8 >>> 3;
            int i10 = i8 & 7;
            if (i10 == 0) {
                iY = AbstractC0292q.y(i9, ((Long) this.f5519c[i7]).longValue());
            } else if (i10 == 1) {
                ((Long) this.f5519c[i7]).getClass();
                iY = AbstractC0292q.j(i9);
            } else if (i10 == 2) {
                iY = AbstractC0292q.e(i9, (AbstractC0280i) this.f5519c[i7]);
            } else if (i10 == 3) {
                iB = ((t0) this.f5519c[i7]).b() + (AbstractC0292q.v(i9) * 2) + iB;
            } else {
                if (i10 != 5) {
                    throw new IllegalStateException(H.b());
                }
                ((Integer) this.f5519c[i7]).getClass();
                iY = AbstractC0292q.i(i9);
            }
            iB = iY + iB;
        }
        this.f5520d = iB;
        return iB;
    }

    public final void c(int i6, Object obj) {
        if (!this.f5521e) {
            throw new UnsupportedOperationException();
        }
        a(this.f5517a + 1);
        int[] iArr = this.f5518b;
        int i7 = this.f5517a;
        iArr[i7] = i6;
        this.f5519c[i7] = obj;
        this.f5517a = i7 + 1;
    }

    public final void d(L3.c cVar) {
        if (this.f5517a == 0) {
            return;
        }
        cVar.getClass();
        for (int i6 = 0; i6 < this.f5517a; i6++) {
            int i7 = this.f5518b[i6];
            Object obj = this.f5519c[i6];
            int i8 = i7 >>> 3;
            int i9 = i7 & 7;
            if (i9 == 0) {
                cVar.z(i8, ((Long) obj).longValue());
            } else if (i9 == 1) {
                cVar.v(i8, ((Long) obj).longValue());
            } else if (i9 == 2) {
                cVar.n(i8, (AbstractC0280i) obj);
            } else if (i9 == 3) {
                ((AbstractC0292q) cVar.f1734x).Q(i8, 3);
                ((t0) obj).d(cVar);
                ((AbstractC0292q) cVar.f1734x).Q(i8, 4);
            } else {
                if (i9 != 5) {
                    throw new RuntimeException(H.b());
                }
                cVar.u(i8, ((Integer) obj).intValue());
            }
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof t0)) {
            return false;
        }
        t0 t0Var = (t0) obj;
        int i6 = this.f5517a;
        if (i6 == t0Var.f5517a) {
            int[] iArr = this.f5518b;
            int[] iArr2 = t0Var.f5518b;
            int i7 = 0;
            while (true) {
                if (i7 >= i6) {
                    Object[] objArr = this.f5519c;
                    Object[] objArr2 = t0Var.f5519c;
                    int i8 = this.f5517a;
                    for (int i9 = 0; i9 < i8; i9++) {
                        if (objArr[i9].equals(objArr2[i9])) {
                        }
                    }
                    return true;
                }
                if (iArr[i7] != iArr2[i7]) {
                    break;
                }
                i7++;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i6 = this.f5517a;
        int i7 = (527 + i6) * 31;
        int[] iArr = this.f5518b;
        int iHashCode = 17;
        int i8 = 17;
        for (int i9 = 0; i9 < i6; i9++) {
            i8 = (i8 * 31) + iArr[i9];
        }
        int i10 = (i7 + i8) * 31;
        Object[] objArr = this.f5519c;
        int i11 = this.f5517a;
        for (int i12 = 0; i12 < i11; i12++) {
            iHashCode = (iHashCode * 31) + objArr[i12].hashCode();
        }
        return i10 + iHashCode;
    }
}
