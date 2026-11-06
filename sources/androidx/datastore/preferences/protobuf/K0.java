package androidx.datastore.preferences.protobuf;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'EF12' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:395)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:324)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: loaded from: classes.dex */
public class K0 {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public static final I0 f5386A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public static final /* synthetic */ K0[] f5387B;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final G0 f5388y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final H0 f5389z;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final L0 f5390w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final int f5391x;

    /* JADX INFO: Fake field, exist only in values array */
    K0 EF10;

    /* JADX INFO: Fake field, exist only in values array */
    K0 EF11;

    /* JADX INFO: Fake field, exist only in values array */
    K0 EF12;

    static {
        K0 k02 = new K0("DOUBLE", 0, L0.f5393A, 1);
        K0 k03 = new K0("FLOAT", 1, L0.f5402z, 5);
        L0 l02 = L0.f5401y;
        K0 k04 = new K0("INT64", 2, l02, 0);
        K0 k05 = new K0("UINT64", 3, l02, 0);
        L0 l03 = L0.f5400x;
        K0 k06 = new K0("INT32", 4, l03, 0);
        K0 k07 = new K0("FIXED64", 5, l02, 1);
        K0 k08 = new K0("FIXED32", 6, l03, 5);
        K0 k09 = new K0("BOOL", 7, L0.f5394B, 0);
        G0 g02 = new G0("STRING", 8, L0.f5395C, 2);
        f5388y = g02;
        L0 l04 = L0.f5398F;
        H0 h02 = new H0("GROUP", 9, l04, 3);
        f5389z = h02;
        I0 i02 = new I0("MESSAGE", 10, l04, 2);
        f5386A = i02;
        f5387B = new K0[]{k02, k03, k04, k05, k06, k07, k08, k09, g02, h02, i02, new J0("BYTES", 11, L0.f5396D, 2), new K0("UINT32", 12, l03, 0), new K0("ENUM", 13, L0.f5397E, 0), new K0("SFIXED32", 14, l03, 5), new K0("SFIXED64", 15, l02, 1), new K0("SINT32", 16, l03, 0), new K0("SINT64", 17, l02, 0)};
    }

    public K0(String str, int i6, L0 l02, int i7) {
        this.f5390w = l02;
        this.f5391x = i7;
    }

    public static K0 valueOf(String str) {
        return (K0) Enum.valueOf(K0.class, str);
    }

    public static K0[] values() {
        return (K0[]) f5387B.clone();
    }
}
