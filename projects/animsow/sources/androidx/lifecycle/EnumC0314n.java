package androidx.lifecycle;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: androidx.lifecycle.n, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC0314n {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public static final EnumC0314n f5629A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public static final /* synthetic */ EnumC0314n[] f5630B;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final EnumC0314n f5631w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final EnumC0314n f5632x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final EnumC0314n f5633y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final EnumC0314n f5634z;

    static {
        EnumC0314n enumC0314n = new EnumC0314n("DESTROYED", 0);
        f5631w = enumC0314n;
        EnumC0314n enumC0314n2 = new EnumC0314n("INITIALIZED", 1);
        f5632x = enumC0314n2;
        EnumC0314n enumC0314n3 = new EnumC0314n("CREATED", 2);
        f5633y = enumC0314n3;
        EnumC0314n enumC0314n4 = new EnumC0314n("STARTED", 3);
        f5634z = enumC0314n4;
        EnumC0314n enumC0314n5 = new EnumC0314n("RESUMED", 4);
        f5629A = enumC0314n5;
        f5630B = new EnumC0314n[]{enumC0314n, enumC0314n2, enumC0314n3, enumC0314n4, enumC0314n5};
    }

    public static EnumC0314n valueOf(String str) {
        return (EnumC0314n) Enum.valueOf(EnumC0314n.class, str);
    }

    public static EnumC0314n[] values() {
        return (EnumC0314n[]) f5630B.clone();
    }
}
