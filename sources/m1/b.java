package M1;

import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final P1.a f1759a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Map f1760b;

    public b(P1.a aVar, Map map) {
        if (aVar == null) {
            throw new NullPointerException("Null clock");
        }
        this.f1759a = aVar;
        if (map == null) {
            throw new NullPointerException("Null values");
        }
        this.f1760b = map;
    }

    public final long a(E1.d dVar, long j6, int i6) {
        long jA = j6 - ((P1.c) this.f1759a).a();
        c cVar = (c) this.f1760b.get(dVar);
        long j7 = cVar.f1761a;
        return Math.min(Math.max((long) (Math.pow(3.0d, i6 - 1) * j7 * Math.max(1.0d, Math.log(10000.0d) / Math.log((j7 > 1 ? j7 : 2L) * ((long) r12)))), jA), cVar.f1762b);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.f1759a.equals(bVar.f1759a) && this.f1760b.equals(bVar.f1760b);
    }

    public final int hashCode() {
        return ((this.f1759a.hashCode() ^ 1000003) * 1000003) ^ this.f1760b.hashCode();
    }

    public final String toString() {
        return "SchedulerConfig{clock=" + this.f1759a + ", values=" + this.f1760b + "}";
    }
}
