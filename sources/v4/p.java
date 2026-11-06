package V4;

import d.AbstractC0628i;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Locale;
import x1.C1486b;

/* JADX INFO: loaded from: classes.dex */
public final class p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String[] f3892a;

    public p(C1486b c1486b) {
        ArrayList arrayList = c1486b.f13667a;
        this.f3892a = (String[]) arrayList.toArray(new String[arrayList.size()]);
    }

    public static void a(String str) {
        if (str == null) {
            throw new NullPointerException("name == null");
        }
        if (str.isEmpty()) {
            throw new IllegalArgumentException("name is empty");
        }
        int length = str.length();
        for (int i6 = 0; i6 < length; i6++) {
            char cCharAt = str.charAt(i6);
            if (cCharAt <= ' ' || cCharAt >= 127) {
                Object[] objArr = {Integer.valueOf(cCharAt), Integer.valueOf(i6), str};
                byte[] bArr = W4.b.f4484a;
                throw new IllegalArgumentException(String.format(Locale.US, "Unexpected char %#04x at %d in header name: %s", objArr));
            }
        }
    }

    public static void b(String str, String str2) {
        if (str == null) {
            throw new NullPointerException(AbstractC0628i.j("value for name ", str2, " == null"));
        }
        int length = str.length();
        for (int i6 = 0; i6 < length; i6++) {
            char cCharAt = str.charAt(i6);
            if ((cCharAt <= 31 && cCharAt != '\t') || cCharAt >= 127) {
                Object[] objArr = {Integer.valueOf(cCharAt), Integer.valueOf(i6), str2, str};
                byte[] bArr = W4.b.f4484a;
                throw new IllegalArgumentException(String.format(Locale.US, "Unexpected char %#04x at %d in %s value: %s", objArr));
            }
        }
    }

    public static p f(String... strArr) {
        if (strArr.length % 2 != 0) {
            throw new IllegalArgumentException("Expected alternating header names and values");
        }
        String[] strArr2 = (String[]) strArr.clone();
        for (int i6 = 0; i6 < strArr2.length; i6++) {
            String str = strArr2[i6];
            if (str == null) {
                throw new IllegalArgumentException("Headers cannot be null");
            }
            strArr2[i6] = str.trim();
        }
        for (int i7 = 0; i7 < strArr2.length; i7 += 2) {
            String str2 = strArr2[i7];
            String str3 = strArr2[i7 + 1];
            a(str2);
            b(str3, str2);
        }
        return new p(strArr2);
    }

    public final String c(String str) {
        String[] strArr = this.f3892a;
        for (int length = strArr.length - 2; length >= 0; length -= 2) {
            if (str.equalsIgnoreCase(strArr[length])) {
                return strArr[length + 1];
            }
        }
        return null;
    }

    public final String d(int i6) {
        return this.f3892a[i6 * 2];
    }

    public final C1486b e() {
        C1486b c1486b = new C1486b(2);
        Collections.addAll(c1486b.f13667a, this.f3892a);
        return c1486b;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof p) && Arrays.equals(((p) obj).f3892a, this.f3892a);
    }

    public final int g() {
        return this.f3892a.length / 2;
    }

    public final String h(int i6) {
        return this.f3892a[(i6 * 2) + 1];
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f3892a);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        int iG = g();
        for (int i6 = 0; i6 < iG; i6++) {
            sb.append(d(i6));
            sb.append(": ");
            sb.append(h(i6));
            sb.append("\n");
        }
        return sb.toString();
    }

    public p(String[] strArr) {
        this.f3892a = strArr;
    }
}
