package i0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: i0.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC0821a {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public static final EnumC0821a f9349A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public static final EnumC0821a f9350B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public static final /* synthetic */ EnumC0821a[] f9351C;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final EnumC0821a f9352w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final EnumC0821a f9353x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final EnumC0821a f9354y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final EnumC0821a f9355z;

    static {
        EnumC0821a enumC0821a = new EnumC0821a("PENALTY_LOG", 0);
        f9352w = enumC0821a;
        EnumC0821a enumC0821a2 = new EnumC0821a("PENALTY_DEATH", 1);
        f9353x = enumC0821a2;
        EnumC0821a enumC0821a3 = new EnumC0821a("DETECT_FRAGMENT_REUSE", 2);
        f9354y = enumC0821a3;
        EnumC0821a enumC0821a4 = new EnumC0821a("DETECT_FRAGMENT_TAG_USAGE", 3);
        f9355z = enumC0821a4;
        EnumC0821a enumC0821a5 = new EnumC0821a("DETECT_WRONG_NESTED_HIERARCHY", 4);
        f9349A = enumC0821a5;
        EnumC0821a enumC0821a6 = new EnumC0821a("DETECT_RETAIN_INSTANCE_USAGE", 5);
        EnumC0821a enumC0821a7 = new EnumC0821a("DETECT_SET_USER_VISIBLE_HINT", 6);
        EnumC0821a enumC0821a8 = new EnumC0821a("DETECT_TARGET_FRAGMENT_USAGE", 7);
        EnumC0821a enumC0821a9 = new EnumC0821a("DETECT_WRONG_FRAGMENT_CONTAINER", 8);
        f9350B = enumC0821a9;
        f9351C = new EnumC0821a[]{enumC0821a, enumC0821a2, enumC0821a3, enumC0821a4, enumC0821a5, enumC0821a6, enumC0821a7, enumC0821a8, enumC0821a9};
    }

    public static EnumC0821a valueOf(String str) {
        return (EnumC0821a) Enum.valueOf(EnumC0821a.class, str);
    }

    public static EnumC0821a[] values() {
        return (EnumC0821a[]) f9351C.clone();
    }
}
