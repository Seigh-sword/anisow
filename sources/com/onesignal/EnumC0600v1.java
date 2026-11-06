package com.onesignal;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: com.onesignal.v1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC0600v1 {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public static final EnumC0600v1 f7991A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public static final EnumC0600v1 f7992B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public static final EnumC0600v1 f7993C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public static final /* synthetic */ EnumC0600v1[] f7994D;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final EnumC0600v1 f7995w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final EnumC0600v1 f7996x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final EnumC0600v1 f7997y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final EnumC0600v1 f7998z;

    static {
        EnumC0600v1 enumC0600v1 = new EnumC0600v1("NONE", 0);
        f7995w = enumC0600v1;
        EnumC0600v1 enumC0600v12 = new EnumC0600v1("FATAL", 1);
        f7996x = enumC0600v12;
        EnumC0600v1 enumC0600v13 = new EnumC0600v1("ERROR", 2);
        f7997y = enumC0600v13;
        EnumC0600v1 enumC0600v14 = new EnumC0600v1("WARN", 3);
        f7998z = enumC0600v14;
        EnumC0600v1 enumC0600v15 = new EnumC0600v1("INFO", 4);
        f7991A = enumC0600v15;
        EnumC0600v1 enumC0600v16 = new EnumC0600v1("DEBUG", 5);
        f7992B = enumC0600v16;
        EnumC0600v1 enumC0600v17 = new EnumC0600v1("VERBOSE", 6);
        f7993C = enumC0600v17;
        f7994D = new EnumC0600v1[]{enumC0600v1, enumC0600v12, enumC0600v13, enumC0600v14, enumC0600v15, enumC0600v16, enumC0600v17};
    }

    public static EnumC0600v1 valueOf(String str) {
        return (EnumC0600v1) Enum.valueOf(EnumC0600v1.class, str);
    }

    public static EnumC0600v1[] values() {
        return (EnumC0600v1[]) f7994D.clone();
    }
}
