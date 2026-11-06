package l1;

import i.C0803c;

/* JADX INFO: renamed from: l1.E, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0926E implements F, D1.b {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public static final C0803c f9847A = new C0803c(new M.c(20), new I0.o(7), D1.d.f289a);

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final D1.e f9848w = new D1.e();

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public F f9849x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public boolean f9850y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public boolean f9851z;

    @Override // l1.F
    public final Object a() {
        return this.f9849x.a();
    }

    public final synchronized void b() {
        this.f9848w.a();
        if (!this.f9850y) {
            throw new IllegalStateException("Already unlocked");
        }
        this.f9850y = false;
        if (this.f9851z) {
            f();
        }
    }

    @Override // l1.F
    public final int c() {
        return this.f9849x.c();
    }

    @Override // l1.F
    public final Class d() {
        return this.f9849x.d();
    }

    @Override // D1.b
    public final D1.e e() {
        return this.f9848w;
    }

    @Override // l1.F
    public final synchronized void f() {
        this.f9848w.a();
        this.f9851z = true;
        if (!this.f9850y) {
            this.f9849x.f();
            this.f9849x = null;
            f9847A.d(this);
        }
    }
}
