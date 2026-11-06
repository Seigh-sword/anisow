package I0;

/* JADX INFO: loaded from: classes.dex */
public final class k extends n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g f1105a = g.f1099c;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || k.class != obj.getClass()) {
            return false;
        }
        return this.f1105a.equals(((k) obj).f1105a);
    }

    public final int hashCode() {
        return this.f1105a.hashCode() + (k.class.getName().hashCode() * 31);
    }

    public final String toString() {
        return "Failure {mOutputData=" + this.f1105a + '}';
    }
}
