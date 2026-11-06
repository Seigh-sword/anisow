package m3;

/* JADX INFO: loaded from: classes.dex */
public final class Q extends L0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f11401a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f11402b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final F0 f11403c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final G0 f11404d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final H0 f11405e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final K0 f11406f;

    public Q(long j6, String str, F0 f02, G0 g02, H0 h02, K0 k02) {
        this.f11401a = j6;
        this.f11402b = str;
        this.f11403c = f02;
        this.f11404d = g02;
        this.f11405e = h02;
        this.f11406f = k02;
    }

    public final P a() {
        P p5 = new P();
        p5.f11393a = this.f11401a;
        p5.f11394b = this.f11402b;
        p5.f11395c = this.f11403c;
        p5.f11396d = this.f11404d;
        p5.f11397e = this.f11405e;
        p5.f11398f = this.f11406f;
        p5.f11399g = (byte) 1;
        return p5;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof L0)) {
            return false;
        }
        L0 l02 = (L0) obj;
        if (this.f11401a == ((Q) l02).f11401a) {
            Q q5 = (Q) l02;
            if (this.f11402b.equals(q5.f11402b) && this.f11403c.equals(q5.f11403c) && this.f11404d.equals(q5.f11404d)) {
                H0 h02 = q5.f11405e;
                H0 h03 = this.f11405e;
                if (h03 != null ? h03.equals(h02) : h02 == null) {
                    K0 k02 = q5.f11406f;
                    K0 k03 = this.f11406f;
                    if (k03 == null) {
                        if (k02 == null) {
                            return true;
                        }
                    } else if (k03.equals(k02)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        long j6 = this.f11401a;
        int iHashCode = (((((((((int) ((j6 >>> 32) ^ j6)) ^ 1000003) * 1000003) ^ this.f11402b.hashCode()) * 1000003) ^ this.f11403c.hashCode()) * 1000003) ^ this.f11404d.hashCode()) * 1000003;
        H0 h02 = this.f11405e;
        int iHashCode2 = (iHashCode ^ (h02 == null ? 0 : h02.hashCode())) * 1000003;
        K0 k02 = this.f11406f;
        return iHashCode2 ^ (k02 != null ? k02.hashCode() : 0);
    }

    public final String toString() {
        return "Event{timestamp=" + this.f11401a + ", type=" + this.f11402b + ", app=" + this.f11403c + ", device=" + this.f11404d + ", log=" + this.f11405e + ", rollouts=" + this.f11406f + "}";
    }
}
