package N3;

import d.AbstractC0628i;
import s4.AbstractC1305a;

/* JADX INFO: loaded from: classes.dex */
public final class P {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f2171a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f2172b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f2173c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f2174d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final C0124j f2175e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f2176f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f2177g;

    public P(String str, String str2, int i6, long j6, C0124j c0124j, String str3, String str4) {
        AbstractC1305a.o(str, "sessionId");
        AbstractC1305a.o(str2, "firstSessionId");
        this.f2171a = str;
        this.f2172b = str2;
        this.f2173c = i6;
        this.f2174d = j6;
        this.f2175e = c0124j;
        this.f2176f = str3;
        this.f2177g = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof P)) {
            return false;
        }
        P p5 = (P) obj;
        return AbstractC1305a.c(this.f2171a, p5.f2171a) && AbstractC1305a.c(this.f2172b, p5.f2172b) && this.f2173c == p5.f2173c && this.f2174d == p5.f2174d && AbstractC1305a.c(this.f2175e, p5.f2175e) && AbstractC1305a.c(this.f2176f, p5.f2176f) && AbstractC1305a.c(this.f2177g, p5.f2177g);
    }

    public final int hashCode() {
        return this.f2177g.hashCode() + AbstractC0628i.e(this.f2176f, (this.f2175e.hashCode() + ((Long.hashCode(this.f2174d) + ((Integer.hashCode(this.f2173c) + AbstractC0628i.e(this.f2172b, this.f2171a.hashCode() * 31, 31)) * 31)) * 31)) * 31, 31);
    }

    public final String toString() {
        return "SessionInfo(sessionId=" + this.f2171a + ", firstSessionId=" + this.f2172b + ", sessionIndex=" + this.f2173c + ", eventTimestampUs=" + this.f2174d + ", dataCollectionStatus=" + this.f2175e + ", firebaseInstallationId=" + this.f2176f + ", firebaseAuthenticationToken=" + this.f2177g + ')';
    }
}
