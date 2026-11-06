package v0;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;

/* JADX INFO: renamed from: v0.g, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class ExecutorC1398g implements Executor {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final Handler f13124w = new Handler(Looper.getMainLooper());

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        this.f13124w.post(runnable);
    }
}
