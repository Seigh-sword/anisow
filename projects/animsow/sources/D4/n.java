package D4;

import d.AbstractC0628i;
import s4.AbstractC1305a;

/* JADX INFO: loaded from: classes.dex */
public abstract class n extends b implements I4.f {

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public final boolean f373C;

    public n(Object obj, Class cls, String str, String str2, int i6) {
        super(obj, cls, str, str2, (i6 & 1) == 1);
        this.f373C = false;
    }

    public final I4.a d() {
        if (this.f373C) {
            return this;
        }
        I4.a aVar = this.f360w;
        if (aVar != null) {
            return aVar;
        }
        I4.a aVarA = a();
        this.f360w = aVarA;
        return aVarA;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof n) {
            n nVar = (n) obj;
            return c().equals(nVar.c()) && this.f363z.equals(nVar.f363z) && this.f358A.equals(nVar.f358A) && AbstractC1305a.c(this.f361x, nVar.f361x);
        }
        if (obj instanceof I4.f) {
            return obj.equals(d());
        }
        return false;
    }

    public final int hashCode() {
        return this.f358A.hashCode() + AbstractC0628i.e(this.f363z, c().hashCode() * 31, 31);
    }

    public final String toString() {
        I4.a aVarD = d();
        return aVarD != this ? aVarD.toString() : AbstractC0628i.m(new StringBuilder("property "), this.f363z, " (Kotlin reflection is not available)");
    }
}
