package G1;

/* JADX INFO: loaded from: classes.dex */
public final class q extends C {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final F f835a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final B f836b;

    public q(F f6, B b6) {
        this.f835a = f6;
        this.f836b = b6;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C)) {
            return false;
        }
        C c6 = (C) obj;
        F f6 = this.f835a;
        if (f6 != null ? f6.equals(((q) c6).f835a) : ((q) c6).f835a == null) {
            B b6 = this.f836b;
            q qVar = (q) c6;
            if (b6 == null) {
                if (qVar.f836b == null) {
                    return true;
                }
            } else if (b6.equals(qVar.f836b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        F f6 = this.f835a;
        int iHashCode = ((f6 == null ? 0 : f6.hashCode()) ^ 1000003) * 1000003;
        B b6 = this.f836b;
        return (b6 != null ? b6.hashCode() : 0) ^ iHashCode;
    }

    public final String toString() {
        return "ComplianceData{privacyContext=" + this.f835a + ", productIdOrigin=" + this.f836b + "}";
    }
}
