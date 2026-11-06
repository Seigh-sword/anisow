package p4;

import W2.v;
import java.util.Collection;
import java.util.Map;
import java.util.Set;

/* JADX INFO: renamed from: p4.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1253b implements Map {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final Map f12328w;

    public C1253b(v vVar) {
        this.f12328w = vVar;
    }

    @Override // java.util.Map
    public final void clear() {
        throw new UnsupportedOperationException("Dagger map bindings are immutable");
    }

    @Override // java.util.Map
    public final boolean containsKey(Object obj) {
        if (!(obj instanceof Class)) {
            throw new IllegalArgumentException("Key must be a class");
        }
        return this.f12328w.containsKey(((Class) obj).getName());
    }

    @Override // java.util.Map
    public final boolean containsValue(Object obj) {
        return this.f12328w.containsValue(obj);
    }

    @Override // java.util.Map
    public final Set entrySet() {
        throw new UnsupportedOperationException("Maps created with @LazyClassKey do not support usage of entrySet(). Consider @ClassKey instead.");
    }

    @Override // java.util.Map
    public final Object get(Object obj) {
        if (!(obj instanceof Class)) {
            throw new IllegalArgumentException("Key must be a class");
        }
        return this.f12328w.get(((Class) obj).getName());
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        return this.f12328w.isEmpty();
    }

    @Override // java.util.Map
    public final Set keySet() {
        throw new UnsupportedOperationException("Maps created with @LazyClassKey do not support usage of keySet(). Consider @ClassKey instead.");
    }

    @Override // java.util.Map
    public final Object put(Object obj, Object obj2) {
        throw new UnsupportedOperationException("Dagger map bindings are immutable");
    }

    @Override // java.util.Map
    public final void putAll(Map map) {
        throw new UnsupportedOperationException("Dagger map bindings are immutable");
    }

    @Override // java.util.Map
    public final Object remove(Object obj) {
        throw new UnsupportedOperationException("Dagger map bindings are immutable");
    }

    @Override // java.util.Map
    public final int size() {
        return this.f12328w.size();
    }

    @Override // java.util.Map
    public final Collection values() {
        return this.f12328w.values();
    }
}
