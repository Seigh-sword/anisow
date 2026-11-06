package m3;

import d.AbstractC0628i;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class V extends z0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f11423a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f11424b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f11425c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final z0 f11426d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f11427e;

    public V(String str, String str2, List list, z0 z0Var, int i6) {
        this.f11423a = str;
        this.f11424b = str2;
        this.f11425c = list;
        this.f11426d = z0Var;
        this.f11427e = i6;
    }

    public final boolean equals(Object obj) {
        String str;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof z0)) {
            return false;
        }
        z0 z0Var = (z0) obj;
        if (this.f11423a.equals(((V) z0Var).f11423a) && ((str = this.f11424b) != null ? str.equals(((V) z0Var).f11424b) : ((V) z0Var).f11424b == null)) {
            V v5 = (V) z0Var;
            if (this.f11425c.equals(v5.f11425c)) {
                z0 z0Var2 = v5.f11426d;
                z0 z0Var3 = this.f11426d;
                if (z0Var3 != null ? z0Var3.equals(z0Var2) : z0Var2 == null) {
                    if (this.f11427e == v5.f11427e) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = (this.f11423a.hashCode() ^ 1000003) * 1000003;
        String str = this.f11424b;
        int iHashCode2 = (((iHashCode ^ (str == null ? 0 : str.hashCode())) * 1000003) ^ this.f11425c.hashCode()) * 1000003;
        z0 z0Var = this.f11426d;
        return ((iHashCode2 ^ (z0Var != null ? z0Var.hashCode() : 0)) * 1000003) ^ this.f11427e;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Exception{type=");
        sb.append(this.f11423a);
        sb.append(", reason=");
        sb.append(this.f11424b);
        sb.append(", frames=");
        sb.append(this.f11425c);
        sb.append(", causedBy=");
        sb.append(this.f11426d);
        sb.append(", overflowCount=");
        return AbstractC0628i.l(sb, this.f11427e, "}");
    }
}
