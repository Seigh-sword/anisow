package o0;

import h0.C0733A;
import i.C0803c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import s4.AbstractC1305a;

/* JADX INFO: loaded from: classes.dex */
public final class F0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final J0 f11749a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f11750b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayList f11751c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f11752d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f11753e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f11754f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f11755g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f11756h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final O4.c f11757i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final O4.c f11758j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final LinkedHashMap f11759k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final C0803c f11760l;

    public F0(J0 j02) {
        this.f11749a = j02;
        ArrayList arrayList = new ArrayList();
        this.f11750b = arrayList;
        this.f11751c = arrayList;
        this.f11757i = S3.a.a(-1, null, 6);
        this.f11758j = S3.a.a(-1, null, 6);
        this.f11759k = new LinkedHashMap();
        C0803c c0803c = new C0803c(11);
        c0803c.P(I.f11772w, C1169E.f11745b);
        this.f11760l = c0803c;
    }

    public final f1 a(A1 a12) {
        Integer numValueOf;
        int i6;
        int size;
        ArrayList arrayList = this.f11751c;
        List listK0 = t4.n.k0(arrayList);
        J0 j02 = this.f11749a;
        if (a12 != null) {
            int iD = d();
            int i7 = -this.f11752d;
            int iU = S3.a.u(arrayList) - this.f11752d;
            int i8 = i7;
            while (true) {
                i6 = a12.f11732e;
                if (i8 >= i6) {
                    break;
                }
                if (i8 > iU) {
                    j02.getClass();
                    size = 30;
                } else {
                    size = ((C1175b1) arrayList.get(this.f11752d + i8)).f11897w.size();
                }
                iD += size;
                i8++;
            }
            int i9 = iD + a12.f11733f;
            if (i6 < i7) {
                j02.getClass();
                i9 -= 30;
            }
            numValueOf = Integer.valueOf(i9);
        } else {
            numValueOf = null;
        }
        return new f1(listK0, numValueOf, j02, d());
    }

    public final void b(L l5) {
        Integer numValueOf;
        O4.c cVar;
        int iA = l5.a();
        ArrayList arrayList = this.f11751c;
        if (iA > arrayList.size()) {
            throw new IllegalStateException(("invalid drop count. have " + arrayList.size() + " but wanted to drop " + l5.a()).toString());
        }
        LinkedHashMap linkedHashMap = this.f11759k;
        I i6 = l5.f11796a;
        linkedHashMap.remove(i6);
        this.f11760l.P(i6, F.f11748c);
        int iOrdinal = i6.ordinal();
        ArrayList arrayList2 = this.f11750b;
        int i7 = l5.f11799d;
        if (iOrdinal == 1) {
            int iA2 = l5.a();
            for (int i8 = 0; i8 < iA2; i8++) {
                arrayList2.remove(0);
            }
            this.f11752d -= l5.a();
            this.f11753e = i7 != Integer.MIN_VALUE ? i7 : 0;
            int i9 = this.f11755g + 1;
            this.f11755g = i9;
            numValueOf = Integer.valueOf(i9);
            cVar = this.f11757i;
        } else {
            if (iOrdinal != 2) {
                throw new IllegalArgumentException("cannot drop " + i6);
            }
            int iA3 = l5.a();
            for (int i10 = 0; i10 < iA3; i10++) {
                arrayList2.remove(arrayList.size() - 1);
            }
            this.f11754f = i7 != Integer.MIN_VALUE ? i7 : 0;
            int i11 = this.f11756h + 1;
            this.f11756h = i11;
            numValueOf = Integer.valueOf(i11);
            cVar = this.f11758j;
        }
        cVar.m(numValueOf);
    }

    public final L c(I i6, C1 c12) {
        AbstractC1305a.o(i6, "loadType");
        AbstractC1305a.o(c12, "hint");
        J0 j02 = this.f11749a;
        L l5 = null;
        if (j02.f11783c == Integer.MAX_VALUE) {
            return null;
        }
        ArrayList arrayList = this.f11751c;
        if (arrayList.size() <= 2) {
            return null;
        }
        Iterator it = arrayList.iterator();
        int size = 0;
        while (it.hasNext()) {
            size += ((C1175b1) it.next()).f11897w.size();
        }
        int i7 = j02.f11783c;
        if (size <= i7) {
            return null;
        }
        if (i6 == I.f11772w) {
            throw new IllegalArgumentException(("Drop LoadType must be PREPEND or APPEND, but got " + i6).toString());
        }
        int i8 = 0;
        int i9 = 0;
        while (i8 < arrayList.size()) {
            Iterator it2 = arrayList.iterator();
            int size2 = 0;
            while (it2.hasNext()) {
                size2 += ((C1175b1) it2.next()).f11897w.size();
            }
            if (size2 - i9 <= i7) {
                break;
            }
            int[] iArr = C0.f11738a;
            int size3 = (iArr[i6.ordinal()] == 2 ? (C1175b1) arrayList.get(i8) : (C1175b1) arrayList.get(S3.a.u(arrayList) - i8)).f11897w.size();
            if (((iArr[i6.ordinal()] == 2 ? c12.f11739a : c12.f11740b) - i9) - size3 < j02.f11781a) {
                break;
            }
            i9 += size3;
            i8++;
        }
        if (i8 != 0) {
            int[] iArr2 = C0.f11738a;
            int iU = iArr2[i6.ordinal()] == 2 ? -this.f11752d : (S3.a.u(arrayList) - this.f11752d) - (i8 - 1);
            int iU2 = iArr2[i6.ordinal()] == 2 ? (i8 - 1) - this.f11752d : S3.a.u(arrayList) - this.f11752d;
            if (j02.f11785e) {
                if (i6 == I.f11773x) {
                    iD = d() + i9;
                } else {
                    iD = (j02.f11785e ? this.f11754f : 0) + i9;
                }
            }
            l5 = new L(i6, iU, iU2, iD);
        }
        return l5;
    }

    public final int d() {
        if (this.f11749a.f11785e) {
            return this.f11753e;
        }
        return 0;
    }

    public final boolean e(int i6, I i7, C1175b1 c1175b1) {
        I i8;
        AbstractC1305a.o(i7, "loadType");
        AbstractC1305a.o(c1175b1, "page");
        int iOrdinal = i7.ordinal();
        ArrayList arrayList = this.f11750b;
        ArrayList arrayList2 = this.f11751c;
        int i9 = c1175b1.f11900z;
        int i10 = c1175b1.f11896A;
        if (iOrdinal != 0) {
            LinkedHashMap linkedHashMap = this.f11759k;
            List list = c1175b1.f11897w;
            if (iOrdinal != 1) {
                if (iOrdinal == 2) {
                    if (!(!arrayList2.isEmpty())) {
                        throw new IllegalStateException("should've received an init before append".toString());
                    }
                    if (i6 != this.f11756h) {
                        return false;
                    }
                    arrayList.add(c1175b1);
                    if (i10 == Integer.MIN_VALUE) {
                        int size = (this.f11749a.f11785e ? this.f11754f : 0) - list.size();
                        i10 = size < 0 ? 0 : size;
                    }
                    this.f11754f = i10 != Integer.MIN_VALUE ? i10 : 0;
                    i8 = I.f11774y;
                }
            } else {
                if (!(!arrayList2.isEmpty())) {
                    throw new IllegalStateException("should've received an init before prepend".toString());
                }
                if (i6 != this.f11755g) {
                    return false;
                }
                arrayList.add(0, c1175b1);
                this.f11752d++;
                if (i9 == Integer.MIN_VALUE) {
                    int iD = d() - list.size();
                    i9 = iD < 0 ? 0 : iD;
                }
                this.f11753e = i9 != Integer.MIN_VALUE ? i9 : 0;
                i8 = I.f11773x;
            }
            linkedHashMap.remove(i8);
        } else {
            if (!arrayList2.isEmpty()) {
                throw new IllegalStateException("cannot receive multiple init calls".toString());
            }
            if (i6 != 0) {
                throw new IllegalStateException("init loadId must be the initial value, 0".toString());
            }
            arrayList.add(c1175b1);
            this.f11752d = 0;
            if (i10 == Integer.MIN_VALUE) {
                i10 = 0;
            }
            this.f11754f = i10;
            this.f11753e = i9 != Integer.MIN_VALUE ? i9 : 0;
        }
        return true;
    }

    public final M f(C1175b1 c1175b1, I i6) {
        int size;
        AbstractC1305a.o(c1175b1, "<this>");
        int iOrdinal = i6.ordinal();
        if (iOrdinal == 0) {
            size = 0;
        } else if (iOrdinal == 1) {
            size = 0 - this.f11752d;
        } else {
            if (iOrdinal != 2) {
                throw new C0733A();
            }
            size = (this.f11751c.size() - this.f11752d) - 1;
        }
        List listD = S3.a.D(new y1(size, c1175b1.f11897w));
        int iOrdinal2 = i6.ordinal();
        C0803c c0803c = this.f11760l;
        J0 j02 = this.f11749a;
        if (iOrdinal2 == 0) {
            M m5 = M.f11802g;
            return new M(I.f11772w, listD, d(), j02.f11785e ? this.f11754f : 0, c0803c.S(), null);
        }
        if (iOrdinal2 == 1) {
            M m6 = M.f11802g;
            return new M(I.f11773x, listD, d(), -1, c0803c.S(), null);
        }
        if (iOrdinal2 != 2) {
            throw new C0733A();
        }
        M m7 = M.f11802g;
        return new M(I.f11774y, listD, -1, j02.f11785e ? this.f11754f : 0, c0803c.S(), null);
    }
}
