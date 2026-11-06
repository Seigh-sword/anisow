package com.onesignal;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class L1 {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final L1 f7623w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final L1 f7624x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final L1 f7625y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final /* synthetic */ L1[] f7626z;

    static {
        L1 l12 = new L1("PUSH", 0);
        f7623w = l12;
        L1 l13 = new L1("EMAIL", 1);
        f7624x = l13;
        L1 l14 = new L1("SMS", 2);
        f7625y = l14;
        f7626z = new L1[]{l12, l13, l14};
    }

    public static L1 valueOf(String str) {
        return (L1) Enum.valueOf(L1.class, str);
    }

    public static L1[] values() {
        return (L1[]) f7626z.clone();
    }
}
