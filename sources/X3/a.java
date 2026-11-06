package X3;

import Z.j;
import java.io.Closeable;
import java.io.IOException;
import java.io.Reader;
import java.util.Arrays;
import m2.C1017B;

/* JADX INFO: loaded from: classes.dex */
public class a implements Closeable {

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public long f4677E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public int f4678F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public String f4679G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public int[] f4680H;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    public String[] f4682J;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    public int[] f4683K;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final Reader f4684w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public boolean f4685x = false;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final char[] f4686y = new char[1024];

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public int f4687z = 0;

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public int f4673A = 0;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public int f4674B = 0;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public int f4675C = 0;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public int f4676D = 0;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public int f4681I = 1;

    static {
        C1017B.f10488y = new C1017B(18);
    }

    public a(Reader reader) {
        int[] iArr = new int[32];
        this.f4680H = iArr;
        iArr[0] = 6;
        this.f4682J = new String[32];
        this.f4683K = new int[32];
        this.f4684w = reader;
    }

    public final boolean J() throws IOException {
        int iH = this.f4676D;
        if (iH == 0) {
            iH = h();
        }
        return (iH == 2 || iH == 4 || iH == 17) ? false : true;
    }

    public final boolean K(char c6) throws c {
        if (c6 == '\t' || c6 == '\n' || c6 == '\f' || c6 == '\r' || c6 == ' ') {
            return false;
        }
        if (c6 != '#') {
            if (c6 == ',') {
                return false;
            }
            if (c6 != '/' && c6 != '=') {
                if (c6 == '{' || c6 == '}' || c6 == ':') {
                    return false;
                }
                if (c6 != ';') {
                    switch (c6) {
                        case '[':
                        case ']':
                            return false;
                        case '\\':
                            break;
                        default:
                            return true;
                    }
                }
            }
        }
        g();
        return false;
    }

    public final String L() {
        return " at line " + (this.f4674B + 1) + " column " + ((this.f4687z - this.f4675C) + 1) + " path " + u(false);
    }

    public final boolean M() throws IOException {
        int iH = this.f4676D;
        if (iH == 0) {
            iH = h();
        }
        if (iH == 5) {
            this.f4676D = 0;
            int[] iArr = this.f4683K;
            int i6 = this.f4681I - 1;
            iArr[i6] = iArr[i6] + 1;
            return true;
        }
        if (iH != 6) {
            throw new IllegalStateException("Expected a boolean but was " + H1.a.D(W()) + L());
        }
        this.f4676D = 0;
        int[] iArr2 = this.f4683K;
        int i7 = this.f4681I - 1;
        iArr2[i7] = iArr2[i7] + 1;
        return false;
    }

    public final double N() throws IOException {
        String strT;
        int iH = this.f4676D;
        if (iH == 0) {
            iH = h();
        }
        if (iH == 15) {
            this.f4676D = 0;
            int[] iArr = this.f4683K;
            int i6 = this.f4681I - 1;
            iArr[i6] = iArr[i6] + 1;
            return this.f4677E;
        }
        if (iH == 16) {
            this.f4679G = new String(this.f4686y, this.f4687z, this.f4678F);
            this.f4687z += this.f4678F;
        } else {
            if (iH == 8 || iH == 9) {
                strT = T(iH == 8 ? '\'' : '\"');
            } else if (iH == 10) {
                strT = V();
            } else if (iH != 11) {
                throw new IllegalStateException("Expected a double but was " + H1.a.D(W()) + L());
            }
            this.f4679G = strT;
        }
        this.f4676D = 11;
        double d6 = Double.parseDouble(this.f4679G);
        if (!this.f4685x && (Double.isNaN(d6) || Double.isInfinite(d6))) {
            throw new c("JSON forbids NaN and infinities: " + d6 + L());
        }
        this.f4679G = null;
        this.f4676D = 0;
        int[] iArr2 = this.f4683K;
        int i7 = this.f4681I - 1;
        iArr2[i7] = iArr2[i7] + 1;
        return d6;
    }

