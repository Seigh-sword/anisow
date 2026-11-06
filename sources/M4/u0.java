package M4;

/* JADX INFO: loaded from: classes.dex */
public abstract class u0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ThreadLocal f1925a = new ThreadLocal();

    public static Q a() {
        ThreadLocal threadLocal = f1925a;
        Q q5 = (Q) threadLocal.get();
        if (q5 != null) {
            return q5;
        }
        C0059d c0059d = new C0059d(Thread.currentThread());
        threadLocal.set(c0059d);
        return c0059d;
    }
}
