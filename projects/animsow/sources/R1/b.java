package R1;

import java.lang.ref.WeakReference;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public final class b extends Thread {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final WeakReference f2938w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final long f2939x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final CountDownLatch f2940y = new CountDownLatch(1);

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public boolean f2941z = false;

    public b(a aVar, long j6) {
        this.f2938w = new WeakReference(aVar);
        this.f2939x = j6;
        start();
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        a aVar;
        WeakReference weakReference = this.f2938w;
        try {
            if (this.f2940y.await(this.f2939x, TimeUnit.MILLISECONDS) || (aVar = (a) weakReference.get()) == null) {
                return;
            }
            aVar.b();
            this.f2941z = true;
        } catch (InterruptedException unused) {
            a aVar2 = (a) weakReference.get();
            if (aVar2 != null) {
                aVar2.b();
                this.f2941z = true;
            }
        }
    }
}
