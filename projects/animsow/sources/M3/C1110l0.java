package m3;

import d.AbstractC0628i;

/* JADX INFO: renamed from: m3.l0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1110l0 extends N0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f11570a;

    public C1110l0(String str) {
        this.f11570a = str;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof N0)) {
            return false;
        }
        return this.f11570a.equals(((C1110l0) ((N0) obj)).f11570a);
    }

    public final int hashCode() {
        return this.f11570a.hashCode() ^ 1000003;
    }

    public final String toString() {
        return AbstractC0628i.m(new StringBuilder("User{identifier="), this.f11570a, "}");
    }
}
