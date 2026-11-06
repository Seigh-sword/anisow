package h3;

import android.os.Bundle;
import android.util.Log;
import g3.C0731c;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public final class c implements b, InterfaceC0773a {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final K1.b f8981w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final TimeUnit f8982x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final Object f8983y = new Object();

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public CountDownLatch f8984z;

    public c(K1.b bVar, TimeUnit timeUnit) {
        this.f8981w = bVar;
        this.f8982x = timeUnit;
    }

    @Override // h3.InterfaceC0773a
    public final void f(Bundle bundle) {
        synchronized (this.f8983y) {
            try {
                C0731c c0731c = C0731c.f8531a;
                c0731c.g("Logging event _ae to Firebase Analytics with params " + bundle);
                this.f8984z = new CountDownLatch(1);
                this.f8981w.f(bundle);
                c0731c.g("Awaiting app exception callback from Analytics...");
                try {
                    if (this.f8984z.await(500, this.f8982x)) {
                        c0731c.g("App exception callback received from Analytics listener.");
                    } else {
                        c0731c.h("Timeout exceeded while awaiting app exception callback from Analytics listener.", null);
                    }
                } catch (InterruptedException unused) {
                    Log.e("FirebaseCrashlytics", "Interrupted while awaiting app exception callback from Analytics listener.", null);
                }
                this.f8984z = null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // h3.b
    public final void n(String str, Bundle bundle) {
        CountDownLatch countDownLatch = this.f8984z;
        if (countDownLatch != null && "_ae".equals(str)) {
            countDownLatch.countDown();
        }
    }
}
