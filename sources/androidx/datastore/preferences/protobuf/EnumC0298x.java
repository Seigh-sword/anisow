package androidx.datastore.preferences.protobuf;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'EF0' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:395)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:324)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.x, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC0298x {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public static final /* synthetic */ EnumC0298x[] f5530A;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final EnumC0298x f5531x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final EnumC0298x f5532y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final EnumC0298x[] f5533z;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final int f5534w;

    /* JADX INFO: Fake field, exist only in values array */
    EnumC0298x EF0;

    static {
        I i6 = I.DOUBLE;
        EnumC0298x enumC0298x = new EnumC0298x("DOUBLE", 0, 0, 1, i6);
        I i7 = I.FLOAT;
        EnumC0298x enumC0298x2 = new EnumC0298x("FLOAT", 1, 1, 1, i7);
        I i8 = I.LONG;
        EnumC0298x enumC0298x3 = new EnumC0298x("INT64", 2, 2, 1, i8);
        EnumC0298x enumC0298x4 = new EnumC0298x("UINT64", 3, 3, 1, i8);
        I i9 = I.INT;
        EnumC0298x enumC0298x5 = new EnumC0298x("INT32", 4, 4, 1, i9);
        EnumC0298x enumC0298x6 = new EnumC0298x("FIXED64", 5, 5, 1, i8);
        EnumC0298x enumC0298x7 = new EnumC0298x("FIXED32", 6, 6, 1, i9);
        I i10 = I.BOOLEAN;
        EnumC0298x enumC0298x8 = new EnumC0298x("BOOL", 7, 7, 1, i10);
        I i11 = I.STRING;
        EnumC0298x enumC0298x9 = new EnumC0298x("STRING", 8, 8, 1, i11);
        I i12 = I.MESSAGE;
        EnumC0298x enumC0298x10 = new EnumC0298x("MESSAGE", 9, 9, 1, i12);
        I i13 = I.BYTE_STRING;
        EnumC0298x enumC0298x11 = new EnumC0298x("BYTES", 10, 10, 1, i13);
        EnumC0298x enumC0298x12 = new EnumC0298x("UINT32", 11, 11, 1, i9);
        I i14 = I.ENUM;
        EnumC0298x enumC0298x13 = new EnumC0298x("ENUM", 12, 12, 1, i14);
        EnumC0298x enumC0298x14 = new EnumC0298x("SFIXED32", 13, 13, 1, i9);
        EnumC0298x enumC0298x15 = new EnumC0298x("SFIXED64", 14, 14, 1, i8);
        EnumC0298x enumC0298x16 = new EnumC0298x("SINT32", 15, 15, 1, i9);
        EnumC0298x enumC0298x17 = new EnumC0298x("SINT64", 16, 16, 1, i8);
        EnumC0298x enumC0298x18 = new EnumC0298x("GROUP", 17, 17, 1, i12);
        EnumC0298x enumC0298x19 = new EnumC0298x("DOUBLE_LIST", 18, 18, 2, i6);
        EnumC0298x enumC0298x20 = new EnumC0298x("FLOAT_LIST", 19, 19, 2, i7);
        EnumC0298x enumC0298x21 = new EnumC0298x("INT64_LIST", 20, 20, 2, i8);
        EnumC0298x enumC0298x22 = new EnumC0298x("UINT64_LIST", 21, 21, 2, i8);
        EnumC0298x enumC0298x23 = new EnumC0298x("INT32_LIST", 22, 22, 2, i9);
        EnumC0298x enumC0298x24 = new EnumC0298x("FIXED64_LIST", 23, 23, 2, i8);
        EnumC0298x enumC0298x25 = new EnumC0298x("FIXED32_LIST", 24, 24, 2, i9);
        EnumC0298x enumC0298x26 = new EnumC0298x("BOOL_LIST", 25, 25, 2, i10);
        EnumC0298x enumC0298x27 = new EnumC0298x("STRING_LIST", 26, 26, 2, i11);
        EnumC0298x enumC0298x28 = new EnumC0298x("MESSAGE_LIST", 27, 27, 2, i12);
        EnumC0298x enumC0298x29 = new EnumC0298x("BYTES_LIST", 28, 28, 2, i13);
        EnumC0298x enumC0298x30 = new EnumC0298x("UINT32_LIST", 29, 29, 2, i9);
        EnumC0298x enumC0298x31 = new EnumC0298x("ENUM_LIST", 30, 30, 2, i14);
        EnumC0298x enumC0298x32 = new EnumC0298x("SFIXED32_LIST", 31, 31, 2, i9);
        EnumC0298x enumC0298x33 = new EnumC0298x("SFIXED64_LIST", 32, 32, 2, i8);
        EnumC0298x enumC0298x34 = new EnumC0298x("SINT32_LIST", 33, 33, 2, i9);
        EnumC0298x enumC0298x35 = new EnumC0298x("SINT64_LIST", 34, 34, 2, i8);
        EnumC0298x enumC0298x36 = new EnumC0298x("DOUBLE_LIST_PACKED", 35, 35, 3, i6);
        f5531x = enumC0298x36;
        EnumC0298x enumC0298x37 = new EnumC0298x("FLOAT_LIST_PACKED", 36, 36, 3, i7);
        EnumC0298x enumC0298x38 = new EnumC0298x("INT64_LIST_PACKED", 37, 37, 3, i8);
        EnumC0298x enumC0298x39 = new EnumC0298x("UINT64_LIST_PACKED", 38, 38, 3, i8);
        EnumC0298x enumC0298x40 = new EnumC0298x("INT32_LIST_PACKED", 39, 39, 3, i9);
        EnumC0298x enumC0298x41 = new EnumC0298x("FIXED64_LIST_PACKED", 40, 40, 3, i8);
        EnumC0298x enumC0298x42 = new EnumC0298x("FIXED32_LIST_PACKED", 41, 41, 3, i9);
        EnumC0298x enumC0298x43 = new EnumC0298x("BOOL_LIST_PACKED", 42, 42, 3, i10);
        EnumC0298x enumC0298x44 = new EnumC0298x("UINT32_LIST_PACKED", 43, 43, 3, i9);
        EnumC0298x enumC0298x45 = new EnumC0298x("ENUM_LIST_PACKED", 44, 44, 3, i14);
        EnumC0298x enumC0298x46 = new EnumC0298x("SFIXED32_LIST_PACKED", 45, 45, 3, i9);
        EnumC0298x enumC0298x47 = new EnumC0298x("SFIXED64_LIST_PACKED", 46, 46, 3, i8);
        EnumC0298x enumC0298x48 = new EnumC0298x("SINT32_LIST_PACKED", 47, 47, 3, i9);
        EnumC0298x enumC0298x49 = new EnumC0298x("SINT64_LIST_PACKED", 48, 48, 3, i8);
        f5532y = enumC0298x49;
        f5530A = new EnumC0298x[]{enumC0298x, enumC0298x2, enumC0298x3, enumC0298x4, enumC0298x5, enumC0298x6, enumC0298x7, enumC0298x8, enumC0298x9, enumC0298x10, enumC0298x11, enumC0298x12, enumC0298x13, enumC0298x14, enumC0298x15, enumC0298x16, enumC0298x17, enumC0298x18, enumC0298x19, enumC0298x20, enumC0298x21, enumC0298x22, enumC0298x23, enumC0298x24, enumC0298x25, enumC0298x26, enumC0298x27, enumC0298x28, enumC0298x29, enumC0298x30, enumC0298x31, enumC0298x32, enumC0298x33, enumC0298x34, enumC0298x35, enumC0298x36, enumC0298x37, enumC0298x38, enumC0298x39, enumC0298x40, enumC0298x41, enumC0298x42, enumC0298x43, enumC0298x44, enumC0298x45, enumC0298x46, enumC0298x47, enumC0298x48, enumC0298x49, new EnumC0298x("GROUP_LIST", 49, 49, 2, i12), new EnumC0298x("MAP", 50, 50, 4, I.VOID)};
        EnumC0298x[] enumC0298xArrValues = values();
        f5533z = new EnumC0298x[enumC0298xArrValues.length];
        for (EnumC0298x enumC0298x50 : enumC0298xArrValues) {
            f5533z[enumC0298x50.f5534w] = enumC0298x50;
        }
    }

    public EnumC0298x(String str, int i6, int i7, int i8, I i9) {
        this.f5534w = i7;
        int iB = u.h.b(i8);
        if (iB == 1 || iB == 3) {
            i9.getClass();
        }
        if (i8 == 1) {
            i9.ordinal();
        }
    }

    public static EnumC0298x valueOf(String str) {
        return (EnumC0298x) Enum.valueOf(EnumC0298x.class, str);
    }

    public static EnumC0298x[] values() {
        return (EnumC0298x[]) f5530A.clone();
    }

    public final int a() {
        return this.f5534w;
    }
}