    public final int O() throws IOException {
        String strT;
        int iH = this.f4676D;
        if (iH == 0) {
            iH = h();
        }
        if (iH == 15) {
            long j6 = this.f4677E;
            int i6 = (int) j6;
            if (j6 != i6) {
                throw new NumberFormatException("Expected an int but was " + this.f4677E + L());
            }
            this.f4676D = 0;
            int[] iArr = this.f4683K;
            int i7 = this.f4681I - 1;
            iArr[i7] = iArr[i7] + 1;
            return i6;
        }
        if (iH == 16) {
            this.f4679G = new String(this.f4686y, this.f4687z, this.f4678F);
            this.f4687z += this.f4678F;
        } else {
            if (iH != 8 && iH != 9 && iH != 10) {
                throw new IllegalStateException("Expected an int but was " + H1.a.D(W()) + L());
            }
            if (iH == 10) {
                strT = V();
            } else {
                strT = T(iH == 8 ? '\'' : '\"');
            }
            this.f4679G = strT;
            try {
                int i8 = Integer.parseInt(this.f4679G);
                this.f4676D = 0;
                int[] iArr2 = this.f4683K;
                int i9 = this.f4681I - 1;
                iArr2[i9] = iArr2[i9] + 1;
                return i8;
            } catch (NumberFormatException unused) {
            }
        }
        this.f4676D = 11;
        double d6 = Double.parseDouble(this.f4679G);
        int i10 = (int) d6;
        if (i10 != d6) {
            throw new NumberFormatException("Expected an int but was " + this.f4679G + L());
        }
        this.f4679G = null;
        this.f4676D = 0;
        int[] iArr3 = this.f4683K;
        int i11 = this.f4681I - 1;
        iArr3[i11] = iArr3[i11] + 1;
        return i10;
    }

    public final long P() throws IOException {
        String strT;
        int iH = this.f4676D;
        if (iH == 0) {
            iH = h();
        }
        if (iH == 15) {
            this.f4676D = 0;
            int[] iArr = this.f4683K;
            int i6 = this.f4681I - 1;
            iArr[i6] = iArr[i6] + 1;
            return this.f4677E;
        }
        if (iH == 16) {
            this.f4679G = new String(this.f4686y, this.f4687z, this.f4678F);
            this.f4687z += this.f4678F;
        } else {
            if (iH != 8 && iH != 9 && iH != 10) {
                throw new IllegalStateException("Expected a long but was " + H1.a.D(W()) + L());
            }
            if (iH == 10) {
                strT = V();
            } else {
                strT = T(iH == 8 ? '\'' : '\"');
            }
            this.f4679G = strT;
            try {
                long j6 = Long.parseLong(this.f4679G);
                this.f4676D = 0;
                int[] iArr2 = this.f4683K;
                int i7 = this.f4681I - 1;
                iArr2[i7] = iArr2[i7] + 1;
                return j6;
            } catch (NumberFormatException unused) {
            }
        }
        this.f4676D = 11;
        double d6 = Double.parseDouble(this.f4679G);
        long j7 = (long) d6;
        if (j7 != d6) {
            throw new NumberFormatException("Expected a long but was " + this.f4679G + L());
        }
        this.f4679G = null;
        this.f4676D = 0;
        int[] iArr3 = this.f4683K;
        int i8 = this.f4681I - 1;
        iArr3[i8] = iArr3[i8] + 1;
        return j7;
    }

