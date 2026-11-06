package M4;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class A {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public static final /* synthetic */ A[] f1831A;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final A f1832w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final A f1833x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final A f1834y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final A f1835z;

    static {
        A a6 = new A("DEFAULT", 0);
        f1832w = a6;
        A a7 = new A("LAZY", 1);
        f1833x = a7;
        A a8 = new A("ATOMIC", 2);
        f1834y = a8;
        A a9 = new A("UNDISPATCHED", 3);
        f1835z = a9;
        f1831A = new A[]{a6, a7, a8, a9};
    }

    public static A valueOf(String str) {
        return (A) Enum.valueOf(A.class, str);
    }

    public static A[] values() {
        return (A[]) f1831A.clone();
    }
}
