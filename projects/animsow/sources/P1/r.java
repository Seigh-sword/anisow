package p1;

import d.AbstractC0628i;

/* JADX INFO: loaded from: classes.dex */
public final class r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f12274a;

    public r(String str) {
        this.f12274a = str;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof r) {
            return this.f12274a.equals(((r) obj).f12274a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f12274a.hashCode();
    }

    public final String toString() {
        return AbstractC0628i.m(new StringBuilder("StringHeaderFactory{value='"), this.f12274a, "'}");
    }
}
