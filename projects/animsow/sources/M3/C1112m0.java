package m3;

/* JADX INFO: renamed from: m3.m0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1112m0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C1114n0 f11577a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C1118p0 f11578b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final C1116o0 f11579c;

    public C1112m0(C1114n0 c1114n0, C1118p0 c1118p0, C1116o0 c1116o0) {
        this.f11577a = c1114n0;
        this.f11578b = c1118p0;
        this.f11579c = c1116o0;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C1112m0)) {
            return false;
        }
        C1112m0 c1112m0 = (C1112m0) obj;
        return this.f11577a.equals(c1112m0.f11577a) && this.f11578b.equals(c1112m0.f11578b) && this.f11579c.equals(c1112m0.f11579c);
    }

    public final int hashCode() {
        return ((((this.f11577a.hashCode() ^ 1000003) * 1000003) ^ this.f11578b.hashCode()) * 1000003) ^ this.f11579c.hashCode();
    }

    public final String toString() {
        return "StaticSessionData{appData=" + this.f11577a + ", osData=" + this.f11578b + ", deviceData=" + this.f11579c + "}";
    }
}
