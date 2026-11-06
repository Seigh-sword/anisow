package S0;

import N.RunnableC0098i0;
import android.content.Context;
import androidx.work.ListenableWorker;
import java.util.UUID;

/* JADX INFO: loaded from: classes.dex */
public final class l implements Runnable {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ int f3086w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ T0.i f3087x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ m f3088y;

    public /* synthetic */ l(m mVar, T0.i iVar, int i6) {
        this.f3086w = i6;
        this.f3088y = mVar;
        this.f3087x = iVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i6 = this.f3086w;
        T0.i iVar = this.f3087x;
        m mVar = this.f3088y;
        switch (i6) {
            case com.bumptech.glide.d.f6312l /* 0 */:
                mVar.f3095z.getClass();
                T0.i iVar2 = new T0.i();
                iVar2.k(new IllegalStateException("Expedited WorkRequests require a ListenableWorker to provide an implementation for `getForegroundInfoAsync()`"));
                iVar.l(iVar2);
                return;
            default:
                try {
                    I0.h hVar = (I0.h) iVar.get();
                    if (hVar == null) {
                        throw new IllegalStateException("Worker was marked important (" + mVar.f3094y.f2902c + ") but did not provide ForegroundInfo");
                    }
                    I0.o.w().u(m.f3089C, "Updating notification for " + mVar.f3094y.f2902c, new Throwable[0]);
                    ListenableWorker listenableWorker = mVar.f3095z;
                    listenableWorker.f5823A = true;
                    T0.i iVar3 = mVar.f3092w;
                    I0.i iVar4 = mVar.f3090A;
                    Context context = mVar.f3093x;
                    UUID uuid = listenableWorker.f5825x.f5830a;
                    n nVar = (n) iVar4;
                    nVar.getClass();
                    T0.i iVar5 = new T0.i();
                    nVar.f3096a.p(new RunnableC0098i0(nVar, iVar5, uuid, hVar, context, 1));
                    iVar3.l(iVar5);
                    return;
                } catch (Throwable th) {
                    mVar.f3092w.k(th);
                    return;
                }
        }
    }
}
