package E3;

/* JADX INFO: loaded from: classes.dex */
public final class f implements i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j f412a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final q2.j f413b;

    public f(j jVar, q2.j jVar2) {
        this.f412a = jVar;
        this.f413b = jVar2;
    }

    @Override // E3.i
    public final boolean a(F3.a aVar) {
        if (aVar.f621b != F3.c.f635z || this.f412a.b(aVar)) {
            return false;
        }
        String str = aVar.f622c;
        if (str == null) {
            throw new NullPointerException("Null token");
        }
        this.f413b.a(new a(str, aVar.f624e, aVar.f625f));
        return true;
    }

    @Override // E3.i
    public final boolean b(Exception exc) {
        this.f413b.b(exc);
        return true;
    }
}
