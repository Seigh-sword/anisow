package s;

/* JADX INFO: renamed from: s.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1282d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int[] f12504a = new int[0];

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Object[] f12505b = new Object[0];

    public static int a(int i6, int i7, int[] iArr) {
        int i8 = i6 - 1;
        int i9 = 0;
        while (i9 <= i8) {
            int i10 = (i9 + i8) >>> 1;
            int i11 = iArr[i10];
            if (i11 < i7) {
                i9 = i10 + 1;
            } else {
                if (i11 <= i7) {
                    return i10;
                }
                i8 = i10 - 1;
            }
        }
        return ~i9;
    }

    public static int b(long[] jArr, int i6, long j6) {
        int i7 = i6 - 1;
        int i8 = 0;
        while (i8 <= i7) {
            int i9 = (i8 + i7) >>> 1;
            long j7 = jArr[i9];
            if (j7 < j6) {
                i8 = i9 + 1;
            } else {
                if (j7 <= j6) {
                    return i9;
                }
                i7 = i9 - 1;
            }
        }
        return ~i8;
    }
}
