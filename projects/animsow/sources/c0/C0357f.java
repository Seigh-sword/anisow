package c0;

import android.os.Build;

/* JADX INFO: renamed from: c0.f, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0357f extends com.bumptech.glide.c {

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ C0358g f6116x;

    public C0357f(C0358g c0358g) {
        this.f6116x = c0358g;
    }

    @Override // com.bumptech.glide.c
    public final void E(P0.h hVar) {
        C0358g c0358g = this.f6116x;
        c0358g.f6117A = hVar;
        P0.h hVar2 = c0358g.f6117A;
        Object obj = c0358g.f1734x;
        l lVar = (l) obj;
        P2.e eVar = lVar.f6130g;
        C0356e c0356e = lVar.f6132i;
        ((l) obj).getClass();
        c0358g.f6118z = new v(hVar2, eVar, c0356e, Build.VERSION.SDK_INT >= 34 ? q.a() : com.bumptech.glide.d.o());
        ((l) c0358g.f1734x).e();
    }

    @Override // com.bumptech.glide.c
    public final void z(Throwable th) {
        ((l) this.f6116x.f1734x).d(th);
    }
}
