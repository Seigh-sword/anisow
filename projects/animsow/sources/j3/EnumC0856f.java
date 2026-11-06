package j3;

import java.util.HashMap;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: j3.f, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC0856f {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final EnumC0856f f9465w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final HashMap f9466x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final /* synthetic */ EnumC0856f[] f9467y;

    /* JADX INFO: Fake field, exist only in values array */
    EnumC0856f EF10;

    static {
        EnumC0856f enumC0856f = new EnumC0856f("X86_32", 0);
        EnumC0856f enumC0856f2 = new EnumC0856f("X86_64", 1);
        EnumC0856f enumC0856f3 = new EnumC0856f("ARM_UNKNOWN", 2);
        EnumC0856f enumC0856f4 = new EnumC0856f("PPC", 3);
        EnumC0856f enumC0856f5 = new EnumC0856f("PPC64", 4);
        EnumC0856f enumC0856f6 = new EnumC0856f("ARMV6", 5);
        EnumC0856f enumC0856f7 = new EnumC0856f("ARMV7", 6);
        EnumC0856f enumC0856f8 = new EnumC0856f("UNKNOWN", 7);
        f9465w = enumC0856f8;
        EnumC0856f enumC0856f9 = new EnumC0856f("ARMV7S", 8);
        EnumC0856f enumC0856f10 = new EnumC0856f("ARM64", 9);
        f9467y = new EnumC0856f[]{enumC0856f, enumC0856f2, enumC0856f3, enumC0856f4, enumC0856f5, enumC0856f6, enumC0856f7, enumC0856f8, enumC0856f9, enumC0856f10};
        HashMap map = new HashMap(4);
        f9466x = map;
        map.put("armeabi-v7a", enumC0856f7);
        map.put("armeabi", enumC0856f6);
        map.put("arm64-v8a", enumC0856f10);
        map.put("x86", enumC0856f);
    }

    public static EnumC0856f valueOf(String str) {
        return (EnumC0856f) Enum.valueOf(EnumC0856f.class, str);
    }

    public static EnumC0856f[] values() {
        return (EnumC0856f[]) f9467y.clone();
    }
}
