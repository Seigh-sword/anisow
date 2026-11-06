package W1;

import c2.ThreadFactoryC0374a;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public abstract class B {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ExecutorService f4225a;

    static {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(2, 2, 60L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new ThreadFactoryC0374a());
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        f4225a = Executors.unconfigurableExecutorService(threadPoolExecutor);
    }
}
