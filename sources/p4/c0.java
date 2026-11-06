package P4;

import M4.C0060e;
import M4.C0063h;
import Q4.AbstractC0168b;
import Q4.AbstractC0169c;
import j3.C0848A;
import java.util.Arrays;
import s4.AbstractC1305a;
import s4.C1316l;
import v4.InterfaceC1427e;
import v4.InterfaceC1432j;
import w4.EnumC1481a;

/* JADX INFO: loaded from: classes.dex */
public class c0 extends AbstractC0168b implements V, InterfaceC0146g, Q4.s {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public final int f2662A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public final int f2663B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public final O4.a f2664C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public Object[] f2665D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public long f2666E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public long f2667F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public int f2668G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public int f2669H;

    public c0(int i6, int i7, O4.a aVar) {
        this.f2662A = i6;
        this.f2663B = i7;
        this.f2664C = aVar;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(12:0|2|(2:4|(1:6)(1:7))(0)|8|(1:52)|(2:10|(1:(1:(7:14|15|16|31|58|(4:32|(9:56|(2:41|42)|43|(1:45)|16|31|58|32|(0)(1:34))(0)|48|49)|36)(2:19|20))(5:21|22|58|(4:32|(0)(0)|48|49)|36))(4:24|54|25|26))(1:29)|50|30|31|58|(4:32|(0)(0)|48|49)|36) */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00b4, code lost:
    
        r10 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00b5, code lost:
    
        r5 = r8;
        r8 = r10;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0082 A[Catch: all -> 0x0038, TryCatch #1 {all -> 0x0038, blocks: (B:15:0x0031, B:32:0x007a, B:34:0x0082, B:38:0x0095, B:41:0x009c, B:42:0x00a2, B:43:0x00a3, B:22:0x004b), top: B:52:0x0020 }] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0093 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r10v10 */
    /* JADX WARN: Type inference failed for: r10v11 */
    /* JADX WARN: Type inference failed for: r10v12 */
    /* JADX WARN: Type inference failed for: r10v13 */
    /* JADX WARN: Type inference failed for: r10v4 */
    /* JADX WARN: Type inference failed for: r10v5 */
    /* JADX WARN: Type inference failed for: r2v12 */
    /* JADX WARN: Type inference failed for: r2v13 */
    /* JADX WARN: Type inference failed for: r2v14 */
    /* JADX WARN: Type inference failed for: r2v4, types: [P4.h] */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r2v7 */
    /* JADX WARN: Type inference failed for: r5v1, types: [Q4.b] */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v12 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v4, types: [P4.c0] */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v6 */
    /* JADX WARN: Type inference failed for: r5v7 */
    /* JADX WARN: Type inference failed for: r8v11 */
    /* JADX WARN: Type inference failed for: r8v19 */
    /* JADX WARN: Type inference failed for: r8v8 */
    /* JADX WARN: Type inference failed for: r9v0, types: [P4.h] */
    /* JADX WARN: Type inference failed for: r9v1 */
    /* JADX WARN: Type inference failed for: r9v12 */
    /* JADX WARN: Type inference failed for: r9v13 */
    /* JADX WARN: Type inference failed for: r9v14 */
    /* JADX WARN: Type inference failed for: r9v15 */
    /* JADX WARN: Type inference failed for: r9v16 */
    /* JADX WARN: Type inference failed for: r9v17 */
    /* JADX WARN: Type inference failed for: r9v18 */
    /* JADX WARN: Type inference failed for: r9v2, types: [Q4.d] */
    /* JADX WARN: Type inference failed for: r9v3 */
    /* JADX WARN: Type inference failed for: r9v4 */
    /* JADX WARN: Type inference failed for: r9v5, types: [P4.e0] */
    /* JADX WARN: Type inference failed for: r9v6 */
    /* JADX WARN: Type inference failed for: r9v7 */
    /* JADX WARN: Type inference failed for: r9v8, types: [P4.e0] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:44:0x00b1 -> B:16:0x0034). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void m(P4.c0 r8, P4.InterfaceC0147h r9, v4.InterfaceC1427e r10) throws java.lang.Throwable {
        /*
            boolean r0 = r10 instanceof P4.b0
            if (r0 == 0) goto L13
            r0 = r10
            P4.b0 r0 = (P4.b0) r0
            int r1 = r0.f2658F
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f2658F = r1
            goto L18
        L13:
            P4.b0 r0 = new P4.b0
            r0.<init>(r8, r10)
        L18:
            java.lang.Object r10 = r0.f2656D
            w4.a r1 = w4.EnumC1481a.f13592w
            int r2 = r0.f2658F
            r3 = 3
            r4 = 2
            if (r2 == 0) goto L5e
            r8 = 1
            if (r2 == r8) goto L4f
            if (r2 == r4) goto L43
            if (r2 != r3) goto L3b
            M4.b0 r8 = r0.f2655C
            P4.e0 r9 = r0.f2654B
            P4.h r2 = r0.f2653A
            P4.c0 r5 = r0.f2659z
            S3.a.O(r10)     // Catch: java.lang.Throwable -> L38
        L34:
            r10 = r2
            r2 = r8
            r8 = r5
            goto L77
        L38:
            r8 = move-exception
            goto Lb7
        L3b:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L43:
            M4.b0 r8 = r0.f2655C
            P4.e0 r9 = r0.f2654B
            P4.h r2 = r0.f2653A
            P4.c0 r5 = r0.f2659z
            S3.a.O(r10)     // Catch: java.lang.Throwable -> L38
            goto L7a
        L4f:
            P4.e0 r9 = r0.f2654B
            P4.h r8 = r0.f2653A
            P4.c0 r2 = r0.f2659z
            S3.a.O(r10)     // Catch: java.lang.Throwable -> L5b
            r10 = r8
            r8 = r2
            goto L6a
        L5b:
            r8 = move-exception
            r5 = r2
            goto Lb7
        L5e:
            S3.a.O(r10)
            Q4.d r10 = r8.e()
            P4.e0 r10 = (P4.e0) r10
            r7 = r10
            r10 = r9
            r9 = r7
        L6a:
            v4.j r2 = r0.f13684x     // Catch: java.lang.Throwable -> Lb4
            s4.AbstractC1305a.l(r2)     // Catch: java.lang.Throwable -> Lb4
            M4.x r5 = M4.C0078x.f1930x     // Catch: java.lang.Throwable -> Lb4
            v4.h r2 = r2.n(r5)     // Catch: java.lang.Throwable -> Lb4
            M4.b0 r2 = (M4.b0) r2     // Catch: java.lang.Throwable -> Lb4
        L77:
            r5 = r8
            r8 = r2
            r2 = r10
        L7a:
            java.lang.Object r10 = r5.u(r9)     // Catch: java.lang.Throwable -> L38
            j3.A r6 = P4.d0.f2673a     // Catch: java.lang.Throwable -> L38
            if (r10 != r6) goto L93
            r0.f2659z = r5     // Catch: java.lang.Throwable -> L38
            r0.f2653A = r2     // Catch: java.lang.Throwable -> L38
            r0.f2654B = r9     // Catch: java.lang.Throwable -> L38
            r0.f2655C = r8     // Catch: java.lang.Throwable -> L38
            r0.f2658F = r4     // Catch: java.lang.Throwable -> L38
            java.lang.Object r10 = r5.j(r9, r0)     // Catch: java.lang.Throwable -> L38
            if (r10 != r1) goto L7a
            return
        L93:
            if (r8 == 0) goto La3
            boolean r6 = r8.c()     // Catch: java.lang.Throwable -> L38
            if (r6 == 0) goto L9c
            goto La3
        L9c:
            M4.k0 r8 = (M4.k0) r8     // Catch: java.lang.Throwable -> L38
            java.util.concurrent.CancellationException r8 = r8.F()     // Catch: java.lang.Throwable -> L38
            throw r8     // Catch: java.lang.Throwable -> L38
        La3:
            r0.f2659z = r5     // Catch: java.lang.Throwable -> L38
            r0.f2653A = r2     // Catch: java.lang.Throwable -> L38
            r0.f2654B = r9     // Catch: java.lang.Throwable -> L38
            r0.f2655C = r8     // Catch: java.lang.Throwable -> L38
            r0.f2658F = r3     // Catch: java.lang.Throwable -> L38
            java.lang.Object r10 = r2.k(r10, r0)     // Catch: java.lang.Throwable -> L38
            if (r10 != r1) goto L34
            return
        Lb4:
            r10 = move-exception
            r5 = r8
            r8 = r10
        Lb7:
            r5.h(r9)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: P4.c0.m(P4.c0, P4.h, v4.e):void");
    }

    @Override // P4.V
    public final void a() {
        synchronized (this) {
            v(q() + ((long) this.f2668G), this.f2667F, q() + ((long) this.f2668G), q() + ((long) this.f2668G) + ((long) this.f2669H));
        }
    }

    @Override // Q4.s
    public final InterfaceC0146g b(InterfaceC1432j interfaceC1432j, int i6, O4.a aVar) {
        return d0.d(this, interfaceC1432j, i6, aVar);
    }

    @Override // P4.V
    public final boolean c(Object obj) {
        int i6;
        boolean z5;
        InterfaceC1427e[] interfaceC1427eArrP = AbstractC0169c.f2834a;
        synchronized (this) {
            if (s(obj)) {
                interfaceC1427eArrP = p(interfaceC1427eArrP);
                z5 = true;
            } else {
                z5 = false;
            }
        }
        for (InterfaceC1427e interfaceC1427e : interfaceC1427eArrP) {
            if (interfaceC1427e != null) {
                interfaceC1427e.o(C1316l.f12640a);
            }
        }
        return z5;
    }

    @Override // P4.InterfaceC0146g
    public final Object d(InterfaceC0147h interfaceC0147h, InterfaceC1427e interfaceC1427e) {
        m(this, interfaceC0147h, interfaceC1427e);
        return EnumC1481a.f13592w;
    }

    @Override // Q4.AbstractC0168b
    public final Q4.d f() {
        e0 e0Var = new e0();
        e0Var.f2680a = -1L;
        return e0Var;
    }

    @Override // Q4.AbstractC0168b
    public final Q4.d[] g() {
        return new e0[2];
    }

    public final Object j(e0 e0Var, b0 b0Var) {
        C0063h c0063h = new C0063h(1, AbstractC1305a.H(b0Var));
        c0063h.v();
        synchronized (this) {
            if (t(e0Var) < 0) {
                e0Var.f2681b = c0063h;
            } else {
                c0063h.o(C1316l.f12640a);
            }
        }
        Object objU = c0063h.u();
        return objU == EnumC1481a.f13592w ? objU : C1316l.f12640a;
    }

    @Override // P4.InterfaceC0147h
    public final Object k(Object obj, InterfaceC1427e interfaceC1427e) {
        InterfaceC1427e[] interfaceC1427eArrP;
        a0 a0Var;
        if (c(obj)) {
            return C1316l.f12640a;
        }
        C0063h c0063h = new C0063h(1, AbstractC1305a.H(interfaceC1427e));
        c0063h.v();
        InterfaceC1427e[] interfaceC1427eArrP2 = AbstractC0169c.f2834a;
        synchronized (this) {
            try {
                if (s(obj)) {
                    c0063h.o(C1316l.f12640a);
                    interfaceC1427eArrP = p(interfaceC1427eArrP2);
                    a0Var = null;
                } else {
                    a0 a0Var2 = new a0(this, ((long) (this.f2668G + this.f2669H)) + q(), obj, c0063h);
                    o(a0Var2);
                    this.f2669H++;
                    if (this.f2663B == 0) {
                        interfaceC1427eArrP2 = p(interfaceC1427eArrP2);
                    }
                    interfaceC1427eArrP = interfaceC1427eArrP2;
                    a0Var = a0Var2;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (a0Var != null) {
            S3.a.y(c0063h, new C0060e(2, a0Var));
        }
        for (InterfaceC1427e interfaceC1427e2 : interfaceC1427eArrP) {
            if (interfaceC1427e2 != null) {
                interfaceC1427e2.o(C1316l.f12640a);
            }
        }
        Object objU = c0063h.u();
        EnumC1481a enumC1481a = EnumC1481a.f13592w;
        if (objU != enumC1481a) {
            objU = C1316l.f12640a;
        }
        return objU == enumC1481a ? objU : C1316l.f12640a;
    }

    public final void l() {
        if (this.f2663B != 0 || this.f2669H > 1) {
            Object[] objArr = this.f2665D;
            AbstractC1305a.l(objArr);
            while (this.f2669H > 0) {
                long jQ = q();
                int i6 = this.f2668G;
                int i7 = this.f2669H;
                if (objArr[((int) ((jQ + ((long) (i6 + i7))) - 1)) & (objArr.length - 1)] != d0.f2673a) {
                    return;
                }
                this.f2669H = i7 - 1;
                d0.c(objArr, q() + ((long) (this.f2668G + this.f2669H)), null);
            }
        }
    }

    public final void n() {
        Q4.d[] dVarArr;
        Object[] objArr = this.f2665D;
        AbstractC1305a.l(objArr);
        d0.c(objArr, q(), null);
        this.f2668G--;
        long jQ = q() + 1;
        if (this.f2666E < jQ) {
            this.f2666E = jQ;
        }
        if (this.f2667F < jQ) {
            if (this.f2831x != 0 && (dVarArr = this.f2830w) != null) {
                for (Q4.d dVar : dVarArr) {
                    if (dVar != null) {
                        e0 e0Var = (e0) dVar;
                        long j6 = e0Var.f2680a;
                        if (j6 >= 0 && j6 < jQ) {
                            e0Var.f2680a = jQ;
                        }
                    }
                }
            }
            this.f2667F = jQ;
        }
    }

    public final void o(Object obj) {
        int i6 = this.f2668G + this.f2669H;
        Object[] objArrR = this.f2665D;
        if (objArrR == null) {
            objArrR = r(0, 2, null);
        } else if (i6 >= objArrR.length) {
            objArrR = r(i6, objArrR.length * 2, objArrR);
        }
        d0.c(objArrR, q() + ((long) i6), obj);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v0, types: [v4.e[]] */
    /* JADX WARN: Type inference failed for: r11v1 */
    /* JADX WARN: Type inference failed for: r11v10 */
    /* JADX WARN: Type inference failed for: r11v3, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r11v4 */
    /* JADX WARN: Type inference failed for: r11v5 */
    /* JADX WARN: Type inference failed for: r11v7 */
    /* JADX WARN: Type inference failed for: r11v8 */
    /* JADX WARN: Type inference failed for: r11v9 */
    /* JADX WARN: Type inference failed for: r6v3 */
    public final InterfaceC1427e[] p(InterfaceC1427e[] interfaceC1427eArr) {
        Q4.d[] dVarArr;
        e0 e0Var;
        C0063h c0063h;
        int length = interfaceC1427eArr.length;
        if (this.f2831x != 0 && (dVarArr = this.f2830w) != null) {
            int length2 = dVarArr.length;
            int i6 = 0;
            interfaceC1427eArr = interfaceC1427eArr;
            while (i6 < length2) {
                Q4.d dVar = dVarArr[i6];
                if (dVar != null && (c0063h = (e0Var = (e0) dVar).f2681b) != null && t(e0Var) >= 0) {
                    int length3 = interfaceC1427eArr.length;
                    interfaceC1427eArr = interfaceC1427eArr;
                    if (length >= length3) {
                        Object[] objArrCopyOf = Arrays.copyOf((Object[]) interfaceC1427eArr, Math.max(2, interfaceC1427eArr.length * 2));
                        AbstractC1305a.n(objArrCopyOf, "copyOf(...)");
                        interfaceC1427eArr = objArrCopyOf;
                    }
                    ((InterfaceC1427e[]) interfaceC1427eArr)[length] = c0063h;
                    e0Var.f2681b = null;
                    length++;
                }
                i6++;
                interfaceC1427eArr = interfaceC1427eArr;
            }
        }
        return (InterfaceC1427e[]) interfaceC1427eArr;
    }

    public final long q() {
        return Math.min(this.f2667F, this.f2666E);
    }

    public final Object[] r(int i6, int i7, Object[] objArr) {
        if (i7 <= 0) {
            throw new IllegalStateException("Buffer size overflow".toString());
        }
        Object[] objArr2 = new Object[i7];
        this.f2665D = objArr2;
        if (objArr == null) {
            return objArr2;
        }
        long jQ = q();
        for (int i8 = 0; i8 < i6; i8++) {
            long j6 = ((long) i8) + jQ;
            d0.c(objArr2, j6, objArr[((int) j6) & (objArr.length - 1)]);
        }
        return objArr2;
    }

    public final boolean s(Object obj) {
        int i6 = this.f2831x;
        int i7 = this.f2662A;
        if (i6 == 0) {
            if (i7 != 0) {
                o(obj);
                int i8 = this.f2668G + 1;
                this.f2668G = i8;
                if (i8 > i7) {
                    n();
                }
                this.f2667F = q() + ((long) this.f2668G);
            }
            return true;
        }
        int i9 = this.f2668G;
        int i10 = this.f2663B;
        if (i9 >= i10 && this.f2667F <= this.f2666E) {
            int iOrdinal = this.f2664C.ordinal();
            if (iOrdinal == 0) {
                return false;
            }
            if (iOrdinal == 2) {
                return true;
            }
        }
        o(obj);
        int i11 = this.f2668G + 1;
        this.f2668G = i11;
        if (i11 > i10) {
            n();
        }
        long jQ = q() + ((long) this.f2668G);
        long j6 = this.f2666E;
        if (((int) (jQ - j6)) > i7) {
            v(j6 + 1, this.f2667F, q() + ((long) this.f2668G), q() + ((long) this.f2668G) + ((long) this.f2669H));
        }
        return true;
    }

    public final long t(e0 e0Var) {
        long j6 = e0Var.f2680a;
        if (j6 < q() + ((long) this.f2668G)) {
            return j6;
        }
        if (this.f2663B <= 0 && j6 <= q() && this.f2669H != 0) {
            return j6;
        }
        return -1L;
    }

    public final Object u(e0 e0Var) {
        Object obj;
        InterfaceC1427e[] interfaceC1427eArrW = AbstractC0169c.f2834a;
        synchronized (this) {
            long jT = t(e0Var);
            if (jT < 0) {
                obj = d0.f2673a;
            } else {
                long j6 = e0Var.f2680a;
                Object[] objArr = this.f2665D;
                AbstractC1305a.l(objArr);
                Object obj2 = objArr[((int) jT) & (objArr.length - 1)];
                if (obj2 instanceof a0) {
                    obj2 = ((a0) obj2).f2648y;
                }
                e0Var.f2680a = jT + 1;
                Object obj3 = obj2;
                interfaceC1427eArrW = w(j6);
                obj = obj3;
            }
        }
        for (InterfaceC1427e interfaceC1427e : interfaceC1427eArrW) {
            if (interfaceC1427e != null) {
                interfaceC1427e.o(C1316l.f12640a);
            }
        }
        return obj;
    }

    public final void v(long j6, long j7, long j8, long j9) {
        long jMin = Math.min(j7, j6);
        for (long jQ = q(); jQ < jMin; jQ++) {
            Object[] objArr = this.f2665D;
            AbstractC1305a.l(objArr);
            d0.c(objArr, jQ, null);
        }
        this.f2666E = j6;
        this.f2667F = j7;
        this.f2668G = (int) (j8 - jMin);
        this.f2669H = (int) (j9 - j8);
    }

    public final InterfaceC1427e[] w(long j6) {
        long j7;
        long j8;
        InterfaceC1427e[] interfaceC1427eArr;
        long j9;
        Q4.d[] dVarArr;
        long j10 = this.f2667F;
        InterfaceC1427e[] interfaceC1427eArr2 = AbstractC0169c.f2834a;
        if (j6 > j10) {
            return interfaceC1427eArr2;
        }
        long jQ = q();
        long j11 = ((long) this.f2668G) + jQ;
        int i6 = this.f2663B;
        if (i6 == 0 && this.f2669H > 0) {
            j11++;
        }
        if (this.f2831x != 0 && (dVarArr = this.f2830w) != null) {
            for (Q4.d dVar : dVarArr) {
                if (dVar != null) {
                    long j12 = ((e0) dVar).f2680a;
                    if (j12 >= 0 && j12 < j11) {
                        j11 = j12;
                    }
                }
            }
        }
        if (j11 <= this.f2667F) {
            return interfaceC1427eArr2;
        }
        long jQ2 = q() + ((long) this.f2668G);
        int iMin = this.f2831x > 0 ? Math.min(this.f2669H, i6 - ((int) (jQ2 - j11))) : this.f2669H;
        long j13 = ((long) this.f2669H) + jQ2;
        C0848A c0848a = d0.f2673a;
        if (iMin > 0) {
            InterfaceC1427e[] interfaceC1427eArr3 = new InterfaceC1427e[iMin];
            Object[] objArr = this.f2665D;
            AbstractC1305a.l(objArr);
            long j14 = jQ2;
            int i7 = 0;
            while (true) {
                if (jQ2 >= j13) {
                    j7 = j11;
                    j8 = j13;
                    break;
                }
                j7 = j11;
                Object obj = objArr[((int) jQ2) & (objArr.length - 1)];
                if (obj != c0848a) {
                    AbstractC1305a.m(obj, "null cannot be cast to non-null type kotlinx.coroutines.flow.SharedFlowImpl.Emitter");
                    a0 a0Var = (a0) obj;
                    int i8 = i7 + 1;
                    j8 = j13;
                    interfaceC1427eArr3[i7] = a0Var.f2649z;
                    d0.c(objArr, jQ2, c0848a);
                    d0.c(objArr, j14, a0Var.f2648y);
                    j9 = 1;
                    j14++;
                    if (i8 >= iMin) {
                        break;
                    }
                    i7 = i8;
                } else {
                    j8 = j13;
                    j9 = 1;
                }
                jQ2 += j9;
                j11 = j7;
                j13 = j8;
            }
            interfaceC1427eArr = interfaceC1427eArr3;
            jQ2 = j14;
        } else {
            j7 = j11;
            j8 = j13;
            interfaceC1427eArr = interfaceC1427eArr2;
        }
        int i9 = (int) (jQ2 - jQ);
        long j15 = this.f2831x == 0 ? jQ2 : j7;
        long jMax = Math.max(this.f2666E, jQ2 - ((long) Math.min(this.f2662A, i9)));
        if (i6 == 0 && jMax < j8) {
            Object[] objArr2 = this.f2665D;
            AbstractC1305a.l(objArr2);
            if (AbstractC1305a.c(objArr2[((int) jMax) & (objArr2.length - 1)], c0848a)) {
                jQ2++;
                jMax++;
            }
        }
        v(jMax, j15, jQ2, j8);
        l();
        return (interfaceC1427eArr.length == 0) ^ true ? p(interfaceC1427eArr) : interfaceC1427eArr;
    }
}
