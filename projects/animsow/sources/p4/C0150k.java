package P4;

/* JADX INFO: renamed from: P4.k, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0150k implements InterfaceC0146g {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ int f2703w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final Object f2704x;

    public C0150k() {
        f0 f0Var = f0.f2685w;
        this.f2703w = 0;
        this.f2704x = f0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x001e  */
    @Override // P4.InterfaceC0146g
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object d(P4.InterfaceC0147h r9, v4.InterfaceC1427e r10) throws java.lang.Throwable {
        /*
            r8 = this;
            s4.l r0 = s4.C1316l.f12640a
            w4.a r1 = w4.EnumC1481a.f13592w
            int r2 = r8.f2703w
            java.lang.Object r3 = r8.f2704x
            switch(r2) {
                case 0: goto L6a;
                default: goto Lb;
            }
        Lb:
            boolean r2 = r10 instanceof P4.C0140a
            if (r2 == 0) goto L1e
            r2 = r10
            P4.a r2 = (P4.C0140a) r2
            int r4 = r2.f2644C
            r5 = -2147483648(0xffffffff80000000, float:-0.0)
            r6 = r4 & r5
            if (r6 == 0) goto L1e
            int r4 = r4 - r5
            r2.f2644C = r4
            goto L23
        L1e:
            P4.a r2 = new P4.a
            r2.<init>(r8, r10)
        L23:
            java.lang.Object r10 = r2.f2642A
            int r4 = r2.f2644C
            r5 = 1
            if (r4 == 0) goto L3c
            if (r4 != r5) goto L34
            Q4.w r9 = r2.f2645z
            S3.a.O(r10)     // Catch: java.lang.Throwable -> L32
            goto L5c
        L32:
            r10 = move-exception
            goto L66
        L34:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L3c:
            S3.a.O(r10)
            Q4.w r10 = new Q4.w
            v4.j r4 = r2.f13684x
            s4.AbstractC1305a.l(r4)
            r10.<init>(r9, r4)
            r2.f2645z = r10     // Catch: java.lang.Throwable -> L64
            r2.f2644C = r5     // Catch: java.lang.Throwable -> L64
            C4.p r3 = (C4.p) r3     // Catch: java.lang.Throwable -> L64
            java.lang.Object r9 = r3.h(r10, r2)     // Catch: java.lang.Throwable -> L64
            if (r9 != r1) goto L56
            goto L57
        L56:
            r9 = r0
        L57:
            if (r9 != r1) goto L5b
            r0 = r1
            goto L5f
        L5b:
            r9 = r10
        L5c:
            r9.p()
        L5f:
            return r0
        L60:
            r7 = r10
            r10 = r9
            r9 = r7
            goto L66
        L64:
            r9 = move-exception
            goto L60
        L66:
            r9.p()
            throw r10
        L6a:
            java.lang.Object r9 = r9.k(r3, r10)
            if (r9 != r1) goto L71
            r0 = r9
        L71:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: P4.C0150k.d(P4.h, v4.e):java.lang.Object");
    }

    public C0150k(C4.p pVar) {
        this.f2703w = 1;
        this.f2704x = pVar;
    }
}
