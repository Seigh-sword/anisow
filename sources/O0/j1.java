package o0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class j1 {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final j1 f11971w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final /* synthetic */ j1[] f11972x;

    static {
        j1 j1Var = new j1("LAUNCH_INITIAL_REFRESH", 0);
        f11971w = j1Var;
        f11972x = new j1[]{j1Var, new j1("SKIP_INITIAL_REFRESH", 1)};
    }

    public static j1 valueOf(String str) {
        return (j1) Enum.valueOf(j1.class, str);
    }

    public static j1[] values() {
        return (j1[]) f11972x.clone();
    }
}
