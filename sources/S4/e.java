package S4;

/* JADX INFO: loaded from: classes.dex */
public final class e extends h {

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final e f3321z = new e(k.f3329c, k.f3330d, k.f3331e, k.f3327a);

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        throw new UnsupportedOperationException("Dispatchers.Default cannot be closed");
    }

    @Override // M4.AbstractC0077w
    public final String toString() {
        return "Dispatchers.Default";
    }
}
