package e3;

import d.AbstractC0628i;

/* JADX INFO: renamed from: e3.i, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC0672i implements Runnable {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ int f8282w = 1;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public Runnable f8283x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ ExecutorC0673j f8284y;

    public RunnableC0672i(ExecutorC0673j executorC0673j) {
        this.f8284y = executorC0673j;
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0044, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x004a, code lost:
    
        r1 = r1 | java.lang.Thread.interrupted();
        r2 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x004c, code lost:
    
        r10.f8283x.run();
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0056, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0058, code lost:
    
        r3 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0059, code lost:
    
        e3.ExecutorC0673j.f8285B.log(java.util.logging.Level.SEVERE, "Exception while executing runnable " + r10.f8283x, (java.lang.Throwable) r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0074, code lost:
    
        r10.f8283x = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0076, code lost:
    
        throw r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:?, code lost:
    
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void a() {
        /*
            r10 = this;
            r0 = 0
            r1 = r0
        L2:
            e3.j r2 = r10.f8284y     // Catch: java.lang.Throwable -> L54
            java.util.ArrayDeque r2 = r2.f8288x     // Catch: java.lang.Throwable -> L54
            monitor-enter(r2)     // Catch: java.lang.Throwable -> L54
            r3 = 1
            if (r0 != 0) goto L28
            e3.j r0 = r10.f8284y     // Catch: java.lang.Throwable -> L1c
            int r4 = r0.f8289y     // Catch: java.lang.Throwable -> L1c
            r5 = 4
            if (r4 != r5) goto L1e
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L1c
            if (r1 == 0) goto L1b
            java.lang.Thread r0 = java.lang.Thread.currentThread()
            r0.interrupt()
        L1b:
            return
        L1c:
            r0 = move-exception
            goto L77
        L1e:
            long r6 = r0.f8290z     // Catch: java.lang.Throwable -> L1c
            r8 = 1
            long r6 = r6 + r8
            r0.f8290z = r6     // Catch: java.lang.Throwable -> L1c
            r0.f8289y = r5     // Catch: java.lang.Throwable -> L1c
            r0 = r3
        L28:
            e3.j r4 = r10.f8284y     // Catch: java.lang.Throwable -> L1c
            java.util.ArrayDeque r4 = r4.f8288x     // Catch: java.lang.Throwable -> L1c
            java.lang.Object r4 = r4.poll()     // Catch: java.lang.Throwable -> L1c
            java.lang.Runnable r4 = (java.lang.Runnable) r4     // Catch: java.lang.Throwable -> L1c
            r10.f8283x = r4     // Catch: java.lang.Throwable -> L1c
            if (r4 != 0) goto L45
            e3.j r0 = r10.f8284y     // Catch: java.lang.Throwable -> L1c
            r0.f8289y = r3     // Catch: java.lang.Throwable -> L1c
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L1c
            if (r1 == 0) goto L44
            java.lang.Thread r0 = java.lang.Thread.currentThread()
            r0.interrupt()
        L44:
            return
        L45:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L1c
            boolean r2 = java.lang.Thread.interrupted()     // Catch: java.lang.Throwable -> L54
            r1 = r1 | r2
            r2 = 0
            java.lang.Runnable r3 = r10.f8283x     // Catch: java.lang.Throwable -> L56 java.lang.RuntimeException -> L58
            r3.run()     // Catch: java.lang.Throwable -> L56 java.lang.RuntimeException -> L58
        L51:
            r10.f8283x = r2     // Catch: java.lang.Throwable -> L54
            goto L2
        L54:
            r0 = move-exception
            goto L79
        L56:
            r0 = move-exception
            goto L74
        L58:
            r3 = move-exception
            java.util.logging.Logger r4 = e3.ExecutorC0673j.f8285B     // Catch: java.lang.Throwable -> L56
            java.util.logging.Level r5 = java.util.logging.Level.SEVERE     // Catch: java.lang.Throwable -> L56
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L56
            r6.<init>()     // Catch: java.lang.Throwable -> L56
            java.lang.String r7 = "Exception while executing runnable "
            r6.append(r7)     // Catch: java.lang.Throwable -> L56
            java.lang.Runnable r7 = r10.f8283x     // Catch: java.lang.Throwable -> L56
            r6.append(r7)     // Catch: java.lang.Throwable -> L56
            java.lang.String r6 = r6.toString()     // Catch: java.lang.Throwable -> L56
            r4.log(r5, r6, r3)     // Catch: java.lang.Throwable -> L56
            goto L51
        L74:
            r10.f8283x = r2     // Catch: java.lang.Throwable -> L54
            throw r0     // Catch: java.lang.Throwable -> L54
        L77:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L1c
            throw r0     // Catch: java.lang.Throwable -> L54
        L79:
            if (r1 == 0) goto L82
            java.lang.Thread r1 = java.lang.Thread.currentThread()
            r1.interrupt()
        L82:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: e3.RunnableC0672i.a():void");
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f8282w) {
            case com.bumptech.glide.d.f6312l /* 0 */:
                this.f8283x.run();
                return;
            default:
                try {
                    a();
                    return;
                } catch (Error e6) {
                    synchronized (this.f8284y.f8288x) {
                        this.f8284y.f8289y = 1;
                        throw e6;
                    }
                }
        }
    }

    public final String toString() {
        switch (this.f8282w) {
            case com.bumptech.glide.d.f6312l /* 0 */:
                return this.f8283x.toString();
            default:
                Runnable runnable = this.f8283x;
                if (runnable != null) {
                    return "SequentialExecutorWorker{running=" + runnable + "}";
                }
                return "SequentialExecutorWorker{state=" + AbstractC0628i.s(this.f8284y.f8289y) + "}";
        }
    }

    public /* synthetic */ RunnableC0672i(ExecutorC0673j executorC0673j, int i6) {
        this(executorC0673j);
    }

    public RunnableC0672i(ExecutorC0673j executorC0673j, Runnable runnable) {
        this.f8284y = executorC0673j;
        this.f8283x = runnable;
    }
}
