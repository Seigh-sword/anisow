package V4;

import d.AbstractC0628i;
import f5.C0710g;
import java.io.EOFException;
import java.net.URI;
import java.net.URISyntaxException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import s4.AbstractC1305a;

/* JADX INFO: loaded from: classes.dex */
public final class r {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final char[] f3902j = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f3903a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f3904b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f3905c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f3906d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f3907e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final List f3908f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final List f3909g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f3910h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final String f3911i;

    public r(q qVar) {
        this.f3903a = (String) qVar.f3897e;
        String str = (String) qVar.f3898f;
        this.f3904b = g(0, str.length(), str, false);
        String str2 = (String) qVar.f3899g;
        this.f3905c = g(0, str2.length(), str2, false);
        this.f3906d = (String) qVar.f3900h;
        int i6 = qVar.f3895c;
        this.f3907e = i6 == -1 ? b((String) qVar.f3897e) : i6;
        this.f3908f = h(qVar.f3894b, false);
        List list = qVar.f3896d;
        this.f3909g = list != null ? h(list, true) : null;
        String str3 = (String) qVar.f3901i;
        this.f3910h = str3 != null ? g(0, str3.length(), str3, false) : null;
        this.f3911i = qVar.toString();
    }

    public static String a(String str, int i6, int i7, String str2, boolean z5, boolean z6, boolean z7, boolean z8, Charset charset) throws EOFException {
        int iCharCount = i6;
        while (iCharCount < i7) {
            int iCodePointAt = str.codePointAt(iCharCount);
            int i8 = 43;
            if (iCodePointAt < 32 || iCodePointAt == 127 || ((iCodePointAt >= 128 && z8) || str2.indexOf(iCodePointAt) != -1 || ((iCodePointAt == 37 && (!z5 || (z6 && !i(str, iCharCount, i7)))) || (iCodePointAt == 43 && z7)))) {
                C0710g c0710g = new C0710g();
                c0710g.d0(str, i6, iCharCount);
                C0710g c0710g2 = null;
                while (iCharCount < i7) {
                    int iCodePointAt2 = str.codePointAt(iCharCount);
                    if (!z5 || (iCodePointAt2 != 9 && iCodePointAt2 != 10 && iCodePointAt2 != 12 && iCodePointAt2 != 13)) {
                        if (iCodePointAt2 == i8 && z7) {
                            c0710g.c0(z5 ? "+" : "%2B");
                        } else if (iCodePointAt2 < 32 || iCodePointAt2 == 127 || ((iCodePointAt2 >= 128 && z8) || str2.indexOf(iCodePointAt2) != -1 || (iCodePointAt2 == 37 && (!z5 || (z6 && !i(str, iCharCount, i7)))))) {
                            if (c0710g2 == null) {
                                c0710g2 = new C0710g();
                            }
                            if (charset == null || charset.equals(StandardCharsets.UTF_8)) {
                                c0710g2.e0(iCodePointAt2);
                            } else {
                                int iCharCount2 = Character.charCount(iCodePointAt2) + iCharCount;
                                if (iCharCount < 0) {
                                    throw new IllegalArgumentException(AbstractC0628i.f("beginIndex < 0: ", iCharCount).toString());
                                }
                                if (iCharCount2 < iCharCount) {
                                    throw new IllegalArgumentException(H1.a.k("endIndex < beginIndex: ", iCharCount2, " < ", iCharCount).toString());
                                }
                                if (iCharCount2 > str.length()) {
                                    StringBuilder sbL = H1.a.l("endIndex > string.length: ", iCharCount2, " > ");
                                    sbL.append(str.length());
                                    throw new IllegalArgumentException(sbL.toString().toString());
                                }
                                if (AbstractC1305a.c(charset, K4.a.f1637a)) {
                                    c0710g2.d0(str, iCharCount, iCharCount2);
                                } else {
                                    String strSubstring = str.substring(iCharCount, iCharCount2);
                                    AbstractC1305a.n(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
                                    byte[] bytes = strSubstring.getBytes(charset);
                                    AbstractC1305a.n(bytes, "this as java.lang.String).getBytes(charset)");
                                    c0710g2.V(bytes, 0, bytes.length);
                                }
                            }
                            while (!c0710g2.E()) {
                                byte b6 = c0710g2.readByte();
                                c0710g.X(37);
                                char[] cArr = f3902j;
                                c0710g.X(cArr[((b6 & 255) >> 4) & 15]);
                                c0710g.X(cArr[b6 & 15]);
                            }
                        } else {
                            c0710g.e0(iCodePointAt2);
                        }
                    }
                    iCharCount += Character.charCount(iCodePointAt2);
                    i8 = 43;
                }
                return c0710g.R(c0710g.f8461x, K4.a.f1637a);
            }
            iCharCount += Character.charCount(iCodePointAt);
        }
        return str.substring(i6, i7);
    }

    public static int b(String str) {
        if (str.equals("http")) {
            return 80;
        }
        return str.equals("https") ? 443 : -1;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0052  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.String g(int r8, int r9, java.lang.String r10, boolean r11) {
        /*
            r0 = r8
        L1:
            if (r0 >= r9) goto L64
            char r1 = r10.charAt(r0)
            r2 = 43
            r3 = 37
            if (r1 == r3) goto L15
            if (r1 != r2) goto L12
            if (r11 == 0) goto L12
            goto L15
        L12:
            int r0 = r0 + 1
            goto L1
        L15:
            f5.g r1 = new f5.g
            r1.<init>()
            r1.d0(r10, r8, r0)
        L1d:
            if (r0 >= r9) goto L5b
            int r8 = r10.codePointAt(r0)
            if (r8 != r3) goto L48
            int r4 = r0 + 2
            if (r4 >= r9) goto L48
            int r5 = r0 + 1
            char r5 = r10.charAt(r5)
            int r5 = W4.b.e(r5)
            char r6 = r10.charAt(r4)
            int r6 = W4.b.e(r6)
            r7 = -1
            if (r5 == r7) goto L52
            if (r6 == r7) goto L52
            int r0 = r5 << 4
            int r0 = r0 + r6
            r1.X(r0)
            r0 = r4
            goto L55
        L48:
            if (r8 != r2) goto L52
            if (r11 == 0) goto L52
            r4 = 32
            r1.X(r4)
            goto L55
        L52:
            r1.e0(r8)
        L55:
            int r8 = java.lang.Character.charCount(r8)
            int r0 = r0 + r8
            goto L1d
        L5b:
            long r8 = r1.f8461x
            java.nio.charset.Charset r10 = K4.a.f1637a
            java.lang.String r8 = r1.R(r8, r10)
            return r8
        L64:
            java.lang.String r8 = r10.substring(r8, r9)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: V4.r.g(int, int, java.lang.String, boolean):java.lang.String");
    }

    public static List h(List list, boolean z5) {
        int size = list.size();
        ArrayList arrayList = new ArrayList(size);
        for (int i6 = 0; i6 < size; i6++) {
            String str = (String) list.get(i6);
            arrayList.add(str != null ? g(0, str.length(), str, z5) : null);
        }
        return Collections.unmodifiableList(arrayList);
    }

    public static boolean i(String str, int i6, int i7) {
        int i8 = i6 + 2;
        return i8 < i7 && str.charAt(i6) == '%' && W4.b.e(str.charAt(i6 + 1)) != -1 && W4.b.e(str.charAt(i8)) != -1;
    }

    public static ArrayList j(String str) {
        String strSubstring;
        ArrayList arrayList = new ArrayList();
        int i6 = 0;
        while (i6 <= str.length()) {
            int iIndexOf = str.indexOf(38, i6);
            if (iIndexOf == -1) {
                iIndexOf = str.length();
            }
            int iIndexOf2 = str.indexOf(61, i6);
            if (iIndexOf2 == -1 || iIndexOf2 > iIndexOf) {
                arrayList.add(str.substring(i6, iIndexOf));
                strSubstring = null;
            } else {
                arrayList.add(str.substring(i6, iIndexOf2));
                strSubstring = str.substring(iIndexOf2 + 1, iIndexOf);
            }
            arrayList.add(strSubstring);
            i6 = iIndexOf + 1;
        }
        return arrayList;
    }

    public final String c() {
        if (this.f3905c.isEmpty()) {
            return "";
        }
        int length = this.f3903a.length() + 3;
        String str = this.f3911i;
        return str.substring(str.indexOf(58, length) + 1, str.indexOf(64));
    }

    public final ArrayList d() {
        int length = this.f3903a.length() + 3;
        String str = this.f3911i;
        int iIndexOf = str.indexOf(47, length);
        int iG = W4.b.g(iIndexOf, str.length(), str, "?#");
        ArrayList arrayList = new ArrayList();
        while (iIndexOf < iG) {
            int i6 = iIndexOf + 1;
            int iH = W4.b.h(str, i6, iG, '/');
            arrayList.add(str.substring(i6, iH));
            iIndexOf = iH;
        }
        return arrayList;
    }

    public final String e() {
        if (this.f3909g == null) {
            return null;
        }
        String str = this.f3911i;
        int iIndexOf = str.indexOf(63) + 1;
        return str.substring(iIndexOf, W4.b.h(str, iIndexOf, str.length(), '#'));
    }

    public final boolean equals(Object obj) {
        return (obj instanceof r) && ((r) obj).f3911i.equals(this.f3911i);
    }

    public final String f() {
        if (this.f3904b.isEmpty()) {
            return "";
        }
        int length = this.f3903a.length() + 3;
        String str = this.f3911i;
        return str.substring(length, W4.b.g(length, str.length(), str, ":@"));
    }

    public final int hashCode() {
        return this.f3911i.hashCode();
    }

    public final String k() {
        q qVar;
        try {
            qVar = new q();
            qVar.b(this, "/...");
        } catch (IllegalArgumentException unused) {
            qVar = null;
        }
        qVar.getClass();
        qVar.f3898f = a("", 0, 0, " \"':;<=>@[]^`{}|/\\?#", false, false, false, true, null);
        qVar.f3899g = a("", 0, 0, " \"':;<=>@[]^`{}|/\\?#", false, false, false, true, null);
        return qVar.a().f3911i;
    }

    public final URI l() {
        q qVar = new q();
        String str = this.f3903a;
        qVar.f3897e = str;
        qVar.f3898f = f();
        qVar.f3899g = c();
        qVar.f3900h = this.f3906d;
        int iB = b(str);
        int i6 = this.f3907e;
        if (i6 == iB) {
            i6 = -1;
        }
        qVar.f3895c = i6;
        qVar.f3894b.clear();
        qVar.f3894b.addAll(d());
        String strE = e();
        String strSubstring = null;
        qVar.f3896d = strE != null ? j(a(strE, 0, strE.length(), " \"'<>#", true, false, true, true, null)) : null;
        if (this.f3910h != null) {
            String str2 = this.f3911i;
            strSubstring = str2.substring(str2.indexOf(35) + 1);
        }
        qVar.f3901i = strSubstring;
        int size = qVar.f3894b.size();
        for (int i7 = 0; i7 < size; i7++) {
            String str3 = (String) qVar.f3894b.get(i7);
            qVar.f3894b.set(i7, a(str3, 0, str3.length(), "[]", true, true, false, true, null));
        }
        List list = qVar.f3896d;
        if (list != null) {
            int size2 = list.size();
            for (int i8 = 0; i8 < size2; i8++) {
                String str4 = (String) qVar.f3896d.get(i8);
                if (str4 != null) {
                    qVar.f3896d.set(i8, a(str4, 0, str4.length(), "\\^`{|}", true, true, true, true, null));
                }
            }
        }
        String str5 = (String) qVar.f3901i;
        if (str5 != null) {
            qVar.f3901i = a(str5, 0, str5.length(), " \"#<>\\^`{|}", true, true, false, false, null);
        }
        String string = qVar.toString();
        try {
            return new URI(string);
        } catch (URISyntaxException e6) {
            try {
                return URI.create(string.replaceAll("[\\u0000-\\u001F\\u007F-\\u009F\\p{javaWhitespace}]", ""));
            } catch (Exception unused) {
                throw new RuntimeException(e6);
            }
        }
    }

    public final String toString() {
        return this.f3911i;
    }
}
