package I0;

/* JADX INFO: loaded from: classes.dex */
public final class m extends n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g f1106a;

    public m(g gVar) {
        this.f1106a = gVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || m.class != obj.getClass()) {
            return false;
        }
        return this.f1106a.equals(((m) obj).f1106a);
    }

    public final int hashCode() {
        return this.f1106a.hashCode() + (m.class.getName().hashCode() * 31);
    }

    public final String toString() {
        return "Success {mOutputData=" + this.f1106a + '}';
    }
}
