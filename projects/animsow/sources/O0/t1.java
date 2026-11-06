package o0;

import s4.AbstractC1305a;

/* JADX INFO: loaded from: classes.dex */
public final class t1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final w1 f12110a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f12111b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final T4.d f12112c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public M4.b0 f12113d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f12114e;

    public t1(w1 w1Var, boolean z5) {
        AbstractC1305a.o(w1Var, "singleRunner");
        this.f12110a = w1Var;
        this.f12111b = z5;
        this.f12112c = T4.e.a();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(M4.b0 r5, v4.InterfaceC1427e r6) throws java.lang.Throwable {
        /*
            r4 = this;
            boolean r0 = r6 instanceof o0.r1
            if (r0 == 0) goto L13
            r0 = r6
            o0.r1 r0 = (o0.r1) r0
            int r1 = r0.f12087E
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f12087E = r1
            goto L18
        L13:
            o0.r1 r0 = new o0.r1
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.f12085C
            w4.a r1 = w4.EnumC1481a.f13592w
            int r2 = r0.f12087E
            r3 = 1
            if (r2 == 0) goto L37
            if (r2 != r3) goto L2f
            T4.d r5 = r0.f12084B
            M4.b0 r1 = r0.f12083A
            o0.t1 r0 = r0.f12088z
            S3.a.O(r6)
            r6 = r5
            r5 = r1
            goto L4c
        L2f:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L37:
            S3.a.O(r6)
            r0.f12088z = r4
            r0.f12083A = r5
            T4.d r6 = r4.f12112c
            r0.f12084B = r6
            r0.f12087E = r3
            java.lang.Object r0 = r6.d(r0)
            if (r0 != r1) goto L4b
            return r1
        L4b:
            r0 = r4
        L4c:
            r1 = 0
            M4.b0 r2 = r0.f12113d     // Catch: java.lang.Throwable -> L54
            if (r5 != r2) goto L56
            r0.f12113d = r1     // Catch: java.lang.Throwable -> L54
            goto L56
        L54:
            r5 = move-exception
            goto L5c
        L56:
            r6.f(r1)
            s4.l r5 = s4.C1316l.f12640a
            return r5
        L5c:
            r6.f(r1)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: o0.t1.a(M4.b0, v4.e):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r11v0, types: [M4.b0] */
    /* JADX WARN: Type inference failed for: r11v1 */
    /* JADX WARN: Type inference failed for: r11v14 */
    /* JADX WARN: Type inference failed for: r11v15 */
    /* JADX WARN: Type inference failed for: r11v5 */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v6 */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v3, types: [M4.b0] */
    /* JADX WARN: Type inference failed for: r2v4, types: [M4.b0] */
    /* JADX WARN: Type inference failed for: r2v5 */
    /* JADX WARN: Type inference failed for: r2v7 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object b(int r10, M4.b0 r11, v4.InterfaceC1427e r12) throws java.lang.Throwable {
        /*
            r9 = this;
            boolean r0 = r12 instanceof o0.s1
            if (r0 == 0) goto L13
            r0 = r12
            o0.s1 r0 = (o0.s1) r0
            int r1 = r0.f12101F
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f12101F = r1
            goto L18
        L13:
            o0.s1 r0 = new o0.s1
            r0.<init>(r9, r12)
        L18:
            java.lang.Object r12 = r0.f12099D
            w4.a r1 = w4.EnumC1481a.f13592w
            int r2 = r0.f12101F
            r3 = 2
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L4b
            if (r2 == r4) goto L3f
            if (r2 != r3) goto L37
            int r10 = r0.f12098C
            T4.a r11 = r0.f12097B
            M4.b0 r1 = r0.f12096A
            o0.t1 r0 = r0.f12102z
            S3.a.O(r12)     // Catch: java.lang.Throwable -> L34
            goto L9e
        L34:
            r10 = move-exception
            goto Lae
        L37:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L3f:
            int r10 = r0.f12098C
            T4.a r11 = r0.f12097B
            M4.b0 r2 = r0.f12096A
            o0.t1 r6 = r0.f12102z
            S3.a.O(r12)
            goto L64
        L4b:
            S3.a.O(r12)
            r0.f12102z = r9
            r0.f12096A = r11
            T4.d r12 = r9.f12112c
            r0.f12097B = r12
            r0.f12098C = r10
            r0.f12101F = r4
            java.lang.Object r2 = r12.d(r0)
            if (r2 != r1) goto L61
            return r1
        L61:
            r6 = r9
            r2 = r11
            r11 = r12
        L64:
            M4.b0 r12 = r6.f12113d     // Catch: java.lang.Throwable -> L34
            if (r12 == 0) goto L7b
            boolean r7 = r12.c()     // Catch: java.lang.Throwable -> L34
            if (r7 == 0) goto L7b
            int r7 = r6.f12114e     // Catch: java.lang.Throwable -> L34
            if (r7 < r10) goto L7b
            if (r7 != r10) goto L79
            boolean r7 = r6.f12111b     // Catch: java.lang.Throwable -> L34
            if (r7 == 0) goto L79
            goto L7b
        L79:
            r4 = 0
            goto La4
        L7b:
            if (r12 == 0) goto L87
            o0.q1 r7 = new o0.q1     // Catch: java.lang.Throwable -> L34
            o0.w1 r8 = r6.f12110a     // Catch: java.lang.Throwable -> L34
            r7.<init>(r8)     // Catch: java.lang.Throwable -> L34
            r12.b(r7)     // Catch: java.lang.Throwable -> L34
        L87:
            if (r12 == 0) goto La0
            r0.f12102z = r6     // Catch: java.lang.Throwable -> L34
            r0.f12096A = r2     // Catch: java.lang.Throwable -> L34
            r0.f12097B = r11     // Catch: java.lang.Throwable -> L34
            r0.f12098C = r10     // Catch: java.lang.Throwable -> L34
            r0.f12101F = r3     // Catch: java.lang.Throwable -> L34
            M4.k0 r12 = (M4.k0) r12     // Catch: java.lang.Throwable -> L34
            java.lang.Object r12 = r12.R(r0)     // Catch: java.lang.Throwable -> L34
            if (r12 != r1) goto L9c
            return r1
        L9c:
            r1 = r2
            r0 = r6
        L9e:
            r6 = r0
            r2 = r1
        La0:
            r6.f12113d = r2     // Catch: java.lang.Throwable -> L34
            r6.f12114e = r10     // Catch: java.lang.Throwable -> L34
        La4:
            java.lang.Boolean r10 = java.lang.Boolean.valueOf(r4)     // Catch: java.lang.Throwable -> L34
            T4.d r11 = (T4.d) r11
            r11.f(r5)
            return r10
        Lae:
            T4.d r11 = (T4.d) r11
            r11.f(r5)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: o0.t1.b(int, M4.b0, v4.e):java.lang.Object");
    }
}
