package G1;

/* JADX INFO: loaded from: classes.dex */
public final class p extends A {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final z f833a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AbstractC0033a f834b;

    public p(z zVar, AbstractC0033a abstractC0033a) {
        this.f833a = zVar;
        this.f834b = abstractC0033a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof A)) {
            return false;
        }
        A a6 = (A) obj;
        z zVar = this.f833a;
        if (zVar != null ? zVar.equals(((p) a6).f833a) : ((p) a6).f833a == null) {
            AbstractC0033a abstractC0033a = this.f834b;
            p pVar = (p) a6;
            if (abstractC0033a == null) {
                if (pVar.f834b == null) {
                    return true;
                }
            } else if (abstractC0033a.equals(pVar.f834b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        z zVar = this.f833a;
        int iHashCode = ((zVar == null ? 0 : zVar.hashCode()) ^ 1000003) * 1000003;
        AbstractC0033a abstractC0033a = this.f834b;
        return (abstractC0033a != null ? abstractC0033a.hashCode() : 0) ^ iHashCode;
    }

    public final String toString() {
        return "ClientInfo{clientType=" + this.f833a + ", androidClientInfo=" + this.f834b + "}";
    }
}
