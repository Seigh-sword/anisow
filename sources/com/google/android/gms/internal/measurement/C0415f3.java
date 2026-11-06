package com.google.android.gms.internal.measurement;

import androidx.datastore.preferences.protobuf.C0290o;
import java.lang.reflect.Field;
import java.util.Arrays;
import p1.C1243i;
import sun.misc.Unsafe;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.f3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0415f3 implements InterfaceC0457m3 {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final int[] f6799m = new int[0];

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final Unsafe f6800n = AbstractC0492s3.j();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int[] f6801a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object[] f6802b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f6803c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f6804d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final InterfaceC0403d3 f6805e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int[] f6806f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f6807g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f6808h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final J2 f6809i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final J2 f6810j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final J2 f6811k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final J2 f6812l;

    public C0415f3(int[] iArr, Object[] objArr, int i6, int i7, InterfaceC0403d3 interfaceC0403d3, int[] iArr2, int i8, int i9, J2 j22) {
        J2 j23 = F2.f6592a;
        J2 j24 = W1.f6731c;
        J2 j25 = W.f6728b;
        J2 j26 = AbstractC0408e2.f6791b;
        this.f6801a = iArr;
        this.f6802b = objArr;
        this.f6803c = i6;
        this.f6804d = i7;
        boolean z5 = interfaceC0403d3 instanceof I2;
        this.f6806f = iArr2;
        this.f6807g = i8;
        this.f6808h = i9;
        this.f6809i = j23;
        this.f6810j = j24;
        this.f6811k = j25;
        this.f6805e = interfaceC0403d3;
        this.f6812l = j26;
    }

    public static long C(long j6, Object obj) {
        return ((Long) AbstractC0492s3.r(j6, obj)).longValue();
    }

    public static boolean G(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj instanceof I2) {
            return ((I2) obj).o();
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:125:0x026c  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0272  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0288  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x028b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static com.google.android.gms.internal.measurement.C0415f3 l(com.google.android.gms.internal.measurement.InterfaceC0397c3 r33, com.google.android.gms.internal.measurement.J2 r34) {
        /*
            Method dump skipped, instruction units count: 1040
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.C0415f3.l(com.google.android.gms.internal.measurement.c3, com.google.android.gms.internal.measurement.J2):com.google.android.gms.internal.measurement.f3");
    }

    public static Field o(Class cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (NoSuchFieldException unused) {
            Field[] declaredFields = cls.getDeclaredFields();
            for (Field field : declaredFields) {
                if (str.equals(field.getName())) {
                    return field;
                }
            }
            throw new RuntimeException("Field " + str + " for " + cls.getName() + " not found. Known fields are " + Arrays.toString(declaredFields));
        }
    }

    public static void q(int i6, Object obj, C1243i c1243i) throws C0290o {
        if (!(obj instanceof String)) {
            c1243i.w(i6, (AbstractC0527y2) obj);
            return;
        }
        A2 a22 = (A2) c1243i.f12254x;
        a22.w(i6, 2);
        a22.i((String) obj);
    }

    public static int x(long j6, Object obj) {
        return ((Integer) AbstractC0492s3.r(j6, obj)).intValue();
    }

    public static C0475p3 y(Object obj) {
        I2 i22 = (I2) obj;
        C0475p3 c0475p3 = i22.zzb;
        if (c0475p3 != C0475p3.f6922f) {
            return c0475p3;
        }
        C0475p3 c0475p3F = C0475p3.f();
        i22.zzb = c0475p3F;
        return c0475p3F;
    }

    public final boolean A(int i6, Object obj) {
        int i7 = this.f6801a[i6 + 2];
        long j6 = i7 & 1048575;
        if (j6 != 1048575) {
            return ((1 << (i7 >>> 20)) & AbstractC0492s3.f6953c.e(j6, obj)) != 0;
        }
        int iW = w(i6);
        long j7 = iW & 1048575;
        switch ((iW & 267386880) >>> 20) {
            case com.bumptech.glide.d.f6312l /* 0 */:
                return Double.doubleToRawLongBits(AbstractC0492s3.a(j7, obj)) != 0;
            case 1:
                return Float.floatToRawIntBits(AbstractC0492s3.h(j7, obj)) != 0;
            case Z.j.FLOAT_FIELD_NUMBER /* 2 */:
                return AbstractC0492s3.f6953c.f(j7, obj) != 0;
            case Z.j.INTEGER_FIELD_NUMBER /* 3 */:
                return AbstractC0492s3.f6953c.f(j7, obj) != 0;
            case Z.j.LONG_FIELD_NUMBER /* 4 */:
                return AbstractC0492s3.f6953c.e(j7, obj) != 0;
            case Z.j.STRING_FIELD_NUMBER /* 5 */:
                return AbstractC0492s3.f6953c.f(j7, obj) != 0;
            case Z.j.STRING_SET_FIELD_NUMBER /* 6 */:
                return AbstractC0492s3.f6953c.e(j7, obj) != 0;
            case Z.j.DOUBLE_FIELD_NUMBER /* 7 */:
                return AbstractC0492s3.s(j7, obj);
            case Z.j.BYTES_FIELD_NUMBER /* 8 */:
                Object objR = AbstractC0492s3.r(j7, obj);
                if (objR instanceof String) {
                    return !((String) objR).isEmpty();
                }
                if (objR instanceof AbstractC0527y2) {
                    return !AbstractC0527y2.f7008x.equals(objR);
                }
                throw new IllegalArgumentException();
            case 9:
                return AbstractC0492s3.r(j7, obj) != null;
            case 10:
                return !AbstractC0527y2.f7008x.equals(AbstractC0492s3.r(j7, obj));
            case 11:
                return AbstractC0492s3.f6953c.e(j7, obj) != 0;
            case 12:
                return AbstractC0492s3.f6953c.e(j7, obj) != 0;
            case 13:
                return AbstractC0492s3.f6953c.e(j7, obj) != 0;
            case 14:
                return AbstractC0492s3.f6953c.f(j7, obj) != 0;
            case 15:
                return AbstractC0492s3.f6953c.e(j7, obj) != 0;
            case 16:
                return AbstractC0492s3.f6953c.f(j7, obj) != 0;
            case 17:
                return AbstractC0492s3.r(j7, obj) != null;
            default:
                throw new IllegalArgumentException();
        }
    }

    public final boolean B(Object obj, int i6, Object obj2) {
        return A(i6, obj) == A(i6, obj2);
    }

    public final M2 D(int i6) {
        return (M2) this.f6802b[((i6 / 3) << 1) + 1];
    }

    public final InterfaceC0457m3 E(int i6) {
        int i7 = (i6 / 3) << 1;
        Object[] objArr = this.f6802b;
        InterfaceC0457m3 interfaceC0457m3 = (InterfaceC0457m3) objArr[i7];
        if (interfaceC0457m3 != null) {
            return interfaceC0457m3;
        }
        InterfaceC0457m3 interfaceC0457m3A = C0445k3.f6859c.a((Class) objArr[i7 + 1]);
        objArr[i7] = interfaceC0457m3A;
        return interfaceC0457m3A;
    }

    public final Object F(int i6) {
        return this.f6802b[(i6 / 3) << 1];
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC0457m3
    public final I2 a() {
        this.f6809i.getClass();
        return (I2) ((I2) this.f6805e).e(4);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC0457m3
    public final void b(Object obj, Object obj2) {
        C0481q3 c0481q3;
        long jF;
        int i6;
        if (!G(obj)) {
            throw new IllegalArgumentException("Mutating immutable message: ".concat(String.valueOf(obj)));
        }
        obj2.getClass();
        int i7 = 0;
        while (true) {
            int[] iArr = this.f6801a;
            if (i7 >= iArr.length) {
                W.h(this.f6811k, obj, obj2);
                return;
            }
            int iW = w(i7);
            long j6 = iW & 1048575;
            int i8 = iArr[i7];
            switch ((iW & 267386880) >>> 20) {
                case com.bumptech.glide.d.f6312l /* 0 */:
                    if (A(i7, obj2)) {
                        AbstractC0492s3.e(obj, j6, AbstractC0492s3.a(j6, obj2));
                        u(i7, obj);
                    }
                    break;
                case 1:
                    if (A(i7, obj2)) {
                        AbstractC0492s3.f(obj, j6, AbstractC0492s3.h(j6, obj2));
                        u(i7, obj);
                    }
                    break;
                case Z.j.FLOAT_FIELD_NUMBER /* 2 */:
                    if (A(i7, obj2)) {
                        c0481q3 = AbstractC0492s3.f6953c;
                        jF = c0481q3.f(j6, obj2);
                        c0481q3.b(obj, j6, jF);
                        u(i7, obj);
                    }
                    break;
                case Z.j.INTEGER_FIELD_NUMBER /* 3 */:
                    if (A(i7, obj2)) {
                        c0481q3 = AbstractC0492s3.f6953c;
                        jF = c0481q3.f(j6, obj2);
                        c0481q3.b(obj, j6, jF);
                        u(i7, obj);
                    }
                    break;
                case Z.j.LONG_FIELD_NUMBER /* 4 */:
                    if (!A(i7, obj2)) {
                    }
                    AbstractC0492s3.c(AbstractC0492s3.f6953c.e(j6, obj2), j6, obj);
                    u(i7, obj);
                    break;
                case Z.j.STRING_FIELD_NUMBER /* 5 */:
                    if (A(i7, obj2)) {
                        c0481q3 = AbstractC0492s3.f6953c;
                        jF = c0481q3.f(j6, obj2);
                        c0481q3.b(obj, j6, jF);
                        u(i7, obj);
                    }
                    break;
                case Z.j.STRING_SET_FIELD_NUMBER /* 6 */:
                    if (!A(i7, obj2)) {
                    }
                    AbstractC0492s3.c(AbstractC0492s3.f6953c.e(j6, obj2), j6, obj);
                    u(i7, obj);
                    break;
                case Z.j.DOUBLE_FIELD_NUMBER /* 7 */:
                    if (A(i7, obj2)) {
                        AbstractC0492s3.n(obj, j6, AbstractC0492s3.s(j6, obj2));
                        u(i7, obj);
                    }
                    break;
                case Z.j.BYTES_FIELD_NUMBER /* 8 */:
                    if (!A(i7, obj2)) {
                    }
                    AbstractC0492s3.d(j6, obj, AbstractC0492s3.r(j6, obj2));
                    u(i7, obj);
                    break;
                case 9:
                case 17:
                    s(obj, obj2, i7);
                    break;
                case 10:
                    if (!A(i7, obj2)) {
                    }
                    AbstractC0492s3.d(j6, obj, AbstractC0492s3.r(j6, obj2));
                    u(i7, obj);
                    break;
                case 11:
                    if (!A(i7, obj2)) {
                    }
                    AbstractC0492s3.c(AbstractC0492s3.f6953c.e(j6, obj2), j6, obj);
                    u(i7, obj);
                    break;
                case 12:
                    if (!A(i7, obj2)) {
                    }
                    AbstractC0492s3.c(AbstractC0492s3.f6953c.e(j6, obj2), j6, obj);
                    u(i7, obj);
                    break;
                case 13:
                    if (!A(i7, obj2)) {
                    }
                    AbstractC0492s3.c(AbstractC0492s3.f6953c.e(j6, obj2), j6, obj);
                    u(i7, obj);
                    break;
                case 14:
                    if (A(i7, obj2)) {
                        c0481q3 = AbstractC0492s3.f6953c;
                        jF = c0481q3.f(j6, obj2);
                        c0481q3.b(obj, j6, jF);
                        u(i7, obj);
                    }
                    break;
                case 15:
                    if (!A(i7, obj2)) {
                    }
                    AbstractC0492s3.c(AbstractC0492s3.f6953c.e(j6, obj2), j6, obj);
                    u(i7, obj);
                    break;
                case 16:
                    if (A(i7, obj2)) {
                        c0481q3 = AbstractC0492s3.f6953c;
                        jF = c0481q3.f(j6, obj2);
                        c0481q3.b(obj, j6, jF);
                        u(i7, obj);
                    }
                    break;
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
                    this.f6810j.getClass();
                    R2 r2D = (R2) AbstractC0492s3.r(j6, obj);
                    R2 r22 = (R2) AbstractC0492s3.r(j6, obj2);
                    int size = r2D.size();
                    int size2 = r22.size();
                    if (size > 0 && size2 > 0) {
                        if (!((AbstractC0485r2) r2D).f6940w) {
                            r2D = r2D.d(size2 + size);
                        }
                        r2D.addAll(r22);
                    }
                    if (size > 0) {
                        r22 = r2D;
                    }
                    AbstractC0492s3.d(j6, obj, r22);
                    break;
                case 50:
                    Object objR = AbstractC0492s3.r(j6, obj);
                    Object objR2 = AbstractC0492s3.r(j6, obj2);
                    this.f6812l.getClass();
                    AbstractC0492s3.d(j6, obj, J2.f(objR, objR2));
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
                    if (z(i8, i7, obj2)) {
                        AbstractC0492s3.d(j6, obj, AbstractC0492s3.r(j6, obj2));
                        i6 = iArr[i7 + 2];
                        AbstractC0492s3.c(i8, i6 & 1048575, obj);
                    }
                    break;
                case 60:
                case 68:
                    v(obj, i7, obj2);
                    break;
                case 61:
                case 62:
                case 63:
                case 64:
                case 65:
                case 66:
                case 67:
                    if (z(i8, i7, obj2)) {
                        AbstractC0492s3.d(j6, obj, AbstractC0492s3.r(j6, obj2));
                        i6 = iArr[i7 + 2];
                        AbstractC0492s3.c(i8, i6 & 1048575, obj);
                    }
                    break;
            }
            i7 += 3;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:49:0x00c9 A[PHI: r0
      0x00c9: PHI (r0v173 java.lang.Object) = (r0v30 java.lang.Object), (r0v36 java.lang.Object), (r0v168 java.lang.Object), (r0v177 java.lang.Object) binds: [B:174:0x03ae, B:167:0x0380, B:57:0x00ef, B:48:0x00c5] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00f2 A[PHI: r0
      0x00f2: PHI (r0v164 java.lang.Object) = (r0v30 java.lang.Object), (r0v168 java.lang.Object) binds: [B:174:0x03ae, B:57:0x00ef] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0194 A[PHI: r0
      0x0194: PHI (r0v134 int) = 
      (r0v97 int)
      (r0v100 int)
      (r0v103 int)
      (r0v106 int)
      (r0v109 int)
      (r0v112 int)
      (r0v115 int)
      (r0v118 int)
      (r0v121 int)
      (r0v124 int)
      (r0v127 int)
      (r0v130 int)
      (r0v133 int)
      (r0v137 int)
     binds: [B:129:0x024b, B:126:0x023d, B:123:0x022f, B:120:0x0221, B:117:0x0213, B:114:0x0206, B:111:0x01f9, B:108:0x01ec, B:105:0x01df, B:102:0x01d2, B:99:0x01c5, B:96:0x01b8, B:93:0x01ab, B:90:0x0192] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // com.google.android.gms.internal.measurement.InterfaceC0457m3
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int c(java.lang.Object r17) {
        /*
            Method dump skipped, instruction units count: 1248
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.C0415f3.c(java.lang.Object):int");
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x00a9  */
    @Override // com.google.android.gms.internal.measurement.InterfaceC0457m3
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean d(java.lang.Object r18) {
        /*
            Method dump skipped, instruction units count: 250
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.C0415f3.d(java.lang.Object):boolean");
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC0457m3
    public final void e(Object obj, byte[] bArr, int i6, int i7, C0503u2 c0503u2) {
        k(obj, bArr, i6, i7, 0, c0503u2);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00e3  */
    @Override // com.google.android.gms.internal.measurement.InterfaceC0457m3
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void f(java.lang.Object r26, p1.C1243i r27) throws androidx.datastore.preferences.protobuf.C0290o {
        /*
            Method dump skipped, instruction units count: 3208
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.C0415f3.f(java.lang.Object, p1.i):void");
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC0457m3
    public final boolean g(Object obj, Object obj2) {
        int[] iArr = this.f6801a;
        int length = iArr.length;
        for (int i6 = 0; i6 < length; i6 += 3) {
            int iW = w(i6);
            long j6 = iW & 1048575;
            switch ((iW & 267386880) >>> 20) {
                case com.bumptech.glide.d.f6312l /* 0 */:
                    if (!B(obj, i6, obj2) || Double.doubleToLongBits(AbstractC0492s3.a(j6, obj)) != Double.doubleToLongBits(AbstractC0492s3.a(j6, obj2))) {
                        return false;
                    }
                    break;
                    break;
                case 1:
                    if (!B(obj, i6, obj2) || Float.floatToIntBits(AbstractC0492s3.h(j6, obj)) != Float.floatToIntBits(AbstractC0492s3.h(j6, obj2))) {
                        return false;
                    }
                    break;
                    break;
                case Z.j.FLOAT_FIELD_NUMBER /* 2 */:
                    if (B(obj, i6, obj2)) {
                        C0481q3 c0481q3 = AbstractC0492s3.f6953c;
                        if (c0481q3.f(j6, obj) == c0481q3.f(j6, obj2)) {
                            break;
                        }
                    }
                    return false;
                case Z.j.INTEGER_FIELD_NUMBER /* 3 */:
                    if (B(obj, i6, obj2)) {
                        C0481q3 c0481q32 = AbstractC0492s3.f6953c;
                        if (c0481q32.f(j6, obj) == c0481q32.f(j6, obj2)) {
                            break;
                        }
                    }
                    return false;
                case Z.j.LONG_FIELD_NUMBER /* 4 */:
                    if (B(obj, i6, obj2)) {
                        C0481q3 c0481q33 = AbstractC0492s3.f6953c;
                        if (c0481q33.e(j6, obj) == c0481q33.e(j6, obj2)) {
                            break;
                        }
                    }
                    return false;
                case Z.j.STRING_FIELD_NUMBER /* 5 */:
                    if (B(obj, i6, obj2)) {
                        C0481q3 c0481q34 = AbstractC0492s3.f6953c;
                        if (c0481q34.f(j6, obj) == c0481q34.f(j6, obj2)) {
                            break;
                        }
                    }
                    return false;
                case Z.j.STRING_SET_FIELD_NUMBER /* 6 */:
                    if (B(obj, i6, obj2)) {
                        C0481q3 c0481q35 = AbstractC0492s3.f6953c;
                        if (c0481q35.e(j6, obj) == c0481q35.e(j6, obj2)) {
                            break;
                        }
                    }
                    return false;
                case Z.j.DOUBLE_FIELD_NUMBER /* 7 */:
                    if (!B(obj, i6, obj2) || AbstractC0492s3.s(j6, obj) != AbstractC0492s3.s(j6, obj2)) {
                        return false;
                    }
                    break;
                    break;
                case Z.j.BYTES_FIELD_NUMBER /* 8 */:
                    if (!B(obj, i6, obj2) || !W.j(AbstractC0492s3.r(j6, obj), AbstractC0492s3.r(j6, obj2))) {
                        return false;
                    }
                    break;
                    break;
                case 9:
                    if (!B(obj, i6, obj2) || !W.j(AbstractC0492s3.r(j6, obj), AbstractC0492s3.r(j6, obj2))) {
                        return false;
                    }
                    break;
                    break;
                case 10:
                    if (!B(obj, i6, obj2) || !W.j(AbstractC0492s3.r(j6, obj), AbstractC0492s3.r(j6, obj2))) {
                        return false;
                    }
                    break;
                    break;
                case 11:
                    if (B(obj, i6, obj2)) {
                        C0481q3 c0481q36 = AbstractC0492s3.f6953c;
                        if (c0481q36.e(j6, obj) == c0481q36.e(j6, obj2)) {
                            break;
                        }
                    }
                    return false;
                case 12:
                    if (B(obj, i6, obj2)) {
                        C0481q3 c0481q37 = AbstractC0492s3.f6953c;
                        if (c0481q37.e(j6, obj) == c0481q37.e(j6, obj2)) {
                            break;
                        }
                    }
                    return false;
                case 13:
                    if (B(obj, i6, obj2)) {
                        C0481q3 c0481q38 = AbstractC0492s3.f6953c;
                        if (c0481q38.e(j6, obj) == c0481q38.e(j6, obj2)) {
                            break;
                        }
                    }
                    return false;
                case 14:
                    if (B(obj, i6, obj2)) {
                        C0481q3 c0481q39 = AbstractC0492s3.f6953c;
                        if (c0481q39.f(j6, obj) == c0481q39.f(j6, obj2)) {
                            break;
                        }
                    }
                    return false;
                case 15:
                    if (B(obj, i6, obj2)) {
                        C0481q3 c0481q310 = AbstractC0492s3.f6953c;
                        if (c0481q310.e(j6, obj) == c0481q310.e(j6, obj2)) {
                            break;
                        }
                    }
                    return false;
                case 16:
                    if (B(obj, i6, obj2)) {
                        C0481q3 c0481q311 = AbstractC0492s3.f6953c;
                        if (c0481q311.f(j6, obj) == c0481q311.f(j6, obj2)) {
                            break;
                        }
                    }
                    return false;
                case 17:
                    if (!B(obj, i6, obj2) || !W.j(AbstractC0492s3.r(j6, obj), AbstractC0492s3.r(j6, obj2))) {
                        return false;
                    }
                    break;
                    break;
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
                case 50:
                    if (!W.j(AbstractC0492s3.r(j6, obj), AbstractC0492s3.r(j6, obj2))) {
                        return false;
                    }
                    break;
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
                    C0481q3 c0481q312 = AbstractC0492s3.f6953c;
                    if (c0481q312.e(j7, obj) != c0481q312.e(j7, obj2) || !W.j(AbstractC0492s3.r(j6, obj), AbstractC0492s3.r(j6, obj2))) {
                        return false;
                    }
                    break;
                    break;
            }
        }
        this.f6811k.getClass();
        return ((I2) obj).zzb.equals(((I2) obj2).zzb);
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x00ad A[PHI: r3
      0x00ad: PHI (r3v32 int) = (r3v10 int), (r3v33 int) binds: [B:87:0x016c, B:42:0x00ab] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0128 A[PHI: r4
      0x0128: PHI (r4v14 java.lang.Object) = (r4v9 java.lang.Object), (r4v15 java.lang.Object) binds: [B:83:0x0153, B:71:0x0126] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // com.google.android.gms.internal.measurement.InterfaceC0457m3
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int h(java.lang.Object r12) {
        /*
            Method dump skipped, instruction units count: 562
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.C0415f3.h(java.lang.Object):int");
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0062  */
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
    @Override // com.google.android.gms.internal.measurement.InterfaceC0457m3
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void i(java.lang.Object r9) {
        /*
            Method dump skipped, instruction units count: 202
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.C0415f3.i(java.lang.Object):void");
    }

    public final int j(int i6, int i7) {
        int[] iArr = this.f6801a;
        int length = (iArr.length / 3) - 1;
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

    /* JADX WARN: Code restructure failed: missing block: B:193:0x05f2, code lost:
    
        if (r2 == 0) goto L194;
     */
    /* JADX WARN: Code restructure failed: missing block: B:194:0x05f4, code lost:
    
        r9.add(com.google.android.gms.internal.measurement.AbstractC0527y2.f7008x);
     */
    /* JADX WARN: Code restructure failed: missing block: B:195:0x05fa, code lost:
    
        r9.add(com.google.android.gms.internal.measurement.AbstractC0527y2.g(r15, r1, r2));
        r1 = r1 + r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:196:0x0602, code lost:
    
        if (r1 >= r12) goto L611;
     */
    /* JADX WARN: Code restructure failed: missing block: B:197:0x0604, code lost:
    
        r2 = com.google.android.gms.internal.measurement.U1.n(r15, r1, r10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:198:0x060a, code lost:
    
        if (r21 != r10.f6967a) goto L612;
     */
    /* JADX WARN: Code restructure failed: missing block: B:199:0x060c, code lost:
    
        r1 = com.google.android.gms.internal.measurement.U1.n(r15, r2, r10);
        r2 = r10.f6967a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:200:0x0612, code lost:
    
        if (r2 < 0) goto L528;
     */
    /* JADX WARN: Code restructure failed: missing block: B:202:0x0616, code lost:
    
        if (r2 > (r15.length - r1)) goto L529;
     */
    /* JADX WARN: Code restructure failed: missing block: B:203:0x0618, code lost:
    
        if (r2 != 0) goto L195;
     */
    /* JADX WARN: Code restructure failed: missing block: B:206:0x061f, code lost:
    
        throw com.google.android.gms.internal.measurement.Q2.d();
     */
    /* JADX WARN: Code restructure failed: missing block: B:208:0x0624, code lost:
    
        throw com.google.android.gms.internal.measurement.Q2.b();
     */
    /* JADX WARN: Code restructure failed: missing block: B:209:0x0625, code lost:
    
        r32 = r42;
        r4 = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:505:0x0602, code lost:
    
        r9.add(com.google.android.gms.internal.measurement.AbstractC0527y2.g(r15, r1, r2));
        r1 = r1 + r2;
     */
    /* JADX WARN: Removed duplicated region for block: B:231:0x06af  */
    /* JADX WARN: Removed duplicated region for block: B:253:0x06ff  */
    /* JADX WARN: Removed duplicated region for block: B:470:0x0c1e  */
    /* JADX WARN: Removed duplicated region for block: B:478:0x0c4d  */
    /* JADX WARN: Removed duplicated region for block: B:548:0x092a A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:589:0x091e A[SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:203:0x0618 -> B:194:0x05f4). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:235:0x06bf -> B:227:0x069e). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:257:0x070f -> B:247:0x06e6). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int k(java.lang.Object r40, byte[] r41, int r42, int r43, int r44, com.google.android.gms.internal.measurement.C0503u2 r45) {
        /*
            Method dump skipped, instruction units count: 3410
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.C0415f3.k(java.lang.Object, byte[], int, int, int, com.google.android.gms.internal.measurement.u2):int");
    }

    public final Object m(int i6, int i7, Object obj) {
        InterfaceC0457m3 interfaceC0457m3E = E(i7);
        if (!z(i6, i7, obj)) {
            return interfaceC0457m3E.a();
        }
        Object object = f6800n.getObject(obj, w(i7) & 1048575);
        if (G(object)) {
            return object;
        }
        I2 i2A = interfaceC0457m3E.a();
        if (object != null) {
            interfaceC0457m3E.b(i2A, object);
        }
        return i2A;
    }

    public final Object n(int i6, Object obj) {
        InterfaceC0457m3 interfaceC0457m3E = E(i6);
        long jW = w(i6) & 1048575;
        if (!A(i6, obj)) {
            return interfaceC0457m3E.a();
        }
        Object object = f6800n.getObject(obj, jW);
        if (G(object)) {
            return object;
        }
        I2 i2A = interfaceC0457m3E.a();
        if (object != null) {
            interfaceC0457m3E.b(i2A, object);
        }
        return i2A;
    }

    public final void p(int i6, int i7, Object obj, Object obj2) {
        f6800n.putObject(obj, w(i7) & 1048575, obj2);
        AbstractC0492s3.c(i6, this.f6801a[i7 + 2] & 1048575, obj);
    }

    public final void r(Object obj, int i6, Object obj2) {
        f6800n.putObject(obj, w(i6) & 1048575, obj2);
        u(i6, obj);
    }

    public final void s(Object obj, Object obj2, int i6) {
        if (A(i6, obj2)) {
            long jW = w(i6) & 1048575;
            Unsafe unsafe = f6800n;
            Object object = unsafe.getObject(obj2, jW);
            if (object == null) {
                throw new IllegalStateException("Source subfield " + this.f6801a[i6] + " is present but null: " + String.valueOf(obj2));
            }
            InterfaceC0457m3 interfaceC0457m3E = E(i6);
            if (!A(i6, obj)) {
                if (G(object)) {
                    I2 i2A = interfaceC0457m3E.a();
                    interfaceC0457m3E.b(i2A, object);
                    unsafe.putObject(obj, jW, i2A);
                } else {
                    unsafe.putObject(obj, jW, object);
                }
                u(i6, obj);
                return;
            }
            Object object2 = unsafe.getObject(obj, jW);
            if (!G(object2)) {
                I2 i2A2 = interfaceC0457m3E.a();
                interfaceC0457m3E.b(i2A2, object2);
                unsafe.putObject(obj, jW, i2A2);
                object2 = i2A2;
            }
            interfaceC0457m3E.b(object2, object);
        }
    }

    public final boolean t(Object obj, int i6, int i7, int i8, int i9) {
        return i7 == 1048575 ? A(i6, obj) : (i8 & i9) != 0;
    }

    public final void u(int i6, Object obj) {
        int i7 = this.f6801a[i6 + 2];
        long j6 = 1048575 & i7;
        if (j6 == 1048575) {
            return;
        }
        AbstractC0492s3.c((1 << (i7 >>> 20)) | AbstractC0492s3.f6953c.e(j6, obj), j6, obj);
    }

    public final void v(Object obj, int i6, Object obj2) {
        int[] iArr = this.f6801a;
        int i7 = iArr[i6];
        if (z(i7, i6, obj2)) {
            long jW = w(i6) & 1048575;
            Unsafe unsafe = f6800n;
            Object object = unsafe.getObject(obj2, jW);
            if (object == null) {
                throw new IllegalStateException("Source subfield " + iArr[i6] + " is present but null: " + String.valueOf(obj2));
            }
            InterfaceC0457m3 interfaceC0457m3E = E(i6);
            if (!z(i7, i6, obj)) {
                if (G(object)) {
                    I2 i2A = interfaceC0457m3E.a();
                    interfaceC0457m3E.b(i2A, object);
                    unsafe.putObject(obj, jW, i2A);
                } else {
                    unsafe.putObject(obj, jW, object);
                }
                AbstractC0492s3.c(i7, iArr[i6 + 2] & 1048575, obj);
                return;
            }
            Object object2 = unsafe.getObject(obj, jW);
            if (!G(object2)) {
                I2 i2A2 = interfaceC0457m3E.a();
                interfaceC0457m3E.b(i2A2, object2);
                unsafe.putObject(obj, jW, i2A2);
                object2 = i2A2;
            }
            interfaceC0457m3E.b(object2, object);
        }
    }

    public final int w(int i6) {
        return this.f6801a[i6 + 1];
    }

    public final boolean z(int i6, int i7, Object obj) {
        return AbstractC0492s3.f6953c.e((long) (this.f6801a[i7 + 2] & 1048575), obj) == i6;
    }
}
