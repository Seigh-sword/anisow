package g5;

import f5.C0710g;
import java.io.EOFException;
import s4.AbstractC1305a;

/* JADX INFO: loaded from: classes.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final byte[] f8533a;

    static {
        byte[] bytes = "0123456789abcdef".getBytes(K4.a.f1637a);
        AbstractC1305a.n(bytes, "this as java.lang.String).getBytes(charset)");
        f8533a = bytes;
    }

    public static final String a(C0710g c0710g, long j6) throws EOFException {
        AbstractC1305a.o(c0710g, "<this>");
        if (j6 > 0) {
            long j7 = j6 - 1;
            if (c0710g.u(j7) == 13) {
                String strR = c0710g.R(j7, K4.a.f1637a);
                c0710g.a(2L);
                return strR;
            }
        }
        String strR2 = c0710g.R(j6, K4.a.f1637a);
        c0710g.a(1L);
        return strR2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x0063, code lost:
    
        if (r19 == false) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0065, code lost:
    
        return r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0066, code lost:
    
        return r10;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final int b(f5.C0710g r17, f5.v r18, boolean r19) {
        /*
            r0 = r17
            r1 = r18
            java.lang.String r2 = "<this>"
            s4.AbstractC1305a.o(r0, r2)
            java.lang.String r2 = "options"
            s4.AbstractC1305a.o(r1, r2)
            f5.z r0 = r0.f8460w
            r2 = -2
            r3 = -1
            if (r0 != 0) goto L19
            if (r19 == 0) goto L17
            goto L18
        L17:
            r2 = r3
        L18:
            return r2
        L19:
            int r4 = r0.f8501b
            int r5 = r0.f8502c
            r6 = 0
            byte[] r7 = r0.f8500a
            r9 = r0
            r10 = r3
            r8 = r6
        L23:
            int r11 = r8 + 1
            int[] r12 = r1.f8491x
            r13 = r12[r8]
            int r8 = r8 + 2
            r11 = r12[r11]
            if (r11 == r3) goto L30
            r10 = r11
        L30:
            if (r9 != 0) goto L33
            goto L63
        L33:
            r11 = 0
            if (r13 >= 0) goto L7d
            int r13 = r13 * (-1)
            int r14 = r13 + r8
        L3a:
            int r13 = r4 + 1
            r4 = r7[r4]
            r4 = r4 & 255(0xff, float:3.57E-43)
            int r15 = r8 + 1
            r8 = r12[r8]
            if (r4 == r8) goto L47
            return r10
        L47:
            if (r15 != r14) goto L4b
            r4 = 1
            goto L4c
        L4b:
            r4 = r6
        L4c:
            if (r13 != r5) goto L6d
            s4.AbstractC1305a.l(r9)
            f5.z r5 = r9.f8505f
            s4.AbstractC1305a.l(r5)
            int r7 = r5.f8501b
            int r8 = r5.f8502c
            byte[] r9 = r5.f8500a
            if (r5 != r0) goto L67
            if (r4 == 0) goto L63
            r5 = r8
            r8 = r11
            goto L70
        L63:
            if (r19 == 0) goto L66
            return r2
        L66:
            return r10
        L67:
            r16 = r8
            r8 = r5
            r5 = r16
            goto L70
        L6d:
            r8 = r9
            r9 = r7
            r7 = r13
        L70:
            if (r4 == 0) goto L78
            r4 = r12[r15]
            r2 = r7
            r7 = r9
            r9 = r8
            goto La1
        L78:
            r4 = r7
            r7 = r9
            r9 = r8
            r8 = r15
            goto L3a
        L7d:
            int r14 = r4 + 1
            r4 = r7[r4]
            r4 = r4 & 255(0xff, float:3.57E-43)
            int r15 = r8 + r13
        L85:
            if (r8 != r15) goto L88
            return r10
        L88:
            r2 = r12[r8]
            if (r4 != r2) goto La9
            int r8 = r8 + r13
            r4 = r12[r8]
            if (r14 != r5) goto La0
            f5.z r9 = r9.f8505f
            s4.AbstractC1305a.l(r9)
            int r2 = r9.f8501b
            int r5 = r9.f8502c
            byte[] r7 = r9.f8500a
            if (r9 != r0) goto La1
            r9 = r11
            goto La1
        La0:
            r2 = r14
        La1:
            if (r4 < 0) goto La4
            return r4
        La4:
            int r8 = -r4
            r4 = r2
            r2 = -2
            goto L23
        La9:
            int r8 = r8 + 1
            r2 = -2
            goto L85
        */
        throw new UnsupportedOperationException("Method not decompiled: g5.a.b(f5.g, f5.v, boolean):int");
    }
}
