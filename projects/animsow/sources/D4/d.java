package D4;

import C4.u;
import C4.v;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import o0.AbstractC1171a0;
import s4.AbstractC1305a;
import s4.C1311g;

/* JADX INFO: loaded from: classes.dex */
public final class d implements I4.b, c {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Map f364b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final HashMap f365c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final LinkedHashMap f366d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Class f367a;

    static {
        List listE = S3.a.E(C4.a.class, C4.l.class, C4.p.class, C4.q.class, AbstractC1171a0.class, C4.r.class, C4.s.class, C4.t.class, u.class, v.class, C4.b.class, C4.c.class, C4.d.class, C4.e.class, C4.f.class, C4.g.class, C4.h.class, C4.i.class, C4.j.class, C4.k.class, C4.m.class, C4.n.class, C4.o.class);
        ArrayList arrayList = new ArrayList(t4.k.W(listE));
        int i6 = 0;
        for (Object obj : listE) {
            int i7 = i6 + 1;
            if (i6 < 0) {
                throw new ArithmeticException("Index overflow has happened.");
            }
            arrayList.add(new C1311g((Class) obj, Integer.valueOf(i6)));
            i6 = i7;
        }
        f364b = J4.g.c0(arrayList);
        HashMap map = new HashMap();
        map.put("boolean", "kotlin.Boolean");
        map.put("char", "kotlin.Char");
        map.put("byte", "kotlin.Byte");
        map.put("short", "kotlin.Short");
        map.put("int", "kotlin.Int");
        map.put("float", "kotlin.Float");
        map.put("long", "kotlin.Long");
        map.put("double", "kotlin.Double");
        HashMap map2 = new HashMap();
        map2.put("java.lang.Boolean", "kotlin.Boolean");
        map2.put("java.lang.Character", "kotlin.Char");
        map2.put("java.lang.Byte", "kotlin.Byte");
        map2.put("java.lang.Short", "kotlin.Short");
        map2.put("java.lang.Integer", "kotlin.Int");
        map2.put("java.lang.Float", "kotlin.Float");
        map2.put("java.lang.Long", "kotlin.Long");
        map2.put("java.lang.Double", "kotlin.Double");
        HashMap map3 = new HashMap();
        map3.put("java.lang.Object", "kotlin.Any");
        map3.put("java.lang.String", "kotlin.String");
        map3.put("java.lang.CharSequence", "kotlin.CharSequence");
        map3.put("java.lang.Throwable", "kotlin.Throwable");
        map3.put("java.lang.Cloneable", "kotlin.Cloneable");
        map3.put("java.lang.Number", "kotlin.Number");
        map3.put("java.lang.Comparable", "kotlin.Comparable");
        map3.put("java.lang.Enum", "kotlin.Enum");
        map3.put("java.lang.annotation.Annotation", "kotlin.Annotation");
        map3.put("java.lang.Iterable", "kotlin.collections.Iterable");
        map3.put("java.util.Iterator", "kotlin.collections.Iterator");
        map3.put("java.util.Collection", "kotlin.collections.Collection");
        map3.put("java.util.List", "kotlin.collections.List");
        map3.put("java.util.Set", "kotlin.collections.Set");
        map3.put("java.util.ListIterator", "kotlin.collections.ListIterator");
        map3.put("java.util.Map", "kotlin.collections.Map");
        map3.put("java.util.Map$Entry", "kotlin.collections.Map.Entry");
        map3.put("kotlin.jvm.internal.StringCompanionObject", "kotlin.String.Companion");
        map3.put("kotlin.jvm.internal.EnumCompanionObject", "kotlin.Enum.Companion");
        map3.putAll(map);
        map3.putAll(map2);
        Collection<String> collectionValues = map.values();
        AbstractC1305a.n(collectionValues, "<get-values>(...)");
        for (String str : collectionValues) {
            StringBuilder sb = new StringBuilder("kotlin.jvm.internal.");
            AbstractC1305a.l(str);
            sb.append(K4.h.k0(str, str));
            sb.append("CompanionObject");
            map3.put(sb.toString(), str.concat(".Companion"));
        }
        for (Map.Entry entry : f364b.entrySet()) {
            Class cls = (Class) entry.getKey();
            int iIntValue = ((Number) entry.getValue()).intValue();
            map3.put(cls.getName(), "kotlin.Function" + iIntValue);
        }
        f365c = map3;
        LinkedHashMap linkedHashMap = new LinkedHashMap(AbstractC1305a.M(map3.size()));
        for (Map.Entry entry2 : map3.entrySet()) {
            Object key = entry2.getKey();
            String str2 = (String) entry2.getValue();
            linkedHashMap.put(key, K4.h.k0(str2, str2));
        }
        f366d = linkedHashMap;
    }

    public d(Class cls) {
        AbstractC1305a.o(cls, "jClass");
        this.f367a = cls;
    }

    @Override // D4.c
    public final Class a() {
        return this.f367a;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof d) && AbstractC1305a.c(AbstractC1305a.E(this), AbstractC1305a.E((I4.b) obj));
    }

    public final int hashCode() {
        return AbstractC1305a.E(this).hashCode();
    }

    public final String toString() {
        return this.f367a.toString() + " (Kotlin reflection is not available)";
    }
}
