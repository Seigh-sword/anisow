package x;

import java.util.Iterator;
import w.C1434a;
import w.C1437d;

/* JADX INFO: loaded from: classes.dex */
public final class j extends p {
    @Override // x.d
    public final void a(d dVar) {
        C1434a c1434a = (C1434a) this.f13654b;
        int i6 = c1434a.f13310s0;
        f fVar = this.f13660h;
        Iterator it = fVar.f13631l.iterator();
        int i7 = 0;
        int i8 = -1;
        while (it.hasNext()) {
            int i9 = ((f) it.next()).f13626g;
            if (i8 == -1 || i9 < i8) {
                i8 = i9;
            }
            if (i7 < i9) {
                i7 = i9;
            }
        }
        if (i6 == 0 || i6 == 2) {
            fVar.d(i8 + c1434a.f13312u0);
        } else {
            fVar.d(i7 + c1434a.f13312u0);
        }
    }

    @Override // x.p
    public final void d() {
        p pVar;
        C1437d c1437d = this.f13654b;
        if (c1437d instanceof C1434a) {
            f fVar = this.f13660h;
            fVar.f13621b = true;
            C1434a c1434a = (C1434a) c1437d;
            int i6 = c1434a.f13310s0;
            boolean z5 = c1434a.f13311t0;
            int i7 = 0;
            if (i6 == 0) {
                fVar.f13624e = 4;
                while (i7 < c1434a.f13487r0) {
                    C1437d c1437d2 = c1434a.f13486q0[i7];
                    if (z5 || c1437d2.f13379g0 != 8) {
                        f fVar2 = c1437d2.f13372d.f13660h;
                        fVar2.f13630k.add(fVar);
                        fVar.f13631l.add(fVar2);
                    }
                    i7++;
                }
            } else {
                if (i6 != 1) {
                    if (i6 == 2) {
                        fVar.f13624e = 6;
                        while (i7 < c1434a.f13487r0) {
                            C1437d c1437d3 = c1434a.f13486q0[i7];
                            if (z5 || c1437d3.f13379g0 != 8) {
                                f fVar3 = c1437d3.f13374e.f13660h;
                                fVar3.f13630k.add(fVar);
                                fVar.f13631l.add(fVar3);
                            }
                            i7++;
                        }
                    } else {
                        if (i6 != 3) {
                            return;
                        }
                        fVar.f13624e = 7;
                        while (i7 < c1434a.f13487r0) {
                            C1437d c1437d4 = c1434a.f13486q0[i7];
                            if (z5 || c1437d4.f13379g0 != 8) {
                                f fVar4 = c1437d4.f13374e.f13661i;
                                fVar4.f13630k.add(fVar);
                                fVar.f13631l.add(fVar4);
                            }
                            i7++;
                        }
                    }
                    m(this.f13654b.f13374e.f13660h);
                    pVar = this.f13654b.f13374e;
                    m(pVar.f13661i);
                }
                fVar.f13624e = 5;
                while (i7 < c1434a.f13487r0) {
                    C1437d c1437d5 = c1434a.f13486q0[i7];
                    if (z5 || c1437d5.f13379g0 != 8) {
                        f fVar5 = c1437d5.f13372d.f13661i;
                        fVar5.f13630k.add(fVar);
                        fVar.f13631l.add(fVar5);
                    }
                    i7++;
                }
            }
            m(this.f13654b.f13372d.f13660h);
            pVar = this.f13654b.f13372d;
            m(pVar.f13661i);
        }
    }

    @Override // x.p
    public final void e() {
        C1437d c1437d = this.f13654b;
        if (c1437d instanceof C1434a) {
            int i6 = ((C1434a) c1437d).f13310s0;
            f fVar = this.f13660h;
            if (i6 == 0 || i6 == 1) {
                c1437d.f13364Y = fVar.f13626g;
            } else {
                c1437d.f13365Z = fVar.f13626g;
            }
        }
    }

    @Override // x.p
    public final void f() {
        this.f13655c = null;
        this.f13660h.c();
    }

    @Override // x.p
    public final boolean k() {
        return false;
    }

    public final void m(f fVar) {
        f fVar2 = this.f13660h;
        fVar2.f13630k.add(fVar);
        fVar.f13631l.add(fVar2);
    }
}
