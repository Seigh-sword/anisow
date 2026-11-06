package p1;

import i.C0803c;
import java.util.ArrayList;
import java.util.HashSet;

/* JADX INFO: renamed from: p1.C, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1234C {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final I0.o f12221e = new I0.o(13);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final C1241g f12222f = new C1241g(1);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f12223a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final I0.o f12224b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final HashSet f12225c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final M.b f12226d;

    public C1234C(C0803c c0803c) {
        I0.o oVar = f12221e;
        this.f12223a = new ArrayList();
        this.f12225c = new HashSet();
        this.f12226d = c0803c;
        this.f12224b = oVar;
    }

    public final synchronized ArrayList a(Class cls) {
        ArrayList arrayList;
        try {
            arrayList = new ArrayList();
            for (C1233B c1233b : this.f12223a) {
                if (!this.f12225c.contains(c1233b) && c1233b.f12218a.isAssignableFrom(cls)) {
                    this.f12225c.add(c1233b);
                    arrayList.add(c1233b.f12220c.d(this));
                    this.f12225c.remove(c1233b);
                }
            }
        } catch (Throwable th) {
            this.f12225c.clear();
            throw th;
        }
        return arrayList;
    }

    public final synchronized x b(Class cls, Class cls2) {
        try {
            ArrayList arrayList = new ArrayList();
            boolean z5 = false;
            for (C1233B c1233b : this.f12223a) {
                if (this.f12225c.contains(c1233b)) {
                    z5 = true;
                } else if (c1233b.f12218a.isAssignableFrom(cls) && c1233b.f12219b.isAssignableFrom(cls2)) {
                    this.f12225c.add(c1233b);
                    arrayList.add(c1233b.f12220c.d(this));
                    this.f12225c.remove(c1233b);
                }
            }
            if (arrayList.size() > 1) {
                I0.o oVar = this.f12224b;
                M.b bVar = this.f12226d;
                oVar.getClass();
                return new m(arrayList, bVar);
            }
            if (arrayList.size() == 1) {
                return (x) arrayList.get(0);
            }
            if (z5) {
                return f12222f;
            }
            throw new com.bumptech.glide.i("Failed to find any ModelLoaders for model: " + cls + " and data: " + cls2);
        } catch (Throwable th) {
            this.f12225c.clear();
            throw th;
        }
    }

    public final synchronized ArrayList c(Class cls) {
        ArrayList arrayList;
        arrayList = new ArrayList();
        for (C1233B c1233b : this.f12223a) {
            if (!arrayList.contains(c1233b.f12219b) && c1233b.f12218a.isAssignableFrom(cls)) {
                arrayList.add(c1233b.f12219b);
            }
        }
        return arrayList;
    }
}
