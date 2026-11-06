package M4;

import s4.AbstractC1305a;

/* JADX INFO: renamed from: M4.s, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0073s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f1917a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C4.l f1918b;

    public C0073s(Object obj, C4.l lVar) {
        this.f1917a = obj;
        this.f1918b = lVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0073s)) {
            return false;
        }
        C0073s c0073s = (C0073s) obj;
        return AbstractC1305a.c(this.f1917a, c0073s.f1917a) && AbstractC1305a.c(this.f1918b, c0073s.f1918b);
    }

    public final int hashCode() {
        Object obj = this.f1917a;
        return this.f1918b.hashCode() + ((obj == null ? 0 : obj.hashCode()) * 31);
    }

    public final String toString() {
        return "CompletedWithCancellation(result=" + this.f1917a + ", onCancellation=" + this.f1918b + ')';
    }
}
