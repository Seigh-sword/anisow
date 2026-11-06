package G1;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class z {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final z f860w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final /* synthetic */ z[] f861x;

    /* JADX INFO: Fake field, exist only in values array */
    z EF0;

    static {
        z zVar = new z("UNKNOWN", 0);
        z zVar2 = new z("ANDROID_FIREBASE", 1);
        f860w = zVar2;
        f861x = new z[]{zVar, zVar2};
    }

    public static z valueOf(String str) {
        return (z) Enum.valueOf(z.class, str);
    }

    public static z[] values() {
        return (z[]) f861x.clone();
    }
}
