package S4;

import I0.o;
import R4.w;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public abstract class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f3327a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final long f3328b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f3329c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f3330d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final long f3331e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final g f3332f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final o f3333g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final o f3334h;

    static {
        String property;
        int i6 = w.f3043a;
        try {
            property = System.getProperty("kotlinx.coroutines.scheduler.default.name");
        } catch (SecurityException unused) {
            property = null;
        }
        if (property == null) {
            property = "DefaultDispatcher";
        }
        f3327a = property;
        f3328b = S3.a.L("kotlinx.coroutines.scheduler.resolution.ns", 100000L, 1L, Long.MAX_VALUE);
        int i7 = w.f3043a;
        if (i7 < 2) {
            i7 = 2;
        }
        f3329c = S3.a.M("kotlinx.coroutines.scheduler.core.pool.size", i7, 1, 0, 8);
        f3330d = S3.a.M("kotlinx.coroutines.scheduler.max.pool.size", 2097150, 0, 2097150, 4);
        f3331e = TimeUnit.SECONDS.toNanos(S3.a.L("kotlinx.coroutines.scheduler.keep.alive.sec", 60L, 1L, Long.MAX_VALUE));
        f3332f = g.f3322b;
        f3333g = new o(0);
        f3334h = new o(1);
    }
}
