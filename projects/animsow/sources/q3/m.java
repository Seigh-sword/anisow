package Q3;

/* JADX INFO: loaded from: classes.dex */
public final class m extends T3.r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public A f2810a;

    @Override // Q3.A
    public final Object b(X3.a aVar) {
        A a6 = this.f2810a;
        if (a6 != null) {
            return a6.b(aVar);
        }
        throw new IllegalStateException("Adapter for type with cyclic dependency has been used before dependency has been resolved");
    }

    @Override // Q3.A
    public final void c(X3.b bVar, Object obj) {
        A a6 = this.f2810a;
        if (a6 == null) {
            throw new IllegalStateException("Adapter for type with cyclic dependency has been used before dependency has been resolved");
        }
        a6.c(bVar, obj);
    }
}
