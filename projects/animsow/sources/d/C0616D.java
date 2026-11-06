package d;

import s4.AbstractC1305a;
import t4.C1351h;

/* JADX INFO: renamed from: d.D, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0616D implements InterfaceC0622c {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final AbstractC0641v f8080w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ C0618F f8081x;

    public C0616D(C0618F c0618f, AbstractC0641v abstractC0641v) {
        this.f8081x = c0618f;
        this.f8080w = abstractC0641v;
    }

    @Override // d.InterfaceC0622c
    public final void cancel() {
        C0618F c0618f = this.f8081x;
        C1351h c1351h = c0618f.f8084b;
        AbstractC0641v abstractC0641v = this.f8080w;
        c1351h.remove(abstractC0641v);
        if (AbstractC1305a.c(c0618f.f8085c, abstractC0641v)) {
            abstractC0641v.a();
            c0618f.f8085c = null;
        }
        abstractC0641v.getClass();
        abstractC0641v.f8150b.remove(this);
        C4.a aVar = abstractC0641v.f8151c;
        if (aVar != null) {
            aVar.b();
        }
        abstractC0641v.f8151c = null;
    }
}
