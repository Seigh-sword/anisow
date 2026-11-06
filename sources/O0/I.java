package o0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class I {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final I f11772w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final I f11773x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final I f11774y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final /* synthetic */ I[] f11775z;

    static {
        I i6 = new I("REFRESH", 0);
        f11772w = i6;
        I i7 = new I("PREPEND", 1);
        f11773x = i7;
        I i8 = new I("APPEND", 2);
        f11774y = i8;
        f11775z = new I[]{i6, i7, i8};
    }

    public static I valueOf(String str) {
        return (I) Enum.valueOf(I.class, str);
    }

    public static I[] values() {
        return (I[]) f11775z.clone();
    }
}
