package androidx.datastore.preferences.protobuf;

import d.AbstractC0628i;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import sun.misc.Unsafe;

/* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.a0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0265a0 implements InterfaceC0283j0 {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final int[] f5417o = new int[0];

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final Unsafe f5418p = C0.m();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int[] f5419a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object[] f5420b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f5421c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f5422d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final AbstractC0266b f5423e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f5424f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f5425g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int[] f5426h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int f5427i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final int f5428j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final C0269c0 f5429k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final N f5430l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final u0 f5431m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final V f5432n;

    public C0265a0(int[] iArr, Object[] objArr, int i6, int i7, AbstractC0266b abstractC0266b, boolean z5, int[] iArr2, int i8, int i9, C0269c0 c0269c0, N n5, u0 u0Var, C0295u c0295u, V v5) {
        this.f5419a = iArr;
        this.f5420b = objArr;
        this.f5421c = i6;
        this.f5422d = i7;
        this.f5424f = abstractC0266b instanceof C;
        this.f5425g = z5;
        this.f5426h = iArr2;
        this.f5427i = i8;
        this.f5428j = i9;
        this.f5429k = c0269c0;
        this.f5430l = n5;
        this.f5431m = u0Var;
        this.f5423e = abstractC0266b;
        this.f5432n = v5;
    }

    public static C0265a0 A(C0281i0 c0281i0, C0269c0 c0269c0, N n5, u0 u0Var, C0295u c0295u, V v5) {
        int i6;
        int iCharAt;
        int iCharAt2;
        int iCharAt3;
        int i7;
        int i8;
        int i9;
        int[] iArr;
        int i10;
        char cCharAt;
        int i11;
        char cCharAt2;
        int i12;
        char cCharAt3;
        int i13;
        char cCharAt4;
        int i14;
        char cCharAt5;
        int i15;
        char cCharAt6;
        int i16;
        char cCharAt7;
        int i17;
        char cCharAt8;
        int i18;
        int i19;
        int i20;
        int i21;
        int i22;
        int iObjectFieldOffset;
        int i23;
        int i24;
        int iObjectFieldOffset2;
        Field fieldJ;
        char cCharAt9;
        int i25;
        int i26;
        int i27;
        Field fieldJ2;
        Field fieldJ3;
        int i28;
        char cCharAt10;
        int i29;
        char cCharAt11;
        int i30;
        char cCharAt12;
        int i31;
        char cCharAt13;
        int i32 = 0;
        boolean z5 = c0281i0.d() == 2;
        String strC = c0281i0.c();
        int length = strC.length();
        char c6 = 55296;
        if (strC.charAt(0) >= 55296) {
            int i33 = 1;
            while (true) {
                i6 = i33 + 1;
                if (strC.charAt(i33) < 55296) {
                    break;
                }
                i33 = i6;
            }
        } else {
            i6 = 1;
        }
        int i34 = i6 + 1;
        int iCharAt4 = strC.charAt(i6);
        if (iCharAt4 >= 55296) {
            int i35 = iCharAt4 & 8191;
            int i36 = 13;
            while (true) {
                i31 = i34 + 1;
                cCharAt13 = strC.charAt(i34);
                if (cCharAt13 < 55296) {
                    break;
                }
                i35 |= (cCharAt13 & 8191) << i36;
                i36 += 13;
                i34 = i31;
            }
            iCharAt4 = i35 | (cCharAt13 << i36);
            i34 = i31;
        }
        if (iCharAt4 == 0) {
            i9 = 0;
            iCharAt = 0;
            iCharAt2 = 0;
            i7 = 0;
            iCharAt3 = 0;
            iArr = f5417o;
            i8 = 0;
        } else {
            int i37 = i34 + 1;
            int iCharAt5 = strC.charAt(i34);
            if (iCharAt5 >= 55296) {
                int i38 = iCharAt5 & 8191;
                int i39 = 13;
                while (true) {
                    i17 = i37 + 1;
                    cCharAt8 = strC.charAt(i37);
                    if (cCharAt8 < 55296) {
                        break;
                    }
                    i38 |= (cCharAt8 & 8191) << i39;
                    i39 += 13;
                    i37 = i17;
                }
                iCharAt5 = i38 | (cCharAt8 << i39);
                i37 = i17;
            }
            int i40 = i37 + 1;
            int iCharAt6 = strC.charAt(i37);
            if (iCharAt6 >= 55296) {
                int i41 = iCharAt6 & 8191;
                int i42 = 13;
                while (true) {
                    i16 = i40 + 1;
                    cCharAt7 = strC.charAt(i40);
                    if (cCharAt7 < 55296) {
                        break;
                    }
                    i41 |= (cCharAt7 & 8191) << i42;
                    i42 += 13;
                    i40 = i16;
                }
                iCharAt6 = i41 | (cCharAt7 << i42);
                i40 = i16;
            }
            int i43 = i40 + 1;
            int iCharAt7 = strC.charAt(i40);
            if (iCharAt7 >= 55296) {
                int i44 = iCharAt7 & 8191;
                int i45 = 13;
                while (true) {
                    i15 = i43 + 1;
                    cCharAt6 = strC.charAt(i43);
                    if (cCharAt6 < 55296) {
                        break;
                    }
                    i44 |= (cCharAt6 & 8191) << i45;
                    i45 += 13;
                    i43 = i15;
                }
                iCharAt7 = i44 | (cCharAt6 << i45);
                i43 = i15;
            }
            int i46 = i43 + 1;
            iCharAt = strC.charAt(i43);
            if (iCharAt >= 55296) {
                int i47 = iCharAt & 8191;
                int i48 = 13;
                while (true) {
                    i14 = i46 + 1;
                    cCharAt5 = strC.charAt(i46);
                    if (cCharAt5 < 55296) {
                        break;
                    }
                    i47 |= (cCharAt5 & 8191) << i48;
                    i48 += 13;
                    i46 = i14;
                }
                iCharAt = i47 | (cCharAt5 << i48);
                i46 = i14;
            }
            int i49 = i46 + 1;
            int iCharAt8 = strC.charAt(i46);
            if (iCharAt8 >= 55296) {
                int i50 = iCharAt8 & 8191;
                int i51 = 13;
                while (true) {
                    i13 = i49 + 1;
                    cCharAt4 = strC.charAt(i49);
                    if (cCharAt4 < 55296) {
                        break;
                    }
                    i50 |= (cCharAt4 & 8191) << i51;
                    i51 += 13;
                    i49 = i13;
                }
                iCharAt8 = i50 | (cCharAt4 << i51);
                i49 = i13;
            }
            int i52 = i49 + 1;
            iCharAt2 = strC.charAt(i49);
            if (iCharAt2 >= 55296) {
                int i53 = iCharAt2 & 8191;
                int i54 = 13;
                while (true) {
                    i12 = i52 + 1;
                    cCharAt3 = strC.charAt(i52);
                    if (cCharAt3 < 55296) {
                        break;
                    }
                    i53 |= (cCharAt3 & 8191) << i54;
                    i54 += 13;
                    i52 = i12;
                }
                iCharAt2 = i53 | (cCharAt3 << i54);
                i52 = i12;
            }
            int i55 = i52 + 1;
            int iCharAt9 = strC.charAt(i52);
            if (iCharAt9 >= 55296) {
                int i56 = iCharAt9 & 8191;
                int i57 = 13;
                while (true) {
                    i11 = i55 + 1;
                    cCharAt2 = strC.charAt(i55);
                    if (cCharAt2 < 55296) {
                        break;
                    }
                    i56 |= (cCharAt2 & 8191) << i57;
                    i57 += 13;
                    i55 = i11;
                }
                iCharAt9 = i56 | (cCharAt2 << i57);
                i55 = i11;
            }
            int i58 = i55 + 1;
            iCharAt3 = strC.charAt(i55);
            if (iCharAt3 >= 55296) {
                int i59 = iCharAt3 & 8191;
                int i60 = i58;
                int i61 = 13;
                while (true) {
                    i10 = i60 + 1;
                    cCharAt = strC.charAt(i60);
                    if (cCharAt < 55296) {
                        break;
                    }
                    i59 |= (cCharAt & 8191) << i61;
                    i61 += 13;
                    i60 = i10;
                }
                iCharAt3 = i59 | (cCharAt << i61);
                i58 = i10;
            }
            int[] iArr2 = new int[iCharAt3 + iCharAt2 + iCharAt9];
            i7 = (iCharAt5 * 2) + iCharAt6;
            i8 = iCharAt7;
            i9 = iCharAt8;
            iArr = iArr2;
            i32 = iCharAt5;
            i34 = i58;
        }
        Object[] objArrB = c0281i0.b();
        Class<?> cls = c0281i0.a().getClass();
        int[] iArr3 = new int[i9 * 3];
        Object[] objArr = new Object[i9 * 2];
        int i62 = iCharAt2 + iCharAt3;
        int i63 = i62;
        int i64 = iCharAt3;
        int i65 = 0;
        int i66 = 0;
        while (i34 < length) {
            int i67 = i34 + 1;
            int iCharAt10 = strC.charAt(i34);
            if (iCharAt10 >= c6) {
                int i68 = iCharAt10 & 8191;
                int i69 = i67;
                int i70 = 13;
                while (true) {
                    i30 = i69 + 1;
                    cCharAt12 = strC.charAt(i69);
                    if (cCharAt12 < c6) {
                        break;
                    }
                    i68 |= (cCharAt12 & 8191) << i70;
                    i70 += 13;
                    i69 = i30;
                }
                iCharAt10 = i68 | (cCharAt12 << i70);
                i18 = i30;
            } else {
                i18 = i67;
            }
            int i71 = i18 + 1;
            int iCharAt11 = strC.charAt(i18);
            if (iCharAt11 >= c6) {
                int i72 = iCharAt11 & 8191;
                int i73 = i71;
                int i74 = 13;
                while (true) {
                    i29 = i73 + 1;
                    cCharAt11 = strC.charAt(i73);
                    i19 = length;
                    if (cCharAt11 < 55296) {
                        break;
                    }
                    i72 |= (cCharAt11 & 8191) << i74;
                    i74 += 13;
                    i73 = i29;
                    length = i19;
                }
                iCharAt11 = i72 | (cCharAt11 << i74);
                i20 = i29;
            } else {
                i19 = length;
                i20 = i71;
            }
            int i75 = iCharAt11 & 255;
            int i76 = i62;
            if ((iCharAt11 & 1024) != 0) {
                iArr[i65] = i66;
                i65++;
            }
            Unsafe unsafe = f5418p;
            int i77 = iCharAt3;
            if (i75 >= 51) {
                int i78 = i20 + 1;
                int iCharAt12 = strC.charAt(i20);
                if (iCharAt12 >= 55296) {
                    int i79 = iCharAt12 & 8191;
                    int i80 = i78;
                    int i81 = 13;
                    while (true) {
                        i28 = i80 + 1;
                        cCharAt10 = strC.charAt(i80);
                        i21 = iCharAt;
                        if (cCharAt10 < 55296) {
                            break;
                        }
                        i79 |= (cCharAt10 & 8191) << i81;
                        i81 += 13;
                        i80 = i28;
                        iCharAt = i21;
                    }
                    iCharAt12 = i79 | (cCharAt10 << i81);
                    i26 = i28;
                } else {
                    i21 = iCharAt;
                    i26 = i78;
                }
                int i82 = i75 - 51;
                int i83 = i26;
                if (i82 == 9 || i82 == 17) {
                    i27 = 2;
                    objArr[((i66 / 3) * 2) + 1] = objArrB[i7];
                    i7++;
                } else {
                    if (i82 == 12 && !z5) {
                        objArr[((i66 / 3) * 2) + 1] = objArrB[i7];
                        i7++;
                    }
                    i27 = 2;
                }
                int i84 = iCharAt12 * i27;
                Object obj = objArrB[i84];
                if (obj instanceof Field) {
                    fieldJ2 = (Field) obj;
                } else {
                    fieldJ2 = J(cls, (String) obj);
                    objArrB[i84] = fieldJ2;
                }
                int i85 = i7;
                iObjectFieldOffset2 = (int) unsafe.objectFieldOffset(fieldJ2);
                int i86 = i84 + 1;
                Object obj2 = objArrB[i86];
                if (obj2 instanceof Field) {
                    fieldJ3 = (Field) obj2;
                } else {
                    fieldJ3 = J(cls, (String) obj2);
                    objArrB[i86] = fieldJ3;
                }
                iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldJ3);
                i7 = i85;
                i24 = 0;
                i23 = i83;
                i22 = i8;
            } else {
                i21 = iCharAt;
                int i87 = i7 + 1;
                Field fieldJ4 = J(cls, (String) objArrB[i7]);
                i22 = i8;
                if (i75 == 9 || i75 == 17) {
                    objArr[((i66 / 3) * 2) + 1] = fieldJ4.getType();
                } else {
                    if (i75 == 27 || i75 == 49) {
                        i25 = i7 + 2;
                        objArr[((i66 / 3) * 2) + 1] = objArrB[i87];
                    } else if (i75 == 12 || i75 == 30 || i75 == 44) {
                        if (!z5) {
                            i25 = i7 + 2;
                            objArr[((i66 / 3) * 2) + 1] = objArrB[i87];
                        }
                    } else if (i75 == 50) {
                        int i88 = i64 + 1;
                        iArr[i64] = i66;
                        int i89 = (i66 / 3) * 2;
                        int i90 = i7 + 2;
                        objArr[i89] = objArrB[i87];
                        if ((iCharAt11 & 2048) != 0) {
                            i87 = i7 + 3;
                            objArr[i89 + 1] = objArrB[i90];
                            i64 = i88;
                        } else {
                            i64 = i88;
                            i87 = i90;
                        }
                    }
                    i87 = i25;
                }
                int iObjectFieldOffset3 = (int) unsafe.objectFieldOffset(fieldJ4);
                if ((iCharAt11 & 4096) != 4096 || i75 > 17) {
                    iObjectFieldOffset = 1048575;
                    i23 = i20;
                    i24 = 0;
                } else {
                    int i91 = i20 + 1;
                    int iCharAt13 = strC.charAt(i20);
                    if (iCharAt13 >= 55296) {
                        int i92 = iCharAt13 & 8191;
                        int i93 = 13;
                        while (true) {
                            i23 = i91 + 1;
                            cCharAt9 = strC.charAt(i91);
                            if (cCharAt9 < 55296) {
                                break;
                            }
                            i92 |= (cCharAt9 & 8191) << i93;
                            i93 += 13;
                            i91 = i23;
                        }
                        iCharAt13 = i92 | (cCharAt9 << i93);
                    } else {
                        i23 = i91;
                    }
                    int i94 = (iCharAt13 / 32) + (i32 * 2);
                    Object obj3 = objArrB[i94];
                    if (obj3 instanceof Field) {
                        fieldJ = (Field) obj3;
                    } else {
                        fieldJ = J(cls, (String) obj3);
                        objArrB[i94] = fieldJ;
                    }
                    iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldJ);
                    i24 = iCharAt13 % 32;
                }
                if (i75 >= 18 && i75 <= 49) {
                    iArr[i63] = iObjectFieldOffset3;
                    i63++;
                }
                i7 = i87;
                iObjectFieldOffset2 = iObjectFieldOffset3;
            }
            int i95 = i66 + 1;
            iArr3[i66] = iCharAt10;
            int i96 = i66 + 2;
            iArr3[i95] = ((iCharAt11 & 256) != 0 ? 268435456 : 0) | ((iCharAt11 & 512) != 0 ? 536870912 : 0) | (i75 << 20) | iObjectFieldOffset2;
            i66 += 3;
            iArr3[i96] = (i24 << 20) | iObjectFieldOffset;
            i62 = i76;
            i8 = i22;
            length = i19;
            i34 = i23;
            iCharAt3 = i77;
            iCharAt = i21;
            c6 = 55296;
        }
        return new C0265a0(iArr3, objArr, i8, iCharAt, c0281i0.a(), z5, iArr, iCharAt3, i62, c0269c0, n5, u0Var, c0295u, v5);
    }

    public static long B(int i6) {
        return i6 & 1048575;
    }

    public static int C(long j6, Object obj) {
        return ((Integer) C0.f5363c.i(j6, obj)).intValue();
    }

    public static long D(long j6, Object obj) {
        return ((Long) C0.f5363c.i(j6, obj)).longValue();
    }

    public static Field J(Class cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (NoSuchFieldException unused) {
            Field[] declaredFields = cls.getDeclaredFields();
            for (Field field : declaredFields) {
                if (str.equals(field.getName())) {
                    return field;
                }
            }
            StringBuilder sbN = AbstractC0628i.n("Field ", str, " for ");
            sbN.append(cls.getName());
            sbN.append(" not found. Known fields are ");
            sbN.append(Arrays.toString(declaredFields));
            throw new RuntimeException(sbN.toString());
        }
    }

    public static int O(int i6) {
        return (i6 & 267386880) >>> 20;
    }

    public static void S(int i6, Object obj, L3.c cVar) {
        if (!(obj instanceof String)) {
            cVar.n(i6, (AbstractC0280i) obj);
        } else {
            ((AbstractC0292q) cVar.f1734x).O(i6, (String) obj);
        }
    }

    public static boolean r(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj instanceof C) {
            return ((C) obj).j();
        }
        return true;
    }

    public static List t(long j6, Object obj) {
        return (List) C0.f5363c.i(j6, obj);
    }

    public static C0265a0 z(X x5, C0269c0 c0269c0, N n5, u0 u0Var, C0295u c0295u, V v5) {
        if (x5 instanceof C0281i0) {
            return A((C0281i0) x5, c0269c0, n5, u0Var, c0295u, v5);
        }
        AbstractC0628i.p(x5);
        throw null;
    }

    public final int E(int i6) {
        if (i6 < this.f5421c || i6 > this.f5422d) {
            return -1;
        }
        int[] iArr = this.f5419a;
        int length = (iArr.length / 3) - 1;
        int i7 = 0;
        while (i7 <= length) {
            int i8 = (length + i7) >>> 1;
            int i9 = i8 * 3;
            int i10 = iArr[i9];
            if (i6 == i10) {
                return i9;
            }
            if (i6 < i10) {
                length = i8 - 1;
            } else {
                i7 = i8 + 1;
            }
        }
        return -1;
    }

    public final void F(Object obj, long j6, C0289n c0289n, InterfaceC0283j0 interfaceC0283j0, C0294t c0294t) throws G {
        int iU;
        List listC = this.f5430l.c(j6, obj);
        int i6 = c0289n.f5490a;
        if ((i6 & 7) != 3) {
            throw H.b();
        }
        do {
            C cG = interfaceC0283j0.g();
            c0289n.e(cG, interfaceC0283j0, c0294t);
            interfaceC0283j0.h(cG);
            listC.add(cG);
            if (((AbstractC0288m) c0289n.f5493d).c() || c0289n.f5492c != 0) {
                return;
            } else {
                iU = ((AbstractC0288m) c0289n.f5493d).u();
            }
        } while (iU == i6);
        c0289n.f5492c = iU;
    }

    public final void G(Object obj, int i6, C0289n c0289n, InterfaceC0283j0 interfaceC0283j0, C0294t c0294t) throws H {
        int iU;
        List listC = this.f5430l.c(i6 & 1048575, obj);
        int i7 = c0289n.f5490a;
        if ((i7 & 7) != 2) {
            throw H.b();
        }
        do {
            C cG = interfaceC0283j0.g();
            c0289n.f(cG, interfaceC0283j0, c0294t);
            interfaceC0283j0.h(cG);
            listC.add(cG);
            if (((AbstractC0288m) c0289n.f5493d).c() || c0289n.f5492c != 0) {
                return;
            } else {
                iU = ((AbstractC0288m) c0289n.f5493d).u();
            }
        } while (iU == i7);
        c0289n.f5492c = iU;
    }

    public final void H(Object obj, int i6, C0289n c0289n) throws G {
        long j6;
        String strS;
        if ((536870912 & i6) != 0) {
            j6 = i6 & 1048575;
            c0289n.z(2);
            strS = ((AbstractC0288m) c0289n.f5493d).t();
        } else if (!this.f5424f) {
            C0.s(i6 & 1048575, obj, c0289n.h());
            return;
        } else {
            j6 = i6 & 1048575;
            c0289n.z(2);
            strS = ((AbstractC0288m) c0289n.f5493d).s();
        }
        C0.s(j6, obj, strS);
    }

    public final void I(Object obj, int i6, C0289n c0289n) throws G {
        boolean z5 = (536870912 & i6) != 0;
        N n5 = this.f5430l;
        if (z5) {
            c0289n.v(n5.c(i6 & 1048575, obj), true);
        } else {
            c0289n.v(n5.c(i6 & 1048575, obj), false);
        }
    }

    public final void K(int i6, Object obj) {
        int i7 = this.f5419a[i6 + 2];
        long j6 = 1048575 & i7;
        if (j6 == 1048575) {
            return;
        }
        C0.q((1 << (i7 >>> 20)) | C0.f5363c.g(j6, obj), j6, obj);
    }

    public final void L(int i6, int i7, Object obj) {
        C0.q(i6, this.f5419a[i7 + 2] & 1048575, obj);
    }

    public final void M(Object obj, int i6, AbstractC0266b abstractC0266b) {
        f5418p.putObject(obj, P(i6) & 1048575, abstractC0266b);
        K(i6, obj);
    }

    public final void N(int i6, int i7, Object obj, AbstractC0266b abstractC0266b) {
        f5418p.putObject(obj, P(i7) & 1048575, abstractC0266b);
        L(i6, i7, obj);
    }

    public final int P(int i6) {
        return this.f5419a[i6 + 1];
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public final void Q(Object obj, L3.c cVar) {
        int i6;
        boolean z5;
        int[] iArr = this.f5419a;
        int length = iArr.length;
        int i7 = 1048575;
        int i8 = 1048575;
        int i9 = 0;
        int i10 = 0;
        while (i9 < length) {
            int iP = P(i9);
            int i11 = iArr[i9];
            int iO = O(iP);
            Unsafe unsafe = f5418p;
            if (iO <= 17) {
                int i12 = iArr[i9 + 2];
                int i13 = i12 & i7;
                if (i13 != i8) {
                    i10 = unsafe.getInt(obj, i13);
                    i8 = i13;
                }
                i6 = 1 << (i12 >>> 20);
            } else {
                i6 = 0;
            }
            int i14 = i6;
            long j6 = iP & i7;
            switch (iO) {
                case com.bumptech.glide.d.f6312l /* 0 */:
                    if ((i10 & i14) != 0) {
                        cVar.o(i11, C0.f5363c.e(j6, obj));
                    }
                    break;
                case 1:
                    if ((i10 & i14) != 0) {
                        cVar.w(i11, C0.f5363c.f(j6, obj));
                    }
                    break;
                case Z.j.FLOAT_FIELD_NUMBER /* 2 */:
                    if ((i10 & i14) != 0) {
                        cVar.z(i11, unsafe.getLong(obj, j6));
                    }
                    break;
                case Z.j.INTEGER_FIELD_NUMBER /* 3 */:
                    if ((i10 & i14) != 0) {
                        cVar.G(i11, unsafe.getLong(obj, j6));
                    }
                    break;
                case Z.j.LONG_FIELD_NUMBER /* 4 */:
                    if ((i10 & i14) != 0) {
                        cVar.y(i11, unsafe.getInt(obj, j6));
                    }
                    break;
                case Z.j.STRING_FIELD_NUMBER /* 5 */:
                    if ((i10 & i14) != 0) {
                        cVar.v(i11, unsafe.getLong(obj, j6));
                    }
                    break;
                case Z.j.STRING_SET_FIELD_NUMBER /* 6 */:
                    if ((i10 & i14) != 0) {
                        cVar.u(i11, unsafe.getInt(obj, j6));
                    }
                    break;
                case Z.j.DOUBLE_FIELD_NUMBER /* 7 */:
                    if ((i10 & i14) != 0) {
                        cVar.m(i11, C0.f5363c.c(j6, obj));
                    }
                    break;
                case Z.j.BYTES_FIELD_NUMBER /* 8 */:
                    if ((i10 & i14) != 0) {
                        S(i11, unsafe.getObject(obj, j6), cVar);
                    }
                    break;
                case 9:
                    if ((i10 & i14) != 0) {
                        cVar.A(i11, n(i9), unsafe.getObject(obj, j6));
                    }
                    break;
                case 10:
                    if ((i10 & i14) != 0) {
                        cVar.n(i11, (AbstractC0280i) unsafe.getObject(obj, j6));
                    }
                    break;
                case 11:
                    if ((i10 & i14) != 0) {
                        cVar.F(i11, unsafe.getInt(obj, j6));
                    }
                    break;
                case 12:
                    if ((i10 & i14) != 0) {
                        cVar.p(i11, unsafe.getInt(obj, j6));
                    }
                    break;
                case 13:
                    if ((i10 & i14) != 0) {
                        cVar.B(i11, unsafe.getInt(obj, j6));
                    }
                    break;
                case 14:
                    if ((i10 & i14) != 0) {
                        cVar.C(i11, unsafe.getLong(obj, j6));
                    }
                    break;
                case 15:
                    if ((i10 & i14) != 0) {
                        cVar.D(i11, unsafe.getInt(obj, j6));
                    }
                    break;
                case 16:
                    if ((i10 & i14) != 0) {
                        cVar.E(i11, unsafe.getLong(obj, j6));
                    }
                    break;
                case 17:
                    if ((i10 & i14) != 0) {
                        cVar.x(i11, n(i9), unsafe.getObject(obj, j6));
                    }
                    break;
                case 18:
                    AbstractC0285k0.F(iArr[i9], (List) unsafe.getObject(obj, j6), cVar, false);
                    break;
                case 19:
                    AbstractC0285k0.J(iArr[i9], (List) unsafe.getObject(obj, j6), cVar, false);
                    break;
                case 20:
                    AbstractC0285k0.M(iArr[i9], (List) unsafe.getObject(obj, j6), cVar, false);
                    break;
                case 21:
                    AbstractC0285k0.U(iArr[i9], (List) unsafe.getObject(obj, j6), cVar, false);
                    break;
                case 22:
                    AbstractC0285k0.L(iArr[i9], (List) unsafe.getObject(obj, j6), cVar, false);
                    break;
                case 23:
                    AbstractC0285k0.I(iArr[i9], (List) unsafe.getObject(obj, j6), cVar, false);
                    break;
                case 24:
                    AbstractC0285k0.H(iArr[i9], (List) unsafe.getObject(obj, j6), cVar, false);
                    break;
                case 25:
                    AbstractC0285k0.D(iArr[i9], (List) unsafe.getObject(obj, j6), cVar, false);
                    break;
                case 26:
                    AbstractC0285k0.S(iArr[i9], (List) unsafe.getObject(obj, j6), cVar);
                    break;
                case 27:
                    AbstractC0285k0.N(iArr[i9], (List) unsafe.getObject(obj, j6), cVar, n(i9));
                    break;
                case 28:
                    AbstractC0285k0.E(iArr[i9], (List) unsafe.getObject(obj, j6), cVar);
                    break;
                case 29:
                    z5 = false;
                    AbstractC0285k0.T(iArr[i9], (List) unsafe.getObject(obj, j6), cVar, false);
                    break;
                case 30:
                    z5 = false;
                    AbstractC0285k0.G(iArr[i9], (List) unsafe.getObject(obj, j6), cVar, false);
                    break;
                case 31:
                    z5 = false;
                    AbstractC0285k0.O(iArr[i9], (List) unsafe.getObject(obj, j6), cVar, false);
                    break;
                case 32:
                    z5 = false;
                    AbstractC0285k0.P(iArr[i9], (List) unsafe.getObject(obj, j6), cVar, false);
                    break;
                case 33:
                    z5 = false;
                    AbstractC0285k0.Q(iArr[i9], (List) unsafe.getObject(obj, j6), cVar, false);
                    break;
                case 34:
                    z5 = false;
                    AbstractC0285k0.R(iArr[i9], (List) unsafe.getObject(obj, j6), cVar, false);
                    break;
                case 35:
                    AbstractC0285k0.F(iArr[i9], (List) unsafe.getObject(obj, j6), cVar, true);
                    break;
                case 36:
                    AbstractC0285k0.J(iArr[i9], (List) unsafe.getObject(obj, j6), cVar, true);
                    break;
                case 37:
                    AbstractC0285k0.M(iArr[i9], (List) unsafe.getObject(obj, j6), cVar, true);
                    break;
                case 38:
                    AbstractC0285k0.U(iArr[i9], (List) unsafe.getObject(obj, j6), cVar, true);
                    break;
                case 39:
                    AbstractC0285k0.L(iArr[i9], (List) unsafe.getObject(obj, j6), cVar, true);
                    break;
                case 40:
                    AbstractC0285k0.I(iArr[i9], (List) unsafe.getObject(obj, j6), cVar, true);
                    break;
                case 41:
                    AbstractC0285k0.H(iArr[i9], (List) unsafe.getObject(obj, j6), cVar, true);
                    break;
                case 42:
                    AbstractC0285k0.D(iArr[i9], (List) unsafe.getObject(obj, j6), cVar, true);
                    break;
                case 43:
                    AbstractC0285k0.T(iArr[i9], (List) unsafe.getObject(obj, j6), cVar, true);
                    break;
                case 44:
                    AbstractC0285k0.G(iArr[i9], (List) unsafe.getObject(obj, j6), cVar, true);
                    break;
                case 45:
                    AbstractC0285k0.O(iArr[i9], (List) unsafe.getObject(obj, j6), cVar, true);
                    break;
                case 46:
                    AbstractC0285k0.P(iArr[i9], (List) unsafe.getObject(obj, j6), cVar, true);
                    break;
                case 47:
                    AbstractC0285k0.Q(iArr[i9], (List) unsafe.getObject(obj, j6), cVar, true);
                    break;
                case 48:
                    AbstractC0285k0.R(iArr[i9], (List) unsafe.getObject(obj, j6), cVar, true);
                    break;
                case 49:
                    AbstractC0285k0.K(iArr[i9], (List) unsafe.getObject(obj, j6), cVar, n(i9));
                    break;
                case 50:
                    R(cVar, i11, unsafe.getObject(obj, j6), i9);
                    break;
                case 51:
                    if (s(i11, i9, obj)) {
                        cVar.o(i11, ((Double) C0.f5363c.i(j6, obj)).doubleValue());
                    }
                    break;
                case 52:
                    if (s(i11, i9, obj)) {
                        cVar.w(i11, ((Float) C0.f5363c.i(j6, obj)).floatValue());
                    }
                    break;
                case 53:
                    if (s(i11, i9, obj)) {
                        cVar.z(i11, D(j6, obj));
                    }
                    break;
                case 54:
                    if (s(i11, i9, obj)) {
                        cVar.G(i11, D(j6, obj));
                    }
                    break;
                case 55:
                    if (s(i11, i9, obj)) {
                        cVar.y(i11, C(j6, obj));
                    }
                    break;
                case 56:
                    if (s(i11, i9, obj)) {
                        cVar.v(i11, D(j6, obj));
                    }
                    break;
                case 57:
                    if (s(i11, i9, obj)) {
                        cVar.u(i11, C(j6, obj));
                    }
                    break;
                case 58:
                    if (s(i11, i9, obj)) {
                        cVar.m(i11, ((Boolean) C0.f5363c.i(j6, obj)).booleanValue());
                    }
                    break;
                case 59:
                    if (s(i11, i9, obj)) {
                        S(i11, unsafe.getObject(obj, j6), cVar);
                    }
                    break;
                case 60:
                    if (s(i11, i9, obj)) {
                        cVar.A(i11, n(i9), unsafe.getObject(obj, j6));
                    }
                    break;
                case 61:
                    if (s(i11, i9, obj)) {
                        cVar.n(i11, (AbstractC0280i) unsafe.getObject(obj, j6));
                    }
                    break;
                case 62:
                    if (s(i11, i9, obj)) {
                        cVar.F(i11, C(j6, obj));
                    }
                    break;
                case 63:
                    if (s(i11, i9, obj)) {
                        cVar.p(i11, C(j6, obj));
                    }
                    break;
                case 64:
                    if (s(i11, i9, obj)) {
                        cVar.B(i11, C(j6, obj));
                    }
                    break;
                case 65:
                    if (s(i11, i9, obj)) {
                        cVar.C(i11, D(j6, obj));
                    }
                    break;
                case 66:
                    if (s(i11, i9, obj)) {
                        cVar.D(i11, C(j6, obj));
                    }
                    break;
                case 67:
                    if (s(i11, i9, obj)) {
                        cVar.E(i11, D(j6, obj));
                    }
                    break;
                case 68:
                    if (s(i11, i9, obj)) {
                        cVar.x(i11, n(i9), unsafe.getObject(obj, j6));
                    }
                    break;
            }
            i9 += 3;
            i7 = 1048575;
        }
        this.f5431m.getClass();
        ((C) obj).unknownFields.d(cVar);
    }

    public final void R(L3.c cVar, int i6, Object obj, int i7) {
        if (obj != null) {
            Object objM = m(i7);
            this.f5432n.getClass();
            J3.w wVar = ((T) objM).f5409a;
            ((AbstractC0292q) cVar.f1734x).getClass();
            for (Map.Entry entry : ((U) obj).entrySet()) {
                ((AbstractC0292q) cVar.f1734x).Q(i6, 2);
                ((AbstractC0292q) cVar.f1734x).S(T.a(wVar, entry.getKey(), entry.getValue()));
                T.b((AbstractC0292q) cVar.f1734x, wVar, entry.getKey(), entry.getValue());
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:55:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0106  */
    @Override // androidx.datastore.preferences.protobuf.InterfaceC0283j0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean a(java.lang.Object r14) {
        /*
            Method dump skipped, instruction units count: 287
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.preferences.protobuf.C0265a0.a(java.lang.Object):boolean");
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC0283j0
    public final void b(Object obj, C0289n c0289n, C0294t c0294t) {
        int iO;
        N n5;
        AbstractC0266b abstractC0266b;
        List listC;
        List listC2;
        List listC3;
        List listC4;
        List listC5;
        List listC6;
        List listC7;
        List listC8;
        List listC9;
        List listC10;
        List listC11;
        List listC12;
        List listC13;
        List listC14;
        AbstractC0266b abstractC0266b2;
        c0294t.getClass();
        if (!r(obj)) {
            throw new IllegalArgumentException("Mutating immutable message: " + obj);
        }
        u0 u0Var = this.f5431m;
        int[] iArr = this.f5426h;
        int i6 = this.f5428j;
        int i7 = this.f5427i;
        t0 t0VarA = null;
        while (true) {
            try {
                int iC = c0289n.c();
                int iE = E(iC);
                if (iE >= 0) {
                    int iP = P(iE);
                    try {
                        iO = O(iP);
                        n5 = this.f5430l;
                    } catch (G unused) {
                        u0Var.getClass();
                        if (t0VarA == null) {
                            t0VarA = u0.a(obj);
                        }
                        if (!u0.c(t0VarA, c0289n)) {
                            while (i7 < i6) {
                                k(obj, iArr[i7], t0VarA);
                                i7++;
                            }
                            if (t0VarA == null) {
                                return;
                            }
                            ((C) obj).unknownFields = t0VarA;
                            return;
                        }
                    }
                    switch (iO) {
                        case com.bumptech.glide.d.f6312l /* 0 */:
                            long jB = B(iP);
                            c0289n.z(1);
                            C0.f5363c.m(obj, jB, ((AbstractC0288m) c0289n.f5493d).h());
                            K(iE, obj);
                            break;
                        case 1:
                            long jB2 = B(iP);
                            c0289n.z(5);
                            C0.f5363c.n(obj, jB2, ((AbstractC0288m) c0289n.f5493d).l());
                            K(iE, obj);
                            break;
                        case Z.j.FLOAT_FIELD_NUMBER /* 2 */:
                            long jB3 = B(iP);
                            c0289n.z(0);
                            C0.r(obj, jB3, ((AbstractC0288m) c0289n.f5493d).n());
                            K(iE, obj);
                            break;
                        case Z.j.INTEGER_FIELD_NUMBER /* 3 */:
                            long jB4 = B(iP);
                            c0289n.z(0);
                            C0.r(obj, jB4, ((AbstractC0288m) c0289n.f5493d).w());
                            K(iE, obj);
                            break;
                        case Z.j.LONG_FIELD_NUMBER /* 4 */:
                            long jB5 = B(iP);
                            c0289n.z(0);
                            C0.q(((AbstractC0288m) c0289n.f5493d).m(), jB5, obj);
                            K(iE, obj);
                            break;
                        case Z.j.STRING_FIELD_NUMBER /* 5 */:
                            long jB6 = B(iP);
                            c0289n.z(1);
                            C0.r(obj, jB6, ((AbstractC0288m) c0289n.f5493d).k());
                            K(iE, obj);
                            break;
                        case Z.j.STRING_SET_FIELD_NUMBER /* 6 */:
                            long jB7 = B(iP);
                            c0289n.z(5);
                            C0.q(((AbstractC0288m) c0289n.f5493d).j(), jB7, obj);
                            K(iE, obj);
                            break;
                        case Z.j.DOUBLE_FIELD_NUMBER /* 7 */:
                            long jB8 = B(iP);
                            c0289n.z(0);
                            C0.f5363c.k(obj, jB8, ((AbstractC0288m) c0289n.f5493d).f());
                            K(iE, obj);
                            break;
                        case Z.j.BYTES_FIELD_NUMBER /* 8 */:
                            H(obj, iP, c0289n);
                            K(iE, obj);
                            break;
                        case 9:
                            abstractC0266b = (AbstractC0266b) x(iE, obj);
                            InterfaceC0283j0 interfaceC0283j0N = n(iE);
                            c0289n.z(2);
                            c0289n.f(abstractC0266b, interfaceC0283j0N, c0294t);
                            M(obj, iE, abstractC0266b);
                            break;
                        case 10:
                            C0.s(B(iP), obj, c0289n.h());
                            K(iE, obj);
                            break;
                        case 11:
                            long jB9 = B(iP);
                            c0289n.z(0);
                            C0.q(((AbstractC0288m) c0289n.f5493d).v(), jB9, obj);
                            K(iE, obj);
                            break;
                        case 12:
                            c0289n.z(0);
                            int i8 = ((AbstractC0288m) c0289n.f5493d).i();
                            l(iE);
                            C0.q(i8, B(iP), obj);
                            K(iE, obj);
                            break;
                        case 13:
                            long jB10 = B(iP);
                            c0289n.z(5);
                            C0.q(((AbstractC0288m) c0289n.f5493d).o(), jB10, obj);
                            K(iE, obj);
                            break;
                        case 14:
                            long jB11 = B(iP);
                            c0289n.z(1);
                            C0.r(obj, jB11, ((AbstractC0288m) c0289n.f5493d).p());
                            K(iE, obj);
                            break;
                        case 15:
                            long jB12 = B(iP);
                            c0289n.z(0);
                            C0.q(((AbstractC0288m) c0289n.f5493d).q(), jB12, obj);
                            K(iE, obj);
                            break;
                        case 16:
                            long jB13 = B(iP);
                            c0289n.z(0);
                            C0.r(obj, jB13, ((AbstractC0288m) c0289n.f5493d).r());
                            K(iE, obj);
                            break;
                        case 17:
                            abstractC0266b = (AbstractC0266b) x(iE, obj);
                            InterfaceC0283j0 interfaceC0283j0N2 = n(iE);
                            c0289n.z(3);
                            c0289n.e(abstractC0266b, interfaceC0283j0N2, c0294t);
                            M(obj, iE, abstractC0266b);
                            break;
                        case 18:
                            listC = n5.c(B(iP), obj);
                            c0289n.j(listC);
                            break;
                        case 19:
                            listC2 = n5.c(B(iP), obj);
                            c0289n.o(listC2);
                            break;
                        case 20:
                            listC3 = n5.c(B(iP), obj);
                            c0289n.q(listC3);
                            break;
                        case 21:
                            listC4 = n5.c(B(iP), obj);
                            c0289n.x(listC4);
                            break;
                        case 22:
                            listC5 = n5.c(B(iP), obj);
                            c0289n.p(listC5);
                            break;
                        case 23:
                            listC6 = n5.c(B(iP), obj);
                            c0289n.n(listC6);
                            break;
                        case 24:
                            listC7 = n5.c(B(iP), obj);
                            c0289n.m(listC7);
                            break;
                        case 25:
                            listC8 = n5.c(B(iP), obj);
                            c0289n.g(listC8);
                            break;
                        case 26:
                            I(obj, iP, c0289n);
                            break;
                        case 27:
                            G(obj, iP, c0289n, n(iE), c0294t);
                            break;
                        case 28:
                            c0289n.i(n5.c(B(iP), obj));
                            break;
                        case 29:
                            listC9 = n5.c(B(iP), obj);
                            c0289n.w(listC9);
                            break;
                        case 30:
                            listC10 = n5.c(B(iP), obj);
                            c0289n.k(listC10);
                            l(iE);
                            AbstractC0285k0.z(obj, iC, listC10, t0VarA, u0Var);
                            break;
                        case 31:
                            listC11 = n5.c(B(iP), obj);
                            c0289n.r(listC11);
                            break;
                        case 32:
                            listC12 = n5.c(B(iP), obj);
                            c0289n.s(listC12);
                            break;
                        case 33:
                            listC13 = n5.c(B(iP), obj);
                            c0289n.t(listC13);
                            break;
                        case 34:
                            listC14 = n5.c(B(iP), obj);
                            c0289n.u(listC14);
                            break;
                        case 35:
                            listC = n5.c(B(iP), obj);
                            c0289n.j(listC);
                            break;
                        case 36:
                            listC2 = n5.c(B(iP), obj);
                            c0289n.o(listC2);
                            break;
                        case 37:
                            listC3 = n5.c(B(iP), obj);
                            c0289n.q(listC3);
                            break;
                        case 38:
                            listC4 = n5.c(B(iP), obj);
                            c0289n.x(listC4);
                            break;
                        case 39:
                            listC5 = n5.c(B(iP), obj);
                            c0289n.p(listC5);
                            break;
                        case 40:
                            listC6 = n5.c(B(iP), obj);
                            c0289n.n(listC6);
                            break;
                        case 41:
                            listC7 = n5.c(B(iP), obj);
                            c0289n.m(listC7);
                            break;
                        case 42:
                            listC8 = n5.c(B(iP), obj);
                            c0289n.g(listC8);
                            break;
                        case 43:
                            listC9 = n5.c(B(iP), obj);
                            c0289n.w(listC9);
                            break;
                        case 44:
                            listC10 = n5.c(B(iP), obj);
                            c0289n.k(listC10);
                            l(iE);
                            AbstractC0285k0.z(obj, iC, listC10, t0VarA, u0Var);
                            break;
                        case 45:
                            listC11 = n5.c(B(iP), obj);
                            c0289n.r(listC11);
                            break;
                        case 46:
                            listC12 = n5.c(B(iP), obj);
                            c0289n.s(listC12);
                            break;
                        case 47:
                            listC13 = n5.c(B(iP), obj);
                            c0289n.t(listC13);
                            break;
                        case 48:
                            listC14 = n5.c(B(iP), obj);
                            c0289n.u(listC14);
                            break;
                        case 49:
                            F(obj, B(iP), c0289n, n(iE), c0294t);
                            break;
                        case 50:
                            u(obj, iE, m(iE), c0294t, c0289n);
                            break;
                        case 51:
                            long jB14 = B(iP);
                            c0289n.z(1);
                            C0.s(jB14, obj, Double.valueOf(((AbstractC0288m) c0289n.f5493d).h()));
                            L(iC, iE, obj);
                            break;
                        case 52:
                            long jB15 = B(iP);
                            c0289n.z(5);
                            C0.s(jB15, obj, Float.valueOf(((AbstractC0288m) c0289n.f5493d).l()));
                            L(iC, iE, obj);
                            break;
                        case 53:
                            long jB16 = B(iP);
                            c0289n.z(0);
                            C0.s(jB16, obj, Long.valueOf(((AbstractC0288m) c0289n.f5493d).n()));
                            L(iC, iE, obj);
                            break;
                        case 54:
                            long jB17 = B(iP);
                            c0289n.z(0);
                            C0.s(jB17, obj, Long.valueOf(((AbstractC0288m) c0289n.f5493d).w()));
                            L(iC, iE, obj);
                            break;
                        case 55:
                            long jB18 = B(iP);
                            c0289n.z(0);
                            C0.s(jB18, obj, Integer.valueOf(((AbstractC0288m) c0289n.f5493d).m()));
                            L(iC, iE, obj);
                            break;
                        case 56:
                            long jB19 = B(iP);
                            c0289n.z(1);
                            C0.s(jB19, obj, Long.valueOf(((AbstractC0288m) c0289n.f5493d).k()));
                            L(iC, iE, obj);
                            break;
                        case 57:
                            long jB20 = B(iP);
                            c0289n.z(5);
                            C0.s(jB20, obj, Integer.valueOf(((AbstractC0288m) c0289n.f5493d).j()));
                            L(iC, iE, obj);
                            break;
                        case 58:
                            long jB21 = B(iP);
                            c0289n.z(0);
                            C0.s(jB21, obj, Boolean.valueOf(((AbstractC0288m) c0289n.f5493d).f()));
                            L(iC, iE, obj);
                            break;
                        case 59:
                            H(obj, iP, c0289n);
                            L(iC, iE, obj);
                            break;
                        case 60:
                            abstractC0266b2 = (AbstractC0266b) y(iC, iE, obj);
                            InterfaceC0283j0 interfaceC0283j0N3 = n(iE);
                            c0289n.z(2);
                            c0289n.f(abstractC0266b2, interfaceC0283j0N3, c0294t);
                            N(iC, iE, obj, abstractC0266b2);
                            break;
                        case 61:
                            C0.s(B(iP), obj, c0289n.h());
                            L(iC, iE, obj);
                            break;
                        case 62:
                            long jB22 = B(iP);
                            c0289n.z(0);
                            C0.s(jB22, obj, Integer.valueOf(((AbstractC0288m) c0289n.f5493d).v()));
                            L(iC, iE, obj);
                            break;
                        case 63:
                            c0289n.z(0);
                            int i9 = ((AbstractC0288m) c0289n.f5493d).i();
                            l(iE);
                            C0.s(B(iP), obj, Integer.valueOf(i9));
                            L(iC, iE, obj);
                            break;
                        case 64:
                            long jB23 = B(iP);
                            c0289n.z(5);
                            C0.s(jB23, obj, Integer.valueOf(((AbstractC0288m) c0289n.f5493d).o()));
                            L(iC, iE, obj);
                            break;
                        case 65:
                            long jB24 = B(iP);
                            c0289n.z(1);
                            C0.s(jB24, obj, Long.valueOf(((AbstractC0288m) c0289n.f5493d).p()));
                            L(iC, iE, obj);
                            break;
                        case 66:
                            long jB25 = B(iP);
                            c0289n.z(0);
                            C0.s(jB25, obj, Integer.valueOf(((AbstractC0288m) c0289n.f5493d).q()));
                            L(iC, iE, obj);
                            break;
                        case 67:
                            long jB26 = B(iP);
                            c0289n.z(0);
                            C0.s(jB26, obj, Long.valueOf(((AbstractC0288m) c0289n.f5493d).r()));
                            L(iC, iE, obj);
                            break;
                        case 68:
                            abstractC0266b2 = (AbstractC0266b) y(iC, iE, obj);
                            InterfaceC0283j0 interfaceC0283j0N4 = n(iE);
                            c0289n.z(3);
                            c0289n.e(abstractC0266b2, interfaceC0283j0N4, c0294t);
                            N(iC, iE, obj, abstractC0266b2);
                            break;
                        default:
                            if (t0VarA == null) {
                                u0Var.getClass();
                                t0VarA = u0.a(obj);
                            }
                            u0Var.getClass();
                            if (!u0.c(t0VarA, c0289n)) {
                                while (i7 < i6) {
                                    k(obj, iArr[i7], t0VarA);
                                    i7++;
                                }
                                if (t0VarA == null) {
                                    return;
                                }
                            }
                            break;
                    }
                } else if (iC == Integer.MAX_VALUE) {
                    while (i7 < i6) {
                        k(obj, iArr[i7], t0VarA);
                        i7++;
                    }
                    if (t0VarA == null) {
                        return;
                    } else {
                        u0Var.getClass();
                    }
                } else {
                    u0Var.getClass();
                    if (t0VarA == null) {
                        t0VarA = u0.a(obj);
                    }
                    if (!u0.c(t0VarA, c0289n)) {
                        while (i7 < i6) {
                            k(obj, iArr[i7], t0VarA);
                            i7++;
                        }
                        if (t0VarA == null) {
                            return;
                        }
                    }
                }
            } catch (Throwable th) {
                while (i7 < i6) {
                    k(obj, iArr[i7], t0VarA);
                    i7++;
                }
                if (t0VarA != null) {
                    u0Var.getClass();
                    ((C) obj).unknownFields = t0VarA;
                }
                throw th;
            }
        }
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC0283j0
    public final void c(Object obj, L3.c cVar) {
        double dE;
        float f6;
        long jH;
        long jH2;
        int iG;
        long jH3;
        int iG2;
        boolean zC;
        long j6;
        long j7;
        long j8;
        int iG3;
        int iG4;
        int iG5;
        long jH4;
        int iG6;
        long jH5;
        long j9;
        cVar.getClass();
        if (!this.f5425g) {
            Q(obj, cVar);
            return;
        }
        int[] iArr = this.f5419a;
        int length = iArr.length;
        for (int i6 = 0; i6 < length; i6 += 3) {
            int iP = P(i6);
            int i7 = iArr[i6];
            switch (O(iP)) {
                case com.bumptech.glide.d.f6312l /* 0 */:
                    if (q(i6, obj)) {
                        dE = C0.f5363c.e(iP & 1048575, obj);
                        cVar.o(i7, dE);
                    }
                    break;
                case 1:
                    if (q(i6, obj)) {
                        f6 = C0.f5363c.f(iP & 1048575, obj);
                        cVar.w(i7, f6);
                    }
                    break;
                case Z.j.FLOAT_FIELD_NUMBER /* 2 */:
                    if (q(i6, obj)) {
                        jH = C0.f5363c.h(iP & 1048575, obj);
                        cVar.z(i7, jH);
                    }
                    break;
                case Z.j.INTEGER_FIELD_NUMBER /* 3 */:
                    if (q(i6, obj)) {
                        jH2 = C0.f5363c.h(iP & 1048575, obj);
                        cVar.G(i7, jH2);
                    }
                    break;
                case Z.j.LONG_FIELD_NUMBER /* 4 */:
                    if (q(i6, obj)) {
                        iG = C0.f5363c.g(iP & 1048575, obj);
                        cVar.y(i7, iG);
                    }
                    break;
                case Z.j.STRING_FIELD_NUMBER /* 5 */:
                    if (q(i6, obj)) {
                        jH3 = C0.f5363c.h(iP & 1048575, obj);
                        cVar.v(i7, jH3);
                    }
                    break;
                case Z.j.STRING_SET_FIELD_NUMBER /* 6 */:
                    if (q(i6, obj)) {
                        iG2 = C0.f5363c.g(iP & 1048575, obj);
                        cVar.u(i7, iG2);
                    }
                    break;
                case Z.j.DOUBLE_FIELD_NUMBER /* 7 */:
                    if (q(i6, obj)) {
                        zC = C0.f5363c.c(iP & 1048575, obj);
                        cVar.m(i7, zC);
                    }
                    break;
                case Z.j.BYTES_FIELD_NUMBER /* 8 */:
                    if (q(i6, obj)) {
                        j6 = iP & 1048575;
                        S(i7, C0.f5363c.i(j6, obj), cVar);
                    }
                    break;
                case 9:
                    if (q(i6, obj)) {
                        j7 = iP & 1048575;
                        cVar.A(i7, n(i6), C0.f5363c.i(j7, obj));
                    }
                    break;
                case 10:
                    if (q(i6, obj)) {
                        j8 = iP & 1048575;
                        cVar.n(i7, (AbstractC0280i) C0.f5363c.i(j8, obj));
                    }
                    break;
                case 11:
                    if (q(i6, obj)) {
                        iG3 = C0.f5363c.g(iP & 1048575, obj);
                        cVar.F(i7, iG3);
                    }
                    break;
                case 12:
                    if (q(i6, obj)) {
                        iG4 = C0.f5363c.g(iP & 1048575, obj);
                        cVar.p(i7, iG4);
                    }
                    break;
                case 13:
                    if (q(i6, obj)) {
                        iG5 = C0.f5363c.g(iP & 1048575, obj);
                        cVar.B(i7, iG5);
                    }
                    break;
                case 14:
                    if (q(i6, obj)) {
                        jH4 = C0.f5363c.h(iP & 1048575, obj);
                        cVar.C(i7, jH4);
                    }
                    break;
                case 15:
                    if (q(i6, obj)) {
                        iG6 = C0.f5363c.g(iP & 1048575, obj);
                        cVar.D(i7, iG6);
                    }
                    break;
                case 16:
                    if (q(i6, obj)) {
                        jH5 = C0.f5363c.h(iP & 1048575, obj);
                        cVar.E(i7, jH5);
                    }
                    break;
                case 17:
                    if (q(i6, obj)) {
                        j9 = iP & 1048575;
                        cVar.x(i7, n(i6), C0.f5363c.i(j9, obj));
                    }
                    break;
                case 18:
                    AbstractC0285k0.F(iArr[i6], (List) C0.f5363c.i(iP & 1048575, obj), cVar, false);
                    break;
                case 19:
                    AbstractC0285k0.J(iArr[i6], (List) C0.f5363c.i(iP & 1048575, obj), cVar, false);
                    break;
                case 20:
                    AbstractC0285k0.M(iArr[i6], (List) C0.f5363c.i(iP & 1048575, obj), cVar, false);
                    break;
                case 21:
                    AbstractC0285k0.U(iArr[i6], (List) C0.f5363c.i(iP & 1048575, obj), cVar, false);
                    break;
                case 22:
                    AbstractC0285k0.L(iArr[i6], (List) C0.f5363c.i(iP & 1048575, obj), cVar, false);
                    break;
                case 23:
                    AbstractC0285k0.I(iArr[i6], (List) C0.f5363c.i(iP & 1048575, obj), cVar, false);
                    break;
                case 24:
                    AbstractC0285k0.H(iArr[i6], (List) C0.f5363c.i(iP & 1048575, obj), cVar, false);
                    break;
                case 25:
                    AbstractC0285k0.D(iArr[i6], (List) C0.f5363c.i(iP & 1048575, obj), cVar, false);
                    break;
                case 26:
                    AbstractC0285k0.S(iArr[i6], (List) C0.f5363c.i(iP & 1048575, obj), cVar);
                    break;
                case 27:
                    AbstractC0285k0.N(iArr[i6], (List) C0.f5363c.i(iP & 1048575, obj), cVar, n(i6));
                    break;
                case 28:
                    AbstractC0285k0.E(iArr[i6], (List) C0.f5363c.i(iP & 1048575, obj), cVar);
                    break;
                case 29:
                    AbstractC0285k0.T(iArr[i6], (List) C0.f5363c.i(iP & 1048575, obj), cVar, false);
                    break;
                case 30:
                    AbstractC0285k0.G(iArr[i6], (List) C0.f5363c.i(iP & 1048575, obj), cVar, false);
                    break;
                case 31:
                    AbstractC0285k0.O(iArr[i6], (List) C0.f5363c.i(iP & 1048575, obj), cVar, false);
                    break;
                case 32:
                    AbstractC0285k0.P(iArr[i6], (List) C0.f5363c.i(iP & 1048575, obj), cVar, false);
                    break;
                case 33:
                    AbstractC0285k0.Q(iArr[i6], (List) C0.f5363c.i(iP & 1048575, obj), cVar, false);
                    break;
                case 34:
                    AbstractC0285k0.R(iArr[i6], (List) C0.f5363c.i(iP & 1048575, obj), cVar, false);
                    break;
                case 35:
                    AbstractC0285k0.F(iArr[i6], (List) C0.f5363c.i(iP & 1048575, obj), cVar, true);
                    break;
                case 36:
                    AbstractC0285k0.J(iArr[i6], (List) C0.f5363c.i(iP & 1048575, obj), cVar, true);
                    break;
                case 37:
                    AbstractC0285k0.M(iArr[i6], (List) C0.f5363c.i(iP & 1048575, obj), cVar, true);
                    break;
                case 38:
                    AbstractC0285k0.U(iArr[i6], (List) C0.f5363c.i(iP & 1048575, obj), cVar, true);
                    break;
                case 39:
                    AbstractC0285k0.L(iArr[i6], (List) C0.f5363c.i(iP & 1048575, obj), cVar, true);
                    break;
                case 40:
                    AbstractC0285k0.I(iArr[i6], (List) C0.f5363c.i(iP & 1048575, obj), cVar, true);
                    break;
                case 41:
                    AbstractC0285k0.H(iArr[i6], (List) C0.f5363c.i(iP & 1048575, obj), cVar, true);
                    break;
                case 42:
                    AbstractC0285k0.D(iArr[i6], (List) C0.f5363c.i(iP & 1048575, obj), cVar, true);
                    break;
                case 43:
                    AbstractC0285k0.T(iArr[i6], (List) C0.f5363c.i(iP & 1048575, obj), cVar, true);
                    break;
                case 44:
                    AbstractC0285k0.G(iArr[i6], (List) C0.f5363c.i(iP & 1048575, obj), cVar, true);
                    break;
                case 45:
                    AbstractC0285k0.O(iArr[i6], (List) C0.f5363c.i(iP & 1048575, obj), cVar, true);
                    break;
                case 46:
                    AbstractC0285k0.P(iArr[i6], (List) C0.f5363c.i(iP & 1048575, obj), cVar, true);
                    break;
                case 47:
                    AbstractC0285k0.Q(iArr[i6], (List) C0.f5363c.i(iP & 1048575, obj), cVar, true);
                    break;
                case 48:
                    AbstractC0285k0.R(iArr[i6], (List) C0.f5363c.i(iP & 1048575, obj), cVar, true);
                    break;
                case 49:
                    AbstractC0285k0.K(iArr[i6], (List) C0.f5363c.i(iP & 1048575, obj), cVar, n(i6));
                    break;
                case 50:
                    R(cVar, i7, C0.f5363c.i(iP & 1048575, obj), i6);
                    break;
                case 51:
                    if (s(i7, i6, obj)) {
                        dE = ((Double) C0.f5363c.i(iP & 1048575, obj)).doubleValue();
                        cVar.o(i7, dE);
                    }
                    break;
                case 52:
                    if (s(i7, i6, obj)) {
                        f6 = ((Float) C0.f5363c.i(iP & 1048575, obj)).floatValue();
                        cVar.w(i7, f6);
                    }
                    break;
                case 53:
                    if (s(i7, i6, obj)) {
                        jH = D(iP & 1048575, obj);
                        cVar.z(i7, jH);
                    }
                    break;
                case 54:
                    if (s(i7, i6, obj)) {
                        jH2 = D(iP & 1048575, obj);
                        cVar.G(i7, jH2);
                    }
                    break;
                case 55:
                    if (s(i7, i6, obj)) {
                        iG = C(iP & 1048575, obj);
                        cVar.y(i7, iG);
                    }
                    break;
                case 56:
                    if (s(i7, i6, obj)) {
                        jH3 = D(iP & 1048575, obj);
                        cVar.v(i7, jH3);
                    }
                    break;
                case 57:
                    if (s(i7, i6, obj)) {
                        iG2 = C(iP & 1048575, obj);
                        cVar.u(i7, iG2);
                    }
                    break;
                case 58:
                    if (s(i7, i6, obj)) {
                        zC = ((Boolean) C0.f5363c.i(iP & 1048575, obj)).booleanValue();
                        cVar.m(i7, zC);
                    }
                    break;
                case 59:
                    if (s(i7, i6, obj)) {
                        j6 = iP & 1048575;
                        S(i7, C0.f5363c.i(j6, obj), cVar);
                    }
                    break;
                case 60:
                    if (s(i7, i6, obj)) {
                        j7 = iP & 1048575;
                        cVar.A(i7, n(i6), C0.f5363c.i(j7, obj));
                    }
                    break;
                case 61:
                    if (s(i7, i6, obj)) {
                        j8 = iP & 1048575;
                        cVar.n(i7, (AbstractC0280i) C0.f5363c.i(j8, obj));
                    }
                    break;
                case 62:
                    if (s(i7, i6, obj)) {
                        iG3 = C(iP & 1048575, obj);
                        cVar.F(i7, iG3);
                    }
                    break;
                case 63:
                    if (s(i7, i6, obj)) {
                        iG4 = C(iP & 1048575, obj);
                        cVar.p(i7, iG4);
                    }
                    break;
                case 64:
                    if (s(i7, i6, obj)) {
                        iG5 = C(iP & 1048575, obj);
                        cVar.B(i7, iG5);
                    }
                    break;
                case 65:
                    if (s(i7, i6, obj)) {
                        jH4 = D(iP & 1048575, obj);
                        cVar.C(i7, jH4);
                    }
                    break;
                case 66:
                    if (s(i7, i6, obj)) {
                        iG6 = C(iP & 1048575, obj);
                        cVar.D(i7, iG6);
                    }
                    break;
                case 67:
                    if (s(i7, i6, obj)) {
                        jH5 = D(iP & 1048575, obj);
                        cVar.E(i7, jH5);
                    }
                    break;
                case 68:
                    if (s(i7, i6, obj)) {
                        j9 = iP & 1048575;
                        cVar.x(i7, n(i6), C0.f5363c.i(j9, obj));
                    }
                    break;
            }
        }
        this.f5431m.getClass();
        ((C) obj).unknownFields.d(cVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x002e  */
    @Override // androidx.datastore.preferences.protobuf.InterfaceC0283j0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void d(java.lang.Object r11, java.lang.Object r12) {
        /*
            Method dump skipped, instruction units count: 452
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.preferences.protobuf.C0265a0.d(java.lang.Object, java.lang.Object):void");
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC0283j0
    public final boolean e(Object obj, Object obj2) {
        B0 b02;
        Object objI;
        int[] iArr = this.f5419a;
        int length = iArr.length;
        for (int i6 = 0; i6 < length; i6 += 3) {
            int iP = P(i6);
            long j6 = iP & 1048575;
            switch (O(iP)) {
                case com.bumptech.glide.d.f6312l /* 0 */:
                    if (j(obj, i6, obj2)) {
                        B0 b03 = C0.f5363c;
                        if (Double.doubleToLongBits(b03.e(j6, obj)) == Double.doubleToLongBits(b03.e(j6, obj2))) {
                            continue;
                            break;
                        }
                    }
                    return false;
                case 1:
                    if (j(obj, i6, obj2)) {
                        B0 b04 = C0.f5363c;
                        if (Float.floatToIntBits(b04.f(j6, obj)) == Float.floatToIntBits(b04.f(j6, obj2))) {
                            continue;
                            break;
                        }
                    }
                    return false;
                case Z.j.FLOAT_FIELD_NUMBER /* 2 */:
                    if (j(obj, i6, obj2)) {
                        B0 b05 = C0.f5363c;
                        if (b05.h(j6, obj) == b05.h(j6, obj2)) {
                            continue;
                            break;
                        }
                    }
                    return false;
                case Z.j.INTEGER_FIELD_NUMBER /* 3 */:
                    if (j(obj, i6, obj2)) {
                        B0 b06 = C0.f5363c;
                        if (b06.h(j6, obj) == b06.h(j6, obj2)) {
                            continue;
                            break;
                        }
                    }
                    return false;
                case Z.j.LONG_FIELD_NUMBER /* 4 */:
                    if (j(obj, i6, obj2)) {
                        B0 b07 = C0.f5363c;
                        if (b07.g(j6, obj) == b07.g(j6, obj2)) {
                            continue;
                            break;
                        }
                    }
                    return false;
                case Z.j.STRING_FIELD_NUMBER /* 5 */:
                    if (j(obj, i6, obj2)) {
                        B0 b08 = C0.f5363c;
                        if (b08.h(j6, obj) == b08.h(j6, obj2)) {
                            continue;
                            break;
                        }
                    }
                    return false;
                case Z.j.STRING_SET_FIELD_NUMBER /* 6 */:
                    if (j(obj, i6, obj2)) {
                        B0 b09 = C0.f5363c;
                        if (b09.g(j6, obj) == b09.g(j6, obj2)) {
                            continue;
                            break;
                        }
                    }
                    return false;
                case Z.j.DOUBLE_FIELD_NUMBER /* 7 */:
                    if (j(obj, i6, obj2)) {
                        B0 b010 = C0.f5363c;
                        if (b010.c(j6, obj) == b010.c(j6, obj2)) {
                            continue;
                            break;
                        }
                    }
                    return false;
                case Z.j.BYTES_FIELD_NUMBER /* 8 */:
                    if (j(obj, i6, obj2)) {
                        B0 b011 = C0.f5363c;
                        if (AbstractC0285k0.C(b011.i(j6, obj), b011.i(j6, obj2))) {
                            continue;
                            break;
                        }
                    }
                    return false;
                case 9:
                    if (j(obj, i6, obj2)) {
                        B0 b012 = C0.f5363c;
                        if (AbstractC0285k0.C(b012.i(j6, obj), b012.i(j6, obj2))) {
                            continue;
                            break;
                        }
                    }
                    return false;
                case 10:
                    if (j(obj, i6, obj2)) {
                        B0 b013 = C0.f5363c;
                        if (AbstractC0285k0.C(b013.i(j6, obj), b013.i(j6, obj2))) {
                            continue;
                            break;
                        }
                    }
                    return false;
                case 11:
                    if (j(obj, i6, obj2)) {
                        B0 b014 = C0.f5363c;
                        if (b014.g(j6, obj) == b014.g(j6, obj2)) {
                            continue;
                            break;
                        }
                    }
                    return false;
                case 12:
                    if (j(obj, i6, obj2)) {
                        B0 b015 = C0.f5363c;
                        if (b015.g(j6, obj) == b015.g(j6, obj2)) {
                            continue;
                            break;
                        }
                    }
                    return false;
                case 13:
                    if (j(obj, i6, obj2)) {
                        B0 b016 = C0.f5363c;
                        if (b016.g(j6, obj) == b016.g(j6, obj2)) {
                            continue;
                            break;
                        }
                    }
                    return false;
                case 14:
                    if (j(obj, i6, obj2)) {
                        B0 b017 = C0.f5363c;
                        if (b017.h(j6, obj) == b017.h(j6, obj2)) {
                            continue;
                            break;
                        }
                    }
                    return false;
                case 15:
                    if (j(obj, i6, obj2)) {
                        B0 b018 = C0.f5363c;
                        if (b018.g(j6, obj) == b018.g(j6, obj2)) {
                            continue;
                            break;
                        }
                    }
                    return false;
                case 16:
                    if (j(obj, i6, obj2)) {
                        B0 b019 = C0.f5363c;
                        if (b019.h(j6, obj) == b019.h(j6, obj2)) {
                            continue;
                            break;
                        }
                    }
                    return false;
                case 17:
                    if (j(obj, i6, obj2)) {
                        B0 b020 = C0.f5363c;
                        if (AbstractC0285k0.C(b020.i(j6, obj), b020.i(j6, obj2))) {
                            continue;
                            break;
                        }
                    }
                    return false;
                case 18:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                case 24:
                case 25:
                case 26:
                case 27:
                case 28:
                case 29:
                case 30:
                case 31:
                case 32:
                case 33:
                case 34:
                case 35:
                case 36:
                case 37:
                case 38:
                case 39:
                case 40:
                case 41:
                case 42:
                case 43:
                case 44:
                case 45:
                case 46:
                case 47:
                case 48:
                case 49:
                    b02 = C0.f5363c;
                    objI = b02.i(j6, obj);
                    break;
                case 50:
                    b02 = C0.f5363c;
                    objI = b02.i(j6, obj);
                    break;
                case 51:
                case 52:
                case 53:
                case 54:
                case 55:
                case 56:
                case 57:
                case 58:
                case 59:
                case 60:
                case 61:
                case 62:
                case 63:
                case 64:
                case 65:
                case 66:
                case 67:
                case 68:
                    long j7 = iArr[i6 + 2] & 1048575;
                    B0 b021 = C0.f5363c;
                    if (b021.g(j7, obj) != b021.g(j7, obj2) || !AbstractC0285k0.C(b021.i(j6, obj), b021.i(j6, obj2))) {
                        return false;
                    }
                    continue;
                    break;
                    break;
                default:
                    break;
            }
            if (!AbstractC0285k0.C(objI, b02.i(j6, obj2))) {
                return false;
            }
        }
        this.f5431m.getClass();
        return ((C) obj).unknownFields.equals(((C) obj2).unknownFields);
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC0283j0
    public final int f(Object obj) {
        return this.f5425g ? p(obj) : o(obj);
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC0283j0
    public final C g() {
        this.f5429k.getClass();
        return ((C) this.f5423e).l();
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x005c  */
    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Failed to find switch 'out' block (already processed)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker.calcSwitchOut(SwitchRegionMaker.java:217)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker.process(SwitchRegionMaker.java:68)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:112)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:102)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:106)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:102)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:106)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:125)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:89)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:102)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:106)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeMthRegion(RegionMaker.java:48)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:25)
        */
    @Override // androidx.datastore.preferences.protobuf.InterfaceC0283j0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void h(java.lang.Object r9) {
        /*
            r8 = this;
            boolean r0 = r(r9)
            if (r0 != 0) goto L7
            return
        L7:
            boolean r0 = r9 instanceof androidx.datastore.preferences.protobuf.C
            if (r0 == 0) goto L17
            r0 = r9
            androidx.datastore.preferences.protobuf.C r0 = (androidx.datastore.preferences.protobuf.C) r0
            r0.e()
            r0.d()
            r0.k()
        L17:
            int[] r0 = r8.f5419a
            int r1 = r0.length
            r2 = 0
        L1b:
            if (r2 >= r1) goto L72
            int r3 = r8.P(r2)
            r4 = 1048575(0xfffff, float:1.469367E-39)
            r4 = r4 & r3
            long r4 = (long) r4
            int r3 = O(r3)
            r6 = 9
            sun.misc.Unsafe r7 = androidx.datastore.preferences.protobuf.C0265a0.f5418p
            if (r3 == r6) goto L68
            r6 = 60
            if (r3 == r6) goto L54
            r6 = 68
            if (r3 == r6) goto L54
            switch(r3) {
                case 17: goto L68;
                case 18: goto L4e;
                case 19: goto L4e;
                case 20: goto L4e;
                case 21: goto L4e;
                case 22: goto L4e;
                case 23: goto L4e;
                case 24: goto L4e;
                case 25: goto L4e;
                case 26: goto L4e;
                case 27: goto L4e;
                case 28: goto L4e;
                case 29: goto L4e;
                case 30: goto L4e;
                case 31: goto L4e;
                case 32: goto L4e;
                case 33: goto L4e;
                case 34: goto L4e;
                case 35: goto L4e;
                case 36: goto L4e;
                case 37: goto L4e;
                case 38: goto L4e;
                case 39: goto L4e;
                case 40: goto L4e;
                case 41: goto L4e;
                case 42: goto L4e;
                case 43: goto L4e;
                case 44: goto L4e;
                case 45: goto L4e;
                case 46: goto L4e;
                case 47: goto L4e;
                case 48: goto L4e;
                case 49: goto L4e;
                case 50: goto L3c;
                default: goto L3b;
            }
        L3b:
            goto L6f
        L3c:
            java.lang.Object r3 = r7.getObject(r9, r4)
            if (r3 == 0) goto L6f
            androidx.datastore.preferences.protobuf.V r6 = r8.f5432n
            r6.getClass()
            androidx.datastore.preferences.protobuf.V.c(r3)
            r7.putObject(r9, r4, r3)
            goto L6f
        L4e:
            androidx.datastore.preferences.protobuf.N r3 = r8.f5430l
            r3.a(r4, r9)
            goto L6f
        L54:
            r3 = r0[r2]
            boolean r3 = r8.s(r3, r2, r9)
            if (r3 == 0) goto L6f
        L5c:
            androidx.datastore.preferences.protobuf.j0 r3 = r8.n(r2)
            java.lang.Object r4 = r7.getObject(r9, r4)
            r3.h(r4)
            goto L6f
        L68:
            boolean r3 = r8.q(r2, r9)
            if (r3 == 0) goto L6f
            goto L5c
        L6f:
            int r2 = r2 + 3
            goto L1b
        L72:
            androidx.datastore.preferences.protobuf.u0 r0 = r8.f5431m
            r0.getClass()
            androidx.datastore.preferences.protobuf.u0.b(r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.preferences.protobuf.C0265a0.h(java.lang.Object):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x00b4 A[PHI: r3
      0x00b4: PHI (r3v31 int) = (r3v10 int), (r3v32 int) binds: [B:91:0x0168, B:45:0x00b2] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0124 A[PHI: r4
      0x0124: PHI (r4v14 java.lang.Object) = (r4v9 java.lang.Object), (r4v16 java.lang.Object) binds: [B:87:0x0157, B:74:0x0122] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // androidx.datastore.preferences.protobuf.InterfaceC0283j0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int i(java.lang.Object r12) {
        /*
            Method dump skipped, instruction units count: 562
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.preferences.protobuf.C0265a0.i(java.lang.Object):int");
    }

    public final boolean j(Object obj, int i6, Object obj2) {
        return q(i6, obj) == q(i6, obj2);
    }

    public final void k(Object obj, int i6, Object obj2) {
        int i7 = this.f5419a[i6];
        if (C0.f5363c.i(P(i6) & 1048575, obj) == null) {
            return;
        }
        l(i6);
    }

    public final void l(int i6) {
        AbstractC0628i.p(this.f5420b[((i6 / 3) * 2) + 1]);
    }

    public final Object m(int i6) {
        return this.f5420b[(i6 / 3) * 2];
    }

    public final InterfaceC0283j0 n(int i6) {
        int i7 = (i6 / 3) * 2;
        Object[] objArr = this.f5420b;
        InterfaceC0283j0 interfaceC0283j0 = (InterfaceC0283j0) objArr[i7];
        if (interfaceC0283j0 != null) {
            return interfaceC0283j0;
        }
        InterfaceC0283j0 interfaceC0283j0A = C0277g0.f5444c.a((Class) objArr[i7 + 1]);
        objArr[i7] = interfaceC0283j0A;
        return interfaceC0283j0A;
    }

    /* JADX WARN: Removed duplicated region for block: B:50:0x00d4 A[PHI: r6
      0x00d4: PHI (r6v143 java.lang.Object) = (r6v15 java.lang.Object), (r6v147 java.lang.Object) binds: [B:167:0x031d, B:49:0x00d2] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00de A[PHI: r6
      0x00de: PHI (r6v138 java.lang.Object) = (r6v15 java.lang.Object), (r6v147 java.lang.Object) binds: [B:167:0x031d, B:49:0x00d2] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0180 A[PHI: r6
      0x0180: PHI (r6v107 int) = 
      (r6v70 int)
      (r6v73 int)
      (r6v76 int)
      (r6v79 int)
      (r6v82 int)
      (r6v85 int)
      (r6v88 int)
      (r6v91 int)
      (r6v94 int)
      (r6v97 int)
      (r6v100 int)
      (r6v103 int)
      (r6v106 int)
      (r6v110 int)
     binds: [B:122:0x0233, B:119:0x0225, B:116:0x0217, B:113:0x0209, B:110:0x01fc, B:107:0x01ef, B:104:0x01e2, B:101:0x01d5, B:98:0x01c8, B:95:0x01bb, B:92:0x01ae, B:89:0x01a1, B:86:0x0194, B:83:0x017e] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int o(java.lang.Object r15) {
        /*
            Method dump skipped, instruction units count: 1014
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.preferences.protobuf.C0265a0.o(java.lang.Object):int");
    }

    /* JADX WARN: Removed duplicated region for block: B:82:0x0176 A[PHI: r2
      0x0176: PHI (r2v97 int) = 
      (r2v60 int)
      (r2v63 int)
      (r2v66 int)
      (r2v69 int)
      (r2v72 int)
      (r2v75 int)
      (r2v78 int)
      (r2v81 int)
      (r2v84 int)
      (r2v87 int)
      (r2v90 int)
      (r2v93 int)
      (r2v96 int)
      (r2v100 int)
     binds: [B:120:0x0229, B:117:0x021b, B:114:0x020d, B:111:0x01ff, B:108:0x01f2, B:105:0x01e5, B:102:0x01d8, B:99:0x01cb, B:96:0x01be, B:93:0x01b1, B:90:0x01a4, B:87:0x0197, B:84:0x018a, B:81:0x0174] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int p(java.lang.Object r9) {
        /*
            Method dump skipped, instruction units count: 1046
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.preferences.protobuf.C0265a0.p(java.lang.Object):int");
    }

    public final boolean q(int i6, Object obj) {
        int i7 = this.f5419a[i6 + 2];
        long j6 = i7 & 1048575;
        if (j6 != 1048575) {
            return ((1 << (i7 >>> 20)) & C0.f5363c.g(j6, obj)) != 0;
        }
        int iP = P(i6);
        long j7 = iP & 1048575;
        switch (O(iP)) {
            case com.bumptech.glide.d.f6312l /* 0 */:
                return Double.doubleToRawLongBits(C0.f5363c.e(j7, obj)) != 0;
            case 1:
                return Float.floatToRawIntBits(C0.f5363c.f(j7, obj)) != 0;
            case Z.j.FLOAT_FIELD_NUMBER /* 2 */:
                return C0.f5363c.h(j7, obj) != 0;
            case Z.j.INTEGER_FIELD_NUMBER /* 3 */:
                return C0.f5363c.h(j7, obj) != 0;
            case Z.j.LONG_FIELD_NUMBER /* 4 */:
                return C0.f5363c.g(j7, obj) != 0;
            case Z.j.STRING_FIELD_NUMBER /* 5 */:
                return C0.f5363c.h(j7, obj) != 0;
            case Z.j.STRING_SET_FIELD_NUMBER /* 6 */:
                return C0.f5363c.g(j7, obj) != 0;
            case Z.j.DOUBLE_FIELD_NUMBER /* 7 */:
                return C0.f5363c.c(j7, obj);
            case Z.j.BYTES_FIELD_NUMBER /* 8 */:
                Object objI = C0.f5363c.i(j7, obj);
                if (objI instanceof String) {
                    return !((String) objI).isEmpty();
                }
                if (objI instanceof AbstractC0280i) {
                    return !AbstractC0280i.f5452x.equals(objI);
                }
                throw new IllegalArgumentException();
            case 9:
                return C0.f5363c.i(j7, obj) != null;
            case 10:
                return !AbstractC0280i.f5452x.equals(C0.f5363c.i(j7, obj));
            case 11:
                return C0.f5363c.g(j7, obj) != 0;
            case 12:
                return C0.f5363c.g(j7, obj) != 0;
            case 13:
                return C0.f5363c.g(j7, obj) != 0;
            case 14:
                return C0.f5363c.h(j7, obj) != 0;
            case 15:
                return C0.f5363c.g(j7, obj) != 0;
            case 16:
                return C0.f5363c.h(j7, obj) != 0;
            case 17:
                return C0.f5363c.i(j7, obj) != null;
            default:
                throw new IllegalArgumentException();
        }
    }

    public final boolean s(int i6, int i7, Object obj) {
        return C0.f5363c.g((long) (this.f5419a[i7 + 2] & 1048575), obj) == i6;
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x00a6, code lost:
    
        r9.put(r1, r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00a9, code lost:
    
        ((androidx.datastore.preferences.protobuf.AbstractC0288m) r12.f5493d).d(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00b0, code lost:
    
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void u(java.lang.Object r8, int r9, java.lang.Object r10, androidx.datastore.preferences.protobuf.C0294t r11, androidx.datastore.preferences.protobuf.C0289n r12) throws androidx.datastore.preferences.protobuf.G {
        /*
            r7 = this;
            int r9 = r7.P(r9)
            r0 = 1048575(0xfffff, float:1.469367E-39)
            r9 = r9 & r0
            long r0 = (long) r9
            androidx.datastore.preferences.protobuf.B0 r9 = androidx.datastore.preferences.protobuf.C0.f5363c
            java.lang.Object r9 = r9.i(r0, r8)
            r2 = 1
            androidx.datastore.preferences.protobuf.V r3 = r7.f5432n
            r3.getClass()
            if (r9 != 0) goto L21
            androidx.datastore.preferences.protobuf.U r9 = androidx.datastore.preferences.protobuf.U.f5412x
            androidx.datastore.preferences.protobuf.U r9 = r9.d()
            androidx.datastore.preferences.protobuf.C0.s(r0, r8, r9)
            goto L36
        L21:
            r4 = r9
            androidx.datastore.preferences.protobuf.U r4 = (androidx.datastore.preferences.protobuf.U) r4
            boolean r4 = r4.f5413w
            r4 = r4 ^ r2
            if (r4 == 0) goto L36
            androidx.datastore.preferences.protobuf.U r4 = androidx.datastore.preferences.protobuf.U.f5412x
            androidx.datastore.preferences.protobuf.U r4 = r4.d()
            androidx.datastore.preferences.protobuf.V.b(r4, r9)
            androidx.datastore.preferences.protobuf.C0.s(r0, r8, r4)
            r9 = r4
        L36:
            r3.getClass()
            androidx.datastore.preferences.protobuf.U r9 = (androidx.datastore.preferences.protobuf.U) r9
            androidx.datastore.preferences.protobuf.T r10 = (androidx.datastore.preferences.protobuf.T) r10
            J3.w r8 = r10.f5409a
            r10 = 2
            r12.z(r10)
            java.lang.Object r0 = r12.f5493d
            androidx.datastore.preferences.protobuf.m r0 = (androidx.datastore.preferences.protobuf.AbstractC0288m) r0
            int r0 = r0.v()
            java.lang.Object r1 = r12.f5493d
            androidx.datastore.preferences.protobuf.m r1 = (androidx.datastore.preferences.protobuf.AbstractC0288m) r1
            int r0 = r1.e(r0)
            java.lang.Object r1 = r8.f1442b
            java.lang.Object r3 = r8.f1444d
        L57:
            int r4 = r12.c()     // Catch: java.lang.Throwable -> L7e
            r5 = 2147483647(0x7fffffff, float:NaN)
            if (r4 == r5) goto La6
            java.lang.Object r5 = r12.f5493d     // Catch: java.lang.Throwable -> L7e
            androidx.datastore.preferences.protobuf.m r5 = (androidx.datastore.preferences.protobuf.AbstractC0288m) r5     // Catch: java.lang.Throwable -> L7e
            boolean r5 = r5.c()     // Catch: java.lang.Throwable -> L7e
            if (r5 == 0) goto L6b
            goto La6
        L6b:
            java.lang.String r5 = "Unable to parse map entry."
            if (r4 == r2) goto L8f
            if (r4 == r10) goto L80
            boolean r4 = r12.A()     // Catch: java.lang.Throwable -> L7e androidx.datastore.preferences.protobuf.G -> L99
            if (r4 == 0) goto L78
            goto L57
        L78:
            androidx.datastore.preferences.protobuf.H r4 = new androidx.datastore.preferences.protobuf.H     // Catch: java.lang.Throwable -> L7e androidx.datastore.preferences.protobuf.G -> L99
            r4.<init>(r5)     // Catch: java.lang.Throwable -> L7e androidx.datastore.preferences.protobuf.G -> L99
            throw r4     // Catch: java.lang.Throwable -> L7e androidx.datastore.preferences.protobuf.G -> L99
        L7e:
            r8 = move-exception
            goto Lb1
        L80:
            java.lang.Object r4 = r8.f1443c     // Catch: java.lang.Throwable -> L7e androidx.datastore.preferences.protobuf.G -> L99
            androidx.datastore.preferences.protobuf.K0 r4 = (androidx.datastore.preferences.protobuf.K0) r4     // Catch: java.lang.Throwable -> L7e androidx.datastore.preferences.protobuf.G -> L99
            java.lang.Object r6 = r8.f1444d     // Catch: java.lang.Throwable -> L7e androidx.datastore.preferences.protobuf.G -> L99
            java.lang.Class r6 = r6.getClass()     // Catch: java.lang.Throwable -> L7e androidx.datastore.preferences.protobuf.G -> L99
            java.lang.Object r3 = r12.l(r4, r6, r11)     // Catch: java.lang.Throwable -> L7e androidx.datastore.preferences.protobuf.G -> L99
            goto L57
        L8f:
            java.lang.Object r4 = r8.f1441a     // Catch: java.lang.Throwable -> L7e androidx.datastore.preferences.protobuf.G -> L99
            androidx.datastore.preferences.protobuf.K0 r4 = (androidx.datastore.preferences.protobuf.K0) r4     // Catch: java.lang.Throwable -> L7e androidx.datastore.preferences.protobuf.G -> L99
            r6 = 0
            java.lang.Object r1 = r12.l(r4, r6, r6)     // Catch: java.lang.Throwable -> L7e androidx.datastore.preferences.protobuf.G -> L99
            goto L57
        L99:
            boolean r4 = r12.A()     // Catch: java.lang.Throwable -> L7e
            if (r4 == 0) goto La0
            goto L57
        La0:
            androidx.datastore.preferences.protobuf.H r8 = new androidx.datastore.preferences.protobuf.H     // Catch: java.lang.Throwable -> L7e
            r8.<init>(r5)     // Catch: java.lang.Throwable -> L7e
            throw r8     // Catch: java.lang.Throwable -> L7e
        La6:
            r9.put(r1, r3)     // Catch: java.lang.Throwable -> L7e
            java.lang.Object r8 = r12.f5493d
            androidx.datastore.preferences.protobuf.m r8 = (androidx.datastore.preferences.protobuf.AbstractC0288m) r8
            r8.d(r0)
            return
        Lb1:
            java.lang.Object r9 = r12.f5493d
            androidx.datastore.preferences.protobuf.m r9 = (androidx.datastore.preferences.protobuf.AbstractC0288m) r9
            r9.d(r0)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.preferences.protobuf.C0265a0.u(java.lang.Object, int, java.lang.Object, androidx.datastore.preferences.protobuf.t, androidx.datastore.preferences.protobuf.n):void");
    }

    public final void v(Object obj, int i6, Object obj2) {
        if (q(i6, obj2)) {
            long jP = P(i6) & 1048575;
            Unsafe unsafe = f5418p;
            Object object = unsafe.getObject(obj2, jP);
            if (object == null) {
                throw new IllegalStateException("Source subfield " + this.f5419a[i6] + " is present but null: " + obj2);
            }
            InterfaceC0283j0 interfaceC0283j0N = n(i6);
            if (!q(i6, obj)) {
                if (r(object)) {
                    C cG = interfaceC0283j0N.g();
                    interfaceC0283j0N.d(cG, object);
                    unsafe.putObject(obj, jP, cG);
                } else {
                    unsafe.putObject(obj, jP, object);
                }
                K(i6, obj);
                return;
            }
            Object object2 = unsafe.getObject(obj, jP);
            if (!r(object2)) {
                C cG2 = interfaceC0283j0N.g();
                interfaceC0283j0N.d(cG2, object2);
                unsafe.putObject(obj, jP, cG2);
                object2 = cG2;
            }
            interfaceC0283j0N.d(object2, object);
        }
    }

    public final void w(Object obj, int i6, Object obj2) {
        int[] iArr = this.f5419a;
        int i7 = iArr[i6];
        if (s(i7, i6, obj2)) {
            long jP = P(i6) & 1048575;
            Unsafe unsafe = f5418p;
            Object object = unsafe.getObject(obj2, jP);
            if (object == null) {
                throw new IllegalStateException("Source subfield " + iArr[i6] + " is present but null: " + obj2);
            }
            InterfaceC0283j0 interfaceC0283j0N = n(i6);
            if (!s(i7, i6, obj)) {
                if (r(object)) {
                    C cG = interfaceC0283j0N.g();
                    interfaceC0283j0N.d(cG, object);
                    unsafe.putObject(obj, jP, cG);
                } else {
                    unsafe.putObject(obj, jP, object);
                }
                L(i7, i6, obj);
                return;
            }
            Object object2 = unsafe.getObject(obj, jP);
            if (!r(object2)) {
                C cG2 = interfaceC0283j0N.g();
                interfaceC0283j0N.d(cG2, object2);
                unsafe.putObject(obj, jP, cG2);
                object2 = cG2;
            }
            interfaceC0283j0N.d(object2, object);
        }
    }

    public final Object x(int i6, Object obj) {
        InterfaceC0283j0 interfaceC0283j0N = n(i6);
        long jP = P(i6) & 1048575;
        if (!q(i6, obj)) {
            return interfaceC0283j0N.g();
        }
        Object object = f5418p.getObject(obj, jP);
        if (r(object)) {
            return object;
        }
        C cG = interfaceC0283j0N.g();
        if (object != null) {
            interfaceC0283j0N.d(cG, object);
        }
        return cG;
    }

    public final Object y(int i6, int i7, Object obj) {
        InterfaceC0283j0 interfaceC0283j0N = n(i7);
        if (!s(i6, i7, obj)) {
            return interfaceC0283j0N.g();
        }
        Object object = f5418p.getObject(obj, P(i7) & 1048575);
        if (r(object)) {
            return object;
        }
        C cG = interfaceC0283j0N.g();
        if (object != null) {
            interfaceC0283j0N.d(cG, object);
        }
        return cG;
    }
}
