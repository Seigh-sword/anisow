package o0;

import s4.AbstractC1305a;

/* JADX INFO: renamed from: o0.y, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1220y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f12154a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C1 f12155b;

    public C1220y(int i6, C1 c12) {
        AbstractC1305a.o(c12, "hint");
        this.f12154a = i6;
        this.f12155b = c12;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1220y)) {
            return false;
        }
        C1220y c1220y = (C1220y) obj;
        return this.f12154a == c1220y.f12154a && AbstractC1305a.c(this.f12155b, c1220y.f12155b);
    }

    public final int hashCode() {
        return this.f12155b.hashCode() + (Integer.hashCode(this.f12154a) * 31);
    }

    public final String toString() {
        return "GenerationalViewportHint(generationId=" + this.f12154a + ", hint=" + this.f12155b + ')';
    }
}
