package u;

import i.C0803c;
import java.util.Arrays;
import w.C1436c;

/* JADX INFO: loaded from: classes.dex */
public final class d {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static boolean f12774p = false;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static int f12775q = 1000;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final g f12778c;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public c[] f12781f;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final P0.h f12787l;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public c f12790o;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f12776a = false;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f12777b = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f12779d = 32;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f12780e = 32;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f12782g = false;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean[] f12783h = new boolean[32];

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f12784i = 1;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f12785j = 0;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f12786k = 32;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public i[] f12788m = new i[f12775q];

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f12789n = 0;

    public d() {
        this.f12781f = null;
        this.f12781f = new c[32];
        s();
        P0.h hVar = new P0.h(3);
        this.f12787l = hVar;
        g gVar = new g(hVar);
        gVar.f12796f = new i[128];
        gVar.f12797g = new i[128];
        gVar.f12798h = 0;
        gVar.f12799i = new C0803c(gVar, gVar);
        this.f12778c = gVar;
        this.f12790o = new c(hVar);
    }

    public static int n(C1436c c1436c) {
        i iVar = c1436c.f13339i;
        if (iVar != null) {
            return (int) (iVar.f12801A + 0.5f);
        }
        return 0;
    }

    public final i a(int i6) {
        i iVar = (i) ((e) this.f12787l.f2409c).h();
        if (iVar == null) {
            iVar = new i(i6);
        } else {
            iVar.c();
        }
        iVar.f12808H = i6;
        int i7 = this.f12789n;
        int i8 = f12775q;
        if (i7 >= i8) {
            int i9 = i8 * 2;
            f12775q = i9;
            this.f12788m = (i[]) Arrays.copyOf(this.f12788m, i9);
        }
        i[] iVarArr = this.f12788m;
        int i10 = this.f12789n;
        this.f12789n = i10 + 1;
        iVarArr[i10] = iVar;
        return iVar;
    }

    public final void b(i iVar, i iVar2, int i6, float f6, i iVar3, i iVar4, int i7, int i8) {
        int i9;
        float f7;
        c cVarL = l();
        if (iVar2 == iVar3) {
            cVarL.f12772d.e(iVar, 1.0f);
            cVarL.f12772d.e(iVar4, 1.0f);
            cVarL.f12772d.e(iVar2, -2.0f);
        } else {
            if (f6 == 0.5f) {
                cVarL.f12772d.e(iVar, 1.0f);
                cVarL.f12772d.e(iVar2, -1.0f);
                cVarL.f12772d.e(iVar3, -1.0f);
                cVarL.f12772d.e(iVar4, 1.0f);
                if (i6 > 0 || i7 > 0) {
                    i9 = (-i6) + i7;
                    f7 = i9;
                }
            } else if (f6 <= 0.0f) {
                cVarL.f12772d.e(iVar, -1.0f);
                cVarL.f12772d.e(iVar2, 1.0f);
                f7 = i6;
            } else if (f6 >= 1.0f) {
                cVarL.f12772d.e(iVar4, -1.0f);
                cVarL.f12772d.e(iVar3, 1.0f);
                i9 = -i7;
                f7 = i9;
            } else {
                float f8 = 1.0f - f6;
                cVarL.f12772d.e(iVar, f8 * 1.0f);
                cVarL.f12772d.e(iVar2, f8 * (-1.0f));
                cVarL.f12772d.e(iVar3, (-1.0f) * f6);
                cVarL.f12772d.e(iVar4, 1.0f * f6);
                if (i6 > 0 || i7 > 0) {
                    cVarL.f12770b = (i7 * f6) + ((-i6) * f8);
                }
            }
            cVarL.f12770b = f7;
        }
        if (i8 != 8) {
            cVarL.a(this, i8);
        }
        c(cVarL);
    }

