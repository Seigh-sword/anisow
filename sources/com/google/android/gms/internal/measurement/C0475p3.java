package com.google.android.gms.internal.measurement;

import java.util.Arrays;
import p1.C1243i;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.p3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0475p3 {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final C0475p3 f6922f = new C0475p3(0, new int[0], new Object[0], false);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f6923a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int[] f6924b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object[] f6925c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f6926d = -1;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f6927e;

    public C0475p3(int i6, int[] iArr, Object[] objArr, boolean z5) {
        this.f6923a = i6;
        this.f6924b = iArr;
        this.f6925c = objArr;
        this.f6927e = z5;
    }

    public static void d(int i6, Object obj, C1243i c1243i) {
        int i7 = i6 >>> 3;
        int i8 = i6 & 7;
        if (i8 == 0) {
            c1243i.F(i7, ((Long) obj).longValue());
            return;
        }
        if (i8 == 1) {
            c1243i.v(i7, ((Long) obj).longValue());
            return;
        }
        if (i8 == 2) {
            c1243i.w(i7, (AbstractC0527y2) obj);
            return;
        }
        if (i8 != 3) {
            if (i8 == 5) {
                c1243i.E(i7, ((Integer) obj).intValue());
                return;
            } else {
                int i9 = Q2.f6665w;
                throw new RuntimeException(new T2("Protocol message tag had invalid wire type."));
            }
        }
        if (c1243i.C() == 1) {
            ((A2) c1243i.f12254x).w(i7, 3);
            ((C0475p3) obj).e(c1243i);
            ((A2) c1243i.f12254x).w(i7, 4);
        } else {
            ((A2) c1243i.f12254x).w(i7, 4);
            ((C0475p3) obj).e(c1243i);
            ((A2) c1243i.f12254x).w(i7, 3);
        }
    }

    public static C0475p3 f() {
        return new C0475p3(0, new int[8], new Object[8], true);
    }

    public final int a() {
        int iF;
        int i6 = this.f6926d;
        if (i6 != -1) {
            return i6;
        }
        int iA = 0;
        for (int i7 = 0; i7 < this.f6923a; i7++) {
            int i8 = this.f6924b[i7];
            int i9 = i8 >>> 3;
            int i10 = i8 & 7;
            if (i10 == 0) {
                iF = A2.F(i9, ((Long) this.f6925c[i7]).longValue());
            } else if (i10 == 1) {
                ((Long) this.f6925c[i7]).getClass();
                iF = A2.t(i9);
            } else if (i10 == 2) {
                iF = A2.u(i9, (AbstractC0527y2) this.f6925c[i7]);
            } else if (i10 == 3) {
                iA = ((C0475p3) this.f6925c[i7]).a() + (A2.I(i9) << 1) + iA;
            } else {
                if (i10 != 5) {
                    int i11 = Q2.f6665w;
                    throw new IllegalStateException(new T2("Protocol message tag had invalid wire type."));
                }
                ((Integer) this.f6925c[i7]).getClass();
                iF = A2.C(i9);
            }
            iA = iF + iA;
        }
        this.f6926d = iA;
        return iA;
    }

    public final void b(int i6) {
        int[] iArr = this.f6924b;
        if (i6 > iArr.length) {
            int i7 = this.f6923a;
            int i8 = (i7 / 2) + i7;
            if (i8 >= i6) {
                i6 = i8;
            }
            if (i6 < 8) {
                i6 = 8;
            }
            this.f6924b = Arrays.copyOf(iArr, i6);
            this.f6925c = Arrays.copyOf(this.f6925c, i6);
        }
    }

    public final void c(int i6, Object obj) {
        if (!this.f6927e) {
            throw new UnsupportedOperationException();
        }
        b(this.f6923a + 1);
        int[] iArr = this.f6924b;
        int i7 = this.f6923a;
        iArr[i7] = i6;
        this.f6925c[i7] = obj;
        this.f6923a = i7 + 1;
    }

    public final void e(C1243i c1243i) {
        if (this.f6923a == 0) {
            return;
        }
        if (c1243i.C() == 1) {
            for (int i6 = 0; i6 < this.f6923a; i6++) {
                d(this.f6924b[i6], this.f6925c[i6], c1243i);
            }
            return;
        }
        for (int i7 = this.f6923a - 1; i7 >= 0; i7--) {
            d(this.f6924b[i7], this.f6925c[i7], c1243i);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof C0475p3)) {
            return false;
        }
        C0475p3 c0475p3 = (C0475p3) obj;
        int i6 = this.f6923a;
        if (i6 == c0475p3.f6923a) {
            int[] iArr = this.f6924b;
            int[] iArr2 = c0475p3.f6924b;
            int i7 = 0;
            while (true) {
                if (i7 >= i6) {
                    Object[] objArr = this.f6925c;
                    Object[] objArr2 = c0475p3.f6925c;
                    int i8 = this.f6923a;
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
        int i6 = this.f6923a;
        int i7 = (i6 + 527) * 31;
        int[] iArr = this.f6924b;
        int iHashCode = 17;
        int i8 = 17;
        for (int i9 = 0; i9 < i6; i9++) {
            i8 = (i8 * 31) + iArr[i9];
        }
        int i10 = (i7 + i8) * 31;
        Object[] objArr = this.f6925c;
        int i11 = this.f6923a;
        for (int i12 = 0; i12 < i11; i12++) {
            iHashCode = (iHashCode * 31) + objArr[i12].hashCode();
        }
        return i10 + iHashCode;
    }
}
