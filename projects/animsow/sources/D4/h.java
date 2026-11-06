package D4;

import d.AbstractC0628i;
import s4.AbstractC1305a;

/* JADX INFO: loaded from: classes.dex */
public class h extends b implements g, I4.c {

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public final int f369C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public final int f370D;

    public h(int i6, Class cls, String str, String str2, int i7) {
        super(a.f357w, cls, str, str2, (i7 & 1) == 1);
        this.f369C = i6;
        this.f370D = 0;
    }

    @Override // D4.b
    public final I4.a a() {
        s.f378a.getClass();
        return this;
    }

    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof h) {
            h hVar = (h) obj;
            return this.f363z.equals(hVar.f363z) && this.f358A.equals(hVar.f358A) && this.f370D == hVar.f370D && this.f369C == hVar.f369C && AbstractC1305a.c(this.f361x, hVar.f361x) && AbstractC1305a.c(c(), hVar.c());
        }
        if (!(obj instanceof I4.c)) {
            return false;
        }
        I4.a aVar = this.f360w;
        if (aVar == null) {
            a();
            this.f360w = this;
            aVar = this;
        }
        return obj.equals(aVar);
    }

    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public final int hashCode() {
        return this.f358A.hashCode() + AbstractC0628i.e(this.f363z, c() == null ? 0 : c().hashCode() * 31, 31);
    }

    @Override // D4.g
    public final int f() {
        return this.f369C;
    }

    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public final String toString() {
        I4.a aVar = this.f360w;
        if (aVar == null) {
            a();
            this.f360w = this;
            aVar = this;
        }
        if (aVar != this) {
            return aVar.toString();
        }
        String str = this.f363z;
        return "<init>".equals(str) ? "constructor (Kotlin reflection is not available)" : AbstractC0628i.j("function ", str, " (Kotlin reflection is not available)");
    }

    public h(int i6, Object obj, Class cls, String str, String str2) {
        super(obj, cls, str, str2, false);
        this.f369C = i6;
        this.f370D = 0;
    }
}
