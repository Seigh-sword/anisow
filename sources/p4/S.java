package P4;

import M4.InterfaceC0080z;
import s4.C1316l;
import v4.InterfaceC1427e;

/* JADX INFO: loaded from: classes.dex */
public final class S extends x4.h implements C4.p {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public int f2627A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public final /* synthetic */ h0 f2628B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0146g f2629C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public final /* synthetic */ V f2630D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public final /* synthetic */ Object f2631E;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public S(h0 h0Var, InterfaceC0146g interfaceC0146g, V v5, Object obj, InterfaceC1427e interfaceC1427e) {
        super(2, interfaceC1427e);
        this.f2628B = h0Var;
        this.f2629C = interfaceC0146g;
        this.f2630D = v5;
        this.f2631E = obj;
    }

    @Override // C4.p
    public final Object h(Object obj, Object obj2) {
        return ((S) l((InterfaceC0080z) obj, (InterfaceC1427e) obj2)).n(C1316l.f12640a);
    }

    @Override // x4.AbstractC1492a
    public final InterfaceC1427e l(Object obj, InterfaceC1427e interfaceC1427e) {
        return new S(this.f2628B, this.f2629C, this.f2630D, this.f2631E, interfaceC1427e);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:25:0x005b A[RETURN] */
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
            int r1 = r8.f2627A
            r2 = 4
            r3 = 3
            r4 = 1
            P4.g r5 = r8.f2629C
            r6 = 2
            P4.V r7 = r8.f2630D
            if (r1 == 0) goto L27
            if (r1 == r4) goto L23
            if (r1 == r6) goto L1f
            if (r1 == r3) goto L23
            if (r1 != r2) goto L17
            goto L23
        L17:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L1f:
            S3.a.O(r9)
            goto L53
        L23:
            S3.a.O(r9)
            goto L7b
        L27:
            S3.a.O(r9)
            P4.i0 r9 = P4.g0.f2689a
            P4.h0 r1 = r8.f2628B
            if (r1 != r9) goto L39
            r8.f2627A = r4
            java.lang.Object r9 = r5.d(r7, r8)
            if (r9 != r0) goto L7b
            return r0
        L39:
            P4.i0 r9 = P4.g0.f2690b
            r4 = 0
            if (r1 != r9) goto L5c
            r9 = r7
            Q4.b r9 = (Q4.AbstractC0168b) r9
            Q4.B r9 = r9.i()
            P4.P r1 = new P4.P
            r1.<init>(r6, r4)
            r8.f2627A = r6
            java.lang.Object r9 = s4.AbstractC1305a.z(r9, r1, r8)
            if (r9 != r0) goto L53
            return r0
        L53:
            r8.f2627A = r3
            java.lang.Object r9 = r5.d(r7, r8)
            if (r9 != r0) goto L7b
            return r0
        L5c:
            r9 = r7
            Q4.b r9 = (Q4.AbstractC0168b) r9
            Q4.B r9 = r9.i()
            P4.g r9 = r1.a(r9)
            P4.g r9 = s4.AbstractC1305a.w(r9)
            P4.Q r1 = new P4.Q
            java.lang.Object r3 = r8.f2631E
            r1.<init>(r5, r7, r3, r4)
            r8.f2627A = r2
            java.lang.Object r9 = s4.AbstractC1305a.q(r9, r1, r8)
            if (r9 != r0) goto L7b
            return r0
        L7b:
            s4.l r9 = s4.C1316l.f12640a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: P4.S.n(java.lang.Object):java.lang.Object");
    }
}
