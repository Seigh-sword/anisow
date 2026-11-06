package x;

import w.C1437d;

/* JADX INFO: loaded from: classes.dex */
public final class m extends p {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public f f13637k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public C1483a f13638l;

    @Override // x.d
    public final void a(d dVar) {
        float f6;
        int i6;
        float f7;
        if (u.h.b(this.f13662j) == 3) {
            C1437d c1437d = this.f13654b;
            l(c1437d.f13349J, c1437d.f13351L, 1);
            return;
        }
        g gVar = this.f13657e;
        if (gVar.f13622c && !gVar.f13629j && this.f13656d == 3) {
            C1437d c1437d2 = this.f13654b;
            int i7 = c1437d2.f13400s;
            if (i7 == 2) {
                C1437d c1437d3 = c1437d2.f13359T;
                if (c1437d3 != null) {
                    if (c1437d3.f13374e.f13657e.f13629j) {
                        f6 = r5.f13626g * c1437d2.f13407z;
                        i6 = (int) (f6 + 0.5f);
                    }
                }
            } else if (i7 == 3) {
                g gVar2 = c1437d2.f13372d.f13657e;
                if (gVar2.f13629j) {
                    int i8 = c1437d2.f13363X;
                    if (i8 == -1) {
                        f7 = gVar2.f13626g;
                    } else if (i8 == 0) {
                        f6 = gVar2.f13626g * c1437d2.f13362W;
                        i6 = (int) (f6 + 0.5f);
                    } else if (i8 != 1) {
                        i6 = 0;
                    } else {
                        f7 = gVar2.f13626g;
                    }
                    f6 = f7 / c1437d2.f13362W;
                    i6 = (int) (f6 + 0.5f);
                }
            }
            gVar.d(i6);
        }
        f fVar = this.f13660h;
        if (fVar.f13622c) {
            f fVar2 = this.f13661i;
            if (fVar2.f13622c) {
                if (fVar.f13629j && fVar2.f13629j && gVar.f13629j) {
                    return;
                }
                if (!gVar.f13629j && this.f13656d == 3) {
                    C1437d c1437d4 = this.f13654b;
                    if (c1437d4.f13399r == 0 && !c1437d4.z()) {
                        f fVar3 = (f) fVar.f13631l.get(0);
                        f fVar4 = (f) fVar2.f13631l.get(0);
                        int i9 = fVar3.f13626g + fVar.f13625f;
                        int i10 = fVar4.f13626g + fVar2.f13625f;
                        fVar.d(i9);
                        fVar2.d(i10);
                        gVar.d(i10 - i9);
                        return;
                    }
                }
                if (!gVar.f13629j && this.f13656d == 3 && this.f13653a == 1 && fVar.f13631l.size() > 0 && fVar2.f13631l.size() > 0) {
                    f fVar5 = (f) fVar.f13631l.get(0);
                    int i11 = (((f) fVar2.f13631l.get(0)).f13626g + fVar2.f13625f) - (fVar5.f13626g + fVar.f13625f);
                    int i12 = gVar.f13632m;
                    if (i11 < i12) {
                        gVar.d(i11);
                    } else {
                        gVar.d(i12);
                    }
                }
                if (gVar.f13629j && fVar.f13631l.size() > 0 && fVar2.f13631l.size() > 0) {
                    f fVar6 = (f) fVar.f13631l.get(0);
                    f fVar7 = (f) fVar2.f13631l.get(0);
                    int i13 = fVar6.f13626g;
                    int i14 = fVar.f13625f + i13;
                    int i15 = fVar7.f13626g;
                    int i16 = fVar2.f13625f + i15;
                    float f8 = this.f13654b.f13375e0;
                    if (fVar6 == fVar7) {
                        f8 = 0.5f;
                    } else {
                        i13 = i14;
                        i15 = i16;
                    }
                    fVar.d((int) ((((i15 - i13) - gVar.f13626g) * f8) + i13 + 0.5f));
                    fVar2.d(fVar.f13626g + gVar.f13626g);
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:112:0x025d  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x030c A[PHI: r0
      0x030c: PHI (r0v22 x.k) = (r0v15 x.k), (r0v31 x.k) binds: [B:151:0x030a, B:125:0x0298] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // x.p
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void d() {
        /*
            Method dump skipped, instruction units count: 811
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: x.m.d():void");
    }

    @Override // x.p
    public final void e() {
        f fVar = this.f13660h;
        if (fVar.f13629j) {
            this.f13654b.f13365Z = fVar.f13626g;
        }
    }

    @Override // x.p
    public final void f() {
        this.f13655c = null;
        this.f13660h.c();
        this.f13661i.c();
        this.f13637k.c();
        this.f13657e.c();
        this.f13659g = false;
    }

    @Override // x.p
    public final boolean k() {
        return this.f13656d != 3 || this.f13654b.f13400s == 0;
    }

    public final void m() {
        this.f13659g = false;
        f fVar = this.f13660h;
        fVar.c();
        fVar.f13629j = false;
        f fVar2 = this.f13661i;
        fVar2.c();
        fVar2.f13629j = false;
        f fVar3 = this.f13637k;
        fVar3.c();
        fVar3.f13629j = false;
        this.f13657e.f13629j = false;
    }

    public final String toString() {
        return "VerticalRun " + this.f13654b.f13381h0;
    }
}
