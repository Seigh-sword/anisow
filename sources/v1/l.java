package V1;

/* JADX INFO: loaded from: classes.dex */
public final class l extends UnsupportedOperationException {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final U1.d f3731w;

    public l(U1.d dVar) {
        this.f3731w = dVar;
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        return "Missing ".concat(String.valueOf(this.f3731w));
    }
}
