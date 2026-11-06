package x;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import w.AbstractC1443j;
import w.C1437d;
import w.C1438e;
import w.C1441h;

/* JADX INFO: loaded from: classes.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public C1438e f13612a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f13613b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f13614c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public C1438e f13615d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public ArrayList f13616e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public n f13617f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public b f13618g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public ArrayList f13619h;

    public final void a(f fVar, int i6, ArrayList arrayList, l lVar) {
        p pVar = fVar.f13623d;
        if (pVar.f13655c == null) {
            C1438e c1438e = this.f13612a;
            if (pVar == c1438e.f13372d || pVar == c1438e.f13374e) {
                return;
            }
            if (lVar == null) {
                lVar = new l();
                lVar.f13635a = null;
                lVar.f13636b = new ArrayList();
                lVar.f13635a = pVar;
                arrayList.add(lVar);
            }
            pVar.f13655c = lVar;
            lVar.f13636b.add(pVar);
            f fVar2 = pVar.f13660h;
            for (d dVar : fVar2.f13630k) {
                if (dVar instanceof f) {
                    a((f) dVar, i6, arrayList, lVar);
                }
            }
            f fVar3 = pVar.f13661i;
            for (d dVar2 : fVar3.f13630k) {
                if (dVar2 instanceof f) {
                    a((f) dVar2, i6, arrayList, lVar);
                }
            }
            if (i6 == 1 && (pVar instanceof m)) {
                for (d dVar3 : ((m) pVar).f13637k.f13630k) {
                    if (dVar3 instanceof f) {
                        a((f) dVar3, i6, arrayList, lVar);
                    }
                }
            }
            Iterator it = fVar2.f13631l.iterator();
            while (it.hasNext()) {
                a((f) it.next(), i6, arrayList, lVar);
            }
            Iterator it2 = fVar3.f13631l.iterator();
            while (it2.hasNext()) {
                a((f) it2.next(), i6, arrayList, lVar);
            }
            if (i6 == 1 && (pVar instanceof m)) {
                Iterator it3 = ((m) pVar).f13637k.f13631l.iterator();
                while (it3.hasNext()) {
                    a((f) it3.next(), i6, arrayList, lVar);
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:115:0x01d7  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x01fb A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:179:0x0008 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0184  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void b(w.C1438e r17) {
        /*
            Method dump skipped, instruction units count: 614
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: x.e.b(w.e):void");
    }

    public final void c() {
        p iVar;
        ArrayList<p> arrayList = this.f13616e;
        arrayList.clear();
        C1438e c1438e = this.f13615d;
        c1438e.f13372d.f();
        c1438e.f13374e.f();
        arrayList.add(c1438e.f13372d);
        arrayList.add(c1438e.f13374e);
        HashSet hashSet = null;
        for (C1437d c1437d : c1438e.f13489q0) {
            if (c1437d instanceof C1441h) {
                iVar = new i(c1437d);
                c1437d.f13372d.f();
                c1437d.f13374e.f();
                iVar.f13658f = ((C1441h) c1437d).f13484u0;
            } else {
                if (c1437d.y()) {
                    if (c1437d.f13368b == null) {
                        c1437d.f13368b = new c(0, c1437d);
                    }
                    if (hashSet == null) {
                        hashSet = new HashSet();
                    }
                    hashSet.add(c1437d.f13368b);
                } else {
                    arrayList.add(c1437d.f13372d);
                }
                if (c1437d.z()) {
                    if (c1437d.f13370c == null) {
                        c1437d.f13370c = new c(1, c1437d);
                    }
                    if (hashSet == null) {
                        hashSet = new HashSet();
                    }
                    hashSet.add(c1437d.f13370c);
                } else {
                    arrayList.add(c1437d.f13374e);
                }
                if (c1437d instanceof AbstractC1443j) {
                    iVar = new j(c1437d);
                }
            }
            arrayList.add(iVar);
        }
        if (hashSet != null) {
            arrayList.addAll(hashSet);
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((p) it.next()).f();
        }
        for (p pVar : arrayList) {
            if (pVar.f13654b != c1438e) {
                pVar.d();
            }
        }
        ArrayList arrayList2 = this.f13619h;
        arrayList2.clear();
        C1438e c1438e2 = this.f13612a;
        e(c1438e2.f13372d, 0, arrayList2);
        e(c1438e2.f13374e, 1, arrayList2);
        this.f13613b = false;
    }

    public final int d(C1438e c1438e, int i6) {
        ArrayList arrayList;
        int i7;
        int i8;
        long j6;
        long j7;
        long jB;
        float f6;
        C1438e c1438e2 = c1438e;
        ArrayList arrayList2 = this.f13619h;
        int size = arrayList2.size();
        int i9 = 0;
        long jMax = 0;
        while (i9 < size) {
            p pVar = ((l) arrayList2.get(i9)).f13635a;
            if (!(pVar instanceof c) ? !(i6 != 0 ? (pVar instanceof m) : (pVar instanceof k)) : ((c) pVar).f13658f != i6) {
                f fVar = (i6 == 0 ? c1438e2.f13372d : c1438e2.f13374e).f13660h;
                f fVar2 = (i6 == 0 ? c1438e2.f13372d : c1438e2.f13374e).f13661i;
                boolean zContains = pVar.f13660h.f13631l.contains(fVar);
                f fVar3 = pVar.f13661i;
                boolean zContains2 = fVar3.f13631l.contains(fVar2);
                long j8 = pVar.j();
                f fVar4 = pVar.f13660h;
                if (zContains && zContains2) {
                    long jB2 = l.b(fVar4, 0L);
                    ArrayList arrayList3 = arrayList2;
                    i7 = size;
                    long jA = l.a(fVar3, 0L);
                    long j9 = jB2 - j8;
                    int i10 = fVar3.f13625f;
                    arrayList = arrayList3;
                    i8 = i9;
                    if (j9 >= (-i10)) {
                        j9 += (long) i10;
                    }
                    long j10 = (-jA) - j8;
                    long j11 = fVar4.f13625f;
                    long j12 = j10 - j11;
                    if (j12 >= j11) {
                        j12 -= j11;
                    }
                    C1437d c1437d = pVar.f13654b;
                    if (i6 == 0) {
                        f6 = c1437d.f13373d0;
                    } else if (i6 == 1) {
                        f6 = c1437d.f13375e0;
                    } else {
                        c1437d.getClass();
                        f6 = -1.0f;
                    }
                    float f7 = f6 > 0.0f ? (long) ((j9 / (1.0f - f6)) + (j12 / f6)) : 0L;
                    j6 = (((long) fVar4.f13625f) + ((((long) ((f7 * f6) + 0.5f)) + j8) + ((long) (((1.0f - f6) * f7) + 0.5f)))) - ((long) fVar3.f13625f);
                } else {
                    arrayList = arrayList2;
                    i7 = size;
                    i8 = i9;
                    if (zContains) {
                        jB = l.b(fVar4, fVar4.f13625f);
                        j7 = ((long) fVar4.f13625f) + j8;
                    } else if (zContains2) {
                        long jA2 = l.a(fVar3, fVar3.f13625f);
                        j7 = ((long) (-fVar3.f13625f)) + j8;
                        jB = -jA2;
                    } else {
                        j6 = (pVar.j() + ((long) fVar4.f13625f)) - ((long) fVar3.f13625f);
                    }
                    j6 = Math.max(jB, j7);
                }
            } else {
                arrayList = arrayList2;
                i7 = size;
                i8 = i9;
                j6 = 0;
            }
            jMax = Math.max(jMax, j6);
            i9 = i8 + 1;
            c1438e2 = c1438e;
            size = i7;
            arrayList2 = arrayList;
        }
        return (int) jMax;
    }

    public final void e(p pVar, int i6, ArrayList arrayList) {
        f fVar;
        f fVar2;
        f fVar3;
        Iterator it = pVar.f13660h.f13630k.iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            fVar = pVar.f13661i;
            if (!zHasNext) {
                break;
            }
            d dVar = (d) it.next();
            if (dVar instanceof f) {
                fVar3 = (f) dVar;
            } else if (dVar instanceof p) {
                fVar3 = ((p) dVar).f13660h;
            }
            a(fVar3, i6, arrayList, null);
        }
        for (d dVar2 : fVar.f13630k) {
            if (dVar2 instanceof f) {
                fVar2 = (f) dVar2;
            } else if (dVar2 instanceof p) {
                fVar2 = ((p) dVar2).f13661i;
            }
            a(fVar2, i6, arrayList, null);
        }
        if (i6 == 1) {
            for (d dVar3 : ((m) pVar).f13637k.f13630k) {
                if (dVar3 instanceof f) {
                    a((f) dVar3, i6, arrayList, null);
                }
            }
        }
    }

    public final void f(C1437d c1437d, int i6, int i7, int i8, int i9) {
        b bVar = this.f13618g;
        bVar.f13600a = i6;
        bVar.f13601b = i8;
        bVar.f13602c = i7;
        bVar.f13603d = i9;
        this.f13617f.b(c1437d, bVar);
        c1437d.P(bVar.f13604e);
        c1437d.M(bVar.f13605f);
        c1437d.f13344E = bVar.f13607h;
        c1437d.J(bVar.f13606g);
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x006d, code lost:
    
        if (r10 == 3) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x006f, code lost:
    
        r2.f13632m = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0072, code lost:
    
        r2.d(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x008d, code lost:
    
        if (r8 == 3) goto L28;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void g() {
        /*
            r14 = this;
            w.e r0 = r14.f13612a
            java.util.ArrayList r0 = r0.f13489q0
            java.util.Iterator r0 = r0.iterator()
        L8:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto La1
            java.lang.Object r1 = r0.next()
            w.d r1 = (w.C1437d) r1
            boolean r2 = r1.f13366a
            if (r2 == 0) goto L19
            goto L8
        L19:
            int[] r2 = r1.f13397p0
            r3 = 0
            r8 = r2[r3]
            r9 = 1
            r10 = r2[r9]
            int r2 = r1.f13399r
            int r4 = r1.f13400s
            r6 = 2
            r11 = 3
            if (r8 == r6) goto L30
            if (r8 != r11) goto L2e
            if (r2 != r9) goto L2e
            goto L30
        L2e:
            r2 = r3
            goto L31
        L30:
            r2 = r9
        L31:
            if (r10 == r6) goto L37
            if (r10 != r11) goto L38
            if (r4 != r9) goto L38
        L37:
            r3 = r9
        L38:
            x.k r4 = r1.f13372d
            x.g r4 = r4.f13657e
            boolean r5 = r4.f13629j
            x.m r7 = r1.f13374e
            x.g r7 = r7.f13657e
            boolean r12 = r7.f13629j
            r13 = 1
            if (r5 == 0) goto L57
            if (r12 == 0) goto L57
            int r5 = r4.f13626g
            int r7 = r7.f13626g
            r2 = r14
            r3 = r1
            r4 = r13
            r6 = r13
            r2.f(r3, r4, r5, r6, r7)
        L54:
            r1.f13366a = r9
            goto L90
        L57:
            if (r5 == 0) goto L76
            if (r3 == 0) goto L76
            int r5 = r4.f13626g
            int r7 = r7.f13626g
            r2 = r14
            r3 = r1
            r4 = r13
            r2.f(r3, r4, r5, r6, r7)
            x.m r2 = r1.f13374e
            x.g r2 = r2.f13657e
            int r3 = r1.l()
            if (r10 != r11) goto L72
        L6f:
            r2.f13632m = r3
            goto L90
        L72:
            r2.d(r3)
            goto L54
        L76:
            if (r12 == 0) goto L90
            if (r2 == 0) goto L90
            int r5 = r4.f13626g
            int r7 = r7.f13626g
            r2 = r14
            r3 = r1
            r4 = r6
            r6 = r13
            r2.f(r3, r4, r5, r6, r7)
            x.k r2 = r1.f13372d
            x.g r2 = r2.f13657e
            int r3 = r1.r()
            if (r8 != r11) goto L72
            goto L6f
        L90:
            boolean r2 = r1.f13366a
            if (r2 == 0) goto L8
            x.m r2 = r1.f13374e
            x.a r2 = r2.f13638l
            if (r2 == 0) goto L8
            int r1 = r1.f13367a0
            r2.d(r1)
            goto L8
        La1:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: x.e.g():void");
    }
}
