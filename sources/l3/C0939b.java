package l3;

/* JADX INFO: renamed from: l3.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0939b extends l {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f10030b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f10031c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f10032d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f10033e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long f10034f;

    public C0939b(String str, String str2, String str3, String str4, long j6) {
        if (str == null) {
            throw new NullPointerException("Null rolloutId");
        }
        this.f10030b = str;
        if (str2 == null) {
            throw new NullPointerException("Null parameterKey");
        }
        this.f10031c = str2;
        if (str3 == null) {
            throw new NullPointerException("Null parameterValue");
        }
        this.f10032d = str3;
        if (str4 == null) {
            throw new NullPointerException("Null variantId");
        }
        this.f10033e = str4;
        this.f10034f = j6;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof l)) {
            return false;
        }
        l lVar = (l) obj;
        if (this.f10030b.equals(((C0939b) lVar).f10030b)) {
            C0939b c0939b = (C0939b) lVar;
            if (this.f10031c.equals(c0939b.f10031c) && this.f10032d.equals(c0939b.f10032d) && this.f10033e.equals(c0939b.f10033e) && this.f10034f == c0939b.f10034f) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = (((((((this.f10030b.hashCode() ^ 1000003) * 1000003) ^ this.f10031c.hashCode()) * 1000003) ^ this.f10032d.hashCode()) * 1000003) ^ this.f10033e.hashCode()) * 1000003;
        long j6 = this.f10034f;
        return iHashCode ^ ((int) ((j6 >>> 32) ^ j6));
    }

    public final String toString() {
        return "RolloutAssignment{rolloutId=" + this.f10030b + ", parameterKey=" + this.f10031c + ", parameterValue=" + this.f10032d + ", variantId=" + this.f10033e + ", templateVersion=" + this.f10034f + "}";
    }
}
