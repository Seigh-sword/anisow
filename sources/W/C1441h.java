package w;

import java.util.ArrayList;

/* JADX INFO: renamed from: w.h, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1441h extends C1437d {

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public float f13480q0 = -1.0f;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public int f13481r0 = -1;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public int f13482s0 = -1;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public C1436c f13483t0 = this.f13349J;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public int f13484u0 = 0;

    /* JADX INFO: renamed from: v0, reason: collision with root package name */
    public boolean f13485v0;

    public C1441h() {
        this.f13357R.clear();
        this.f13357R.add(this.f13483t0);
        int length = this.f13356Q.length;
        for (int i6 = 0; i6 < length; i6++) {
            this.f13356Q[i6] = this.f13483t0;
        }
    }

    @Override // w.C1437d
    public final boolean B() {
        return this.f13485v0;
    }

    @Override // w.C1437d
    public final boolean C() {
        return this.f13485v0;
    }

    @Override // w.C1437d
    public final void R(u.d dVar, boolean z5) {
        if (this.f13359T == null) {
            return;
        }
        C1436c c1436c = this.f13483t0;
        dVar.getClass();
        int iN = u.d.n(c1436c);
        if (this.f13484u0 == 1) {
            this.f13364Y = iN;
            this.f13365Z = 0;
            M(this.f13359T.l());
            P(0);
            return;
        }
        this.f13364Y = 0;
        this.f13365Z = iN;
        P(this.f13359T.r());
        M(0);
    }

    public final void S(int i6) {
        this.f13483t0.l(i6);
        this.f13485v0 = true;
    }

    public final void T(int i6) {
        if (this.f13484u0 == i6) {
            return;
        }
        this.f13484u0 = i6;
        ArrayList arrayList = this.f13357R;
        arrayList.clear();
        this.f13483t0 = this.f13484u0 == 1 ? this.f13348I : this.f13349J;
        arrayList.add(this.f13483t0);
        C1436c[] c1436cArr = this.f13356Q;
        int length = c1436cArr.length;
        for (int i7 = 0; i7 < length; i7++) {
            c1436cArr[i7] = this.f13483t0;
        }
    }

    @Override // w.C1437d
    public final void c(u.d dVar, boolean z5) {
        u.i iVarK;
        u.i iVarK2;
        u.i iVarK3;
        C1438e c1438e = (C1438e) this.f13359T;
        if (c1438e == null) {
            return;
        }
        Object objJ = c1438e.j(2);
        Object objJ2 = c1438e.j(4);
        C1437d c1437d = this.f13359T;
        boolean z6 = c1437d != null && c1437d.f13397p0[0] == 2;
        if (this.f13484u0 == 0) {
            objJ = c1438e.j(3);
            objJ2 = c1438e.j(5);
            C1437d c1437d2 = this.f13359T;
            z6 = c1437d2 != null && c1437d2.f13397p0[1] == 2;
        }
        if (this.f13485v0) {
            C1436c c1436c = this.f13483t0;
            if (c1436c.f13333c) {
                u.i iVarK4 = dVar.k(c1436c);
                dVar.d(iVarK4, this.f13483t0.d());
                if (this.f13481r0 != -1) {
                    if (z6) {
                        iVarK3 = dVar.k(objJ2);
                        dVar.f(iVarK3, iVarK4, 0, 5);
                    }
                } else if (this.f13482s0 != -1 && z6) {
                    iVarK3 = dVar.k(objJ2);
                    dVar.f(iVarK4, dVar.k(objJ), 0, 5);
                    dVar.f(iVarK3, iVarK4, 0, 5);
                }
                this.f13485v0 = false;
                return;
            }
        }
        if (this.f13481r0 != -1) {
            iVarK = dVar.k(this.f13483t0);
            dVar.e(iVarK, dVar.k(objJ), this.f13481r0, 8);
            if (!z6) {
                return;
            } else {
                iVarK2 = dVar.k(objJ2);
            }
        } else {
            if (this.f13482s0 == -1) {
                if (this.f13480q0 != -1.0f) {
                    u.i iVarK5 = dVar.k(this.f13483t0);
                    u.i iVarK6 = dVar.k(objJ2);
                    float f6 = this.f13480q0;
                    u.c cVarL = dVar.l();
                    cVarL.f12772d.e(iVarK5, -1.0f);
                    cVarL.f12772d.e(iVarK6, f6);
                    dVar.c(cVarL);
                    return;
                }
                return;
            }
            iVarK = dVar.k(this.f13483t0);
            iVarK2 = dVar.k(objJ2);
            dVar.e(iVarK, iVarK2, -this.f13482s0, 8);
            if (!z6) {
                return;
            } else {
                dVar.f(iVarK, dVar.k(objJ), 0, 5);
            }
        }
        dVar.f(iVarK2, iVarK, 0, 5);
    }

    @Override // w.C1437d
    public final boolean d() {
        return true;
    }

    @Override // w.C1437d
    public final C1436c j(int i6) {
        int iB = u.h.b(i6);
        if (iB != 1) {
            if (iB != 2) {
                if (iB != 3) {
                    if (iB != 4) {
                        return null;
                    }
                }
            }
            if (this.f13484u0 == 0) {
                return this.f13483t0;
            }
            return null;
        }
        if (this.f13484u0 == 1) {
            return this.f13483t0;
        }
        return null;
    }
}
