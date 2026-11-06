package m3;

/* JADX INFO: renamed from: m3.p0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1118p0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f11609a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f11610b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f11611c;

    public C1118p0(String str, String str2, boolean z5) {
        if (str == null) {
            throw new NullPointerException("Null osRelease");
        }
        this.f11609a = str;
        if (str2 == null) {
            throw new NullPointerException("Null osCodeName");
        }
        this.f11610b = str2;
        this.f11611c = z5;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C1118p0)) {
            return false;
        }
        C1118p0 c1118p0 = (C1118p0) obj;
        return this.f11609a.equals(c1118p0.f11609a) && this.f11610b.equals(c1118p0.f11610b) && this.f11611c == c1118p0.f11611c;
    }

    public final int hashCode() {
        return ((((this.f11609a.hashCode() ^ 1000003) * 1000003) ^ this.f11610b.hashCode()) * 1000003) ^ (this.f11611c ? 1231 : 1237);
    }

    public final String toString() {
        return "OsData{osRelease=" + this.f11609a + ", osCodeName=" + this.f11610b + ", isRooted=" + this.f11611c + "}";
    }
}
