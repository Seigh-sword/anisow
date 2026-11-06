package androidx.lifecycle;

import l0.AbstractC0920b;
import s4.AbstractC1305a;
import s4.InterfaceC1309e;

/* JADX INFO: loaded from: classes.dex */
public final class c0 implements InterfaceC1309e {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public b0 f5610A;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final I4.b f5611w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final C4.a f5612x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final C4.a f5613y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final C4.a f5614z;

    public c0(D4.d dVar, C4.a aVar, C4.a aVar2, C4.a aVar3) {
        this.f5611w = dVar;
        this.f5612x = aVar;
        this.f5613y = aVar2;
        this.f5614z = aVar3;
    }

    @Override // s4.InterfaceC1309e
    public final Object getValue() {
        b0 b0Var = this.f5610A;
        if (b0Var != null) {
            return b0Var;
        }
        i0 i0Var = (i0) this.f5612x.b();
        e0 e0Var = (e0) this.f5613y.b();
        AbstractC0920b abstractC0920b = (AbstractC0920b) this.f5614z.b();
        AbstractC1305a.o(i0Var, "store");
        AbstractC1305a.o(e0Var, "factory");
        AbstractC1305a.o(abstractC0920b, "extras");
        b0 b0VarA = new h0(i0Var, e0Var, abstractC0920b).a(this.f5611w);
        this.f5610A = b0VarA;
        return b0VarA;
    }
}
