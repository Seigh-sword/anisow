package com.onesignal;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class L {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final L f7614w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final L f7615x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final L f7616y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final /* synthetic */ L[] f7617z;

    static {
        L l5 = new L("STARTUP", 0);
        f7614w = l5;
        L l6 = new L("PROMPT_LOCATION", 1);
        f7615x = l6;
        L l7 = new L("SYNC_SERVICE", 2);
        f7616y = l7;
        f7617z = new L[]{l5, l6, l7};
    }

    public static L valueOf(String str) {
        return (L) Enum.valueOf(L.class, str);
    }

    public static L[] values() {
        return (L[]) f7617z.clone();
    }
}
