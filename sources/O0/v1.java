package o0;

import M4.InterfaceC0080z;
import s4.C1316l;
import v4.InterfaceC1427e;

/* JADX INFO: loaded from: classes.dex */
public final class v1 extends x4.h implements C4.p {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public int f12139A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public /* synthetic */ Object f12140B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public final /* synthetic */ w1 f12141C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public final /* synthetic */ int f12142D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public final /* synthetic */ C4.l f12143E;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v1(w1 w1Var, int i6, C4.l lVar, InterfaceC1427e interfaceC1427e) {
        super(2, interfaceC1427e);
        this.f12141C = w1Var;
        this.f12142D = i6;
        this.f12143E = lVar;
    }

    @Override // C4.p
    public final Object h(Object obj, Object obj2) {
        return ((v1) l((InterfaceC0080z) obj, (InterfaceC1427e) obj2)).n(C1316l.f12640a);
    }

    @Override // x4.AbstractC1492a
    public final InterfaceC1427e l(Object obj, InterfaceC1427e interfaceC1427e) {
        v1 v1Var = new v1(this.f12141C, this.f12142D, this.f12143E, interfaceC1427e);
        v1Var.f12140B = obj;
        return v1Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0085 A[RETURN] */
    /* JADX WARN: Type inference failed for: r1v0, types: [int] */
    /* JADX WARN: Type inference failed for: r1v1, types: [M4.b0] */
    /* JADX WARN: Type inference failed for: r1v13 */
    /* JADX WARN: Type inference failed for: r1v14 */
    /* JADX WARN: Type inference failed for: r1v8, types: [M4.b0] */
    /* JADX WARN: Type inference failed for: r3v1, types: [o0.t1] */
    /* JADX WARN: Type inference failed for: r9v14, types: [o0.t1] */
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
    @Override // x4.AbstractC1492a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object n(java.lang.Object r9) throws java.lang.Throwable {
        /*
            r8 = this;
            w4.a r0 = w4.EnumC1481a.f13592w
            int r1 = r8.f12139A
            r2 = 4
            r3 = 3
            r4 = 2
            r5 = 1
            o0.w1 r6 = r8.f12141C
            if (r1 == 0) goto L3c
            if (r1 == r5) goto L34
            if (r1 == r4) goto L2a
            if (r1 == r3) goto L25
            if (r1 == r2) goto L1c
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L1c:
            java.lang.Object r0 = r8.f12140B
            java.lang.Throwable r0 = (java.lang.Throwable) r0
            S3.a.O(r9)
            goto L94
        L25:
            S3.a.O(r9)
            goto L95
        L2a:
            java.lang.Object r1 = r8.f12140B
            M4.b0 r1 = (M4.b0) r1
            S3.a.O(r9)     // Catch: java.lang.Throwable -> L32
            goto L78
        L32:
            r9 = move-exception
            goto L86
        L34:
            java.lang.Object r1 = r8.f12140B
            M4.b0 r1 = (M4.b0) r1
            S3.a.O(r9)
            goto L63
        L3c:
            S3.a.O(r9)
            java.lang.Object r9 = r8.f12140B
            M4.z r9 = (M4.InterfaceC0080z) r9
            v4.j r9 = r9.u()
            M4.x r1 = M4.C0078x.f1930x
            v4.h r9 = r9.n(r1)
            if (r9 == 0) goto L98
            M4.b0 r9 = (M4.b0) r9
            o0.t1 r1 = r6.f12150a
            r8.f12140B = r9
            r8.f12139A = r5
            int r5 = r8.f12142D
            java.lang.Object r1 = r1.b(r5, r9, r8)
            if (r1 != r0) goto L60
            return r0
        L60:
            r7 = r1
            r1 = r9
            r9 = r7
        L63:
            java.lang.Boolean r9 = (java.lang.Boolean) r9
            boolean r9 = r9.booleanValue()
            if (r9 == 0) goto L95
            C4.l r9 = r8.f12143E     // Catch: java.lang.Throwable -> L32
            r8.f12140B = r1     // Catch: java.lang.Throwable -> L32
            r8.f12139A = r4     // Catch: java.lang.Throwable -> L32
            java.lang.Object r9 = r9.j(r8)     // Catch: java.lang.Throwable -> L32
            if (r9 != r0) goto L78
            return r0
        L78:
            o0.t1 r9 = r6.f12150a
            r2 = 0
            r8.f12140B = r2
            r8.f12139A = r3
            java.lang.Object r9 = r9.a(r1, r8)
            if (r9 != r0) goto L95
            return r0
        L86:
            o0.t1 r3 = r6.f12150a
            r8.f12140B = r9
            r8.f12139A = r2
            java.lang.Object r1 = r3.a(r1, r8)
            if (r1 != r0) goto L93
            return r0
        L93:
            r0 = r9
        L94:
            throw r0
        L95:
            s4.l r9 = s4.C1316l.f12640a
            return r9
        L98:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "Internal error. coroutineScope should've created a job."
            java.lang.String r0 = r0.toString()
            r9.<init>(r0)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: o0.v1.n(java.lang.Object):java.lang.Object");
    }
}
