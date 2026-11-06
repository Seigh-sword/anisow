package m3;

/* JADX INFO: renamed from: m3.g0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1100g0 extends J0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final I0 f11517a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f11518b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f11519c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f11520d;

    public C1100g0(I0 i02, String str, String str2, long j6) {
        this.f11517a = i02;
        this.f11518b = str;
        this.f11519c = str2;
        this.f11520d = j6;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof J0)) {
            return false;
        }
        J0 j02 = (J0) obj;
        if (this.f11517a.equals(((C1100g0) j02).f11517a)) {
            C1100g0 c1100g0 = (C1100g0) j02;
            if (this.f11518b.equals(c1100g0.f11518b) && this.f11519c.equals(c1100g0.f11519c) && this.f11520d == c1100g0.f11520d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = (((((this.f11517a.hashCode() ^ 1000003) * 1000003) ^ this.f11518b.hashCode()) * 1000003) ^ this.f11519c.hashCode()) * 1000003;
        long j6 = this.f11520d;
        return iHashCode ^ ((int) ((j6 >>> 32) ^ j6));
    }

    public final String toString() {
        return "RolloutAssignment{rolloutVariant=" + this.f11517a + ", parameterKey=" + this.f11518b + ", parameterValue=" + this.f11519c + ", templateVersion=" + this.f11520d + "}";
    }
}
