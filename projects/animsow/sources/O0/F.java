package o0;

/* JADX INFO: loaded from: classes.dex */
public final class F extends G {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final F f11747b = new F(true);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final F f11748c = new F(false);

    public final boolean equals(Object obj) {
        if (obj instanceof F) {
            if (this.f11761a == ((F) obj).f11761a) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f11761a);
    }

    public final String toString() {
        return "NotLoading(endOfPaginationReached=" + this.f11761a + ')';
    }
}
