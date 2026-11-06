package Y;

import W.InterfaceC0182a;
import W.i0;
import f5.m;
import f5.w;
import java.util.concurrent.atomic.AtomicBoolean;
import s4.AbstractC1305a;

/* JADX INFO: loaded from: classes.dex */
public final class i implements InterfaceC0182a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final m f4733a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final w f4734b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final c f4735c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final i0 f4736d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final C4.a f4737e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final L3.c f4738f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final T4.d f4739g;

    public i(m mVar, w wVar, c cVar, i0 i0Var, e eVar) {
        AbstractC1305a.o(mVar, "fileSystem");
        AbstractC1305a.o(wVar, "path");
        AbstractC1305a.o(cVar, "serializer");
        AbstractC1305a.o(i0Var, "coordinator");
        this.f4733a = mVar;
        this.f4734b = wVar;
        this.f4735c = cVar;
        this.f4736d = i0Var;
        this.f4737e = eVar;
        this.f4738f = new L3.c(0);
        this.f4739g = T4.e.a();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0081 A[Catch: all -> 0x0082, TRY_ENTER, TRY_LEAVE, TryCatch #0 {all -> 0x0082, blocks: (B:33:0x0081, B:42:0x0092, B:41:0x008f, B:38:0x008a), top: B:50:0x0020, inners: #4 }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r0v10, types: [Y.i] */
    /* JADX WARN: Type inference failed for: r0v13 */
    /* JADX WARN: Type inference failed for: r0v14 */
    /* JADX WARN: Type inference failed for: r0v15 */
    /* JADX WARN: Type inference failed for: r0v2, types: [Y.g, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r0v4, types: [Y.i] */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v7 */
    /* JADX WARN: Type inference failed for: r0v8 */
    /* JADX WARN: Type inference failed for: r0v9, types: [Y.i] */
    /* JADX WARN: Type inference failed for: r10v0, types: [W.r] */
    /* JADX WARN: Type inference failed for: r10v1 */
    /* JADX WARN: Type inference failed for: r10v10 */
    /* JADX WARN: Type inference failed for: r10v11 */
    /* JADX WARN: Type inference failed for: r10v12 */
    /* JADX WARN: Type inference failed for: r10v15, types: [boolean] */
    /* JADX WARN: Type inference failed for: r10v16 */
    /* JADX WARN: Type inference failed for: r10v2 */
    /* JADX WARN: Type inference failed for: r10v6 */
    /* JADX WARN: Type inference failed for: r10v8 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(W.r r10, v4.InterfaceC1427e r11) throws java.lang.Throwable {
        /*
            r9 = this;
            boolean r0 = r11 instanceof Y.g
            if (r0 == 0) goto L13
            r0 = r11
            Y.g r0 = (Y.g) r0
            int r1 = r0.f4724E
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f4724E = r1
            goto L18
        L13:
            Y.g r0 = new Y.g
            r0.<init>(r9, r11)
        L18:
            java.lang.Object r11 = r0.f4722C
            w4.a r1 = w4.EnumC1481a.f13592w
            int r2 = r0.f4724E
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L38
            if (r2 != r3) goto L30
            boolean r10 = r0.f4721B
            Y.b r1 = r0.f4720A
            Y.i r0 = r0.f4725z
            S3.a.O(r11)     // Catch: java.lang.Throwable -> L2e
            goto L71
        L2e:
            r11 = move-exception
            goto L8a
        L30:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L38:
            S3.a.O(r11)
            L3.c r11 = r9.f4738f
            java.lang.Object r11 = r11.f1734x
            java.util.concurrent.atomic.AtomicBoolean r11 = (java.util.concurrent.atomic.AtomicBoolean) r11
            boolean r11 = r11.get()
            r11 = r11 ^ r3
            if (r11 == 0) goto La0
            T4.d r11 = r9.f4739g
            boolean r11 = r11.e(r4)
            Y.b r2 = new Y.b     // Catch: java.lang.Throwable -> L93
            f5.m r5 = r9.f4733a     // Catch: java.lang.Throwable -> L93
            f5.w r6 = r9.f4734b     // Catch: java.lang.Throwable -> L93
            Y.c r7 = r9.f4735c     // Catch: java.lang.Throwable -> L93
            r2.<init>(r5, r6, r7)     // Catch: java.lang.Throwable -> L93
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r11)     // Catch: java.lang.Throwable -> L84
            r0.f4725z = r9     // Catch: java.lang.Throwable -> L84
            r0.f4720A = r2     // Catch: java.lang.Throwable -> L84
            r0.f4721B = r11     // Catch: java.lang.Throwable -> L84
            r0.f4724E = r3     // Catch: java.lang.Throwable -> L84
            java.lang.Object r10 = r10.g(r2, r5, r0)     // Catch: java.lang.Throwable -> L84
            if (r10 != r1) goto L6c
            return r1
        L6c:
            r0 = r9
            r1 = r2
            r8 = r11
            r11 = r10
            r10 = r8
        L71:
            r1.close()     // Catch: java.lang.Throwable -> L76
            r1 = r4
            goto L77
        L76:
            r1 = move-exception
        L77:
            if (r1 != 0) goto L81
            if (r10 == 0) goto L80
            T4.d r10 = r0.f4739g
            r10.f(r4)
        L80:
            return r11
        L81:
            throw r1     // Catch: java.lang.Throwable -> L82
        L82:
            r11 = move-exception
            goto L98
        L84:
            r10 = move-exception
            r0 = r9
            r1 = r2
            r8 = r11
            r11 = r10
            r10 = r8
        L8a:
            r1.close()     // Catch: java.lang.Throwable -> L8e
            goto L92
        L8e:
            r1 = move-exception
            s4.AbstractC1305a.b(r11, r1)     // Catch: java.lang.Throwable -> L82
        L92:
            throw r11     // Catch: java.lang.Throwable -> L82
        L93:
            r10 = move-exception
            r0 = r9
            r8 = r11
            r11 = r10
            r10 = r8
        L98:
            if (r10 == 0) goto L9f
            T4.d r10 = r0.f4739g
            r10.f(r4)
        L9f:
            throw r11
        La0:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "StorageConnection has already been disposed."
            java.lang.String r11 = r11.toString()
            r10.<init>(r11)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.i.a(W.r, v4.e):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00fe A[Catch: all -> 0x010e, IOException -> 0x0111, TRY_ENTER, TryCatch #9 {IOException -> 0x0111, all -> 0x010e, blocks: (B:49:0x00fe, B:51:0x0106, B:59:0x011e, B:66:0x012d, B:65:0x012a), top: B:95:0x0021 }] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x011e A[Catch: all -> 0x010e, IOException -> 0x0111, TRY_ENTER, TRY_LEAVE, TryCatch #9 {IOException -> 0x0111, all -> 0x010e, blocks: (B:49:0x00fe, B:51:0x0106, B:59:0x011e, B:66:0x012d, B:65:0x012a), top: B:95:0x0021 }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r0v12 */
    /* JADX WARN: Type inference failed for: r0v3, types: [f5.m] */
    /* JADX WARN: Type inference failed for: r0v5, types: [f5.m, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v7 */
    /* JADX WARN: Type inference failed for: r0v8, types: [Y.i] */
    /* JADX WARN: Type inference failed for: r11v19, types: [f5.m] */
    /* JADX WARN: Type inference failed for: r11v22, types: [f5.m] */
    /* JADX WARN: Type inference failed for: r12v2 */
    /* JADX WARN: Type inference failed for: r12v20, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r12v24 */
    /* JADX WARN: Type inference failed for: r12v27 */
    /* JADX WARN: Type inference failed for: r12v3 */
    /* JADX WARN: Type inference failed for: r12v4 */
    /* JADX WARN: Type inference failed for: r12v6 */
    /* JADX WARN: Type inference failed for: r12v7 */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v3, types: [f5.w] */
    /* JADX WARN: Type inference failed for: r1v7 */
    /* JADX WARN: Type inference failed for: r2v0, types: [int] */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v13 */
    /* JADX WARN: Type inference failed for: r2v2, types: [f5.w] */
    /* JADX WARN: Type inference failed for: r2v5, types: [f5.w] */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r2v7 */
    /* JADX WARN: Type inference failed for: r2v8 */
    /* JADX WARN: Type inference failed for: r6v0 */
    /* JADX WARN: Type inference failed for: r6v1, types: [Y.i] */
    /* JADX WARN: Type inference failed for: r6v4 */
    /* JADX WARN: Type inference failed for: r6v5, types: [Y.i] */
    /* JADX WARN: Type inference failed for: r6v7 */
    /* JADX WARN: Type inference failed for: r8v2, types: [f5.m] */
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
    public final java.lang.Object b(W.V r11, v4.InterfaceC1427e r12) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 352
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.i.b(W.V, v4.e):java.lang.Object");
    }

    @Override // W.InterfaceC0182a
    public final void close() {
        ((AtomicBoolean) this.f4738f.f1734x).set(true);
        this.f4737e.b();
    }
}
