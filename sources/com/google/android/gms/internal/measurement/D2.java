package com.google.android.gms.internal.measurement;

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
/* JADX INFO: loaded from: classes.dex */
public final class D2 {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public static final /* synthetic */ D2[] f6459A;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final D2 f6460x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final D2 f6461y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final D2[] f6462z;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final int f6463w;

    /* JADX INFO: Fake field, exist only in values array */
    D2 EF0;

    static {
        S2 s22 = S2.f6681A;
        D2 d22 = new D2("DOUBLE", 0, 0, 1, s22);
        S2 s23 = S2.f6691z;
        D2 d23 = new D2("FLOAT", 1, 1, 1, s23);
        S2 s24 = S2.f6690y;
        D2 d24 = new D2("INT64", 2, 2, 1, s24);
        D2 d25 = new D2("UINT64", 3, 3, 1, s24);
        S2 s25 = S2.f6689x;
        D2 d26 = new D2("INT32", 4, 4, 1, s25);
        D2 d27 = new D2("FIXED64", 5, 5, 1, s24);
        D2 d28 = new D2("FIXED32", 6, 6, 1, s25);
        S2 s26 = S2.f6682B;
        D2 d29 = new D2("BOOL", 7, 7, 1, s26);
        S2 s27 = S2.f6683C;
        D2 d210 = new D2("STRING", 8, 8, 1, s27);
        S2 s28 = S2.f6686F;
        D2 d211 = new D2("MESSAGE", 9, 9, 1, s28);
        S2 s29 = S2.f6684D;
        D2 d212 = new D2("BYTES", 10, 10, 1, s29);
        D2 d213 = new D2("UINT32", 11, 11, 1, s25);
        S2 s210 = S2.f6685E;
        D2 d214 = new D2("ENUM", 12, 12, 1, s210);
        D2 d215 = new D2("SFIXED32", 13, 13, 1, s25);
        D2 d216 = new D2("SFIXED64", 14, 14, 1, s24);
        D2 d217 = new D2("SINT32", 15, 15, 1, s25);
        D2 d218 = new D2("SINT64", 16, 16, 1, s24);
        D2 d219 = new D2("GROUP", 17, 17, 1, s28);
        D2 d220 = new D2("DOUBLE_LIST", 18, 18, 2, s22);
        D2 d221 = new D2("FLOAT_LIST", 19, 19, 2, s23);
        D2 d222 = new D2("INT64_LIST", 20, 20, 2, s24);
        D2 d223 = new D2("UINT64_LIST", 21, 21, 2, s24);
        D2 d224 = new D2("INT32_LIST", 22, 22, 2, s25);
        D2 d225 = new D2("FIXED64_LIST", 23, 23, 2, s24);
        D2 d226 = new D2("FIXED32_LIST", 24, 24, 2, s25);
        D2 d227 = new D2("BOOL_LIST", 25, 25, 2, s26);
        D2 d228 = new D2("STRING_LIST", 26, 26, 2, s27);
        D2 d229 = new D2("MESSAGE_LIST", 27, 27, 2, s28);
        D2 d230 = new D2("BYTES_LIST", 28, 28, 2, s29);
        D2 d231 = new D2("UINT32_LIST", 29, 29, 2, s25);
        D2 d232 = new D2("ENUM_LIST", 30, 30, 2, s210);
        D2 d233 = new D2("SFIXED32_LIST", 31, 31, 2, s25);
        D2 d234 = new D2("SFIXED64_LIST", 32, 32, 2, s24);
        D2 d235 = new D2("SINT32_LIST", 33, 33, 2, s25);
        D2 d236 = new D2("SINT64_LIST", 34, 34, 2, s24);
        D2 d237 = new D2("DOUBLE_LIST_PACKED", 35, 35, 3, s22);
        f6460x = d237;
        D2 d238 = new D2("FLOAT_LIST_PACKED", 36, 36, 3, s23);
        D2 d239 = new D2("INT64_LIST_PACKED", 37, 37, 3, s24);
        D2 d240 = new D2("UINT64_LIST_PACKED", 38, 38, 3, s24);
        D2 d241 = new D2("INT32_LIST_PACKED", 39, 39, 3, s25);
        D2 d242 = new D2("FIXED64_LIST_PACKED", 40, 40, 3, s24);
        D2 d243 = new D2("FIXED32_LIST_PACKED", 41, 41, 3, s25);
        D2 d244 = new D2("BOOL_LIST_PACKED", 42, 42, 3, s26);
        D2 d245 = new D2("UINT32_LIST_PACKED", 43, 43, 3, s25);
        D2 d246 = new D2("ENUM_LIST_PACKED", 44, 44, 3, s210);
        D2 d247 = new D2("SFIXED32_LIST_PACKED", 45, 45, 3, s25);
        D2 d248 = new D2("SFIXED64_LIST_PACKED", 46, 46, 3, s24);
        D2 d249 = new D2("SINT32_LIST_PACKED", 47, 47, 3, s25);
        D2 d250 = new D2("SINT64_LIST_PACKED", 48, 48, 3, s24);
        f6461y = d250;
        f6459A = new D2[]{d22, d23, d24, d25, d26, d27, d28, d29, d210, d211, d212, d213, d214, d215, d216, d217, d218, d219, d220, d221, d222, d223, d224, d225, d226, d227, d228, d229, d230, d231, d232, d233, d234, d235, d236, d237, d238, d239, d240, d241, d242, d243, d244, d245, d246, d247, d248, d249, d250, new D2("GROUP_LIST", 49, 49, 2, s28), new D2("MAP", 50, 50, 4, S2.f6688w)};
        D2[] d2ArrValues = values();
        f6462z = new D2[d2ArrValues.length];
        for (D2 d251 : d2ArrValues) {
            f6462z[d251.f6463w] = d251;
        }
    }

    public D2(String str, int i6, int i7, int i8, S2 s22) {
        this.f6463w = i7;
        int iB = u.h.b(i8);
        if (iB == 1 || iB == 3) {
            s22.getClass();
        }
        if (i8 == 1) {
            int i9 = E2.f6468a[s22.ordinal()];
        }
    }

    public static D2[] values() {
        return (D2[]) f6459A.clone();
    }

    public final int a() {
        return this.f6463w;
    }
}
