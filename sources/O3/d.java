package O3;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class d {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final d f2338w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final d f2339x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final /* synthetic */ d[] f2340y;

    static {
        d dVar = new d("CRASHLYTICS", 0);
        f2338w = dVar;
        d dVar2 = new d("PERFORMANCE", 1);
        f2339x = dVar2;
        f2340y = new d[]{dVar, dVar2, new d("MATT_SAYS_HI", 2)};
    }

    public static d valueOf(String str) {
        return (d) Enum.valueOf(d.class, str);
    }

    public static d[] values() {
        return (d[]) f2340y.clone();
    }
}
