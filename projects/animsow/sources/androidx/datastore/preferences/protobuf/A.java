package androidx.datastore.preferences.protobuf;

/* JADX INFO: loaded from: classes.dex */
public abstract class A extends AbstractC0264a {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final C f5358w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public C f5359x;

    public A(C c6) {
        this.f5358w = c6;
        if (c6.j()) {
            throw new IllegalArgumentException("Default instance must be immutable.");
        }
        this.f5359x = c6.l();
    }

    public static void f(C c6, AbstractC0266b abstractC0266b) {
        C0277g0 c0277g0 = C0277g0.f5444c;
        c0277g0.getClass();
        c0277g0.a(c6.getClass()).d(c6, abstractC0266b);
    }

    public final C a() {
        C cD = d();
        cD.getClass();
        if (C.i(cD, true)) {
            return cD;
        }
        throw new s0();
    }

    public final Object clone() {
        A a6 = (A) this.f5358w.f(5);
        a6.f5359x = d();
        return a6;
    }

    public final C d() {
        if (!this.f5359x.j()) {
            return this.f5359x;
        }
        C c6 = this.f5359x;
        c6.getClass();
        C0277g0 c0277g0 = C0277g0.f5444c;
        c0277g0.getClass();
        c0277g0.a(c6.getClass()).h(c6);
        c6.k();
        return this.f5359x;
    }

    public final void e() {
        if (this.f5359x.j()) {
            return;
        }
        C cL = this.f5358w.l();
        f(cL, this.f5359x);
        this.f5359x = cL;
    }
}
