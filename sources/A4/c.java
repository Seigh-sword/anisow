package a4;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class c {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public static final /* synthetic */ c[] f5023A;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final c f5024w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final c f5025x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final c f5026y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final c f5027z;

    static {
        c cVar = new c("DIRECT", 0);
        f5024w = cVar;
        c cVar2 = new c("INDIRECT", 1);
        f5025x = cVar2;
        c cVar3 = new c("UNATTRIBUTED", 2);
        f5026y = cVar3;
        c cVar4 = new c("DISABLED", 3);
        f5027z = cVar4;
        f5023A = new c[]{cVar, cVar2, cVar3, cVar4};
    }

    public static c valueOf(String str) {
        return (c) Enum.valueOf(c.class, str);
    }

    public static c[] values() {
        return (c[]) f5023A.clone();
    }

    public final boolean a() {
        return b() || this == f5025x;
    }

    public final boolean b() {
        return this == f5024w;
    }
}
