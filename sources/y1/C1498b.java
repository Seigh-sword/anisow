package y1;

/* JADX INFO: renamed from: y1.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1498b implements d, c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f13744a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d f13745b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public volatile c f13746c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public volatile c f13747d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f13748e = 3;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f13749f = 3;

    public C1498b(Object obj, d dVar) {
        this.f13744a = obj;
        this.f13745b = dVar;
    }

    @Override // y1.d, y1.c
    public final boolean a() {
        boolean z5;
        synchronized (this.f13744a) {
            try {
                z5 = this.f13746c.a() || this.f13747d.a();
            } finally {
            }
        }
        return z5;
    }

    @Override // y1.d
    public final d b() {
        d dVarB;
        synchronized (this.f13744a) {
            try {
                d dVar = this.f13745b;
                dVarB = dVar != null ? dVar.b() : this;
            } catch (Throwable th) {
                throw th;
            }
        }
        return dVarB;
    }

    @Override // y1.d
    public final void c(c cVar) {
        synchronized (this.f13744a) {
            try {
                if (cVar.equals(this.f13747d)) {
                    this.f13749f = 5;
                    d dVar = this.f13745b;
                    if (dVar != null) {
                        dVar.c(this);
                    }
                    return;
                }
                this.f13748e = 5;
                if (this.f13749f != 1) {
                    this.f13749f = 1;
                    this.f13747d.f();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // y1.c
    public final void clear() {
        synchronized (this.f13744a) {
            try {
                this.f13748e = 3;
                this.f13746c.clear();
                if (this.f13749f != 3) {
                    this.f13749f = 3;
                    this.f13747d.clear();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // y1.d
    public final boolean d(c cVar) {
        boolean z5;
        synchronized (this.f13744a) {
            d dVar = this.f13745b;
            z5 = dVar == null || dVar.d(this);
        }
        return z5;
    }

    @Override // y1.c
    public final void e() {
        synchronized (this.f13744a) {
            try {
                if (this.f13748e == 1) {
                    this.f13748e = 2;
                    this.f13746c.e();
                }
                if (this.f13749f == 1) {
                    this.f13749f = 2;
                    this.f13747d.e();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // y1.c
    public final void f() {
        synchronized (this.f13744a) {
            try {
                if (this.f13748e != 1) {
                    this.f13748e = 1;
                    this.f13746c.f();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // y1.d
    public final void g(c cVar) {
        synchronized (this.f13744a) {
            try {
                if (cVar.equals(this.f13746c)) {
                    this.f13748e = 4;
                } else if (cVar.equals(this.f13747d)) {
                    this.f13749f = 4;
                }
                d dVar = this.f13745b;
                if (dVar != null) {
                    dVar.g(this);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x002c  */
    @Override // y1.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean h(y1.c r4) {
        /*
            r3 = this;
            java.lang.Object r0 = r3.f13744a
            monitor-enter(r0)
            y1.d r1 = r3.f13745b     // Catch: java.lang.Throwable -> L2f
            if (r1 == 0) goto Ld
            boolean r1 = r1.h(r3)     // Catch: java.lang.Throwable -> L2f
            if (r1 == 0) goto L2c
        Ld:
            int r1 = r3.f13748e     // Catch: java.lang.Throwable -> L2f
            r2 = 5
            if (r1 == r2) goto L1b
            y1.c r1 = r3.f13746c     // Catch: java.lang.Throwable -> L2f
            boolean r4 = r4.equals(r1)     // Catch: java.lang.Throwable -> L2f
            if (r4 == 0) goto L2c
            goto L2a
        L1b:
            y1.c r1 = r3.f13747d     // Catch: java.lang.Throwable -> L2f
            boolean r4 = r4.equals(r1)     // Catch: java.lang.Throwable -> L2f
            if (r4 == 0) goto L2c
            int r4 = r3.f13749f     // Catch: java.lang.Throwable -> L2f
            r1 = 4
            if (r4 == r1) goto L2a
            if (r4 != r2) goto L2c
        L2a:
            r4 = 1
            goto L2d
        L2c:
            r4 = 0
        L2d:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L2f
            return r4
        L2f:
            r4 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L2f
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: y1.C1498b.h(y1.c):boolean");
    }

    @Override // y1.c
    public final boolean i() {
        boolean z5;
        synchronized (this.f13744a) {
            try {
                z5 = this.f13748e == 4 || this.f13749f == 4;
            } finally {
            }
        }
        return z5;
    }

    @Override // y1.c
    public final boolean isRunning() {
        boolean z5;
        synchronized (this.f13744a) {
            try {
                z5 = true;
                if (this.f13748e != 1 && this.f13749f != 1) {
                    z5 = false;
                }
            } finally {
            }
        }
        return z5;
    }

    @Override // y1.c
    public final boolean j() {
        boolean z5;
        synchronized (this.f13744a) {
            try {
                z5 = this.f13748e == 3 && this.f13749f == 3;
            } finally {
            }
        }
        return z5;
    }

    @Override // y1.d
    public final boolean k(c cVar) {
        boolean z5;
        synchronized (this.f13744a) {
            d dVar = this.f13745b;
            z5 = (dVar == null || dVar.k(this)) && cVar.equals(this.f13746c);
        }
        return z5;
    }

    @Override // y1.c
    public final boolean l(c cVar) {
        if (!(cVar instanceof C1498b)) {
            return false;
        }
        C1498b c1498b = (C1498b) cVar;
        return this.f13746c.l(c1498b.f13746c) && this.f13747d.l(c1498b.f13747d);
    }
}
