package I0;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ExecutorService f1077a = Executors.newFixedThreadPool(Math.max(2, Math.min(Runtime.getRuntime().availableProcessors() - 1, 4)), new a(false));

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ExecutorService f1078b = Executors.newFixedThreadPool(Math.max(2, Math.min(Runtime.getRuntime().availableProcessors() - 1, 4)), new a(true));

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final x f1079c = new x();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final B3.e f1080d = new B3.e();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final L3.c f1081e = new L3.c(21, 0);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f1082f = 4;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f1083g = Integer.MAX_VALUE;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f1084h = 20;

    public b(B3.e eVar) {
    }
}
