package com.google.android.gms.internal.measurement;

import java.security.AccessController;
import sun.misc.Unsafe;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.s3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0492s3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Unsafe f6951a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Class f6952b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final C0481q3 f6953c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final boolean f6954d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final boolean f6955e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final long f6956f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final boolean f6957g;

    /* JADX WARN: Removed duplicated region for block: B:8:0x002b  */
    static {
        /*
            sun.misc.Unsafe r0 = j()
            com.google.android.gms.internal.measurement.AbstractC0492s3.f6951a = r0
            java.lang.Class r1 = com.google.android.gms.internal.measurement.AbstractC0491s2.f6950a
            com.google.android.gms.internal.measurement.AbstractC0492s3.f6952b = r1
            java.lang.Class r1 = java.lang.Long.TYPE
            boolean r1 = q(r1)
            java.lang.Class r2 = java.lang.Integer.TYPE
            boolean r2 = q(r2)
            r3 = 0
            r4 = 1
            r5 = 0
            if (r0 == 0) goto L2b
            if (r1 == 0) goto L23
            com.google.android.gms.internal.measurement.q3 r1 = new com.google.android.gms.internal.measurement.q3
            r1.<init>(r0, r4)
            goto L2c
        L23:
            if (r2 == 0) goto L2b
            com.google.android.gms.internal.measurement.q3 r1 = new com.google.android.gms.internal.measurement.q3
            r1.<init>(r0, r5)
            goto L2c
        L2b:
            r1 = r3
        L2c:
            com.google.android.gms.internal.measurement.AbstractC0492s3.f6953c = r1
            if (r1 != 0) goto L32
            r0 = r5
            goto L36
        L32:
            boolean r0 = r1.d()
        L36:
            com.google.android.gms.internal.measurement.AbstractC0492s3.f6954d = r0
            if (r1 != 0) goto L3c
            r0 = r5
            goto L40
        L3c:
            boolean r0 = r1.c()
        L40:
            com.google.android.gms.internal.measurement.AbstractC0492s3.f6955e = r0
            java.lang.Class<byte[]> r0 = byte[].class
            int r0 = i(r0)
            long r6 = (long) r0
            com.google.android.gms.internal.measurement.AbstractC0492s3.f6956f = r6
            java.lang.Class<boolean[]> r0 = boolean[].class
            i(r0)
            l(r0)
            java.lang.Class<int[]> r0 = int[].class
            i(r0)
            l(r0)
            java.lang.Class<long[]> r0 = long[].class
            i(r0)
            l(r0)
            java.lang.Class<float[]> r0 = float[].class
            i(r0)
            l(r0)
            java.lang.Class<double[]> r0 = double[].class
            i(r0)
            l(r0)
            java.lang.Class<java.lang.Object[]> r0 = java.lang.Object[].class
            i(r0)
            l(r0)
            java.lang.Class<java.nio.Buffer> r0 = java.nio.Buffer.class
            java.lang.String r2 = "effectiveDirectAddress"
            java.lang.reflect.Field r2 = r0.getDeclaredField(r2)     // Catch: java.lang.Throwable -> L84
            goto L85
        L84:
            r2 = r3
        L85:
            if (r2 == 0) goto L89
            r3 = r2
            goto L9c
        L89:
            java.lang.String r2 = "address"
            java.lang.reflect.Field r0 = r0.getDeclaredField(r2)     // Catch: java.lang.Throwable -> L90
            goto L91
        L90:
            r0 = r3
        L91:
            if (r0 == 0) goto L9c
            java.lang.Class r2 = r0.getType()
            java.lang.Class r6 = java.lang.Long.TYPE
            if (r2 != r6) goto L9c
            r3 = r0
        L9c:
            if (r3 == 0) goto La6
            if (r1 != 0) goto La1
            goto La6
        La1:
            sun.misc.Unsafe r0 = r1.f6941a
            r0.objectFieldOffset(r3)
        La6:
            java.nio.ByteOrder r0 = java.nio.ByteOrder.nativeOrder()
            java.nio.ByteOrder r1 = java.nio.ByteOrder.BIG_ENDIAN
            if (r0 != r1) goto Laf
            goto Lb0
        Laf:
            r4 = r5
        Lb0:
            com.google.android.gms.internal.measurement.AbstractC0492s3.f6957g = r4
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.AbstractC0492s3.<clinit>():void");
    }

    public static double a(long j6, Object obj) {
        C0481q3 c0481q3 = f6953c;
        switch (c0481q3.f6930b) {
        }
        return Double.longBitsToDouble(c0481q3.f(j6, obj));
    }

    public static Object b(Class cls) {
        try {
            return f6951a.allocateInstance(cls);
        } catch (InstantiationException e6) {
            throw new IllegalStateException(e6);
        }
    }

    public static void c(int i6, long j6, Object obj) {
        f6953c.a(i6, j6, obj);
    }

    public static void d(long j6, Object obj, Object obj2) {
        f6953c.f6941a.putObject(obj, j6, obj2);
    }

    public static void e(Object obj, long j6, double d6) {
        C0481q3 c0481q3 = f6953c;
        switch (c0481q3.f6930b) {
            case com.bumptech.glide.d.f6312l /* 0 */:
                c0481q3.b(obj, j6, Double.doubleToLongBits(d6));
                break;
            default:
                c0481q3.b(obj, j6, Double.doubleToLongBits(d6));
                break;
        }
    }

    public static void f(Object obj, long j6, float f6) {
        C0481q3 c0481q3 = f6953c;
        switch (c0481q3.f6930b) {
            case com.bumptech.glide.d.f6312l /* 0 */:
                c0481q3.a(Float.floatToIntBits(f6), j6, obj);
                break;
            default:
                c0481q3.a(Float.floatToIntBits(f6), j6, obj);
                break;
        }
    }

    public static void g(byte[] bArr, long j6, byte b6) {
        long j7 = f6956f + j6;
        int i6 = f6953c.f6930b;
        boolean z5 = f6957g;
        switch (i6) {
            case com.bumptech.glide.d.f6312l /* 0 */:
                if (!z5) {
                    p(bArr, j7, b6);
                } else {
                    m(bArr, j7, b6);
                }
                break;
            default:
                if (!z5) {
                    p(bArr, j7, b6);
                } else {
                    m(bArr, j7, b6);
                }
                break;
        }
    }

    public static float h(long j6, Object obj) {
        C0481q3 c0481q3 = f6953c;
        switch (c0481q3.f6930b) {
        }
        return Float.intBitsToFloat(c0481q3.e(j6, obj));
    }

    public static int i(Class cls) {
        if (f6955e) {
            return f6953c.f6941a.arrayBaseOffset(cls);
        }
        return -1;
    }

    public static Unsafe j() {
        try {
            return (Unsafe) AccessController.doPrivileged(new C0498t3());
        } catch (Throwable unused) {
            return null;
        }
    }

    public static int k(long j6, Object obj) {
        return f6953c.e(j6, obj);
    }

    public static void l(Class cls) {
        if (f6955e) {
            f6953c.f6941a.arrayIndexScale(cls);
        }
    }

    public static void m(Object obj, long j6, byte b6) {
        long j7 = (-4) & j6;
        int iE = f6953c.e(j7, obj);
        int i6 = ((~((int) j6)) & 3) << 3;
        c(((255 & b6) << i6) | (iE & (~(255 << i6))), j7, obj);
    }

    public static void n(Object obj, long j6, boolean z5) {
        int i6 = f6953c.f6930b;
        boolean z6 = f6957g;
        switch (i6) {
            case com.bumptech.glide.d.f6312l /* 0 */:
                if (!z6) {
                    p(obj, j6, z5 ? (byte) 1 : (byte) 0);
                } else {
                    m(obj, j6, z5 ? (byte) 1 : (byte) 0);
                }
                break;
            default:
                if (!z6) {
                    p(obj, j6, z5 ? (byte) 1 : (byte) 0);
                } else {
                    m(obj, j6, z5 ? (byte) 1 : (byte) 0);
                }
                break;
        }
    }

    public static long o(long j6, Object obj) {
        return f6953c.f(j6, obj);
    }

    public static void p(Object obj, long j6, byte b6) {
        long j7 = (-4) & j6;
        int i6 = (((int) j6) & 3) << 3;
        c(((255 & b6) << i6) | (f6953c.e(j7, obj) & (~(255 << i6))), j7, obj);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static boolean q(Class cls) {
        try {
            Class cls2 = f6952b;
            Class cls3 = Boolean.TYPE;
            cls2.getMethod("peekLong", cls, cls3);
            cls2.getMethod("pokeLong", cls, Long.TYPE, cls3);
            Class cls4 = Integer.TYPE;
            cls2.getMethod("pokeInt", cls, cls4, cls3);
            cls2.getMethod("peekInt", cls, cls3);
            cls2.getMethod("pokeByte", cls, Byte.TYPE);
            cls2.getMethod("peekByte", cls);
            cls2.getMethod("pokeByteArray", cls, byte[].class, cls4, cls4);
            cls2.getMethod("peekByteArray", cls, byte[].class, cls4, cls4);
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }

    public static Object r(long j6, Object obj) {
        return f6953c.f6941a.getObject(obj, j6);
    }

    public static boolean s(long j6, Object obj) {
        C0481q3 c0481q3 = f6953c;
        int i6 = c0481q3.f6930b;
        boolean z5 = f6957g;
        switch (i6) {
            case com.bumptech.glide.d.f6312l /* 0 */:
                if (z5) {
                    if (((byte) (c0481q3.e((-4) & j6, obj) >>> ((int) (((~j6) & 3) << 3)))) == 0) {
                        return false;
                    }
                } else if (((byte) (c0481q3.e((-4) & j6, obj) >>> ((int) ((j6 & 3) << 3)))) == 0) {
                    return false;
                }
            default:
                if (z5) {
                    if (((byte) (c0481q3.e((-4) & j6, obj) >>> ((int) (((~j6) & 3) << 3)))) == 0) {
                        return false;
                    }
                } else if (((byte) (c0481q3.e((-4) & j6, obj) >>> ((int) ((j6 & 3) << 3)))) == 0) {
                    return false;
                }
        }
        return true;
    }
}
