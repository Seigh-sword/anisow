package m3;

import d.AbstractC0628i;

/* JADX INFO: loaded from: classes.dex */
public final class F extends q0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f11334a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f11335b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f11336c;

    public F(String str, String str2, String str3) {
        this.f11334a = str;
        this.f11335b = str2;
        this.f11336c = str3;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof q0)) {
            return false;
        }
        q0 q0Var = (q0) obj;
        if (this.f11334a.equals(((F) q0Var).f11334a)) {
            F f6 = (F) q0Var;
            if (this.f11335b.equals(f6.f11335b) && this.f11336c.equals(f6.f11336c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.f11334a.hashCode() ^ 1000003) * 1000003) ^ this.f11335b.hashCode()) * 1000003) ^ this.f11336c.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BuildIdMappingForArch{arch=");
        sb.append(this.f11334a);
        sb.append(", libraryName=");
        sb.append(this.f11335b);
        sb.append(", buildId=");
        return AbstractC0628i.m(sb, this.f11336c, "}");
    }
}
