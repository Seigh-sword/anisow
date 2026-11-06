package m3;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class T extends D0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f11414a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final z0 f11415b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final r0 f11416c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final A0 f11417d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final List f11418e;

    public T(List list, z0 z0Var, r0 r0Var, A0 a02, List list2) {
        this.f11414a = list;
        this.f11415b = z0Var;
        this.f11416c = r0Var;
        this.f11417d = a02;
        this.f11418e = list2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof D0)) {
            return false;
        }
        D0 d02 = (D0) obj;
        List list = this.f11414a;
        if (list != null ? list.equals(((T) d02).f11414a) : ((T) d02).f11414a == null) {
            z0 z0Var = this.f11415b;
            if (z0Var != null ? z0Var.equals(((T) d02).f11415b) : ((T) d02).f11415b == null) {
                r0 r0Var = this.f11416c;
                if (r0Var != null ? r0Var.equals(((T) d02).f11416c) : ((T) d02).f11416c == null) {
                    if (this.f11417d.equals(((T) d02).f11417d) && this.f11418e.equals(((T) d02).f11418e)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        List list = this.f11414a;
        int iHashCode = ((list == null ? 0 : list.hashCode()) ^ 1000003) * 1000003;
        z0 z0Var = this.f11415b;
        int iHashCode2 = (iHashCode ^ (z0Var == null ? 0 : z0Var.hashCode())) * 1000003;
        r0 r0Var = this.f11416c;
        return (((((r0Var != null ? r0Var.hashCode() : 0) ^ iHashCode2) * 1000003) ^ this.f11417d.hashCode()) * 1000003) ^ this.f11418e.hashCode();
    }

    public final String toString() {
        return "Execution{threads=" + this.f11414a + ", exception=" + this.f11415b + ", appExitInfo=" + this.f11416c + ", signal=" + this.f11417d + ", binaries=" + this.f11418e + "}";
    }
}
