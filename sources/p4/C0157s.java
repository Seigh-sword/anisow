package P4;

/* JADX INFO: renamed from: P4.s, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0157s implements InterfaceC0146g {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ C4.p f2750w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0146g f2751x;

    public C0157s(C4.p pVar, InterfaceC0146g interfaceC0146g) {
        this.f2750w = pVar;
        this.f2751x = interfaceC0146g;
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0073 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // P4.InterfaceC0146g
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object d(P4.InterfaceC0147h r7, v4.InterfaceC1427e r8) throws java.lang.Throwable {
        /*
            r6 = this;
            boolean r0 = r8 instanceof P4.r
            if (r0 == 0) goto L13
            r0 = r8
            P4.r r0 = (P4.r) r0
            int r1 = r0.f2743A
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f2743A = r1
            goto L18
        L13:
            P4.r r0 = new P4.r
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.f2748z
            w4.a r1 = w4.EnumC1481a.f13592w
            int r2 = r0.f2743A
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3e
            if (r2 == r4) goto L32
            if (r2 != r3) goto L2a
            S3.a.O(r8)
            goto L74
        L2a:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L32:
            Q4.w r7 = r0.f2747E
            P4.h r2 = r0.f2746D
            P4.s r4 = r0.f2745C
            S3.a.O(r8)     // Catch: java.lang.Throwable -> L3c
            goto L5f
        L3c:
            r8 = move-exception
            goto L7b
        L3e:
            S3.a.O(r8)
            Q4.w r8 = new Q4.w
            v4.j r2 = r0.f13684x
            s4.AbstractC1305a.l(r2)
            r8.<init>(r7, r2)
            C4.p r2 = r6.f2750w     // Catch: java.lang.Throwable -> L77
            r0.f2745C = r6     // Catch: java.lang.Throwable -> L77
            r0.f2746D = r7     // Catch: java.lang.Throwable -> L77
            r0.f2747E = r8     // Catch: java.lang.Throwable -> L77
            r0.f2743A = r4     // Catch: java.lang.Throwable -> L77
            java.lang.Object r2 = r2.h(r8, r0)     // Catch: java.lang.Throwable -> L77
            if (r2 != r1) goto L5c
            return r1
        L5c:
            r4 = r6
            r2 = r7
            r7 = r8
        L5f:
            r7.p()
            P4.g r7 = r4.f2751x
            r8 = 0
            r0.f2745C = r8
            r0.f2746D = r8
            r0.f2747E = r8
            r0.f2743A = r3
            java.lang.Object r7 = r7.d(r2, r0)
            if (r7 != r1) goto L74
            return r1
        L74:
            s4.l r7 = s4.C1316l.f12640a
            return r7
        L77:
            r7 = move-exception
            r5 = r8
            r8 = r7
            r7 = r5
        L7b:
            r7.p()
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: P4.C0157s.d(P4.h, v4.e):java.lang.Object");
    }
}
