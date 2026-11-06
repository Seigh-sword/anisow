package w;

import d.AbstractC0628i;

/* JADX INFO: renamed from: w.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1434a extends AbstractC1443j {

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public int f13310s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public boolean f13311t0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public int f13312u0;

    /* JADX INFO: renamed from: v0, reason: collision with root package name */
    public boolean f13313v0;

    @Override // w.C1437d
    public final boolean B() {
        return this.f13313v0;
    }

    @Override // w.C1437d
    public final boolean C() {
        return this.f13313v0;
    }

    public final boolean T() {
        int i6;
        C1436c c1436cJ;
        C1436c c1436cJ2;
        C1436c c1436cJ3;
        int i7;
        int i8;
        boolean z5 = true;
        int i9 = 0;
        while (true) {
            i6 = this.f13487r0;
            if (i9 >= i6) {
                break;
            }
            C1437d c1437d = this.f13486q0[i9];
            if ((this.f13311t0 || c1437d.d()) && ((((i7 = this.f13310s0) == 0 || i7 == 1) && !c1437d.B()) || (((i8 = this.f13310s0) == 2 || i8 == 3) && !c1437d.C()))) {
                z5 = false;
            }
            i9++;
        }
        if (!z5 || i6 <= 0) {
            return false;
        }
        int iMax = 0;
        boolean z6 = false;
        for (int i10 = 0; i10 < this.f13487r0; i10++) {
            C1437d c1437d2 = this.f13486q0[i10];
            if (this.f13311t0 || c1437d2.d()) {
                if (!z6) {
                    int i11 = this.f13310s0;
                    if (i11 == 0) {
                        c1436cJ3 = c1437d2.j(2);
                    } else if (i11 == 1) {
                        c1436cJ3 = c1437d2.j(4);
                    } else if (i11 == 2) {
                        c1436cJ3 = c1437d2.j(3);
                    } else {
                        if (i11 == 3) {
                            c1436cJ3 = c1437d2.j(5);
                        }
                        z6 = true;
                    }
                    iMax = c1436cJ3.d();
                    z6 = true;
                }
                int i12 = this.f13310s0;
                if (i12 == 0) {
                    c1436cJ2 = c1437d2.j(2);
                } else {
                    if (i12 == 1) {
                        c1436cJ = c1437d2.j(4);
                    } else if (i12 == 2) {
                        c1436cJ2 = c1437d2.j(3);
                    } else if (i12 == 3) {
                        c1436cJ = c1437d2.j(5);
                    }
                    iMax = Math.max(iMax, c1436cJ.d());
                }
                iMax = Math.min(iMax, c1436cJ2.d());
            }
        }
        int i13 = iMax + this.f13312u0;
        int i14 = this.f13310s0;
        if (i14 == 0 || i14 == 1) {
            K(i13, i13);
        } else {
            L(i13, i13);
        }
        this.f13313v0 = true;
        return true;
    }

    public final int U() {
        int i6 = this.f13310s0;
        if (i6 == 0 || i6 == 1) {
            return 0;
        }
        return (i6 == 2 || i6 == 3) ? 1 : -1;
    }

    @Override // w.C1437d
    public final void c(u.d dVar, boolean z5) {
        boolean z6;
        u.i iVar;
        C1436c c1436c;
        int i6;
        int i7;
        u.i iVar2;
        int i8;
        C1436c[] c1436cArr = this.f13356Q;
        C1436c c1436c2 = this.f13348I;
        c1436cArr[0] = c1436c2;
        C1436c c1436c3 = this.f13349J;
        int i9 = 2;
        c1436cArr[2] = c1436c3;
        C1436c c1436c4 = this.f13350K;
        c1436cArr[1] = c1436c4;
        C1436c c1436c5 = this.f13351L;
        c1436cArr[3] = c1436c5;
        for (C1436c c1436c6 : c1436cArr) {
            c1436c6.f13339i = dVar.k(c1436c6);
        }
        int i10 = this.f13310s0;
        if (i10 < 0 || i10 >= 4) {
            return;
        }
        C1436c c1436c7 = c1436cArr[i10];
        if (!this.f13313v0) {
            T();
        }
        if (this.f13313v0) {
            this.f13313v0 = false;
            int i11 = this.f13310s0;
            if (i11 == 0 || i11 == 1) {
                dVar.d(c1436c2.f13339i, this.f13364Y);
                iVar2 = c1436c4.f13339i;
                i8 = this.f13364Y;
            } else {
                if (i11 != 2 && i11 != 3) {
                    return;
                }
                dVar.d(c1436c3.f13339i, this.f13365Z);
                iVar2 = c1436c5.f13339i;
                i8 = this.f13365Z;
            }
            dVar.d(iVar2, i8);
            return;
        }
        for (int i12 = 0; i12 < this.f13487r0; i12++) {
            C1437d c1437d = this.f13486q0[i12];
            if ((this.f13311t0 || c1437d.d()) && ((((i7 = this.f13310s0) == 0 || i7 == 1) && c1437d.f13397p0[0] == 3 && c1437d.f13348I.f13336f != null && c1437d.f13350K.f13336f != null) || ((i7 == 2 || i7 == 3) && c1437d.f13397p0[1] == 3 && c1437d.f13349J.f13336f != null && c1437d.f13351L.f13336f != null))) {
                z6 = true;
                break;
            }
        }
        z6 = false;
        boolean z7 = c1436c2.g() || c1436c4.g();
        boolean z8 = c1436c3.g() || c1436c5.g();
        int i13 = (z6 || !(((i6 = this.f13310s0) == 0 && z7) || ((i6 == 2 && z8) || ((i6 == 1 && z7) || (i6 == 3 && z8))))) ? 4 : 5;
        int i14 = 0;
        while (i14 < this.f13487r0) {
            C1437d c1437d2 = this.f13486q0[i14];
            if (this.f13311t0 || c1437d2.d()) {
                u.i iVarK = dVar.k(c1437d2.f13356Q[this.f13310s0]);
                int i15 = this.f13310s0;
                C1436c c1436c8 = c1437d2.f13356Q[i15];
                c1436c8.f13339i = iVarK;
                C1436c c1436c9 = c1436c8.f13336f;
                int i16 = (c1436c9 == null || c1436c9.f13334d != this) ? 0 : c1436c8.f13337g;
                if (i15 == 0 || i15 == i9) {
                    u.i iVar3 = c1436c7.f13339i;
                    int i17 = this.f13312u0 - i16;
                    u.c cVarL = dVar.l();
                    u.i iVarM = dVar.m();
                    iVarM.f12812z = 0;
                    cVarL.c(iVar3, iVarK, iVarM, i17);
                    dVar.c(cVarL);
                } else {
                    u.i iVar4 = c1436c7.f13339i;
                    int i18 = this.f13312u0 + i16;
                    u.c cVarL2 = dVar.l();
                    u.i iVarM2 = dVar.m();
                    iVarM2.f12812z = 0;
                    cVarL2.b(iVar4, iVarK, iVarM2, i18);
                    dVar.c(cVarL2);
                }
                dVar.e(c1436c7.f13339i, iVarK, this.f13312u0 + i16, i13);
            }
            i14++;
            i9 = 2;
        }
        int i19 = this.f13310s0;
        if (i19 == 0) {
            dVar.e(c1436c4.f13339i, c1436c2.f13339i, 0, 8);
            dVar.e(c1436c2.f13339i, this.f13359T.f13350K.f13339i, 0, 4);
            iVar = c1436c2.f13339i;
            c1436c = this.f13359T.f13348I;
        } else if (i19 == 1) {
            dVar.e(c1436c2.f13339i, c1436c4.f13339i, 0, 8);
            dVar.e(c1436c2.f13339i, this.f13359T.f13348I.f13339i, 0, 4);
            iVar = c1436c2.f13339i;
            c1436c = this.f13359T.f13350K;
        } else if (i19 == 2) {
            dVar.e(c1436c5.f13339i, c1436c3.f13339i, 0, 8);
            dVar.e(c1436c3.f13339i, this.f13359T.f13351L.f13339i, 0, 4);
            iVar = c1436c3.f13339i;
            c1436c = this.f13359T.f13349J;
        } else {
            if (i19 != 3) {
                return;
            }
            dVar.e(c1436c3.f13339i, c1436c5.f13339i, 0, 8);
            dVar.e(c1436c3.f13339i, this.f13359T.f13349J.f13339i, 0, 4);
            iVar = c1436c3.f13339i;
            c1436c = this.f13359T.f13351L;
        }
        dVar.e(iVar, c1436c.f13339i, 0, 0);
    }

    @Override // w.C1437d
    public final boolean d() {
        return true;
    }

    @Override // w.C1437d
    public final String toString() {
        String strM = AbstractC0628i.m(new StringBuilder("[Barrier] "), this.f13381h0, " {");
        for (int i6 = 0; i6 < this.f13487r0; i6++) {
            C1437d c1437d = this.f13486q0[i6];
            if (i6 > 0) {
                strM = AbstractC0628i.i(strM, ", ");
            }
            strM = strM + c1437d.f13381h0;
        }
        return AbstractC0628i.i(strM, "}");
    }
}
