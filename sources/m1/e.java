package M1;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class e {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final e f1767w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final e f1768x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final e f1769y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final /* synthetic */ e[] f1770z;

    static {
        e eVar = new e("NETWORK_UNMETERED", 0);
        f1767w = eVar;
        e eVar2 = new e("DEVICE_IDLE", 1);
        f1768x = eVar2;
        e eVar3 = new e("DEVICE_CHARGING", 2);
        f1769y = eVar3;
        f1770z = new e[]{eVar, eVar2, eVar3};
    }

    public static e valueOf(String str) {
        return (e) Enum.valueOf(e.class, str);
    }

    public static e[] values() {
        return (e[]) f1770z.clone();
    }
}
