package d3;

/* JADX INFO: loaded from: classes.dex */
public final class r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Class f8219a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Class f8220b;

    public r(Class cls, Class cls2) {
        this.f8219a = cls;
        this.f8220b = cls2;
    }

    public static r a(Class cls) {
        return new r(q.class, cls);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || r.class != obj.getClass()) {
            return false;
        }
        r rVar = (r) obj;
        if (this.f8220b.equals(rVar.f8220b)) {
            return this.f8219a.equals(rVar.f8219a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f8219a.hashCode() + (this.f8220b.hashCode() * 31);
    }

    public final String toString() {
        Class cls = this.f8220b;
        Class cls2 = this.f8219a;
        if (cls2 == q.class) {
            return cls.getName();
        }
        return "@" + cls2.getName() + " " + cls.getName();
    }
}
