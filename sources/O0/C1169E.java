package o0;

/* JADX INFO: renamed from: o0.E, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1169E extends G {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final C1169E f11745b = new C1169E(false);

    public final boolean equals(Object obj) {
        if (obj instanceof C1169E) {
            if (this.f11761a == ((C1169E) obj).f11761a) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f11761a);
    }

    public final String toString() {
        return "Loading(endOfPaginationReached=" + this.f11761a + ')';
    }
}
