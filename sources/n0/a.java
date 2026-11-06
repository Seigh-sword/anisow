package N0;

/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f2068a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f2069b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f2070c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f2071d;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.f2068a == aVar.f2068a && this.f2069b == aVar.f2069b && this.f2070c == aVar.f2070c && this.f2071d == aVar.f2071d;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [boolean, int] */
    public final int hashCode() {
        boolean z5 = this.f2069b;
        ?? r12 = this.f2068a;
        int i6 = r12;
        if (z5) {
            i6 = r12 + 16;
        }
        int i7 = i6;
        if (this.f2070c) {
            i7 = i6 + 256;
        }
        return this.f2071d ? i7 + 4096 : i7;
    }

    public final String toString() {
        return "[ Connected=" + this.f2068a + " Validated=" + this.f2069b + " Metered=" + this.f2070c + " NotRoaming=" + this.f2071d + " ]";
    }
}
