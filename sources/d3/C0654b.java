package d3;

import J3.G;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: renamed from: d3.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0654b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f8181a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Set f8182b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Set f8183c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f8184d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f8185e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final e f8186f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Set f8187g;

    public C0654b(String str, Set set, Set set2, int i6, int i7, e eVar, Set set3) {
        this.f8181a = str;
        this.f8182b = Collections.unmodifiableSet(set);
        this.f8183c = Collections.unmodifiableSet(set2);
        this.f8184d = i6;
        this.f8185e = i7;
        this.f8186f = eVar;
        this.f8187g = Collections.unmodifiableSet(set3);
    }

    public static C0653a a(r rVar) {
        return new C0653a(rVar, new r[0]);
    }

    public static C0653a b(Class cls) {
        return new C0653a(cls, new Class[0]);
    }

    public static C0654b c(Object obj, Class cls, Class... clsArr) {
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        HashSet hashSet3 = new HashSet();
        hashSet.add(r.a(cls));
        for (Class cls2 : clsArr) {
            f2.h.g(cls2, "Null interface");
            hashSet.add(r.a(cls2));
        }
        return new C0654b(null, new HashSet(hashSet), new HashSet(hashSet2), 0, 0, new G(1, obj), hashSet3);
    }

    public final String toString() {
        return "Component<" + Arrays.toString(this.f8182b.toArray()) + ">{" + this.f8184d + ", type=" + this.f8185e + ", deps=" + Arrays.toString(this.f8183c.toArray()) + "}";
    }
}
