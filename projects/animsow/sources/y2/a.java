package Y2;

/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f4803a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f4804b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f4805c;

    public a(long j6, long j7, long j8) {
        this.f4803a = j6;
        this.f4804b = j7;
        this.f4805c = j8;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.f4803a == aVar.f4803a && this.f4804b == aVar.f4804b && this.f4805c == aVar.f4805c;
    }

    public final int hashCode() {
        long j6 = this.f4803a;
        long j7 = this.f4804b;
        int i6 = (((((int) (j6 ^ (j6 >>> 32))) ^ 1000003) * 1000003) ^ ((int) (j7 ^ (j7 >>> 32)))) * 1000003;
        long j8 = this.f4805c;
        return i6 ^ ((int) ((j8 >>> 32) ^ j8));
    }

    public final String toString() {
        return "StartupTime{epochMillis=" + this.f4803a + ", elapsedRealtime=" + this.f4804b + ", uptimeMillis=" + this.f4805c + "}";
    }
}
