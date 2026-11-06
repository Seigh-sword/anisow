package f5;

import d2.AbstractC0651b;
import java.util.Arrays;
import s4.AbstractC1305a;
import t4.AbstractC1353j;

/* JADX INFO: loaded from: classes.dex */
public final class B extends j {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public final transient byte[][] f8430A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public final transient int[] f8431B;

    public B(byte[][] bArr, int[] iArr) {
        super(j.f8462z.f8463w);
        this.f8430A = bArr;
        this.f8431B = iArr;
    }

    @Override // f5.j
    public final String a() {
        throw null;
    }

    @Override // f5.j
    public final int d() {
        return this.f8431B[this.f8430A.length - 1];
    }

    @Override // f5.j
    public final String e() {
        return t().e();
    }

    @Override // f5.j
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof j) {
            j jVar = (j) obj;
            if (jVar.d() == d() && m(0, jVar, d())) {
                return true;
            }
        }
        return false;
    }

    @Override // f5.j
    public final int f(int i6, byte[] bArr) {
        AbstractC1305a.o(bArr, "other");
        return t().f(i6, bArr);
    }

    @Override // f5.j
    public final byte[] h() {
        return s();
    }

    @Override // f5.j
    public final int hashCode() {
        int i6 = this.f8464x;
        if (i6 != 0) {
            return i6;
        }
        byte[][] bArr = this.f8430A;
        int length = bArr.length;
        int i7 = 0;
        int i8 = 1;
        int i9 = 0;
        while (i7 < length) {
            int[] iArr = this.f8431B;
            int i10 = iArr[length + i7];
            int i11 = iArr[i7];
            byte[] bArr2 = bArr[i7];
            int i12 = (i11 - i9) + i10;
            while (i10 < i12) {
                i8 = (i8 * 31) + bArr2[i10];
                i10++;
            }
            i7++;
            i9 = i11;
        }
        this.f8464x = i8;
        return i8;
    }

    @Override // f5.j
    public final byte i(int i6) {
        byte[][] bArr = this.f8430A;
        int length = bArr.length - 1;
        int[] iArr = this.f8431B;
        AbstractC0651b.g(iArr[length], i6, 1L);
        int iE = f2.h.E(this, i6);
        return bArr[iE][(i6 - (iE == 0 ? 0 : iArr[iE - 1])) + iArr[bArr.length + iE]];
    }

    @Override // f5.j
    public final int j(int i6, byte[] bArr) {
        AbstractC1305a.o(bArr, "other");
        return t().j(i6, bArr);
    }

    @Override // f5.j
    public final boolean l(int i6, int i7, int i8, byte[] bArr) {
        AbstractC1305a.o(bArr, "other");
        if (i6 < 0 || i6 > d() - i8 || i7 < 0 || i7 > bArr.length - i8) {
            return false;
        }
        int i9 = i8 + i6;
        int iE = f2.h.E(this, i6);
        while (i6 < i9) {
            int[] iArr = this.f8431B;
            int i10 = iE == 0 ? 0 : iArr[iE - 1];
            int i11 = iArr[iE] - i10;
            byte[][] bArr2 = this.f8430A;
            int i12 = iArr[bArr2.length + iE];
            int iMin = Math.min(i9, i11 + i10) - i6;
            if (!AbstractC0651b.c((i6 - i10) + i12, i7, iMin, bArr2[iE], bArr)) {
                return false;
            }
            i7 += iMin;
            i6 += iMin;
            iE++;
        }
        return true;
    }

    @Override // f5.j
    public final boolean m(int i6, j jVar, int i7) {
        AbstractC1305a.o(jVar, "other");
        if (i6 < 0 || i6 > d() - i7) {
            return false;
        }
        int i8 = i7 + i6;
        int iE = f2.h.E(this, i6);
        int i9 = 0;
        while (i6 < i8) {
            int[] iArr = this.f8431B;
            int i10 = iE == 0 ? 0 : iArr[iE - 1];
            int i11 = iArr[iE] - i10;
            byte[][] bArr = this.f8430A;
            int i12 = iArr[bArr.length + iE];
            int iMin = Math.min(i8, i11 + i10) - i6;
            if (!jVar.l(i9, (i6 - i10) + i12, iMin, bArr[iE])) {
                return false;
            }
            i9 += iMin;
            i6 += iMin;
            iE++;
        }
        return true;
    }

    @Override // f5.j
    public final j n(int i6, int i7) {
        int iY = AbstractC0651b.y(this, i7);
        if (i6 < 0) {
            throw new IllegalArgumentException(H1.a.j("beginIndex=", i6, " < 0").toString());
        }
        if (iY > d()) {
            StringBuilder sbL = H1.a.l("endIndex=", iY, " > length(");
            sbL.append(d());
            sbL.append(')');
            throw new IllegalArgumentException(sbL.toString().toString());
        }
        int i8 = iY - i6;
        if (i8 < 0) {
            throw new IllegalArgumentException(H1.a.k("endIndex=", iY, " < beginIndex=", i6).toString());
        }
        if (i6 == 0 && iY == d()) {
            return this;
        }
        if (i6 == iY) {
            return j.f8462z;
        }
        int iE = f2.h.E(this, i6);
        int iE2 = f2.h.E(this, iY - 1);
        int i9 = iE2 + 1;
        byte[][] bArr = this.f8430A;
        AbstractC1305a.o(bArr, "<this>");
        AbstractC1305a.t(i9, bArr.length);
        Object[] objArrCopyOfRange = Arrays.copyOfRange(bArr, iE, i9);
        AbstractC1305a.n(objArrCopyOfRange, "copyOfRange(...)");
        byte[][] bArr2 = (byte[][]) objArrCopyOfRange;
        int[] iArr = new int[bArr2.length * 2];
        int[] iArr2 = this.f8431B;
        if (iE <= iE2) {
            int i10 = iE;
            int i11 = 0;
            while (true) {
                iArr[i11] = Math.min(iArr2[i10] - i6, i8);
                int i12 = i11 + 1;
                iArr[i11 + bArr2.length] = iArr2[bArr.length + i10];
                if (i10 == iE2) {
                    break;
                }
                i10++;
                i11 = i12;
            }
        }
        int i13 = iE != 0 ? iArr2[iE - 1] : 0;
        int length = bArr2.length;
        iArr[length] = (i6 - i13) + iArr[length];
        return new B(bArr2, iArr);
    }

    @Override // f5.j
    public final j p() {
        return t().p();
    }

    @Override // f5.j
    public final void r(C0710g c0710g, int i6) {
        AbstractC1305a.o(c0710g, "buffer");
        int iE = f2.h.E(this, 0);
        int i7 = 0;
        while (i7 < i6) {
            int[] iArr = this.f8431B;
            int i8 = iE == 0 ? 0 : iArr[iE - 1];
            int i9 = iArr[iE] - i8;
            byte[][] bArr = this.f8430A;
            int i10 = iArr[bArr.length + iE];
            int iMin = Math.min(i6, i9 + i8) - i7;
            int i11 = (i7 - i8) + i10;
            z zVar = new z(bArr[iE], i11, i11 + iMin, true);
            z zVar2 = c0710g.f8460w;
            if (zVar2 == null) {
                zVar.f8506g = zVar;
                zVar.f8505f = zVar;
                c0710g.f8460w = zVar;
            } else {
                z zVar3 = zVar2.f8506g;
                AbstractC1305a.l(zVar3);
                zVar3.b(zVar);
            }
            i7 += iMin;
            iE++;
        }
        c0710g.f8461x += (long) i6;
    }

    public final byte[] s() {
        byte[] bArr = new byte[d()];
        byte[][] bArr2 = this.f8430A;
        int length = bArr2.length;
        int i6 = 0;
        int i7 = 0;
        int i8 = 0;
        while (i6 < length) {
            int[] iArr = this.f8431B;
            int i9 = iArr[length + i6];
            int i10 = iArr[i6];
            int i11 = i10 - i7;
            AbstractC1353j.b0(i8, i9, i9 + i11, bArr2[i6], bArr);
            i8 += i11;
            i6++;
            i7 = i10;
        }
        return bArr;
    }

    public final j t() {
        return new j(s());
    }

    @Override // f5.j
    public final String toString() {
        return t().toString();
    }
}
