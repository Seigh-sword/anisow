package N3;

import d.AbstractC0628i;
import s4.AbstractC1305a;

/* JADX INFO: loaded from: classes.dex */
public final class G {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f2136a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f2137b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f2138c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f2139d;

    public G(String str, String str2, int i6, long j6) {
        AbstractC1305a.o(str, "sessionId");
        AbstractC1305a.o(str2, "firstSessionId");
        this.f2136a = str;
        this.f2137b = str2;
        this.f2138c = i6;
        this.f2139d = j6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof G)) {
            return false;
        }
        G g4 = (G) obj;
        return AbstractC1305a.c(this.f2136a, g4.f2136a) && AbstractC1305a.c(this.f2137b, g4.f2137b) && this.f2138c == g4.f2138c && this.f2139d == g4.f2139d;
    }

    public final int hashCode() {
        return Long.hashCode(this.f2139d) + ((Integer.hashCode(this.f2138c) + AbstractC0628i.e(this.f2137b, this.f2136a.hashCode() * 31, 31)) * 31);
    }

    public final String toString() {
        return "SessionDetails(sessionId=" + this.f2136a + ", firstSessionId=" + this.f2137b + ", sessionIndex=" + this.f2138c + ", sessionStartTimestampUs=" + this.f2139d + ')';
    }
}
