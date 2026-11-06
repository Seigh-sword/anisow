package M1;

import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f1761a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f1762b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Set f1763c;

    public c(long j6, long j7, Set set) {
        this.f1761a = j6;
        this.f1762b = j7;
        this.f1763c = set;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return this.f1761a == cVar.f1761a && this.f1762b == cVar.f1762b && this.f1763c.equals(cVar.f1763c);
    }

    public final int hashCode() {
        long j6 = this.f1761a;
        int i6 = (((int) (j6 ^ (j6 >>> 32))) ^ 1000003) * 1000003;
        long j7 = this.f1762b;
        return ((i6 ^ ((int) ((j7 >>> 32) ^ j7))) * 1000003) ^ this.f1763c.hashCode();
    }

    public final String toString() {
        return "ConfigValue{delta=" + this.f1761a + ", maxAllowedDelay=" + this.f1762b + ", flags=" + this.f1763c + "}";
    }
}
