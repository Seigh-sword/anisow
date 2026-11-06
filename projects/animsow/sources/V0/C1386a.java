package v0;

/* JADX INFO: renamed from: v0.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1386a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f13074a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f13075b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object f13076c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f13077d;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1386a)) {
            return false;
        }
        C1386a c1386a = (C1386a) obj;
        int i6 = this.f13074a;
        if (i6 != c1386a.f13074a) {
            return false;
        }
        if (i6 == 8 && Math.abs(this.f13077d - this.f13075b) == 1 && this.f13077d == c1386a.f13075b && this.f13075b == c1386a.f13077d) {
            return true;
        }
        if (this.f13077d != c1386a.f13077d || this.f13075b != c1386a.f13075b) {
            return false;
        }
        Object obj2 = this.f13076c;
        Object obj3 = c1386a.f13076c;
        if (obj2 != null) {
            if (!obj2.equals(obj3)) {
                return false;
            }
        } else if (obj3 != null) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (((this.f13074a * 31) + this.f13075b) * 31) + this.f13077d;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append("[");
        int i6 = this.f13074a;
        sb.append(i6 != 1 ? i6 != 2 ? i6 != 4 ? i6 != 8 ? "??" : "mv" : "up" : "rm" : "add");
        sb.append(",s:");
        sb.append(this.f13075b);
        sb.append("c:");
        sb.append(this.f13077d);
        sb.append(",p:");
        sb.append(this.f13076c);
        sb.append("]");
        return sb.toString();
    }
}
