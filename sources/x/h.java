package x;

import java.util.HashSet;
import w.C1436c;
import w.C1437d;
import w.C1438e;
import w.C1441h;

/* JADX INFO: loaded from: classes.dex */
public abstract class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final b f13633a = new b();

    public static boolean a(C1437d c1437d) {
        int[] iArr = c1437d.f13397p0;
        int i6 = iArr[0];
        int i7 = iArr[1];
        C1437d c1437d2 = c1437d.f13359T;
        C1438e c1438e = c1437d2 != null ? (C1438e) c1437d2 : null;
        if (c1438e != null) {
            int i8 = c1438e.f13397p0[0];
        }
        if (c1438e != null) {
            int i9 = c1438e.f13397p0[1];
        }
        boolean z5 = i6 == 1 || c1437d.B() || i6 == 2 || (i6 == 3 && c1437d.f13399r == 0 && c1437d.f13362W == 0.0f && c1437d.u(0)) || (i6 == 3 && c1437d.f13399r == 1 && c1437d.v(0, c1437d.r()));
        boolean z6 = i7 == 1 || c1437d.C() || i7 == 2 || (i7 == 3 && c1437d.f13400s == 0 && c1437d.f13362W == 0.0f && c1437d.u(1)) || (i7 == 3 && c1437d.f13400s == 1 && c1437d.v(1, c1437d.l()));
        if (c1437d.f13362W <= 0.0f || !(z5 || z6)) {
            return z5 && z6;
        }
        return true;
    }

    public static void b(int i6, C1437d c1437d, n nVar, boolean z5) {
        C1436c c1436c;
        C1436c c1436c2;
        C1436c c1436c3;
        C1436c c1436c4;
        if (c1437d.f13390m) {
            return;
        }
        if (!(c1437d instanceof C1438e) && c1437d.A() && a(c1437d)) {
            C1438e.W(c1437d, nVar, new b());
        }
        C1436c c1436cJ = c1437d.j(2);
        C1436c c1436cJ2 = c1437d.j(4);
        int iD = c1436cJ.d();
        int iD2 = c1436cJ2.d();
        HashSet<C1436c> hashSet = c1436cJ.f13331a;
        char c6 = 0;
        if (hashSet != null && c1436cJ.f13333c) {
            for (C1436c c1436c5 : hashSet) {
                C1437d c1437d2 = c1436c5.f13334d;
                int i7 = i6 + 1;
                boolean zA = a(c1437d2);
                if (c1437d2.A() && zA) {
                    C1438e.W(c1437d2, nVar, new b());
                }
                C1436c c1436c6 = c1437d2.f13348I;
                C1436c c1436c7 = c1437d2.f13350K;
                char c7 = ((c1436c5 == c1436c6 && (c1436c4 = c1436c7.f13336f) != null && c1436c4.f13333c) || (c1436c5 == c1436c7 && (c1436c3 = c1436c6.f13336f) != null && c1436c3.f13333c)) ? (char) 1 : c6;
                int i8 = c1437d2.f13397p0[c6];
                if (i8 != 3 || zA) {
                    if (!c1437d2.A()) {
                        if (c1436c5 == c1436c6 && c1436c7.f13336f == null) {
                            int iE = c1436c6.e() + iD;
                            c1437d2.K(iE, c1437d2.r() + iE);
                        } else if (c1436c5 == c1436c7 && c1436c6.f13336f == null) {
                            int iE2 = iD - c1436c7.e();
                            c1437d2.K(iE2 - c1437d2.r(), iE2);
                        } else if (c7 != 0 && !c1437d2.y()) {
                            c(i7, c1437d2, nVar, z5);
                        }
                        b(i7, c1437d2, nVar, z5);
                    }
                } else if (i8 == 3 && c1437d2.f13403v >= 0 && c1437d2.f13402u >= 0 && ((c1437d2.f13379g0 == 8 || (c1437d2.f13399r == 0 && c1437d2.f13362W == 0.0f)) && !c1437d2.y() && !c1437d2.f13345F && c7 != 0 && !c1437d2.y())) {
                    d(i7, c1437d, nVar, c1437d2, z5);
                }
                c6 = 0;
            }
        }
        if (c1437d instanceof C1441h) {
            return;
        }
        HashSet<C1436c> hashSet2 = c1436cJ2.f13331a;
        if (hashSet2 != null && c1436cJ2.f13333c) {
            for (C1436c c1436c8 : hashSet2) {
                C1437d c1437d3 = c1436c8.f13334d;
                int i9 = i6 + 1;
                boolean zA2 = a(c1437d3);
                if (c1437d3.A() && zA2) {
                    C1438e.W(c1437d3, nVar, new b());
                }
                C1436c c1436c9 = c1437d3.f13348I;
                C1436c c1436c10 = c1437d3.f13350K;
                boolean z6 = (c1436c8 == c1436c9 && (c1436c2 = c1436c10.f13336f) != null && c1436c2.f13333c) || (c1436c8 == c1436c10 && (c1436c = c1436c9.f13336f) != null && c1436c.f13333c);
                int i10 = c1437d3.f13397p0[0];
                if (i10 != 3 || zA2) {
                    if (!c1437d3.A()) {
                        if (c1436c8 == c1436c9 && c1436c10.f13336f == null) {
                            int iE3 = c1436c9.e() + iD2;
                            c1437d3.K(iE3, c1437d3.r() + iE3);
                        } else if (c1436c8 == c1436c10 && c1436c9.f13336f == null) {
                            int iE4 = iD2 - c1436c10.e();
                            c1437d3.K(iE4 - c1437d3.r(), iE4);
                        } else if (z6 && !c1437d3.y()) {
                            c(i9, c1437d3, nVar, z5);
                        }
                        b(i9, c1437d3, nVar, z5);
                    }
                } else if (i10 == 3 && c1437d3.f13403v >= 0 && c1437d3.f13402u >= 0) {
                    if (c1437d3.f13379g0 != 8) {
                        if (c1437d3.f13399r == 0) {
                            if (c1437d3.f13362W == 0.0f) {
                            }
                        }
                    }
                    if (!c1437d3.y() && !c1437d3.f13345F && z6 && !c1437d3.y()) {
                        d(i9, c1437d, nVar, c1437d3, z5);
                    }
                }
            }
        }
        c1437d.f13390m = true;
    }

    public static void c(int i6, C1437d c1437d, n nVar, boolean z5) {
        float f6 = c1437d.f13373d0;
        C1436c c1436c = c1437d.f13348I;
        int iD = c1436c.f13336f.d();
        C1436c c1436c2 = c1437d.f13350K;
        int iD2 = c1436c2.f13336f.d();
        int iE = c1436c.e() + iD;
        int iE2 = iD2 - c1436c2.e();
        if (iD == iD2) {
            f6 = 0.5f;
        } else {
            iD = iE;
            iD2 = iE2;
        }
        int iR = c1437d.r();
        int i7 = (iD2 - iD) - iR;
        if (iD > iD2) {
            i7 = (iD - iD2) - iR;
        }
        int i8 = ((int) (i7 > 0 ? (f6 * i7) + 0.5f : f6 * i7)) + iD;
        int i9 = i8 + iR;
        if (iD > iD2) {
            i9 = i8 - iR;
        }
        c1437d.K(i8, i9);
        b(i6 + 1, c1437d, nVar, z5);
    }

    public static void d(int i6, C1437d c1437d, n nVar, C1437d c1437d2, boolean z5) {
        float f6 = c1437d2.f13373d0;
        C1436c c1436c = c1437d2.f13348I;
        int iE = c1436c.e() + c1436c.f13336f.d();
        C1436c c1436c2 = c1437d2.f13350K;
        int iD = c1436c2.f13336f.d() - c1436c2.e();
        if (iD >= iE) {
            int iR = c1437d2.r();
            if (c1437d2.f13379g0 != 8) {
                int i7 = c1437d2.f13399r;
                if (i7 == 2) {
                    if (!(c1437d instanceof C1438e)) {
                        c1437d = c1437d.f13359T;
                    }
                    iR = (int) (c1437d2.f13373d0 * 0.5f * c1437d.r());
                } else if (i7 == 0) {
                    iR = iD - iE;
                }
                iR = Math.max(c1437d2.f13402u, iR);
                int i8 = c1437d2.f13403v;
                if (i8 > 0) {
                    iR = Math.min(i8, iR);
                }
            }
            int i9 = iE + ((int) ((f6 * ((iD - iE) - iR)) + 0.5f));
            c1437d2.K(i9, iR + i9);
            b(i6 + 1, c1437d2, nVar, z5);
        }
    }

    public static void e(int i6, C1437d c1437d, n nVar) {
        float f6 = c1437d.f13375e0;
        C1436c c1436c = c1437d.f13349J;
        int iD = c1436c.f13336f.d();
        C1436c c1436c2 = c1437d.f13351L;
        int iD2 = c1436c2.f13336f.d();
        int iE = c1436c.e() + iD;
        int iE2 = iD2 - c1436c2.e();
        if (iD == iD2) {
            f6 = 0.5f;
        } else {
            iD = iE;
            iD2 = iE2;
        }
        int iL = c1437d.l();
        int i7 = (iD2 - iD) - iL;
        if (iD > iD2) {
            i7 = (iD - iD2) - iL;
        }
        int i8 = (int) (i7 > 0 ? (f6 * i7) + 0.5f : f6 * i7);
        int i9 = iD + i8;
        int i10 = i9 + iL;
        if (iD > iD2) {
            i9 = iD - i8;
            i10 = i9 - iL;
        }
        c1437d.L(i9, i10);
        g(i6 + 1, c1437d, nVar);
    }

    public static void f(int i6, C1437d c1437d, n nVar, C1437d c1437d2) {
        float f6 = c1437d2.f13375e0;
        C1436c c1436c = c1437d2.f13349J;
        int iE = c1436c.e() + c1436c.f13336f.d();
        C1436c c1436c2 = c1437d2.f13351L;
        int iD = c1436c2.f13336f.d() - c1436c2.e();
        if (iD >= iE) {
            int iL = c1437d2.l();
            if (c1437d2.f13379g0 != 8) {
                int i7 = c1437d2.f13400s;
                if (i7 == 2) {
                    if (!(c1437d instanceof C1438e)) {
                        c1437d = c1437d.f13359T;
                    }
                    iL = (int) (f6 * 0.5f * c1437d.l());
                } else if (i7 == 0) {
                    iL = iD - iE;
                }
                iL = Math.max(c1437d2.f13405x, iL);
                int i8 = c1437d2.f13406y;
                if (i8 > 0) {
                    iL = Math.min(i8, iL);
                }
            }
            int i9 = iE + ((int) ((f6 * ((iD - iE) - iL)) + 0.5f));
            c1437d2.L(i9, iL + i9);
            g(i6 + 1, c1437d2, nVar);
        }
    }

    public static void g(int i6, C1437d c1437d, n nVar) {
        C1436c c1436c;
        C1436c c1436c2;
        C1436c c1436c3;
        C1436c c1436c4;
        C1436c c1436c5;
        if (c1437d.f13392n) {
            return;
        }
        if (!(c1437d instanceof C1438e) && c1437d.A() && a(c1437d)) {
            C1438e.W(c1437d, nVar, new b());
        }
        C1436c c1436cJ = c1437d.j(3);
        C1436c c1436cJ2 = c1437d.j(5);
        int iD = c1436cJ.d();
        int iD2 = c1436cJ2.d();
        HashSet<C1436c> hashSet = c1436cJ.f13331a;
        if (hashSet != null && c1436cJ.f13333c) {
            for (C1436c c1436c6 : hashSet) {
                C1437d c1437d2 = c1436c6.f13334d;
                int i7 = i6 + 1;
                boolean zA = a(c1437d2);
                if (c1437d2.A() && zA) {
                    C1438e.W(c1437d2, nVar, new b());
                }
                C1436c c1436c7 = c1437d2.f13349J;
                C1436c c1436c8 = c1437d2.f13351L;
                boolean z5 = (c1436c6 == c1436c7 && (c1436c5 = c1436c8.f13336f) != null && c1436c5.f13333c) || (c1436c6 == c1436c8 && (c1436c4 = c1436c7.f13336f) != null && c1436c4.f13333c);
                int i8 = c1437d2.f13397p0[1];
                if (i8 != 3 || zA) {
                    if (!c1437d2.A()) {
                        if (c1436c6 == c1436c7 && c1436c8.f13336f == null) {
                            int iE = c1436c7.e() + iD;
                            c1437d2.L(iE, c1437d2.l() + iE);
                        } else if (c1436c6 == c1436c8 && c1436c7.f13336f == null) {
                            int iE2 = iD - c1436c8.e();
                            c1437d2.L(iE2 - c1437d2.l(), iE2);
                        } else if (z5 && !c1437d2.z()) {
                            e(i7, c1437d2, nVar);
                        }
                        g(i7, c1437d2, nVar);
                    }
                } else if (i8 == 3 && c1437d2.f13406y >= 0 && c1437d2.f13405x >= 0 && (c1437d2.f13379g0 == 8 || (c1437d2.f13400s == 0 && c1437d2.f13362W == 0.0f))) {
                    if (!c1437d2.z() && !c1437d2.f13345F && z5 && !c1437d2.z()) {
                        f(i7, c1437d, nVar, c1437d2);
                    }
                }
            }
        }
        if (c1437d instanceof C1441h) {
            return;
        }
        HashSet<C1436c> hashSet2 = c1436cJ2.f13331a;
        if (hashSet2 != null && c1436cJ2.f13333c) {
            for (C1436c c1436c9 : hashSet2) {
                C1437d c1437d3 = c1436c9.f13334d;
                int i9 = i6 + 1;
                boolean zA2 = a(c1437d3);
                if (c1437d3.A() && zA2) {
                    C1438e.W(c1437d3, nVar, new b());
                }
                C1436c c1436c10 = c1437d3.f13349J;
                C1436c c1436c11 = c1437d3.f13351L;
                boolean z6 = (c1436c9 == c1436c10 && (c1436c3 = c1436c11.f13336f) != null && c1436c3.f13333c) || (c1436c9 == c1436c11 && (c1436c2 = c1436c10.f13336f) != null && c1436c2.f13333c);
                int i10 = c1437d3.f13397p0[1];
                if (i10 != 3 || zA2) {
                    if (!c1437d3.A()) {
                        if (c1436c9 == c1436c10 && c1436c11.f13336f == null) {
                            int iE3 = c1436c10.e() + iD2;
                            c1437d3.L(iE3, c1437d3.l() + iE3);
                        } else if (c1436c9 == c1436c11 && c1436c10.f13336f == null) {
                            int iE4 = iD2 - c1436c11.e();
                            c1437d3.L(iE4 - c1437d3.l(), iE4);
                        } else if (z6 && !c1437d3.z()) {
                            e(i9, c1437d3, nVar);
                        }
                        g(i9, c1437d3, nVar);
                    }
                } else if (i10 == 3 && c1437d3.f13406y >= 0 && c1437d3.f13405x >= 0) {
                    if (c1437d3.f13379g0 != 8) {
                        if (c1437d3.f13400s == 0) {
                            if (c1437d3.f13362W == 0.0f) {
                            }
                        }
                    }
                    if (!c1437d3.z() && !c1437d3.f13345F && z6 && !c1437d3.z()) {
                        f(i9, c1437d, nVar, c1437d3);
                    }
                }
            }
        }
        C1436c c1436cJ3 = c1437d.j(6);
        if (c1436cJ3.f13331a != null && c1436cJ3.f13333c) {
            int iD3 = c1436cJ3.d();
            for (C1436c c1436c12 : c1436cJ3.f13331a) {
                C1437d c1437d4 = c1436c12.f13334d;
                int i11 = i6 + 1;
                boolean zA3 = a(c1437d4);
                if (c1437d4.A() && zA3) {
                    C1438e.W(c1437d4, nVar, new b());
                }
                if (c1437d4.f13397p0[1] != 3 || zA3) {
                    if (!c1437d4.A() && c1436c12 == (c1436c = c1437d4.f13352M)) {
                        int iE5 = c1436c12.e() + iD3;
                        if (c1437d4.f13344E) {
                            int i12 = iE5 - c1437d4.f13367a0;
                            int i13 = c1437d4.f13361V + i12;
                            c1437d4.f13365Z = i12;
                            c1437d4.f13349J.l(i12);
                            c1437d4.f13351L.l(i13);
                            c1436c.l(iE5);
                            c1437d4.f13388l = true;
                        }
                        g(i11, c1437d4, nVar);
                    }
                }
            }
        }
        c1437d.f13392n = true;
    }
}
