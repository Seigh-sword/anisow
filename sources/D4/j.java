package D4;

import s4.AbstractC1305a;

/* JADX INFO: loaded from: classes.dex */
public final class j implements c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Class f372a;

    public j(Class cls) {
        AbstractC1305a.o(cls, "jClass");
        this.f372a = cls;
    }

    @Override // D4.c
    public final Class a() {
        return this.f372a;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof j) {
            if (AbstractC1305a.c(this.f372a, ((j) obj).f372a)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f372a.hashCode();
    }

    public final String toString() {
        return this.f372a.toString() + " (Kotlin reflection is not available)";
    }
}
