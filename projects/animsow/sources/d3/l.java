package d3;

import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public final class l implements A3.c, A3.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HashMap f8207a = new HashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ArrayDeque f8208b = new ArrayDeque();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Executor f8209c;

    public l(Executor executor) {
        this.f8209c = executor;
    }

    public final synchronized void a(Executor executor, A3.a aVar) {
        try {
            executor.getClass();
            if (!this.f8207a.containsKey(Y2.b.class)) {
                this.f8207a.put(Y2.b.class, new ConcurrentHashMap());
            }
            ((ConcurrentHashMap) this.f8207a.get(Y2.b.class)).put(aVar, executor);
        } catch (Throwable th) {
            throw th;
        }
    }
}
