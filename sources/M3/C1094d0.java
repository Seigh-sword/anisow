package m3;

/* JADX INFO: renamed from: m3.d0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1094d0 extends G0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Double f11491a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f11492b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f11493c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f11494d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f11495e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long f11496f;

    public C1094d0(Double d6, int i6, boolean z5, int i7, long j6, long j7) {
        this.f11491a = d6;
        this.f11492b = i6;
        this.f11493c = z5;
        this.f11494d = i7;
        this.f11495e = j6;
        this.f11496f = j7;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof G0)) {
            return false;
        }
        G0 g02 = (G0) obj;
        Double d6 = this.f11491a;
        if (d6 != null ? d6.equals(((C1094d0) g02).f11491a) : ((C1094d0) g02).f11491a == null) {
            if (this.f11492b == ((C1094d0) g02).f11492b) {
                C1094d0 c1094d0 = (C1094d0) g02;
                if (this.f11493c == c1094d0.f11493c && this.f11494d == c1094d0.f11494d && this.f11495e == c1094d0.f11495e && this.f11496f == c1094d0.f11496f) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        Double d6 = this.f11491a;
        int iHashCode = ((((((((d6 == null ? 0 : d6.hashCode()) ^ 1000003) * 1000003) ^ this.f11492b) * 1000003) ^ (this.f11493c ? 1231 : 1237)) * 1000003) ^ this.f11494d) * 1000003;
        long j6 = this.f11495e;
        long j7 = this.f11496f;
        return ((iHashCode ^ ((int) (j6 ^ (j6 >>> 32)))) * 1000003) ^ ((int) (j7 ^ (j7 >>> 32)));
    }

    public final String toString() {
        return "Device{batteryLevel=" + this.f11491a + ", batteryVelocity=" + this.f11492b + ", proximityOn=" + this.f11493c + ", orientation=" + this.f11494d + ", ramUsed=" + this.f11495e + ", diskUsed=" + this.f11496f + "}";
    }
}
