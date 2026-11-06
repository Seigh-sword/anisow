package P4;

/* JADX INFO: loaded from: classes.dex */
public final class A implements InterfaceC0146g {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ int f2570w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0146g f2571x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ Object f2572y;

    public /* synthetic */ A(InterfaceC0146g interfaceC0146g, Object obj, int i6) {
        this.f2570w = i6;
        this.f2571x = interfaceC0146g;
        this.f2572y = obj;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0040  */
    @Override // P4.InterfaceC0146g
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object d(P4.InterfaceC0147h r10, v4.InterfaceC1427e r11) throws java.lang.Throwable {
        /*
            r9 = this;
            s4.l r0 = s4.C1316l.f12640a
            w4.a r1 = w4.EnumC1481a.f13592w
            int r2 = r9.f2570w
            P4.g r3 = r9.f2571x
            java.lang.Object r4 = r9.f2572y
            switch(r2) {
                case 0: goto L7e;
                case 1: goto L2d;
                case 2: goto L1d;
                default: goto Ld;
            }
        Ld:
            o0.h0 r2 = new o0.h0
            N3.F r4 = (N3.F) r4
            r5 = 2
            r2.<init>(r10, r5, r4)
            java.lang.Object r10 = r3.d(r2, r11)
            if (r10 != r1) goto L1c
            r0 = r10
        L1c:
            return r0
        L1d:
            o0.h0 r2 = new o0.h0
            C4.p r4 = (C4.p) r4
            r5 = 3
            r2.<init>(r10, r5, r4)
            java.lang.Object r10 = r3.d(r2, r11)
            if (r10 != r1) goto L2c
            r0 = r10
        L2c:
            return r0
        L2d:
            boolean r2 = r11 instanceof P4.D
            if (r2 == 0) goto L40
            r2 = r11
            P4.D r2 = (P4.D) r2
            int r5 = r2.f2581A
            r6 = -2147483648(0xffffffff80000000, float:-0.0)
            r7 = r5 & r6
            if (r7 == 0) goto L40
            int r5 = r5 - r6
            r2.f2581A = r5
            goto L45
        L40:
            P4.D r2 = new P4.D
            r2.<init>(r9, r11)
        L45:
            java.lang.Object r11 = r2.f2584z
            int r5 = r2.f2581A
            r6 = 1
            if (r5 == 0) goto L5e
            if (r5 != r6) goto L56
            P4.F r10 = r2.f2583C
            S3.a.O(r11)     // Catch: Q4.C0167a -> L54
            goto L7c
        L54:
            r11 = move-exception
            goto L78
        L56:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L5e:
            S3.a.O(r11)
            P4.F r11 = new P4.F
            C4.p r4 = (C4.p) r4
            r11.<init>(r4, r10)
            r2.f2583C = r11     // Catch: Q4.C0167a -> L74
            r2.f2581A = r6     // Catch: Q4.C0167a -> L74
            java.lang.Object r10 = r3.d(r11, r2)     // Catch: Q4.C0167a -> L74
            if (r10 != r1) goto L7c
            r0 = r1
            goto L7c
        L74:
            r10 = move-exception
            r8 = r11
            r11 = r10
            r10 = r8
        L78:
            java.lang.Object r1 = r11.f2829w
            if (r1 != r10) goto L7d
        L7c:
            return r0
        L7d:
            throw r11
        L7e:
            D4.o r2 = new D4.o
            r2.<init>()
            P4.C r5 = new P4.C
            C4.p r4 = (C4.p) r4
            r5.<init>(r2, r10, r4)
            java.lang.Object r10 = r3.d(r5, r11)
            if (r10 != r1) goto L91
            r0 = r10
        L91:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: P4.A.d(P4.h, v4.e):java.lang.Object");
    }
}
