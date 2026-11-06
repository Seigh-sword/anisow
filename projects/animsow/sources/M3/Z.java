package m3;

import d.AbstractC0628i;

/* JADX INFO: loaded from: classes.dex */
public final class Z extends B0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f11440a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f11441b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f11442c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f11443d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f11444e;

    public Z(long j6, String str, String str2, long j7, int i6) {
        this.f11440a = j6;
        this.f11441b = str;
        this.f11442c = str2;
        this.f11443d = j7;
        this.f11444e = i6;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof B0)) {
            return false;
        }
        B0 b02 = (B0) obj;
        if (this.f11440a == ((Z) b02).f11440a) {
            Z z5 = (Z) b02;
            if (this.f11441b.equals(z5.f11441b)) {
                String str = z5.f11442c;
                String str2 = this.f11442c;
                if (str2 != null ? str2.equals(str) : str == null) {
                    if (this.f11443d == z5.f11443d && this.f11444e == z5.f11444e) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        long j6 = this.f11440a;
        int iHashCode = (((((int) (j6 ^ (j6 >>> 32))) ^ 1000003) * 1000003) ^ this.f11441b.hashCode()) * 1000003;
        String str = this.f11442c;
        int iHashCode2 = (iHashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
        long j7 = this.f11443d;
        return ((iHashCode2 ^ ((int) ((j7 >>> 32) ^ j7))) * 1000003) ^ this.f11444e;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Frame{pc=");
        sb.append(this.f11440a);
        sb.append(", symbol=");
        sb.append(this.f11441b);
        sb.append(", file=");
        sb.append(this.f11442c);
        sb.append(", offset=");
        sb.append(this.f11443d);
        sb.append(", importance=");
        return AbstractC0628i.l(sb, this.f11444e, "}");
    }
}
