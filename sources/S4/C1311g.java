package s4;

import java.io.Serializable;

/* JADX INFO: renamed from: s4.g, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1311g implements Serializable {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final Object f12632w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final Object f12633x;

    public C1311g(Object obj, Object obj2) {
        this.f12632w = obj;
        this.f12633x = obj2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1311g)) {
            return false;
        }
        C1311g c1311g = (C1311g) obj;
        return AbstractC1305a.c(this.f12632w, c1311g.f12632w) && AbstractC1305a.c(this.f12633x, c1311g.f12633x);
    }

    public final int hashCode() {
        Object obj = this.f12632w;
        int iHashCode = (obj == null ? 0 : obj.hashCode()) * 31;
        Object obj2 = this.f12633x;
        return iHashCode + (obj2 != null ? obj2.hashCode() : 0);
    }

    public final String toString() {
        return "(" + this.f12632w + ", " + this.f12633x + ')';
    }
}
