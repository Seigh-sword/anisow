package W2;

import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public abstract class n implements Map, Serializable {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public transient s f4433w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public transient t f4434x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public transient u f4435y;

    @Override // java.util.Map
    public final void clear() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    public final boolean containsKey(Object obj) {
        return get(obj) != null;
    }

    @Override // java.util.Map
    public final boolean containsValue(Object obj) {
        u uVar = this.f4435y;
        if (uVar == null) {
            v vVar = (v) this;
            u uVar2 = new u(1, vVar.f4455B, vVar.f4454A);
            this.f4435y = uVar2;
            uVar = uVar2;
        }
        return uVar.contains(obj);
    }

    @Override // java.util.Map
    public final Set entrySet() {
        s sVar = this.f4433w;
        if (sVar != null) {
            return sVar;
        }
        v vVar = (v) this;
        s sVar2 = new s(vVar, vVar.f4454A, vVar.f4455B);
        this.f4433w = sVar2;
        return sVar2;
    }

    @Override // java.util.Map
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Map) {
            return entrySet().equals(((Map) obj).entrySet());
        }
        return false;
    }

    @Override // java.util.Map
    public abstract Object get(Object obj);

    @Override // java.util.Map
    public final Object getOrDefault(Object obj, Object obj2) {
        Object obj3 = get(obj);
        return obj3 != null ? obj3 : obj2;
    }

    @Override // java.util.Map
    public final int hashCode() {
        s sVar = this.f4433w;
        if (sVar == null) {
            v vVar = (v) this;
            s sVar2 = new s(vVar, vVar.f4454A, vVar.f4455B);
            this.f4433w = sVar2;
            sVar = sVar2;
        }
        Iterator it = sVar.iterator();
        int i6 = 0;
        while (true) {
            AbstractC0232a abstractC0232a = (AbstractC0232a) it;
            if (!abstractC0232a.hasNext()) {
                return i6;
            }
            Object next = abstractC0232a.next();
            i6 = ~(~(i6 + (next != null ? next.hashCode() : 0)));
        }
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        return ((v) this).size() == 0;
    }

    @Override // java.util.Map
    public final Set keySet() {
        t tVar = this.f4434x;
        if (tVar != null) {
            return tVar;
        }
        v vVar = (v) this;
        t tVar2 = new t(vVar, new u(0, vVar.f4455B, vVar.f4454A));
        this.f4434x = tVar2;
        return tVar2;
    }

    @Override // java.util.Map
    public final Object put(Object obj, Object obj2) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    public final void putAll(Map map) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    public final Object remove(Object obj) {
        throw new UnsupportedOperationException();
    }

    public final String toString() {
        int i6 = ((v) this).f4455B;
        Y2.b.g(i6, "size");
        StringBuilder sb = new StringBuilder((int) Math.min(((long) i6) * 8, 1073741824L));
        sb.append('{');
        boolean z5 = true;
        for (Map.Entry entry : (s) entrySet()) {
            if (!z5) {
                sb.append(", ");
            }
            sb.append(entry.getKey());
            sb.append('=');
            sb.append(entry.getValue());
            z5 = false;
        }
        sb.append('}');
        return sb.toString();
    }

    @Override // java.util.Map
    public final Collection values() {
        u uVar = this.f4435y;
        if (uVar != null) {
            return uVar;
        }
        v vVar = (v) this;
        u uVar2 = new u(1, vVar.f4455B, vVar.f4454A);
        this.f4435y = uVar2;
        return uVar2;
    }
}
