package O3;

import j3.C0860j;
import s4.AbstractC1305a;

/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final T4.a f2325a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public C0860j f2326b = null;

    public a(T4.d dVar) {
        this.f2325a = dVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return AbstractC1305a.c(this.f2325a, aVar.f2325a) && AbstractC1305a.c(this.f2326b, aVar.f2326b);
    }

    public final int hashCode() {
        int iHashCode = this.f2325a.hashCode() * 31;
        C0860j c0860j = this.f2326b;
        return iHashCode + (c0860j == null ? 0 : c0860j.hashCode());
    }

    public final String toString() {
        return "Dependency(mutex=" + this.f2325a + ", subscriber=" + this.f2326b + ')';
    }
}
