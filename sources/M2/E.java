package m2;

/* JADX INFO: loaded from: classes.dex */
public final class E {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final Object f10545f = new Object();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f10546a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final InterfaceC1019D f10547b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f10548c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Object f10549d = new Object();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public volatile Object f10550e = null;

    public E(String str, Object obj, InterfaceC1019D interfaceC1019D) {
        this.f10546a = str;
        this.f10548c = obj;
        this.f10547b = interfaceC1019D;
    }

    /* JADX WARN: Removed duplicated region for block: B:45:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x005f A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(java.lang.Object r4) {
        /*
            r3 = this;
            java.lang.Object r0 = r3.f10549d
            monitor-enter(r0)
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L6c
            if (r4 == 0) goto L7
            return r4
        L7:
            V0.m r4 = f2.h.f8419c
            if (r4 != 0) goto Le
            java.lang.Object r4 = r3.f10548c
            return r4
        Le:
            java.lang.Object r4 = m2.E.f10545f
            monitor-enter(r4)
            boolean r0 = V0.m.h()     // Catch: java.lang.Throwable -> L1e
            if (r0 == 0) goto L24
            java.lang.Object r0 = r3.f10550e     // Catch: java.lang.Throwable -> L1e
            if (r0 != 0) goto L20
            java.lang.Object r0 = r3.f10548c     // Catch: java.lang.Throwable -> L1e
            goto L22
        L1e:
            r0 = move-exception
            goto L6a
        L20:
            java.lang.Object r0 = r3.f10550e     // Catch: java.lang.Throwable -> L1e
        L22:
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L1e
            return r0
        L24:
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L1e
            java.util.List r4 = m2.AbstractC1078w.f11172a     // Catch: java.lang.SecurityException -> L58
            java.util.Iterator r4 = r4.iterator()     // Catch: java.lang.SecurityException -> L58
        L2b:
            boolean r0 = r4.hasNext()     // Catch: java.lang.SecurityException -> L58
            if (r0 == 0) goto L58
            java.lang.Object r0 = r4.next()     // Catch: java.lang.SecurityException -> L58
            m2.E r0 = (m2.E) r0     // Catch: java.lang.SecurityException -> L58
            boolean r1 = V0.m.h()     // Catch: java.lang.SecurityException -> L58
            if (r1 != 0) goto L50
            r1 = 0
            m2.D r2 = r0.f10547b     // Catch: java.lang.IllegalStateException -> L46 java.lang.SecurityException -> L58
            if (r2 == 0) goto L46
            java.lang.Object r1 = r2.a()     // Catch: java.lang.IllegalStateException -> L46 java.lang.SecurityException -> L58
        L46:
            java.lang.Object r2 = m2.E.f10545f     // Catch: java.lang.SecurityException -> L58
            monitor-enter(r2)     // Catch: java.lang.SecurityException -> L58
            r0.f10550e = r1     // Catch: java.lang.Throwable -> L4d
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L4d
            goto L2b
        L4d:
            r4 = move-exception
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L4d
            throw r4     // Catch: java.lang.SecurityException -> L58
        L50:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException     // Catch: java.lang.SecurityException -> L58
            java.lang.String r0 = "Refreshing flag cache must be done on a worker thread."
            r4.<init>(r0)     // Catch: java.lang.SecurityException -> L58
            throw r4     // Catch: java.lang.SecurityException -> L58
        L58:
            m2.D r4 = r3.f10547b
            if (r4 != 0) goto L5f
            java.lang.Object r4 = r3.f10548c
            return r4
        L5f:
            java.lang.Object r4 = r4.a()     // Catch: java.lang.IllegalStateException -> L64 java.lang.SecurityException -> L67
            return r4
        L64:
            java.lang.Object r4 = r3.f10548c
            return r4
        L67:
            java.lang.Object r4 = r3.f10548c
            return r4
        L6a:
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L1e
            throw r0
        L6c:
            r4 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L6c
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: m2.E.a(java.lang.Object):java.lang.Object");
    }
}
