package f0;

import d.AbstractC0628i;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* JADX INFO: renamed from: f0.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0686c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f8331a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f8332b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f8333c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final byte[] f8334d;

    public C0686c(long j6, byte[] bArr, int i6, int i7) {
        this.f8331a = i6;
        this.f8332b = i7;
        this.f8333c = j6;
        this.f8334d = bArr;
    }

    public static C0686c a(long j6, ByteOrder byteOrder) {
        long[] jArr = {j6};
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(new byte[C0690g.f8343C[4]]);
        byteBufferWrap.order(byteOrder);
        byteBufferWrap.putInt((int) jArr[0]);
        return new C0686c(byteBufferWrap.array(), 4, 1);
    }

    public static C0686c b(C0688e c0688e, ByteOrder byteOrder) {
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(new byte[C0690g.f8343C[5]]);
        byteBufferWrap.order(byteOrder);
        C0688e c0688e2 = new C0688e[]{c0688e}[0];
        byteBufferWrap.putInt((int) c0688e2.f8339a);
        byteBufferWrap.putInt((int) c0688e2.f8340b);
        return new C0686c(byteBufferWrap.array(), 5, 1);
    }

    public static C0686c c(int i6, ByteOrder byteOrder) {
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(new byte[C0690g.f8343C[3]]);
        byteBufferWrap.order(byteOrder);
        byteBufferWrap.putShort((short) new int[]{i6}[0]);
        return new C0686c(byteBufferWrap.array(), 3, 1);
    }

    public final double d(ByteOrder byteOrder) throws Throwable {
        Object objG = g(byteOrder);
        if (objG == null) {
            throw new NumberFormatException("NULL can't be converted to a double value");
        }
        if (objG instanceof String) {
            return Double.parseDouble((String) objG);
        }
        if (objG instanceof long[]) {
            if (((long[]) objG).length == 1) {
                return r5[0];
            }
            throw new NumberFormatException("There are more than one component");
        }
        if (objG instanceof int[]) {
            if (((int[]) objG).length == 1) {
                return r5[0];
            }
            throw new NumberFormatException("There are more than one component");
        }
        if (objG instanceof double[]) {
            double[] dArr = (double[]) objG;
            if (dArr.length == 1) {
                return dArr[0];
            }
            throw new NumberFormatException("There are more than one component");
        }
        if (!(objG instanceof C0688e[])) {
            throw new NumberFormatException("Couldn't find a double value");
        }
        C0688e[] c0688eArr = (C0688e[]) objG;
        if (c0688eArr.length != 1) {
            throw new NumberFormatException("There are more than one component");
        }
        C0688e c0688e = c0688eArr[0];
        return c0688e.f8339a / c0688e.f8340b;
    }

    public final int e(ByteOrder byteOrder) throws Throwable {
        Object objG = g(byteOrder);
        if (objG == null) {
            throw new NumberFormatException("NULL can't be converted to a integer value");
        }
        if (objG instanceof String) {
            return Integer.parseInt((String) objG);
        }
        if (objG instanceof long[]) {
            long[] jArr = (long[]) objG;
            if (jArr.length == 1) {
                return (int) jArr[0];
            }
            throw new NumberFormatException("There are more than one component");
        }
        if (!(objG instanceof int[])) {
            throw new NumberFormatException("Couldn't find a integer value");
        }
        int[] iArr = (int[]) objG;
        if (iArr.length == 1) {
            return iArr[0];
        }
        throw new NumberFormatException("There are more than one component");
    }

    public final String f(ByteOrder byteOrder) throws Throwable {
        Object objG = g(byteOrder);
        if (objG == null) {
            return null;
        }
        if (objG instanceof String) {
            return (String) objG;
        }
        StringBuilder sb = new StringBuilder();
        int i6 = 0;
        if (objG instanceof long[]) {
            long[] jArr = (long[]) objG;
            while (i6 < jArr.length) {
                sb.append(jArr[i6]);
                i6++;
                if (i6 != jArr.length) {
                    sb.append(",");
                }
            }
            return sb.toString();
        }
        if (objG instanceof int[]) {
            int[] iArr = (int[]) objG;
            while (i6 < iArr.length) {
                sb.append(iArr[i6]);
                i6++;
                if (i6 != iArr.length) {
                    sb.append(",");
                }
            }
            return sb.toString();
        }
        if (objG instanceof double[]) {
            double[] dArr = (double[]) objG;
            while (i6 < dArr.length) {
                sb.append(dArr[i6]);
                i6++;
                if (i6 != dArr.length) {
                    sb.append(",");
                }
            }
            return sb.toString();
        }
        if (!(objG instanceof C0688e[])) {
            return null;
        }
        C0688e[] c0688eArr = (C0688e[]) objG;
        while (i6 < c0688eArr.length) {
            sb.append(c0688eArr[i6].f8339a);
            sb.append('/');
            sb.append(c0688eArr[i6].f8340b);
            i6++;
            if (i6 != c0688eArr.length) {
                sb.append(",");
            }
        }
        return sb.toString();
    }

    /* JADX WARN: Can't wrap try/catch for region: R(9:88|(2:90|(2:91|(2:93|(2:180|95)(1:96))(2:179|97)))|98|(2:100|(6:182|102|108|166|109|113)(3:103|(2:105|184)(2:106|183)|107))|181|108|166|109|113) */
    /* JADX WARN: Code restructure failed: missing block: B:111:0x0128, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:112:0x0129, code lost:
    
        android.util.Log.e("ExifInterface", "IOException occurred while closing InputStream", r0);
     */
    /* JADX WARN: Not initialized variable reg: 6, insn: 0x0032: MOVE (r5 I:??[OBJECT, ARRAY]) = (r6 I:??[OBJECT, ARRAY]) (LINE:51), block:B:17:0x0032 */
    /* JADX WARN: Removed duplicated region for block: B:148:0x0171 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r15v23, types: [int[], java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r15v24, types: [java.io.Serializable, long[]] */
    /* JADX WARN: Type inference failed for: r15v25, types: [f0.e[], java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r15v26, types: [int[], java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r15v27, types: [int[], java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r15v28, types: [f0.e[], java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r15v29, types: [double[], java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r15v30, types: [double[], java.io.Serializable] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.io.Serializable g(java.nio.ByteOrder r15) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 406
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: f0.C0686c.g(java.nio.ByteOrder):java.io.Serializable");
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("(");
        sb.append(C0690g.f8342B[this.f8331a]);
        sb.append(", data length:");
        return AbstractC0628i.l(sb, this.f8334d.length, ")");
    }

    public C0686c(byte[] bArr, int i6, int i7) {
        this(-1L, bArr, i6, i7);
    }
}
