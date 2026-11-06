package v0;

import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;

/* JADX INFO: renamed from: v0.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1388b {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final V f13081d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final u.e f13078a = new u.e(30, 1);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f13079b = new ArrayList();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayList f13080c = new ArrayList();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f13083f = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final T1.j f13082e = new T1.j(2, this);

    public C1388b(V v5) {
        this.f13081d = v5;
    }

    public final boolean a(int i6) {
        ArrayList arrayList = this.f13080c;
        int size = arrayList.size();
        for (int i7 = 0; i7 < size; i7++) {
            C1386a c1386a = (C1386a) arrayList.get(i7);
            int i8 = c1386a.f13074a;
            if (i8 == 8) {
                if (f(c1386a.f13077d, i7 + 1) == i6) {
                    return true;
                }
            } else if (i8 == 1) {
                int i9 = c1386a.f13075b;
                int i10 = c1386a.f13077d + i9;
                while (i9 < i10) {
                    if (f(i9, i7 + 1) == i6) {
                        return true;
                    }
                    i9++;
                }
            } else {
                continue;
            }
        }
        return false;
    }

    public final void b() {
        ArrayList arrayList = this.f13080c;
        int size = arrayList.size();
        for (int i6 = 0; i6 < size; i6++) {
            this.f13081d.a((C1386a) arrayList.get(i6));
        }
        l(arrayList);
        this.f13083f = 0;
    }

    public final void c() {
        b();
        ArrayList arrayList = this.f13079b;
        int size = arrayList.size();
        for (int i6 = 0; i6 < size; i6++) {
            C1386a c1386a = (C1386a) arrayList.get(i6);
            int i7 = c1386a.f13074a;
            V v5 = this.f13081d;
            if (i7 == 1) {
                v5.a(c1386a);
                v5.d(c1386a.f13075b, c1386a.f13077d);
            } else if (i7 == 2) {
                v5.a(c1386a);
                int i8 = c1386a.f13075b;
                int i9 = c1386a.f13077d;
                RecyclerView recyclerView = v5.f13070a;
                recyclerView.O(i8, i9, true);
                recyclerView.E0 = true;
                recyclerView.f5692B0.f13216c += i9;
            } else if (i7 == 4) {
                v5.a(c1386a);
                v5.c(c1386a.f13075b, c1386a.f13077d, c1386a.f13076c);
            } else if (i7 == 8) {
                v5.a(c1386a);
                v5.e(c1386a.f13075b, c1386a.f13077d);
            }
        }
        l(arrayList);
        this.f13083f = 0;
    }

    public final void d(C1386a c1386a) {
        int i6;
        int i7 = c1386a.f13074a;
        if (i7 == 1 || i7 == 8) {
            throw new IllegalArgumentException("should not dispatch add or move for pre layout");
        }
        int iM = m(c1386a.f13075b, i7);
        int i8 = c1386a.f13075b;
        int i9 = c1386a.f13074a;
        if (i9 == 2) {
            i6 = 0;
        } else {
            if (i9 != 4) {
                throw new IllegalArgumentException("op should be remove or update." + c1386a);
            }
            i6 = 1;
        }
        int i10 = 1;
        for (int i11 = 1; i11 < c1386a.f13077d; i11++) {
            int iM2 = m((i6 * i11) + c1386a.f13075b, c1386a.f13074a);
            int i12 = c1386a.f13074a;
            if (i12 == 2 ? iM2 != iM : !(i12 == 4 && iM2 == iM + 1)) {
                C1386a c1386aH = h(c1386a.f13076c, i12, iM, i10);
                e(c1386aH, i8);
                c1386aH.f13076c = null;
                this.f13078a.d(c1386aH);
                if (c1386a.f13074a == 4) {
                    i8 += i10;
                }
                i10 = 1;
                iM = iM2;
            } else {
                i10++;
            }
        }
        Object obj = c1386a.f13076c;
        c1386a.f13076c = null;
        this.f13078a.d(c1386a);
        if (i10 > 0) {
            C1386a c1386aH2 = h(obj, c1386a.f13074a, iM, i10);
            e(c1386aH2, i8);
            c1386aH2.f13076c = null;
            this.f13078a.d(c1386aH2);
        }
    }

    public final void e(C1386a c1386a, int i6) {
        V v5 = this.f13081d;
        v5.a(c1386a);
        int i7 = c1386a.f13074a;
        if (i7 != 2) {
            if (i7 != 4) {
                throw new IllegalArgumentException("only remove and update ops can be dispatched in first pass");
            }
            v5.c(i6, c1386a.f13077d, c1386a.f13076c);
        } else {
            int i8 = c1386a.f13077d;
            RecyclerView recyclerView = v5.f13070a;
            recyclerView.O(i6, i8, true);
            recyclerView.E0 = true;
            recyclerView.f5692B0.f13216c += i8;
        }
    }

    public final int f(int i6, int i7) {
        ArrayList arrayList = this.f13080c;
        int size = arrayList.size();
        while (i7 < size) {
            C1386a c1386a = (C1386a) arrayList.get(i7);
            int i8 = c1386a.f13074a;
            if (i8 == 8) {
                int i9 = c1386a.f13075b;
                if (i9 == i6) {
                    i6 = c1386a.f13077d;
                } else {
                    if (i9 < i6) {
                        i6--;
                    }
                    if (c1386a.f13077d <= i6) {
                        i6++;
                    }
                }
            } else {
                int i10 = c1386a.f13075b;
                if (i10 > i6) {
                    continue;
                } else if (i8 == 2) {
                    int i11 = c1386a.f13077d;
                    if (i6 < i10 + i11) {
                        return -1;
                    }
                    i6 -= i11;
                } else if (i8 == 1) {
                    i6 += c1386a.f13077d;
                }
            }
            i7++;
        }
        return i6;
    }

    public final boolean g() {
        return this.f13079b.size() > 0;
    }

    public final C1386a h(Object obj, int i6, int i7, int i8) {
        C1386a c1386a = (C1386a) this.f13078a.h();
        if (c1386a != null) {
            c1386a.f13074a = i6;
            c1386a.f13075b = i7;
            c1386a.f13077d = i8;
            c1386a.f13076c = obj;
            return c1386a;
        }
        C1386a c1386a2 = new C1386a();
        c1386a2.f13074a = i6;
        c1386a2.f13075b = i7;
        c1386a2.f13077d = i8;
        c1386a2.f13076c = obj;
        return c1386a2;
    }

    public final void i(C1386a c1386a) {
        this.f13080c.add(c1386a);
        int i6 = c1386a.f13074a;
        V v5 = this.f13081d;
        if (i6 == 1) {
            v5.d(c1386a.f13075b, c1386a.f13077d);
            return;
        }
        if (i6 == 2) {
            int i7 = c1386a.f13075b;
            int i8 = c1386a.f13077d;
            RecyclerView recyclerView = v5.f13070a;
            recyclerView.O(i7, i8, false);
            recyclerView.E0 = true;
            return;
        }
        if (i6 == 4) {
            v5.c(c1386a.f13075b, c1386a.f13077d, c1386a.f13076c);
        } else if (i6 == 8) {
            v5.e(c1386a.f13075b, c1386a.f13077d);
        } else {
            throw new IllegalArgumentException("Unknown update op type for " + c1386a);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x019a  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x019e  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x00aa A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:184:0x0136 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:187:0x0122 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:188:0x01a3 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:197:0x0009 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:201:0x0009 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0161 A[PHI: r5
      0x0161: PHI (r5v30 int) = (r5v23 int), (r5v33 int) binds: [B:99:0x018e, B:86:0x015f] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void j() {
        /*
            Method dump skipped, instruction units count: 683
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: v0.C1388b.j():void");
    }

    public final void k(C1386a c1386a) {
        c1386a.f13076c = null;
        this.f13078a.d(c1386a);
    }

    public final void l(ArrayList arrayList) {
        int size = arrayList.size();
        for (int i6 = 0; i6 < size; i6++) {
            k((C1386a) arrayList.get(i6));
        }
        arrayList.clear();
    }

    /* JADX WARN: Removed duplicated region for block: B:51:0x0094  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int m(int r10, int r11) {
        /*
            r9 = this;
            java.util.ArrayList r0 = r9.f13080c
            int r1 = r0.size()
            r2 = 1
            int r1 = r1 - r2
        L8:
            r3 = 8
            if (r1 < 0) goto L7b
            java.lang.Object r4 = r0.get(r1)
            v0.a r4 = (v0.C1386a) r4
            int r5 = r4.f13074a
            r6 = 2
            if (r5 != r3) goto L5c
            int r3 = r4.f13075b
            int r5 = r4.f13077d
            if (r3 >= r5) goto L20
            r7 = r3
            r8 = r5
            goto L22
        L20:
            r8 = r3
            r7 = r5
        L22:
            if (r10 < r7) goto L46
            if (r10 > r8) goto L46
            if (r7 != r3) goto L37
            if (r11 != r2) goto L2f
            int r5 = r5 + 1
        L2c:
            r4.f13077d = r5
            goto L34
        L2f:
            if (r11 != r6) goto L34
            int r5 = r5 + (-1)
            goto L2c
        L34:
            int r10 = r10 + 1
            goto L78
        L37:
            if (r11 != r2) goto L3e
            int r3 = r3 + 1
        L3b:
            r4.f13075b = r3
            goto L43
        L3e:
            if (r11 != r6) goto L43
            int r3 = r3 + (-1)
            goto L3b
        L43:
            int r10 = r10 + (-1)
            goto L78
        L46:
            if (r10 >= r3) goto L78
            if (r11 != r2) goto L53
            int r3 = r3 + 1
            r4.f13075b = r3
            int r5 = r5 + 1
        L50:
            r4.f13077d = r5
            goto L78
        L53:
            if (r11 != r6) goto L78
            int r3 = r3 + (-1)
            r4.f13075b = r3
            int r5 = r5 + (-1)
            goto L50
        L5c:
            int r3 = r4.f13075b
            if (r3 > r10) goto L6c
            if (r5 != r2) goto L66
            int r3 = r4.f13077d
            int r10 = r10 - r3
            goto L78
        L66:
            if (r5 != r6) goto L78
            int r3 = r4.f13077d
            int r10 = r10 + r3
            goto L78
        L6c:
            if (r11 != r2) goto L73
            int r3 = r3 + 1
        L70:
            r4.f13075b = r3
            goto L78
        L73:
            if (r11 != r6) goto L78
            int r3 = r3 + (-1)
            goto L70
        L78:
            int r1 = r1 + (-1)
            goto L8
        L7b:
            int r11 = r0.size()
            int r11 = r11 - r2
        L80:
            if (r11 < 0) goto La3
            java.lang.Object r1 = r0.get(r11)
            v0.a r1 = (v0.C1386a) r1
            int r2 = r1.f13074a
            if (r2 != r3) goto L9b
            int r2 = r1.f13077d
            int r4 = r1.f13075b
            if (r2 == r4) goto L94
            if (r2 >= 0) goto La0
        L94:
            r0.remove(r11)
            r9.k(r1)
            goto La0
        L9b:
            int r2 = r1.f13077d
            if (r2 > 0) goto La0
            goto L94
        La0:
            int r11 = r11 + (-1)
            goto L80
        La3:
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: v0.C1388b.m(int, int):int");
    }
}
