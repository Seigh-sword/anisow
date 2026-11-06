package W4;

import V4.H;
import V4.p;
import V4.r;
import b5.C0347c;
import d.AbstractC0628i;
import f5.C0710g;
import f5.E;
import f5.G;
import f5.v;
import java.io.Closeable;
import java.io.InterruptedIOException;
import java.lang.reflect.Method;
import java.net.IDN;
import java.net.InetAddress;
import java.net.Socket;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;
import m2.C1017B;
import x1.C1486b;

/* JADX INFO: loaded from: classes.dex */
public abstract class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final byte[] f4484a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String[] f4485b = new String[0];

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final p f4486c = p.f(new String[0]);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final H f4487d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final v f4488e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final Charset f4489f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final Charset f4490g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final TimeZone f4491h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final K.b f4492i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final Method f4493j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final Pattern f4494k;

    /* JADX WARN: Code restructure failed: missing block: B:91:0x01a0, code lost:
    
        continue;
     */
    static {
        /*
            Method dump skipped, instruction units count: 548
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: W4.b.<clinit>():void");
    }

    public static String a(String str) {
        int i6 = -1;
        if (!str.contains(":")) {
            try {
                String lowerCase = IDN.toASCII(str).toLowerCase(Locale.US);
                if (lowerCase.isEmpty()) {
                    return null;
                }
                while (i < lowerCase.length()) {
                    char cCharAt = lowerCase.charAt(i);
                    i = (cCharAt > 31 && cCharAt < 127 && " #%/:?@[\\]".indexOf(cCharAt) == -1) ? i + 1 : 0;
                    return null;
                }
                return lowerCase;
            } catch (IllegalArgumentException unused) {
                return null;
            }
        }
        InetAddress inetAddressF = (str.startsWith("[") && str.endsWith("]")) ? f(str, 1, str.length() - 1) : f(str, 0, str.length());
        if (inetAddressF == null) {
            return null;
        }
        byte[] address = inetAddressF.getAddress();
        if (address.length != 16) {
            if (address.length == 4) {
                return inetAddressF.getHostAddress();
            }
            throw new AssertionError(AbstractC0628i.j("Invalid IPv6 address: '", str, "'"));
        }
        int i7 = 0;
        int i8 = 0;
        while (i7 < address.length) {
            int i9 = i7;
            while (i9 < 16 && address[i9] == 0 && address[i9 + 1] == 0) {
                i9 += 2;
            }
            int i10 = i9 - i7;
            if (i10 > i8 && i10 >= 4) {
                i6 = i7;
                i8 = i10;
            }
            i7 = i9 + 2;
        }
        C0710g c0710g = new C0710g();
        while (i < address.length) {
            if (i == i6) {
                c0710g.X(58);
                i += i8;
                if (i == 16) {
                    c0710g.X(58);
                }
            } else {
                if (i > 0) {
                    c0710g.X(58);
                }
                c0710g.Z(((address[i] & 255) << 8) | (address[i + 1] & 255));
                i += 2;
            }
        }
        return c0710g.R(c0710g.f8461x, K4.a.f1637a);
    }

    public static int b(TimeUnit timeUnit) {
        if (timeUnit == null) {
            throw new NullPointerException("unit == null");
        }
        long millis = timeUnit.toMillis(30L);
        if (millis > 2147483647L) {
            throw new IllegalArgumentException("timeout too large.");
        }
        if (millis != 0) {
            return (int) millis;
        }
        throw new IllegalArgumentException("timeout too small.");
    }

    public static void c(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (RuntimeException e6) {
                throw e6;
            } catch (Exception unused) {
            }
        }
    }

    public static void d(Socket socket) {
        if (socket != null) {
            try {
                socket.close();
            } catch (AssertionError e6) {
                if (!m(e6)) {
                    throw e6;
                }
            } catch (RuntimeException e7) {
                throw e7;
            } catch (Exception unused) {
            }
        }
    }

    public static int e(char c6) {
        if (c6 >= '0' && c6 <= '9') {
            return c6 - '0';
        }
        if (c6 >= 'a' && c6 <= 'f') {
            return c6 - 'W';
        }
        if (c6 < 'A' || c6 > 'F') {
            return -1;
        }
        return c6 - '7';
    }

    /* JADX WARN: Code restructure failed: missing block: B:70:0x00d0, code lost:
    
        if (r7 == r0) goto L78;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x00d2, code lost:
    
        if (r8 != (-1)) goto L73;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x00d4, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x00d5, code lost:
    
        r1 = r7 - r8;
        java.lang.System.arraycopy(r3, r8, r3, 16 - r1, r1);
        java.util.Arrays.fill(r3, r8, (16 - r7) + r8, (byte) 0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x00e7, code lost:
    
        return java.net.InetAddress.getByAddress(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x00ed, code lost:
    
        throw new java.lang.AssertionError();
     */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0088 A[LOOP:2: B:25:0x004e->B:50:0x0088, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0097 A[EDGE_INSN: B:91:0x0097->B:53:0x0097 BREAK  A[LOOP:2: B:25:0x004e->B:50:0x0088], SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.net.InetAddress f(java.lang.String r16, int r17, int r18) {
        /*
            Method dump skipped, instruction units count: 238
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: W4.b.f(java.lang.String, int, int):java.net.InetAddress");
    }

    public static int g(int i6, int i7, String str, String str2) {
        while (i6 < i7) {
            if (str2.indexOf(str.charAt(i6)) != -1) {
                return i6;
            }
            i6++;
        }
        return i7;
    }

    public static int h(String str, int i6, int i7, char c6) {
        while (i6 < i7) {
            if (str.charAt(i6) == c6) {
                return i6;
            }
            i6++;
        }
        return i7;
    }

    public static String i(r rVar, boolean z5) {
        boolean zContains = rVar.f3906d.contains(":");
        String strJ = rVar.f3906d;
        if (zContains) {
            strJ = AbstractC0628i.j("[", strJ, "]");
        }
        int i6 = rVar.f3907e;
        if (!z5 && i6 == r.b(rVar.f3903a)) {
            return strJ;
        }
        return strJ + ":" + i6;
    }

    public static List j(List list) {
        return Collections.unmodifiableList(new ArrayList(list));
    }

    public static List k(Object... objArr) {
        return Collections.unmodifiableList(Arrays.asList((Object[]) objArr.clone()));
    }

    public static String[] l(K.b bVar, String[] strArr, String[] strArr2) {
        ArrayList arrayList = new ArrayList();
        for (String str : strArr) {
            int length = strArr2.length;
            int i6 = 0;
            while (true) {
                if (i6 >= length) {
                    break;
                }
                if (bVar.compare(str, strArr2[i6]) == 0) {
                    arrayList.add(str);
                    break;
                }
                i6++;
            }
        }
        return (String[]) arrayList.toArray(new String[arrayList.size()]);
    }

    public static boolean m(AssertionError assertionError) {
        return (assertionError.getCause() == null || assertionError.getMessage() == null || !assertionError.getMessage().contains("getsockname failed")) ? false : true;
    }

    public static boolean n(K.b bVar, String[] strArr, String[] strArr2) {
        if (strArr != null && strArr2 != null && strArr.length != 0 && strArr2.length != 0) {
            for (String str : strArr) {
                for (String str2 : strArr2) {
                    if (bVar.compare(str, str2) == 0) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public static boolean o(r rVar, r rVar2) {
        return rVar.f3906d.equals(rVar2.f3906d) && rVar.f3907e == rVar2.f3907e && rVar.f3903a.equals(rVar2.f3903a);
    }

    public static boolean p(E e6, int i6, TimeUnit timeUnit) {
        long jNanoTime = System.nanoTime();
        long jC = e6.d().e() ? e6.d().c() - jNanoTime : Long.MAX_VALUE;
        e6.d().d(Math.min(jC, timeUnit.toNanos(i6)) + jNanoTime);
        try {
            C0710g c0710g = new C0710g();
            while (e6.G(c0710g, 8192L) != -1) {
                c0710g.k();
            }
            G gD = e6.d();
            if (jC == Long.MAX_VALUE) {
                gD.a();
                return true;
            }
            gD.d(jNanoTime + jC);
            return true;
        } catch (InterruptedIOException unused) {
            G gD2 = e6.d();
            if (jC == Long.MAX_VALUE) {
                gD2.a();
                return false;
            }
            gD2.d(jNanoTime + jC);
            return false;
        } catch (Throwable th) {
            G gD3 = e6.d();
            if (jC == Long.MAX_VALUE) {
                gD3.a();
            } else {
                gD3.d(jNanoTime + jC);
            }
            throw th;
        }
    }

    public static int q(String str, int i6, int i7) {
        while (i6 < i7) {
            char cCharAt = str.charAt(i6);
            if (cCharAt != '\t' && cCharAt != '\n' && cCharAt != '\f' && cCharAt != '\r' && cCharAt != ' ') {
                return i6;
            }
            i6++;
        }
        return i7;
    }

    public static int r(String str, int i6, int i7) {
        for (int i8 = i7 - 1; i8 >= i6; i8--) {
            char cCharAt = str.charAt(i8);
            if (cCharAt != '\t' && cCharAt != '\n' && cCharAt != '\f' && cCharAt != '\r' && cCharAt != ' ') {
                return i8 + 1;
            }
        }
        return i6;
    }

    public static p s(ArrayList arrayList) {
        C1486b c1486b = new C1486b(2);
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            C0347c c0347c = (C0347c) it.next();
            C1017B c1017b = C1017B.f10489z;
            String strQ = c0347c.f5962a.q();
            String strQ2 = c0347c.f5963b.q();
            c1017b.getClass();
            c1486b.b(strQ, strQ2);
        }
        return new p(c1486b);
    }
}
