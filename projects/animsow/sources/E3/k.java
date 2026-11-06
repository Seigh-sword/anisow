package e3;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class k implements Executor {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final k f8291w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final Handler f8292x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final /* synthetic */ k[] f8293y;

    static {
        k kVar = new k("INSTANCE", 0);
        f8291w = kVar;
        f8293y = new k[]{kVar};
        f8292x = new Handler(Looper.getMainLooper());
    }

    public static k valueOf(String str) {
        return (k) Enum.valueOf(k.class, str);
    }

    public static k[] values() {
        return (k[]) f8293y.clone();
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        f8292x.post(runnable);
    }
}
