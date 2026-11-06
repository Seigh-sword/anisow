package X3;

import java.io.Closeable;
import java.io.Flushable;
import java.io.IOException;
import java.io.Writer;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Arrays;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes.dex */
public class b implements Closeable, Flushable {

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public static final Pattern f4688E = Pattern.compile("-?(?:0|[1-9][0-9]*)(?:\\.[0-9]+)?(?:[eE][-+]?[0-9]+)?");

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public static final String[] f4689F = new String[128];

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public static final String[] f4690G;

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public boolean f4691A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public boolean f4692B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public String f4693C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public boolean f4694D;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final Writer f4695w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int[] f4696x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f4697y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final String f4698z;

    static {
        for (int i6 = 0; i6 <= 31; i6++) {
            f4689F[i6] = String.format("\\u%04x", Integer.valueOf(i6));
        }
        String[] strArr = f4689F;
        strArr[34] = "\\\"";
        strArr[92] = "\\\\";
        strArr[9] = "\\t";
        strArr[8] = "\\b";
        strArr[10] = "\\n";
        strArr[13] = "\\r";
        strArr[12] = "\\f";
        String[] strArr2 = (String[]) strArr.clone();
        f4690G = strArr2;
        strArr2[60] = "\\u003c";
        strArr2[62] = "\\u003e";
        strArr2[38] = "\\u0026";
        strArr2[61] = "\\u003d";
        strArr2[39] = "\\u0027";
    }

    public b(Writer writer) {
        int[] iArr = new int[32];
        this.f4696x = iArr;
        this.f4697y = 0;
        if (iArr.length == 0) {
            this.f4696x = Arrays.copyOf(iArr, 0);
        }
        int[] iArr2 = this.f4696x;
        int i6 = this.f4697y;
        this.f4697y = i6 + 1;
        iArr2[i6] = 6;
        this.f4698z = ":";
        this.f4694D = true;
        Objects.requireNonNull(writer, "out == null");
        this.f4695w = writer;
    }

    public b J() throws IOException {
        if (this.f4693C != null) {
            if (!this.f4694D) {
                this.f4693C = null;
                return this;
            }
            S();
        }
        b();
        this.f4695w.write("null");
        return this;
    }

