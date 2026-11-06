package d3;

import java.util.Collections;
import java.util.HashSet;

/* JADX INFO: renamed from: d3.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0653a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f8174a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final HashSet f8175b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final HashSet f8176c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f8177d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f8178e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public e f8179f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final HashSet f8180g;

    public C0653a(r rVar, r[] rVarArr) {
        HashSet hashSet = new HashSet();
        this.f8175b = hashSet;
        this.f8176c = new HashSet();
        this.f8177d = 0;
        this.f8178e = 0;
        this.f8180g = new HashSet();
        hashSet.add(rVar);
        for (r rVar2 : rVarArr) {
            f2.h.g(rVar2, "Null interface");
        }
        Collections.addAll(this.f8175b, rVarArr);
    }

    public final void a(k kVar) {
        if (!(!this.f8175b.contains(kVar.f8204a))) {
            throw new IllegalArgumentException("Components are not allowed to depend on interfaces they themselves provide.");
        }
        this.f8176c.add(kVar);
    }

    public final C0654b b() {
        if (this.f8179f != null) {
            return new C0654b(this.f8174a, new HashSet(this.f8175b), new HashSet(this.f8176c), this.f8177d, this.f8178e, this.f8179f, this.f8180g);
        }
        throw new IllegalStateException("Missing required property: factory.");
    }

    public final void c(int i6) {
        if (!(this.f8177d == 0)) {
            throw new IllegalStateException("Instantiation type has already been set.");
        }
        this.f8177d = i6;
    }

    public C0653a(Class cls, Class[] clsArr) {
        HashSet hashSet = new HashSet();
        this.f8175b = hashSet;
        this.f8176c = new HashSet();
        this.f8177d = 0;
        this.f8178e = 0;
        this.f8180g = new HashSet();
        hashSet.add(r.a(cls));
        for (Class cls2 : clsArr) {
            f2.h.g(cls2, "Null interface");
            this.f8175b.add(r.a(cls2));
        }
    }
}
