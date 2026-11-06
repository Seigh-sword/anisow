package m3;

import d.AbstractC0628i;

/* JADX INFO: renamed from: m3.e0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1096e0 extends H0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f11500a;

    public C1096e0(String str) {
        this.f11500a = str;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof H0)) {
            return false;
        }
        return this.f11500a.equals(((C1096e0) ((H0) obj)).f11500a);
    }

    public final int hashCode() {
        return this.f11500a.hashCode() ^ 1000003;
    }

    public final String toString() {
        return AbstractC0628i.m(new StringBuilder("Log{content="), this.f11500a, "}");
    }
}
