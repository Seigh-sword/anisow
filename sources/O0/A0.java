package o0;

import M4.InterfaceC0080z;
import P4.C0150k;
import P4.C0157s;
import P4.InterfaceC0146g;
import d.C0617E;
import d2.AbstractC0651b;
import h0.C0733A;
import i.C0803c;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import s4.AbstractC1305a;
import s4.C1316l;
import v4.InterfaceC1427e;
import w4.EnumC1481a;

/* JADX INFO: loaded from: classes.dex */
public final class A0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f11721a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e1 f11722b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final J0 f11723c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final InterfaceC0146g f11724d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final C4.a f11725e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final S0.f f11726f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final AtomicBoolean f11727g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final O4.c f11728h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final B0 f11729i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final M4.e0 f11730j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final C0157s f11731k;

    public A0(Object obj, e1 e1Var, J0 j02, InterfaceC0146g interfaceC0146g, f1 f1Var, C0617E c0617e) {
        AbstractC1305a.o(e1Var, "pagingSource");
        AbstractC1305a.o(j02, "config");
        AbstractC1305a.o(interfaceC0146g, "retryFlow");
        this.f11721a = obj;
        this.f11722b = e1Var;
        this.f11723c = j02;
        this.f11724d = interfaceC0146g;
        this.f11725e = c0617e;
        if (j02.f11784d != Integer.MIN_VALUE) {
            throw new IllegalArgumentException("PagingConfig.jumpThreshold was set, but the associated PagingSource has not marked support for jumps by overriding PagingSource.jumpingSupported to true.".toString());
        }
        this.f11726f = new S0.f(17);
        this.f11727g = new AtomicBoolean(false);
        this.f11728h = S3.a.a(-2, null, 6);
        this.f11729i = new B0(j02);
        M4.e0 e0VarD = S3.a.d();
        this.f11730j = e0VarD;
        this.f11731k = new C0157s(new C1215v0(this, null), AbstractC0651b.C(new C1195l(e0VarD, new C1213u0(this, null), null)));
    }

    public static final Object a(A0 a02, C0157s c0157s, I i6, InterfaceC1427e interfaceC1427e) {
        a02.getClass();
        C1184f0 c1184f0 = new C1184f0(null, a02, i6);
        Object obj = AbstractC1218x.f12151a;
        InterfaceC0146g interfaceC0146gC = AbstractC0651b.C(new C1216w(c0157s, c1184f0, null));
        C1186g0 c1186g0 = new C1186g0(0, i6, null);
        AbstractC1305a.o(interfaceC0146gC, "<this>");
        Object objD = AbstractC1305a.h(new C0150k(new r(interfaceC0146gC, c1186g0, null)), -1).d(new C1188h0(a02, 0, i6), interfaceC1427e);
        return objD == EnumC1481a.f13592w ? objD : C1316l.f12640a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:241:0x03ea, code lost:
    
        r9.getClass();
        r12 = r2;
        r5 = r9;
        r0 = r14;
        r9 = r15;
        r11 = r20;
        r13 = r21;
        r14 = r6;
        r15 = r7;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0450  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x04b8  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x04d0  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x0556  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x05bd  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x05e9  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x05ec  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x0617  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x062e A[Catch: all -> 0x066c, TryCatch #7 {all -> 0x066c, blocks: (B:182:0x0622, B:184:0x062e, B:192:0x0673, B:194:0x0686, B:196:0x068a, B:198:0x0692, B:200:0x0696, B:202:0x069b, B:201:0x0699, B:203:0x069e), top: B:238:0x0622 }] */
    /* JADX WARN: Removed duplicated region for block: B:191:0x0670  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x068a A[Catch: all -> 0x066c, TryCatch #7 {all -> 0x066c, blocks: (B:182:0x0622, B:184:0x062e, B:192:0x0673, B:194:0x0686, B:196:0x068a, B:198:0x0692, B:200:0x0696, B:202:0x069b, B:201:0x0699, B:203:0x069e), top: B:238:0x0622 }] */
    /* JADX WARN: Removed duplicated region for block: B:200:0x0696 A[Catch: all -> 0x066c, TryCatch #7 {all -> 0x066c, blocks: (B:182:0x0622, B:184:0x062e, B:192:0x0673, B:194:0x0686, B:196:0x068a, B:198:0x0692, B:200:0x0696, B:202:0x069b, B:201:0x0699, B:203:0x069e), top: B:238:0x0622 }] */
    /* JADX WARN: Removed duplicated region for block: B:201:0x0699 A[Catch: all -> 0x066c, TryCatch #7 {all -> 0x066c, blocks: (B:182:0x0622, B:184:0x062e, B:192:0x0673, B:194:0x0686, B:196:0x068a, B:198:0x0692, B:200:0x0696, B:202:0x069b, B:201:0x0699, B:203:0x069e), top: B:238:0x0622 }] */
    /* JADX WARN: Removed duplicated region for block: B:206:0x06c9  */
    /* JADX WARN: Removed duplicated region for block: B:209:0x06da  */
    /* JADX WARN: Removed duplicated region for block: B:212:0x06e3  */
    /* JADX WARN: Removed duplicated region for block: B:213:0x06e7  */
    /* JADX WARN: Removed duplicated region for block: B:219:0x0705 A[Catch: all -> 0x02f1, TRY_ENTER, TryCatch #0 {all -> 0x02f1, blocks: (B:48:0x02c0, B:55:0x02d4, B:57:0x02df, B:63:0x02f9, B:65:0x02ff, B:67:0x0316, B:68:0x031b, B:70:0x0328, B:72:0x032e, B:75:0x0346, B:219:0x0705, B:220:0x070a), top: B:225:0x02c0 }] */
    /* JADX WARN: Removed duplicated region for block: B:251:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:252:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:253:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x02c8  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001c  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x03aa A[Catch: all -> 0x03d8, TRY_LEAVE, TryCatch #4 {all -> 0x03d8, blocks: (B:82:0x0393, B:84:0x03aa), top: B:232:0x0393 }] */
    /* JADX WARN: Removed duplicated region for block: B:93:0x03da  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x03ee  */
    /* JADX WARN: Type inference failed for: r0v103 */
    /* JADX WARN: Type inference failed for: r0v104, types: [java.lang.Enum, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v117 */
    /* JADX WARN: Type inference failed for: r0v127, types: [java.lang.Enum, java.lang.Object, o0.I] */
    /* JADX WARN: Type inference failed for: r0v139 */
    /* JADX WARN: Type inference failed for: r0v147 */
    /* JADX WARN: Type inference failed for: r0v148 */
    /* JADX WARN: Type inference failed for: r0v149 */
    /* JADX WARN: Type inference failed for: r0v15 */
    /* JADX WARN: Type inference failed for: r0v25, types: [java.lang.Object, o0.A0] */
    /* JADX WARN: Type inference failed for: r0v43 */
    /* JADX WARN: Type inference failed for: r0v99 */
    /* JADX WARN: Type inference failed for: r12v1 */
    /* JADX WARN: Type inference failed for: r12v2, types: [java.lang.Enum, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r12v30, types: [o0.C1] */
    /* JADX WARN: Type inference failed for: r12v33, types: [i.c] */
    /* JADX WARN: Type inference failed for: r12v48 */
    /* JADX WARN: Type inference failed for: r15v17, types: [java.lang.Object, o0.I] */
    /* JADX WARN: Type inference failed for: r15v20 */
    /* JADX WARN: Type inference failed for: r15v21 */
    /* JADX WARN: Type inference failed for: r15v36 */
    /* JADX WARN: Type inference failed for: r15v37 */
    /* JADX WARN: Type inference failed for: r15v48, types: [java.lang.Object, o0.I] */
    /* JADX WARN: Type inference failed for: r15v51, types: [o0.I] */
    /* JADX WARN: Type inference failed for: r15v52 */
    /* JADX WARN: Type inference failed for: r15v53 */
    /* JADX WARN: Type inference failed for: r15v54 */
    /* JADX WARN: Type inference failed for: r15v55 */
    /* JADX WARN: Type inference failed for: r15v56 */
    /* JADX WARN: Type inference failed for: r15v6 */
    /* JADX WARN: Type inference failed for: r1v14 */
    /* JADX WARN: Type inference failed for: r1v20 */
    /* JADX WARN: Type inference failed for: r1v23 */
    /* JADX WARN: Type inference failed for: r1v29 */
    /* JADX WARN: Type inference failed for: r1v36 */
    /* JADX WARN: Type inference failed for: r1v39 */
    /* JADX WARN: Type inference failed for: r1v58, types: [java.lang.Object, o0.I] */
    /* JADX WARN: Type inference failed for: r1v60 */
    /* JADX WARN: Type inference failed for: r1v61, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v66 */
    /* JADX WARN: Type inference failed for: r1v68 */
    /* JADX WARN: Type inference failed for: r1v69, types: [o0.I] */
    /* JADX WARN: Type inference failed for: r1v79 */
    /* JADX WARN: Type inference failed for: r1v86 */
    /* JADX WARN: Type inference failed for: r1v87 */
    /* JADX WARN: Type inference failed for: r22v10 */
    /* JADX WARN: Type inference failed for: r24v10 */
    /* JADX WARN: Type inference failed for: r24v11 */
    /* JADX WARN: Type inference failed for: r24v9 */
    /* JADX WARN: Type inference failed for: r3v11 */
    /* JADX WARN: Type inference failed for: r3v12 */
    /* JADX WARN: Type inference failed for: r3v3 */
    /* JADX WARN: Type inference failed for: r3v6, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v7, types: [java.lang.Object, o0.I] */
    /* JADX WARN: Type inference failed for: r3v8 */
    /* JADX WARN: Type inference failed for: r5v16 */
    /* JADX WARN: Type inference failed for: r5v18 */
    /* JADX WARN: Type inference failed for: r5v37 */
    /* JADX WARN: Type inference failed for: r5v38 */
    /* JADX WARN: Type inference failed for: r5v54, types: [java.lang.Object, o0.A0] */
    /* JADX WARN: Type inference failed for: r5v59, types: [o0.A0] */
    /* JADX WARN: Type inference failed for: r5v9 */
    /* JADX WARN: Type inference failed for: r6v34, types: [o0.F0] */
    /* JADX WARN: Type inference failed for: r6v55, types: [java.lang.StringBuilder] */
    /* JADX WARN: Type inference failed for: r7v1, types: [o0.C1] */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r7v12 */
    /* JADX WARN: Type inference failed for: r7v13, types: [o0.F0] */
    /* JADX WARN: Type inference failed for: r7v16 */
    /* JADX WARN: Type inference failed for: r7v49 */
    /* JADX WARN: Type inference failed for: r7v50 */
    /* JADX WARN: Type inference failed for: r9v16 */
    /* JADX WARN: Type inference failed for: r9v19 */
    /* JADX WARN: Type inference failed for: r9v24 */
    /* JADX WARN: Type inference failed for: r9v29 */
    /* JADX WARN: Type inference failed for: r9v30, types: [o0.A0] */
    /* JADX WARN: Type inference failed for: r9v31, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v34, types: [java.lang.Object, o0.A0] */
    /* JADX WARN: Type inference failed for: r9v36 */
    /* JADX WARN: Type inference failed for: r9v37, types: [java.lang.Object, o0.A0] */
    /* JADX WARN: Type inference failed for: r9v39, types: [java.lang.Object, o0.A0] */
    /* JADX WARN: Type inference failed for: r9v40, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v41, types: [java.lang.Object, o0.A0] */
    /* JADX WARN: Type inference failed for: r9v43 */
    /* JADX WARN: Type inference failed for: r9v46 */
    /* JADX WARN: Type inference failed for: r9v47 */
    /* JADX WARN: Type inference failed for: r9v48 */
    /* JADX WARN: Type inference failed for: r9v49 */
    /* JADX WARN: Type inference failed for: r9v50 */
    /* JADX WARN: Type inference failed for: r9v51 */
    /* JADX WARN: Type inference failed for: r9v52 */
    /* JADX WARN: Type inference failed for: r9v53 */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object b(o0.A0 r24, o0.I r25, o0.C1220y r26, v4.InterfaceC1427e r27) {
        /*
            Method dump skipped, instruction units count: 1848
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: o0.A0.b(o0.A0, o0.I, o0.y, v4.e):java.lang.Object");
    }

    public static final Object c(A0 a02, I i6, C1 c12, C1207r0 c1207r0) throws Throwable {
        a02.getClass();
        int i7 = AbstractC1182e0.f11922a[i6.ordinal()];
        C1316l c1316l = C1316l.f12640a;
        if (i7 == 1) {
            Object objF = a02.f(c1207r0);
            return objF == EnumC1481a.f13592w ? objF : c1316l;
        }
        if (c12 == null) {
            throw new IllegalStateException("Cannot retry APPEND / PREPEND load on PagingSource without ViewportHint".toString());
        }
        S0.f fVar = a02.f11726f;
        fVar.getClass();
        if (i6 == I.f11773x || i6 == I.f11774y) {
            ((p.b) fVar.f3073x).d(null, new C1165A(i6, c12));
            return c1316l;
        }
        throw new IllegalArgumentException(("invalid load type for reset: " + i6).toString());
    }

    public static final void d(A0 a02, InterfaceC0080z interfaceC0080z) {
        if (a02.f11723c.f11784d != Integer.MIN_VALUE) {
            S3.a.B(interfaceC0080z, null, null, new C1219x0(a02, null), 3);
        }
        S3.a.B(interfaceC0080z, null, null, new C1221y0(a02, null), 3);
        S3.a.B(interfaceC0080z, null, null, new C1223z0(a02, null), 3);
    }

    public static String h(I i6, Object obj, AbstractC1178c1 abstractC1178c1) {
        if (abstractC1178c1 == null) {
            return "End " + i6 + " with loadkey " + obj + ". Load CANCELLED.";
        }
        return "End " + i6 + " with loadKey " + obj + ". Returned " + abstractC1178c1;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object e(v4.InterfaceC1427e r5) throws java.lang.Throwable {
        /*
            r4 = this;
            boolean r0 = r5 instanceof o0.C1194k0
            if (r0 == 0) goto L13
            r0 = r5
            o0.k0 r0 = (o0.C1194k0) r0
            int r1 = r0.f11990E
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f11990E = r1
            goto L18
        L13:
            o0.k0 r0 = new o0.k0
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.f11988C
            w4.a r1 = w4.EnumC1481a.f13592w
            int r2 = r0.f11990E
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            T4.d r1 = r0.f11987B
            o0.B0 r2 = r0.f11986A
            o0.A0 r0 = r0.f11991z
            S3.a.O(r5)
            goto L4d
        L2d:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L35:
            S3.a.O(r5)
            o0.B0 r2 = r4.f11729i
            T4.d r5 = r2.f11736a
            r0.f11991z = r4
            r0.f11986A = r2
            r0.f11987B = r5
            r0.f11990E = r3
            java.lang.Object r0 = r5.d(r0)
            if (r0 != r1) goto L4b
            return r1
        L4b:
            r0 = r4
            r1 = r5
        L4d:
            r5 = 0
            o0.F0 r2 = r2.f11737b     // Catch: java.lang.Throwable -> L62
            S0.f r0 = r0.f11726f     // Catch: java.lang.Throwable -> L62
            java.lang.Object r0 = r0.f3073x     // Catch: java.lang.Throwable -> L62
            p.b r0 = (p.b) r0     // Catch: java.lang.Throwable -> L62
            java.lang.Object r0 = r0.f12207c     // Catch: java.lang.Throwable -> L62
            o0.A1 r0 = (o0.A1) r0     // Catch: java.lang.Throwable -> L62
            o0.f1 r0 = r2.a(r0)     // Catch: java.lang.Throwable -> L62
            r1.f(r5)
            return r0
        L62:
            r0 = move-exception
            r1.f(r5)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: o0.A0.e(v4.e):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:105:0x026d A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:106:0x026e  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x011a A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x011b  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x012f  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0159 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x015a  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0161  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0193 A[Catch: all -> 0x0199, TRY_ENTER, TryCatch #3 {all -> 0x0199, blocks: (B:59:0x0179, B:61:0x0185, B:64:0x0193, B:67:0x019c, B:69:0x01a3), top: B:123:0x0179 }] */
    /* JADX WARN: Removed duplicated region for block: B:69:0x01a3 A[Catch: all -> 0x0199, TRY_LEAVE, TryCatch #3 {all -> 0x0199, blocks: (B:59:0x0179, B:61:0x0185, B:64:0x0193, B:67:0x019c, B:69:0x01a3), top: B:123:0x0179 }] */
    /* JADX WARN: Removed duplicated region for block: B:72:0x01ad  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x01f2 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:82:0x01f3  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0204  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x021f  */
    /* JADX WARN: Type inference failed for: r4v0, types: [int] */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v11, types: [boolean] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object f(v4.InterfaceC1427e r17) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 670
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: o0.A0.f(v4.e):java.lang.Object");
    }

    public final Z0 g(I i6, Object obj) {
        I i7 = I.f11772w;
        J0 j02 = this.f11723c;
        if (i6 == i7) {
            int i8 = j02.f11782b;
        } else {
            j02.getClass();
        }
        boolean z5 = j02.f11785e;
        AbstractC1305a.o(i6, "loadType");
        int iOrdinal = i6.ordinal();
        if (iOrdinal == 0) {
            return new Y0(obj);
        }
        if (iOrdinal == 1) {
            if (obj != null) {
                return new X0(obj);
            }
            throw new IllegalArgumentException("key cannot be null for prepend".toString());
        }
        if (iOrdinal != 2) {
            throw new C0733A();
        }
        if (obj != null) {
            return new W0(obj);
        }
        throw new IllegalArgumentException("key cannot be null for append".toString());
    }

    public final Object i(F0 f02, I i6, int i7, int i8) {
        int i9;
        f02.getClass();
        int iOrdinal = i6.ordinal();
        if (iOrdinal == 0) {
            throw new IllegalArgumentException("Cannot get loadId for loadType: REFRESH");
        }
        if (iOrdinal == 1) {
            i9 = f02.f11755g;
        } else {
            if (iOrdinal != 2) {
                throw new C0733A();
            }
            i9 = f02.f11756h;
        }
        if (i7 != i9 || (f02.f11760l.q(i6) instanceof C1168D) || i8 >= this.f11723c.f11781a) {
            return null;
        }
        I i10 = I.f11773x;
        ArrayList arrayList = f02.f11751c;
        return i6 == i10 ? ((C1175b1) t4.n.b0(arrayList)).f11898x : ((C1175b1) t4.n.g0(arrayList)).f11899y;
    }

    public final Object j(F0 f02, I i6, C1168D c1168d, x4.c cVar) {
        boolean zC = AbstractC1305a.c(f02.f11760l.q(i6), c1168d);
        C1316l c1316l = C1316l.f12640a;
        if (!zC) {
            C0803c c0803c = f02.f11760l;
            c0803c.P(i6, c1168d);
            Object objA = this.f11728h.a(new N(c0803c.S(), null), cVar);
            if (objA == EnumC1481a.f13592w) {
                return objA;
            }
        }
        return c1316l;
    }

    public final Object k(F0 f02, I i6, x4.c cVar) {
        G gQ = f02.f11760l.q(i6);
        C1169E c1169e = C1169E.f11745b;
        boolean zC = AbstractC1305a.c(gQ, c1169e);
        C1316l c1316l = C1316l.f12640a;
        if (!zC) {
            C0803c c0803c = f02.f11760l;
            c0803c.P(i6, c1169e);
            Object objA = this.f11728h.a(new N(c0803c.S(), null), cVar);
            if (objA == EnumC1481a.f13592w) {
                return objA;
            }
        }
        return c1316l;
    }
}
