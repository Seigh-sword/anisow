package N3;

/* JADX INFO: renamed from: N3.j, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0124j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final EnumC0123i f2247a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final EnumC0123i f2248b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final double f2249c;

    public C0124j(EnumC0123i enumC0123i, EnumC0123i enumC0123i2, double d6) {
        this.f2247a = enumC0123i;
        this.f2248b = enumC0123i2;
        this.f2249c = d6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0124j)) {
            return false;
        }
        C0124j c0124j = (C0124j) obj;
        return this.f2247a == c0124j.f2247a && this.f2248b == c0124j.f2248b && Double.compare(this.f2249c, c0124j.f2249c) == 0;
    }

    public final int hashCode() {
        return Double.hashCode(this.f2249c) + ((this.f2248b.hashCode() + (this.f2247a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "DataCollectionStatus(performance=" + this.f2247a + ", crashlytics=" + this.f2248b + ", sessionSamplingRate=" + this.f2249c + ')';
    }
}
