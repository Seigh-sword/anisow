package t;

/* JADX INFO: renamed from: t.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1318a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final C1318a f12643c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final C1318a f12644d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f12645a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Throwable f12646b;

    static {
        if (AbstractC1324g.f12664z) {
            f12644d = null;
            f12643c = null;
        } else {
            f12644d = new C1318a(null, false);
            f12643c = new C1318a(null, true);
        }
    }

    public C1318a(Throwable th, boolean z5) {
        this.f12645a = z5;
        this.f12646b = th;
    }
}
