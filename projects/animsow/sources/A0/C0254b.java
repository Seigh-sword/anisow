package a0;

import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import s4.AbstractC1305a;
import s4.C1311g;
import t4.n;

/* JADX INFO: renamed from: a0.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0254b extends h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Map f4982a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final S0.f f4983b;

    public C0254b(Map map, boolean z5) {
        AbstractC1305a.o(map, "preferencesMap");
        this.f4982a = map;
        this.f4983b = new S0.f(z5);
    }

    @Override // a0.h
    public final Map a() {
        C1311g c1311g;
        Set<Map.Entry> setEntrySet = this.f4982a.entrySet();
        int iM = AbstractC1305a.M(t4.k.W(setEntrySet));
        if (iM < 16) {
            iM = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iM);
        for (Map.Entry entry : setEntrySet) {
            Object value = entry.getValue();
            if (value instanceof byte[]) {
                Object key = entry.getKey();
                byte[] bArr = (byte[]) value;
                byte[] bArrCopyOf = Arrays.copyOf(bArr, bArr.length);
                AbstractC1305a.n(bArrCopyOf, "copyOf(this, size)");
                c1311g = new C1311g(key, bArrCopyOf);
            } else {
                c1311g = new C1311g(entry.getKey(), entry.getValue());
            }
            linkedHashMap.put(c1311g.f12632w, c1311g.f12633x);
        }
        Map mapUnmodifiableMap = Collections.unmodifiableMap(linkedHashMap);
        AbstractC1305a.n(mapUnmodifiableMap, "unmodifiableMap(map)");
        return mapUnmodifiableMap;
    }

    @Override // a0.h
    public final Object b(f fVar) {
        AbstractC1305a.o(fVar, "key");
        Object obj = this.f4982a.get(fVar);
        if (!(obj instanceof byte[])) {
            return obj;
        }
        byte[] bArr = (byte[]) obj;
        byte[] bArrCopyOf = Arrays.copyOf(bArr, bArr.length);
        AbstractC1305a.n(bArrCopyOf, "copyOf(this, size)");
        return bArrCopyOf;
    }

    public final void c() {
        if (!(!((AtomicBoolean) this.f4983b.f3073x).get())) {
            throw new IllegalStateException("Do mutate preferences once returned to DataStore.".toString());
        }
    }

    public final void d(f fVar, Object obj) {
        AbstractC1305a.o(fVar, "key");
        c();
        Map map = this.f4982a;
        if (obj == null) {
            c();
            map.remove(fVar);
            return;
        }
        if (obj instanceof Set) {
            obj = Collections.unmodifiableSet(n.m0((Set) obj));
            AbstractC1305a.n(obj, "unmodifiableSet(set.toSet())");
        } else if (obj instanceof byte[]) {
            byte[] bArr = (byte[]) obj;
            byte[] bArrCopyOf = Arrays.copyOf(bArr, bArr.length);
            AbstractC1305a.n(bArrCopyOf, "copyOf(this, size)");
            map.put(fVar, bArrCopyOf);
            return;
        }
        map.put(fVar, obj);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C0254b)) {
            return false;
        }
        C0254b c0254b = (C0254b) obj;
        Map map = c0254b.f4982a;
        Map map2 = this.f4982a;
        if (map == map2) {
            return true;
        }
        if (map.size() != map2.size()) {
            return false;
        }
        Map map3 = c0254b.f4982a;
        if (!map3.isEmpty()) {
            for (Map.Entry entry : map3.entrySet()) {
                Object obj2 = map2.get(entry.getKey());
                if (obj2 == null) {
                    return false;
                }
                Object value = entry.getValue();
                if (value instanceof byte[]) {
                    if (!(obj2 instanceof byte[]) || !Arrays.equals((byte[]) value, (byte[]) obj2)) {
                        return false;
                    }
                } else if (!AbstractC1305a.c(value, obj2)) {
                    return false;
                }
            }
        }
        return true;
    }

    public final int hashCode() {
        Iterator it = this.f4982a.entrySet().iterator();
        int iHashCode = 0;
        while (it.hasNext()) {
            Object value = ((Map.Entry) it.next()).getValue();
            iHashCode += value instanceof byte[] ? Arrays.hashCode((byte[]) value) : value.hashCode();
        }
        return iHashCode;
    }

    public final String toString() {
        return n.f0(this.f4982a.entrySet(), ",\n", "{\n", "\n}", C0253a.f4981x, 24);
    }

    public /* synthetic */ C0254b(boolean z5) {
        this(new LinkedHashMap(), z5);
    }
}
