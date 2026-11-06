package W3;

/* JADX INFO: loaded from: classes.dex */
public abstract class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final boolean f4478a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final T3.a f4479b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final T3.a f4480c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final T3.a f4481d;

    static {
        boolean z5;
        T3.a aVar;
        try {
            Class.forName("java.sql.Date");
            z5 = true;
        } catch (ClassNotFoundException unused) {
            z5 = false;
        }
        f4478a = z5;
        if (z5) {
            f4479b = a.f4472b;
            f4480c = b.f4474b;
            aVar = c.f4476b;
        } else {
            aVar = null;
            f4479b = null;
            f4480c = null;
        }
        f4481d = aVar;
    }
}
