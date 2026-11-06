package v0;

import java.util.ArrayList;
import java.util.Collections;
import o0.J0;

/* JADX INFO: renamed from: v0.x, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1414x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final B.h f13278a = new B.h(1);

    public static C1411u e(AbstractC1414x abstractC1414x) {
        ArrayList arrayList;
        ArrayList arrayList2;
        C1413w c1413w;
        J0 j02;
        ArrayList arrayList3;
        ArrayList arrayList4;
        int i6;
        C1413w c1413w2;
        C1413w c1413w3;
        int i7;
        int i8;
        J0 j03;
        J0 j04;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int iH = abstractC1414x.h();
        int iG = abstractC1414x.g();
        ArrayList arrayList5 = new ArrayList();
        ArrayList arrayList6 = new ArrayList();
        C1413w c1413w4 = new C1413w();
        int i15 = 0;
        c1413w4.f13272a = 0;
        c1413w4.f13273b = iH;
        c1413w4.f13274c = 0;
        c1413w4.f13275d = iG;
        arrayList6.add(c1413w4);
        int i16 = iH + iG;
        int i17 = 1;
        int i18 = (((i16 + 1) / 2) * 2) + 1;
        int[] iArr = new int[i18];
        int i19 = i18 / 2;
        int[] iArr2 = new int[i18];
        ArrayList arrayList7 = new ArrayList();
        while (!arrayList6.isEmpty()) {
            C1413w c1413w5 = (C1413w) arrayList6.remove(arrayList6.size() - i17);
            if (c1413w5.b() < i17 || c1413w5.a() < i17) {
                arrayList = arrayList6;
                arrayList2 = arrayList7;
                c1413w = c1413w5;
                j02 = null;
            } else {
                int iA = ((c1413w5.a() + c1413w5.b()) + i17) / 2;
                int i20 = i17 + i19;
                iArr[i20] = c1413w5.f13272a;
                iArr2[i20] = c1413w5.f13273b;
                int i21 = i15;
                while (i21 < iA) {
                    int i22 = Math.abs(c1413w5.b() - c1413w5.a()) % 2 == i17 ? i17 : i15;
                    int iB = c1413w5.b() - c1413w5.a();
                    int i23 = -i21;
                    int i24 = i23;
                    while (true) {
                        if (i24 > i21) {
                            arrayList = arrayList6;
                            i7 = i15;
                            arrayList2 = arrayList7;
                            i8 = iA;
                            j03 = null;
                            break;
                        }
                        if (i24 == i23 || (i24 != i21 && iArr[i24 + 1 + i19] > iArr[(i24 - 1) + i19])) {
                            i12 = iArr[i24 + 1 + i19];
                            i13 = i12;
                        } else {
                            i12 = iArr[(i24 - 1) + i19];
                            i13 = i12 + 1;
                        }
                        i8 = iA;
                        arrayList = arrayList6;
                        int i25 = ((i13 - c1413w5.f13272a) + c1413w5.f13274c) - i24;
                        int i26 = (i21 == 0 || i13 != i12) ? i25 : i25 - 1;
                        arrayList2 = arrayList7;
                        while (i13 < c1413w5.f13273b && i25 < c1413w5.f13275d && abstractC1414x.c(i13, i25)) {
                            i13++;
                            i25++;
                        }
                        iArr[i24 + i19] = i13;
                        if (i22 != 0) {
                            int i27 = iB - i24;
                            i14 = i22;
                            if (i27 >= i23 + 1 && i27 <= i21 - 1 && iArr2[i27 + i19] <= i13) {
                                j03 = new J0();
                                j03.f11781a = i12;
                                j03.f11782b = i26;
                                j03.f11783c = i13;
                                j03.f11784d = i25;
                                i7 = 0;
                                j03.f11785e = false;
                                break;
                            }
                        } else {
                            i14 = i22;
                        }
                        i24 += 2;
                        i15 = 0;
                        iA = i8;
                        arrayList6 = arrayList;
                        arrayList7 = arrayList2;
                        i22 = i14;
                    }
                    if (j03 != null) {
                        j02 = j03;
                        c1413w = c1413w5;
                        break;
                    }
                    int i28 = (c1413w5.b() - c1413w5.a()) % 2 == 0 ? 1 : i7;
                    int iB2 = c1413w5.b() - c1413w5.a();
                    int i29 = i23;
                    while (true) {
                        if (i29 > i21) {
                            c1413w = c1413w5;
                            j04 = null;
                            break;
                        }
                        if (i29 == i23 || (i29 != i21 && iArr2[i29 + 1 + i19] < iArr2[(i29 - 1) + i19])) {
                            i9 = iArr2[i29 + 1 + i19];
                            i10 = i9;
                        } else {
                            i9 = iArr2[(i29 - 1) + i19];
                            i10 = i9 - 1;
                        }
                        int i30 = c1413w5.f13275d - ((c1413w5.f13273b - i10) - i29);
                        int i31 = (i21 == 0 || i10 != i9) ? i30 : i30 + 1;
                        while (i10 > c1413w5.f13272a && i30 > c1413w5.f13274c) {
                            c1413w = c1413w5;
                            if (!abstractC1414x.c(i10 - 1, i30 - 1)) {
                                break;
                            }
                            i10--;
                            i30--;
                            c1413w5 = c1413w;
                        }
                        c1413w = c1413w5;
                        iArr2[i29 + i19] = i10;
                        if (i28 != 0 && (i11 = iB2 - i29) >= i23 && i11 <= i21 && iArr[i11 + i19] >= i10) {
                            j04 = new J0();
                            j04.f11781a = i10;
                            j04.f11782b = i30;
                            j04.f11783c = i9;
                            j04.f11784d = i31;
                            j04.f11785e = true;
                            break;
                        }
                        i29 += 2;
                        c1413w5 = c1413w;
                    }
                    if (j04 != null) {
                        j02 = j04;
                        break;
                    }
                    i21++;
                    iA = i8;
                    arrayList6 = arrayList;
                    arrayList7 = arrayList2;
                    c1413w5 = c1413w;
                    i17 = 1;
                    i15 = 0;
                }
                arrayList = arrayList6;
                arrayList2 = arrayList7;
                c1413w = c1413w5;
                j02 = null;
            }
            if (j02 != null) {
                if (j02.a() > 0) {
                    int i32 = j02.f11784d;
                    int i33 = j02.f11782b;
                    int i34 = i32 - i33;
                    int i35 = j02.f11783c;
                    int i36 = j02.f11781a;
                    int i37 = i35 - i36;
                    arrayList5.add(i34 != i37 ? j02.f11785e ? new C1410t(i36, i33, j02.a()) : i34 > i37 ? new C1410t(i36, i33 + 1, j02.a()) : new C1410t(i36 + 1, i33, j02.a()) : new C1410t(i36, i33, i37));
                }
                if (arrayList2.isEmpty()) {
                    c1413w2 = new C1413w();
                    arrayList4 = arrayList2;
                    c1413w3 = c1413w;
                    i6 = 1;
                } else {
                    i6 = 1;
                    arrayList4 = arrayList2;
                    c1413w2 = (C1413w) arrayList4.remove(arrayList2.size() - 1);
                    c1413w3 = c1413w;
                }
                c1413w2.f13272a = c1413w3.f13272a;
                c1413w2.f13274c = c1413w3.f13274c;
                c1413w2.f13273b = j02.f11781a;
                c1413w2.f13275d = j02.f11782b;
                arrayList3 = arrayList;
                arrayList3.add(c1413w2);
                c1413w3.f13273b = c1413w3.f13273b;
                c1413w3.f13275d = c1413w3.f13275d;
                c1413w3.f13272a = j02.f11783c;
                c1413w3.f13274c = j02.f11784d;
                arrayList3.add(c1413w3);
            } else {
                arrayList3 = arrayList;
                arrayList4 = arrayList2;
                i6 = 1;
                arrayList4.add(c1413w);
            }
            i17 = i6;
            arrayList6 = arrayList3;
            arrayList7 = arrayList4;
            i15 = 0;
        }
        Collections.sort(arrayList5, f13278a);
        return new C1411u(abstractC1414x, arrayList5, iArr, iArr2);
    }

    public abstract boolean a(int i6, int i7);

    public abstract boolean b(Object obj, Object obj2);

    public abstract boolean c(int i6, int i7);

    public abstract boolean d(Object obj, Object obj2);

    public abstract Object f(int i6, int i7);

    public abstract int g();

    public abstract int h();
}