    /* JADX WARN: Removed duplicated region for block: B:115:0x0195  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x019a  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x01a7 A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00de  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void c(u.c r17) {
        /*
            Method dump skipped, instruction units count: 428
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: u.d.c(u.c):void");
    }

    public final void d(i iVar, int i6) {
        c cVarL;
        InterfaceC1355b interfaceC1355b;
        float f6;
        int i7 = iVar.f12811y;
        if (i7 == -1) {
            iVar.d(this, i6);
            for (int i8 = 0; i8 < this.f12777b + 1; i8++) {
                i iVar2 = ((i[]) this.f12787l.f2410d)[i8];
            }
            return;
        }
        if (i7 != -1) {
            c cVar = this.f12781f[i7];
            if (!cVar.f12773e) {
                if (cVar.f12772d.k() == 0) {
                    cVar.f12773e = true;
                } else {
                    cVarL = l();
                    if (i6 < 0) {
                        cVarL.f12770b = i6 * (-1);
                        interfaceC1355b = cVarL.f12772d;
                        f6 = 1.0f;
                    } else {
                        cVarL.f12770b = i6;
                        interfaceC1355b = cVarL.f12772d;
                        f6 = -1.0f;
                    }
                    interfaceC1355b.e(iVar, f6);
                }
            }
            cVar.f12770b = i6;
            return;
        }
        cVarL = l();
        cVarL.f12769a = iVar;
        float f7 = i6;
        iVar.f12801A = f7;
        cVarL.f12770b = f7;
        cVarL.f12773e = true;
        c(cVarL);
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0037  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void e(u.i r6, u.i r7, int r8, int r9) {
        /*
            r5 = this;
            r0 = 8
            if (r9 != r0) goto L15
            boolean r1 = r7.f12802B
            if (r1 == 0) goto L15
            int r1 = r6.f12811y
            r2 = -1
            if (r1 != r2) goto L15
            float r7 = r7.f12801A
            float r8 = (float) r8
            float r7 = r7 + r8
            r6.d(r5, r7)
            return
        L15:
            u.c r1 = r5.l()
            r2 = 1065353216(0x3f800000, float:1.0)
            r3 = -1082130432(0xffffffffbf800000, float:-1.0)
            if (r8 == 0) goto L37
            if (r8 >= 0) goto L25
            int r8 = r8 * (-1)
            r4 = 1
            goto L26
        L25:
            r4 = 0
        L26:
            float r8 = (float) r8
            r1.f12770b = r8
            if (r4 != 0) goto L2c
            goto L37
        L2c:
            u.b r8 = r1.f12772d
            r8.e(r6, r2)
            u.b r6 = r1.f12772d
            r6.e(r7, r3)
            goto L41
        L37:
            u.b r8 = r1.f12772d
            r8.e(r6, r3)
            u.b r6 = r1.f12772d
            r6.e(r7, r2)
        L41:
            if (r9 == r0) goto L46
            r1.a(r5, r9)
        L46:
            r5.c(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: u.d.e(u.i, u.i, int, int):void");
    }

    public final void f(i iVar, i iVar2, int i6, int i7) {
        c cVarL = l();
        i iVarM = m();
        iVarM.f12812z = 0;
        cVarL.b(iVar, iVar2, iVarM, i6);
        if (i7 != 8) {
            cVarL.f12772d.e(j(i7), (int) (cVarL.f12772d.d(iVarM) * (-1.0f)));
        }
        c(cVarL);
    }

    public final void g(i iVar, i iVar2, int i6, int i7) {
        c cVarL = l();
        i iVarM = m();
        iVarM.f12812z = 0;
        cVarL.c(iVar, iVar2, iVarM, i6);
        if (i7 != 8) {
            cVarL.f12772d.e(j(i7), (int) (cVarL.f12772d.d(iVarM) * (-1.0f)));
        }
        c(cVarL);
    }

    public final void h(c cVar) {
        int i6;
        if (cVar.f12773e) {
            cVar.f12769a.d(this, cVar.f12770b);
        } else {
            c[] cVarArr = this.f12781f;
            int i7 = this.f12785j;
            cVarArr[i7] = cVar;
            i iVar = cVar.f12769a;
            iVar.f12811y = i7;
            this.f12785j = i7 + 1;
            iVar.e(this, cVar);
        }
        if (this.f12776a) {
            int i8 = 0;
            while (i8 < this.f12785j) {
                if (this.f12781f[i8] == null) {
                    System.out.println("WTF");
                }
                c cVar2 = this.f12781f[i8];
                if (cVar2 != null && cVar2.f12773e) {
                    cVar2.f12769a.d(this, cVar2.f12770b);
                    ((e) this.f12787l.f2408b).d(cVar2);
                    this.f12781f[i8] = null;
                    int i9 = i8 + 1;
                    int i10 = i9;
                    while (true) {
                        i6 = this.f12785j;
                        if (i9 >= i6) {
                            break;
                        }
                        c[] cVarArr2 = this.f12781f;
                        int i11 = i9 - 1;
                        c cVar3 = cVarArr2[i9];
                        cVarArr2[i11] = cVar3;
                        i iVar2 = cVar3.f12769a;
                        if (iVar2.f12811y == i9) {
                            iVar2.f12811y = i11;
                        }
                        i10 = i9;
                        i9++;
                    }
                    if (i10 < i6) {
                        this.f12781f[i10] = null;
                    }
                    this.f12785j = i6 - 1;
                    i8--;
                }
                i8++;
            }
            this.f12776a = false;
        }
    }

    public final void i() {
        for (int i6 = 0; i6 < this.f12785j; i6++) {
            c cVar = this.f12781f[i6];
            cVar.f12769a.f12801A = cVar.f12770b;
        }
    }

    public final i j(int i6) {
        if (this.f12784i + 1 >= this.f12780e) {
            o();
        }
        i iVarA = a(4);
        int i7 = this.f12777b + 1;
        this.f12777b = i7;
        this.f12784i++;
        iVarA.f12810x = i7;
        iVarA.f12812z = i6;
        ((i[]) this.f12787l.f2410d)[i7] = iVarA;
        g gVar = this.f12778c;
        gVar.f12799i.f9277x = iVarA;
        float[] fArr = iVarA.f12804D;
        Arrays.fill(fArr, 0.0f);
        fArr[iVarA.f12812z] = 1.0f;
        gVar.j(iVarA);
        return iVarA;
    }

    public final i k(Object obj) {
        i iVar = null;
        if (obj == null) {
            return null;
        }
        if (this.f12784i + 1 >= this.f12780e) {
            o();
        }
        if (obj instanceof C1436c) {
            C1436c c1436c = (C1436c) obj;
            iVar = c1436c.f13339i;
            if (iVar == null) {
                c1436c.k();
                iVar = c1436c.f13339i;
            }
            int i6 = iVar.f12810x;
            P0.h hVar = this.f12787l;
            if (i6 == -1 || i6 > this.f12777b || ((i[]) hVar.f2410d)[i6] == null) {
                if (i6 != -1) {
                    iVar.c();
                }
                int i7 = this.f12777b + 1;
                this.f12777b = i7;
                this.f12784i++;
                iVar.f12810x = i7;
                iVar.f12808H = 1;
                ((i[]) hVar.f2410d)[i7] = iVar;
            }
        }
        return iVar;
    }

    public final c l() {
        P0.h hVar = this.f12787l;
        c cVar = (c) ((e) hVar.f2408b).h();
        if (cVar == null) {
            return new c(hVar);
        }
        cVar.f12769a = null;
        cVar.f12772d.clear();
        cVar.f12770b = 0.0f;
        cVar.f12773e = false;
        return cVar;
    }

    public final i m() {
        if (this.f12784i + 1 >= this.f12780e) {
            o();
        }
        i iVarA = a(3);
        int i6 = this.f12777b + 1;
        this.f12777b = i6;
        this.f12784i++;
        iVarA.f12810x = i6;
        ((i[]) this.f12787l.f2410d)[i6] = iVarA;
        return iVarA;
    }

    public final void o() {
        int i6 = this.f12779d * 2;
        this.f12779d = i6;
        this.f12781f = (c[]) Arrays.copyOf(this.f12781f, i6);
        P0.h hVar = this.f12787l;
        hVar.f2410d = (i[]) Arrays.copyOf((i[]) hVar.f2410d, this.f12779d);
        int i7 = this.f12779d;
        this.f12783h = new boolean[i7];
        this.f12780e = i7;
        this.f12786k = i7;
    }

    public final void p() {
        g gVar = this.f12778c;
        if (gVar.e()) {
            i();
            return;
        }
        if (this.f12782g) {
            for (int i6 = 0; i6 < this.f12785j; i6++) {
                if (this.f12781f[i6].f12773e) {
                }
            }
            i();
            return;
        }
        q(gVar);
    }

    public final void q(g gVar) {
        int i6 = 0;
        while (true) {
            if (i6 >= this.f12785j) {
                break;
            }
            c cVar = this.f12781f[i6];
            int i7 = 1;
            if (cVar.f12769a.f12808H != 1) {
                float f6 = 0.0f;
                if (cVar.f12770b < 0.0f) {
                    boolean z5 = false;
                    int i8 = 0;
                    while (!z5) {
                        i8 += i7;
                        float f7 = Float.MAX_VALUE;
                        int i9 = -1;
                        int i10 = -1;
                        int i11 = 0;
                        int i12 = 0;
                        while (i11 < this.f12785j) {
                            c cVar2 = this.f12781f[i11];
                            if (cVar2.f12769a.f12808H != i7 && !cVar2.f12773e && cVar2.f12770b < f6) {
                                int iK = cVar2.f12772d.k();
                                int i13 = 0;
                                while (i13 < iK) {
                                    i iVarF = cVar2.f12772d.f(i13);
                                    float fD = cVar2.f12772d.d(iVarF);
                                    if (fD > f6) {
                                        for (int i14 = 0; i14 < 9; i14++) {
                                            float f8 = iVarF.f12803C[i14] / fD;
                                            if ((f8 < f7 && i14 == i12) || i14 > i12) {
                                                i12 = i14;
                                                i10 = iVarF.f12810x;
                                                i9 = i11;
                                                f7 = f8;
                                            }
                                        }
                                    }
                                    i13++;
                                    f6 = 0.0f;
                                }
                            }
                            i11++;
                            f6 = 0.0f;
                            i7 = 1;
                        }
                        if (i9 != -1) {
                            c cVar3 = this.f12781f[i9];
                            cVar3.f12769a.f12811y = -1;
                            cVar3.g(((i[]) this.f12787l.f2410d)[i10]);
                            i iVar = cVar3.f12769a;
                            iVar.f12811y = i9;
                            iVar.e(this, cVar3);
                        } else {
                            z5 = true;
                        }
                        if (i8 > this.f12784i / 2) {
                            z5 = true;
                        }
                        f6 = 0.0f;
                        i7 = 1;
                    }
                }
            }
            i6++;
        }
        r(gVar);
        i();
    }

    public final void r(c cVar) {
        for (int i6 = 0; i6 < this.f12784i; i6++) {
            this.f12783h[i6] = false;
        }
        boolean z5 = false;
        int i7 = 0;
        while (!z5) {
            i7++;
            if (i7 >= this.f12784i * 2) {
                return;
            }
            i iVar = cVar.f12769a;
            if (iVar != null) {
                this.f12783h[iVar.f12810x] = true;
            }
            i iVarD = cVar.d(this.f12783h);
            if (iVarD != null) {
                boolean[] zArr = this.f12783h;
                int i8 = iVarD.f12810x;
                if (zArr[i8]) {
                    return;
                } else {
                    zArr[i8] = true;
                }
            }
            if (iVarD != null) {
                float f6 = Float.MAX_VALUE;
                int i9 = -1;
                for (int i10 = 0; i10 < this.f12785j; i10++) {
                    c cVar2 = this.f12781f[i10];
                    if (cVar2.f12769a.f12808H != 1 && !cVar2.f12773e && cVar2.f12772d.b(iVarD)) {
                        float fD = cVar2.f12772d.d(iVarD);
                        if (fD < 0.0f) {
                            float f7 = (-cVar2.f12770b) / fD;
                            if (f7 < f6) {
                                i9 = i10;
                                f6 = f7;
                            }
                        }
                    }
                }
                if (i9 > -1) {
                    c cVar3 = this.f12781f[i9];
                    cVar3.f12769a.f12811y = -1;
                    cVar3.g(iVarD);
                    i iVar2 = cVar3.f12769a;
                    iVar2.f12811y = i9;
                    iVar2.e(this, cVar3);
                }
            } else {
                z5 = true;
            }
        }
    }

    public final void s() {
        for (int i6 = 0; i6 < this.f12785j; i6++) {
            c cVar = this.f12781f[i6];
            if (cVar != null) {
                ((e) this.f12787l.f2408b).d(cVar);
            }
            this.f12781f[i6] = null;
        }
    }

    public final void t() {
        P0.h hVar;
        int i6 = 0;
        while (true) {
            hVar = this.f12787l;
            i[] iVarArr = (i[]) hVar.f2410d;
            if (i6 >= iVarArr.length) {
                break;
            }
            i iVar = iVarArr[i6];
            if (iVar != null) {
                iVar.c();
            }
            i6++;
        }
        e eVar = (e) hVar.f2409c;
        i[] iVarArr2 = this.f12788m;
        int length = this.f12789n;
        eVar.getClass();
        if (length > iVarArr2.length) {
            length = iVarArr2.length;
        }
        for (int i7 = 0; i7 < length; i7++) {
            i iVar2 = iVarArr2[i7];
            int i8 = eVar.f12793y;
            Object[] objArr = eVar.f12792x;
            if (i8 < objArr.length) {
                objArr[i8] = iVar2;
                eVar.f12793y = i8 + 1;
            }
        }
        this.f12789n = 0;
        Arrays.fill((i[]) hVar.f2410d, (Object) null);
        this.f12777b = 0;
        g gVar = this.f12778c;
        gVar.f12798h = 0;
        gVar.f12770b = 0.0f;
        this.f12784i = 1;
        for (int i9 = 0; i9 < this.f12785j; i9++) {
            c cVar = this.f12781f[i9];
        }
        s();
        this.f12785j = 0;
        this.f12790o = new c(hVar);
    }
}
