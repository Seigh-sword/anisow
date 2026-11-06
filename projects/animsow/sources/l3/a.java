package L3;

import d.AbstractC0628i;

/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f1728a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f1729b;

    public a(String str, String str2) {
        if (str == null) {
            throw new NullPointerException("Null libraryName");
        }
        this.f1728a = str;
        if (str2 == null) {
            throw new NullPointerException("Null version");
        }
        this.f1729b = str2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.f1728a.equals(aVar.f1728a) && this.f1729b.equals(aVar.f1729b);
    }

    public final int hashCode() {
        return ((this.f1728a.hashCode() ^ 1000003) * 1000003) ^ this.f1729b.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("LibraryVersion{libraryName=");
        sb.append(this.f1728a);
        sb.append(", version=");
        return AbstractC0628i.m(sb, this.f1729b, "}");
    }
}
