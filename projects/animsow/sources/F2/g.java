package f2;

import android.os.Process;
import f5.C0707d;
import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: loaded from: classes.dex */
public final class g extends Thread {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ int f8416w = 1;

    public g() {
        super("Okio Watchdog");
        setDaemon(true);
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        ReentrantLock reentrantLock;
        C0707d c0707dK;
        switch (this.f8416w) {
            case com.bumptech.glide.d.f6312l /* 0 */:
                Process.setThreadPriority(19);
                synchronized (this) {
                    while (true) {
                        try {
                            wait();
                        } catch (InterruptedException unused) {
                            return;
                        }
                    }
                }
                break;
        }
        while (true) {
            try {
                reentrantLock = C0707d.f8448h;
                reentrantLock.lock();
                try {
                    c0707dK = B3.e.k();
                } finally {
                    reentrantLock.unlock();
                }
            } catch (InterruptedException unused2) {
            }
            if (c0707dK == C0707d.f8452l) {
                C0707d.f8452l = null;
                return;
            } else {
                reentrantLock.unlock();
                if (c0707dK != null) {
                    c0707dK.k();
                }
            }
        }
    }

    public g(ThreadGroup threadGroup) {
        super(threadGroup, "GmsDynamite");
    }
}
