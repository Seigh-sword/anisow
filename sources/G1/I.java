package G1;

import android.util.SparseArray;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class I {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final SparseArray f752w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final /* synthetic */ I[] f753x;

    /* JADX INFO: Fake field, exist only in values array */
    I EF15;

    static {
        I i6 = new I("UNKNOWN_MOBILE_SUBTYPE", 0);
        I i7 = new I("GPRS", 1);
        I i8 = new I("EDGE", 2);
        I i9 = new I("UMTS", 3);
        I i10 = new I("CDMA", 4);
        I i11 = new I("EVDO_0", 5);
        I i12 = new I("EVDO_A", 6);
        I i13 = new I("RTT", 7);
        I i14 = new I("HSDPA", 8);
        I i15 = new I("HSUPA", 9);
        I i16 = new I("HSPA", 10);
        I i17 = new I("IDEN", 11);
        I i18 = new I("EVDO_B", 12);
        I i19 = new I("LTE", 13);
        I i20 = new I("EHRPD", 14);
        I i21 = new I("HSPAP", 15);
        I i22 = new I("GSM", 16);
        I i23 = new I("TD_SCDMA", 17);
        I i24 = new I("IWLAN", 18);
        I i25 = new I("LTE_CA", 19);
        f753x = new I[]{i6, i7, i8, i9, i10, i11, i12, i13, i14, i15, i16, i17, i18, i19, i20, i21, i22, i23, i24, i25, new I("COMBINED", 20)};
        SparseArray sparseArray = new SparseArray();
        f752w = sparseArray;
        sparseArray.put(0, i6);
        sparseArray.put(1, i7);
        sparseArray.put(2, i8);
        sparseArray.put(3, i9);
        sparseArray.put(4, i10);
        sparseArray.put(5, i11);
        sparseArray.put(6, i12);
        sparseArray.put(7, i13);
        sparseArray.put(8, i14);
        sparseArray.put(9, i15);
        sparseArray.put(10, i16);
        sparseArray.put(11, i17);
        sparseArray.put(12, i18);
        sparseArray.put(13, i19);
        sparseArray.put(14, i20);
        sparseArray.put(15, i21);
        sparseArray.put(16, i22);
        sparseArray.put(17, i23);
        sparseArray.put(18, i24);
        sparseArray.put(19, i25);
    }

    public static I valueOf(String str) {
        return (I) Enum.valueOf(I.class, str);
    }

    public static I[] values() {
        return (I[]) f753x.clone();
    }
}
