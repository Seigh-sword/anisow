package m2;

import android.os.Process;
import d.AbstractC0628i;
import java.util.concurrent.BlockingQueue;
import t0.AbstractC1332d;

/* JADX INFO: renamed from: m2.l0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1054l0 extends Thread {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final Object f11021w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final BlockingQueue f11022x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public boolean f11023y = false;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final /* synthetic */ C1042h0 f11024z;

    public C1054l0(C1042h0 c1042h0, String str, BlockingQueue blockingQueue) {
        this.f11024z = c1042h0;
        AbstractC1332d.m(blockingQueue);
        this.f11021w = new Object();
        this.f11022x = blockingQueue;
        setName(str);
    }

    public final void a(InterruptedException interruptedException) {
        N nF = this.f11024z.f();
        nF.f10718E.c(interruptedException, AbstractC0628i.i(getName(), " was interrupted"));
    }

    public final void b() {
        synchronized (this.f11024z.f10933E) {
            try {
                if (!this.f11023y) {
                    this.f11024z.f10934F.release();
                    this.f11024z.f10933E.notifyAll();
                    C1042h0 c1042h0 = this.f11024z;
                    if (this == c1042h0.f10935y) {
                        c1042h0.f10935y = null;
                    } else if (this == c1042h0.f10936z) {
                        c1042h0.f10936z = null;
                    } else {
                        c1042h0.f().f10715B.d("Current scheduler thread is neither worker nor network");
                    }
                    this.f11023y = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        boolean z5 = false;
        while (!z5) {
            try {
                this.f11024z.f10934F.acquire();
                z5 = true;
            } catch (InterruptedException e6) {
                a(e6);
            }
        }
        try {
            int threadPriority = Process.getThreadPriority(Process.myTid());
            while (true) {
                C1045i0 c1045i0 = (C1045i0) this.f11022x.poll();
                if (c1045i0 != null) {
                    Process.setThreadPriority(c1045i0.f10952x ? threadPriority : 10);
                    c1045i0.run();
                } else {
                    synchronized (this.f11021w) {
                        if (this.f11022x.peek() == null) {
                            this.f11024z.getClass();
                            try {
                                this.f11021w.wait(30000L);
                            } catch (InterruptedException e7) {
                                a(e7);
                            }
                        }
                    }
                    synchronized (this.f11024z.f10933E) {
                        if (this.f11022x.peek() == null) {
                            b();
                            b();
                            return;
                        }
                    }
                }
            }
        } catch (Throwable th) {
            b();
            throw th;
        }
    }
}
