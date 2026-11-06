package N1;

import d.AbstractC0628i;

/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final a f2076f = new a(10485760, 200, 10000, 604800000, 81920);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f2077a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f2078b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f2079c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f2080d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f2081e;

    public a(long j6, int i6, int i7, long j7, int i8) {
        this.f2077a = j6;
        this.f2078b = i6;
        this.f2079c = i7;
        this.f2080d = j7;
        this.f2081e = i8;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.f2077a == aVar.f2077a && this.f2078b == aVar.f2078b && this.f2079c == aVar.f2079c && this.f2080d == aVar.f2080d && this.f2081e == aVar.f2081e;
    }

    public final int hashCode() {
        long j6 = this.f2077a;
        int i6 = (((((((int) (j6 ^ (j6 >>> 32))) ^ 1000003) * 1000003) ^ this.f2078b) * 1000003) ^ this.f2079c) * 1000003;
        long j7 = this.f2080d;
        return ((i6 ^ ((int) ((j7 >>> 32) ^ j7))) * 1000003) ^ this.f2081e;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("EventStoreConfig{maxStorageSizeInBytes=");
        sb.append(this.f2077a);
        sb.append(", loadBatchSize=");
        sb.append(this.f2078b);
        sb.append(", criticalSectionEnterTimeoutMs=");
        sb.append(this.f2079c);
        sb.append(", eventCleanUpAge=");
        sb.append(this.f2080d);
        sb.append(", maxBlobByteSizePerRow=");
        return AbstractC0628i.l(sb, this.f2081e, "}");
    }
}
