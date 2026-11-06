package N3;

import s4.AbstractC1305a;

/* JADX INFO: loaded from: classes.dex */
public final class H {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final EnumC0127m f2140a = EnumC0127m.SESSION_START;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final P f2141b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final C0116b f2142c;

    public H(P p5, C0116b c0116b) {
        this.f2141b = p5;
        this.f2142c = c0116b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof H)) {
            return false;
        }
        H h4 = (H) obj;
        return this.f2140a == h4.f2140a && AbstractC1305a.c(this.f2141b, h4.f2141b) && AbstractC1305a.c(this.f2142c, h4.f2142c);
    }

    public final int hashCode() {
        return this.f2142c.hashCode() + ((this.f2141b.hashCode() + (this.f2140a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "SessionEvent(eventType=" + this.f2140a + ", sessionData=" + this.f2141b + ", applicationInfo=" + this.f2142c + ')';
    }
}
