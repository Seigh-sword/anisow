package C1;

/* JADX INFO: loaded from: classes.dex */
public final class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Class f130a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Class f131b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Class f132c;

    public l(Class cls, Class cls2, Class cls3) {
        this.f130a = cls;
        this.f131b = cls2;
        this.f132c = cls3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || l.class != obj.getClass()) {
            return false;
        }
        l lVar = (l) obj;
        return this.f130a.equals(lVar.f130a) && this.f131b.equals(lVar.f131b) && n.b(this.f132c, lVar.f132c);
    }

    public final int hashCode() {
        int iHashCode = (this.f131b.hashCode() + (this.f130a.hashCode() * 31)) * 31;
        Class cls = this.f132c;
        return iHashCode + (cls != null ? cls.hashCode() : 0);
    }

    public final String toString() {
        return "MultiClassKey{first=" + this.f130a + ", second=" + this.f131b + '}';
    }
}
