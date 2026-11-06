package G3;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class f {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final f f889w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final f f890x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final f f891y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final /* synthetic */ f[] f892z;

    static {
        f fVar = new f("OK", 0);
        f889w = fVar;
        f fVar2 = new f("BAD_CONFIG", 1);
        f890x = fVar2;
        f fVar3 = new f("AUTH_ERROR", 2);
        f891y = fVar3;
        f892z = new f[]{fVar, fVar2, fVar3};
    }

    public static f valueOf(String str) {
        return (f) Enum.valueOf(f.class, str);
    }

    public static f[] values() {
        return (f[]) f892z.clone();
    }
}
