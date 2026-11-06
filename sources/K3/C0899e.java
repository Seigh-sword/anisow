package k3;

import d.C0617E;
import f2.h;
import java.util.concurrent.ExecutorService;
import s4.AbstractC1305a;

/* JADX INFO: renamed from: k3.e, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0899e {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final C0898d f9654d = new C0898d();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ExecutorC0896b f9655a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ExecutorC0896b f9656b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ExecutorC0896b f9657c;

    public C0899e(ExecutorService executorService, ExecutorService executorService2) {
        AbstractC1305a.o(executorService, "backgroundExecutorService");
        AbstractC1305a.o(executorService2, "blockingExecutorService");
        this.f9655a = new ExecutorC0896b(executorService);
        this.f9656b = new ExecutorC0896b(executorService);
        h.l(null);
        this.f9657c = new ExecutorC0896b(executorService2);
    }

    public static final void a() {
        C0898d.a(new C0617E(5, f9654d), C0897c.f9651y);
    }
}
