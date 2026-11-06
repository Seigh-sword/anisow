package K;

import android.os.Process;

/* JADX INFO: loaded from: classes.dex */
public final class i extends Thread {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final int f1492w;

    public i(Runnable runnable, String str, int i6) {
        super(runnable, str);
        this.f1492w = i6;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        Process.setThreadPriority(this.f1492w);
        super.run();
    }
}
