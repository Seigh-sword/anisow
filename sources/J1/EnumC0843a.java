package j1;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: j1.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC0843a {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public static final EnumC0843a f9422A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public static final /* synthetic */ EnumC0843a[] f9423B;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final EnumC0843a f9424w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final EnumC0843a f9425x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final EnumC0843a f9426y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final EnumC0843a f9427z;

    static {
        EnumC0843a enumC0843a = new EnumC0843a("LOCAL", 0);
        f9424w = enumC0843a;
        EnumC0843a enumC0843a2 = new EnumC0843a("REMOTE", 1);
        f9425x = enumC0843a2;
        EnumC0843a enumC0843a3 = new EnumC0843a("DATA_DISK_CACHE", 2);
        f9426y = enumC0843a3;
        EnumC0843a enumC0843a4 = new EnumC0843a("RESOURCE_DISK_CACHE", 3);
        f9427z = enumC0843a4;
        EnumC0843a enumC0843a5 = new EnumC0843a("MEMORY_CACHE", 4);
        f9422A = enumC0843a5;
        f9423B = new EnumC0843a[]{enumC0843a, enumC0843a2, enumC0843a3, enumC0843a4, enumC0843a5};
    }

    public static EnumC0843a valueOf(String str) {
        return (EnumC0843a) Enum.valueOf(EnumC0843a.class, str);
    }

    public static EnumC0843a[] values() {
        return (EnumC0843a[]) f9423B.clone();
    }
}
