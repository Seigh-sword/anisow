package q2;

import android.os.Looper;
import com.google.android.gms.internal.measurement.X;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public final class r implements Executor {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final X f12373w = new X(Looper.getMainLooper(), 3);

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        this.f12373w.post(runnable);
    }
}
