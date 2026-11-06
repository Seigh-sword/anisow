package w;

import i.C0803c;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import x.n;
import x.p;

/* JADX INFO: renamed from: w.e, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1438e extends AbstractC1445l {

    /* JADX INFO: renamed from: A0, reason: collision with root package name */
    public int f13408A0;

    /* JADX INFO: renamed from: B0, reason: collision with root package name */
    public C1435b[] f13409B0;

    /* JADX INFO: renamed from: C0, reason: collision with root package name */
    public C1435b[] f13410C0;

    /* JADX INFO: renamed from: D0, reason: collision with root package name */
    public int f13411D0;
    public boolean E0;

    /* JADX INFO: renamed from: F0, reason: collision with root package name */
    public boolean f13412F0;

    /* JADX INFO: renamed from: G0, reason: collision with root package name */
    public WeakReference f13413G0;

    /* JADX INFO: renamed from: H0, reason: collision with root package name */
    public WeakReference f13414H0;

    /* JADX INFO: renamed from: I0, reason: collision with root package name */
    public WeakReference f13415I0;

    /* JADX INFO: renamed from: J0, reason: collision with root package name */
    public WeakReference f13416J0;

    /* JADX INFO: renamed from: K0, reason: collision with root package name */
    public final HashSet f13417K0;

    /* JADX INFO: renamed from: L0, reason: collision with root package name */
    public final x.b f13418L0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final C0803c f13419r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public final x.e f13420s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public int f13421t0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public n f13422u0;

    /* JADX INFO: renamed from: v0, reason: collision with root package name */
    public boolean f13423v0;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public final u.d f13424w0;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    public int f13425x0;

    /* JADX INFO: renamed from: y0, reason: collision with root package name */
    public int f13426y0;

    /* JADX INFO: renamed from: z0, reason: collision with root package name */
    public int f13427z0;

    public C1438e() {
        this.f13489q0 = new ArrayList();
        this.f13419r0 = new C0803c(this);
        x.e eVar = new x.e();
        eVar.f13613b = true;
        eVar.f13614c = true;
        eVar.f13616e = new ArrayList();
        new ArrayList();
        eVar.f13617f = null;
        eVar.f13618g = new x.b();
        eVar.f13619h = new ArrayList();
        eVar.f13612a = this;
        eVar.f13615d = this;
        this.f13420s0 = eVar;
        this.f13422u0 = null;
        this.f13423v0 = false;
        this.f13424w0 = new u.d();
        this.f13427z0 = 0;
        this.f13408A0 = 0;
        this.f13409B0 = new C1435b[4];
        this.f13410C0 = new C1435b[4];
        this.f13411D0 = 257;
        this.E0 = false;
        this.f13412F0 = false;
        this.f13413G0 = null;
        this.f13414H0 = null;
        this.f13415I0 = null;
        this.f13416J0 = null;
        this.f13417K0 = new HashSet();
        this.f13418L0 = new x.b();
    }

    public static void W(C1437d c1437d, n nVar, x.b bVar) {
        int i6;
        int i7;
        if (nVar == null) {
            return;
        }
        if (c1437d.f13379g0 == 8 || (c1437d instanceof C1441h) || (c1437d instanceof C1434a)) {
            bVar.f13604e = 0;
            bVar.f13605f = 0;
            return;
        }
        int[] iArr = c1437d.f13397p0;
        bVar.f13600a = iArr[0];
        bVar.f13601b = iArr[1];
        bVar.f13602c = c1437d.r();
        bVar.f13603d = c1437d.l();
        bVar.f13608i = false;
        bVar.f13609j = 0;
        boolean z5 = bVar.f13600a == 3;
        boolean z6 = bVar.f13601b == 3;
        boolean z7 = z5 && c1437d.f13362W > 0.0f;
        boolean z8 = z6 && c1437d.f13362W > 0.0f;
        if (z5 && c1437d.u(0) && c1437d.f13399r == 0 && !z7) {
            bVar.f13600a = 2;
            if (z6 && c1437d.f13400s == 0) {
                bVar.f13600a = 1;
            }
            z5 = false;
        }
        if (z6 && c1437d.u(1) && c1437d.f13400s == 0 && !z8) {
            bVar.f13601b = 2;
            if (z5 && c1437d.f13399r == 0) {
                bVar.f13601b = 1;
            }
            z6 = false;
        }
        if (c1437d.B()) {
            bVar.f13600a = 1;
            z5 = false;
        }
        if (c1437d.C()) {
            bVar.f13601b = 1;
            z6 = false;
        }
        int[] iArr2 = c1437d.f13401t;
        if (z7) {
            if (iArr2[0] == 4) {
                bVar.f13600a = 1;
            } else if (!z6) {
                if (bVar.f13601b == 1) {
                    i7 = bVar.f13603d;
                } else {
                    bVar.f13600a = 2;
                    nVar.b(c1437d, bVar);
                    i7 = bVar.f13605f;
                }
                bVar.f13600a = 1;
                bVar.f13602c = (int) (c1437d.f13362W * i7);
            }
        }
        if (z8) {
            if (iArr2[1] == 4) {
                bVar.f13601b = 1;
            } else if (!z5) {
                if (bVar.f13600a == 1) {
                    i6 = bVar.f13602c;
                } else {
                    bVar.f13601b = 2;
                    nVar.b(c1437d, bVar);
                    i6 = bVar.f13604e;
                }
                bVar.f13601b = 1;
                bVar.f13603d = c1437d.f13363X == -1 ? (int) (i6 / c1437d.f13362W) : (int) (c1437d.f13362W * i6);
            }
        }
        nVar.b(c1437d, bVar);
        c1437d.P(bVar.f13604e);
        c1437d.M(bVar.f13605f);
        c1437d.f13344E = bVar.f13607h;
        c1437d.J(bVar.f13606g);
        bVar.f13609j = 0;
    }

    @Override // w.AbstractC1445l, w.C1437d
    public final void D() {
        this.f13424w0.t();
        this.f13425x0 = 0;
        this.f13426y0 = 0;
        super.D();
    }

    @Override // w.C1437d
    public final void Q(boolean z5, boolean z6) {
        super.Q(z5, z6);
        int size = this.f13489q0.size();
        for (int i6 = 0; i6 < size; i6++) {
            ((C1437d) this.f13489q0.get(i6)).Q(z5, z6);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:349:0x05d1  */
    /* JADX WARN: Removed duplicated region for block: B:361:0x05fc  */
    /* JADX WARN: Removed duplicated region for block: B:376:0x062f  */
    /* JADX WARN: Removed duplicated region for block: B:381:0x0645  */
    /* JADX WARN: Removed duplicated region for block: B:386:0x0653  */
    /* JADX WARN: Removed duplicated region for block: B:390:0x065e  */
    /* JADX WARN: Removed duplicated region for block: B:393:0x0669 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:395:0x066f  */
    /* JADX WARN: Removed duplicated region for block: B:398:0x0677  */
    /* JADX WARN: Removed duplicated region for block: B:402:0x067e  */
    /* JADX WARN: Removed duplicated region for block: B:405:0x0688  */
    /* JADX WARN: Removed duplicated region for block: B:411:0x06a5  */
    /* JADX WARN: Removed duplicated region for block: B:435:0x0707  */
    /* JADX WARN: Removed duplicated region for block: B:473:0x0794 A[PHI: r21 r22 r24
      0x0794: PHI (r21v4 ??) = (r21v32 ??), (r21v33 ??) binds: [B:477:0x07b1, B:472:0x0791] A[DONT_GENERATE, DONT_INLINE]
      0x0794: PHI (r22v3 w.c) = (r22v5 w.c), (r22v10 w.c) binds: [B:477:0x07b1, B:472:0x0791] A[DONT_GENERATE, DONT_INLINE]
      0x0794: PHI (r24v3 w.c) = (r24v5 w.c), (r24v12 w.c) binds: [B:477:0x07b1, B:472:0x0791] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:481:0x07c9  */
    /* JADX WARN: Removed duplicated region for block: B:488:0x07ed  */
    /* JADX WARN: Removed duplicated region for block: B:494:0x0807 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:509:0x086d  */
    /* JADX WARN: Removed duplicated region for block: B:512:0x087f  */
    /* JADX WARN: Removed duplicated region for block: B:513:0x088a  */
    /* JADX WARN: Removed duplicated region for block: B:516:0x089d  */
    /* JADX WARN: Removed duplicated region for block: B:517:0x08a5  */
    /* JADX WARN: Removed duplicated region for block: B:519:0x08a9  */
    /* JADX WARN: Removed duplicated region for block: B:532:0x08dc  */
    /* JADX WARN: Removed duplicated region for block: B:534:0x08e0  */
    /* JADX WARN: Removed duplicated region for block: B:535:0x08e2  */
    /* JADX WARN: Removed duplicated region for block: B:539:0x08f1  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0122  */
    /* JADX WARN: Type inference failed for: r0v100 */
    /* JADX WARN: Type inference failed for: r0v101 */
    /* JADX WARN: Type inference failed for: r0v102 */
    /* JADX WARN: Type inference failed for: r0v103 */
    /* JADX WARN: Type inference failed for: r0v104 */
    /* JADX WARN: Type inference failed for: r0v105 */
    /* JADX WARN: Type inference failed for: r0v106 */
    /* JADX WARN: Type inference failed for: r0v107 */
    /* JADX WARN: Type inference failed for: r0v18 */
    /* JADX WARN: Type inference failed for: r0v19 */
    /* JADX WARN: Type inference failed for: r0v20 */
    /* JADX WARN: Type inference failed for: r0v21 */
    /* JADX WARN: Type inference failed for: r0v23 */
    /* JADX WARN: Type inference failed for: r0v24 */
    /* JADX WARN: Type inference failed for: r0v25 */
    /* JADX WARN: Type inference failed for: r0v26 */
    /* JADX WARN: Type inference failed for: r0v90, types: [int] */
    /* JADX WARN: Type inference failed for: r0v98 */
    /* JADX WARN: Type inference failed for: r0v99 */
    /* JADX WARN: Type inference failed for: r11v1 */
    /* JADX WARN: Type inference failed for: r11v3 */
    /* JADX WARN: Type inference failed for: r12v12 */
    /* JADX WARN: Type inference failed for: r12v13 */
    /* JADX WARN: Type inference failed for: r12v2 */
    /* JADX WARN: Type inference failed for: r12v3 */
    /* JADX WARN: Type inference failed for: r17v0 */
    /* JADX WARN: Type inference failed for: r17v1 */
    /* JADX WARN: Type inference failed for: r17v2 */
    /* JADX WARN: Type inference failed for: r21v10 */
    /* JADX WARN: Type inference failed for: r21v11 */
    /* JADX WARN: Type inference failed for: r21v12 */
    /* JADX WARN: Type inference failed for: r21v13 */
    /* JADX WARN: Type inference failed for: r21v14 */
    /* JADX WARN: Type inference failed for: r21v15 */
    /* JADX WARN: Type inference failed for: r21v16 */
    /* JADX WARN: Type inference failed for: r21v17 */
    /* JADX WARN: Type inference failed for: r21v18 */
    /* JADX WARN: Type inference failed for: r21v19 */
    /* JADX WARN: Type inference failed for: r21v2 */
    /* JADX WARN: Type inference failed for: r21v20 */
    /* JADX WARN: Type inference failed for: r21v24 */
    /* JADX WARN: Type inference failed for: r21v25 */
    /* JADX WARN: Type inference failed for: r21v26 */
    /* JADX WARN: Type inference failed for: r21v27 */
    /* JADX WARN: Type inference failed for: r21v28 */
    /* JADX WARN: Type inference failed for: r21v29 */
    /* JADX WARN: Type inference failed for: r21v3 */
    /* JADX WARN: Type inference failed for: r21v30 */
    /* JADX WARN: Type inference failed for: r21v31 */
    /* JADX WARN: Type inference failed for: r21v32 */
    /* JADX WARN: Type inference failed for: r21v33 */
    /* JADX WARN: Type inference failed for: r21v4 */
    /* JADX WARN: Type inference failed for: r21v5 */
    /* JADX WARN: Type inference failed for: r21v6 */
    /* JADX WARN: Type inference failed for: r21v7 */
    /* JADX WARN: Type inference failed for: r21v8 */
    /* JADX WARN: Type inference failed for: r21v9 */
    /* JADX WARN: Type inference failed for: r23v0 */
    /* JADX WARN: Type inference failed for: r23v1 */
    /* JADX WARN: Type inference failed for: r23v2 */
    /* JADX WARN: Type inference failed for: r2v20 */
    /* JADX WARN: Type inference failed for: r30v0, types: [w.d, w.e, w.l] */
    /* JADX WARN: Type inference failed for: r3v18 */
    /* JADX WARN: Type inference failed for: r5v41, types: [int] */
    /* JADX WARN: Type inference failed for: r6v11 */
    /* JADX WARN: Type inference failed for: r6v12, types: [boolean] */
    /* JADX WARN: Type inference failed for: r6v17 */
    /* JADX WARN: Type inference failed for: r6v72, types: [int] */
    /* JADX WARN: Type inference failed for: r7v13 */
    /* JADX WARN: Type inference failed for: r8v15, types: [int] */
    @Override // w.AbstractC1445l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void S() {
        /*
            Method dump skipped, instruction units count: 2301
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: w.C1438e.S():void");
    }

    public final void T(int i6, C1437d c1437d) {
        if (i6 == 0) {
            int i7 = this.f13427z0 + 1;
            C1435b[] c1435bArr = this.f13410C0;
            if (i7 >= c1435bArr.length) {
                this.f13410C0 = (C1435b[]) Arrays.copyOf(c1435bArr, c1435bArr.length * 2);
            }
            C1435b[] c1435bArr2 = this.f13410C0;
            int i8 = this.f13427z0;
            c1435bArr2[i8] = new C1435b(c1437d, 0, this.f13423v0);
            this.f13427z0 = i8 + 1;
            return;
        }
        if (i6 == 1) {
            int i9 = this.f13408A0 + 1;
            C1435b[] c1435bArr3 = this.f13409B0;
            if (i9 >= c1435bArr3.length) {
                this.f13409B0 = (C1435b[]) Arrays.copyOf(c1435bArr3, c1435bArr3.length * 2);
            }
            C1435b[] c1435bArr4 = this.f13409B0;
            int i10 = this.f13408A0;
            c1435bArr4[i10] = new C1435b(c1437d, 1, this.f13423v0);
            this.f13408A0 = i10 + 1;
        }
    }

    public final void U(u.d dVar) {
        boolean zX = X(64);
        c(dVar, zX);
        int size = this.f13489q0.size();
        boolean z5 = false;
        for (int i6 = 0; i6 < size; i6++) {
            C1437d c1437d = (C1437d) this.f13489q0.get(i6);
            boolean[] zArr = c1437d.f13358S;
            zArr[0] = false;
            zArr[1] = false;
            if (c1437d instanceof C1434a) {
                z5 = true;
            }
        }
        if (z5) {
            for (int i7 = 0; i7 < size; i7++) {
                C1437d c1437d2 = (C1437d) this.f13489q0.get(i7);
                if (c1437d2 instanceof C1434a) {
                    C1434a c1434a = (C1434a) c1437d2;
                    for (int i8 = 0; i8 < c1434a.f13487r0; i8++) {
                        C1437d c1437d3 = c1434a.f13486q0[i8];
                        if (c1434a.f13311t0 || c1437d3.d()) {
                            int i9 = c1434a.f13310s0;
                            if (i9 == 0 || i9 == 1) {
                                c1437d3.f13358S[0] = true;
                            } else if (i9 == 2 || i9 == 3) {
                                c1437d3.f13358S[1] = true;
                            }
                        }
                    }
                }
            }
        }
        HashSet hashSet = this.f13417K0;
        hashSet.clear();
        for (int i10 = 0; i10 < size; i10++) {
            C1437d c1437d4 = (C1437d) this.f13489q0.get(i10);
            c1437d4.getClass();
            boolean z6 = c1437d4 instanceof C1440g;
            if (z6 || (c1437d4 instanceof C1441h)) {
                if (z6) {
                    hashSet.add(c1437d4);
                } else {
                    c1437d4.c(dVar, zX);
                }
            }
        }
        while (hashSet.size() > 0) {
            int size2 = hashSet.size();
            Iterator it = hashSet.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                C1440g c1440g = (C1440g) ((C1437d) it.next());
                for (int i11 = 0; i11 < c1440g.f13487r0; i11++) {
                    if (hashSet.contains(c1440g.f13486q0[i11])) {
                        c1440g.c(dVar, zX);
                        hashSet.remove(c1440g);
                        break;
                    }
                }
            }
            if (size2 == hashSet.size()) {
                Iterator it2 = hashSet.iterator();
                while (it2.hasNext()) {
                    ((C1437d) it2.next()).c(dVar, zX);
                }
                hashSet.clear();
            }
        }
        if (u.d.f12774p) {
            HashSet<C1437d> hashSet2 = new HashSet();
            for (int i12 = 0; i12 < size; i12++) {
                C1437d c1437d5 = (C1437d) this.f13489q0.get(i12);
                c1437d5.getClass();
                if (!(c1437d5 instanceof C1440g) && !(c1437d5 instanceof C1441h)) {
                    hashSet2.add(c1437d5);
                }
            }
            b(this, dVar, hashSet2, this.f13397p0[0] == 2 ? 0 : 1, false);
            for (C1437d c1437d6 : hashSet2) {
                AbstractC1444k.a(this, dVar, c1437d6);
                c1437d6.c(dVar, zX);
            }
        } else {
            for (int i13 = 0; i13 < size; i13++) {
                C1437d c1437d7 = (C1437d) this.f13489q0.get(i13);
                if (c1437d7 instanceof C1438e) {
                    int[] iArr = c1437d7.f13397p0;
                    int i14 = iArr[0];
                    int i15 = iArr[1];
                    if (i14 == 2) {
                        c1437d7.N(1);
                    }
                    if (i15 == 2) {
                        c1437d7.O(1);
                    }
                    c1437d7.c(dVar, zX);
                    if (i14 == 2) {
                        c1437d7.N(i14);
                    }
                    if (i15 == 2) {
                        c1437d7.O(i15);
                    }
                } else {
                    AbstractC1444k.a(this, dVar, c1437d7);
                    if (!(c1437d7 instanceof C1440g) && !(c1437d7 instanceof C1441h)) {
                        c1437d7.c(dVar, zX);
                    }
                }
            }
        }
        if (this.f13427z0 > 0) {
            com.bumptech.glide.d.a(this, dVar, null, 0);
        }
        if (this.f13408A0 > 0) {
            com.bumptech.glide.d.a(this, dVar, null, 1);
        }
    }

    public final boolean V(int i6, boolean z5) {
        boolean z6;
        x.g gVar;
        int iL;
        boolean z7 = true;
        boolean z8 = z5 & true;
        x.e eVar = this.f13420s0;
        C1438e c1438e = eVar.f13612a;
        int iK = c1438e.k(0);
        int iK2 = c1438e.k(1);
        int iS = c1438e.s();
        int iT = c1438e.t();
        ArrayList<p> arrayList = eVar.f13616e;
        if (z8 && (iK == 2 || iK2 == 2)) {
            Iterator it = arrayList.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                p pVar = (p) it.next();
                if (pVar.f13658f == i6 && !pVar.k()) {
                    z8 = false;
                    break;
                }
            }
            if (i6 == 0) {
                if (z8 && iK == 2) {
                    c1438e.N(1);
                    c1438e.P(eVar.d(c1438e, 0));
                    gVar = c1438e.f13372d.f13657e;
                    iL = c1438e.r();
                    gVar.d(iL);
                }
            } else if (z8 && iK2 == 2) {
                c1438e.O(1);
                c1438e.M(eVar.d(c1438e, 1));
                gVar = c1438e.f13374e.f13657e;
                iL = c1438e.l();
                gVar.d(iL);
            }
        }
        int[] iArr = c1438e.f13397p0;
        if (i6 == 0) {
            int i7 = iArr[0];
            if (i7 == 1 || i7 == 4) {
                int iR = c1438e.r() + iS;
                c1438e.f13372d.f13661i.d(iR);
                c1438e.f13372d.f13657e.d(iR - iS);
                z6 = true;
            }
            z6 = false;
        } else {
            int i8 = iArr[1];
            if (i8 == 1 || i8 == 4) {
                int iL2 = c1438e.l() + iT;
                c1438e.f13374e.f13661i.d(iL2);
                c1438e.f13374e.f13657e.d(iL2 - iT);
                z6 = true;
            }
            z6 = false;
        }
        eVar.g();
        for (p pVar2 : arrayList) {
            if (pVar2.f13658f == i6 && (pVar2.f13654b != c1438e || pVar2.f13659g)) {
                pVar2.e();
            }
        }
        for (p pVar3 : arrayList) {
            if (pVar3.f13658f == i6 && (z6 || pVar3.f13654b != c1438e)) {
                if (!pVar3.f13660h.f13629j || !pVar3.f13661i.f13629j || (!(pVar3 instanceof x.c) && !pVar3.f13657e.f13629j)) {
                    z7 = false;
                    break;
                }
            }
        }
        c1438e.N(iK);
        c1438e.O(iK2);
        return z7;
    }

    public final boolean X(int i6) {
        return (this.f13411D0 & i6) == i6;
    }

    @Override // w.C1437d
    public final void o(StringBuilder sb) {
        sb.append(this.f13384j + ":{\n");
        StringBuilder sb2 = new StringBuilder("  actualWidth:");
        sb2.append(this.f13360U);
        sb.append(sb2.toString());
        sb.append("\n");
        sb.append("  actualHeight:" + this.f13361V);
        sb.append("\n");
        Iterator it = this.f13489q0.iterator();
        while (it.hasNext()) {
            ((C1437d) it.next()).o(sb);
            sb.append(",\n");
        }
        sb.append("}");
    }
}
