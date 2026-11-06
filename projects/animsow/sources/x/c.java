package x;

import java.util.ArrayList;
import java.util.Iterator;
import w.C1437d;
import w.C1438e;

/* JADX INFO: loaded from: classes.dex */
public final class c extends p {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final ArrayList f13610k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f13611l;

    public c(int i6, C1437d c1437d) {
        C1437d c1437dM;
        super(c1437d);
        this.f13610k = new ArrayList();
        this.f13658f = i6;
        C1437d c1437dN = this.f13654b;
        while (true) {
            C1437d c1437d2 = c1437dN;
            c1437dN = c1437dN.n(i6);
            c1437dM = c1437d2;
            if (c1437dN == null) {
                break;
            } else {
                i6 = this.f13658f;
            }
        }
        this.f13654b = c1437dM;
        int i7 = this.f13658f;
        Object obj = i7 == 0 ? c1437dM.f13372d : i7 == 1 ? c1437dM.f13374e : null;
        ArrayList<p> arrayList = this.f13610k;
        while (true) {
            arrayList.add(obj);
            c1437dM = c1437dM.m(this.f13658f);
            if (c1437dM == null) {
                break;
            }
            int i8 = this.f13658f;
            obj = i8 == 0 ? c1437dM.f13372d : i8 == 1 ? c1437dM.f13374e : null;
        }
        for (p pVar : arrayList) {
            int i9 = this.f13658f;
            if (i9 == 0) {
                pVar.f13654b.f13368b = this;
            } else if (i9 == 1) {
                pVar.f13654b.f13370c = this;
            }
        }
        if (this.f13658f == 0 && ((C1438e) this.f13654b.f13359T).f13423v0 && arrayList.size() > 1) {
            this.f13654b = ((p) arrayList.get(arrayList.size() - 1)).f13654b;
        }
        this.f13611l = this.f13658f == 0 ? this.f13654b.f13383i0 : this.f13654b.f13385j0;
    }

    /* JADX WARN: Removed duplicated region for block: B:62:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x014d  */
    @Override // x.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void a(x.d r27) {
        /*
            Method dump skipped, instruction units count: 948
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: x.c.a(x.d):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x009f A[PHI: r0 r1
      0x009f: PHI (r0v9 int) = (r0v6 int), (r0v13 int) binds: [B:29:0x009d, B:19:0x0069] A[DONT_GENERATE, DONT_INLINE]
      0x009f: PHI (r1v10 x.f) = (r1v7 x.f), (r1v14 x.f) binds: [B:29:0x009d, B:19:0x0069] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // x.p
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void d() {
        /*
            r7 = this;
            java.util.ArrayList r0 = r7.f13610k
            java.util.Iterator r1 = r0.iterator()
        L6:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L16
            java.lang.Object r2 = r1.next()
            x.p r2 = (x.p) r2
            r2.d()
            goto L6
        L16:
            int r1 = r0.size()
            r2 = 1
            if (r1 >= r2) goto L1e
            return
        L1e:
            r3 = 0
            java.lang.Object r4 = r0.get(r3)
            x.p r4 = (x.p) r4
            w.d r4 = r4.f13654b
            int r1 = r1 - r2
            java.lang.Object r0 = r0.get(r1)
            x.p r0 = (x.p) r0
            w.d r0 = r0.f13654b
            int r1 = r7.f13658f
            x.f r5 = r7.f13661i
            x.f r6 = r7.f13660h
            if (r1 != 0) goto L6c
            w.c r1 = r4.f13348I
            w.c r0 = r0.f13350K
            x.f r2 = x.p.i(r1, r3)
            int r1 = r1.e()
            w.d r4 = r7.m()
            if (r4 == 0) goto L50
            w.c r1 = r4.f13348I
            int r1 = r1.e()
        L50:
            if (r2 == 0) goto L55
            x.p.b(r6, r2, r1)
        L55:
            x.f r1 = x.p.i(r0, r3)
            int r0 = r0.e()
            w.d r2 = r7.n()
            if (r2 == 0) goto L69
            w.c r0 = r2.f13350K
            int r0 = r0.e()
        L69:
            if (r1 == 0) goto La3
            goto L9f
        L6c:
            w.c r1 = r4.f13349J
            w.c r0 = r0.f13351L
            x.f r3 = x.p.i(r1, r2)
            int r1 = r1.e()
            w.d r4 = r7.m()
            if (r4 == 0) goto L84
            w.c r1 = r4.f13349J
            int r1 = r1.e()
        L84:
            if (r3 == 0) goto L89
            x.p.b(r6, r3, r1)
        L89:
            x.f r1 = x.p.i(r0, r2)
            int r0 = r0.e()
            w.d r2 = r7.n()
            if (r2 == 0) goto L9d
            w.c r0 = r2.f13351L
            int r0 = r0.e()
        L9d:
            if (r1 == 0) goto La3
        L9f:
            int r0 = -r0
            x.p.b(r5, r1, r0)
        La3:
            r6.f13620a = r7
            r5.f13620a = r7
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: x.c.d():void");
    }

    @Override // x.p
    public final void e() {
        int i6 = 0;
        while (true) {
            ArrayList arrayList = this.f13610k;
            if (i6 >= arrayList.size()) {
                return;
            }
            ((p) arrayList.get(i6)).e();
            i6++;
        }
    }

    @Override // x.p
    public final void f() {
        this.f13655c = null;
        Iterator it = this.f13610k.iterator();
        while (it.hasNext()) {
            ((p) it.next()).f();
        }
    }

    @Override // x.p
    public final long j() {
        ArrayList arrayList = this.f13610k;
        int size = arrayList.size();
        long j6 = 0;
        for (int i6 = 0; i6 < size; i6++) {
            p pVar = (p) arrayList.get(i6);
            j6 = ((long) pVar.f13661i.f13625f) + pVar.j() + j6 + ((long) pVar.f13660h.f13625f);
        }
        return j6;
    }

    @Override // x.p
    public final boolean k() {
        ArrayList arrayList = this.f13610k;
        int size = arrayList.size();
        for (int i6 = 0; i6 < size; i6++) {
            if (!((p) arrayList.get(i6)).k()) {
                return false;
            }
        }
        return true;
    }

    public final C1437d m() {
        int i6 = 0;
        while (true) {
            ArrayList arrayList = this.f13610k;
            if (i6 >= arrayList.size()) {
                return null;
            }
            C1437d c1437d = ((p) arrayList.get(i6)).f13654b;
            if (c1437d.f13379g0 != 8) {
                return c1437d;
            }
            i6++;
        }
    }

    public final C1437d n() {
        ArrayList arrayList = this.f13610k;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            C1437d c1437d = ((p) arrayList.get(size)).f13654b;
            if (c1437d.f13379g0 != 8) {
                return c1437d;
            }
        }
        return null;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ChainRun ");
        sb.append(this.f13658f == 0 ? "horizontal : " : "vertical : ");
        for (p pVar : this.f13610k) {
            sb.append("<");
            sb.append(pVar);
            sb.append("> ");
        }
        return sb.toString();
    }
}
