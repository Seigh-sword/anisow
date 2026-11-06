package E1;

/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f380a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d f381b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final b f382c;

    public a(Object obj, d dVar, b bVar) {
        if (obj == null) {
            throw new NullPointerException("Null payload");
        }
        this.f380a = obj;
        this.f381b = dVar;
        this.f382c = bVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        aVar.getClass();
        if (this.f380a.equals(aVar.f380a) && this.f381b.equals(aVar.f381b)) {
            b bVar = aVar.f382c;
            b bVar2 = this.f382c;
            if (bVar2 == null) {
                if (bVar == null) {
                    return true;
                }
            } else if (bVar2.equals(bVar)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = ((((1000003 * 1000003) ^ this.f380a.hashCode()) * 1000003) ^ this.f381b.hashCode()) * 1000003;
        b bVar = this.f382c;
        return (iHashCode ^ (bVar == null ? 0 : bVar.hashCode())) * 1000003;
    }

    public final String toString() {
        return "Event{code=null, payload=" + this.f380a + ", priority=" + this.f381b + ", productData=" + this.f382c + ", eventContext=null}";
    }
}
