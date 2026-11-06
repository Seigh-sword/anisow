package l1;

import com.google.android.gms.internal.measurement.C0396c2;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;
import p1.C1234C;
import s.C1280b;
import u1.C1358b;
import v1.C1418b;
import v1.C1419c;
import v1.C1420d;
import v1.InterfaceC1417a;
import x1.C1487c;
import x1.C1488d;

/* JADX INFO: renamed from: l1.i, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0935i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f9898a = new ArrayList();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f9899b = new ArrayList();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public com.bumptech.glide.f f9900c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Object f9901d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f9902e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f9903f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Class f9904g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public U1.i f9905h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public j1.m f9906i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public Map f9907j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public Class f9908k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f9909l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f9910m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public j1.i f9911n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public com.bumptech.glide.g f9912o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public p f9913p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public boolean f9914q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public boolean f9915r;

    public final ArrayList a() {
        boolean z5 = this.f9910m;
        ArrayList arrayList = this.f9899b;
        if (!z5) {
            this.f9910m = true;
            arrayList.clear();
            ArrayList arrayListB = b();
            int size = arrayListB.size();
            for (int i6 = 0; i6 < size; i6++) {
                p1.w wVar = (p1.w) arrayListB.get(i6);
                if (!arrayList.contains(wVar.f12286a)) {
                    arrayList.add(wVar.f12286a);
                }
                int i7 = 0;
                while (true) {
                    List list = wVar.f12287b;
                    if (i7 < list.size()) {
                        if (!arrayList.contains(list.get(i7))) {
                            arrayList.add(list.get(i7));
                        }
                        i7++;
                    }
                }
            }
        }
        return arrayList;
    }

    public final ArrayList b() {
        boolean z5 = this.f9909l;
        ArrayList arrayList = this.f9898a;
        if (!z5) {
            this.f9909l = true;
            arrayList.clear();
            List listE = this.f9900c.a().e(this.f9901d);
            int size = listE.size();
            for (int i6 = 0; i6 < size; i6++) {
                p1.w wVarB = ((p1.x) listE.get(i6)).b(this.f9901d, this.f9902e, this.f9903f, this.f9906i);
                if (wVarB != null) {
                    arrayList.add(wVarB);
                }
            }
        }
        return arrayList;
    }

    public final C0925D c(Class cls) {
        C0925D c0925d;
        ArrayList arrayList;
        InterfaceC1417a interfaceC1417a;
        com.bumptech.glide.j jVarA = this.f9900c.a();
        Class cls2 = this.f9904g;
        Class cls3 = this.f9908k;
        C1487c c1487c = jVarA.f6354i;
        C1.l lVar = (C1.l) c1487c.f13670b.getAndSet(null);
        if (lVar == null) {
            lVar = new C1.l();
        }
        lVar.f130a = cls;
        lVar.f131b = cls2;
        lVar.f132c = cls3;
        synchronized (c1487c.f13669a) {
            c0925d = (C0925D) c1487c.f13669a.getOrDefault(lVar, null);
        }
        c1487c.f13670b.set(lVar);
        jVarA.f6354i.getClass();
        if (C1487c.f13668c.equals(c0925d)) {
            return null;
        }
        if (c0925d != null) {
            return c0925d;
        }
        ArrayList arrayList2 = new ArrayList();
        for (Class<?> cls4 : jVarA.f6348c.g(cls, cls2)) {
            for (Class cls5 : jVarA.f6351f.b(cls4, cls3)) {
                C1358b c1358b = jVarA.f6348c;
                synchronized (c1358b) {
                    arrayList = new ArrayList();
                    Iterator it = ((List) c1358b.f12822x).iterator();
                    while (it.hasNext()) {
                        List<C1488d> list = (List) ((Map) c1358b.f12823y).get((String) it.next());
                        if (list != null) {
                            for (C1488d c1488d : list) {
                                if (c1488d.f13671a.isAssignableFrom(cls) && cls4.isAssignableFrom(c1488d.f13672b)) {
                                    arrayList.add(c1488d.f13673c);
                                }
                            }
                        }
                    }
                }
                C1419c c1419c = jVarA.f6351f;
                synchronized (c1419c) {
                    if (!cls5.isAssignableFrom(cls4)) {
                        for (C1418b c1418b : c1419c.f13295a) {
                            if (c1418b.f13292a.isAssignableFrom(cls4) && cls5.isAssignableFrom(c1418b.f13293b)) {
                                interfaceC1417a = c1418b.f13294c;
                            }
                        }
                        throw new IllegalArgumentException("No transcoder registered to transcode from " + cls4 + " to " + cls5);
                    }
                    interfaceC1417a = C1420d.f13296w;
                }
                arrayList2.add(new n(cls, cls4, cls5, arrayList, interfaceC1417a, jVarA.f6355j));
            }
        }
        C0925D c0925d2 = arrayList2.isEmpty() ? null : new C0925D(cls, cls2, cls3, arrayList2, jVarA.f6355j);
        C1487c c1487c2 = jVarA.f6354i;
        synchronized (c1487c2.f13669a) {
            c1487c2.f13669a.put(new C1.l(cls, cls2, cls3), c0925d2 != null ? c0925d2 : C1487c.f13668c);
        }
        return c0925d2;
    }

    public final List d() {
        List list;
        ArrayList arrayListC;
        com.bumptech.glide.j jVarA = this.f9900c.a();
        Class<?> cls = this.f9901d.getClass();
        Class cls2 = this.f9904g;
        Class cls3 = this.f9908k;
        C1358b c1358b = jVarA.f6353h;
        C1.l lVar = (C1.l) ((AtomicReference) c1358b.f12822x).getAndSet(null);
        if (lVar == null) {
            lVar = new C1.l(cls, cls2, cls3);
        } else {
            lVar.f130a = cls;
            lVar.f131b = cls2;
            lVar.f132c = cls3;
        }
        synchronized (((C1280b) c1358b.f12823y)) {
            list = (List) ((C1280b) c1358b.f12823y).getOrDefault(lVar, null);
        }
        ((AtomicReference) c1358b.f12822x).set(lVar);
        List list2 = list;
        if (list == null) {
            ArrayList arrayList = new ArrayList();
            C0396c2 c0396c2 = jVarA.f6346a;
            synchronized (c0396c2) {
                arrayListC = ((C1234C) c0396c2.f6775x).c(cls);
            }
            Iterator it = arrayListC.iterator();
            while (it.hasNext()) {
                for (Class cls4 : jVarA.f6348c.g((Class) it.next(), cls2)) {
                    if (!jVarA.f6351f.b(cls4, cls3).isEmpty() && !arrayList.contains(cls4)) {
                        arrayList.add(cls4);
                    }
                }
            }
            C1358b c1358b2 = jVarA.f6353h;
            List listUnmodifiableList = Collections.unmodifiableList(arrayList);
            synchronized (((C1280b) c1358b2.f12823y)) {
                ((C1280b) c1358b2.f12823y).put(new C1.l(cls, cls2, cls3), listUnmodifiableList);
            }
            list2 = arrayList;
        }
        return list2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0027, code lost:
    
        r1 = r3.f13666b;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final j1.InterfaceC0845c e(java.lang.Object r6) {
        /*
            r5 = this;
            com.bumptech.glide.f r0 = r5.f9900c
            com.bumptech.glide.j r0 = r0.a()
            v1.c r0 = r0.f6347b
            java.lang.Class r1 = r6.getClass()
            monitor-enter(r0)
            java.util.List r2 = r0.f13295a     // Catch: java.lang.Throwable -> L2b
            java.util.Iterator r2 = r2.iterator()     // Catch: java.lang.Throwable -> L2b
        L13:
            boolean r3 = r2.hasNext()     // Catch: java.lang.Throwable -> L2b
            if (r3 == 0) goto L2d
            java.lang.Object r3 = r2.next()     // Catch: java.lang.Throwable -> L2b
            x1.a r3 = (x1.C1485a) r3     // Catch: java.lang.Throwable -> L2b
            java.lang.Class r4 = r3.f13665a     // Catch: java.lang.Throwable -> L2b
            boolean r4 = r4.isAssignableFrom(r1)     // Catch: java.lang.Throwable -> L2b
            if (r4 == 0) goto L13
            j1.c r1 = r3.f13666b     // Catch: java.lang.Throwable -> L2b
            monitor-exit(r0)
            goto L2f
        L2b:
            r6 = move-exception
            goto L3d
        L2d:
            monitor-exit(r0)
            r1 = 0
        L2f:
            if (r1 == 0) goto L32
            return r1
        L32:
            com.bumptech.glide.i r0 = new com.bumptech.glide.i
            java.lang.Class r6 = r6.getClass()
            r1 = 3
            r0.<init>(r1, r6)
            throw r0
        L3d:
            monitor-exit(r0)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: l1.C0935i.e(java.lang.Object):j1.c");
    }

    public final j1.q f(Class cls) {
        j1.q qVar = (j1.q) this.f9907j.get(cls);
        if (qVar == null) {
            Iterator it = this.f9907j.entrySet().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Map.Entry entry = (Map.Entry) it.next();
                if (((Class) entry.getKey()).isAssignableFrom(cls)) {
                    qVar = (j1.q) entry.getValue();
                    break;
                }
            }
        }
        if (qVar != null) {
            return qVar;
        }
        if (!this.f9907j.isEmpty() || !this.f9914q) {
            return r1.d.f12436b;
        }
        throw new IllegalArgumentException("Missing transformation for " + cls + ". If you wish to ignore unknown resource types, use the optional transformation methods.");
    }
}
