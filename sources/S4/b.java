package S4;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public static final b f3302A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public static final /* synthetic */ b[] f3303B;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final b f3304w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final b f3305x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final b f3306y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final b f3307z;

    static {
        b bVar = new b("CPU_ACQUIRED", 0);
        f3304w = bVar;
        b bVar2 = new b("BLOCKING", 1);
        f3305x = bVar2;
        b bVar3 = new b("PARKING", 2);
        f3306y = bVar3;
        b bVar4 = new b("DORMANT", 3);
        f3307z = bVar4;
        b bVar5 = new b("TERMINATED", 4);
        f3302A = bVar5;
        f3303B = new b[]{bVar, bVar2, bVar3, bVar4, bVar5};
    }

    public static b valueOf(String str) {
        return (b) Enum.valueOf(b.class, str);
    }

    public static b[] values() {
        return (b[]) f3303B.clone();
    }
}
