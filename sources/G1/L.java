package G1;

import android.util.SparseArray;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class L {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final L f756w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final /* synthetic */ L[] f757x;

    static {
        L l5 = new L("DEFAULT", 0);
        f756w = l5;
        L l6 = new L("UNMETERED_ONLY", 1);
        L l7 = new L("UNMETERED_OR_DAILY", 2);
        L l8 = new L("FAST_IF_RADIO_AWAKE", 3);
        L l9 = new L("NEVER", 4);
        L l10 = new L("UNRECOGNIZED", 5);
        f757x = new L[]{l5, l6, l7, l8, l9, l10};
        SparseArray sparseArray = new SparseArray();
        sparseArray.put(0, l5);
        sparseArray.put(1, l6);
        sparseArray.put(2, l7);
        sparseArray.put(3, l8);
        sparseArray.put(4, l9);
        sparseArray.put(-1, l10);
    }

    public static L valueOf(String str) {
        return (L) Enum.valueOf(L.class, str);
    }

    public static L[] values() {
        return (L[]) f757x.clone();
    }
}