    public final String Q() throws IOException {
        char c6;
        String strT;
        int iH = this.f4676D;
        if (iH == 0) {
            iH = h();
        }
        if (iH == 14) {
            strT = V();
        } else {
            if (iH == 12) {
                c6 = '\'';
            } else {
                if (iH != 13) {
                    throw new IllegalStateException("Expected a name but was " + H1.a.D(W()) + L());
                }
                c6 = '\"';
            }
            strT = T(c6);
        }
        this.f4676D = 0;
        this.f4682J[this.f4681I - 1] = strT;
        return strT;
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x0072, code lost:
    
        if (r1 == '/') goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0074, code lost:
    
        return r5;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int R(boolean r10) throws java.io.IOException {
        /*
            Method dump skipped, instruction units count: 217
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X3.a.R(boolean):int");
    }

    public final void S() {
        int iH = this.f4676D;
        if (iH == 0) {
            iH = h();
        }
        if (iH != 7) {
            throw new IllegalStateException("Expected null but was " + H1.a.D(W()) + L());
        }
        this.f4676D = 0;
        int[] iArr = this.f4683K;
        int i6 = this.f4681I - 1;
        iArr[i6] = iArr[i6] + 1;
    }

    public final String T(char c6) throws c {
        StringBuilder sb = null;
        while (true) {
            int i6 = this.f4687z;
            int i7 = this.f4673A;
            while (true) {
                char[] cArr = this.f4686y;
                if (i6 < i7) {
                    int i8 = i6 + 1;
                    char c7 = cArr[i6];
                    if (c7 == c6) {
                        this.f4687z = i8;
                        int i9 = (i8 - i6) - 1;
                        if (sb == null) {
                            return new String(cArr, i6, i9);
                        }
                        sb.append(cArr, i6, i9);
                        return sb.toString();
                    }
                    if (c7 == '\\') {
                        this.f4687z = i8;
                        int i10 = i8 - i6;
                        int i11 = i10 - 1;
                        if (sb == null) {
                            sb = new StringBuilder(Math.max(i10 * 2, 16));
                        }
                        sb.append(cArr, i6, i11);
                        sb.append(Y());
                    } else {
                        if (c7 == '\n') {
                            this.f4674B++;
                            this.f4675C = i8;
                        }
                        i6 = i8;
                    }
                } else {
                    if (sb == null) {
                        sb = new StringBuilder(Math.max((i6 - i6) * 2, 16));
                    }
                    sb.append(cArr, i6, i6 - i6);
                    this.f4687z = i6;
                    if (!n(1)) {
                        d0("Unterminated string");
                        throw null;
                    }
                }
            }
        }
    }

    public final String U() throws IOException {
        String str;
        char c6;
        int iH = this.f4676D;
        if (iH == 0) {
            iH = h();
        }
        if (iH == 10) {
            str = V();
        } else {
            if (iH == 8) {
                c6 = '\'';
            } else if (iH == 9) {
                c6 = '\"';
            } else if (iH == 11) {
                str = this.f4679G;
                this.f4679G = null;
            } else if (iH == 15) {
                str = Long.toString(this.f4677E);
            } else {
                if (iH != 16) {
                    throw new IllegalStateException("Expected a string but was " + H1.a.D(W()) + L());
                }
                str = new String(this.f4686y, this.f4687z, this.f4678F);
                this.f4687z += this.f4678F;
            }
            str = T(c6);
        }
        this.f4676D = 0;
        int[] iArr = this.f4683K;
        int i6 = this.f4681I - 1;
        iArr[i6] = iArr[i6] + 1;
        return str;
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x004a, code lost:
    
        g();
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:32:0x0044. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:46:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0084  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.String V() throws X3.c {
        /*
            r7 = this;
            r0 = 0
            r1 = 0
        L2:
            r2 = r1
        L3:
            int r3 = r7.f4687z
            int r4 = r3 + r2
            int r5 = r7.f4673A
            char[] r6 = r7.f4686y
            if (r4 >= r5) goto L4e
            int r3 = r3 + r2
            char r3 = r6[r3]
            r4 = 9
            if (r3 == r4) goto L5a
            r4 = 10
            if (r3 == r4) goto L5a
            r4 = 12
            if (r3 == r4) goto L5a
            r4 = 13
            if (r3 == r4) goto L5a
            r4 = 32
            if (r3 == r4) goto L5a
            r4 = 35
            if (r3 == r4) goto L4a
            r4 = 44
            if (r3 == r4) goto L5a
            r4 = 47
            if (r3 == r4) goto L4a
            r4 = 61
            if (r3 == r4) goto L4a
            r4 = 123(0x7b, float:1.72E-43)
            if (r3 == r4) goto L5a
            r4 = 125(0x7d, float:1.75E-43)
            if (r3 == r4) goto L5a
            r4 = 58
            if (r3 == r4) goto L5a
            r4 = 59
            if (r3 == r4) goto L4a
            switch(r3) {
                case 91: goto L5a;
                case 92: goto L4a;
                case 93: goto L5a;
                default: goto L47;
            }
        L47:
            int r2 = r2 + 1
            goto L3
        L4a:
            r7.g()
            goto L5a
        L4e:
            int r3 = r6.length
            if (r2 >= r3) goto L5c
            int r3 = r2 + 1
            boolean r3 = r7.n(r3)
            if (r3 == 0) goto L5a
            goto L3
        L5a:
            r1 = r2
            goto L7a
        L5c:
            if (r0 != 0) goto L69
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r3 = 16
            int r3 = java.lang.Math.max(r2, r3)
            r0.<init>(r3)
        L69:
            int r3 = r7.f4687z
            r0.append(r6, r3, r2)
            int r3 = r7.f4687z
            int r3 = r3 + r2
            r7.f4687z = r3
            r2 = 1
            boolean r2 = r7.n(r2)
            if (r2 != 0) goto L2
        L7a:
            if (r0 != 0) goto L84
            java.lang.String r0 = new java.lang.String
            int r2 = r7.f4687z
            r0.<init>(r6, r2, r1)
            goto L8d
        L84:
            int r2 = r7.f4687z
            r0.append(r6, r2, r1)
            java.lang.String r0 = r0.toString()
        L8d:
            int r2 = r7.f4687z
            int r2 = r2 + r1
            r7.f4687z = r2
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X3.a.V():java.lang.String");
    }

    public final int W() throws IOException {
        int iH = this.f4676D;
        if (iH == 0) {
            iH = h();
        }
        switch (iH) {
            case 1:
                return 3;
            case j.FLOAT_FIELD_NUMBER /* 2 */:
                return 4;
            case j.INTEGER_FIELD_NUMBER /* 3 */:
                return 1;
            case j.LONG_FIELD_NUMBER /* 4 */:
                return 2;
            case j.STRING_FIELD_NUMBER /* 5 */:
            case j.STRING_SET_FIELD_NUMBER /* 6 */:
                return 8;
            case j.DOUBLE_FIELD_NUMBER /* 7 */:
                return 9;
            case j.BYTES_FIELD_NUMBER /* 8 */:
            case 9:
            case 10:
            case 11:
                return 6;
            case 12:
            case 13:
            case 14:
                return 5;
            case 15:
            case 16:
                return 7;
            case 17:
                return 10;
            default:
                throw new AssertionError();
        }
    }

