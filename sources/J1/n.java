package j1;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class n {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final n f9443w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final /* synthetic */ n[] f9444x;

    /* JADX INFO: Fake field, exist only in values array */
    n EF0;

    static {
        n nVar = new n("SRGB", 0);
        n nVar2 = new n("DISPLAY_P3", 1);
        f9443w = nVar2;
        f9444x = new n[]{nVar, nVar2};
    }

    public static n valueOf(String str) {
        return (n) Enum.valueOf(n.class, str);
    }

    public static n[] values() {
        return (n[]) f9444x.clone();
    }
}
