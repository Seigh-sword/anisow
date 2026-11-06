package com.google.android.gms.internal.measurement;

import d.AbstractC0628i;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.u3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0504u3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final J2 f6971a;

    static {
        if (AbstractC0492s3.f6955e) {
            boolean z5 = AbstractC0492s3.f6954d;
        }
        f6971a = new J2();
    }

    public static int a(String str) {
        int length = str.length();
        int i6 = 0;
        int i7 = 0;
        while (i7 < length && str.charAt(i7) < 128) {
            i7++;
        }
        int i8 = length;
        while (true) {
            if (i7 >= length) {
                break;
            }
            char cCharAt = str.charAt(i7);
            if (cCharAt < 2048) {
                i8 += (127 - cCharAt) >>> 31;
                i7++;
            } else {
                int length2 = str.length();
                while (i7 < length2) {
                    char cCharAt2 = str.charAt(i7);
                    if (cCharAt2 < 2048) {
                        i6 += (127 - cCharAt2) >>> 31;
                    } else {
                        i6 += 2;
                        if (55296 <= cCharAt2 && cCharAt2 <= 57343) {
                            if (Character.codePointAt(str, i7) < 65536) {
                                throw new C0510v3(i7, length2);
                            }
                            i7++;
                        }
                    }
                    i7++;
                }
                i8 += i6;
            }
        }
        if (i8 >= length) {
            return i8;
        }
        throw new IllegalArgumentException(AbstractC0628i.g("UTF-8 length does not fit in int: ", ((long) i8) + 4294967296L));
    }

    public static int b(String str, byte[] bArr, int i6, int i7) {
        int i8;
        int i9;
        char cCharAt;
        f6971a.getClass();
        int length = str.length();
        int i10 = i7 + i6;
        int i11 = 0;
        while (i11 < length && (i9 = i11 + i6) < i10 && (cCharAt = str.charAt(i11)) < 128) {
            bArr[i9] = (byte) cCharAt;
            i11++;
        }
        if (i11 == length) {
            return i6 + length;
        }
        int i12 = i6 + i11;
        while (i11 < length) {
            char cCharAt2 = str.charAt(i11);
            if (cCharAt2 < 128 && i12 < i10) {
                bArr[i12] = (byte) cCharAt2;
                i12++;
            } else if (cCharAt2 < 2048 && i12 <= i10 - 2) {
                int i13 = i12 + 1;
                bArr[i12] = (byte) ((cCharAt2 >>> 6) | 960);
                i12 += 2;
                bArr[i13] = (byte) ((cCharAt2 & '?') | 128);
            } else {
                if ((cCharAt2 >= 55296 && 57343 >= cCharAt2) || i12 > i10 - 3) {
                    if (i12 > i10 - 4) {
                        if (55296 <= cCharAt2 && cCharAt2 <= 57343 && ((i8 = i11 + 1) == str.length() || !Character.isSurrogatePair(cCharAt2, str.charAt(i8)))) {
                            throw new C0510v3(i11, length);
                        }
                        throw new ArrayIndexOutOfBoundsException("Failed writing " + cCharAt2 + " at index " + i12);
                    }
                    int i14 = i11 + 1;
                    if (i14 != str.length()) {
                        char cCharAt3 = str.charAt(i14);
                        if (Character.isSurrogatePair(cCharAt2, cCharAt3)) {
                            int codePoint = Character.toCodePoint(cCharAt2, cCharAt3);
                            bArr[i12] = (byte) ((codePoint >>> 18) | 240);
                            bArr[i12 + 1] = (byte) (((codePoint >>> 12) & 63) | 128);
                            int i15 = i12 + 3;
                            bArr[i12 + 2] = (byte) (((codePoint >>> 6) & 63) | 128);
                            i12 += 4;
                            bArr[i15] = (byte) ((codePoint & 63) | 128);
                            i11 = i14;
                        } else {
                            i11 = i14;
                        }
                    }
                    throw new C0510v3(i11 - 1, length);
                }
                bArr[i12] = (byte) ((cCharAt2 >>> '\f') | 480);
                int i16 = i12 + 2;
                bArr[i12 + 1] = (byte) (((cCharAt2 >>> 6) & 63) | 128);
                i12 += 3;
                bArr[i16] = (byte) ((cCharAt2 & '?') | 128);
            }
            i11++;
        }
        return i12;
    }

    public static /* synthetic */ int c(byte[] bArr, int i6, int i7) {
        byte b6 = bArr[i6 - 1];
        int i8 = i7 - i6;
        if (i8 == 0) {
            if (b6 > -12) {
                return -1;
            }
            return b6;
        }
        if (i8 == 1) {
            byte b7 = bArr[i6];
            if (b6 > -12 || b7 > -65) {
                return -1;
            }
            return (b7 << 8) ^ b6;
        }
        if (i8 != 2) {
            throw new AssertionError();
        }
        byte b8 = bArr[i6];
        byte b9 = bArr[i6 + 1];
        if (b6 > -12 || b8 > -65 || b9 > -65) {
            return -1;
        }
        return (b9 << 16) ^ ((b8 << 8) ^ b6);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:42:0x005b A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0078 A[ORIG_RETURN, RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean d(byte[] r6, int r7, int r8) {
        /*
            com.google.android.gms.internal.measurement.J2 r0 = com.google.android.gms.internal.measurement.AbstractC0504u3.f6971a
            r0.getClass()
        L5:
            if (r7 >= r8) goto Le
            r0 = r6[r7]
            if (r0 < 0) goto Le
            int r7 = r7 + 1
            goto L5
        Le:
            if (r7 < r8) goto L11
            goto L5b
        L11:
            if (r7 < r8) goto L14
            goto L5b
        L14:
            int r0 = r7 + 1
            r1 = r6[r7]
            if (r1 >= 0) goto L7a
            r2 = -32
            r3 = -65
            if (r1 >= r2) goto L2e
            if (r0 < r8) goto L23
            goto L59
        L23:
            r2 = -62
            if (r1 < r2) goto L78
            int r7 = r7 + 2
            r0 = r6[r0]
            if (r0 <= r3) goto L11
            goto L78
        L2e:
            r4 = -16
            if (r1 >= r4) goto L54
            int r4 = r8 + (-1)
            if (r0 < r4) goto L3b
        L36:
            int r1 = c(r6, r0, r8)
            goto L59
        L3b:
            int r4 = r7 + 2
            r0 = r6[r0]
            if (r0 > r3) goto L78
            r5 = -96
            if (r1 != r2) goto L47
            if (r0 < r5) goto L78
        L47:
            r2 = -19
            if (r1 != r2) goto L4d
            if (r0 >= r5) goto L78
        L4d:
            int r7 = r7 + 3
            r0 = r6[r4]
            if (r0 <= r3) goto L11
            goto L78
        L54:
            int r2 = r8 + (-2)
            if (r0 < r2) goto L5d
            goto L36
        L59:
            if (r1 != 0) goto L78
        L5b:
            r6 = 1
            return r6
        L5d:
            int r2 = r7 + 2
            r0 = r6[r0]
            if (r0 > r3) goto L78
            int r1 = r1 << 28
            int r0 = r0 + 112
            int r0 = r0 + r1
            int r0 = r0 >> 30
            if (r0 != 0) goto L78
            int r0 = r7 + 3
            r1 = r6[r2]
            if (r1 > r3) goto L78
            int r7 = r7 + 4
            r0 = r6[r0]
            if (r0 <= r3) goto L11
        L78:
            r6 = 0
            return r6
        L7a:
            r7 = r0
            goto L11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.AbstractC0504u3.d(byte[], int, int):boolean");
    }
}
