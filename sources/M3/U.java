package m3;

import d.AbstractC0628i;

/* JADX INFO: loaded from: classes.dex */
public final class U extends y0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f11419a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f11420b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f11421c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f11422d;

    public U(long j6, long j7, String str, String str2) {
        this.f11419a = j6;
        this.f11420b = j7;
        this.f11421c = str;
        this.f11422d = str2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof y0)) {
            return false;
        }
        y0 y0Var = (y0) obj;
        if (this.f11419a == ((U) y0Var).f11419a) {
            U u5 = (U) y0Var;
            if (this.f11420b == u5.f11420b && this.f11421c.equals(u5.f11421c)) {
                String str = u5.f11422d;
                String str2 = this.f11422d;
                if (str2 == null) {
                    if (str == null) {
                        return true;
                    }
                } else if (str2.equals(str)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        long j6 = this.f11419a;
        long j7 = this.f11420b;
        int iHashCode = (((((((int) (j6 ^ (j6 >>> 32))) ^ 1000003) * 1000003) ^ ((int) ((j7 >>> 32) ^ j7))) * 1000003) ^ this.f11421c.hashCode()) * 1000003;
        String str = this.f11422d;
        return iHashCode ^ (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BinaryImage{baseAddress=");
        sb.append(this.f11419a);
        sb.append(", size=");
        sb.append(this.f11420b);
        sb.append(", name=");
        sb.append(this.f11421c);
        sb.append(", uuid=");
        return AbstractC0628i.m(sb, this.f11422d, "}");
    }
}
