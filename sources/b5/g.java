package b5;

import d.AbstractC0628i;
import java.io.IOException;
import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
public abstract class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final f5.j f5983a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String[] f5984b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final String[] f5985c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final String[] f5986d;

    static {
        f5.j jVar = f5.j.f8462z;
        f5983a = P2.e.g("PRI * HTTP/2.0\r\n\r\nSM\r\n\r\n");
        f5984b = new String[]{"DATA", "HEADERS", "PRIORITY", "RST_STREAM", "SETTINGS", "PUSH_PROMISE", "PING", "GOAWAY", "WINDOW_UPDATE", "CONTINUATION"};
        f5985c = new String[64];
        f5986d = new String[256];
        int i6 = 0;
        int i7 = 0;
        while (true) {
            String[] strArr = f5986d;
            if (i7 >= strArr.length) {
                break;
            }
            Object[] objArr = {Integer.toBinaryString(i7)};
            byte[] bArr = W4.b.f4484a;
            strArr[i7] = String.format(Locale.US, "%8s", objArr).replace(' ', '0');
            i7++;
        }
        String[] strArr2 = f5985c;
        strArr2[0] = "";
        strArr2[1] = "END_STREAM";
        int[] iArr = {1};
        strArr2[8] = "PADDED";
        int i8 = iArr[0];
        strArr2[i8 | 8] = AbstractC0628i.m(new StringBuilder(), strArr2[i8], "|PADDED");
        strArr2[4] = "END_HEADERS";
        strArr2[32] = "PRIORITY";
        strArr2[36] = "END_HEADERS|PRIORITY";
        int[] iArr2 = {4, 32, 36};
        for (int i9 = 0; i9 < 3; i9++) {
            int i10 = iArr2[i9];
            int i11 = iArr[0];
            String[] strArr3 = f5985c;
            int i12 = i11 | i10;
            strArr3[i12] = strArr3[i11] + '|' + strArr3[i10];
            StringBuilder sb = new StringBuilder();
            sb.append(strArr3[i11]);
            sb.append('|');
            strArr3[i12 | 8] = AbstractC0628i.m(sb, strArr3[i10], "|PADDED");
        }
        while (true) {
            String[] strArr4 = f5985c;
            if (i6 >= strArr4.length) {
                return;
            }
            if (strArr4[i6] == null) {
                strArr4[i6] = f5986d[i6];
            }
            i6++;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x0064  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.String a(boolean r9, int r10, int r11, byte r12, byte r13) {
        /*
            java.lang.String[] r0 = b5.g.f5984b
            int r1 = r0.length
            if (r12 >= r1) goto L8
            r0 = r0[r12]
            goto L1a
        L8:
            java.lang.Byte r0 = java.lang.Byte.valueOf(r12)
            java.lang.Object[] r0 = new java.lang.Object[]{r0}
            byte[] r1 = W4.b.f4484a
            java.util.Locale r1 = java.util.Locale.US
            java.lang.String r2 = "0x%02x"
            java.lang.String r0 = java.lang.String.format(r1, r2, r0)
        L1a:
            r1 = 4
            r2 = 1
            r3 = 5
            r4 = 3
            r5 = 2
            if (r13 != 0) goto L24
            java.lang.String r12 = ""
            goto L66
        L24:
            java.lang.String[] r6 = b5.g.f5986d
            if (r12 == r5) goto L64
            if (r12 == r4) goto L64
            if (r12 == r1) goto L5c
            r7 = 6
            if (r12 == r7) goto L5c
            r7 = 7
            if (r12 == r7) goto L64
            r7 = 8
            if (r12 == r7) goto L64
            java.lang.String[] r7 = b5.g.f5985c
            int r8 = r7.length
            if (r13 >= r8) goto L3e
            r6 = r7[r13]
            goto L40
        L3e:
            r6 = r6[r13]
        L40:
            if (r12 != r3) goto L4f
            r7 = r13 & 4
            if (r7 == 0) goto L4f
            java.lang.String r12 = "HEADERS"
            java.lang.String r13 = "PUSH_PROMISE"
        L4a:
            java.lang.String r12 = r6.replace(r12, r13)
            goto L66
        L4f:
            if (r12 != 0) goto L5a
            r12 = r13 & 32
            if (r12 == 0) goto L5a
            java.lang.String r12 = "PRIORITY"
            java.lang.String r13 = "COMPRESSED"
            goto L4a
        L5a:
            r12 = r6
            goto L66
        L5c:
            if (r13 != r2) goto L61
            java.lang.String r12 = "ACK"
            goto L66
        L61:
            r12 = r6[r13]
            goto L66
        L64:
            r12 = r6[r13]
        L66:
            java.lang.Object[] r13 = new java.lang.Object[r3]
            if (r9 == 0) goto L6d
            java.lang.String r9 = "<<"
            goto L6f
        L6d:
            java.lang.String r9 = ">>"
        L6f:
            r3 = 0
            r13[r3] = r9
            java.lang.Integer r9 = java.lang.Integer.valueOf(r10)
            r13[r2] = r9
            java.lang.Integer r9 = java.lang.Integer.valueOf(r11)
            r13[r5] = r9
            r13[r4] = r0
            r13[r1] = r12
            byte[] r9 = W4.b.f4484a
            java.util.Locale r9 = java.util.Locale.US
            java.lang.String r10 = "%s 0x%08x %5d %-13s %s"
            java.lang.String r9 = java.lang.String.format(r9, r10, r13)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: b5.g.a(boolean, int, int, byte, byte):java.lang.String");
    }

    public static void b(String str, Object... objArr) {
        byte[] bArr = W4.b.f4484a;
        throw new IllegalArgumentException(String.format(Locale.US, str, objArr));
    }

    public static void c(String str, Object... objArr) throws IOException {
        byte[] bArr = W4.b.f4484a;
        throw new IOException(String.format(Locale.US, str, objArr));
    }
}
