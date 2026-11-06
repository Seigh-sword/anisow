package E3;

/* JADX INFO: loaded from: classes.dex */
public final class g implements i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final q2.j f414a;

    public g(q2.j jVar) {
        this.f414a = jVar;
    }

    @Override // E3.i
    public final boolean a(F3.a aVar) {
        F3.c cVar = F3.c.f634y;
        F3.c cVar2 = aVar.f621b;
        if (cVar2 != cVar && cVar2 != F3.c.f635z && cVar2 != F3.c.f630A) {
            return false;
        }
        this.f414a.c(aVar.f620a);
        return true;
    }

    @Override // E3.i
    public final boolean b(Exception exc) {
        return false;
    }
}
