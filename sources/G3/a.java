package G3;

/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f868a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f869b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f870c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final b f871d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final d f872e;

    public a(String str, String str2, String str3, b bVar, d dVar) {
        this.f868a = str;
        this.f869b = str2;
        this.f870c = str3;
        this.f871d = bVar;
        this.f872e = dVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        String str = this.f868a;
        if (str != null ? str.equals(aVar.f868a) : aVar.f868a == null) {
            String str2 = this.f869b;
            if (str2 != null ? str2.equals(aVar.f869b) : aVar.f869b == null) {
                String str3 = this.f870c;
                if (str3 != null ? str3.equals(aVar.f870c) : aVar.f870c == null) {
                    b bVar = this.f871d;
                    if (bVar != null ? bVar.equals(aVar.f871d) : aVar.f871d == null) {
                        d dVar = this.f872e;
                        if (dVar == null) {
                            if (aVar.f872e == null) {
                                return true;
                            }
                        } else if (dVar.equals(aVar.f872e)) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.f868a;
        int iHashCode = ((str == null ? 0 : str.hashCode()) ^ 1000003) * 1000003;
        String str2 = this.f869b;
        int iHashCode2 = (iHashCode ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        String str3 = this.f870c;
        int iHashCode3 = (iHashCode2 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
        b bVar = this.f871d;
        int iHashCode4 = (iHashCode3 ^ (bVar == null ? 0 : bVar.hashCode())) * 1000003;
        d dVar = this.f872e;
        return (dVar != null ? dVar.hashCode() : 0) ^ iHashCode4;
    }

    public final String toString() {
        return "InstallationResponse{uri=" + this.f868a + ", fid=" + this.f869b + ", refreshToken=" + this.f870c + ", authToken=" + this.f871d + ", responseCode=" + this.f872e + "}";
    }
}
