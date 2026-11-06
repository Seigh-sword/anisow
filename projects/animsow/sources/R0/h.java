package R0;

/* JADX INFO: loaded from: classes.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f2898a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f2899b;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        if (this.f2899b != hVar.f2899b) {
            return false;
        }
        return this.f2898a.equals(hVar.f2898a);
    }

    public final int hashCode() {
        return u.h.b(this.f2899b) + (this.f2898a.hashCode() * 31);
    }
}
