package androidx.datastore.preferences.protobuf;

/* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.k, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0284k extends AbstractC0288m {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final byte[] f5460e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f5461f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f5462g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f5463h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int f5464i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f5465j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f5466k = Integer.MAX_VALUE;

    public C0284k(byte[] bArr, int i6, int i7, boolean z5) {
        this.f5460e = bArr;
        this.f5461f = i7 + i6;
        this.f5463h = i6;
        this.f5464i = i6;
    }

    public final int A() {
        int i6;
        int i7 = this.f5463h;
        int i8 = this.f5461f;
        if (i8 != i7) {
            int i9 = i7 + 1;
            byte[] bArr = this.f5460e;
            byte b6 = bArr[i7];
            if (b6 >= 0) {
                this.f5463h = i9;
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
                this.f5463h = i10;
                return i6;
            }
        }
        return (int) C();
    }

    public final long B() {
        long j6;
        long j7;
        long j8;
        long j9;
        int i6 = this.f5463h;
        int i7 = this.f5461f;
        if (i7 != i6) {
            int i8 = i6 + 1;
            byte[] bArr = this.f5460e;
            byte b6 = bArr[i6];
            if (b6 >= 0) {
                this.f5463h = i8;
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
                this.f5463h = i9;
                return j6;
            }
        }
        return C();
    }

    public final long C() throws H {
        long j6 = 0;
        for (int i6 = 0; i6 < 64; i6 += 7) {
            int i7 = this.f5463h;
            if (i7 == this.f5461f) {
                throw H.e();
            }
            this.f5463h = i7 + 1;
            byte b6 = this.f5460e[i7];
            j6 |= ((long) (b6 & 127)) << i6;
            if ((b6 & 128) == 0) {
                return j6;
            }
        }
        throw H.c();
    }

    public final void D() {
        int i6 = this.f5461f + this.f5462g;
        this.f5461f = i6;
        int i7 = i6 - this.f5464i;
        int i8 = this.f5466k;
        if (i7 <= i8) {
            this.f5462g = 0;
            return;
        }
        int i9 = i7 - i8;
        this.f5462g = i9;
        this.f5461f = i6 - i9;
    }

    public final void E(int i6) throws H {
        if (i6 >= 0) {
            int i7 = this.f5461f;
            int i8 = this.f5463h;
            if (i6 <= i7 - i8) {
                this.f5463h = i8 + i6;
                return;
            }
        }
        if (i6 >= 0) {
            throw H.e();
        }
        throw H.d();
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0288m
    public final void a(int i6) throws H {
        if (this.f5465j != i6) {
            throw new H("Protocol message end-group tag did not match expected tag.");
        }
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0288m
    public final int b() {
        return this.f5463h - this.f5464i;
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0288m
    public final boolean c() {
        return this.f5463h == this.f5461f;
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0288m
    public final void d(int i6) {
        this.f5466k = i6;
        D();
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0288m
    public final int e(int i6) throws H {
        if (i6 < 0) {
            throw H.d();
        }
        int iB = b() + i6;
        if (iB < 0) {
            throw new H("Failed to parse the message.");
        }
        int i7 = this.f5466k;
        if (iB > i7) {
            throw H.e();
        }
        this.f5466k = iB;
        D();
        return i7;
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0288m
    public final boolean f() {
        return B() != 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
    @Override // androidx.datastore.preferences.protobuf.AbstractC0288m
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final androidx.datastore.preferences.protobuf.C0282j g() throws androidx.datastore.preferences.protobuf.H {
        /*
            r4 = this;
            int r0 = r4.A()
            byte[] r1 = r4.f5460e
            if (r0 <= 0) goto L19
            int r2 = r4.f5461f
            int r3 = r4.f5463h
            int r2 = r2 - r3
            if (r0 > r2) goto L19
            androidx.datastore.preferences.protobuf.j r1 = androidx.datastore.preferences.protobuf.AbstractC0280i.e(r1, r3, r0)
            int r2 = r4.f5463h
            int r2 = r2 + r0
            r4.f5463h = r2
            return r1
        L19:
            if (r0 != 0) goto L1e
            androidx.datastore.preferences.protobuf.j r0 = androidx.datastore.preferences.protobuf.AbstractC0280i.f5452x
            return r0
        L1e:
            if (r0 <= 0) goto L2f
            int r2 = r4.f5461f
            int r3 = r4.f5463h
            int r2 = r2 - r3
            if (r0 > r2) goto L2f
            int r0 = r0 + r3
            r4.f5463h = r0
            byte[] r0 = java.util.Arrays.copyOfRange(r1, r3, r0)
            goto L35
        L2f:
            if (r0 > 0) goto L42
            if (r0 != 0) goto L3d
            byte[] r0 = androidx.datastore.preferences.protobuf.F.f5370b
        L35:
            androidx.datastore.preferences.protobuf.j r1 = androidx.datastore.preferences.protobuf.AbstractC0280i.f5452x
            androidx.datastore.preferences.protobuf.j r1 = new androidx.datastore.preferences.protobuf.j
            r1.<init>(r0)
            return r1
        L3d:
            androidx.datastore.preferences.protobuf.H r0 = androidx.datastore.preferences.protobuf.H.d()
            throw r0
        L42:
            androidx.datastore.preferences.protobuf.H r0 = androidx.datastore.preferences.protobuf.H.e()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.preferences.protobuf.C0284k.g():androidx.datastore.preferences.protobuf.j");
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0288m
    public final double h() {
        return Double.longBitsToDouble(z());
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0288m
    public final int i() {
        return A();
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0288m
    public final int j() {
        return y();
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0288m
    public final long k() {
        return z();
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0288m
    public final float l() {
        return Float.intBitsToFloat(y());
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0288m
    public final int m() {
        return A();
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0288m
    public final long n() {
        return B();
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0288m
    public final int o() {
        return y();
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0288m
    public final long p() {
        return z();
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0288m
    public final int q() {
        int iA = A();
        return (-(iA & 1)) ^ (iA >>> 1);
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0288m
    public final long r() {
        long jB = B();
        return (-(jB & 1)) ^ (jB >>> 1);
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0288m
    public final String s() throws H {
        int iA = A();
        if (iA > 0) {
            int i6 = this.f5461f;
            int i7 = this.f5463h;
            if (iA <= i6 - i7) {
                String str = new String(this.f5460e, i7, iA, F.f5369a);
                this.f5463h += iA;
                return str;
            }
        }
        if (iA == 0) {
            return "";
        }
        if (iA < 0) {
            throw H.d();
        }
        throw H.e();
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0288m
    public final String t() throws H {
        int iA = A();
        if (iA > 0) {
            int i6 = this.f5461f;
            int i7 = this.f5463h;
            if (iA <= i6 - i7) {
                String strD = F0.f5371a.d(this.f5460e, i7, iA);
                this.f5463h += iA;
                return strD;
            }
        }
        if (iA == 0) {
            return "";
        }
        if (iA <= 0) {
            throw H.d();
        }
        throw H.e();
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0288m
    public final int u() throws H {
        if (c()) {
            this.f5465j = 0;
            return 0;
        }
        int iA = A();
        this.f5465j = iA;
        if ((iA >>> 3) != 0) {
            return iA;
        }
        throw new H("Protocol message contained an invalid tag (zero).");
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0288m
    public final int v() {
        return A();
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0288m
    public final long w() {
        return B();
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0288m
    public final boolean x(int i6) throws H {
        int iA;
        int iU;
        int i7 = i6 & 7;
        int i8 = 0;
        if (i7 == 0) {
            int i9 = this.f5461f - this.f5463h;
            byte[] bArr = this.f5460e;
            if (i9 >= 10) {
                while (i8 < 10) {
                    int i10 = this.f5463h;
                    this.f5463h = i10 + 1;
                    if (bArr[i10] < 0) {
                        i8++;
                    }
                }
                throw H.c();
            }
            while (i8 < 10) {
                int i11 = this.f5463h;
                if (i11 == this.f5461f) {
                    throw H.e();
                }
                this.f5463h = i11 + 1;
                if (bArr[i11] < 0) {
                    i8++;
                }
            }
            throw H.c();
            return true;
        }
        if (i7 == 1) {
            iA = 8;
        } else {
            if (i7 != 2) {
                if (i7 != 3) {
                    if (i7 == 4) {
                        return false;
                    }
                    if (i7 != 5) {
                        throw H.b();
                    }
                    E(4);
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
            iA = A();
        }
        E(iA);
        return true;
    }

    public final int y() throws H {
        int i6 = this.f5463h;
        if (this.f5461f - i6 < 4) {
            throw H.e();
        }
        this.f5463h = i6 + 4;
        byte[] bArr = this.f5460e;
        return ((bArr[i6 + 3] & 255) << 24) | (bArr[i6] & 255) | ((bArr[i6 + 1] & 255) << 8) | ((bArr[i6 + 2] & 255) << 16);
    }

    public final long z() throws H {
        int i6 = this.f5463h;
        if (this.f5461f - i6 < 8) {
            throw H.e();
        }
        this.f5463h = i6 + 8;
        byte[] bArr = this.f5460e;
        return ((((long) bArr[i6 + 7]) & 255) << 56) | (((long) bArr[i6]) & 255) | ((((long) bArr[i6 + 1]) & 255) << 8) | ((((long) bArr[i6 + 2]) & 255) << 16) | ((((long) bArr[i6 + 3]) & 255) << 24) | ((((long) bArr[i6 + 4]) & 255) << 32) | ((((long) bArr[i6 + 5]) & 255) << 40) | ((((long) bArr[i6 + 6]) & 255) << 48);
    }
}
