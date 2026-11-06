package androidx.datastore.preferences.protobuf;

import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;
import java.util.ArrayList;

/* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.l, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0286l extends AbstractC0288m {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final InputStream f5471e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final byte[] f5472f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f5473g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f5474h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f5475i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f5476j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f5477k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f5478l = Integer.MAX_VALUE;

    public C0286l(InputStream inputStream) {
        Charset charset = F.f5369a;
        this.f5471e = inputStream;
        this.f5472f = new byte[4096];
        this.f5473g = 0;
        this.f5475i = 0;
        this.f5477k = 0;
    }

    public final ArrayList A(int i6) throws IOException {
        ArrayList arrayList = new ArrayList();
        while (i6 > 0) {
            int iMin = Math.min(i6, 4096);
            byte[] bArr = new byte[iMin];
            int i7 = 0;
            while (i7 < iMin) {
                int i8 = this.f5471e.read(bArr, i7, iMin - i7);
                if (i8 == -1) {
                    throw H.e();
                }
                this.f5477k += i8;
                i7 += i8;
            }
            i6 -= iMin;
            arrayList.add(bArr);
        }
        return arrayList;
    }

    public final int B() throws H {
        int i6 = this.f5475i;
        if (this.f5473g - i6 < 4) {
            H(4);
            i6 = this.f5475i;
        }
        this.f5475i = i6 + 4;
        byte[] bArr = this.f5472f;
        return ((bArr[i6 + 3] & 255) << 24) | (bArr[i6] & 255) | ((bArr[i6 + 1] & 255) << 8) | ((bArr[i6 + 2] & 255) << 16);
    }

    public final long C() throws H {
        int i6 = this.f5475i;
        if (this.f5473g - i6 < 8) {
            H(8);
            i6 = this.f5475i;
        }
        this.f5475i = i6 + 8;
        byte[] bArr = this.f5472f;
        return ((((long) bArr[i6 + 7]) & 255) << 56) | (((long) bArr[i6]) & 255) | ((((long) bArr[i6 + 1]) & 255) << 8) | ((((long) bArr[i6 + 2]) & 255) << 16) | ((((long) bArr[i6 + 3]) & 255) << 24) | ((((long) bArr[i6 + 4]) & 255) << 32) | ((((long) bArr[i6 + 5]) & 255) << 40) | ((((long) bArr[i6 + 6]) & 255) << 48);
    }

    public final int D() {
        int i6;
        int i7 = this.f5475i;
        int i8 = this.f5473g;
        if (i8 != i7) {
            int i9 = i7 + 1;
            byte[] bArr = this.f5472f;
            byte b6 = bArr[i7];
            if (b6 >= 0) {
                this.f5475i = i9;
                return b6;
            }
            if (i8 - i9 >= 9) {
                int i10 = i7 + 2;
                int i11 = (bArr[i9] << 7) ^ b6;
                if (i11 < 0) {
                    i6 = i11 ^ (-128);
                } else {
                    int i12 = i7 + 3;
                    int i13 = (bArr[i10] << 14) ^ i11;
                    if (i13 >= 0) {
                        i6 = i13 ^ 16256;
                    } else {
                        int i14 = i7 + 4;
                        int i15 = i13 ^ (bArr[i12] << 21);
                        if (i15 < 0) {
                            i6 = (-2080896) ^ i15;
                        } else {
                            i12 = i7 + 5;
                            byte b7 = bArr[i14];
                            int i16 = (i15 ^ (b7 << 28)) ^ 266354560;
                            if (b7 < 0) {
                                i14 = i7 + 6;
                                if (bArr[i12] < 0) {
                                    i12 = i7 + 7;
                                    if (bArr[i14] < 0) {
                                        i14 = i7 + 8;
                                        if (bArr[i12] < 0) {
                                            i12 = i7 + 9;
                                            if (bArr[i14] < 0) {
                                                int i17 = i7 + 10;
                                                if (bArr[i12] >= 0) {
                                                    i10 = i17;
                                                    i6 = i16;
                                                }
                                            }
                                        }
                                    }
                                }
                                i6 = i16;
                            }
                            i6 = i16;
                        }
                        i10 = i14;
                    }
                    i10 = i12;
                }
                this.f5475i = i10;
                return i6;
            }
        }
        return (int) F();
    }

    public final long E() {
        long j6;
        long j7;
        long j8;
        long j9;
        int i6 = this.f5475i;
        int i7 = this.f5473g;
        if (i7 != i6) {
            int i8 = i6 + 1;
            byte[] bArr = this.f5472f;
            byte b6 = bArr[i6];
            if (b6 >= 0) {
                this.f5475i = i8;
                return b6;
            }
            if (i7 - i8 >= 9) {
                int i9 = i6 + 2;
                int i10 = (bArr[i8] << 7) ^ b6;
                if (i10 < 0) {
                    j6 = i10 ^ (-128);
                } else {
                    int i11 = i6 + 3;
                    int i12 = (bArr[i9] << 14) ^ i10;
                    if (i12 >= 0) {
                        j6 = i12 ^ 16256;
                        i9 = i11;
                    } else {
                        int i13 = i6 + 4;
                        int i14 = i12 ^ (bArr[i11] << 21);
                        if (i14 < 0) {
                            j9 = (-2080896) ^ i14;
                        } else {
                            long j10 = i14;
                            i9 = i6 + 5;
                            long j11 = j10 ^ (((long) bArr[i13]) << 28);
                            if (j11 >= 0) {
                                j8 = 266354560;
                            } else {
                                i13 = i6 + 6;
                                long j12 = j11 ^ (((long) bArr[i9]) << 35);
                                if (j12 < 0) {
                                    j7 = -34093383808L;
                                } else {
                                    i9 = i6 + 7;
                                    j11 = j12 ^ (((long) bArr[i13]) << 42);
                                    if (j11 >= 0) {
                                        j8 = 4363953127296L;
                                    } else {
                                        i13 = i6 + 8;
                                        j12 = j11 ^ (((long) bArr[i9]) << 49);
                                        if (j12 < 0) {
                                            j7 = -558586000294016L;
                                        } else {
                                            i9 = i6 + 9;
                                            long j13 = (j12 ^ (((long) bArr[i13]) << 56)) ^ 71499008037633920L;
                                            if (j13 < 0) {
                                                int i15 = i6 + 10;
                                                if (bArr[i9] >= 0) {
                                                    i9 = i15;
                                                }
                                            }
                                            j6 = j13;
                                        }
                                    }
                                }
                                j9 = j7 ^ j12;
                            }
                            j6 = j8 ^ j11;
                        }
                        i9 = i13;
                        j6 = j9;
                    }
                }
                this.f5475i = i9;
                return j6;
            }
        }
        return F();
    }

    public final long F() throws H {
        long j6 = 0;
        for (int i6 = 0; i6 < 64; i6 += 7) {
            if (this.f5475i == this.f5473g) {
                H(1);
            }
            int i7 = this.f5475i;
            this.f5475i = i7 + 1;
            byte b6 = this.f5472f[i7];
            j6 |= ((long) (b6 & 127)) << i6;
            if ((b6 & 128) == 0) {
                return j6;
            }
        }
        throw H.c();
    }

    public final void G() {
        int i6 = this.f5473g + this.f5474h;
        this.f5473g = i6;
        int i7 = this.f5477k + i6;
        int i8 = this.f5478l;
        if (i7 <= i8) {
            this.f5474h = 0;
            return;
        }
        int i9 = i7 - i8;
        this.f5474h = i9;
        this.f5473g = i6 - i9;
    }

    public final void H(int i6) throws H {
        if (J(i6)) {
            return;
        }
        if (i6 <= (this.f5488c - this.f5477k) - this.f5475i) {
            throw H.e();
        }
        throw new H("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit.");
    }

    public final void I(int i6) throws H {
        int i7 = this.f5473g;
        int i8 = this.f5475i;
        if (i6 <= i7 - i8 && i6 >= 0) {
            this.f5475i = i8 + i6;
            return;
        }
        InputStream inputStream = this.f5471e;
        if (i6 < 0) {
            throw H.d();
        }
        int i9 = this.f5477k;
        int i10 = i9 + i8;
        int i11 = i10 + i6;
        int i12 = this.f5478l;
        if (i11 > i12) {
            I((i12 - i9) - i8);
            throw H.e();
        }
        this.f5477k = i10;
        int i13 = i7 - i8;
        this.f5473g = 0;
        this.f5475i = 0;
        while (i13 < i6) {
            long j6 = i6 - i13;
            try {
                try {
                    long jSkip = inputStream.skip(j6);
                    if (jSkip < 0 || jSkip > j6) {
                        throw new IllegalStateException(inputStream.getClass() + "#skip returned invalid result: " + jSkip + "\nThe InputStream implementation is buggy.");
                    }
                    if (jSkip == 0) {
                        break;
                    } else {
                        i13 += (int) jSkip;
                    }
                } catch (H e6) {
                    e6.f5372w = true;
                    throw e6;
                }
            } catch (Throwable th) {
                this.f5477k += i13;
                G();
                throw th;
            }
        }
        this.f5477k += i13;
        G();
        if (i13 >= i6) {
            return;
        }
        int i14 = this.f5473g;
        int i15 = i14 - this.f5475i;
        this.f5475i = i14;
        while (true) {
            H(1);
            int i16 = i6 - i15;
            int i17 = this.f5473g;
            if (i16 <= i17) {
                this.f5475i = i16;
                return;
            } else {
                i15 += i17;
                this.f5475i = i17;
            }
        }
    }

    public final boolean J(int i6) throws IOException {
        int i7 = this.f5475i;
        int i8 = i7 + i6;
        int i9 = this.f5473g;
        if (i8 <= i9) {
            throw new IllegalStateException(H1.a.j("refillBuffer() called when ", i6, " bytes were already available in buffer"));
        }
        int i10 = this.f5477k;
        int i11 = this.f5488c;
        if (i6 > (i11 - i10) - i7 || i10 + i7 + i6 > this.f5478l) {
            return false;
        }
        byte[] bArr = this.f5472f;
        if (i7 > 0) {
            if (i9 > i7) {
                System.arraycopy(bArr, i7, bArr, 0, i9 - i7);
            }
            this.f5477k += i7;
            this.f5473g -= i7;
            this.f5475i = 0;
        }
        int i12 = this.f5473g;
        int iMin = Math.min(bArr.length - i12, (i11 - this.f5477k) - i12);
        InputStream inputStream = this.f5471e;
        try {
            int i13 = inputStream.read(bArr, i12, iMin);
            if (i13 == 0 || i13 < -1 || i13 > bArr.length) {
                throw new IllegalStateException(inputStream.getClass() + "#read(byte[]) returned invalid result: " + i13 + "\nThe InputStream implementation is buggy.");
            }
            if (i13 <= 0) {
                return false;
            }
            this.f5473g += i13;
            G();
            if (this.f5473g >= i6) {
                return true;
            }
            return J(i6);
        } catch (H e6) {
            e6.f5372w = true;
            throw e6;
        }
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0288m
    public final void a(int i6) throws H {
        if (this.f5476j != i6) {
            throw new H("Protocol message end-group tag did not match expected tag.");
        }
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0288m
    public final int b() {
        return this.f5477k + this.f5475i;
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0288m
    public final boolean c() {
        return this.f5475i == this.f5473g && !J(1);
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0288m
    public final void d(int i6) {
        this.f5478l = i6;
        G();
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0288m
    public final int e(int i6) throws H {
        if (i6 < 0) {
            throw H.d();
        }
        int i7 = this.f5477k + this.f5475i + i6;
        int i8 = this.f5478l;
        if (i7 > i8) {
            throw H.e();
        }
        this.f5478l = i7;
        G();
        return i8;
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0288m
    public final boolean f() {
        return E() != 0;
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0288m
    public final C0282j g() throws IOException {
        int iD = D();
        int i6 = this.f5473g;
        int i7 = this.f5475i;
        int i8 = i6 - i7;
        byte[] bArr = this.f5472f;
        if (iD <= i8 && iD > 0) {
            C0282j c0282jE = AbstractC0280i.e(bArr, i7, iD);
            this.f5475i += iD;
            return c0282jE;
        }
        if (iD == 0) {
            return AbstractC0280i.f5452x;
        }
        byte[] bArrZ = z(iD);
        if (bArrZ != null) {
            return AbstractC0280i.e(bArrZ, 0, bArrZ.length);
        }
        int i9 = this.f5475i;
        int i10 = this.f5473g;
        int length = i10 - i9;
        this.f5477k += i10;
        this.f5475i = 0;
        this.f5473g = 0;
        ArrayList<byte[]> arrayListA = A(iD - length);
        byte[] bArr2 = new byte[iD];
        System.arraycopy(bArr, i9, bArr2, 0, length);
        for (byte[] bArr3 : arrayListA) {
            System.arraycopy(bArr3, 0, bArr2, length, bArr3.length);
            length += bArr3.length;
        }
        C0282j c0282j = AbstractC0280i.f5452x;
        return new C0282j(bArr2);
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0288m
    public final double h() {
        return Double.longBitsToDouble(C());
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0288m
    public final int i() {
        return D();
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0288m
    public final int j() {
        return B();
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0288m
    public final long k() {
        return C();
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0288m
    public final float l() {
        return Float.intBitsToFloat(B());
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0288m
    public final int m() {
        return D();
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0288m
    public final long n() {
        return E();
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0288m
    public final int o() {
        return B();
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0288m
    public final long p() {
        return C();
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0288m
    public final int q() {
        int iD = D();
        return (-(iD & 1)) ^ (iD >>> 1);
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0288m
    public final long r() {
        long jE = E();
        return (-(jE & 1)) ^ (jE >>> 1);
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x001c  */
    @Override // androidx.datastore.preferences.protobuf.AbstractC0288m
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.String s() throws androidx.datastore.preferences.protobuf.H {
        /*
            r5 = this;
            int r0 = r5.D()
            byte[] r1 = r5.f5472f
            if (r0 <= 0) goto L1c
            int r2 = r5.f5473g
            int r3 = r5.f5475i
            int r2 = r2 - r3
            if (r0 > r2) goto L1c
            java.lang.String r2 = new java.lang.String
            java.nio.charset.Charset r4 = androidx.datastore.preferences.protobuf.F.f5369a
            r2.<init>(r1, r3, r0, r4)
        L16:
            int r1 = r5.f5475i
            int r1 = r1 + r0
            r5.f5475i = r1
            return r2
        L1c:
            if (r0 != 0) goto L21
            java.lang.String r0 = ""
            return r0
        L21:
            int r2 = r5.f5473g
            if (r0 > r2) goto L32
            r5.H(r0)
            java.lang.String r2 = new java.lang.String
            int r3 = r5.f5475i
            java.nio.charset.Charset r4 = androidx.datastore.preferences.protobuf.F.f5369a
            r2.<init>(r1, r3, r0, r4)
            goto L16
        L32:
            java.lang.String r1 = new java.lang.String
            byte[] r0 = r5.y(r0)
            java.nio.charset.Charset r2 = androidx.datastore.preferences.protobuf.F.f5369a
            r1.<init>(r0, r2)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.preferences.protobuf.C0286l.s():java.lang.String");
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0288m
    public final String t() throws IOException {
        int iD = D();
        int i6 = this.f5475i;
        int i7 = this.f5473g;
        int i8 = i7 - i6;
        byte[] bArrY = this.f5472f;
        if (iD <= i8 && iD > 0) {
            this.f5475i = i6 + iD;
        } else {
            if (iD == 0) {
                return "";
            }
            i6 = 0;
            if (iD <= i7) {
                H(iD);
                this.f5475i = iD;
            } else {
                bArrY = y(iD);
            }
        }
        return F0.f5371a.d(bArrY, i6, iD);
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0288m
    public final int u() throws H {
        if (c()) {
            this.f5476j = 0;
            return 0;
        }
        int iD = D();
        this.f5476j = iD;
        if ((iD >>> 3) != 0) {
            return iD;
        }
        throw new H("Protocol message contained an invalid tag (zero).");
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0288m
    public final int v() {
        return D();
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0288m
    public final long w() {
        return E();
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0288m
    public final boolean x(int i6) throws H {
        int iD;
        int iU;
        int i7 = i6 & 7;
        int i8 = 0;
        if (i7 == 0) {
            int i9 = this.f5473g - this.f5475i;
            byte[] bArr = this.f5472f;
            if (i9 >= 10) {
                while (i8 < 10) {
                    int i10 = this.f5475i;
                    this.f5475i = i10 + 1;
                    if (bArr[i10] < 0) {
                        i8++;
                    }
                }
                throw H.c();
            }
            while (i8 < 10) {
                if (this.f5475i == this.f5473g) {
                    H(1);
                }
                int i11 = this.f5475i;
                this.f5475i = i11 + 1;
                if (bArr[i11] < 0) {
                    i8++;
                }
            }
            throw H.c();
            return true;
        }
        if (i7 == 1) {
            iD = 8;
        } else {
            if (i7 != 2) {
                if (i7 != 3) {
                    if (i7 == 4) {
                        return false;
                    }
                    if (i7 != 5) {
                        throw H.b();
                    }
                    I(4);
                    return true;
                }
                do {
                    iU = u();
                    if (iU == 0) {
                        break;
                    }
                } while (x(iU));
                a(((i6 >>> 3) << 3) | 4);
                return true;
            }
            iD = D();
        }
        I(iD);
        return true;
    }

    public final byte[] y(int i6) throws IOException {
        byte[] bArrZ = z(i6);
        if (bArrZ != null) {
            return bArrZ;
        }
        int i7 = this.f5475i;
        int i8 = this.f5473g;
        int length = i8 - i7;
        this.f5477k += i8;
        this.f5475i = 0;
        this.f5473g = 0;
        ArrayList<byte[]> arrayListA = A(i6 - length);
        byte[] bArr = new byte[i6];
        System.arraycopy(this.f5472f, i7, bArr, 0, length);
        for (byte[] bArr2 : arrayListA) {
            System.arraycopy(bArr2, 0, bArr, length, bArr2.length);
            length += bArr2.length;
        }
        return bArr;
    }

    public final byte[] z(int i6) throws IOException {
        if (i6 == 0) {
            return F.f5370b;
        }
        if (i6 < 0) {
            throw H.d();
        }
        int i7 = this.f5477k;
        int i8 = this.f5475i;
        int i9 = i7 + i8 + i6;
        if (i9 - this.f5488c > 0) {
            throw new H("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit.");
        }
        int i10 = this.f5478l;
        if (i9 > i10) {
            I((i10 - i7) - i8);
            throw H.e();
        }
        int i11 = this.f5473g - i8;
        int i12 = i6 - i11;
        InputStream inputStream = this.f5471e;
        if (i12 >= 4096) {
            try {
                if (i12 > inputStream.available()) {
                    return null;
                }
            } catch (H e6) {
                e6.f5372w = true;
                throw e6;
            }
        }
        byte[] bArr = new byte[i6];
        System.arraycopy(this.f5472f, this.f5475i, bArr, 0, i11);
        this.f5477k += this.f5473g;
        this.f5475i = 0;
        this.f5473g = 0;
        while (i11 < i6) {
            try {
                int i13 = inputStream.read(bArr, i11, i6 - i11);
                if (i13 == -1) {
                    throw H.e();
                }
                this.f5477k += i13;
                i11 += i13;
            } catch (H e7) {
                e7.f5372w = true;
                throw e7;
            }
        }
        return bArr;
    }
}