    public final void X(int i6) {
        int i7 = this.f4681I;
        int[] iArr = this.f4680H;
        if (i7 == iArr.length) {
            int i8 = i7 * 2;
            this.f4680H = Arrays.copyOf(iArr, i8);
            this.f4683K = Arrays.copyOf(this.f4683K, i8);
            this.f4682J = (String[]) Arrays.copyOf(this.f4682J, i8);
        }
        int[] iArr2 = this.f4680H;
        int i9 = this.f4681I;
        this.f4681I = i9 + 1;
        iArr2[i9] = i6;
    }

    public final char Y() throws c {
        int i6;
        if (this.f4687z == this.f4673A && !n(1)) {
            d0("Unterminated escape sequence");
            throw null;
        }
        int i7 = this.f4687z;
        int i8 = i7 + 1;
        this.f4687z = i8;
        char[] cArr = this.f4686y;
        char c6 = cArr[i7];
        if (c6 == '\n') {
            this.f4674B++;
            this.f4675C = i8;
        } else if (c6 != '\"' && c6 != '\'' && c6 != '/' && c6 != '\\') {
            if (c6 == 'b') {
                return '\b';
            }
            if (c6 == 'f') {
                return '\f';
            }
            if (c6 == 'n') {
                return '\n';
            }
            if (c6 == 'r') {
                return '\r';
            }
            if (c6 == 't') {
                return '\t';
            }
            if (c6 != 'u') {
                d0("Invalid escape sequence");
                throw null;
            }
            if (i7 + 5 > this.f4673A && !n(4)) {
                d0("Unterminated escape sequence");
                throw null;
            }
            int i9 = this.f4687z;
            int i10 = i9 + 4;
            char c7 = 0;
            while (i9 < i10) {
                char c8 = cArr[i9];
                char c9 = (char) (c7 << 4);
                if (c8 >= '0' && c8 <= '9') {
                    i6 = c8 - '0';
                } else if (c8 >= 'a' && c8 <= 'f') {
                    i6 = c8 - 'W';
                } else {
                    if (c8 < 'A' || c8 > 'F') {
                        throw new NumberFormatException("\\u".concat(new String(cArr, this.f4687z, 4)));
                    }
                    i6 = c8 - '7';
                }
                c7 = (char) (i6 + c9);
                i9++;
            }
            this.f4687z += 4;
            return c7;
        }
        return c6;
    }

    public final void Z(char c6) throws c {
        while (true) {
            int i6 = this.f4687z;
            int i7 = this.f4673A;
            while (true) {
                if (i6 < i7) {
                    int i8 = i6 + 1;
                    char c7 = this.f4686y[i6];
                    if (c7 == c6) {
                        this.f4687z = i8;
                        return;
                    }
                    if (c7 == '\\') {
                        this.f4687z = i8;
                        Y();
                        break;
                    } else {
                        if (c7 == '\n') {
                            this.f4674B++;
                            this.f4675C = i8;
                        }
                        i6 = i8;
                    }
                } else {
                    this.f4687z = i6;
                    if (!n(1)) {
                        d0("Unterminated string");
                        throw null;
                    }
                }
            }
        }
    }

