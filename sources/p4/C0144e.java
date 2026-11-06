package P4;

import v4.InterfaceC1432j;

/* JADX INFO: renamed from: P4.e, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0144e implements InterfaceC0147h {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ int f2676w = 0;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final Object f2677x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final Object f2678y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final Object f2679z;

    public C0144e(C0145f c0145f, D4.r rVar, InterfaceC0147h interfaceC0147h) {
        this.f2677x = c0145f;
        this.f2678y = rVar;
        this.f2679z = interfaceC0147h;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x002e  */
    @Override // P4.InterfaceC0147h
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object k(java.lang.Object r10, v4.InterfaceC1427e r11) throws java.lang.Throwable {
        /*
            r9 = this;
            s4.l r0 = s4.C1316l.f12640a
            w4.a r1 = w4.EnumC1481a.f13592w
            int r2 = r9.f2676w
            java.lang.Object r3 = r9.f2678y
            java.lang.Object r4 = r9.f2679z
            java.lang.Object r5 = r9.f2677x
            switch(r2) {
                case 0: goto L1b;
                default: goto Lf;
            }
        Lf:
            v4.j r5 = (v4.InterfaceC1432j) r5
            C4.p r4 = (C4.p) r4
            java.lang.Object r10 = s4.AbstractC1305a.Z(r5, r10, r3, r4, r11)
            if (r10 != r1) goto L1a
            r0 = r10
        L1a:
            return r0
        L1b:
            boolean r2 = r11 instanceof P4.C0143d
            if (r2 == 0) goto L2e
            r2 = r11
            P4.d r2 = (P4.C0143d) r2
            int r6 = r2.f2671B
            r7 = -2147483648(0xffffffff80000000, float:-0.0)
            r8 = r6 & r7
            if (r8 == 0) goto L2e
            int r6 = r6 - r7
            r2.f2671B = r6
            goto L33
        L2e:
            P4.d r2 = new P4.d
            r2.<init>(r9, r11)
        L33:
            java.lang.Object r11 = r2.f2672z
            int r6 = r2.f2671B
            r7 = 1
            if (r6 == 0) goto L48
            if (r6 != r7) goto L40
            S3.a.O(r11)
            goto L76
        L40:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L48:
            S3.a.O(r11)
            P4.f r5 = (P4.C0145f) r5
            C4.l r11 = r5.f2683x
            java.lang.Object r11 = r11.j(r10)
            D4.r r3 = (D4.r) r3
            java.lang.Object r6 = r3.f377w
            j3.A r8 = Q4.AbstractC0169c.f2835b
            if (r6 == r8) goto L69
            C4.p r5 = r5.f2684y
            java.lang.Object r5 = r5.h(r6, r11)
            java.lang.Boolean r5 = (java.lang.Boolean) r5
            boolean r5 = r5.booleanValue()
            if (r5 != 0) goto L76
        L69:
            r3.f377w = r11
            P4.h r4 = (P4.InterfaceC0147h) r4
            r2.f2671B = r7
            java.lang.Object r10 = r4.k(r10, r2)
            if (r10 != r1) goto L76
            r0 = r1
        L76:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: P4.C0144e.k(java.lang.Object, v4.e):java.lang.Object");
    }

    public C0144e(InterfaceC0147h interfaceC0147h, InterfaceC1432j interfaceC1432j) {
        this.f2677x = interfaceC1432j;
        this.f2678y = R4.a.e(interfaceC1432j);
        this.f2679z = new Q4.C(interfaceC0147h, null);
    }
}
