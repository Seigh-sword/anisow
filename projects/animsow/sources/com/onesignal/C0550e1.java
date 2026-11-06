package com.onesignal;

import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: renamed from: com.onesignal.e1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C0550e1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ConcurrentLinkedQueue f7798a = new ConcurrentLinkedQueue();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AtomicLong f7799b = new AtomicLong();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ExecutorService f7800c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final C0594t1 f7801d;

    public C0550e1(C0594t1 c0594t1) {
        this.f7801d = c0594t1;
    }

    public final void a(Runnable runnable) {
        m2.J0 j02 = new m2.J0(this, runnable);
        j02.f10667x = this.f7799b.incrementAndGet();
        ExecutorService executorService = this.f7800c;
        C0594t1 c0594t1 = this.f7801d;
        if (executorService == null) {
            String str = "Adding a task to the pending queue with ID: " + j02.f10667x;
            c0594t1.getClass();
            C0594t1.d(str);
            this.f7798a.add(j02);
            return;
        }
        if (executorService.isShutdown()) {
            return;
        }
        String str2 = "Executor is still running, add to the executor with ID: " + j02.f10667x;
        c0594t1.getClass();
        C0594t1.d(str2);
        try {
            this.f7800c.submit(j02);
        } catch (RejectedExecutionException e6) {
            AbstractC0603w1.b(EnumC0600v1.f7991A, "Executor is shutdown, running task manually with ID: " + j02.f10667x, null);
            j02.run();
            e6.printStackTrace();
        }
    }

    public final boolean b() {
        if (Thread.currentThread().getName().contains("OS_PENDING_EXECUTOR_")) {
            return false;
        }
        boolean z5 = AbstractC0603w1.f8048n;
        if (z5 && this.f7800c == null) {
            return false;
        }
        if (z5 || this.f7800c != null) {
            return !this.f7800c.isShutdown();
        }
        return true;
    }

    public final void c() {
        EnumC0600v1 enumC0600v1 = EnumC0600v1.f7992B;
        StringBuilder sb = new StringBuilder("startPendingTasks with task queue quantity: ");
        ConcurrentLinkedQueue concurrentLinkedQueue = this.f7798a;
        sb.append(concurrentLinkedQueue.size());
        AbstractC0603w1.b(enumC0600v1, sb.toString(), null);
        if (concurrentLinkedQueue.isEmpty()) {
            return;
        }
        this.f7800c = Executors.newSingleThreadExecutor(new ThreadFactoryC0547d1());
        while (!concurrentLinkedQueue.isEmpty()) {
            this.f7800c.submit((Runnable) concurrentLinkedQueue.poll());
        }
    }
}
