package M1;

import F0.C0022i;
import d.RunnableC0637r;
import e3.InterfaceC0670g;
import e3.RunnableC0666c;
import e3.ScheduledExecutorServiceC0669f;
import g3.C0730b;
import g3.InterfaceC0729a;
import java.util.concurrent.Callable;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import m3.C1112m0;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class h implements O1.b, InterfaceC0670g, D3.a {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public final /* synthetic */ Object f1778A;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ int f1779w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ long f1780x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ Object f1781y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final /* synthetic */ Object f1782z;

    public /* synthetic */ h(j jVar, Iterable iterable, H1.j jVar2, long j6) {
        this.f1779w = 0;
        this.f1781y = jVar;
        this.f1782z = iterable;
        this.f1778A = jVar2;
        this.f1780x = j6;
    }

    @Override // e3.InterfaceC0670g
    public final ScheduledFuture a(final K1.b bVar) {
        int i6 = this.f1779w;
        long j6 = this.f1780x;
        Object obj = this.f1778A;
        Object obj2 = this.f1782z;
        final ScheduledExecutorServiceC0669f scheduledExecutorServiceC0669f = (ScheduledExecutorServiceC0669f) this.f1781y;
        switch (i6) {
            case 1:
                scheduledExecutorServiceC0669f.getClass();
                RunnableC0666c runnableC0666c = new RunnableC0666c(scheduledExecutorServiceC0669f, (Runnable) obj2, bVar, 1);
                return scheduledExecutorServiceC0669f.f8279x.schedule(runnableC0666c, j6, (TimeUnit) obj);
            default:
                final Callable callable = (Callable) obj2;
                scheduledExecutorServiceC0669f.getClass();
                Callable callable2 = new Callable() { // from class: e3.d
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        ScheduledExecutorServiceC0669f scheduledExecutorServiceC0669f2 = scheduledExecutorServiceC0669f;
                        scheduledExecutorServiceC0669f2.getClass();
                        return scheduledExecutorServiceC0669f2.f8278w.submit(new RunnableC0637r(callable, 13, bVar));
                    }
                };
                return scheduledExecutorServiceC0669f.f8279x.schedule(callable2, j6, (TimeUnit) obj);
        }
    }

    @Override // O1.b
    public final Object d() {
        j jVar = (j) this.f1781y;
        Iterable iterable = (Iterable) this.f1782z;
        H1.j jVar2 = (H1.j) this.f1778A;
        N1.l lVar = (N1.l) jVar.f1788c;
        lVar.getClass();
        if (iterable.iterator().hasNext()) {
            lVar.g(new C0022i(lVar, "UPDATE events SET num_attempts = num_attempts + 1 WHERE _id in " + N1.l.l(iterable), "SELECT COUNT(*), transport_name FROM events WHERE num_attempts >= 16 GROUP BY transport_name", 2));
        }
        lVar.g(new N1.f(((P1.c) jVar.f1792g).a() + this.f1780x, jVar2));
        return null;
    }

    @Override // D3.a
    public final void e(D3.c cVar) {
        ((C0730b) ((InterfaceC0729a) cVar.get())).d((String) this.f1781y, (String) this.f1782z, this.f1780x, (C1112m0) this.f1778A);
    }

    public /* synthetic */ h(Object obj, Object obj2, long j6, Object obj3, int i6) {
        this.f1779w = i6;
        this.f1781y = obj;
        this.f1782z = obj2;
        this.f1780x = j6;
        this.f1778A = obj3;
    }
}
