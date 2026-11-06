package o0;

import s4.AbstractC1305a;

/* JADX INFO: renamed from: o0.a1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1172a1 extends AbstractC1178c1 {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final Throwable f11889w;

    public C1172a1(Exception exc) {
        this.f11889w = exc;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C1172a1) && AbstractC1305a.c(this.f11889w, ((C1172a1) obj).f11889w);
    }

    public final int hashCode() {
        return this.f11889w.hashCode();
    }

    public final String toString() {
        return S3.a.Q("LoadResult.Error(\n                    |   throwable: " + this.f11889w + "\n                    |) ");
    }
}
