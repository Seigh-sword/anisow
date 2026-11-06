package v0;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: v0.u, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1411u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f13240a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int[] f13241b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int[] f13242c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final AbstractC1414x f13243d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f13244e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f13245f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f13246g;

    public C1411u(AbstractC1414x abstractC1414x, ArrayList arrayList, int[] iArr, int[] iArr2) {
        int[] iArr3;
        int[] iArr4;
        AbstractC1414x abstractC1414x2;
        int i6;
        C1410t c1410t;
        int i7;
        this.f13240a = arrayList;
        this.f13241b = iArr;
        this.f13242c = iArr2;
        Arrays.fill(iArr, 0);
        Arrays.fill(iArr2, 0);
        this.f13243d = abstractC1414x;
        int iH = abstractC1414x.h();
        this.f13244e = iH;
        int iG = abstractC1414x.g();
        this.f13245f = iG;
        this.f13246g = true;
        C1410t c1410t2 = arrayList.isEmpty() ? null : (C1410t) arrayList.get(0);
        if (c1410t2 == null || c1410t2.f13230a != 0 || c1410t2.f13231b != 0) {
            arrayList.add(0, new C1410t(0, 0, 0));
        }
        arrayList.add(new C1410t(iH, iG, 0));
        Iterator it = arrayList.iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            iArr3 = this.f13242c;
            iArr4 = this.f13241b;
            abstractC1414x2 = this.f13243d;
            if (!zHasNext) {
                break;
            }
            C1410t c1410t3 = (C1410t) it.next();
            for (int i8 = 0; i8 < c1410t3.f13232c; i8++) {
                int i9 = c1410t3.f13230a + i8;
                int i10 = c1410t3.f13231b + i8;
                int i11 = abstractC1414x2.a(i9, i10) ? 1 : 2;
                iArr4[i9] = (i10 << 4) | i11;
                iArr3[i10] = (i9 << 4) | i11;
            }
        }
        if (this.f13246g) {
            Iterator it2 = arrayList.iterator();
            int i12 = 0;
            while (it2.hasNext()) {
                C1410t c1410t4 = (C1410t) it2.next();
                while (true) {
                    i6 = c1410t4.f13230a;
                    if (i12 < i6) {
                        if (iArr4[i12] == 0) {
                            int size = arrayList.size();
                            int i13 = 0;
                            int i14 = 0;
                            while (true) {
                                if (i13 < size) {
                                    c1410t = (C1410t) arrayList.get(i13);
                                    while (true) {
                                        i7 = c1410t.f13231b;
                                        if (i14 < i7) {
                                            if (iArr3[i14] == 0 && abstractC1414x2.c(i12, i14)) {
                                                int i15 = abstractC1414x2.a(i12, i14) ? 8 : 4;
                                                iArr4[i12] = (i14 << 4) | i15;
                                                iArr3[i14] = i15 | (i12 << 4);
                                            } else {
                                                i14++;
                                            }
                                        }
                                    }
                                }
                                i14 = c1410t.f13232c + i7;
                                i13++;
                            }
                        }
                        i12++;
                    }
                }
                i12 = c1410t4.f13232c + i6;
            }
        }
    }

    public static C1412v c(ArrayDeque arrayDeque, int i6, boolean z5) {
        C1412v c1412v;
        Iterator it = arrayDeque.iterator();
        while (true) {
            if (!it.hasNext()) {
                c1412v = null;
                break;
            }
            c1412v = (C1412v) it.next();
            if (c1412v.f13267a == i6 && c1412v.f13269c == z5) {
                it.remove();
                break;
            }
        }
        while (it.hasNext()) {
            C1412v c1412v2 = (C1412v) it.next();
            int i7 = c1412v2.f13268b;
            c1412v2.f13268b = z5 ? i7 - 1 : i7 + 1;
        }
        return c1412v;
    }

    public final int a(int i6) {
        int i7 = this.f13244e;
        if (i6 < 0 || i6 >= i7) {
            throw new IndexOutOfBoundsException(H1.a.k("Index out of bounds - passed position = ", i6, ", old list size = ", i7));
        }
        int i8 = this.f13241b[i6];
        if ((i8 & 15) == 0) {
            return -1;
        }
        return i8 >> 4;
    }

    public final void b(O o3) {
        int[] iArr;
        AbstractC1414x abstractC1414x;
        int i6;
        int i7;
        List list;
        int i8;
        C1411u c1411u = this;
        C1400i c1400i = o3 instanceof C1400i ? (C1400i) o3 : new C1400i(o3);
        ArrayDeque arrayDeque = new ArrayDeque();
        List list2 = c1411u.f13240a;
        int size = list2.size() - 1;
        int i9 = c1411u.f13244e;
        int i10 = c1411u.f13245f;
        int i11 = i9;
        while (size >= 0) {
            C1410t c1410t = (C1410t) list2.get(size);
            int i12 = c1410t.f13230a;
            int i13 = c1410t.f13232c;
            int i14 = i12 + i13;
            int i15 = c1410t.f13231b;
            int i16 = i15 + i13;
            while (true) {
                iArr = c1411u.f13241b;
                abstractC1414x = c1411u.f13243d;
                i6 = 0;
                if (i11 <= i14) {
                    break;
                }
                i11--;
                int i17 = iArr[i11];
                if ((i17 & 12) != 0) {
                    list = list2;
                    int i18 = i17 >> 4;
                    C1412v c1412vC = c(arrayDeque, i18, false);
                    if (c1412vC != null) {
                        i8 = i10;
                        int i19 = (i9 - c1412vC.f13268b) - 1;
                        c1400i.c(i11, i19);
                        if ((i17 & 4) != 0) {
                            c1400i.d(i19, 1, abstractC1414x.f(i11, i18));
                        }
                    } else {
                        i8 = i10;
                        arrayDeque.add(new C1412v(i11, (i9 - i11) - 1, true));
                    }
                } else {
                    list = list2;
                    i8 = i10;
                    c1400i.a(i11, 1);
                    i9--;
                }
                list2 = list;
                i10 = i8;
            }
            List list3 = list2;
            while (i10 > i16) {
                i10--;
                int i20 = c1411u.f13242c[i10];
                if ((i20 & 12) != 0) {
                    int i21 = i20 >> 4;
                    C1412v c1412vC2 = c(arrayDeque, i21, true);
                    if (c1412vC2 == null) {
                        arrayDeque.add(new C1412v(i10, i9 - i11, false));
                        i7 = 0;
                    } else {
                        i7 = 0;
                        c1400i.c((i9 - c1412vC2.f13268b) - 1, i11);
                        if ((i20 & 4) != 0) {
                            c1400i.d(i11, 1, abstractC1414x.f(i21, i10));
                        }
                    }
                } else {
                    i7 = i6;
                    c1400i.b(i11, 1);
                    i9++;
                }
                c1411u = this;
                i6 = i7;
            }
            i11 = c1410t.f13230a;
            int i22 = i11;
            int i23 = i15;
            while (i6 < i13) {
                if ((iArr[i22] & 15) == 2) {
                    c1400i.d(i22, 1, abstractC1414x.f(i22, i23));
                }
                i22++;
                i23++;
                i6++;
            }
            size--;
            c1411u = this;
            i10 = i15;
            list2 = list3;
        }
        c1400i.e();
    }
}
