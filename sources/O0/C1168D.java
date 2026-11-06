package o0;

import s4.AbstractC1305a;

/* JADX INFO: renamed from: o0.D, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1168D extends G {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Throwable f11743b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1168D(Throwable th) {
        super(false);
        AbstractC1305a.o(th, "error");
        this.f11743b = th;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C1168D) {
            C1168D c1168d = (C1168D) obj;
            if (this.f11761a == c1168d.f11761a && AbstractC1305a.c(this.f11743b, c1168d.f11743b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f11743b.hashCode() + Boolean.hashCode(this.f11761a);
    }

    public final String toString() {
        return "Error(endOfPaginationReached=" + this.f11761a + ", error=" + this.f11743b + ')';
    }
}
