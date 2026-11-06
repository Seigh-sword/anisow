package o0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: o0.o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC1201o {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final EnumC1201o f12043w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final EnumC1201o f12044x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final EnumC1201o f12045y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final /* synthetic */ EnumC1201o[] f12046z;

    static {
        EnumC1201o enumC1201o = new EnumC1201o("ITEM_TO_PLACEHOLDER", 0);
        f12043w = enumC1201o;
        EnumC1201o enumC1201o2 = new EnumC1201o("PLACEHOLDER_TO_ITEM", 1);
        f12044x = enumC1201o2;
        EnumC1201o enumC1201o3 = new EnumC1201o("PLACEHOLDER_POSITION_CHANGE", 2);
        f12045y = enumC1201o3;
        f12046z = new EnumC1201o[]{enumC1201o, enumC1201o2, enumC1201o3};
    }

    public static EnumC1201o valueOf(String str) {
        return (EnumC1201o) Enum.valueOf(EnumC1201o.class, str);
    }

    public static EnumC1201o[] values() {
        return (EnumC1201o[]) f12046z.clone();
    }
}
