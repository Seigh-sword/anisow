package M4;

/* JADX INFO: loaded from: classes.dex */
public final class X implements Y {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final C4.l f1869w;

    public X(C4.l lVar) {
        this.f1869w = lVar;
    }

    @Override // M4.Y
    public final void d(Throwable th) {
        this.f1869w.j(th);
    }

    public final String toString() {
        return "InternalCompletionHandler.UserSupplied[" + this.f1869w.getClass().getSimpleName() + '@' + B.d(this) + ']';
    }
}
