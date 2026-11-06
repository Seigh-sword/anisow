package m3;

/* JADX INFO: loaded from: classes.dex */
public final class W extends A0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f11428a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f11429b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f11430c;

    public W(String str, String str2, long j6) {
        this.f11428a = str;
        this.f11429b = str2;
        this.f11430c = j6;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof A0)) {
            return false;
        }
        A0 a02 = (A0) obj;
        if (this.f11428a.equals(((W) a02).f11428a)) {
            W w5 = (W) a02;
            if (this.f11429b.equals(w5.f11429b) && this.f11430c == w5.f11430c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = (((this.f11428a.hashCode() ^ 1000003) * 1000003) ^ this.f11429b.hashCode()) * 1000003;
        long j6 = this.f11430c;
        return iHashCode ^ ((int) ((j6 >>> 32) ^ j6));
    }

    public final String toString() {
        return "Signal{name=" + this.f11428a + ", code=" + this.f11429b + ", address=" + this.f11430c + "}";
    }
}
