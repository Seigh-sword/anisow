package F3;

import d.AbstractC0628i;
import p3.C1251c;

/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ int f619h = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f620a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c f621b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f622c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f623d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f624e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long f625f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f626g;

    static {
        C1251c c1251c = new C1251c(12);
        c1251c.f12323g = 0L;
        c1251c.v(c.f632w);
        c1251c.f12322f = 0L;
        c1251c.j();
    }

    public a(String str, c cVar, String str2, String str3, long j6, long j7, String str4) {
        this.f620a = str;
        this.f621b = cVar;
        this.f622c = str2;
        this.f623d = str3;
        this.f624e = j6;
        this.f625f = j7;
        this.f626g = str4;
    }

    public final C1251c a() {
        return new C1251c(this, 0);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        String str = this.f620a;
        if (str != null ? str.equals(aVar.f620a) : aVar.f620a == null) {
            if (this.f621b.equals(aVar.f621b)) {
                String str2 = aVar.f622c;
                String str3 = this.f622c;
                if (str3 != null ? str3.equals(str2) : str2 == null) {
                    String str4 = aVar.f623d;
                    String str5 = this.f623d;
                    if (str5 != null ? str5.equals(str4) : str4 == null) {
                        if (this.f624e == aVar.f624e && this.f625f == aVar.f625f) {
                            String str6 = aVar.f626g;
                            String str7 = this.f626g;
                            if (str7 == null) {
                                if (str6 == null) {
                                    return true;
                                }
                            } else if (str7.equals(str6)) {
                                return true;
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.f620a;
        int iHashCode = ((((str == null ? 0 : str.hashCode()) ^ 1000003) * 1000003) ^ this.f621b.hashCode()) * 1000003;
        String str2 = this.f622c;
        int iHashCode2 = (iHashCode ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        String str3 = this.f623d;
        int iHashCode3 = (iHashCode2 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
        long j6 = this.f624e;
        int i6 = (iHashCode3 ^ ((int) (j6 ^ (j6 >>> 32)))) * 1000003;
        long j7 = this.f625f;
        int i7 = (i6 ^ ((int) (j7 ^ (j7 >>> 32)))) * 1000003;
        String str4 = this.f626g;
        return (str4 != null ? str4.hashCode() : 0) ^ i7;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PersistedInstallationEntry{firebaseInstallationId=");
        sb.append(this.f620a);
        sb.append(", registrationStatus=");
        sb.append(this.f621b);
        sb.append(", authToken=");
        sb.append(this.f622c);
        sb.append(", refreshToken=");
        sb.append(this.f623d);
        sb.append(", expiresInSecs=");
        sb.append(this.f624e);
        sb.append(", tokenCreationEpochInSecs=");
        sb.append(this.f625f);
        sb.append(", fisError=");
        return AbstractC0628i.m(sb, this.f626g, "}");
    }
}
