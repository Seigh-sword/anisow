package z3;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class d {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final d f14111w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final /* synthetic */ d[] f14112x;

    static {
        d dVar = new d("DEFAULT", 0);
        f14111w = dVar;
        f14112x = new d[]{dVar, new d("SIGNED", 1), new d("FIXED", 2)};
    }

    public static d valueOf(String str) {
        return (d) Enum.valueOf(d.class, str);
    }

    public static d[] values() {
        return (d[]) f14112x.clone();
    }
}
