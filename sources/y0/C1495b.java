package y0;

import d.AbstractC0628i;
import java.util.Locale;

/* JADX INFO: renamed from: y0.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1495b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f13695a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f13696b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f13697c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f13698d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f13699e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f13700f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f13701g;

    public C1495b(String str, String str2, boolean z5, int i6, String str3, int i7) {
        this.f13695a = str;
        this.f13696b = str2;
        this.f13698d = z5;
        this.f13699e = i6;
        int i8 = 5;
        if (str2 != null) {
            String upperCase = str2.toUpperCase(Locale.US);
            if (upperCase.contains("INT")) {
                i8 = 3;
            } else if (upperCase.contains("CHAR") || upperCase.contains("CLOB") || upperCase.contains("TEXT")) {
                i8 = 2;
            } else if (!upperCase.contains("BLOB")) {
                i8 = (upperCase.contains("REAL") || upperCase.contains("FLOA") || upperCase.contains("DOUB")) ? 4 : 1;
            }
        }
        this.f13697c = i8;
        this.f13700f = str3;
        this.f13701g = i7;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C1495b.class != obj.getClass()) {
            return false;
        }
        C1495b c1495b = (C1495b) obj;
        if (this.f13699e != c1495b.f13699e || !this.f13695a.equals(c1495b.f13695a) || this.f13698d != c1495b.f13698d) {
            return false;
        }
        String str = this.f13700f;
        int i6 = this.f13701g;
        int i7 = c1495b.f13701g;
        String str2 = c1495b.f13700f;
        if (i6 == 1 && i7 == 2 && str != null && !str.equals(str2)) {
            return false;
        }
        if (i6 != 2 || i7 != 1 || str2 == null || str2.equals(str)) {
            return (i6 == 0 || i6 != i7 || (str == null ? str2 == null : str.equals(str2))) && this.f13697c == c1495b.f13697c;
        }
        return false;
    }

    public final int hashCode() {
        return (((((this.f13695a.hashCode() * 31) + this.f13697c) * 31) + (this.f13698d ? 1231 : 1237)) * 31) + this.f13699e;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Column{name='");
        sb.append(this.f13695a);
        sb.append("', type='");
        sb.append(this.f13696b);
        sb.append("', affinity='");
        sb.append(this.f13697c);
        sb.append("', notNull=");
        sb.append(this.f13698d);
        sb.append(", primaryKeyPosition=");
        sb.append(this.f13699e);
        sb.append(", defaultValue='");
        return AbstractC0628i.m(sb, this.f13700f, "'}");
    }
}