    public final void a0() {
        char c6;
        do {
            if (this.f4687z >= this.f4673A && !n(1)) {
                return;
            }
            int i6 = this.f4687z;
            int i7 = i6 + 1;
            this.f4687z = i7;
            c6 = this.f4686y[i6];
            if (c6 == '\n') {
                this.f4674B++;
                this.f4675C = i7;
                return;
            }
        } while (c6 != '\r');
    }

    public final void b() {
        int iH = this.f4676D;
        if (iH == 0) {
            iH = h();
        }
        if (iH == 3) {
            X(1);
            this.f4683K[this.f4681I - 1] = 0;
            this.f4676D = 0;
        } else {
            throw new IllegalStateException("Expected BEGIN_ARRAY but was " + H1.a.D(W()) + L());
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x0048, code lost:
    
        g();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void b0() throws X3.c {
        /*
            r4 = this;
        L0:
            r0 = 0
        L1:
            int r1 = r4.f4687z
            int r2 = r1 + r0
            int r3 = r4.f4673A
            if (r2 >= r3) goto L51
            char[] r2 = r4.f4686y
            int r1 = r1 + r0
            char r1 = r2[r1]
            r2 = 9
            if (r1 == r2) goto L4b
            r2 = 10
            if (r1 == r2) goto L4b
            r2 = 12
            if (r1 == r2) goto L4b
            r2 = 13
            if (r1 == r2) goto L4b
            r2 = 32
            if (r1 == r2) goto L4b
            r2 = 35
            if (r1 == r2) goto L48
            r2 = 44
            if (r1 == r2) goto L4b
            r2 = 47
            if (r1 == r2) goto L48
            r2 = 61
            if (r1 == r2) goto L48
            r2 = 123(0x7b, float:1.72E-43)
            if (r1 == r2) goto L4b
            r2 = 125(0x7d, float:1.75E-43)
            if (r1 == r2) goto L4b
            r2 = 58
            if (r1 == r2) goto L4b
            r2 = 59
            if (r1 == r2) goto L48
            switch(r1) {
                case 91: goto L4b;
                case 92: goto L48;
                case 93: goto L4b;
                default: goto L45;
            }
        L45:
            int r0 = r0 + 1
            goto L1
        L48:
            r4.g()
        L4b:
            int r1 = r4.f4687z
            int r1 = r1 + r0
            r4.f4687z = r1
            return
        L51:
            int r1 = r1 + r0
            r4.f4687z = r1
            r0 = 1
            boolean r0 = r4.n(r0)
            if (r0 != 0) goto L0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X3.a.b0():void");
    }

    public final void c() throws IOException {
        int iH = this.f4676D;
        if (iH == 0) {
            iH = h();
        }
        if (iH == 1) {
            X(3);
            this.f4676D = 0;
        } else {
            throw new IllegalStateException("Expected BEGIN_OBJECT but was " + H1.a.D(W()) + L());
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public final void c0() throws IOException {
        int i6 = 0;
        do {
            int iH = this.f4676D;
            if (iH == 0) {
                iH = h();
            }
            switch (iH) {
                case 1:
                    X(3);
                    i6++;
                    this.f4676D = 0;
                    break;
                case j.FLOAT_FIELD_NUMBER /* 2 */:
                    if (i6 == 0) {
                        this.f4682J[this.f4681I - 1] = null;
                    }
                    this.f4681I--;
                    i6--;
                    this.f4676D = 0;
                    break;
                case j.INTEGER_FIELD_NUMBER /* 3 */:
                    X(1);
                    i6++;
                    this.f4676D = 0;
                    break;
                case j.LONG_FIELD_NUMBER /* 4 */:
                    this.f4681I--;
                    i6--;
                    this.f4676D = 0;
                    break;
                case j.STRING_FIELD_NUMBER /* 5 */:
                case j.STRING_SET_FIELD_NUMBER /* 6 */:
                case j.DOUBLE_FIELD_NUMBER /* 7 */:
                case 11:
                case 15:
                default:
                    this.f4676D = 0;
                    break;
                case j.BYTES_FIELD_NUMBER /* 8 */:
                    Z('\'');
                    this.f4676D = 0;
                    break;
                case 9:
                    Z('\"');
                    this.f4676D = 0;
                    break;
                case 10:
                    b0();
                    this.f4676D = 0;
                    break;
                case 12:
                    Z('\'');
                    if (i6 == 0) {
                        this.f4682J[this.f4681I - 1] = "<skipped>";
                    }
                    this.f4676D = 0;
                    break;
                case 13:
                    Z('\"');
                    if (i6 == 0) {
                        this.f4682J[this.f4681I - 1] = "<skipped>";
                    }
                    this.f4676D = 0;
                    break;
                case 14:
                    b0();
                    if (i6 == 0) {
                        this.f4682J[this.f4681I - 1] = "<skipped>";
                    }
                    this.f4676D = 0;
                    break;
                case 16:
                    this.f4687z += this.f4678F;
                    this.f4676D = 0;
                    break;
                case 17:
                    break;
            }
            return;
        } while (i6 > 0);
        int[] iArr = this.f4683K;
        int i7 = this.f4681I - 1;
        iArr[i7] = iArr[i7] + 1;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.f4676D = 0;
        this.f4680H[0] = 8;
        this.f4681I = 1;
        this.f4684w.close();
    }

