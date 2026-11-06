package Z4;

import V4.G;
import f5.j;

/* JADX INFO: loaded from: classes.dex */
public abstract class e {
    static {
        j jVar = j.f8462z;
        P2.e.g("\"\\");
        P2.e.g("\t ,=");
    }

    public static long a(G g4) {
        String strC = g4.f3778B.c("Content-Length");
        if (strC == null) {
            return -1L;
        }
        try {
            return Long.parseLong(strC);
        } catch (NumberFormatException unused) {
            return -1L;
        }
    }

    public static boolean b(G g4) {
        if (g4.f3786w.f3752b.equals("HEAD")) {
            return false;
        }
        int i6 = g4.f3788y;
        return (((i6 >= 100 && i6 < 200) || i6 == 204 || i6 == 304) && a(g4) == -1 && !"chunked".equalsIgnoreCase(g4.b("Transfer-Encoding"))) ? false : true;
    }

    public static int c(int i6, String str) {
        try {
            long j6 = Long.parseLong(str);
            if (j6 > 2147483647L) {
                return Integer.MAX_VALUE;
            }
            if (j6 < 0) {
                return 0;
            }
            return (int) j6;
        } catch (NumberFormatException unused) {
            return i6;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:126:0x020d, code lost:
    
        if (W4.b.f4494k.matcher(r0).matches() == false) goto L127;
     */
    /* JADX WARN: Removed duplicated region for block: B:177:0x02c7  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x02d8  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x02db  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x02e8  */
    /* JADX WARN: Removed duplicated region for block: B:202:0x0311  */
    /* JADX WARN: Removed duplicated region for block: B:205:0x031c  */
    /* JADX WARN: Removed duplicated region for block: B:209:0x0329  */
    /* JADX WARN: Removed duplicated region for block: B:213:0x033a A[LOOP:10: B:211:0x0337->B:213:0x033a, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:239:0x03bc  */
    /* JADX WARN: Removed duplicated region for block: B:270:0x03c6 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:277:0x01b0 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00ec  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void d(V4.InterfaceC0179j r33, V4.r r34, V4.p r35) {
        /*
            Method dump skipped, instruction units count: 997
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: Z4.e.d(V4.j, V4.r, V4.p):void");
    }

    public static int e(int i6, String str, String str2) {
        while (i6 < str.length() && str2.indexOf(str.charAt(i6)) == -1) {
            i6++;
        }
        return i6;
    }
}
