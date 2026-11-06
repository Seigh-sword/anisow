package H1;

import android.os.Process;
import t0.AbstractC1332d;

/* JADX INFO: loaded from: classes.dex */
public final class q implements Runnable {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ int f948w = 0;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final Runnable f949x;

    public q(Runnable runnable) {
        this.f949x = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i6 = this.f948w;
        Runnable runnable = this.f949x;
        switch (i6) {
            case com.bumptech.glide.d.f6312l /* 0 */:
                try {
                    runnable.run();
                } catch (Exception e6) {
                    AbstractC1332d.B("Executor", "Background execution failure.", e6);
                    return;
                }
                break;
            default:
                Process.setThreadPriority(0);
                runnable.run();
                break;
        }
    }

    public q(Runnable runnable, int i6) {
        this.f949x = runnable;
    }
}
