package androidx.lifecycle;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: androidx.lifecycle.m, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC0313m {
    private static final /* synthetic */ EnumC0313m[] $VALUES;
    public static final C0311k Companion;
    public static final EnumC0313m ON_ANY;
    public static final EnumC0313m ON_CREATE;
    public static final EnumC0313m ON_DESTROY;
    public static final EnumC0313m ON_PAUSE;
    public static final EnumC0313m ON_RESUME;
    public static final EnumC0313m ON_START;
    public static final EnumC0313m ON_STOP;

    static {
        EnumC0313m enumC0313m = new EnumC0313m("ON_CREATE", 0);
        ON_CREATE = enumC0313m;
        EnumC0313m enumC0313m2 = new EnumC0313m("ON_START", 1);
        ON_START = enumC0313m2;
        EnumC0313m enumC0313m3 = new EnumC0313m("ON_RESUME", 2);
        ON_RESUME = enumC0313m3;
        EnumC0313m enumC0313m4 = new EnumC0313m("ON_PAUSE", 3);
        ON_PAUSE = enumC0313m4;
        EnumC0313m enumC0313m5 = new EnumC0313m("ON_STOP", 4);
        ON_STOP = enumC0313m5;
        EnumC0313m enumC0313m6 = new EnumC0313m("ON_DESTROY", 5);
        ON_DESTROY = enumC0313m6;
        EnumC0313m enumC0313m7 = new EnumC0313m("ON_ANY", 6);
        ON_ANY = enumC0313m7;
        $VALUES = new EnumC0313m[]{enumC0313m, enumC0313m2, enumC0313m3, enumC0313m4, enumC0313m5, enumC0313m6, enumC0313m7};
        Companion = new C0311k();
    }

    public static EnumC0313m valueOf(String str) {
        return (EnumC0313m) Enum.valueOf(EnumC0313m.class, str);
    }

    public static EnumC0313m[] values() {
        return (EnumC0313m[]) $VALUES.clone();
    }

    public final EnumC0314n a() {
        switch (AbstractC0312l.f5628a[ordinal()]) {
            case 1:
            case Z.j.FLOAT_FIELD_NUMBER /* 2 */:
                return EnumC0314n.f5633y;
            case Z.j.INTEGER_FIELD_NUMBER /* 3 */:
            case Z.j.LONG_FIELD_NUMBER /* 4 */:
                return EnumC0314n.f5634z;
            case Z.j.STRING_FIELD_NUMBER /* 5 */:
                return EnumC0314n.f5629A;
            case Z.j.STRING_SET_FIELD_NUMBER /* 6 */:
                return EnumC0314n.f5631w;
            default:
                throw new IllegalArgumentException(this + " has no target state");
        }
    }
}
