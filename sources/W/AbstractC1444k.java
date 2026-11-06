package w;

/* JADX INFO: renamed from: w.k, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1444k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final boolean[] f13488a = new boolean[3];

    public static void a(C1438e c1438e, u.d dVar, C1437d c1437d) {
        c1437d.f13394o = -1;
        c1437d.f13396p = -1;
        int i6 = c1438e.f13397p0[0];
        int[] iArr = c1437d.f13397p0;
        if (i6 != 2 && iArr[0] == 4) {
            C1436c c1436c = c1437d.f13348I;
            int i7 = c1436c.f13337g;
            int iR = c1438e.r();
            C1436c c1436c2 = c1437d.f13350K;
            int i8 = iR - c1436c2.f13337g;
            c1436c.f13339i = dVar.k(c1436c);
            c1436c2.f13339i = dVar.k(c1436c2);
            dVar.d(c1436c.f13339i, i7);
            dVar.d(c1436c2.f13339i, i8);
            c1437d.f13394o = 2;
            c1437d.f13364Y = i7;
            int i9 = i8 - i7;
            c1437d.f13360U = i9;
            int i10 = c1437d.f13369b0;
            if (i9 < i10) {
                c1437d.f13360U = i10;
            }
        }
        if (c1438e.f13397p0[1] == 2 || iArr[1] != 4) {
            return;
        }
        C1436c c1436c3 = c1437d.f13349J;
        int i11 = c1436c3.f13337g;
        int iL = c1438e.l();
        C1436c c1436c4 = c1437d.f13351L;
        int i12 = iL - c1436c4.f13337g;
        c1436c3.f13339i = dVar.k(c1436c3);
        c1436c4.f13339i = dVar.k(c1436c4);
        dVar.d(c1436c3.f13339i, i11);
        dVar.d(c1436c4.f13339i, i12);
        if (c1437d.f13367a0 > 0 || c1437d.f13379g0 == 8) {
            C1436c c1436c5 = c1437d.f13352M;
            u.i iVarK = dVar.k(c1436c5);
            c1436c5.f13339i = iVarK;
            dVar.d(iVarK, c1437d.f13367a0 + i11);
        }
        c1437d.f13396p = 2;
        c1437d.f13365Z = i11;
        int i13 = i12 - i11;
        c1437d.f13361V = i13;
        int i14 = c1437d.f13371c0;
        if (i13 < i14) {
            c1437d.f13361V = i14;
        }
    }

    public static final boolean b(int i6, int i7) {
        return (i6 & i7) == i7;
    }
}
