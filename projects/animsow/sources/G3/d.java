package G3;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class d {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final d f881w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final d f882x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final /* synthetic */ d[] f883y;

    static {
        d dVar = new d("OK", 0);
        f881w = dVar;
        d dVar2 = new d("BAD_CONFIG", 1);
        f882x = dVar2;
        f883y = new d[]{dVar, dVar2};
    }

    public static d valueOf(String str) {
        return (d) Enum.valueOf(d.class, str);
    }

    public static d[] values() {
        return (d[]) f883y.clone();
    }
}