    public final int K() {
        int i6 = this.f4697y;
        if (i6 != 0) {
            return this.f4696x[i6 - 1];
        }
        throw new IllegalStateException("JsonWriter is closed.");
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0034  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void L(java.lang.String r9) throws java.io.IOException {
        /*
            r8 = this;
            boolean r0 = r8.f4692B
            if (r0 == 0) goto L7
            java.lang.String[] r0 = X3.b.f4690G
            goto L9
        L7:
            java.lang.String[] r0 = X3.b.f4689F
        L9:
            java.io.Writer r1 = r8.f4695w
            r2 = 34
            r1.write(r2)
            int r3 = r9.length()
            r4 = 0
            r5 = r4
        L16:
            if (r4 >= r3) goto L41
            char r6 = r9.charAt(r4)
            r7 = 128(0x80, float:1.8E-43)
            if (r6 >= r7) goto L25
            r6 = r0[r6]
            if (r6 != 0) goto L32
            goto L3e
        L25:
            r7 = 8232(0x2028, float:1.1535E-41)
            if (r6 != r7) goto L2c
            java.lang.String r6 = "\\u2028"
            goto L32
        L2c:
            r7 = 8233(0x2029, float:1.1537E-41)
            if (r6 != r7) goto L3e
            java.lang.String r6 = "\\u2029"
        L32:
            if (r5 >= r4) goto L39
            int r7 = r4 - r5
            r1.write(r9, r5, r7)
        L39:
            r1.write(r6)
            int r5 = r4 + 1
        L3e:
            int r4 = r4 + 1
            goto L16
        L41:
            if (r5 >= r3) goto L47
            int r3 = r3 - r5
            r1.write(r9, r5, r3)
        L47:
            r1.write(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X3.b.L(java.lang.String):void");
    }

    public void M(double d6) throws IOException {
        S();
        if (this.f4691A || !(Double.isNaN(d6) || Double.isInfinite(d6))) {
            b();
            this.f4695w.append((CharSequence) Double.toString(d6));
        } else {
            throw new IllegalArgumentException("Numeric values must be finite, but was " + d6);
        }
    }

    public void N(long j6) throws IOException {
        S();
        b();
        this.f4695w.write(Long.toString(j6));
    }

    public void O(Boolean bool) throws IOException {
        if (bool == null) {
            J();
            return;
        }
        S();
        b();
        this.f4695w.write(bool.booleanValue() ? "true" : "false");
    }

    public void P(Number number) throws IOException {
        if (number == null) {
            J();
            return;
        }
        S();
        String string = number.toString();
        if (!string.equals("-Infinity") && !string.equals("Infinity") && !string.equals("NaN")) {
            Class<?> cls = number.getClass();
            if (cls != Integer.class && cls != Long.class && cls != Double.class && cls != Float.class && cls != Byte.class && cls != Short.class && cls != BigDecimal.class && cls != BigInteger.class && cls != AtomicInteger.class && cls != AtomicLong.class && !f4688E.matcher(string).matches()) {
                throw new IllegalArgumentException("String created by " + cls + " is not a valid JSON number: " + string);
            }
        } else if (!this.f4691A) {
            throw new IllegalArgumentException("Numeric values must be finite, but was ".concat(string));
        }
        b();
        this.f4695w.append((CharSequence) string);
    }

    public void Q(String str) throws IOException {
        if (str == null) {
            J();
            return;
        }
        S();
        b();
        L(str);
    }

    public void R(boolean z5) throws IOException {
        S();
        b();
        this.f4695w.write(z5 ? "true" : "false");
    }

    public final void S() throws IOException {
        if (this.f4693C != null) {
            int iK = K();
            if (iK == 5) {
                this.f4695w.write(44);
            } else if (iK != 3) {
                throw new IllegalStateException("Nesting problem.");
            }
            u();
            this.f4696x[this.f4697y - 1] = 4;
            L(this.f4693C);
            this.f4693C = null;
        }
    }

    public final void b() throws IOException {
        int iK = K();
        if (iK != 1) {
            Writer writer = this.f4695w;
            if (iK != 2) {
                if (iK == 4) {
                    writer.append((CharSequence) this.f4698z);
                    this.f4696x[this.f4697y - 1] = 5;
                    return;
                }
                if (iK != 6) {
                    if (iK != 7) {
                        throw new IllegalStateException("Nesting problem.");
                    }
                    if (!this.f4691A) {
                        throw new IllegalStateException("JSON must have only one top-level value.");
                    }
                }
                this.f4696x[this.f4697y - 1] = 7;
                return;
            }
            writer.append(',');
        } else {
            this.f4696x[this.f4697y - 1] = 2;
        }
        u();
    }

    public void c() throws IOException {
        S();
        b();
        int i6 = this.f4697y;
        int[] iArr = this.f4696x;
        if (i6 == iArr.length) {
            this.f4696x = Arrays.copyOf(iArr, i6 * 2);
        }
        int[] iArr2 = this.f4696x;
        int i7 = this.f4697y;
        this.f4697y = i7 + 1;
        iArr2[i7] = 1;
        this.f4695w.write(91);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f4695w.close();
        int i6 = this.f4697y;
        if (i6 > 1 || (i6 == 1 && this.f4696x[i6 - 1] != 7)) {
            throw new IOException("Incomplete document");
        }
        this.f4697y = 0;
    }

    public void flush() throws IOException {
        if (this.f4697y == 0) {
            throw new IllegalStateException("JsonWriter is closed.");
        }
        this.f4695w.flush();
    }

    public void g() throws IOException {
        S();
        b();
        int i6 = this.f4697y;
        int[] iArr = this.f4696x;
        if (i6 == iArr.length) {
            this.f4696x = Arrays.copyOf(iArr, i6 * 2);
        }
        int[] iArr2 = this.f4696x;
        int i7 = this.f4697y;
        this.f4697y = i7 + 1;
        iArr2[i7] = 3;
        this.f4695w.write(123);
    }

    public final void h(int i6, int i7, char c6) throws IOException {
        int iK = K();
        if (iK != i7 && iK != i6) {
            throw new IllegalStateException("Nesting problem.");
        }
        if (this.f4693C != null) {
            throw new IllegalStateException("Dangling name: " + this.f4693C);
        }
        this.f4697y--;
        if (iK == i7) {
            u();
        }
        this.f4695w.write(c6);
    }

    public void k() throws IOException {
        h(1, 2, ']');
    }

    public void l() throws IOException {
        h(3, 5, '}');
    }

    public void n(String str) {
        Objects.requireNonNull(str, "name == null");
        if (this.f4693C != null) {
            throw new IllegalStateException();
        }
        if (this.f4697y == 0) {
            throw new IllegalStateException("JsonWriter is closed.");
        }
        this.f4693C = str;
    }

    public final void u() {
    }
}
