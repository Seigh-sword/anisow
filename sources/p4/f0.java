package P4;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class f0 {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final f0 f2685w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final f0 f2686x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final f0 f2687y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final /* synthetic */ f0[] f2688z;

    static {
        f0 f0Var = new f0("START", 0);
        f2685w = f0Var;
        f0 f0Var2 = new f0("STOP", 1);
        f2686x = f0Var2;
        f0 f0Var3 = new f0("STOP_AND_RESET_REPLAY_CACHE", 2);
        f2687y = f0Var3;
        f2688z = new f0[]{f0Var, f0Var2, f0Var3};
    }

    public static f0 valueOf(String str) {
        return (f0) Enum.valueOf(f0.class, str);
    }

    public static f0[] values() {
        return (f0[]) f2688z.clone();
    }
}
