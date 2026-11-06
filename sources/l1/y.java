package l1;

import t0.AbstractC1332d;

/* JADX INFO: loaded from: classes.dex */
public final class y implements F {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public final j1.i f10012A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public int f10013B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public boolean f10014C;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final boolean f10015w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final boolean f10016x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final F f10017y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final x f10018z;

    public y(F f6, boolean z5, boolean z6, j1.i iVar, x xVar) {
        AbstractC1332d.l(f6, "Argument must not be null");
        this.f10017y = f6;
        this.f10015w = z5;
        this.f10016x = z6;
        this.f10012A = iVar;
        AbstractC1332d.l(xVar, "Argument must not be null");
        this.f10018z = xVar;
    }

    @Override // l1.F
    public final Object a() {
        return this.f10017y.a();
    }

    public final synchronized void b() {
        if (this.f10014C) {
            throw new IllegalStateException("Cannot acquire a recycled resource");
        }
        this.f10013B++;
    }

    @Override // l1.F
    public final int c() {
        return this.f10017y.c();
    }

    @Override // l1.F
    public final Class d() {
        return this.f10017y.d();
    }

    public final void e() {
        boolean z5;
        synchronized (this) {
            int i6 = this.f10013B;
            if (i6 <= 0) {
                throw new IllegalStateException("Cannot release a recycled or not yet acquired resource");
            }
            z5 = true;
            int i7 = i6 - 1;
            this.f10013B = i7;
            if (i7 != 0) {
                z5 = false;
            }
        }
        if (z5) {
            ((q) this.f10018z).e(this.f10012A, this);
        }
    }

    @Override // l1.F
    public final synchronized void f() {
        if (this.f10013B > 0) {
            throw new IllegalStateException("Cannot recycle a resource while it is still acquired");
        }
        if (this.f10014C) {
            throw new IllegalStateException("Cannot recycle a resource that has already been recycled");
        }
        this.f10014C = true;
        if (this.f10016x) {
            this.f10017y.f();
        }
    }

    public final synchronized String toString() {
        return "EngineResource{isMemoryCacheable=" + this.f10015w + ", listener=" + this.f10018z + ", key=" + this.f10012A + ", acquired=" + this.f10013B + ", isRecycled=" + this.f10014C + ", resource=" + this.f10017y + '}';
    }
}
