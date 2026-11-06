package W;

import M4.AbstractC0056a;
import M4.C0078x;
import M4.InterfaceC0080z;
import M4.r0;
import P4.C0142c;
import P4.C0150k;
import P4.InterfaceC0146g;
import j3.C0848A;
import java.util.List;
import s4.AbstractC1305a;
import s4.C1314j;
import v4.C1433k;
import v4.InterfaceC1427e;
import v4.InterfaceC1432j;

/* JADX INFO: loaded from: classes.dex */
public final class W implements InterfaceC0191j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final k0 f4071a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final InterfaceC0184c f4072b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final InterfaceC0080z f4073c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final P4.X f4074d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final C0150k f4075e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final C0142c f4076f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final S0.f f4077g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final C0196o f4078h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final C1314j f4079i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final C1314j f4080j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final P0.h f4081k;

    public W(Y.f fVar, List list, InterfaceC0184c interfaceC0184c, InterfaceC0080z interfaceC0080z) {
        T1.q qVar;
        Q4.g gVar;
        InterfaceC0146g interfaceC0146gH;
        this.f4071a = fVar;
        this.f4072b = interfaceC0184c;
        this.f4073c = interfaceC0080z;
        InterfaceC0146g c0150k = new C0150k(new O(this, null));
        P4.n0 n0Var = new P4.n0(L4.a.b(0L), L4.a.b(0L));
        O4.g.f2382i.getClass();
        int i6 = O4.f.f2381b;
        int i7 = 0;
        i6 = i6 <= 0 ? 0 : i6;
        boolean z5 = c0150k instanceof Q4.g;
        O4.a aVar = O4.a.f2342w;
        int i8 = 1;
        if (!z5 || (interfaceC0146gH = (gVar = (Q4.g) c0150k).h()) == null) {
            qVar = new T1.q(i6, C1433k.f13309w, aVar, c0150k);
        } else {
            O4.a aVar2 = gVar.f2845y;
            int i9 = gVar.f2844x;
            if (i9 != -3 && i9 != -2 && i9 != 0) {
                i6 = i9;
            } else if (aVar2 != aVar) {
                i6 = 1;
            } else if (i9 == 0) {
                i6 = 0;
            }
            qVar = new T1.q(i6, gVar.f2843w, aVar2, interfaceC0146gH);
        }
        P4.c0 c0VarA = P4.d0.a(0, qVar.f3446a, (O4.a) qVar.f3448c);
        InterfaceC1432j interfaceC1432j = (InterfaceC1432j) qVar.f3449d;
        InterfaceC0146g interfaceC0146g = (InterfaceC0146g) qVar.f3447b;
        C0848A c0848a = P4.d0.f2673a;
        M4.A a6 = AbstractC1305a.c(n0Var, P4.g0.f2689a) ? M4.A.f1832w : M4.A.f1835z;
        P4.S s5 = new P4.S(n0Var, interfaceC0146g, c0VarA, c0848a, null);
        InterfaceC1432j interfaceC1432jO = AbstractC1305a.O(interfaceC0080z, interfaceC1432j);
        AbstractC0056a l0Var = a6 == M4.A.f1833x ? new M4.l0(interfaceC1432jO, s5) : new r0(interfaceC1432jO, true);
        l0Var.f0(a6, l0Var, s5);
        this.f4074d = new P4.X(c0VarA);
        this.f4075e = new C0150k(new D(this, null));
        this.f4076f = new C0142c(new C0202v(this, null));
        this.f4077g = new S0.f(12);
        this.f4078h = new C0196o(this, list);
        this.f4079i = new C1314j(new C0197p(this, i8));
        this.f4080j = new C1314j(new C0197p(this, i7));
        Q q5 = new Q(i7, this);
        S s6 = S.f4056x;
        T t5 = new T(this, null);
        P0.h hVar = new P0.h();
        hVar.f2407a = interfaceC0080z;
        hVar.f2408b = t5;
        hVar.f2409c = S3.a.a(Integer.MAX_VALUE, null, 6);
        hVar.f2410d = new L3.c();
        M4.b0 b0Var = (M4.b0) ((InterfaceC0080z) hVar.f2407a).u().n(C0078x.f1930x);
        if (b0Var != null) {
            ((M4.k0) b0Var).O(new d0(q5, hVar, s6, i7));
        }
        this.f4081k = hVar;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(14:0|2|(2:4|(1:6)(1:7))(0)|8|(7:73|(1:(1:(1:13)(2:18|19))(3:20|21|22))(1:23)|14|63|(1:65)(1:66)|67|68)(4:24|74|25|(9:27|71|28|(1:76)|31|63|(0)(0)|67|68)(4:38|(2:56|(2:58|59)(2:60|61))|43|(2:45|(2:47|75))(2:54|55)))|48|69|49|(1:77)|31|63|(0)(0)|67|68) */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x00c1, code lost:
    
        r9 = th;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0016  */
    /* JADX WARN: Type inference failed for: r9v0, types: [W.W, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v12 */
    /* JADX WARN: Type inference failed for: r9v13 */
    /* JADX WARN: Type inference failed for: r9v15 */
    /* JADX WARN: Type inference failed for: r9v18 */
    /* JADX WARN: Type inference failed for: r9v26 */
    /* JADX WARN: Type inference failed for: r9v27 */
    /* JADX WARN: Type inference failed for: r9v28 */
    /* JADX WARN: Type inference failed for: r9v5 */
    /* JADX WARN: Type inference failed for: r9v9, types: [W.W] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object c(W.W r9, W.Y r10, v4.InterfaceC1427e r11) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 251
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: W.W.c(W.W, W.Y, v4.e):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:48:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0016  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object d(W.W r8, boolean r9, v4.InterfaceC1427e r10) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 210
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: W.W.d(W.W, boolean, v4.e):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x00a2 A[Catch: b -> 0x0062, TryCatch #0 {b -> 0x0062, blocks: (B:19:0x005d, B:54:0x0103, B:24:0x006b, B:51:0x00e5, B:32:0x0088, B:40:0x00a2, B:42:0x00a8, B:36:0x0091, B:48:0x00d2), top: B:78:0x0023 }] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0142 A[Catch: all -> 0x016e, TryCatch #2 {all -> 0x016e, blocks: (B:61:0x0130, B:63:0x0142, B:64:0x014a), top: B:81:0x0130 }] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x014a A[Catch: all -> 0x016e, TRY_LEAVE, TryCatch #2 {all -> 0x016e, blocks: (B:61:0x0130, B:63:0x0142, B:64:0x014a), top: B:81:0x0130 }] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x015a  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0162  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0016  */
    /* JADX WARN: Removed duplicated region for block: B:89:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:91:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object e(W.W r9, boolean r10, v4.InterfaceC1427e r11) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 390
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: W.W.e(W.W, boolean, v4.e):java.lang.Object");
    }

    @Override // W.InterfaceC0191j
    public final Object a(C4.p pVar, InterfaceC1427e interfaceC1427e) {
        n0 n0Var = (n0) interfaceC1427e.i().n(m0.f4151w);
        if (n0Var != null) {
            n0Var.a(this);
        }
        return S3.a.U(interfaceC1427e, new n0(n0Var, this), new P(this, pVar, null));
    }

    @Override // W.InterfaceC0191j
    public final InterfaceC0146g b() {
        return this.f4076f;
    }

    public final i0 f() {
        return (i0) this.f4080j.getValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object g(v4.InterfaceC1427e r6) throws java.lang.Throwable {
        /*
            r5 = this;
            boolean r0 = r6 instanceof W.E
            if (r0 == 0) goto L13
            r0 = r6
            W.E r0 = (W.E) r0
            int r1 = r0.f4002D
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f4002D = r1
            goto L18
        L13:
            W.E r0 = new W.E
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.f4000B
            w4.a r1 = w4.EnumC1481a.f13592w
            int r2 = r0.f4002D
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3e
            if (r2 == r4) goto L38
            if (r2 != r3) goto L30
            int r1 = r0.f3999A
            W.W r0 = r0.f4003z
            S3.a.O(r6)     // Catch: java.lang.Throwable -> L2e
            goto L66
        L2e:
            r6 = move-exception
            goto L6d
        L30:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L38:
            W.W r2 = r0.f4003z
            S3.a.O(r6)
            goto L51
        L3e:
            S3.a.O(r6)
            W.i0 r6 = r5.f()
            r0.f4003z = r5
            r0.f4002D = r4
            java.lang.Integer r6 = r6.a()
            if (r6 != r1) goto L50
            return r1
        L50:
            r2 = r5
        L51:
            java.lang.Number r6 = (java.lang.Number) r6
            int r6 = r6.intValue()
            W.o r4 = r2.f4078h     // Catch: java.lang.Throwable -> L69
            r0.f4003z = r2     // Catch: java.lang.Throwable -> L69
            r0.f3999A = r6     // Catch: java.lang.Throwable -> L69
            r0.f4002D = r3     // Catch: java.lang.Throwable -> L69
            java.lang.Object r6 = r4.b(r0)     // Catch: java.lang.Throwable -> L69
            if (r6 != r1) goto L66
            return r1
        L66:
            s4.l r6 = s4.C1316l.f12640a
            return r6
        L69:
            r0 = move-exception
            r1 = r6
            r6 = r0
            r0 = r2
        L6d:
            S0.f r0 = r0.f4077g
            W.Z r2 = new W.Z
            r2.<init>(r6, r1)
            r0.H(r2)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: W.W.g(v4.e):java.lang.Object");
    }

    public final Object h(InterfaceC1427e interfaceC1427e) {
        return ((Y.i) this.f4079i.getValue()).a(new r(null), interfaceC1427e);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object i(java.lang.Object r12, boolean r13, v4.InterfaceC1427e r14) throws java.lang.Throwable {
        /*
            r11 = this;
            boolean r0 = r14 instanceof W.U
            if (r0 == 0) goto L13
            r0 = r14
            W.U r0 = (W.U) r0
            int r1 = r0.f4062C
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f4062C = r1
            goto L18
        L13:
            W.U r0 = new W.U
            r0.<init>(r11, r14)
        L18:
            java.lang.Object r14 = r0.f4060A
            w4.a r1 = w4.EnumC1481a.f13592w
            int r2 = r0.f4062C
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            D4.p r12 = r0.f4063z
            S3.a.O(r14)
            goto L58
        L29:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r13)
            throw r12
        L31:
            S3.a.O(r14)
            D4.p r14 = new D4.p
            r14.<init>()
            s4.j r2 = r11.f4079i
            java.lang.Object r2 = r2.getValue()
            Y.i r2 = (Y.i) r2
            W.V r10 = new W.V
            r9 = 0
            r4 = r10
            r5 = r14
            r6 = r11
            r7 = r12
            r8 = r13
            r4.<init>(r5, r6, r7, r8, r9)
            r0.f4063z = r14
            r0.f4062C = r3
            java.lang.Object r12 = r2.b(r10, r0)
            if (r12 != r1) goto L57
            return r1
        L57:
            r12 = r14
        L58:
            int r12 = r12.f375w
            java.lang.Integer r13 = new java.lang.Integer
            r13.<init>(r12)
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: W.W.i(java.lang.Object, boolean, v4.e):java.lang.Object");
    }
}
