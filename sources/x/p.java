package x;

import w.C1436c;
import w.C1437d;

/* JADX INFO: loaded from: classes.dex */
public abstract class p implements d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f13653a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public C1437d f13654b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public l f13655c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f13656d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final g f13657e = new g(this);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f13658f = 0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f13659g = false;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final f f13660h = new f(this);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final f f13661i = new f(this);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f13662j = 1;

    public p(C1437d c1437d) {
        this.f13654b = c1437d;
    }

    public static void b(f fVar, f fVar2, int i6) {
        fVar.f13631l.add(fVar2);
        fVar.f13625f = i6;
        fVar2.f13630k.add(fVar);
    }

    public static f h(C1436c c1436c) {
        p pVar;
        p pVar2;
        C1436c c1436c2 = c1436c.f13336f;
        if (c1436c2 == null) {
            return null;
        }
        int iB = u.h.b(c1436c2.f13335e);
        C1437d c1437d = c1436c2.f13334d;
        if (iB == 1) {
            pVar = c1437d.f13372d;
        } else {
            if (iB != 2) {
                if (iB == 3) {
                    pVar2 = c1437d.f13372d;
                } else {
                    if (iB != 4) {
                        if (iB != 5) {
                            return null;
                        }
                        return c1437d.f13374e.f13637k;
                    }
                    pVar2 = c1437d.f13374e;
                }
                return pVar2.f13661i;
            }
            pVar = c1437d.f13374e;
        }
        return pVar.f13660h;
    }

    public static f i(C1436c c1436c, int i6) {
        C1436c c1436c2 = c1436c.f13336f;
        if (c1436c2 == null) {
            return null;
        }
        C1437d c1437d = c1436c2.f13334d;
        p pVar = i6 == 0 ? c1437d.f13372d : c1437d.f13374e;
        int iB = u.h.b(c1436c2.f13335e);
        if (iB == 1 || iB == 2) {
            return pVar.f13660h;
        }
        if (iB == 3 || iB == 4) {
            return pVar.f13661i;
        }
        return null;
    }

    public final void c(f fVar, f fVar2, int i6, g gVar) {
        fVar.f13631l.add(fVar2);
        fVar.f13631l.add(this.f13657e);
        fVar.f13627h = i6;
        fVar.f13628i = gVar;
        fVar2.f13630k.add(fVar);
        gVar.f13630k.add(fVar);
    }

    public abstract void d();

    public abstract void e();

    public abstract void f();

    public final int g(int i6, int i7) {
        int iMax;
        if (i7 == 0) {
            C1437d c1437d = this.f13654b;
            int i8 = c1437d.f13403v;
            iMax = Math.max(c1437d.f13402u, i6);
            if (i8 > 0) {
                iMax = Math.min(i8, i6);
            }
            if (iMax == i6) {
                return i6;
            }
        } else {
            C1437d c1437d2 = this.f13654b;
            int i9 = c1437d2.f13406y;
            iMax = Math.max(c1437d2.f13405x, i6);
            if (i9 > 0) {
                iMax = Math.min(i9, i6);
            }
            if (iMax == i6) {
                return i6;
            }
        }
        return iMax;
    }

    public long j() {
        if (this.f13657e.f13629j) {
            return r0.f13626g;
        }
        return 0L;
    }

    public abstract boolean k();

    /* JADX WARN: Removed duplicated region for block: B:28:0x0054  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void l(w.C1436c r12, w.C1436c r13, int r14) {
        /*
            Method dump skipped, instruction units count: 221
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: x.p.l(w.c, w.c, int):void");
    }
}
