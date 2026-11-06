package N1;

/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f2082a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final H1.j f2083b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final H1.i f2084c;

    public b(long j6, H1.j jVar, H1.i iVar) {
        this.f2082a = j6;
        if (jVar == null) {
            throw new NullPointerException("Null transportContext");
        }
        this.f2083b = jVar;
        this.f2084c = iVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.f2082a == bVar.f2082a && this.f2083b.equals(bVar.f2083b) && this.f2084c.equals(bVar.f2084c);
    }

    public final int hashCode() {
        long j6 = this.f2082a;
        return ((((((int) ((j6 >>> 32) ^ j6)) ^ 1000003) * 1000003) ^ this.f2083b.hashCode()) * 1000003) ^ this.f2084c.hashCode();
    }

    public final String toString() {
        return "PersistedEvent{id=" + this.f2082a + ", transportContext=" + this.f2083b + ", event=" + this.f2084c + "}";
    }
}
