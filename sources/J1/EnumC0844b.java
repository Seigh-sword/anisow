package j1;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: j1.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC0844b {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final EnumC0844b f9428w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final EnumC0844b f9429x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final EnumC0844b f9430y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final /* synthetic */ EnumC0844b[] f9431z;

    static {
        EnumC0844b enumC0844b = new EnumC0844b("PREFER_ARGB_8888", 0);
        f9428w = enumC0844b;
        EnumC0844b enumC0844b2 = new EnumC0844b("PREFER_RGB_565", 1);
        f9429x = enumC0844b2;
        f9431z = new EnumC0844b[]{enumC0844b, enumC0844b2};
        f9430y = enumC0844b;
    }

    public static EnumC0844b valueOf(String str) {
        return (EnumC0844b) Enum.valueOf(EnumC0844b.class, str);
    }

    public static EnumC0844b[] values() {
        return (EnumC0844b[]) f9431z.clone();
    }
}
