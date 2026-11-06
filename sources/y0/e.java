package y0;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f13711a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f13712b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f13713c;

    public e(String str, boolean z5, List list) {
        this.f13711a = str;
        this.f13712b = z5;
        this.f13713c = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || e.class != obj.getClass()) {
            return false;
        }
        e eVar = (e) obj;
        if (this.f13712b != eVar.f13712b || !this.f13713c.equals(eVar.f13713c)) {
            return false;
        }
        String str = this.f13711a;
        boolean zStartsWith = str.startsWith("index_");
        String str2 = eVar.f13711a;
        return zStartsWith ? str2.startsWith("index_") : str.equals(str2);
    }

    public final int hashCode() {
        String str = this.f13711a;
        return this.f13713c.hashCode() + ((((str.startsWith("index_") ? -1184239155 : str.hashCode()) * 31) + (this.f13712b ? 1 : 0)) * 31);
    }

    public final String toString() {
        return "Index{name='" + this.f13711a + "', unique=" + this.f13712b + ", columns=" + this.f13713c + '}';
    }
}
