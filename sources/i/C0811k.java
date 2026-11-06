package i;

import android.content.Context;
import e.InterfaceC0659a;

/* JADX INFO: renamed from: i.k, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0811k implements InterfaceC0659a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f9322a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AbstractActivityC0812l f9323b;

    public /* synthetic */ C0811k(W0.b bVar, int i6) {
        this.f9322a = i6;
        this.f9323b = bVar;
    }

    @Override // e.InterfaceC0659a
    public final void a(Context context) {
        int i6 = this.f9322a;
        AbstractActivityC0812l abstractActivityC0812l = this.f9323b;
        switch (i6) {
            case com.bumptech.glide.d.f6312l /* 0 */:
                AbstractC0818s abstractC0818sK = abstractActivityC0812l.k();
                abstractC0818sK.a();
                abstractActivityC0812l.f8142z.f14072b.a("androidx:appcompat");
                abstractC0818sK.c();
                break;
            default:
                W0.g gVar = (W0.g) abstractActivityC0812l;
                if (!gVar.f4204Z) {
                    gVar.f4204Z = true;
                    W0.c cVar = (W0.c) gVar.c();
                    cVar.getClass();
                }
                break;
        }
    }
}
