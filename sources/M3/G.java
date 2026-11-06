package m3;

import d.AbstractC0628i;

/* JADX INFO: loaded from: classes.dex */
public final class G extends s0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f11337a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f11338b;

    public G(String str, String str2) {
        this.f11337a = str;
        this.f11338b = str2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof s0)) {
            return false;
        }
        s0 s0Var = (s0) obj;
        return this.f11337a.equals(((G) s0Var).f11337a) && this.f11338b.equals(((G) s0Var).f11338b);
    }

    public final int hashCode() {
        return ((this.f11337a.hashCode() ^ 1000003) * 1000003) ^ this.f11338b.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CustomAttribute{key=");
        sb.append(this.f11337a);
        sb.append(", value=");
        return AbstractC0628i.m(sb, this.f11338b, "}");
    }
}
