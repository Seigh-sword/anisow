package E1;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class d {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final d f385w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final d f386x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final d f387y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final /* synthetic */ d[] f388z;

    static {
        d dVar = new d("DEFAULT", 0);
        f385w = dVar;
        d dVar2 = new d("VERY_LOW", 1);
        f386x = dVar2;
        d dVar3 = new d("HIGHEST", 2);
        f387y = dVar3;
        f388z = new d[]{dVar, dVar2, dVar3};
    }

    public static d valueOf(String str) {
        return (d) Enum.valueOf(d.class, str);
    }

    public static d[] values() {
        return (d[]) f388z.clone();
    }
}
