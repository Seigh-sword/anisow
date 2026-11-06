package w;

import java.util.ArrayList;
import x.n;

/* JADX INFO: renamed from: w.g, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1440g extends AbstractC1443j {

    /* JADX INFO: renamed from: A0, reason: collision with root package name */
    public int f13446A0;

    /* JADX INFO: renamed from: B0, reason: collision with root package name */
    public x.b f13447B0;

    /* JADX INFO: renamed from: C0, reason: collision with root package name */
    public n f13448C0;

    /* JADX INFO: renamed from: D0, reason: collision with root package name */
    public int f13449D0;
    public int E0;

    /* JADX INFO: renamed from: F0, reason: collision with root package name */
    public int f13450F0;

    /* JADX INFO: renamed from: G0, reason: collision with root package name */
    public int f13451G0;

    /* JADX INFO: renamed from: H0, reason: collision with root package name */
    public int f13452H0;

    /* JADX INFO: renamed from: I0, reason: collision with root package name */
    public int f13453I0;

    /* JADX INFO: renamed from: J0, reason: collision with root package name */
    public float f13454J0;

    /* JADX INFO: renamed from: K0, reason: collision with root package name */
    public float f13455K0;

    /* JADX INFO: renamed from: L0, reason: collision with root package name */
    public float f13456L0;

    /* JADX INFO: renamed from: M0, reason: collision with root package name */
    public float f13457M0;

    /* JADX INFO: renamed from: N0, reason: collision with root package name */
    public float f13458N0;

    /* JADX INFO: renamed from: O0, reason: collision with root package name */
    public float f13459O0;

    /* JADX INFO: renamed from: P0, reason: collision with root package name */
    public int f13460P0;

    /* JADX INFO: renamed from: Q0, reason: collision with root package name */
    public int f13461Q0;

    /* JADX INFO: renamed from: R0, reason: collision with root package name */
    public int f13462R0;

    /* JADX INFO: renamed from: S0, reason: collision with root package name */
    public int f13463S0;

    /* JADX INFO: renamed from: T0, reason: collision with root package name */
    public int f13464T0;

    /* JADX INFO: renamed from: U0, reason: collision with root package name */
    public int f13465U0;

    /* JADX INFO: renamed from: V0, reason: collision with root package name */
    public int f13466V0;

    /* JADX INFO: renamed from: W0, reason: collision with root package name */
    public ArrayList f13467W0;

    /* JADX INFO: renamed from: X0, reason: collision with root package name */
    public C1437d[] f13468X0;

    /* JADX INFO: renamed from: Y0, reason: collision with root package name */
    public C1437d[] f13469Y0;

    /* JADX INFO: renamed from: Z0, reason: collision with root package name */
    public int[] f13470Z0;

    /* JADX INFO: renamed from: a1, reason: collision with root package name */
    public C1437d[] f13471a1;
    public int b1;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public int f13472s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public int f13473t0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public int f13474u0;

    /* JADX INFO: renamed from: v0, reason: collision with root package name */
    public int f13475v0;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public int f13476w0;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    public int f13477x0;

    /* JADX INFO: renamed from: y0, reason: collision with root package name */
    public boolean f13478y0;

    /* JADX INFO: renamed from: z0, reason: collision with root package name */
    public int f13479z0;

    public final int T(int i6, C1437d c1437d) {
        if (c1437d == null) {
            return 0;
        }
        int[] iArr = c1437d.f13397p0;
        if (iArr[1] == 3) {
            int i7 = c1437d.f13400s;
            if (i7 == 0) {
                return 0;
            }
            if (i7 == 2) {
                int i8 = (int) (c1437d.f13407z * i6);
                if (i8 != c1437d.l()) {
                    c1437d.f13378g = true;
                    V(c1437d, iArr[0], c1437d.r(), 1, i8);
                }
                return i8;
            }
            if (i7 == 1) {
                return c1437d.l();
            }
            if (i7 == 3) {
                return (int) ((c1437d.r() * c1437d.f13362W) + 0.5f);
            }
        }
        return c1437d.l();
    }

    public final int U(int i6, C1437d c1437d) {
        if (c1437d == null) {
            return 0;
        }
        int[] iArr = c1437d.f13397p0;
        if (iArr[0] == 3) {
            int i7 = c1437d.f13399r;
            if (i7 == 0) {
                return 0;
            }
            if (i7 == 2) {
                int i8 = (int) (c1437d.f13404w * i6);
                if (i8 != c1437d.r()) {
                    c1437d.f13378g = true;
                    V(c1437d, 1, i8, iArr[1], c1437d.l());
                }
                return i8;
            }
            if (i7 == 1) {
                return c1437d.r();
            }
            if (i7 == 3) {
                return (int) ((c1437d.l() * c1437d.f13362W) + 0.5f);
            }
        }
        return c1437d.r();
    }

    public final void V(C1437d c1437d, int i6, int i7, int i8, int i9) {
        n nVar;
        C1437d c1437d2;
        while (true) {
            nVar = this.f13448C0;
            if (nVar != null || (c1437d2 = this.f13359T) == null) {
                break;
            } else {
                this.f13448C0 = ((C1438e) c1437d2).f13422u0;
            }
        }
        x.b bVar = this.f13447B0;
        bVar.f13600a = i6;
        bVar.f13601b = i8;
        bVar.f13602c = i7;
        bVar.f13603d = i9;
        nVar.b(c1437d, bVar);
        c1437d.P(this.f13447B0.f13604e);
        c1437d.M(this.f13447B0.f13605f);
        x.b bVar2 = this.f13447B0;
        c1437d.f13344E = bVar2.f13607h;
        c1437d.J(bVar2.f13606g);
    }

    @Override // w.AbstractC1443j, w.InterfaceC1442i
    public final void a() {
        for (int i6 = 0; i6 < this.f13487r0; i6++) {
            C1437d c1437d = this.f13486q0[i6];
            if (c1437d != null) {
                c1437d.f13345F = true;
            }
        }
    }

    @Override // w.C1437d
    public final void c(u.d dVar, boolean z5) {
        C1437d c1437d;
        float f6;
        int i6;
        super.c(dVar, z5);
        C1437d c1437d2 = this.f13359T;
        boolean z6 = c1437d2 != null && ((C1438e) c1437d2).f13423v0;
        int i7 = this.f13464T0;
        ArrayList arrayList = this.f13467W0;
        if (i7 != 0) {
            if (i7 == 1) {
                int size = arrayList.size();
                int i8 = 0;
                while (i8 < size) {
                    ((C1439f) arrayList.get(i8)).b(i8, z6, i8 == size + (-1));
                    i8++;
                }
            } else if (i7 != 2) {
                if (i7 == 3) {
                    int size2 = arrayList.size();
                    int i9 = 0;
                    while (i9 < size2) {
                        ((C1439f) arrayList.get(i9)).b(i9, z6, i9 == size2 + (-1));
                        i9++;
                    }
                }
            } else if (this.f13470Z0 != null && this.f13469Y0 != null && this.f13468X0 != null) {
                for (int i10 = 0; i10 < this.b1; i10++) {
                    this.f13471a1[i10].E();
                }
                int[] iArr = this.f13470Z0;
                int i11 = iArr[0];
                int i12 = iArr[1];
                float f7 = this.f13454J0;
                C1437d c1437d3 = null;
                int i13 = 0;
                while (i13 < i11) {
                    if (z6) {
                        i6 = (i11 - i13) - 1;
                        f6 = 1.0f - this.f13454J0;
                    } else {
                        f6 = f7;
                        i6 = i13;
                    }
                    C1437d c1437d4 = this.f13469Y0[i6];
                    if (c1437d4 != null && c1437d4.f13379g0 != 8) {
                        C1436c c1436c = c1437d4.f13348I;
                        if (i13 == 0) {
                            c1437d4.g(c1436c, this.f13348I, this.f13476w0);
                            c1437d4.f13383i0 = this.f13449D0;
                            c1437d4.f13373d0 = f6;
                        }
                        if (i13 == i11 - 1) {
                            c1437d4.g(c1437d4.f13350K, this.f13350K, this.f13477x0);
                        }
                        if (i13 > 0 && c1437d3 != null) {
                            int i14 = this.f13460P0;
                            C1436c c1436c2 = c1437d3.f13350K;
                            c1437d4.g(c1436c, c1436c2, i14);
                            c1437d3.g(c1436c2, c1436c, 0);
                        }
                        c1437d3 = c1437d4;
                    }
                    i13++;
                    f7 = f6;
                }
                for (int i15 = 0; i15 < i12; i15++) {
                    C1437d c1437d5 = this.f13468X0[i15];
                    if (c1437d5 != null && c1437d5.f13379g0 != 8) {
                        C1436c c1436c3 = c1437d5.f13349J;
                        if (i15 == 0) {
                            c1437d5.g(c1436c3, this.f13349J, this.f13472s0);
                            c1437d5.f13385j0 = this.E0;
                            c1437d5.f13375e0 = this.f13455K0;
                        }
                        if (i15 == i12 - 1) {
                            c1437d5.g(c1437d5.f13351L, this.f13351L, this.f13473t0);
                        }
                        if (i15 > 0 && c1437d3 != null) {
                            int i16 = this.f13461Q0;
                            C1436c c1436c4 = c1437d3.f13351L;
                            c1437d5.g(c1436c3, c1436c4, i16);
                            c1437d3.g(c1436c4, c1436c3, 0);
                        }
                        c1437d3 = c1437d5;
                    }
                }
                for (int i17 = 0; i17 < i11; i17++) {
                    for (int i18 = 0; i18 < i12; i18++) {
                        int i19 = (i18 * i11) + i17;
                        if (this.f13466V0 == 1) {
                            i19 = (i17 * i12) + i18;
                        }
                        C1437d[] c1437dArr = this.f13471a1;
                        if (i19 < c1437dArr.length && (c1437d = c1437dArr[i19]) != null && c1437d.f13379g0 != 8) {
                            C1437d c1437d6 = this.f13469Y0[i17];
                            C1437d c1437d7 = this.f13468X0[i18];
                            if (c1437d != c1437d6) {
                                c1437d.g(c1437d.f13348I, c1437d6.f13348I, 0);
                                c1437d.g(c1437d.f13350K, c1437d6.f13350K, 0);
                            }
                            if (c1437d != c1437d7) {
                                c1437d.g(c1437d.f13349J, c1437d7.f13349J, 0);
                                c1437d.g(c1437d.f13351L, c1437d7.f13351L, 0);
                            }
                        }
                    }
                }
            }
        } else if (arrayList.size() > 0) {
            ((C1439f) arrayList.get(0)).b(0, z6, true);
        }
        this.f13478y0 = false;
    }
}
