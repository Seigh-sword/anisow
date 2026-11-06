package a0;

import s4.AbstractC1305a;

/* JADX INFO: loaded from: classes.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f4990a;

    public f(String str) {
        AbstractC1305a.o(str, "name");
        this.f4990a = str;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof f)) {
            return false;
        }
        return AbstractC1305a.c(this.f4990a, ((f) obj).f4990a);
    }

    public final int hashCode() {
        return this.f4990a.hashCode();
    }

    public final String toString() {
        return this.f4990a;
    }
}
