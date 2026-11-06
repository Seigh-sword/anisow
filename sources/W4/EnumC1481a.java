package w4;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: w4.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC1481a {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final EnumC1481a f13592w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final /* synthetic */ EnumC1481a[] f13593x;

    static {
        EnumC1481a enumC1481a = new EnumC1481a("COROUTINE_SUSPENDED", 0);
        f13592w = enumC1481a;
        f13593x = new EnumC1481a[]{enumC1481a, new EnumC1481a("UNDECIDED", 1), new EnumC1481a("RESUMED", 2)};
    }

    public static EnumC1481a valueOf(String str) {
        return (EnumC1481a) Enum.valueOf(EnumC1481a.class, str);
    }

    public static EnumC1481a[] values() {
        return (EnumC1481a[]) f13593x.clone();
    }
}
