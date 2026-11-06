package R0;

/* JADX INFO: loaded from: classes.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f2892a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f2893b;

    public e(int i6, String str) {
        this.f2892a = str;
        this.f2893b = i6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        if (this.f2893b != eVar.f2893b) {
            return false;
        }
        return this.f2892a.equals(eVar.f2892a);
    }

    public final int hashCode() {
        return (this.f2892a.hashCode() * 31) + this.f2893b;
    }
}
