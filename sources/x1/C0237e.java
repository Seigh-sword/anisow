package X1;

/* JADX INFO: renamed from: X1.e, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0237e implements InterfaceC0236d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ AbstractC0238f f4559a;

    public C0237e(AbstractC0238f abstractC0238f) {
        this.f4559a = abstractC0238f;
    }

    @Override // X1.InterfaceC0236d
    public final void a(U1.b bVar) {
        boolean zC = bVar.c();
        AbstractC0238f abstractC0238f = this.f4559a;
        if (zC) {
            abstractC0238f.c(null, abstractC0238f.s());
            return;
        }
        InterfaceC0235c interfaceC0235c = abstractC0238f.f4583u;
        if (interfaceC0235c != null) {
            interfaceC0235c.e(bVar);
        }
    }
}
