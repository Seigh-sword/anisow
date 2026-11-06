package N3;

import v4.InterfaceC1432j;

/* JADX INFO: loaded from: classes.dex */
public final class M implements J {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final double f2158f = Math.random();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ int f2159g = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Y2.g f2160a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final E3.d f2161b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final P3.m f2162c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final InterfaceC0126l f2163d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final InterfaceC1432j f2164e;

    public M(Y2.g gVar, E3.d dVar, P3.m mVar, C0125k c0125k, InterfaceC1432j interfaceC1432j) {
        this.f2160a = gVar;
        this.f2161b = dVar;
        this.f2162c = mVar;
        this.f2163d = c0125k;
        this.f2164e = interfaceC1432j;
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0016  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object a(N3.M r5, v4.InterfaceC1427e r6) throws java.lang.Throwable {
        /*
            r5.getClass()
            boolean r0 = r6 instanceof N3.L
            if (r0 == 0) goto L16
            r0 = r6
            N3.L r0 = (N3.L) r0
            int r1 = r0.f2156C
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L16
            int r1 = r1 - r2
            r0.f2156C = r1
            goto L1b
        L16:
            N3.L r0 = new N3.L
            r0.<init>(r5, r6)
        L1b:
            java.lang.Object r6 = r0.f2154A
            w4.a r1 = w4.EnumC1481a.f13592w
            int r2 = r0.f2156C
            r3 = 1
            java.lang.String r4 = "SessionFirelogPublisher"
            if (r2 == 0) goto L36
            if (r2 != r3) goto L2e
            N3.M r5 = r0.f2157z
            S3.a.O(r6)
            goto L4b
        L2e:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L36:
            S3.a.O(r6)
            java.lang.String r6 = "Data Collection is enabled for at least one Subscriber"
            android.util.Log.d(r4, r6)
            r0.f2157z = r5
            r0.f2156C = r3
            P3.m r6 = r5.f2162c
            java.lang.Object r6 = r6.b(r0)
            if (r6 != r1) goto L4b
            goto L85
        L4b:
            P3.m r6 = r5.f2162c
            P3.r r0 = r6.f2551a
            java.lang.Boolean r0 = r0.b()
            if (r0 == 0) goto L5a
            boolean r6 = r0.booleanValue()
            goto L66
        L5a:
            P3.r r6 = r6.f2552b
            java.lang.Boolean r6 = r6.b()
            if (r6 == 0) goto L70
            boolean r6 = r6.booleanValue()
        L66:
            if (r6 != 0) goto L70
            java.lang.String r5 = "Sessions SDK disabled. Events will not be sent."
            android.util.Log.d(r4, r5)
        L6d:
            java.lang.Boolean r1 = java.lang.Boolean.FALSE
            goto L85
        L70:
            P3.m r5 = r5.f2162c
            double r5 = r5.a()
            double r0 = N3.M.f2158f
            int r5 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r5 > 0) goto L7f
            java.lang.Boolean r1 = java.lang.Boolean.TRUE
            goto L85
        L7f:
            java.lang.String r5 = "Sessions SDK has dropped this session due to sampling."
            android.util.Log.d(r4, r5)
            goto L6d
        L85:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: N3.M.a(N3.M, v4.e):java.lang.Object");
    }
}
