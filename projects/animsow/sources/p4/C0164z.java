package P4;

/* JADX INFO: renamed from: P4.z, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0164z implements InterfaceC0147h {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ D4.p f2772w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ int f2773x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0147h f2774y;

    public C0164z(D4.p pVar, int i6, InterfaceC0147h interfaceC0147h) {
        this.f2772w = pVar;
        this.f2773x = i6;
        this.f2774y = interfaceC0147h;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // P4.InterfaceC0147h
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object k(java.lang.Object r7, v4.InterfaceC1427e r8) throws java.lang.Throwable {
        /*
            r6 = this;
            boolean r0 = r8 instanceof P4.C0163y
            if (r0 == 0) goto L13
            r0 = r8
            P4.y r0 = (P4.C0163y) r0
            int r1 = r0.f2770B
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f2770B = r1
            goto L18
        L13:
            P4.y r0 = new P4.y
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.f2771z
            w4.a r1 = w4.EnumC1481a.f13592w
            int r2 = r0.f2770B
            s4.l r3 = s4.C1316l.f12640a
            r4 = 1
            if (r2 == 0) goto L31
            if (r2 != r4) goto L29
            S3.a.O(r8)
            goto L47
        L29:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L31:
            S3.a.O(r8)
            D4.p r8 = r6.f2772w
            int r2 = r8.f375w
            int r5 = r6.f2773x
            if (r2 < r5) goto L48
            r0.f2770B = r4
            P4.h r8 = r6.f2774y
            java.lang.Object r7 = r8.k(r7, r0)
            if (r7 != r1) goto L47
            return r1
        L47:
            return r3
        L48:
            int r2 = r2 + r4
            r8.f375w = r2
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: P4.C0164z.k(java.lang.Object, v4.e):java.lang.Object");
    }
}