    public final void d0(String str) throws c {
        throw new c(str + L());
    }

    public final void g() throws c {
        if (this.f4685x) {
            return;
        }
        d0("Use JsonReader.setLenient(true) to accept malformed JSON");
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:167:0x0213, code lost:
    
        if (K(r1) != false) goto L122;
     */
    /* JADX WARN: Removed duplicated region for block: B:116:0x017a A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:117:0x017b  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x01aa  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x0269  */
    /* JADX WARN: Removed duplicated region for block: B:208:0x0279 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:209:0x027a  */
    /* JADX WARN: Removed duplicated region for block: B:231:0x02bf  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00e5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int h() throws java.io.IOException {
        /*
            Method dump skipped, instruction units count: 802
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X3.a.h():int");
    }

    public final void k() {
        int iH = this.f4676D;
        if (iH == 0) {
            iH = h();
        }
        if (iH != 4) {
            throw new IllegalStateException("Expected END_ARRAY but was " + H1.a.D(W()) + L());
        }
        int i6 = this.f4681I;
        this.f4681I = i6 - 1;
        int[] iArr = this.f4683K;
        int i7 = i6 - 2;
        iArr[i7] = iArr[i7] + 1;
        this.f4676D = 0;
    }

    public final void l() throws IOException {
        int iH = this.f4676D;
        if (iH == 0) {
            iH = h();
        }
        if (iH != 2) {
            throw new IllegalStateException("Expected END_OBJECT but was " + H1.a.D(W()) + L());
        }
        int i6 = this.f4681I;
        int i7 = i6 - 1;
        this.f4681I = i7;
        this.f4682J[i7] = null;
        int[] iArr = this.f4683K;
        int i8 = i6 - 2;
        iArr[i8] = iArr[i8] + 1;
        this.f4676D = 0;
    }

    public final boolean n(int i6) throws IOException {
        int i7;
        int i8;
        int i9 = this.f4675C;
        int i10 = this.f4687z;
        this.f4675C = i9 - i10;
        int i11 = this.f4673A;
        char[] cArr = this.f4686y;
        if (i11 != i10) {
            int i12 = i11 - i10;
            this.f4673A = i12;
            System.arraycopy(cArr, i10, cArr, 0, i12);
        } else {
            this.f4673A = 0;
        }
        this.f4687z = 0;
        do {
            int i13 = this.f4673A;
            int i14 = this.f4684w.read(cArr, i13, cArr.length - i13);
            if (i14 == -1) {
                return false;
            }
            i7 = this.f4673A + i14;
            this.f4673A = i7;
            if (this.f4674B == 0 && (i8 = this.f4675C) == 0 && i7 > 0 && cArr[0] == 65279) {
                this.f4687z++;
                this.f4675C = i8 + 1;
                i6++;
            }
        } while (i7 < i6);
        return true;
    }

    public final String toString() {
        return a.class.getSimpleName() + L();
    }

    public final String u(boolean z5) {
        StringBuilder sb = new StringBuilder("$");
        int i6 = 0;
        while (true) {
            int i7 = this.f4681I;
            if (i6 >= i7) {
                return sb.toString();
            }
            int i8 = this.f4680H[i6];
            if (i8 == 1 || i8 == 2) {
                int i9 = this.f4683K[i6];
                if (z5 && i9 > 0 && i6 == i7 - 1) {
                    i9--;
                }
                sb.append('[');
                sb.append(i9);
                sb.append(']');
            } else if (i8 == 3 || i8 == 4 || i8 == 5) {
                sb.append('.');
                String str = this.f4682J[i6];
                if (str != null) {
                    sb.append(str);
                }
            }
            i6++;
        }
    }
}
