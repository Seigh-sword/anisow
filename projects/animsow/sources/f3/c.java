package F3;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class c {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public static final c f630A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public static final /* synthetic */ c[] f631B;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final c f632w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final c f633x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final c f634y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final c f635z;

    static {
        c cVar = new c("ATTEMPT_MIGRATION", 0);
        f632w = cVar;
        c cVar2 = new c("NOT_GENERATED", 1);
        f633x = cVar2;
        c cVar3 = new c("UNREGISTERED", 2);
        f634y = cVar3;
        c cVar4 = new c("REGISTERED", 3);
        f635z = cVar4;
        c cVar5 = new c("REGISTER_ERROR", 4);
        f630A = cVar5;
        f631B = new c[]{cVar, cVar2, cVar3, cVar4, cVar5};
    }

    public static c valueOf(String str) {
        return (c) Enum.valueOf(c.class, str);
    }

    public static c[] values() {
        return (c[]) f631B.clone();
    }
}
