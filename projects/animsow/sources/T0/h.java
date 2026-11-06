package T0;

import java.util.concurrent.Executor;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class h implements Executor {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final h f3402w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final /* synthetic */ h[] f3403x;

    static {
        h hVar = new h("INSTANCE", 0);
        f3402w = hVar;
        f3403x = new h[]{hVar};
    }

    public static h valueOf(String str) {
        return (h) Enum.valueOf(h.class, str);
    }

    public static h[] values() {
        return (h[]) f3403x.clone();
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        runnable.run();
    }

    @Override // java.lang.Enum
    public final String toString() {
        return "DirectExecutor";
    }
}
