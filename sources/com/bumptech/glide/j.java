package com.bumptech.glide;

import androidx.lifecycle.D;
import com.google.android.gms.internal.measurement.C0396c2;
import i.C0803c;
import j1.p;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import p1.C1233B;
import p1.C1234C;
import p1.x;
import p1.y;
import p1.z;
import t0.AbstractC1332d;
import u1.C1358b;
import v1.C1418b;
import v1.C1419c;
import v1.InterfaceC1417a;
import x1.C1486b;
import x1.C1487c;
import x1.C1488d;
import x1.C1489e;

/* JADX INFO: loaded from: classes.dex */
public final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C0396c2 f6346a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C1419c f6347b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final C1358b f6348c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final C1419c f6349d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final com.bumptech.glide.load.data.i f6350e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final C1419c f6351f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final C1486b f6352g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final C1358b f6353h = new C1358b(4);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final C1487c f6354i = new C1487c();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final C0803c f6355j;

    public j() {
        int i6 = 24;
        C0803c c0803c = new C0803c(new M.c(20), new I0.o(i6), new V0.m(i6));
        this.f6355j = c0803c;
        this.f6346a = new C0396c2(c0803c);
        this.f6347b = new C1419c(1);
        this.f6348c = new C1358b(5);
        this.f6349d = new C1419c(2);
        this.f6350e = new com.bumptech.glide.load.data.i();
        this.f6351f = new C1419c(0);
        this.f6352g = new C1486b(0);
        List listAsList = Arrays.asList("Animation", "Bitmap", "BitmapDrawable");
        ArrayList arrayList = new ArrayList(listAsList.size());
        arrayList.add("legacy_prepend_all");
        Iterator it = listAsList.iterator();
        while (it.hasNext()) {
            arrayList.add((String) it.next());
        }
        arrayList.add("legacy_append");
        C1358b c1358b = this.f6348c;
        synchronized (c1358b) {
            try {
                ArrayList<String> arrayList2 = new ArrayList((List) c1358b.f12822x);
                ((List) c1358b.f12822x).clear();
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    ((List) c1358b.f12822x).add((String) it2.next());
                }
                for (String str : arrayList2) {
                    if (!arrayList.contains(str)) {
                        ((List) c1358b.f12822x).add(str);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void a(j1.o oVar, Class cls, Class cls2, String str) {
        C1358b c1358b = this.f6348c;
        synchronized (c1358b) {
            c1358b.e(str).add(new C1488d(cls, cls2, oVar));
        }
    }

    public final void b(Class cls, p pVar) {
        C1419c c1419c = this.f6349d;
        synchronized (c1419c) {
            c1419c.f13295a.add(new C1489e(cls, pVar));
        }
    }

    public final void c(Class cls, Class cls2, y yVar) {
        C0396c2 c0396c2 = this.f6346a;
        synchronized (c0396c2) {
            C1234C c1234c = (C1234C) c0396c2.f6775x;
            synchronized (c1234c) {
                C1233B c1233b = new C1233B(cls, cls2, yVar);
                ArrayList arrayList = c1234c.f12223a;
                arrayList.add(arrayList.size(), c1233b);
            }
            ((D) c0396c2.f6776y).f5548a.clear();
        }
    }

    public final ArrayList d() {
        ArrayList arrayList;
        C1486b c1486b = this.f6352g;
        synchronized (c1486b) {
            arrayList = c1486b.f13667a;
        }
        if (arrayList.isEmpty()) {
            throw new i("Failed to find image header parser.");
        }
        return arrayList;
    }

    public final List e(Object obj) {
        List listUnmodifiableList;
        C0396c2 c0396c2 = this.f6346a;
        c0396c2.getClass();
        Class<?> cls = obj.getClass();
        synchronized (c0396c2) {
            z zVar = (z) ((D) c0396c2.f6776y).f5548a.get(cls);
            listUnmodifiableList = zVar == null ? null : zVar.f12289a;
            if (listUnmodifiableList == null) {
                listUnmodifiableList = Collections.unmodifiableList(((C1234C) c0396c2.f6775x).a(cls));
                if (((z) ((D) c0396c2.f6776y).f5548a.put(cls, new z(listUnmodifiableList))) != null) {
                    throw new IllegalStateException("Already cached loaders for model: " + cls);
                }
            }
        }
        if (listUnmodifiableList.isEmpty()) {
            throw new i("Failed to find any ModelLoaders registered for model class: " + obj.getClass());
        }
        int size = listUnmodifiableList.size();
        List listEmptyList = Collections.emptyList();
        boolean z5 = true;
        for (int i6 = 0; i6 < size; i6++) {
            x xVar = (x) listUnmodifiableList.get(i6);
            if (xVar.a(obj)) {
                if (z5) {
                    listEmptyList = new ArrayList(size - i6);
                    z5 = false;
                }
                listEmptyList.add(xVar);
            }
        }
        if (!listEmptyList.isEmpty()) {
            return listEmptyList;
        }
        throw new i("Found ModelLoaders for model class: " + listUnmodifiableList + ", but none that handle this specific model instance: " + obj);
    }

    public final com.bumptech.glide.load.data.g f(Object obj) {
        com.bumptech.glide.load.data.g gVarA;
        com.bumptech.glide.load.data.i iVar = this.f6350e;
        synchronized (iVar) {
            try {
                AbstractC1332d.k(obj);
                com.bumptech.glide.load.data.f fVar = (com.bumptech.glide.load.data.f) iVar.f6375a.get(obj.getClass());
                if (fVar == null) {
                    Iterator it = iVar.f6375a.values().iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        com.bumptech.glide.load.data.f fVar2 = (com.bumptech.glide.load.data.f) it.next();
                        if (fVar2.b().isAssignableFrom(obj.getClass())) {
                            fVar = fVar2;
                            break;
                        }
                    }
                }
                if (fVar == null) {
                    fVar = com.bumptech.glide.load.data.i.f6374b;
                }
                gVarA = fVar.a(obj);
            } catch (Throwable th) {
                throw th;
            }
        }
        return gVarA;
    }

    public final void g(com.bumptech.glide.load.data.f fVar) {
        com.bumptech.glide.load.data.i iVar = this.f6350e;
        synchronized (iVar) {
            iVar.f6375a.put(fVar.b(), fVar);
        }
    }

    public final void h(Class cls, Class cls2, InterfaceC1417a interfaceC1417a) {
        C1419c c1419c = this.f6351f;
        synchronized (c1419c) {
            c1419c.f13295a.add(new C1418b(cls, cls2, interfaceC1417a));
        }
    }
}
