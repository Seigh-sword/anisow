package androidx.datastore.preferences.protobuf;

import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class p0 implements Map.Entry, Comparable {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final Comparable f5500w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public Object f5501x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ C0287l0 f5502y;

    public p0(C0287l0 c0287l0, Comparable comparable, Object obj) {
        this.f5502y = c0287l0;
        this.f5500w = comparable;
        this.f5501x = obj;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return this.f5500w.compareTo(((p0) obj).f5500w);
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        Object key = entry.getKey();
        Comparable comparable = this.f5500w;
        if (comparable != null ? comparable.equals(key) : key == null) {
            Object obj2 = this.f5501x;
            Object value = entry.getValue();
            if (obj2 == null) {
                if (value == null) {
                    return true;
                }
            } else if (obj2.equals(value)) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.f5500w;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.f5501x;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        Comparable comparable = this.f5500w;
        int iHashCode = comparable == null ? 0 : comparable.hashCode();
        Object obj = this.f5501x;
        return (obj != null ? obj.hashCode() : 0) ^ iHashCode;
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        int i6 = C0287l0.f5479C;
        this.f5502y.b();
        Object obj2 = this.f5501x;
        this.f5501x = obj;
        return obj2;
    }

    public final String toString() {
        return this.f5500w + "=" + this.f5501x;
    }
}
