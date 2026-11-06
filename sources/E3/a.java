package E3;

/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f393a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f394b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f395c;

    public a(String str, long j6, long j7) {
        this.f393a = str;
        this.f394b = j6;
        this.f395c = j7;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.f393a.equals(aVar.f393a) && this.f394b == aVar.f394b && this.f395c == aVar.f395c;
    }

    public final int hashCode() {
        int iHashCode = (this.f393a.hashCode() ^ 1000003) * 1000003;
        long j6 = this.f394b;
        long j7 = this.f395c;
        return ((iHashCode ^ ((int) (j6 ^ (j6 >>> 32)))) * 1000003) ^ ((int) (j7 ^ (j7 >>> 32)));
    }

    public final String toString() {
        return "InstallationTokenResult{token=" + this.f393a + ", tokenExpirationTimestamp=" + this.f394b + ", tokenCreationTimestamp=" + this.f395c + "}";
    }
}
