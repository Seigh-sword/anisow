package com.onesignal;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class o2 {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final o2 f7925w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final o2 f7926x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final /* synthetic */ o2[] f7927y;

    static {
        o2 o2Var = new o2("TOP_BANNER", 0);
        f7925w = o2Var;
        o2 o2Var2 = new o2("BOTTOM_BANNER", 1);
        o2 o2Var3 = new o2("CENTER_MODAL", 2);
        o2 o2Var4 = new o2("FULL_SCREEN", 3);
        f7926x = o2Var4;
        f7927y = new o2[]{o2Var, o2Var2, o2Var3, o2Var4};
    }

    public static o2 valueOf(String str) {
        return (o2) Enum.valueOf(o2.class, str);
    }

    public static o2[] values() {
        return (o2[]) f7927y.clone();
    }
}
