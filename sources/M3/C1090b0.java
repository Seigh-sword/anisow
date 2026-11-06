package m3;

/* JADX INFO: renamed from: m3.b0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1090b0 extends E0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f11464a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f11465b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f11466c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f11467d;

    public C1090b0(String str, int i6, int i7, boolean z5) {
        this.f11464a = str;
        this.f11465b = i6;
        this.f11466c = i7;
        this.f11467d = z5;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof E0)) {
            return false;
        }
        E0 e02 = (E0) obj;
        if (this.f11464a.equals(((C1090b0) e02).f11464a)) {
            C1090b0 c1090b0 = (C1090b0) e02;
            if (this.f11465b == c1090b0.f11465b && this.f11466c == c1090b0.f11466c && this.f11467d == c1090b0.f11467d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((this.f11464a.hashCode() ^ 1000003) * 1000003) ^ this.f11465b) * 1000003) ^ this.f11466c) * 1000003) ^ (this.f11467d ? 1231 : 1237);
    }

    public final String toString() {
        return "ProcessDetails{processName=" + this.f11464a + ", pid=" + this.f11465b + ", importance=" + this.f11466c + ", defaultProcess=" + this.f11467d + "}";
    }
}
