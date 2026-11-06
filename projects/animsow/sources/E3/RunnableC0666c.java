package e3;

/* JADX INFO: renamed from: e3.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC0666c implements Runnable {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ int f8268w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ ScheduledExecutorServiceC0669f f8269x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ Runnable f8270y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final /* synthetic */ K1.b f8271z;

    public /* synthetic */ RunnableC0666c(ScheduledExecutorServiceC0669f scheduledExecutorServiceC0669f, Runnable runnable, K1.b bVar, int i6) {
        this.f8268w = i6;
        this.f8269x = scheduledExecutorServiceC0669f;
        this.f8270y = runnable;
        this.f8271z = bVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i6 = this.f8268w;
        final K1.b bVar = this.f8271z;
        final Runnable runnable = this.f8270y;
        ScheduledExecutorServiceC0669f scheduledExecutorServiceC0669f = this.f8269x;
        scheduledExecutorServiceC0669f.getClass();
        switch (i6) {
            case com.bumptech.glide.d.f6312l /* 0 */:
                final int i7 = 1;
                scheduledExecutorServiceC0669f.f8278w.execute(new Runnable() { // from class: e3.e
                    @Override // java.lang.Runnable
                    public final void run() throws Exception {
                        int i8 = i7;
                        K1.b bVar2 = bVar;
                        Runnable runnable2 = runnable;
                        switch (i8) {
                            case com.bumptech.glide.d.f6312l /* 0 */:
                                try {
                                    runnable2.run();
                                    ScheduledFutureC0671h scheduledFutureC0671h = (ScheduledFutureC0671h) bVar2.f1515x;
                                    int i9 = ScheduledFutureC0671h.f8280E;
                                    scheduledFutureC0671h.i(null);
                                    return;
                                } catch (Exception e6) {
                                    ScheduledFutureC0671h scheduledFutureC0671h2 = (ScheduledFutureC0671h) bVar2.f1515x;
                                    int i10 = ScheduledFutureC0671h.f8280E;
                                    scheduledFutureC0671h2.j(e6);
                                    return;
                                }
                            case 1:
                                try {
                                    runnable2.run();
                                    return;
                                } catch (Exception e7) {
                                    ScheduledFutureC0671h scheduledFutureC0671h3 = (ScheduledFutureC0671h) bVar2.f1515x;
                                    int i11 = ScheduledFutureC0671h.f8280E;
                                    scheduledFutureC0671h3.j(e7);
                                    throw e7;
                                }
                            default:
                                try {
                                    runnable2.run();
                                    return;
                                } catch (Exception e8) {
                                    ScheduledFutureC0671h scheduledFutureC0671h4 = (ScheduledFutureC0671h) bVar2.f1515x;
                                    int i12 = ScheduledFutureC0671h.f8280E;
                                    scheduledFutureC0671h4.j(e8);
                                    return;
                                }
                        }
                    }
                });
                break;
            case 1:
                final int i8 = 0;
                scheduledExecutorServiceC0669f.f8278w.execute(new Runnable() { // from class: e3.e
                    @Override // java.lang.Runnable
                    public final void run() throws Exception {
                        int i82 = i8;
                        K1.b bVar2 = bVar;
                        Runnable runnable2 = runnable;
                        switch (i82) {
                            case com.bumptech.glide.d.f6312l /* 0 */:
                                try {
                                    runnable2.run();
                                    ScheduledFutureC0671h scheduledFutureC0671h = (ScheduledFutureC0671h) bVar2.f1515x;
                                    int i9 = ScheduledFutureC0671h.f8280E;
                                    scheduledFutureC0671h.i(null);
                                    return;
                                } catch (Exception e6) {
                                    ScheduledFutureC0671h scheduledFutureC0671h2 = (ScheduledFutureC0671h) bVar2.f1515x;
                                    int i10 = ScheduledFutureC0671h.f8280E;
                                    scheduledFutureC0671h2.j(e6);
                                    return;
                                }
                            case 1:
                                try {
                                    runnable2.run();
                                    return;
                                } catch (Exception e7) {
                                    ScheduledFutureC0671h scheduledFutureC0671h3 = (ScheduledFutureC0671h) bVar2.f1515x;
                                    int i11 = ScheduledFutureC0671h.f8280E;
                                    scheduledFutureC0671h3.j(e7);
                                    throw e7;
                                }
                            default:
                                try {
                                    runnable2.run();
                                    return;
                                } catch (Exception e8) {
                                    ScheduledFutureC0671h scheduledFutureC0671h4 = (ScheduledFutureC0671h) bVar2.f1515x;
                                    int i12 = ScheduledFutureC0671h.f8280E;
                                    scheduledFutureC0671h4.j(e8);
                                    return;
                                }
                        }
                    }
                });
                break;
            default:
                final int i9 = 2;
                scheduledExecutorServiceC0669f.f8278w.execute(new Runnable() { // from class: e3.e
                    @Override // java.lang.Runnable
                    public final void run() throws Exception {
                        int i82 = i9;
                        K1.b bVar2 = bVar;
                        Runnable runnable2 = runnable;
                        switch (i82) {
                            case com.bumptech.glide.d.f6312l /* 0 */:
                                try {
                                    runnable2.run();
                                    ScheduledFutureC0671h scheduledFutureC0671h = (ScheduledFutureC0671h) bVar2.f1515x;
                                    int i92 = ScheduledFutureC0671h.f8280E;
                                    scheduledFutureC0671h.i(null);
                                    return;
                                } catch (Exception e6) {
                                    ScheduledFutureC0671h scheduledFutureC0671h2 = (ScheduledFutureC0671h) bVar2.f1515x;
                                    int i10 = ScheduledFutureC0671h.f8280E;
                                    scheduledFutureC0671h2.j(e6);
                                    return;
                                }
                            case 1:
                                try {
                                    runnable2.run();
                                    return;
                                } catch (Exception e7) {
                                    ScheduledFutureC0671h scheduledFutureC0671h3 = (ScheduledFutureC0671h) bVar2.f1515x;
                                    int i11 = ScheduledFutureC0671h.f8280E;
                                    scheduledFutureC0671h3.j(e7);
                                    throw e7;
                                }
                            default:
                                try {
                                    runnable2.run();
                                    return;
                                } catch (Exception e8) {
                                    ScheduledFutureC0671h scheduledFutureC0671h4 = (ScheduledFutureC0671h) bVar2.f1515x;
                                    int i12 = ScheduledFutureC0671h.f8280E;
                                    scheduledFutureC0671h4.j(e8);
                                    return;
                                }
                        }
                    }
                });
                break;
        }
    }
}
