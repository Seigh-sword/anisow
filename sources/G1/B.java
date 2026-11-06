package G1;

import android.util.SparseArray;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class B {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final B f750w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final /* synthetic */ B[] f751x;

    /* JADX INFO: Fake field, exist only in values array */
    B EF0;

    static {
        B b6 = new B("NOT_SET", 0);
        B b7 = new B("EVENT_OVERRIDE", 1);
        f750w = b7;
        f751x = new B[]{b6, b7};
        SparseArray sparseArray = new SparseArray();
        sparseArray.put(0, b6);
        sparseArray.put(5, b7);
    }

    public static B valueOf(String str) {
        return (B) Enum.valueOf(B.class, str);
    }

    public static B[] values() {
        return (B[]) f751x.clone();
    }
}
