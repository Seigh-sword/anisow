package G1;

/* JADX INFO: loaded from: classes.dex */
public final class x extends K {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final J f858a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final I f859b;

    public x(J j6, I i6) {
        this.f858a = j6;
        this.f859b = i6;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof K)) {
            return false;
        }
        K k5 = (K) obj;
        J j6 = this.f858a;
        if (j6 != null ? j6.equals(((x) k5).f858a) : ((x) k5).f858a == null) {
            I i6 = this.f859b;
            x xVar = (x) k5;
            if (i6 == null) {
                if (xVar.f859b == null) {
                    return true;
                }
            } else if (i6.equals(xVar.f859b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        J j6 = this.f858a;
        int iHashCode = ((j6 == null ? 0 : j6.hashCode()) ^ 1000003) * 1000003;
        I i6 = this.f859b;
        return (i6 != null ? i6.hashCode() : 0) ^ iHashCode;
    }

    public final String toString() {
        return "NetworkConnectionInfo{networkType=" + this.f858a + ", mobileSubtype=" + this.f859b + "}";
    }
}
