package E1;

import d.AbstractC0628i;

/* JADX INFO: loaded from: classes.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f384a;

    public c(String str) {
        if (str == null) {
            throw new NullPointerException("name is null");
        }
        this.f384a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        return this.f384a.equals(((c) obj).f384a);
    }

    public final int hashCode() {
        return this.f384a.hashCode() ^ 1000003;
    }

    public final String toString() {
        return AbstractC0628i.m(new StringBuilder("Encoding{name=\""), this.f384a, "\"}");
    }
}
