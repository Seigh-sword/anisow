package d3;

import N.C0095h;
import q0.C1256a;

/* JADX INFO: loaded from: classes.dex */
public final class p implements D3.c, D3.b {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final C0095h f8215c = new C0095h(24);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final g f8216d = new g(1);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public D3.a f8217a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public volatile D3.c f8218b;

    public p(C0095h c0095h, D3.c cVar) {
        this.f8217a = c0095h;
        this.f8218b = cVar;
    }

    public final void a(D3.a aVar) {
        D3.c cVar;
        D3.c cVar2;
        D3.c cVar3 = this.f8218b;
        g gVar = f8216d;
        if (cVar3 != gVar) {
            aVar.e(cVar3);
            return;
        }
        synchronized (this) {
            cVar = this.f8218b;
            if (cVar != gVar) {
                cVar2 = cVar;
            } else {
                this.f8217a = new C1256a(this.f8217a, 3, aVar);
                cVar2 = null;
            }
        }
        if (cVar2 != null) {
            aVar.e(cVar);
        }
    }

    @Override // D3.c
    public final Object get() {
        return this.f8218b.get();
    }
}
