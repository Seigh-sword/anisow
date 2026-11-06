package R0;

/* JADX INFO: loaded from: classes.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f2890a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Long f2891b;

    public d(String str, long j6) {
        this.f2890a = str;
        this.f2891b = Long.valueOf(j6);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        if (!this.f2890a.equals(dVar.f2890a)) {
            return false;
        }
        Long l5 = dVar.f2891b;
        Long l6 = this.f2891b;
        return l6 != null ? l6.equals(l5) : l5 == null;
    }

    public final int hashCode() {
        int iHashCode = this.f2890a.hashCode() * 31;
        Long l5 = this.f2891b;
        return iHashCode + (l5 != null ? l5.hashCode() : 0);
    }
}
