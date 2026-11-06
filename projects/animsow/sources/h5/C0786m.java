package h5;

import android.view.View;
import h0.C0733A;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import s.C1283e;
import v0.A0;
import v0.AbstractC1397f0;
import v0.C1389b0;
import v0.D0;
import v0.E0;
import v0.F0;
import v0.u0;

/* JADX INFO: renamed from: h5.m, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0786m implements InterfaceC0785l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f9111a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f9112b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object f9113c;

    public C0786m(int i6) {
        this.f9111a = i6;
        if (i6 != 1) {
            this.f9112b = new s.k();
            this.f9113c = new C1283e();
        }
    }

    @Override // h5.InterfaceC0785l
    public void a(InterfaceC0782i interfaceC0782i, U u5) {
        int i6 = this.f9111a;
        Object obj = this.f9112b;
        switch (i6) {
            case com.bumptech.glide.d.f6312l /* 0 */:
                CompletableFuture completableFuture = (CompletableFuture) obj;
                if (!u5.f9084a.c()) {
                    completableFuture.completeExceptionally(new C0733A(u5));
                } else {
                    completableFuture.complete(u5.f9085b);
                }
                break;
            case 1:
                ((CompletableFuture) obj).complete(u5);
                break;
            default:
                ((r) this.f9113c).f9115w.execute(new c0.n(this, (InterfaceC0785l) obj, u5, 5));
                break;
        }
    }

    @Override // h5.InterfaceC0785l
    public void b(InterfaceC0782i interfaceC0782i, Throwable th) {
        int i6 = this.f9111a;
        Object obj = this.f9112b;
        switch (i6) {
            case com.bumptech.glide.d.f6312l /* 0 */:
                ((CompletableFuture) obj).completeExceptionally(th);
                break;
            case 1:
                ((CompletableFuture) obj).completeExceptionally(th);
                break;
            default:
                ((r) this.f9113c).f9115w.execute(new c0.n(this, (InterfaceC0785l) obj, th, 6));
                break;
        }
    }

    public void c(u0 u0Var) {
        F0 f0A = (F0) ((s.k) this.f9112b).getOrDefault(u0Var, null);
        if (f0A == null) {
            f0A = F0.a();
            ((s.k) this.f9112b).put(u0Var, f0A);
        }
        f0A.f13004a |= 1;
    }

    public void d(u0 u0Var, C1389b0 c1389b0) {
        F0 f0A = (F0) ((s.k) this.f9112b).getOrDefault(u0Var, null);
        if (f0A == null) {
            f0A = F0.a();
            ((s.k) this.f9112b).put(u0Var, f0A);
        }
        f0A.f13006c = c1389b0;
        f0A.f13004a |= 8;
    }

    public void e(u0 u0Var, C1389b0 c1389b0) {
        F0 f0A = (F0) ((s.k) this.f9112b).getOrDefault(u0Var, null);
        if (f0A == null) {
            f0A = F0.a();
            ((s.k) this.f9112b).put(u0Var, f0A);
        }
        f0A.f13005b = c1389b0;
        f0A.f13004a |= 4;
    }

    public void f() {
        switch (this.f9111a) {
            case com.bumptech.glide.d.f6312l /* 0 */:
                ((s.k) this.f9112b).clear();
                ((C1283e) this.f9113c).a();
                break;
            default:
                int[] iArr = (int[]) this.f9112b;
                if (iArr != null) {
                    Arrays.fill(iArr, -1);
                }
                this.f9113c = null;
                break;
        }
    }

    public void g(int i6) {
        Object obj = this.f9112b;
        if (((int[]) obj) == null) {
            int[] iArr = new int[Math.max(i6, 10) + 1];
            this.f9112b = iArr;
            Arrays.fill(iArr, -1);
        } else if (i6 >= ((int[]) obj).length) {
            int[] iArr2 = (int[]) obj;
            int length = ((int[]) obj).length;
            while (length <= i6) {
                length *= 2;
            }
            int[] iArr3 = new int[length];
            this.f9112b = iArr3;
            System.arraycopy(iArr2, 0, iArr3, 0, iArr2.length);
            Object obj2 = this.f9112b;
            Arrays.fill((int[]) obj2, iArr2.length, ((int[]) obj2).length, -1);
        }
    }

    public View h(int i6, int i7, int i8, int i9) {
        int iE;
        int i10;
        int iF;
        View viewU;
        T1.j jVar = (T1.j) ((E0) this.f9112b);
        int i11 = jVar.f3424w;
        Object obj = jVar.f3425x;
        switch (i11) {
            case com.bumptech.glide.d.f6312l /* 0 */:
                iE = ((AbstractC1397f0) obj).E();
                break;
            default:
                iE = ((AbstractC1397f0) obj).G();
                break;
        }
        T1.j jVar2 = (T1.j) ((E0) this.f9112b);
        int i12 = jVar2.f3424w;
        Object obj2 = jVar2.f3425x;
        switch (i12) {
            case com.bumptech.glide.d.f6312l /* 0 */:
                AbstractC1397f0 abstractC1397f0 = (AbstractC1397f0) obj2;
                i10 = abstractC1397f0.f13122n;
                iF = abstractC1397f0.F();
                break;
            default:
                AbstractC1397f0 abstractC1397f02 = (AbstractC1397f0) obj2;
                i10 = abstractC1397f02.f13123o;
                iF = abstractC1397f02.D();
                break;
        }
        int i13 = i10 - iF;
        int i14 = i7 > i6 ? 1 : -1;
        View view = null;
        while (i6 != i7) {
            T1.j jVar3 = (T1.j) ((E0) this.f9112b);
            int i15 = jVar3.f3424w;
            Object obj3 = jVar3.f3425x;
            switch (i15) {
                case com.bumptech.glide.d.f6312l /* 0 */:
                    viewU = ((AbstractC1397f0) obj3).u(i6);
                    break;
                default:
                    viewU = ((AbstractC1397f0) obj3).u(i6);
                    break;
            }
            int iJ = ((T1.j) ((E0) this.f9112b)).j(viewU);
            int i16 = ((T1.j) ((E0) this.f9112b)).i(viewU);
            Object obj4 = this.f9113c;
            D0 d02 = (D0) obj4;
            d02.f12991b = iE;
            d02.f12992c = i13;
            d02.f12993d = iJ;
            d02.f12994e = i16;
            if (i8 != 0) {
                ((D0) obj4).f12990a = i8;
                if (((D0) obj4).a()) {
                    return viewU;
                }
            }
            if (i9 != 0) {
                Object obj5 = this.f9113c;
                ((D0) obj5).f12990a = i9;
                if (((D0) obj5).a()) {
                    view = viewU;
                }
            }
            i6 += i14;
        }
        return view;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public int i(int r6) {
        /*
            r5 = this;
            java.lang.Object r0 = r5.f9112b
            int[] r0 = (int[]) r0
            r1 = -1
            if (r0 != 0) goto L8
            return r1
        L8:
            int r0 = r0.length
            if (r6 < r0) goto Lc
            return r1
        Lc:
            java.lang.Object r0 = r5.f9113c
            r2 = r0
            java.util.List r2 = (java.util.List) r2
            if (r2 != 0) goto L15
        L13:
            r0 = r1
            goto L72
        L15:
            java.util.List r0 = (java.util.List) r0
            r2 = 0
            if (r0 != 0) goto L1b
            goto L36
        L1b:
            int r0 = r0.size()
            int r0 = r0 + (-1)
        L21:
            if (r0 < 0) goto L36
            java.lang.Object r3 = r5.f9113c
            java.util.List r3 = (java.util.List) r3
            java.lang.Object r3 = r3.get(r0)
            v0.A0 r3 = (v0.A0) r3
            int r4 = r3.f12934w
            if (r4 != r6) goto L33
            r2 = r3
            goto L36
        L33:
            int r0 = r0 + (-1)
            goto L21
        L36:
            if (r2 == 0) goto L3f
            java.lang.Object r0 = r5.f9113c
            java.util.List r0 = (java.util.List) r0
            r0.remove(r2)
        L3f:
            java.lang.Object r0 = r5.f9113c
            java.util.List r0 = (java.util.List) r0
            int r0 = r0.size()
            r2 = 0
        L48:
            if (r2 >= r0) goto L5c
            java.lang.Object r3 = r5.f9113c
            java.util.List r3 = (java.util.List) r3
            java.lang.Object r3 = r3.get(r2)
            v0.A0 r3 = (v0.A0) r3
            int r3 = r3.f12934w
            if (r3 < r6) goto L59
            goto L5d
        L59:
            int r2 = r2 + 1
            goto L48
        L5c:
            r2 = r1
        L5d:
            if (r2 == r1) goto L13
            java.lang.Object r0 = r5.f9113c
            java.util.List r0 = (java.util.List) r0
            java.lang.Object r0 = r0.get(r2)
            v0.A0 r0 = (v0.A0) r0
            java.lang.Object r3 = r5.f9113c
            java.util.List r3 = (java.util.List) r3
            r3.remove(r2)
            int r0 = r0.f12934w
        L72:
            if (r0 != r1) goto L82
            java.lang.Object r0 = r5.f9112b
            int[] r0 = (int[]) r0
            int r2 = r0.length
            java.util.Arrays.fill(r0, r6, r2, r1)
            java.lang.Object r6 = r5.f9112b
            int[] r6 = (int[]) r6
            int r6 = r6.length
            return r6
        L82:
            int r0 = r0 + 1
            java.lang.Object r2 = r5.f9112b
            int[] r2 = (int[]) r2
            int r2 = r2.length
            int r0 = java.lang.Math.min(r0, r2)
            java.lang.Object r2 = r5.f9112b
            int[] r2 = (int[]) r2
            java.util.Arrays.fill(r2, r6, r0, r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: h5.C0786m.i(int):int");
    }

    public boolean j(View view) {
        int iE;
        int i6;
        int iF;
        D0 d02 = (D0) this.f9113c;
        T1.j jVar = (T1.j) ((E0) this.f9112b);
        int i7 = jVar.f3424w;
        Object obj = jVar.f3425x;
        switch (i7) {
            case com.bumptech.glide.d.f6312l /* 0 */:
                iE = ((AbstractC1397f0) obj).E();
                break;
            default:
                iE = ((AbstractC1397f0) obj).G();
                break;
        }
        T1.j jVar2 = (T1.j) ((E0) this.f9112b);
        int i8 = jVar2.f3424w;
        Object obj2 = jVar2.f3425x;
        switch (i8) {
            case com.bumptech.glide.d.f6312l /* 0 */:
                AbstractC1397f0 abstractC1397f0 = (AbstractC1397f0) obj2;
                i6 = abstractC1397f0.f13122n;
                iF = abstractC1397f0.F();
                break;
            default:
                AbstractC1397f0 abstractC1397f02 = (AbstractC1397f0) obj2;
                i6 = abstractC1397f02.f13123o;
                iF = abstractC1397f02.D();
                break;
        }
        int i9 = i6 - iF;
        int iJ = ((T1.j) ((E0) this.f9112b)).j(view);
        int i10 = ((T1.j) ((E0) this.f9112b)).i(view);
        d02.f12991b = iE;
        d02.f12992c = i9;
        d02.f12993d = iJ;
        d02.f12994e = i10;
        Object obj3 = this.f9113c;
        ((D0) obj3).f12990a = 24579;
        return ((D0) obj3).a();
    }

    public void k(int i6, int i7) {
        int[] iArr = (int[]) this.f9112b;
        if (iArr == null || i6 >= iArr.length) {
            return;
        }
        int i8 = i6 + i7;
        g(i8);
        int[] iArr2 = (int[]) this.f9112b;
        System.arraycopy(iArr2, i6, iArr2, i8, (iArr2.length - i6) - i7);
        Arrays.fill((int[]) this.f9112b, i6, i8, -1);
        List list = (List) this.f9113c;
        if (list == null) {
            return;
        }
        for (int size = list.size() - 1; size >= 0; size--) {
            A0 a02 = (A0) ((List) this.f9113c).get(size);
            int i9 = a02.f12934w;
            if (i9 >= i6) {
                a02.f12934w = i9 + i7;
            }
        }
    }

    public void l(int i6, int i7) {
        int[] iArr = (int[]) this.f9112b;
        if (iArr == null || i6 >= iArr.length) {
            return;
        }
        int i8 = i6 + i7;
        g(i8);
        int[] iArr2 = (int[]) this.f9112b;
        System.arraycopy(iArr2, i8, iArr2, i6, (iArr2.length - i6) - i7);
        int[] iArr3 = (int[]) this.f9112b;
        Arrays.fill(iArr3, iArr3.length - i7, iArr3.length, -1);
        List list = (List) this.f9113c;
        if (list == null) {
            return;
        }
        for (int size = list.size() - 1; size >= 0; size--) {
            A0 a02 = (A0) ((List) this.f9113c).get(size);
            int i9 = a02.f12934w;
            if (i9 >= i6) {
                if (i9 < i8) {
                    ((List) this.f9113c).remove(size);
                } else {
                    a02.f12934w = i9 - i7;
                }
            }
        }
    }

    public C1389b0 m(u0 u0Var, int i6) {
        F0 f02;
        C1389b0 c1389b0;
        int iE = ((s.k) this.f9112b).e(u0Var);
        if (iE >= 0 && (f02 = (F0) ((s.k) this.f9112b).l(iE)) != null) {
            int i7 = f02.f13004a;
            if ((i7 & i6) != 0) {
                int i8 = i7 & (~i6);
                f02.f13004a = i8;
                if (i6 == 4) {
                    c1389b0 = f02.f13005b;
                } else {
                    if (i6 != 8) {
                        throw new IllegalArgumentException("Must provide flag PRE or POST");
                    }
                    c1389b0 = f02.f13006c;
                }
                if ((i8 & 12) == 0) {
                    ((s.k) this.f9112b).j(iE);
                    f02.f13004a = 0;
                    f02.f13005b = null;
                    f02.f13006c = null;
                    F0.f13003d.d(f02);
                }
                return c1389b0;
            }
        }
        return null;
    }

    public void n(u0 u0Var) {
        F0 f02 = (F0) ((s.k) this.f9112b).getOrDefault(u0Var, null);
        if (f02 == null) {
            return;
        }
        f02.f13004a &= -2;
    }

    public void o(u0 u0Var) {
        int iJ = ((C1283e) this.f9113c).j() - 1;
        while (true) {
            if (iJ < 0) {
                break;
            }
            if (u0Var == ((C1283e) this.f9113c).k(iJ)) {
                C1283e c1283e = (C1283e) this.f9113c;
                Object[] objArr = c1283e.f12509y;
                Object obj = objArr[iJ];
                Object obj2 = C1283e.f12506A;
                if (obj != obj2) {
                    objArr[iJ] = obj2;
                    c1283e.f12507w = true;
                }
            } else {
                iJ--;
            }
        }
        F0 f02 = (F0) ((s.k) this.f9112b).remove(u0Var);
        if (f02 != null) {
            f02.f13004a = 0;
            f02.f13005b = null;
            f02.f13006c = null;
            F0.f13003d.d(f02);
        }
    }

    public C0786m(T1.j jVar) {
        this.f9111a = 2;
        this.f9112b = jVar;
        D0 d02 = new D0();
        d02.f12990a = 0;
        this.f9113c = d02;
    }

    public /* synthetic */ C0786m(Object obj, int i6, Object obj2) {
        this.f9111a = i6;
        this.f9113c = obj;
        this.f9112b = obj2;
    }
}
