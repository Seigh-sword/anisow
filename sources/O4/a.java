package O4;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final a f2342w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final a f2343x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final a f2344y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final /* synthetic */ a[] f2345z;

    static {
        a aVar = new a("SUSPEND", 0);
        f2342w = aVar;
        a aVar2 = new a("DROP_OLDEST", 1);
        f2343x = aVar2;
        a aVar3 = new a("DROP_LATEST", 2);
        f2344y = aVar3;
        f2345z = new a[]{aVar, aVar2, aVar3};
    }

    public static a valueOf(String str) {
        return (a) Enum.valueOf(a.class, str);
    }

    public static a[] values() {
        return (a[]) f2345z.clone();
    }
}
