package N;

import d2.AbstractC0651b;

/* JADX INFO: loaded from: classes.dex */
public abstract class t0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C0 f2045a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public G.c[] f2046b;

    public t0() {
        this(new C0());
    }

    public final void a() {
        G.c[] cVarArr = this.f2046b;
        if (cVarArr != null) {
            G.c cVarF = cVarArr[AbstractC0651b.t(1)];
            G.c cVarF2 = this.f2046b[AbstractC0651b.t(2)];
            C0 c02 = this.f2045a;
            if (cVarF2 == null) {
                cVarF2 = c02.f1943a.f(2);
            }
            if (cVarF == null) {
                cVarF = c02.f1943a.f(1);
            }
            g(G.c.a(cVarF, cVarF2));
            G.c cVar = this.f2046b[AbstractC0651b.t(16)];
            if (cVar != null) {
                f(cVar);
            }
            G.c cVar2 = this.f2046b[AbstractC0651b.t(32)];
            if (cVar2 != null) {
                d(cVar2);
            }
            G.c cVar3 = this.f2046b[AbstractC0651b.t(64)];
            if (cVar3 != null) {
                h(cVar3);
            }
        }
    }

    public abstract C0 b();

    public void c(int i6, G.c cVar) {
        if (this.f2046b == null) {
            this.f2046b = new G.c[9];
        }
        for (int i7 = 1; i7 <= 256; i7 <<= 1) {
            if ((i6 & i7) != 0) {
                this.f2046b[AbstractC0651b.t(i7)] = cVar;
            }
        }
    }

    public abstract void e(G.c cVar);

    public abstract void g(G.c cVar);

    public t0(C0 c02) {
        this.f2045a = c02;
    }

    public void d(G.c cVar) {
    }

    public void f(G.c cVar) {
    }

    public void h(G.c cVar) {
    }
}
