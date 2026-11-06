package f5;

import d.AbstractC0628i;
import d2.AbstractC0651b;
import java.io.EOFException;
import java.nio.ByteBuffer;
import java.nio.channels.ByteChannel;
import java.nio.charset.Charset;
import s4.AbstractC1305a;
import t4.AbstractC1353j;

/* JADX INFO: renamed from: f5.g, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0710g implements i, InterfaceC0711h, Cloneable, ByteChannel {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public z f8460w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public long f8461x;

    @Override // f5.i
    public final int A() throws EOFException {
        int i6 = readInt();
        return ((i6 & 255) << 24) | (((-16777216) & i6) >>> 24) | ((16711680 & i6) >>> 8) | ((65280 & i6) << 8);
    }

    @Override // f5.InterfaceC0711h
    public final /* bridge */ /* synthetic */ InterfaceC0711h B(long j6) {
        Y(j6);
        return this;
    }

    @Override // f5.i
    public final boolean E() {
        return this.f8461x == 0;
    }

    @Override // f5.InterfaceC0711h
    public final /* bridge */ /* synthetic */ InterfaceC0711h F(int i6) {
        X(i6);
        return this;
    }

    @Override // f5.E
    public final long G(C0710g c0710g, long j6) {
        AbstractC1305a.o(c0710g, "sink");
        if (j6 < 0) {
            throw new IllegalArgumentException(AbstractC0628i.g("byteCount < 0: ", j6).toString());
        }
        long j7 = this.f8461x;
        if (j7 == 0) {
            return -1L;
        }
        if (j6 > j7) {
            j6 = j7;
        }
        c0710g.q(this, j6);
        return j6;
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00a8 A[EDGE_INSN: B:43:0x00a8->B:37:0x00a8 BREAK  A[LOOP:0: B:5:0x0012->B:45:?], SYNTHETIC] */
    @Override // f5.i
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final long H() throws java.io.EOFException {
        /*
            r18 = this;
            r0 = r18
            r1 = 4
            r2 = 48
            r3 = 0
            r4 = 1
            long r5 = r0.f8461x
            r7 = 0
            int r5 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r5 == 0) goto Laf
            r9 = r3
            r10 = r9
            r5 = r7
        L12:
            f5.z r11 = r0.f8460w
            s4.AbstractC1305a.l(r11)
            int r12 = r11.f8501b
            int r13 = r11.f8502c
        L1b:
            if (r12 >= r13) goto L94
            byte[] r14 = r11.f8500a
            r14 = r14[r12]
            if (r14 < r2) goto L2a
            r15 = 57
            if (r14 > r15) goto L2a
            int r15 = r14 + (-48)
            goto L3f
        L2a:
            r15 = 97
            if (r14 < r15) goto L35
            r15 = 102(0x66, float:1.43E-43)
            if (r14 > r15) goto L35
            int r15 = r14 + (-87)
            goto L3f
        L35:
            r15 = 65
            if (r14 < r15) goto L6c
            r15 = 70
            if (r14 > r15) goto L6c
            int r15 = r14 + (-55)
        L3f:
            r16 = -1152921504606846976(0xf000000000000000, double:-3.105036184601418E231)
            long r16 = r5 & r16
            int r16 = (r16 > r7 ? 1 : (r16 == r7 ? 0 : -1))
            if (r16 != 0) goto L4d
            long r5 = r5 << r1
            long r14 = (long) r15
            long r5 = r5 | r14
            int r12 = r12 + r4
            int r9 = r9 + r4
            goto L1b
        L4d:
            f5.g r1 = new f5.g
            r1.<init>()
            r1.Z(r5)
            r1.X(r14)
            java.lang.NumberFormatException r2 = new java.lang.NumberFormatException
            long r3 = r1.f8461x
            java.nio.charset.Charset r5 = K4.a.f1637a
            java.lang.String r1 = r1.R(r3, r5)
            java.lang.String r3 = "Number too large: "
            java.lang.String r1 = r3.concat(r1)
            r2.<init>(r1)
            throw r2
        L6c:
            if (r9 == 0) goto L70
            r10 = r4
            goto L94
        L70:
            java.lang.NumberFormatException r2 = new java.lang.NumberFormatException
            char[] r5 = g5.b.f8534a
            int r1 = r14 >> 4
            r1 = r1 & 15
            char r1 = r5[r1]
            r6 = r14 & 15
            char r5 = r5[r6]
            r6 = 2
            char[] r6 = new char[r6]
            r6[r3] = r1
            r6[r4] = r5
            java.lang.String r1 = new java.lang.String
            r1.<init>(r6)
            java.lang.String r3 = "Expected leading [0-9a-fA-F] character but was 0x"
            java.lang.String r1 = r3.concat(r1)
            r2.<init>(r1)
            throw r2
        L94:
            if (r12 != r13) goto La0
            f5.z r12 = r11.a()
            r0.f8460w = r12
            f5.A.a(r11)
            goto La2
        La0:
            r11.f8501b = r12
        La2:
            if (r10 != 0) goto La8
            f5.z r11 = r0.f8460w
            if (r11 != 0) goto L12
        La8:
            long r1 = r0.f8461x
            long r3 = (long) r9
            long r1 = r1 - r3
            r0.f8461x = r1
            return r5
        Laf:
            java.io.EOFException r1 = new java.io.EOFException
            r1.<init>()
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: f5.C0710g.H():long");
    }

    @Override // f5.i
    public final C0708e I() {
        return new C0708e(this, 0);
    }

    public final long J(byte b6, long j6, long j7) {
        z zVar;
        long j8 = 0;
        if (0 > j6 || j6 > j7) {
            throw new IllegalArgumentException(("size=" + this.f8461x + " fromIndex=" + j6 + " toIndex=" + j7).toString());
        }
        long j9 = this.f8461x;
        if (j7 > j9) {
            j7 = j9;
        }
        if (j6 == j7 || (zVar = this.f8460w) == null) {
            return -1L;
        }
        if (j9 - j6 < j6) {
            while (j9 > j6) {
                zVar = zVar.f8506g;
                AbstractC1305a.l(zVar);
                j9 -= (long) (zVar.f8502c - zVar.f8501b);
            }
            while (j9 < j7) {
                int iMin = (int) Math.min(zVar.f8502c, (((long) zVar.f8501b) + j7) - j9);
                for (int i6 = (int) ((((long) zVar.f8501b) + j6) - j9); i6 < iMin; i6++) {
                    if (zVar.f8500a[i6] == b6) {
                        return ((long) (i6 - zVar.f8501b)) + j9;
                    }
                }
                j9 += (long) (zVar.f8502c - zVar.f8501b);
                zVar = zVar.f8505f;
                AbstractC1305a.l(zVar);
                j6 = j9;
            }
            return -1L;
        }
        while (true) {
            long j10 = ((long) (zVar.f8502c - zVar.f8501b)) + j8;
            if (j10 > j6) {
                break;
            }
            zVar = zVar.f8505f;
            AbstractC1305a.l(zVar);
            j8 = j10;
        }
        while (j8 < j7) {
            int iMin2 = (int) Math.min(zVar.f8502c, (((long) zVar.f8501b) + j7) - j8);
            for (int i7 = (int) ((((long) zVar.f8501b) + j6) - j8); i7 < iMin2; i7++) {
                if (zVar.f8500a[i7] == b6) {
                    return ((long) (i7 - zVar.f8501b)) + j8;
                }
            }
            j8 += (long) (zVar.f8502c - zVar.f8501b);
            zVar = zVar.f8505f;
            AbstractC1305a.l(zVar);
            j6 = j8;
        }
        return -1L;
    }

    public final long K(j jVar) {
        int i6;
        AbstractC1305a.o(jVar, "targetBytes");
        z zVar = this.f8460w;
        if (zVar == null) {
            return -1L;
        }
        long j6 = this.f8461x;
        long j7 = 0;
        byte[] bArr = jVar.f8463w;
        if (j6 < 0) {
            while (j6 > 0) {
                zVar = zVar.f8506g;
                AbstractC1305a.l(zVar);
                j6 -= (long) (zVar.f8502c - zVar.f8501b);
            }
            if (bArr.length == 2) {
                byte b6 = bArr[0];
                byte b7 = bArr[1];
                while (j6 < this.f8461x) {
                    i6 = (int) ((((long) zVar.f8501b) + j7) - j6);
                    int i7 = zVar.f8502c;
                    while (i6 < i7) {
                        byte b8 = zVar.f8500a[i6];
                        if (b8 != b6 && b8 != b7) {
                            i6++;
                        }
                    }
                    j7 = ((long) (zVar.f8502c - zVar.f8501b)) + j6;
                    zVar = zVar.f8505f;
                    AbstractC1305a.l(zVar);
                    j6 = j7;
                }
                return -1L;
            }
            while (j6 < this.f8461x) {
                i6 = (int) ((((long) zVar.f8501b) + j7) - j6);
                int i8 = zVar.f8502c;
                while (i6 < i8) {
                    byte b9 = zVar.f8500a[i6];
                    for (byte b10 : bArr) {
                        if (b9 != b10) {
                        }
                    }
                    i6++;
                }
                j7 = ((long) (zVar.f8502c - zVar.f8501b)) + j6;
                zVar = zVar.f8505f;
                AbstractC1305a.l(zVar);
                j6 = j7;
            }
            return -1L;
        }
        j6 = 0;
        while (true) {
            long j8 = ((long) (zVar.f8502c - zVar.f8501b)) + j6;
            if (j8 > 0) {
                break;
            }
            zVar = zVar.f8505f;
            AbstractC1305a.l(zVar);
            j6 = j8;
        }
        if (bArr.length == 2) {
            byte b11 = bArr[0];
            byte b12 = bArr[1];
            while (j6 < this.f8461x) {
                i6 = (int) ((((long) zVar.f8501b) + j7) - j6);
                int i9 = zVar.f8502c;
                while (i6 < i9) {
                    byte b13 = zVar.f8500a[i6];
                    if (b13 != b11 && b13 != b12) {
                        i6++;
                    }
                }
                j7 = ((long) (zVar.f8502c - zVar.f8501b)) + j6;
                zVar = zVar.f8505f;
                AbstractC1305a.l(zVar);
                j6 = j7;
            }
            return -1L;
        }
        while (j6 < this.f8461x) {
            i6 = (int) ((((long) zVar.f8501b) + j7) - j6);
            int i10 = zVar.f8502c;
            while (i6 < i10) {
                byte b14 = zVar.f8500a[i6];
                for (byte b15 : bArr) {
                    if (b14 != b15) {
                    }
                }
                i6++;
            }
            j7 = ((long) (zVar.f8502c - zVar.f8501b)) + j6;
            zVar = zVar.f8505f;
            AbstractC1305a.l(zVar);
            j6 = j7;
        }
        return -1L;
        return ((long) (i6 - zVar.f8501b)) + j6;
    }

    public final C0709f L() {
        return new C0709f(this, 0);
    }

    public final boolean M(j jVar) {
        AbstractC1305a.o(jVar, "bytes");
        byte[] bArr = jVar.f8463w;
        int length = bArr.length;
        if (length < 0 || this.f8461x < length || bArr.length < length) {
            return false;
        }
        for (int i6 = 0; i6 < length; i6++) {
            if (u(i6) != bArr[i6]) {
                return false;
            }
        }
        return true;
    }

    public final int N(byte[] bArr, int i6, int i7) {
        AbstractC1305a.o(bArr, "sink");
        AbstractC0651b.g(bArr.length, i6, i7);
        z zVar = this.f8460w;
        if (zVar == null) {
            return -1;
        }
        int iMin = Math.min(i7, zVar.f8502c - zVar.f8501b);
        int i8 = zVar.f8501b;
        AbstractC1353j.b0(i6, i8, i8 + iMin, zVar.f8500a, bArr);
        int i9 = zVar.f8501b + iMin;
        zVar.f8501b = i9;
        this.f8461x -= (long) iMin;
        if (i9 == zVar.f8502c) {
            this.f8460w = zVar.a();
            A.a(zVar);
        }
        return iMin;
    }

    public final byte[] O(long j6) throws EOFException {
        if (j6 < 0 || j6 > 2147483647L) {
            throw new IllegalArgumentException(AbstractC0628i.g("byteCount: ", j6).toString());
        }
        if (this.f8461x < j6) {
            throw new EOFException();
        }
        byte[] bArr = new byte[(int) j6];
        P(bArr);
        return bArr;
    }

    public final void P(byte[] bArr) throws EOFException {
        int i6 = 0;
        while (i6 < bArr.length) {
            int iN = N(bArr, i6, bArr.length - i6);
            if (iN == -1) {
                throw new EOFException();
            }
            i6 += iN;
        }
    }

    public final short Q() throws EOFException {
        short s5 = readShort();
        return (short) (((s5 & 255) << 8) | ((65280 & s5) >>> 8));
    }

    public final String R(long j6, Charset charset) throws EOFException {
        AbstractC1305a.o(charset, "charset");
        if (j6 < 0 || j6 > 2147483647L) {
            throw new IllegalArgumentException(AbstractC0628i.g("byteCount: ", j6).toString());
        }
        if (this.f8461x < j6) {
            throw new EOFException();
        }
        if (j6 == 0) {
            return "";
        }
        z zVar = this.f8460w;
        AbstractC1305a.l(zVar);
        int i6 = zVar.f8501b;
        if (((long) i6) + j6 > zVar.f8502c) {
            return new String(O(j6), charset);
        }
        int i7 = (int) j6;
        String str = new String(zVar.f8500a, i6, i7, charset);
        int i8 = zVar.f8501b + i7;
        zVar.f8501b = i8;
        this.f8461x -= j6;
        if (i8 == zVar.f8502c) {
            this.f8460w = zVar.a();
            A.a(zVar);
        }
        return str;
    }

    public final j S(int i6) {
        if (i6 == 0) {
            return j.f8462z;
        }
        AbstractC0651b.g(this.f8461x, 0L, i6);
        z zVar = this.f8460w;
        int i7 = 0;
        int i8 = 0;
        int i9 = 0;
        while (i8 < i6) {
            AbstractC1305a.l(zVar);
            int i10 = zVar.f8502c;
            int i11 = zVar.f8501b;
            if (i10 == i11) {
                throw new AssertionError("s.limit == s.pos");
            }
            i8 += i10 - i11;
            i9++;
            zVar = zVar.f8505f;
        }
        byte[][] bArr = new byte[i9][];
        int[] iArr = new int[i9 * 2];
        z zVar2 = this.f8460w;
        int i12 = 0;
        while (i7 < i6) {
            AbstractC1305a.l(zVar2);
            bArr[i12] = zVar2.f8500a;
            i7 += zVar2.f8502c - zVar2.f8501b;
            iArr[i12] = Math.min(i7, i6);
            iArr[i12 + i9] = zVar2.f8501b;
            zVar2.f8503d = true;
            i12++;
            zVar2 = zVar2.f8505f;
        }
        return new B(bArr, iArr);
    }

    public final z T(int i6) {
        if (i6 < 1 || i6 > 8192) {
            throw new IllegalArgumentException("unexpected capacity".toString());
        }
        z zVar = this.f8460w;
        if (zVar == null) {
            z zVarB = A.b();
            this.f8460w = zVarB;
            zVarB.f8506g = zVarB;
            zVarB.f8505f = zVarB;
            return zVarB;
        }
        z zVar2 = zVar.f8506g;
        AbstractC1305a.l(zVar2);
        if (zVar2.f8502c + i6 <= 8192 && zVar2.f8504e) {
            return zVar2;
        }
        z zVarB2 = A.b();
        zVar2.b(zVarB2);
        return zVarB2;
    }

    public final void U(j jVar) {
        AbstractC1305a.o(jVar, "byteString");
        jVar.r(this, jVar.d());
    }

    public final void V(byte[] bArr, int i6, int i7) {
        AbstractC1305a.o(bArr, "source");
        long j6 = i7;
        AbstractC0651b.g(bArr.length, i6, j6);
        int i8 = i7 + i6;
        while (i6 < i8) {
            z zVarT = T(1);
            int iMin = Math.min(i8 - i6, 8192 - zVarT.f8502c);
            int i9 = i6 + iMin;
            AbstractC1353j.b0(zVarT.f8502c, i6, i9, bArr, zVarT.f8500a);
            zVarT.f8502c += iMin;
            i6 = i9;
        }
        this.f8461x += j6;
    }

    public final void W(E e6) {
        AbstractC1305a.o(e6, "source");
        while (e6.G(this, 8192L) != -1) {
        }
    }

    public final void X(int i6) {
        z zVarT = T(1);
        int i7 = zVarT.f8502c;
        zVarT.f8502c = i7 + 1;
        zVarT.f8500a[i7] = (byte) i6;
        this.f8461x++;
    }

    public final void Y(long j6) {
        boolean z5;
        byte[] bArr;
        if (j6 == 0) {
            X(48);
            return;
        }
        int i6 = 1;
        if (j6 < 0) {
            j6 = -j6;
            if (j6 < 0) {
                c0("-9223372036854775808");
                return;
            }
            z5 = true;
        } else {
            z5 = false;
        }
        if (j6 >= 100000000) {
            i6 = j6 < 1000000000000L ? j6 < 10000000000L ? j6 < 1000000000 ? 9 : 10 : j6 < 100000000000L ? 11 : 12 : j6 < 1000000000000000L ? j6 < 10000000000000L ? 13 : j6 < 100000000000000L ? 14 : 15 : j6 < 100000000000000000L ? j6 < 10000000000000000L ? 16 : 17 : j6 < 1000000000000000000L ? 18 : 19;
        } else if (j6 >= 10000) {
            i6 = j6 < 1000000 ? j6 < 100000 ? 5 : 6 : j6 < 10000000 ? 7 : 8;
        } else if (j6 >= 100) {
            i6 = j6 < 1000 ? 3 : 4;
        } else if (j6 >= 10) {
            i6 = 2;
        }
        if (z5) {
            i6++;
        }
        z zVarT = T(i6);
        int i7 = zVarT.f8502c + i6;
        while (true) {
            bArr = zVarT.f8500a;
            if (j6 == 0) {
                break;
            }
            long j7 = 10;
            i7--;
            bArr[i7] = g5.a.f8533a[(int) (j6 % j7)];
            j6 /= j7;
        }
        if (z5) {
            bArr[i7 - 1] = 45;
        }
        zVarT.f8502c += i6;
        this.f8461x += (long) i6;
    }

    public final void Z(long j6) {
        if (j6 == 0) {
            X(48);
            return;
        }
        long j7 = (j6 >>> 1) | j6;
        long j8 = j7 | (j7 >>> 2);
        long j9 = j8 | (j8 >>> 4);
        long j10 = j9 | (j9 >>> 8);
        long j11 = j10 | (j10 >>> 16);
        long j12 = j11 | (j11 >>> 32);
        long j13 = j12 - ((j12 >>> 1) & 6148914691236517205L);
        long j14 = ((j13 >>> 2) & 3689348814741910323L) + (j13 & 3689348814741910323L);
        long j15 = ((j14 >>> 4) + j14) & 1085102592571150095L;
        long j16 = j15 + (j15 >>> 8);
        long j17 = j16 + (j16 >>> 16);
        int i6 = (int) ((((j17 & 63) + ((j17 >>> 32) & 63)) + ((long) 3)) / ((long) 4));
        z zVarT = T(i6);
        int i7 = zVarT.f8502c;
        for (int i8 = (i7 + i6) - 1; i8 >= i7; i8--) {
            zVarT.f8500a[i8] = g5.a.f8533a[(int) (15 & j6)];
            j6 >>>= 4;
        }
        zVarT.f8502c += i6;
        this.f8461x += (long) i6;
    }

    @Override // f5.i
    public final void a(long j6) throws EOFException {
        while (j6 > 0) {
            z zVar = this.f8460w;
            if (zVar == null) {
                throw new EOFException();
            }
            int iMin = (int) Math.min(j6, zVar.f8502c - zVar.f8501b);
            long j7 = iMin;
            this.f8461x -= j7;
            j6 -= j7;
            int i6 = zVar.f8501b + iMin;
            zVar.f8501b = i6;
            if (i6 == zVar.f8502c) {
                this.f8460w = zVar.a();
                A.a(zVar);
            }
        }
    }

    public final void a0(int i6) {
        z zVarT = T(4);
        int i7 = zVarT.f8502c;
        byte[] bArr = zVarT.f8500a;
        bArr[i7] = (byte) ((i6 >>> 24) & 255);
        bArr[i7 + 1] = (byte) ((i6 >>> 16) & 255);
        bArr[i7 + 2] = (byte) ((i6 >>> 8) & 255);
        bArr[i7 + 3] = (byte) (i6 & 255);
        zVarT.f8502c = i7 + 4;
        this.f8461x += 4;
    }

    public final void b0(int i6) {
        z zVarT = T(2);
        int i7 = zVarT.f8502c;
        byte[] bArr = zVarT.f8500a;
        bArr[i7] = (byte) ((i6 >>> 8) & 255);
        bArr[i7 + 1] = (byte) (i6 & 255);
        zVarT.f8502c = i7 + 2;
        this.f8461x += 2;
    }

    public final void c0(String str) {
        AbstractC1305a.o(str, "string");
        d0(str, 0, str.length());
    }

    public final Object clone() {
        C0710g c0710g = new C0710g();
        if (this.f8461x != 0) {
            z zVar = this.f8460w;
            AbstractC1305a.l(zVar);
            z zVarC = zVar.c();
            c0710g.f8460w = zVarC;
            zVarC.f8506g = zVarC;
            zVarC.f8505f = zVarC;
            for (z zVar2 = zVar.f8505f; zVar2 != zVar; zVar2 = zVar2.f8505f) {
                z zVar3 = zVarC.f8506g;
                AbstractC1305a.l(zVar3);
                AbstractC1305a.l(zVar2);
                zVar3.b(zVar2.c());
            }
            c0710g.f8461x = this.f8461x;
        }
        return c0710g;
    }

    @Override // f5.E
    public final G d() {
        return G.f8433d;
    }

    public final void d0(String str, int i6, int i7) {
        char cCharAt;
        long j6;
        long j7;
        AbstractC1305a.o(str, "string");
        if (i6 < 0) {
            throw new IllegalArgumentException(AbstractC0628i.f("beginIndex < 0: ", i6).toString());
        }
        if (i7 < i6) {
            throw new IllegalArgumentException(H1.a.k("endIndex < beginIndex: ", i7, " < ", i6).toString());
        }
        if (i7 > str.length()) {
            StringBuilder sbL = H1.a.l("endIndex > string.length: ", i7, " > ");
            sbL.append(str.length());
            throw new IllegalArgumentException(sbL.toString().toString());
        }
        while (i6 < i7) {
            char cCharAt2 = str.charAt(i6);
            if (cCharAt2 < 128) {
                z zVarT = T(1);
                int i8 = zVarT.f8502c - i6;
                int iMin = Math.min(i7, 8192 - i8);
                int i9 = i6 + 1;
                byte[] bArr = zVarT.f8500a;
                bArr[i6 + i8] = (byte) cCharAt2;
                while (true) {
                    i6 = i9;
                    if (i6 >= iMin || (cCharAt = str.charAt(i6)) >= 128) {
                        break;
                    }
                    i9 = i6 + 1;
                    bArr[i6 + i8] = (byte) cCharAt;
                }
                int i10 = zVarT.f8502c;
                int i11 = (i8 + i6) - i10;
                zVarT.f8502c = i10 + i11;
                this.f8461x += (long) i11;
            } else {
                if (cCharAt2 < 2048) {
                    z zVarT2 = T(2);
                    int i12 = zVarT2.f8502c;
                    byte[] bArr2 = zVarT2.f8500a;
                    bArr2[i12] = (byte) ((cCharAt2 >> 6) | 192);
                    bArr2[i12 + 1] = (byte) ((cCharAt2 & '?') | 128);
                    zVarT2.f8502c = i12 + 2;
                    j6 = this.f8461x;
                    j7 = 2;
                } else if (cCharAt2 < 55296 || cCharAt2 > 57343) {
                    z zVarT3 = T(3);
                    int i13 = zVarT3.f8502c;
                    byte[] bArr3 = zVarT3.f8500a;
                    bArr3[i13] = (byte) ((cCharAt2 >> '\f') | 224);
                    bArr3[i13 + 1] = (byte) ((63 & (cCharAt2 >> 6)) | 128);
                    bArr3[i13 + 2] = (byte) ((cCharAt2 & '?') | 128);
                    zVarT3.f8502c = i13 + 3;
                    j6 = this.f8461x;
                    j7 = 3;
                } else {
                    int i14 = i6 + 1;
                    char cCharAt3 = i14 < i7 ? str.charAt(i14) : (char) 0;
                    if (cCharAt2 > 56319 || 56320 > cCharAt3 || cCharAt3 >= 57344) {
                        X(63);
                        i6 = i14;
                    } else {
                        int i15 = (((cCharAt2 & 1023) << 10) | (cCharAt3 & 1023)) + 65536;
                        z zVarT4 = T(4);
                        int i16 = zVarT4.f8502c;
                        byte[] bArr4 = zVarT4.f8500a;
                        bArr4[i16] = (byte) ((i15 >> 18) | 240);
                        bArr4[i16 + 1] = (byte) (((i15 >> 12) & 63) | 128);
                        bArr4[i16 + 2] = (byte) (((i15 >> 6) & 63) | 128);
                        bArr4[i16 + 3] = (byte) ((i15 & 63) | 128);
                        zVarT4.f8502c = i16 + 4;
                        this.f8461x += 4;
                        i6 += 2;
                    }
                }
                this.f8461x = j6 + j7;
                i6++;
            }
        }
    }

    @Override // f5.InterfaceC0711h
    public final InterfaceC0711h e(byte[] bArr) {
        AbstractC1305a.o(bArr, "source");
        V(bArr, 0, bArr.length);
        return this;
    }

    public final void e0(int i6) {
        String str;
        long j6;
        long j7;
        int i7 = 0;
        if (i6 < 128) {
            X(i6);
            return;
        }
        if (i6 < 2048) {
            z zVarT = T(2);
            int i8 = zVarT.f8502c;
            byte[] bArr = zVarT.f8500a;
            bArr[i8] = (byte) ((i6 >> 6) | 192);
            bArr[1 + i8] = (byte) ((i6 & 63) | 128);
            zVarT.f8502c = i8 + 2;
            j6 = this.f8461x;
            j7 = 2;
        } else {
            if (55296 <= i6 && i6 < 57344) {
                X(63);
                return;
            }
            if (i6 < 65536) {
                z zVarT2 = T(3);
                int i9 = zVarT2.f8502c;
                byte[] bArr2 = zVarT2.f8500a;
                bArr2[i9] = (byte) ((i6 >> 12) | 224);
                bArr2[1 + i9] = (byte) (((i6 >> 6) & 63) | 128);
                bArr2[2 + i9] = (byte) ((i6 & 63) | 128);
                zVarT2.f8502c = i9 + 3;
                j6 = this.f8461x;
                j7 = 3;
            } else {
                if (i6 > 1114111) {
                    StringBuilder sb = new StringBuilder("Unexpected code point: 0x");
                    if (i6 != 0) {
                        char[] cArr = g5.b.f8534a;
                        char[] cArr2 = {cArr[(i6 >> 28) & 15], cArr[(i6 >> 24) & 15], cArr[(i6 >> 20) & 15], cArr[(i6 >> 16) & 15], cArr[(i6 >> 12) & 15], cArr[(i6 >> 8) & 15], cArr[(i6 >> 4) & 15], cArr[i6 & 15]};
                        while (i7 < 8 && cArr2[i7] == '0') {
                            i7++;
                        }
                        if (i7 < 0) {
                            throw new IndexOutOfBoundsException(H1.a.j("startIndex: ", i7, ", endIndex: 8, size: 8"));
                        }
                        if (i7 > 8) {
                            throw new IllegalArgumentException(H1.a.j("startIndex: ", i7, " > endIndex: 8"));
                        }
                        str = new String(cArr2, i7, 8 - i7);
                    } else {
                        str = "0";
                    }
                    sb.append(str);
                    throw new IllegalArgumentException(sb.toString());
                }
                z zVarT3 = T(4);
                int i10 = zVarT3.f8502c;
                byte[] bArr3 = zVarT3.f8500a;
                bArr3[i10] = (byte) ((i6 >> 18) | 240);
                bArr3[1 + i10] = (byte) (((i6 >> 12) & 63) | 128);
                bArr3[2 + i10] = (byte) (((i6 >> 6) & 63) | 128);
                bArr3[3 + i10] = (byte) ((i6 & 63) | 128);
                zVarT3.f8502c = i10 + 4;
                j6 = this.f8461x;
                j7 = 4;
            }
        }
        this.f8461x = j6 + j7;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C0710g) {
                long j6 = this.f8461x;
                C0710g c0710g = (C0710g) obj;
                if (j6 == c0710g.f8461x) {
                    if (j6 != 0) {
                        z zVar = this.f8460w;
                        AbstractC1305a.l(zVar);
                        z zVar2 = c0710g.f8460w;
                        AbstractC1305a.l(zVar2);
                        int i6 = zVar.f8501b;
                        int i7 = zVar2.f8501b;
                        long j7 = 0;
                        while (j7 < this.f8461x) {
                            long jMin = Math.min(zVar.f8502c - i6, zVar2.f8502c - i7);
                            long j8 = 0;
                            while (j8 < jMin) {
                                int i8 = i6 + 1;
                                byte b6 = zVar.f8500a[i6];
                                int i9 = i7 + 1;
                                if (b6 == zVar2.f8500a[i7]) {
                                    j8++;
                                    i7 = i9;
                                    i6 = i8;
                                }
                            }
                            if (i6 == zVar.f8502c) {
                                z zVar3 = zVar.f8505f;
                                AbstractC1305a.l(zVar3);
                                i6 = zVar3.f8501b;
                                zVar = zVar3;
                            }
                            if (i7 == zVar2.f8502c) {
                                zVar2 = zVar2.f8505f;
                                AbstractC1305a.l(zVar2);
                                i7 = zVar2.f8501b;
                            }
                            j7 += jMin;
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    @Override // f5.InterfaceC0711h
    public final /* bridge */ /* synthetic */ InterfaceC0711h f(byte[] bArr, int i6, int i7) {
        V(bArr, i6, i7);
        return this;
    }

    public final int hashCode() {
        z zVar = this.f8460w;
        if (zVar == null) {
            return 0;
        }
        int i6 = 1;
        do {
            int i7 = zVar.f8502c;
            for (int i8 = zVar.f8501b; i8 < i7; i8++) {
                i6 = (i6 * 31) + zVar.f8500a[i8];
            }
            zVar = zVar.f8505f;
            AbstractC1305a.l(zVar);
        } while (zVar != this.f8460w);
        return i6;
    }

    @Override // f5.InterfaceC0711h
    public final /* bridge */ /* synthetic */ InterfaceC0711h i(long j6) {
        Z(j6);
        return this;
    }

    @Override // java.nio.channels.Channel
    public final boolean isOpen() {
        return true;
    }

    public final void k() throws EOFException {
        a(this.f8461x);
    }

    public final long l() {
        long j6 = this.f8461x;
        if (j6 == 0) {
            return 0L;
        }
        z zVar = this.f8460w;
        AbstractC1305a.l(zVar);
        z zVar2 = zVar.f8506g;
        AbstractC1305a.l(zVar2);
        int i6 = zVar2.f8502c;
        if (i6 < 8192 && zVar2.f8504e) {
            j6 -= (long) (i6 - zVar2.f8501b);
        }
        return j6;
    }

    @Override // f5.i
    public final j m(long j6) throws EOFException {
        if (j6 < 0 || j6 > 2147483647L) {
            throw new IllegalArgumentException(AbstractC0628i.g("byteCount: ", j6).toString());
        }
        if (this.f8461x < j6) {
            throw new EOFException();
        }
        if (j6 < 4096) {
            return new j(O(j6));
        }
        j jVarS = S((int) j6);
        a(j6);
        return jVarS;
    }

    public final void n(long j6, long j7, C0710g c0710g) {
        AbstractC1305a.o(c0710g, "out");
        AbstractC0651b.g(this.f8461x, j6, j7);
        if (j7 == 0) {
            return;
        }
        c0710g.f8461x += j7;
        z zVar = this.f8460w;
        while (true) {
            AbstractC1305a.l(zVar);
            long j8 = zVar.f8502c - zVar.f8501b;
            if (j6 < j8) {
                break;
            }
            j6 -= j8;
            zVar = zVar.f8505f;
        }
        while (j7 > 0) {
            AbstractC1305a.l(zVar);
            z zVarC = zVar.c();
            int i6 = zVarC.f8501b + ((int) j6);
            zVarC.f8501b = i6;
            zVarC.f8502c = Math.min(i6 + ((int) j7), zVarC.f8502c);
            z zVar2 = c0710g.f8460w;
            if (zVar2 == null) {
                zVarC.f8506g = zVarC;
                zVarC.f8505f = zVarC;
                c0710g.f8460w = zVarC;
            } else {
                z zVar3 = zVar2.f8506g;
                AbstractC1305a.l(zVar3);
                zVar3.b(zVarC);
            }
            j7 -= (long) (zVarC.f8502c - zVarC.f8501b);
            zVar = zVar.f8505f;
            j6 = 0;
        }
    }

    @Override // f5.i
    public final long o() throws EOFException {
        long j6;
        if (this.f8461x < 8) {
            throw new EOFException();
        }
        z zVar = this.f8460w;
        AbstractC1305a.l(zVar);
        int i6 = zVar.f8501b;
        int i7 = zVar.f8502c;
        if (i7 - i6 < 8) {
            j6 = ((((long) readInt()) & 4294967295L) << 32) | (4294967295L & ((long) readInt()));
        } else {
            byte[] bArr = zVar.f8500a;
            int i8 = i6 + 7;
            long j7 = ((((long) bArr[i6]) & 255) << 56) | ((((long) bArr[i6 + 1]) & 255) << 48) | ((((long) bArr[i6 + 2]) & 255) << 40) | ((((long) bArr[i6 + 3]) & 255) << 32) | ((((long) bArr[i6 + 4]) & 255) << 24) | ((((long) bArr[i6 + 5]) & 255) << 16) | ((((long) bArr[i6 + 6]) & 255) << 8);
            int i9 = i6 + 8;
            long j8 = j7 | (((long) bArr[i8]) & 255);
            this.f8461x -= 8;
            if (i9 == i7) {
                this.f8460w = zVar.a();
                A.a(zVar);
            } else {
                zVar.f8501b = i9;
            }
            j6 = j8;
        }
        return ((j6 & 255) << 56) | (((-72057594037927936L) & j6) >>> 56) | ((71776119061217280L & j6) >>> 40) | ((280375465082880L & j6) >>> 24) | ((1095216660480L & j6) >>> 8) | ((4278190080L & j6) << 8) | ((16711680 & j6) << 24) | ((65280 & j6) << 40);
    }

    @Override // f5.i
    public final String p(long j6) throws EOFException {
        if (j6 < 0) {
            throw new IllegalArgumentException(AbstractC0628i.g("limit < 0: ", j6).toString());
        }
        long j7 = j6 != Long.MAX_VALUE ? j6 + 1 : Long.MAX_VALUE;
        long J5 = J((byte) 10, 0L, j7);
        if (J5 != -1) {
            return g5.a.a(this, J5);
        }
        if (j7 < this.f8461x && u(j7 - 1) == 13 && u(j7) == 10) {
            return g5.a.a(this, j7);
        }
        C0710g c0710g = new C0710g();
        n(0L, Math.min(32, this.f8461x), c0710g);
        throw new EOFException("\\n not found: limit=" + Math.min(this.f8461x, j6) + " content=" + c0710g.m(c0710g.f8461x).e() + (char) 8230);
    }

    @Override // f5.C
    public final void q(C0710g c0710g, long j6) {
        z zVarB;
        AbstractC1305a.o(c0710g, "source");
        if (c0710g == this) {
            throw new IllegalArgumentException("source == this".toString());
        }
        AbstractC0651b.g(c0710g.f8461x, 0L, j6);
        while (j6 > 0) {
            z zVar = c0710g.f8460w;
            AbstractC1305a.l(zVar);
            int i6 = zVar.f8502c;
            z zVar2 = c0710g.f8460w;
            AbstractC1305a.l(zVar2);
            long j7 = i6 - zVar2.f8501b;
            int i7 = 0;
            if (j6 < j7) {
                z zVar3 = this.f8460w;
                z zVar4 = zVar3 != null ? zVar3.f8506g : null;
                if (zVar4 != null && zVar4.f8504e) {
                    if ((((long) zVar4.f8502c) + j6) - ((long) (zVar4.f8503d ? 0 : zVar4.f8501b)) <= 8192) {
                        z zVar5 = c0710g.f8460w;
                        AbstractC1305a.l(zVar5);
                        zVar5.d(zVar4, (int) j6);
                        c0710g.f8461x -= j6;
                        this.f8461x += j6;
                        return;
                    }
                }
                z zVar6 = c0710g.f8460w;
                AbstractC1305a.l(zVar6);
                int i8 = (int) j6;
                if (i8 <= 0 || i8 > zVar6.f8502c - zVar6.f8501b) {
                    throw new IllegalArgumentException("byteCount out of range".toString());
                }
                if (i8 >= 1024) {
                    zVarB = zVar6.c();
                } else {
                    zVarB = A.b();
                    int i9 = zVar6.f8501b;
                    AbstractC1353j.b0(0, i9, i9 + i8, zVar6.f8500a, zVarB.f8500a);
                }
                zVarB.f8502c = zVarB.f8501b + i8;
                zVar6.f8501b += i8;
                z zVar7 = zVar6.f8506g;
                AbstractC1305a.l(zVar7);
                zVar7.b(zVarB);
                c0710g.f8460w = zVarB;
            }
            z zVar8 = c0710g.f8460w;
            AbstractC1305a.l(zVar8);
            long j8 = zVar8.f8502c - zVar8.f8501b;
            c0710g.f8460w = zVar8.a();
            z zVar9 = this.f8460w;
            if (zVar9 == null) {
                this.f8460w = zVar8;
                zVar8.f8506g = zVar8;
                zVar8.f8505f = zVar8;
            } else {
                z zVar10 = zVar9.f8506g;
                AbstractC1305a.l(zVar10);
                zVar10.b(zVar8);
                z zVar11 = zVar8.f8506g;
                if (zVar11 == zVar8) {
                    throw new IllegalStateException("cannot compact".toString());
                }
                AbstractC1305a.l(zVar11);
                if (zVar11.f8504e) {
                    int i10 = zVar8.f8502c - zVar8.f8501b;
                    z zVar12 = zVar8.f8506g;
                    AbstractC1305a.l(zVar12);
                    int i11 = 8192 - zVar12.f8502c;
                    z zVar13 = zVar8.f8506g;
                    AbstractC1305a.l(zVar13);
                    if (!zVar13.f8503d) {
                        z zVar14 = zVar8.f8506g;
                        AbstractC1305a.l(zVar14);
                        i7 = zVar14.f8501b;
                    }
                    if (i10 <= i11 + i7) {
                        z zVar15 = zVar8.f8506g;
                        AbstractC1305a.l(zVar15);
                        zVar8.d(zVar15, i10);
                        zVar8.a();
                        A.a(zVar8);
                    }
                }
            }
            c0710g.f8461x -= j8;
            this.f8461x += j8;
            j6 -= j8;
        }
    }

    @Override // f5.InterfaceC0711h
    public final /* bridge */ /* synthetic */ InterfaceC0711h r(int i6) {
        b0(i6);
        return this;
    }

    @Override // java.nio.channels.ReadableByteChannel
    public final int read(ByteBuffer byteBuffer) {
        AbstractC1305a.o(byteBuffer, "sink");
        z zVar = this.f8460w;
        if (zVar == null) {
            return -1;
        }
        int iMin = Math.min(byteBuffer.remaining(), zVar.f8502c - zVar.f8501b);
        byteBuffer.put(zVar.f8500a, zVar.f8501b, iMin);
        int i6 = zVar.f8501b + iMin;
        zVar.f8501b = i6;
        this.f8461x -= (long) iMin;
        if (i6 == zVar.f8502c) {
            this.f8460w = zVar.a();
            A.a(zVar);
        }
        return iMin;
    }

    @Override // f5.i
    public final byte readByte() throws EOFException {
        if (this.f8461x == 0) {
            throw new EOFException();
        }
        z zVar = this.f8460w;
        AbstractC1305a.l(zVar);
        int i6 = zVar.f8501b;
        int i7 = zVar.f8502c;
        int i8 = i6 + 1;
        byte b6 = zVar.f8500a[i6];
        this.f8461x--;
        if (i8 == i7) {
            this.f8460w = zVar.a();
            A.a(zVar);
        } else {
            zVar.f8501b = i8;
        }
        return b6;
    }

    @Override // f5.i
    public final int readInt() throws EOFException {
        if (this.f8461x < 4) {
            throw new EOFException();
        }
        z zVar = this.f8460w;
        AbstractC1305a.l(zVar);
        int i6 = zVar.f8501b;
        int i7 = zVar.f8502c;
        if (i7 - i6 < 4) {
            return ((readByte() & 255) << 24) | ((readByte() & 255) << 16) | ((readByte() & 255) << 8) | (readByte() & 255);
        }
        byte[] bArr = zVar.f8500a;
        int i8 = i6 + 3;
        int i9 = ((bArr[i6 + 1] & 255) << 16) | ((bArr[i6] & 255) << 24) | ((bArr[i6 + 2] & 255) << 8);
        int i10 = i6 + 4;
        int i11 = i9 | (bArr[i8] & 255);
        this.f8461x -= 4;
        if (i10 == i7) {
            this.f8460w = zVar.a();
            A.a(zVar);
        } else {
            zVar.f8501b = i10;
        }
        return i11;
    }

    @Override // f5.i
    public final short readShort() throws EOFException {
        if (this.f8461x < 2) {
            throw new EOFException();
        }
        z zVar = this.f8460w;
        AbstractC1305a.l(zVar);
        int i6 = zVar.f8501b;
        int i7 = zVar.f8502c;
        if (i7 - i6 < 2) {
            return (short) (((readByte() & 255) << 8) | (readByte() & 255));
        }
        int i8 = i6 + 1;
        byte[] bArr = zVar.f8500a;
        int i9 = (bArr[i6] & 255) << 8;
        int i10 = i6 + 2;
        int i11 = (bArr[i8] & 255) | i9;
        this.f8461x -= 2;
        if (i10 == i7) {
            this.f8460w = zVar.a();
            A.a(zVar);
        } else {
            zVar.f8501b = i10;
        }
        return (short) i11;
    }

    @Override // f5.i
    public final long s(C0710g c0710g) {
        long j6 = this.f8461x;
        if (j6 > 0) {
            c0710g.q(this, j6);
        }
        return j6;
    }

    @Override // f5.InterfaceC0711h
    public final /* bridge */ /* synthetic */ InterfaceC0711h t(j jVar) {
        U(jVar);
        return this;
    }

    public final String toString() {
        long j6 = this.f8461x;
        if (j6 <= 2147483647L) {
            return S((int) j6).toString();
        }
        throw new IllegalStateException(("size > Int.MAX_VALUE: " + this.f8461x).toString());
    }

    public final byte u(long j6) {
        AbstractC0651b.g(this.f8461x, j6, 1L);
        z zVar = this.f8460w;
        if (zVar == null) {
            AbstractC1305a.l(null);
            throw null;
        }
        long j7 = this.f8461x;
        if (j7 - j6 < j6) {
            while (j7 > j6) {
                zVar = zVar.f8506g;
                AbstractC1305a.l(zVar);
                j7 -= (long) (zVar.f8502c - zVar.f8501b);
            }
            return zVar.f8500a[(int) ((((long) zVar.f8501b) + j6) - j7)];
        }
        long j8 = 0;
        while (true) {
            int i6 = zVar.f8502c;
            int i7 = zVar.f8501b;
            long j9 = ((long) (i6 - i7)) + j8;
            if (j9 > j6) {
                return zVar.f8500a[(int) ((((long) i7) + j6) - j8)];
            }
            zVar = zVar.f8505f;
            AbstractC1305a.l(zVar);
            j8 = j9;
        }
    }

    @Override // f5.i
    public final int v(v vVar) throws EOFException {
        AbstractC1305a.o(vVar, "options");
        int iB = g5.a.b(this, vVar, false);
        if (iB == -1) {
            return -1;
        }
        a(vVar.f8490w[iB].d());
        return iB;
    }

    @Override // f5.InterfaceC0711h
    public final /* bridge */ /* synthetic */ InterfaceC0711h w(int i6) {
        a0(i6);
        return this;
    }

    @Override // java.nio.channels.WritableByteChannel
    public final int write(ByteBuffer byteBuffer) {
        AbstractC1305a.o(byteBuffer, "source");
        int iRemaining = byteBuffer.remaining();
        int i6 = iRemaining;
        while (i6 > 0) {
            z zVarT = T(1);
            int iMin = Math.min(i6, 8192 - zVarT.f8502c);
            byteBuffer.get(zVarT.f8500a, zVarT.f8502c, iMin);
            i6 -= iMin;
            zVarT.f8502c += iMin;
        }
        this.f8461x += (long) iRemaining;
        return iRemaining;
    }

    @Override // f5.i
    public final String x() {
        return p(Long.MAX_VALUE);
    }

    @Override // f5.i
    public final void y(long j6) throws EOFException {
        if (this.f8461x < j6) {
            throw new EOFException();
        }
    }

    @Override // f5.InterfaceC0711h
    public final /* bridge */ /* synthetic */ InterfaceC0711h z(String str) {
        c0(str);
        return this;
    }

    @Override // f5.i
    public final C0710g D() {
        return this;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable, java.nio.channels.Channel, f5.C
    public final void close() {
    }

    @Override // f5.InterfaceC0711h, f5.C, java.io.Flushable
    public final void flush() {
    }

    @Override // f5.InterfaceC0711h
    public final C0710g j() {
        return this;
    }
}
