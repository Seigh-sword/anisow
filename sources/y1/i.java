package y1;

import d.AbstractC0628i;

/* JADX INFO: loaded from: classes.dex */
public final class i implements d, c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d f13780a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f13781b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public volatile c f13782c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public volatile c f13783d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f13784e = 3;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f13785f = 3;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f13786g;

    public i(Object obj, d dVar) {
        this.f13781b = obj;
        this.f13780a = dVar;
    }

    @Override // y1.d, y1.c
    public final boolean a() {
        boolean z5;
        synchronized (this.f13781b) {
            try {
                z5 = this.f13783d.a() || this.f13782c.a();
            } finally {
            }
        }
        return z5;
    }

    @Override // y1.d
    public final d b() {
        d dVarB;
        synchronized (this.f13781b) {
            try {
                d dVar = this.f13780a;
                dVarB = dVar != null ? dVar.b() : this;
            } catch (Throwable th) {
                throw th;
            }
        }
        return dVarB;
    }

    @Override // y1.d
    public final void c(c cVar) {
        synchronized (this.f13781b) {
            try {
                if (!cVar.equals(this.f13782c)) {
                    this.f13785f = 5;
                    return;
                }
                this.f13784e = 5;
                d dVar = this.f13780a;
                if (dVar != null) {
                    dVar.c(this);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // y1.c
    public final void clear() {
        synchronized (this.f13781b) {
            this.f13786g = false;
            this.f13784e = 3;
            this.f13785f = 3;
            this.f13783d.clear();
            this.f13782c.clear();
        }
    }

    @Override // y1.d
    public final boolean d(c cVar) {
        boolean z5;
        synchronized (this.f13781b) {
            try {
                d dVar = this.f13780a;
                z5 = (dVar == null || dVar.d(this)) && (cVar.equals(this.f13782c) || this.f13784e != 4);
            } finally {
            }
        }
        return z5;
    }

    @Override // y1.c
    public final void e() {
        synchronized (this.f13781b) {
            try {
                if (!AbstractC0628i.c(this.f13785f)) {
                    this.f13785f = 2;
                    this.f13783d.e();
                }
                if (!AbstractC0628i.c(this.f13784e)) {
                    this.f13784e = 2;
                    this.f13782c.e();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // y1.c
    public final void f() {
        synchronized (this.f13781b) {
            try {
                this.f13786g = true;
                try {
                    if (this.f13784e != 4 && this.f13785f != 1) {
                        this.f13785f = 1;
                        this.f13783d.f();
                    }
                    if (this.f13786g && this.f13784e != 1) {
                        this.f13784e = 1;
                        this.f13782c.f();
                    }
                    this.f13786g = false;
                } catch (Throwable th) {
                    this.f13786g = false;
                    throw th;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // y1.d
    public final void g(c cVar) {
        synchronized (this.f13781b) {
            try {
                if (cVar.equals(this.f13783d)) {
                    this.f13785f = 4;
                    return;
                }
                this.f13784e = 4;
                d dVar = this.f13780a;
                if (dVar != null) {
                    dVar.g(this);
                }
                if (!AbstractC0628i.c(this.f13785f)) {
                    this.f13783d.clear();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // y1.d
    public final boolean h(c cVar) {
        boolean z5;
        synchronized (this.f13781b) {
            try {
                d dVar = this.f13780a;
                z5 = (dVar == null || dVar.h(this)) && cVar.equals(this.f13782c) && !a();
            } finally {
            }
        }
        return z5;
    }

    @Override // y1.c
    public final boolean i() {
        boolean z5;
        synchronized (this.f13781b) {
            z5 = this.f13784e == 4;
        }
        return z5;
    }

    @Override // y1.c
    public final boolean isRunning() {
        boolean z5;
        synchronized (this.f13781b) {
            z5 = true;
            if (this.f13784e != 1) {
                z5 = false;
            }
        }
        return z5;
    }

    @Override // y1.c
    public final boolean j() {
        boolean z5;
        synchronized (this.f13781b) {
            z5 = this.f13784e == 3;
        }
        return z5;
    }

    @Override // y1.d
    public final boolean k(c cVar) {
        boolean z5;
        synchronized (this.f13781b) {
            try {
                d dVar = this.f13780a;
                z5 = (dVar == null || dVar.k(this)) && cVar.equals(this.f13782c) && this.f13784e != 2;
            } finally {
            }
        }
        return z5;
    }

    @Override // y1.c
    public final boolean l(c cVar) {
        if (!(cVar instanceof i)) {
            return false;
        }
        i iVar = (i) cVar;
        if (this.f13782c == null) {
            if (iVar.f13782c != null) {
                return false;
            }
        } else if (!this.f13782c.l(iVar.f13782c)) {
            return false;
        }
        if (this.f13783d == null) {
            if (iVar.f13783d != null) {
                return false;
            }
        } else if (!this.f13783d.l(iVar.f13783d)) {
            return false;
        }
        return true;
    }
}
