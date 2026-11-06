package com.google.android.gms.internal.measurement;

import java.lang.reflect.Field;
import java.nio.Buffer;
import java.util.logging.Level;
import java.util.logging.Logger;
import sun.misc.Unsafe;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.r3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0486r3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Unsafe f6941a;

    public final void a(int i6, long j6, Object obj) {
        this.f6941a.putInt(obj, j6, i6);
    }

    public final void b(Object obj, long j6, long j7) {
        this.f6941a.putLong(obj, j6, j7);
    }

    public final boolean c() {
        Unsafe unsafe = this.f6941a;
        if (unsafe == null) {
            return false;
        }
        try {
            Class<?> cls = unsafe.getClass();
            cls.getMethod("objectFieldOffset", Field.class);
            cls.getMethod("arrayBaseOffset", Class.class);
            cls.getMethod("arrayIndexScale", Class.class);
            Class<?> cls2 = Long.TYPE;
            cls.getMethod("getInt", Object.class, cls2);
            cls.getMethod("putInt", Object.class, cls2, Integer.TYPE);
            cls.getMethod("getLong", Object.class, cls2);
            cls.getMethod("putLong", Object.class, cls2, cls2);
            cls.getMethod("getObject", Object.class, cls2);
            cls.getMethod("putObject", Object.class, cls2, Object.class);
            return true;
        } catch (Throwable th) {
            Unsafe unsafe2 = AbstractC0492s3.f6951a;
            Logger.getLogger(AbstractC0492s3.class.getName()).logp(Level.WARNING, "com.google.protobuf.UnsafeUtil", "logMissingMethod", "platform method missing - proto runtime falling back to safer methods: ".concat(String.valueOf(th)));
            return false;
        }
    }

    public final boolean d() {
        Field declaredField;
        Field declaredField2;
        Unsafe unsafe = this.f6941a;
        if (unsafe == null) {
            return false;
        }
        try {
            Class<?> cls = unsafe.getClass();
            cls.getMethod("objectFieldOffset", Field.class);
            cls.getMethod("getLong", Object.class, Long.TYPE);
            Unsafe unsafe2 = AbstractC0492s3.f6951a;
            Field field = null;
            try {
                declaredField = Buffer.class.getDeclaredField("effectiveDirectAddress");
            } catch (Throwable unused) {
                declaredField = null;
            }
            if (declaredField != null) {
                field = declaredField;
            } else {
                try {
                    declaredField2 = Buffer.class.getDeclaredField("address");
                } catch (Throwable unused2) {
                    declaredField2 = null;
                }
                if (declaredField2 != null) {
                    if (declaredField2.getType() == Long.TYPE) {
                        field = declaredField2;
                    }
                }
            }
            return field != null;
        } catch (Throwable th) {
            Unsafe unsafe3 = AbstractC0492s3.f6951a;
            Logger.getLogger(AbstractC0492s3.class.getName()).logp(Level.WARNING, "com.google.protobuf.UnsafeUtil", "logMissingMethod", "platform method missing - proto runtime falling back to safer methods: ".concat(String.valueOf(th)));
            return false;
        }
    }

    public final int e(long j6, Object obj) {
        return this.f6941a.getInt(obj, j6);
    }

    public final long f(long j6, Object obj) {
        return this.f6941a.getLong(obj, j6);
    }
}
