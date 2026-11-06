package X1;

/* JADX INFO: loaded from: classes.dex */
public final class K extends z {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ AbstractC0238f f4530g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public K(AbstractC0238f abstractC0238f, int i6) {
        super(abstractC0238f, i6, null);
        this.f4530g = abstractC0238f;
    }

    @Override // X1.z
    public final void b(U1.b bVar) {
        AbstractC0238f abstractC0238f = this.f4530g;
        abstractC0238f.getClass();
        abstractC0238f.f4577o.a(bVar);
        abstractC0238f.f4566d = bVar.f3576x;
        abstractC0238f.f4567e = System.currentTimeMillis();
    }

    @Override // X1.z
    public final boolean c() {
        this.f4530g.f4577o.a(U1.b.f3574A);
        return true;
    }
}
