package T0;

/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f3375c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final a f3376d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f3377a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Throwable f3378b;

    static {
        if (g.f3398z) {
            f3376d = null;
            f3375c = null;
        } else {
            f3376d = new a(null, false);
            f3375c = new a(null, true);
        }
    }

    public a(Throwable th, boolean z5) {
        this.f3377a = z5;
        this.f3378b = th;
    }
}
