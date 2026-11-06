package com.bumptech.glide;

/* JADX INFO: loaded from: classes.dex */
public final class a implements Cloneable {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public I0.o f6290w;

    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final a clone() {
        try {
            return (a) super.clone();
        } catch (CloneNotSupportedException e6) {
            throw new RuntimeException(e6);
        }
    }

    public final boolean d(Object obj) {
        if (obj instanceof a) {
            return C1.n.b(this.f6290w, ((a) obj).f6290w);
        }
        return false;
    }

    public final int e() {
        I0.o oVar = this.f6290w;
        if (oVar != null) {
            return oVar.hashCode();
        }
        return 0;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof a) && d(obj);
    }

    public final int hashCode() {
        return e();
    }
}
