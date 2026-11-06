package s4;

/* JADX INFO: renamed from: s4.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1308d implements Comparable {

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final C1308d f12629x = new C1308d();

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final int f12630w;

    public C1308d() {
        if (!new H4.c(0, 255, 1).c(1) || !new H4.c(0, 255, 1).c(9) || !new H4.c(0, 255, 1).c(24)) {
            throw new IllegalArgumentException("Version components are out of range: 1.9.24".toString());
        }
        this.f12630w = 67864;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        C1308d c1308d = (C1308d) obj;
        AbstractC1305a.o(c1308d, "other");
        return this.f12630w - c1308d.f12630w;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        C1308d c1308d = obj instanceof C1308d ? (C1308d) obj : null;
        return c1308d != null && this.f12630w == c1308d.f12630w;
    }

    public final int hashCode() {
        return this.f12630w;
    }

    public final String toString() {
        return "1.9.24";
    }
}
