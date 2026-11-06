package o;

import java.util.Map;

/* JADX INFO: renamed from: o.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1160c implements Map.Entry {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final Object f11706w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final Object f11707x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public C1160c f11708y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public C1160c f11709z;

    public C1160c(Object obj, Object obj2) {
        this.f11706w = obj;
        this.f11707x = obj2;
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C1160c)) {
            return false;
        }
        C1160c c1160c = (C1160c) obj;
        return this.f11706w.equals(c1160c.f11706w) && this.f11707x.equals(c1160c.f11707x);
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.f11706w;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.f11707x;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        return this.f11706w.hashCode() ^ this.f11707x.hashCode();
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        throw new UnsupportedOperationException("An entry modification is not supported");
    }

    public final String toString() {
        return this.f11706w + "=" + this.f11707x;
    }
}
