package I1;

/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f1119a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f1120b;

    public a(int i6, long j6) {
        if (i6 == 0) {
            throw new NullPointerException("Null status");
        }
        this.f1119a = i6;
        this.f1120b = j6;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return u.h.a(this.f1119a, aVar.f1119a) && this.f1120b == aVar.f1120b;
    }

    public final int hashCode() {
        int iB = (u.h.b(this.f1119a) ^ 1000003) * 1000003;
        long j6 = this.f1120b;
        return iB ^ ((int) (j6 ^ (j6 >>> 32)));
    }

    public final String toString() {
        return "BackendResponse{status=" + H1.a.C(this.f1119a) + ", nextRequestWaitMillis=" + this.f1120b + "}";
    }
}
