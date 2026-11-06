package com.onesignal;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class C0 {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final C0 f7498w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final C0 f7499x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final /* synthetic */ C0[] f7500y;

    static {
        C0 c02 = new C0("Opened", 0);
        f7498w = c02;
        C0 c03 = new C0("ActionTaken", 1);
        f7499x = c03;
        f7500y = new C0[]{c02, c03};
    }

    public static C0 valueOf(String str) {
        return (C0) Enum.valueOf(C0.class, str);
    }

    public static C0[] values() {
        return (C0[]) f7500y.clone();
    }
}
