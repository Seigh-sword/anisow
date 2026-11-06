package androidx.datastore.preferences.protobuf;

/* JADX INFO: loaded from: classes.dex */
public abstract class F0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final D0 f5371a;

    static {
        f5371a = (C0.f5365e && C0.f5364d && !AbstractC0270d.a()) ? new D0(1) : new D0(0);
    }

    public static int a(byte[] bArr, int i6, int i7) {
        byte b6 = bArr[i6 - 1];
        int i8 = i7 - i6;
        if (i8 == 0) {
            if (b6 > -12) {
                b6 = -1;
            }
            return b6;
        }
        if (i8 == 1) {
            return c(b6, bArr[i6]);
        }
        if (i8 == 2) {
            return d(b6, bArr[i6], bArr[i6 + 1]);
        }
        throw new AssertionError();
    }

    public static int b(CharSequence charSequence) {
        int length = charSequence.length();
        int i6 = 0;
        int i7 = 0;
        while (i7 < length && charSequence.charAt(i7) < 128) {
            i7++;
        }
        int i8 = length;
        while (true) {
            if (i7 >= length) {
                break;
            }
            char cCharAt = charSequence.charAt(i7);
            if (cCharAt < 2048) {
                i8 += (127 - cCharAt) >>> 31;
                i7++;
            } else {
                int length2 = charSequence.length();
                while (i7 < length2) {
                    char cCharAt2 = charSequence.charAt(i7);
                    if (cCharAt2 < 2048) {
                        i6 += (127 - cCharAt2) >>> 31;
                    } else {
                        i6 += 2;
                        if (55296 <= cCharAt2 && cCharAt2 <= 57343) {
                            if (Character.codePointAt(charSequence, i7) < 65536) {
                                throw new E0(i7, length2);
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
        throw new IllegalArgumentException("UTF-8 length does not fit in int: " + (((long) i8) + 4294967296L));
    }

    public static int c(int i6, int i7) {
        if (i6 > -12 || i7 > -65) {
            return -1;
        }
        return i6 ^ (i7 << 8);
    }

    public static int d(int i6, int i7, int i8) {
        if (i6 > -12 || i7 > -65 || i8 > -65) {
            return -1;
        }
        return (i6 ^ (i7 << 8)) ^ (i8 << 16);
    }
}
