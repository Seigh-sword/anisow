package com.bumptech.glide;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class g {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public static final /* synthetic */ g[] f6341A;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final g f6342w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final g f6343x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final g f6344y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final g f6345z;

    static {
        g gVar = new g("IMMEDIATE", 0);
        f6342w = gVar;
        g gVar2 = new g("HIGH", 1);
        f6343x = gVar2;
        g gVar3 = new g("NORMAL", 2);
        f6344y = gVar3;
        g gVar4 = new g("LOW", 3);
        f6345z = gVar4;
        f6341A = new g[]{gVar, gVar2, gVar3, gVar4};
    }

    public static g valueOf(String str) {
        return (g) Enum.valueOf(g.class, str);
    }

    public static g[] values() {
        return (g[]) f6341A.clone();
    }
}
