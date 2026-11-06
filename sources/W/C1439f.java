package w;

/* JADX INFO: renamed from: w.f, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1439f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f13428a;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public C1436c f13431d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public C1436c f13432e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public C1436c f13433f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public C1436c f13434g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f13435h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f13436i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f13437j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f13438k;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f13444q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ C1440g f13445r;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public C1437d f13429b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f13430c = 0;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f13439l = 0;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f13440m = 0;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f13441n = 0;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f13442o = 0;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f13443p = 0;

    public C1439f(C1440g c1440g, int i6, C1436c c1436c, C1436c c1436c2, C1436c c1436c3, C1436c c1436c4, int i7) {
        this.f13445r = c1440g;
        this.f13435h = 0;
        this.f13436i = 0;
        this.f13437j = 0;
        this.f13438k = 0;
        this.f13444q = 0;
        this.f13428a = i6;
        this.f13431d = c1436c;
        this.f13432e = c1436c2;
        this.f13433f = c1436c3;
        this.f13434g = c1436c4;
        this.f13435h = c1440g.f13476w0;
        this.f13436i = c1440g.f13472s0;
        this.f13437j = c1440g.f13477x0;
        this.f13438k = c1440g.f13473t0;
        this.f13444q = i7;
    }

    public final void a(C1437d c1437d) {
        int i6 = this.f13428a;
        C1440g c1440g = this.f13445r;
        if (i6 == 0) {
            int iU = c1440g.U(this.f13444q, c1437d);
            if (c1437d.f13397p0[0] == 3) {
                this.f13443p++;
                iU = 0;
            }
            this.f13439l = iU + (c1437d.f13379g0 != 8 ? c1440g.f13460P0 : 0) + this.f13439l;
            int iT = c1440g.T(this.f13444q, c1437d);
            if (this.f13429b == null || this.f13430c < iT) {
                this.f13429b = c1437d;
                this.f13430c = iT;
                this.f13440m = iT;
            }
        } else {
            int iU2 = c1440g.U(this.f13444q, c1437d);
            int iT2 = c1440g.T(this.f13444q, c1437d);
            if (c1437d.f13397p0[1] == 3) {
                this.f13443p++;
                iT2 = 0;
            }
            this.f13440m = iT2 + (c1437d.f13379g0 != 8 ? c1440g.f13461Q0 : 0) + this.f13440m;
            if (this.f13429b == null || this.f13430c < iU2) {
                this.f13429b = c1437d;
                this.f13430c = iU2;
                this.f13439l = iU2;
            }
        }
        this.f13442o++;
    }

    public final void b(int i6, boolean z5, boolean z6) {
        C1440g c1440g;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        C1437d c1437d;
        int i12;
        char c6;
        int i13;
        int i14;
        float f6;
        float f7;
        int i15;
        float f8;
        int i16;
        int i17 = this.f13442o;
        int i18 = 0;
        while (true) {
            c1440g = this.f13445r;
            if (i18 >= i17 || (i16 = this.f13441n + i18) >= c1440g.b1) {
                break;
            }
            C1437d c1437d2 = c1440g.f13471a1[i16];
            if (c1437d2 != null) {
                c1437d2.E();
            }
            i18++;
        }
        if (i17 == 0 || this.f13429b == null) {
            return;
        }
        boolean z7 = z6 && i6 == 0;
        int i19 = -1;
        int i20 = -1;
        for (int i21 = 0; i21 < i17; i21++) {
            int i22 = this.f13441n + (z5 ? (i17 - 1) - i21 : i21);
            if (i22 >= c1440g.b1) {
                break;
            }
            C1437d c1437d3 = c1440g.f13471a1[i22];
            if (c1437d3 != null && c1437d3.f13379g0 == 0) {
                if (i19 == -1) {
                    i19 = i21;
                }
                i20 = i21;
            }
        }
        if (this.f13428a != 0) {
            C1437d c1437d4 = this.f13429b;
            c1437d4.f13383i0 = c1440g.f13449D0;
            int i23 = this.f13435h;
            if (i6 > 0) {
                i23 += c1440g.f13460P0;
            }
            C1436c c1436c = c1437d4.f13348I;
            C1436c c1436c2 = c1437d4.f13350K;
            if (z5) {
                c1436c2.a(this.f13433f, i23);
                if (z6) {
                    c1436c.a(this.f13431d, this.f13437j);
                }
                if (i6 > 0) {
                    this.f13433f.f13334d.f13348I.a(c1436c2, 0);
                }
            } else {
                c1436c.a(this.f13431d, i23);
                if (z6) {
                    c1436c2.a(this.f13433f, this.f13437j);
                }
                if (i6 > 0) {
                    this.f13431d.f13334d.f13350K.a(c1436c, 0);
                }
            }
            C1437d c1437d5 = null;
            for (int i24 = 0; i24 < i17; i24++) {
                int i25 = this.f13441n + i24;
                if (i25 >= c1440g.b1) {
                    return;
                }
                C1437d c1437d6 = c1440g.f13471a1[i25];
                if (c1437d6 != null) {
                    C1436c c1436c3 = c1437d6.f13349J;
                    if (i24 == 0) {
                        c1437d6.g(c1436c3, this.f13432e, this.f13436i);
                        int i26 = c1440g.E0;
                        float f9 = c1440g.f13455K0;
                        if (this.f13441n == 0) {
                            i11 = c1440g.f13451G0;
                            i9 = i26;
                            i10 = -1;
                            if (i11 != -1) {
                                f9 = c1440g.f13457M0;
                            }
                            c1437d6.f13385j0 = i11;
                            c1437d6.f13375e0 = f9;
                        } else {
                            i9 = i26;
                            i10 = -1;
                        }
                        if (!z6 || (i11 = c1440g.f13453I0) == i10) {
                            i11 = i9;
                        } else {
                            f9 = c1440g.f13459O0;
                        }
                        c1437d6.f13385j0 = i11;
                        c1437d6.f13375e0 = f9;
                    }
                    if (i24 == i17 - 1) {
                        c1437d6.g(c1437d6.f13351L, this.f13434g, this.f13438k);
                    }
                    if (c1437d5 != null) {
                        int i27 = c1440g.f13461Q0;
                        C1436c c1436c4 = c1437d5.f13351L;
                        c1436c3.a(c1436c4, i27);
                        if (i24 == i19) {
                            int i28 = this.f13436i;
                            if (c1436c3.h()) {
                                c1436c3.f13338h = i28;
                            }
                        }
                        c1436c4.a(c1436c3, 0);
                        if (i24 == i20 + 1) {
                            int i29 = this.f13438k;
                            if (c1436c4.h()) {
                                c1436c4.f13338h = i29;
                            }
                        }
                    }
                    if (c1437d6 != c1437d4) {
                        C1436c c1436c5 = c1437d6.f13350K;
                        C1436c c1436c6 = c1437d6.f13348I;
                        if (z5) {
                            int i30 = c1440g.f13462R0;
                            if (i30 != 0) {
                                if (i30 == 1) {
                                    c1436c6.a(c1436c, 0);
                                } else if (i30 == 2) {
                                    i8 = 0;
                                    c1436c6.a(c1436c, 0);
                                }
                                c1437d5 = c1437d6;
                            } else {
                                i8 = 0;
                            }
                            c1436c5.a(c1436c2, i8);
                            c1437d5 = c1437d6;
                        } else {
                            int i31 = c1440g.f13462R0;
                            if (i31 != 0) {
                                if (i31 == 1) {
                                    i7 = 0;
                                } else if (i31 == 2) {
                                    if (z7) {
                                        c1436c6.a(this.f13431d, this.f13435h);
                                        c1436c5.a(this.f13433f, this.f13437j);
                                    } else {
                                        i7 = 0;
                                        c1436c6.a(c1436c, 0);
                                    }
                                }
                                c1436c5.a(c1436c2, i7);
                            } else {
                                c1436c6.a(c1436c, 0);
                            }
                            c1437d5 = c1437d6;
                        }
                    } else {
                        c1437d5 = c1437d6;
                    }
                }
            }
            return;
        }
        C1437d c1437d7 = this.f13429b;
        c1437d7.f13385j0 = c1440g.E0;
        int i32 = this.f13436i;
        if (i6 > 0) {
            i32 += c1440g.f13461Q0;
        }
        C1436c c1436c7 = this.f13432e;
        C1436c c1436c8 = c1437d7.f13349J;
        c1436c8.a(c1436c7, i32);
        C1436c c1436c9 = c1437d7.f13351L;
        if (z6) {
            c1436c9.a(this.f13434g, this.f13438k);
        }
        if (i6 > 0) {
            this.f13432e.f13334d.f13351L.a(c1436c8, 0);
        }
        if (c1440g.f13463S0 != 3 || c1437d7.f13344E) {
            c1437d = c1437d7;
        } else {
            for (int i33 = 0; i33 < i17; i33++) {
                int i34 = this.f13441n + (z5 ? (i17 - 1) - i33 : i33);
                if (i34 >= c1440g.b1) {
                    break;
                }
                c1437d = c1440g.f13471a1[i34];
                if (c1437d.f13344E) {
                    break;
                }
            }
            c1437d = c1437d7;
        }
        int i35 = 0;
        C1437d c1437d8 = null;
        while (i35 < i17) {
            int i36 = z5 ? (i17 - 1) - i35 : i35;
            int i37 = this.f13441n + i36;
            if (i37 >= c1440g.b1) {
                return;
            }
            C1437d c1437d9 = c1440g.f13471a1[i37];
            if (c1437d9 == null) {
                i12 = i17;
                c6 = 3;
            } else {
                C1436c c1436c10 = c1437d9.f13348I;
                if (i35 == 0) {
                    c1437d9.g(c1436c10, this.f13431d, this.f13435h);
                }
                if (i36 == 0) {
                    int i38 = c1440g.f13449D0;
                    if (z5) {
                        i14 = i38;
                        f6 = 1.0f - c1440g.f13454J0;
                    } else {
                        i14 = i38;
                        f6 = c1440g.f13454J0;
                    }
                    if (this.f13441n == 0) {
                        int i39 = c1440g.f13450F0;
                        f7 = f6;
                        if (i39 != -1) {
                            f8 = z5 ? 1.0f - c1440g.f13456L0 : c1440g.f13456L0;
                            i15 = i39;
                        }
                        c1437d9.f13383i0 = i15;
                        c1437d9.f13373d0 = f8;
                    } else {
                        f7 = f6;
                    }
                    if (!z6 || (i15 = c1440g.f13452H0) == -1) {
                        i15 = i14;
                        f8 = f7;
                    } else {
                        f8 = z5 ? 1.0f - c1440g.f13458N0 : c1440g.f13458N0;
                    }
                    c1437d9.f13383i0 = i15;
                    c1437d9.f13373d0 = f8;
                }
                if (i35 == i17 - 1) {
                    i12 = i17;
                    c1437d9.g(c1437d9.f13350K, this.f13433f, this.f13437j);
                } else {
                    i12 = i17;
                }
                if (c1437d8 != null) {
                    int i40 = c1440g.f13460P0;
                    C1436c c1436c11 = c1437d8.f13350K;
                    c1436c10.a(c1436c11, i40);
                    if (i35 == i19) {
                        int i41 = this.f13435h;
                        if (c1436c10.h()) {
                            c1436c10.f13338h = i41;
                        }
                    }
                    c1436c11.a(c1436c10, 0);
                    if (i35 == i20 + 1) {
                        int i42 = this.f13437j;
                        if (c1436c11.h()) {
                            c1436c11.f13338h = i42;
                        }
                    }
                }
                if (c1437d9 != c1437d7) {
                    int i43 = c1440g.f13463S0;
                    c6 = 3;
                    if (i43 == 3 && c1437d.f13344E && c1437d9 != c1437d && c1437d9.f13344E) {
                        c1437d9.f13352M.a(c1437d.f13352M, 0);
                    } else {
                        C1436c c1436c12 = c1437d9.f13349J;
                        if (i43 != 0) {
                            C1436c c1436c13 = c1437d9.f13351L;
                            if (i43 == 1) {
                                i13 = 0;
                            } else if (z7) {
                                c1436c12.a(this.f13432e, this.f13436i);
                                c1436c13.a(this.f13434g, this.f13438k);
                            } else {
                                i13 = 0;
                                c1436c12.a(c1436c8, 0);
                            }
                            c1436c13.a(c1436c9, i13);
                        } else {
                            c1436c12.a(c1436c8, 0);
                        }
                    }
                } else {
                    c6 = 3;
                }
                c1437d8 = c1437d9;
            }
            i35++;
            i17 = i12;
        }
    }

    public final int c() {
        return this.f13428a == 1 ? this.f13440m - this.f13445r.f13461Q0 : this.f13440m;
    }

    public final int d() {
        return this.f13428a == 0 ? this.f13439l - this.f13445r.f13460P0 : this.f13439l;
    }

    public final void e(int i6) {
        C1440g c1440g;
        int i7;
        int i8;
        int iR;
        int iL;
        int i9 = this.f13443p;
        if (i9 == 0) {
            return;
        }
        int i10 = this.f13442o;
        int i11 = i6 / i9;
        int i12 = 0;
        while (true) {
            c1440g = this.f13445r;
            if (i12 >= i10 || (i7 = this.f13441n + i12) >= c1440g.b1) {
                break;
            }
            C1437d c1437d = c1440g.f13471a1[i7];
            int i13 = 1;
            if (this.f13428a == 0) {
                if (c1437d != null) {
                    int[] iArr = c1437d.f13397p0;
                    if (iArr[0] == 3 && c1437d.f13399r == 0) {
                        int i14 = iArr[1];
                        i8 = 1;
                        iR = i11;
                        i13 = i14;
                        iL = c1437d.l();
                        c1440g.V(c1437d, i8, iR, i13, iL);
                    }
                }
            } else if (c1437d != null) {
                int[] iArr2 = c1437d.f13397p0;
                if (iArr2[1] == 3 && c1437d.f13400s == 0) {
                    i8 = iArr2[0];
                    iR = c1437d.r();
                    iL = i11;
                    c1440g.V(c1437d, i8, iR, i13, iL);
                }
            }
            i12++;
        }
        this.f13439l = 0;
        this.f13440m = 0;
        this.f13429b = null;
        this.f13430c = 0;
        int i15 = this.f13442o;
        for (int i16 = 0; i16 < i15; i16++) {
            int i17 = this.f13441n + i16;
            if (i17 >= c1440g.b1) {
                return;
            }
            C1437d c1437d2 = c1440g.f13471a1[i17];
            if (this.f13428a == 0) {
                int iR2 = c1437d2.r();
                int i18 = c1440g.f13460P0;
                if (c1437d2.f13379g0 == 8) {
                    i18 = 0;
                }
                this.f13439l = iR2 + i18 + this.f13439l;
                int iT = c1440g.T(this.f13444q, c1437d2);
                if (this.f13429b == null || this.f13430c < iT) {
                    this.f13429b = c1437d2;
                    this.f13430c = iT;
                    this.f13440m = iT;
                }
            } else {
                int iU = c1440g.U(this.f13444q, c1437d2);
                int iT2 = c1440g.T(this.f13444q, c1437d2);
                int i19 = c1440g.f13461Q0;
                if (c1437d2.f13379g0 == 8) {
                    i19 = 0;
                }
                this.f13440m = iT2 + i19 + this.f13440m;
                if (this.f13429b == null || this.f13430c < iU) {
                    this.f13429b = c1437d2;
                    this.f13430c = iU;
                    this.f13439l = iU;
                }
            }
        }
    }

    public final void f(int i6, C1436c c1436c, C1436c c1436c2, C1436c c1436c3, C1436c c1436c4, int i7, int i8, int i9, int i10, int i11) {
        this.f13428a = i6;
        this.f13431d = c1436c;
        this.f13432e = c1436c2;
        this.f13433f = c1436c3;
        this.f13434g = c1436c4;
        this.f13435h = i7;
        this.f13436i = i8;
        this.f13437j = i9;
        this.f13438k = i10;
        this.f13444q = i11;
    }
}
