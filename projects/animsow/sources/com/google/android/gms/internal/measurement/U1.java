package com.google.android.gms.internal.measurement;

import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;

/* JADX INFO: loaded from: classes.dex */
public abstract class U1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static T1 f6703a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f6704b = {1, 2, 3, 4, 5, 6, 7};

    public static double a(int i6, byte[] bArr) {
        return Double.longBitsToDouble(p(i6, bArr));
    }

    public static int b(int i6, byte[] bArr, int i7, int i8, R2 r22, C0503u2 c0503u2) {
        L2 l22 = (L2) r22;
        int iN = n(bArr, i7, c0503u2);
        while (true) {
            l22.g(c0503u2.f6967a);
            if (iN >= i8) {
                break;
            }
            int iN2 = n(bArr, iN, c0503u2);
            if (i6 != c0503u2.f6967a) {
                break;
            }
            iN = n(bArr, iN2, c0503u2);
        }
        return iN;
    }

    public static int c(int i6, byte[] bArr, int i7, int i8, C0475p3 c0475p3, C0503u2 c0503u2) throws Q2 {
        if ((i6 >>> 3) == 0) {
            throw new Q2("Protocol message contained an invalid tag (zero).");
        }
        int i9 = i6 & 7;
        if (i9 == 0) {
            int iO = o(bArr, i7, c0503u2);
            c0475p3.c(i6, Long.valueOf(c0503u2.f6968b));
            return iO;
        }
        if (i9 == 1) {
            c0475p3.c(i6, Long.valueOf(p(i7, bArr)));
            return i7 + 8;
        }
        if (i9 == 2) {
            int iN = n(bArr, i7, c0503u2);
            int i10 = c0503u2.f6967a;
            if (i10 < 0) {
                throw Q2.b();
            }
            if (i10 > bArr.length - iN) {
                throw Q2.d();
            }
            c0475p3.c(i6, i10 == 0 ? AbstractC0527y2.f7008x : AbstractC0527y2.g(bArr, iN, i10));
            return iN + i10;
        }
        if (i9 != 3) {
            if (i9 != 5) {
                throw new Q2("Protocol message contained an invalid tag (zero).");
            }
            c0475p3.c(i6, Integer.valueOf(m(i7, bArr)));
            return i7 + 4;
        }
        C0475p3 c0475p3F = C0475p3.f();
        int i11 = (i6 & (-8)) | 4;
        int i12 = c0503u2.f6970d + 1;
        c0503u2.f6970d = i12;
        if (i12 >= 100) {
            throw new Q2("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
        }
        int i13 = 0;
        while (true) {
            if (i7 >= i8) {
                break;
            }
            int iN2 = n(bArr, i7, c0503u2);
            int i14 = c0503u2.f6967a;
            i13 = i14;
            if (i14 == i11) {
                i7 = iN2;
                break;
            }
            int iC = c(i13, bArr, iN2, i8, c0475p3F, c0503u2);
            i13 = i14;
            i7 = iC;
        }
        c0503u2.f6970d--;
        if (i7 > i8 || i13 != i11) {
            throw Q2.c();
        }
        c0475p3.c(i6, c0475p3F);
        return i7;
    }

    public static int d(int i6, byte[] bArr, int i7, C0503u2 c0503u2) {
        int i8;
        int i9 = i6 & ModuleDescriptor.MODULE_VERSION;
        int i10 = i7 + 1;
        byte b6 = bArr[i7];
        if (b6 >= 0) {
            i8 = b6 << 7;
        } else {
            int i11 = i9 | ((b6 & 127) << 7);
            int i12 = i7 + 2;
            byte b7 = bArr[i10];
            if (b7 >= 0) {
                c0503u2.f6967a = i11 | (b7 << 14);
                return i12;
            }
            i9 = i11 | ((b7 & 127) << 14);
            i10 = i7 + 3;
            byte b8 = bArr[i12];
            if (b8 >= 0) {
                i8 = b8 << 21;
            } else {
                int i13 = i9 | ((b8 & 127) << 21);
                int i14 = i7 + 4;
                byte b9 = bArr[i10];
                if (b9 >= 0) {
                    c0503u2.f6967a = i13 | (b9 << 28);
                    return i14;
                }
                int i15 = i13 | ((b9 & 127) << 28);
                while (true) {
                    int i16 = i14 + 1;
                    if (bArr[i14] >= 0) {
                        c0503u2.f6967a = i15;
                        return i16;
                    }
                    i14 = i16;
                }
            }
        }
        c0503u2.f6967a = i9 | i8;
        return i10;
    }

    public static int e(InterfaceC0457m3 interfaceC0457m3, int i6, byte[] bArr, int i7, int i8, R2 r22, C0503u2 c0503u2) throws Q2 {
        int i9 = (i6 & (-8)) | 4;
        I2 i2A = interfaceC0457m3.a();
        int iF = f(i2A, interfaceC0457m3, bArr, i7, i8, i9, c0503u2);
        interfaceC0457m3.i(i2A);
        c0503u2.f6969c = i2A;
        r22.add(i2A);
        while (iF < i8) {
            int iN = n(bArr, iF, c0503u2);
            if (i6 != c0503u2.f6967a) {
                break;
            }
            I2 i2A2 = interfaceC0457m3.a();
            int iF2 = f(i2A2, interfaceC0457m3, bArr, iN, i8, i9, c0503u2);
            interfaceC0457m3.i(i2A2);
            c0503u2.f6969c = i2A2;
            r22.add(i2A2);
            iF = iF2;
        }
        return iF;
    }

    public static int f(Object obj, InterfaceC0457m3 interfaceC0457m3, byte[] bArr, int i6, int i7, int i8, C0503u2 c0503u2) throws Q2 {
        C0415f3 c0415f3 = (C0415f3) interfaceC0457m3;
        int i9 = c0503u2.f6970d + 1;
        c0503u2.f6970d = i9;
        if (i9 >= 100) {
            throw new Q2("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
        }
        int iK = c0415f3.k(obj, bArr, i6, i7, i8, c0503u2);
        c0503u2.f6970d--;
        c0503u2.f6969c = obj;
        return iK;
    }

    public static int g(Object obj, InterfaceC0457m3 interfaceC0457m3, byte[] bArr, int i6, int i7, C0503u2 c0503u2) throws Q2 {
        int iD = i6 + 1;
        int i8 = bArr[i6];
        if (i8 < 0) {
            iD = d(i8, bArr, iD, c0503u2);
            i8 = c0503u2.f6967a;
        }
        int i9 = iD;
        if (i8 < 0 || i8 > i7 - i9) {
            throw Q2.d();
        }
        int i10 = c0503u2.f6970d + 1;
        c0503u2.f6970d = i10;
        if (i10 >= 100) {
            throw new Q2("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
        }
        int i11 = i8 + i9;
        interfaceC0457m3.e(obj, bArr, i9, i11, c0503u2);
        c0503u2.f6970d--;
        c0503u2.f6969c = obj;
        return i11;
    }

    public static int h(byte[] bArr, int i6, C0503u2 c0503u2) throws Q2 {
        int iN = n(bArr, i6, c0503u2);
        int i7 = c0503u2.f6967a;
        if (i7 < 0) {
            throw Q2.b();
        }
        if (i7 > bArr.length - iN) {
            throw Q2.d();
        }
        if (i7 == 0) {
            c0503u2.f6969c = AbstractC0527y2.f7008x;
            return iN;
        }
        c0503u2.f6969c = AbstractC0527y2.g(bArr, iN, i7);
        return iN + i7;
    }

    public static int i(byte[] bArr, int i6, R2 r22, C0503u2 c0503u2) throws Q2 {
        L2 l22 = (L2) r22;
        int iN = n(bArr, i6, c0503u2);
        int i7 = c0503u2.f6967a + iN;
        while (iN < i7) {
            iN = n(bArr, iN, c0503u2);
            l22.g(c0503u2.f6967a);
        }
        if (iN == i7) {
            return iN;
        }
        throw Q2.d();
    }

    public static float j(int i6, byte[] bArr) {
        return Float.intBitsToFloat(m(i6, bArr));
    }

    public static int k(InterfaceC0457m3 interfaceC0457m3, int i6, byte[] bArr, int i7, int i8, R2 r22, C0503u2 c0503u2) throws Q2 {
        I2 i2A = interfaceC0457m3.a();
        int iG = g(i2A, interfaceC0457m3, bArr, i7, i8, c0503u2);
        interfaceC0457m3.i(i2A);
        c0503u2.f6969c = i2A;
        r22.add(i2A);
        while (iG < i8) {
            int iN = n(bArr, iG, c0503u2);
            if (i6 != c0503u2.f6967a) {
                break;
            }
            I2 i2A2 = interfaceC0457m3.a();
            int iG2 = g(i2A2, interfaceC0457m3, bArr, iN, i8, c0503u2);
            interfaceC0457m3.i(i2A2);
            c0503u2.f6969c = i2A2;
            r22.add(i2A2);
            iG = iG2;
        }
        return iG;
    }

    public static int l(byte[] bArr, int i6, C0503u2 c0503u2) throws Q2 {
        int iN = n(bArr, i6, c0503u2);
        int i7 = c0503u2.f6967a;
        if (i7 < 0) {
            throw Q2.b();
        }
        if (i7 == 0) {
            c0503u2.f6969c = "";
            return iN;
        }
        AbstractC0504u3.f6971a.getClass();
        if ((iN | i7 | ((bArr.length - iN) - i7)) < 0) {
            throw new ArrayIndexOutOfBoundsException(String.format("buffer length=%d, index=%d, size=%d", Integer.valueOf(bArr.length), Integer.valueOf(iN), Integer.valueOf(i7)));
        }
        int i8 = iN + i7;
        char[] cArr = new char[i7];
        int i9 = 0;
        while (iN < i8) {
            byte b6 = bArr[iN];
            if (b6 < 0) {
                break;
            }
            iN++;
            cArr[i9] = (char) b6;
            i9++;
        }
        while (iN < i8) {
            int i10 = iN + 1;
            byte b7 = bArr[iN];
            if (b7 >= 0) {
                int i11 = i9 + 1;
                cArr[i9] = (char) b7;
                while (i10 < i8) {
                    byte b8 = bArr[i10];
                    if (b8 < 0) {
                        break;
                    }
                    i10++;
                    cArr[i11] = (char) b8;
                    i11++;
                }
                i9 = i11;
                iN = i10;
            } else if (b7 < -32) {
                if (i10 >= i8) {
                    throw Q2.a();
                }
                iN += 2;
                byte b9 = bArr[i10];
                int i12 = i9 + 1;
                if (b7 < -62 || F2.o(b9)) {
                    throw Q2.a();
                }
                cArr[i9] = (char) ((b9 & 63) | ((b7 & 31) << 6));
                i9 = i12;
            } else {
                if (b7 >= -16) {
                    if (i10 >= i8 - 2) {
                        throw Q2.a();
                    }
                    byte b10 = bArr[i10];
                    int i13 = iN + 3;
                    byte b11 = bArr[iN + 2];
                    iN += 4;
                    byte b12 = bArr[i13];
                    int i14 = i9 + 1;
                    if (!F2.o(b10)) {
                        if ((((b10 + 112) + (b7 << 28)) >> 30) == 0 && !F2.o(b11) && !F2.o(b12)) {
                            int i15 = ((b10 & 63) << 12) | ((b7 & 7) << 18) | ((b11 & 63) << 6) | (b12 & 63);
                            cArr[i9] = (char) ((i15 >>> 10) + 55232);
                            cArr[i14] = (char) ((i15 & 1023) + 56320);
                            i9 += 2;
                        }
                    }
                    throw Q2.a();
                }
                if (i10 >= i8 - 1) {
                    throw Q2.a();
                }
                int i16 = iN + 2;
                byte b13 = bArr[i10];
                iN += 3;
                byte b14 = bArr[i16];
                int i17 = i9 + 1;
                if (F2.o(b13) || ((b7 == -32 && b13 < -96) || ((b7 == -19 && b13 >= -96) || F2.o(b14)))) {
                    throw Q2.a();
                }
                cArr[i9] = (char) (((b13 & 63) << 6) | ((b7 & 15) << 12) | (b14 & 63));
                i9 = i17;
            }
        }
        c0503u2.f6969c = new String(cArr, 0, i9);
        return i8;
    }

    public static int m(int i6, byte[] bArr) {
        return ((bArr[i6 + 3] & 255) << 24) | (bArr[i6] & 255) | ((bArr[i6 + 1] & 255) << 8) | ((bArr[i6 + 2] & 255) << 16);
    }

    public static int n(byte[] bArr, int i6, C0503u2 c0503u2) {
        int i7 = i6 + 1;
        byte b6 = bArr[i6];
        if (b6 < 0) {
            return d(b6, bArr, i7, c0503u2);
        }
        c0503u2.f6967a = b6;
        return i7;
    }

    public static int o(byte[] bArr, int i6, C0503u2 c0503u2) {
        int i7 = i6 + 1;
        long j6 = bArr[i6];
        if (j6 >= 0) {
            c0503u2.f6968b = j6;
            return i7;
        }
        int i8 = i6 + 2;
        byte b6 = bArr[i7];
        long j7 = (j6 & 127) | (((long) (b6 & 127)) << 7);
        int i9 = 7;
        while (b6 < 0) {
            int i10 = i8 + 1;
            byte b7 = bArr[i8];
            i9 += 7;
            j7 |= ((long) (b7 & 127)) << i9;
            b6 = b7;
            i8 = i10;
        }
        c0503u2.f6968b = j7;
        return i8;
    }

    public static long p(int i6, byte[] bArr) {
        return ((((long) bArr[i6 + 7]) & 255) << 56) | (((long) bArr[i6]) & 255) | ((((long) bArr[i6 + 1]) & 255) << 8) | ((((long) bArr[i6 + 2]) & 255) << 16) | ((((long) bArr[i6 + 3]) & 255) << 24) | ((((long) bArr[i6 + 4]) & 255) << 32) | ((((long) bArr[i6 + 5]) & 255) << 40) | ((((long) bArr[i6 + 6]) & 255) << 48);
    }
}
