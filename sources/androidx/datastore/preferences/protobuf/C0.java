package androidx.datastore.preferences.protobuf;

import java.lang.reflect.Field;
import java.nio.Buffer;
import java.nio.ByteOrder;
import java.security.AccessController;
import java.util.logging.Level;
import java.util.logging.Logger;
import sun.misc.Unsafe;

/* JADX INFO: loaded from: classes.dex */
public abstract class C0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Unsafe f5361a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Class f5362b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final B0 f5363c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final boolean f5364d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final boolean f5365e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final long f5366f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final boolean f5367g;

    static {
        Unsafe unsafeM = m();
        f5361a = unsafeM;
        f5362b = AbstractC0270d.f5437a;
        boolean zF = f(Long.TYPE);
        boolean zF2 = f(Integer.TYPE);
        char c6 = 1;
        int i6 = 0;
        B0 a02 = null;
        if (unsafeM != null) {
            if (!AbstractC0270d.a()) {
                a02 = new A0(unsafeM);
            } else if (zF) {
                a02 = new z0(unsafeM, c6 == true ? 1 : 0);
            } else if (zF2) {
                a02 = new z0(unsafeM, i6);
            }
        }
        f5363c = a02;
        f5364d = a02 == null ? false : a02.s();
        f5365e = a02 == null ? false : a02.r();
        f5366f = c(byte[].class);
        c(boolean[].class);
        d(boolean[].class);
        c(int[].class);
        d(int[].class);
        c(long[].class);
        d(long[].class);
        c(float[].class);
        d(float[].class);
        c(double[].class);
        d(double[].class);
        c(Object[].class);
        d(Object[].class);
        Field fieldE = e();
        if (fieldE != null && a02 != null) {
            a02.j(fieldE);
        }
        f5367g = ByteOrder.nativeOrder() == ByteOrder.BIG_ENDIAN;
    }

    public static void a(Throwable th) {
        Logger.getLogger(C0.class.getName()).log(Level.WARNING, "platform method missing - proto runtime falling back to safer methods: " + th);
    }

    public static Object b(Class cls) {
        try {
            return f5361a.allocateInstance(cls);
        } catch (InstantiationException e6) {
            throw new IllegalStateException(e6);
        }
    }

    public static int c(Class cls) {
        if (f5365e) {
            return f5363c.a(cls);
        }
        return -1;
    }

    public static void d(Class cls) {
        if (f5365e) {
            f5363c.b(cls);
        }
    }

    public static Field e() {
        Field declaredField;
        Field declaredField2;
        if (AbstractC0270d.a()) {
            try {
                declaredField2 = Buffer.class.getDeclaredField("effectiveDirectAddress");
            } catch (Throwable unused) {
                declaredField2 = null;
            }
            if (declaredField2 != null) {
                return declaredField2;
            }
        }
        try {
            declaredField = Buffer.class.getDeclaredField("address");
        } catch (Throwable unused2) {
            declaredField = null;
        }
        if (declaredField == null || declaredField.getType() != Long.TYPE) {
            return null;
        }
        return declaredField;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static boolean f(Class cls) {
        if (!AbstractC0270d.a()) {
            return false;
        }
        try {
            Class cls2 = f5362b;
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

    public static byte g(byte[] bArr, long j6) {
        return f5363c.d(f5366f + j6, bArr);
    }

    public static byte h(long j6, Object obj) {
        return (byte) ((f5363c.g((-4) & j6, obj) >>> ((int) (((~j6) & 3) << 3))) & 255);
    }

    public static byte i(long j6, Object obj) {
        return (byte) ((f5363c.g((-4) & j6, obj) >>> ((int) ((j6 & 3) << 3))) & 255);
    }

    public static int j(long j6, Object obj) {
        return f5363c.g(j6, obj);
    }

    public static long k(long j6, Object obj) {
        return f5363c.h(j6, obj);
    }

    public static Object l(long j6, Object obj) {
        return f5363c.i(j6, obj);
    }

    public static Unsafe m() {
        try {
            return (Unsafe) AccessController.doPrivileged(new y0());
        } catch (Throwable unused) {
            return null;
        }
    }

    public static void n(byte[] bArr, long j6, byte b6) {
        f5363c.l(bArr, f5366f + j6, b6);
    }

    public static void o(Object obj, long j6, byte b6) {
        long j7 = (-4) & j6;
        int iG = f5363c.g(j7, obj);
        int i6 = ((~((int) j6)) & 3) << 3;
        q(((255 & b6) << i6) | (iG & (~(255 << i6))), j7, obj);
    }

    public static void p(Object obj, long j6, byte b6) {
        long j7 = (-4) & j6;
        int i6 = (((int) j6) & 3) << 3;
        q(((255 & b6) << i6) | (f5363c.g(j7, obj) & (~(255 << i6))), j7, obj);
    }

    public static void q(int i6, long j6, Object obj) {
        f5363c.o(i6, j6, obj);
    }

    public static void r(Object obj, long j6, long j7) {
        f5363c.p(obj, j6, j7);
    }

    public static void s(long j6, Object obj, Object obj2) {
        f5363c.q(j6, obj, obj2);
    }
}
