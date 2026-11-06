package D1;

/* JADX INFO: loaded from: classes.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public volatile boolean f290a;

    public final void a() {
        if (this.f290a) {
            throw new IllegalStateException("Already released");
        }
    }
}
