package j3;

import J3.G;
import android.os.Looper;
import java.util.concurrent.CancellationException;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicLong;
import n.ThreadFactoryC1140c;

/* JADX INFO: renamed from: j3.C, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0850C {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ExecutorService f9452a;

    static {
        ExecutorService executorServiceUnconfigurableExecutorService = Executors.unconfigurableExecutorService(new ThreadPoolExecutor(1, 1, 0L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue(), new ThreadFactoryC1140c(new AtomicLong(1L)), new ThreadPoolExecutor.DiscardPolicy()));
        Runtime.getRuntime().addShutdownHook(new Thread(new C0873w(executorServiceUnconfigurableExecutorService, TimeUnit.SECONDS), "Crashlytics Shutdown Hook for awaitEvenIfOnMainThread task continuation executor"));
        f9452a = executorServiceUnconfigurableExecutorService;
    }

    public static void a(q2.s sVar) throws InterruptedException, TimeoutException {
        CountDownLatch countDownLatch = new CountDownLatch(1);
        sVar.i(f9452a, new G(21, countDownLatch));
        countDownLatch.await(Looper.getMainLooper() == Looper.myLooper() ? 3000L : 4000L, TimeUnit.MILLISECONDS);
        if (sVar.f()) {
            sVar.d();
        } else {
            if (sVar.f12377d) {
                throw new CancellationException("Task is already canceled");
            }
            if (!sVar.e()) {
                throw new TimeoutException();
            }
            throw new IllegalStateException(sVar.c());
        }
    }
}
