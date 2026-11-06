package androidx.datastore.preferences.protobuf;

import java.lang.reflect.Field;
import sun.misc.Unsafe;

/* JADX INFO: loaded from: classes.dex */
public final class A0 extends B0 {
    @Override // androidx.datastore.preferences.protobuf.B0
    public final boolean c(long j6, Object obj) {
        return this.f5360a.getBoolean(obj, j6);
    }

    @Override // androidx.datastore.preferences.protobuf.B0
    public final byte d(long j6, Object obj) {
        return this.f5360a.getByte(obj, j6);
    }

    @Override // androidx.datastore.preferences.protobuf.B0
    public final double e(long j6, Object obj) {
        return this.f5360a.getDouble(obj, j6);
    }

    @Override // androidx.datastore.preferences.protobuf.B0
    public final float f(long j6, Object obj) {
        return this.f5360a.getFloat(obj, j6);
    }

    @Override // androidx.datastore.preferences.protobuf.B0
    public final void k(Object obj, long j6, boolean z5) {
        this.f5360a.putBoolean(obj, j6, z5);
    }

    @Override // androidx.datastore.preferences.protobuf.B0
    public final void l(Object obj, long j6, byte b6) {
        this.f5360a.putByte(obj, j6, b6);
    }

    @Override // androidx.datastore.preferences.protobuf.B0
    public final void m(Object obj, long j6, double d6) {
        this.f5360a.putDouble(obj, j6, d6);
    }

    @Override // androidx.datastore.preferences.protobuf.B0
    public final void n(Object obj, long j6, float f6) {
        this.f5360a.putFloat(obj, j6, f6);
    }

    @Override // androidx.datastore.preferences.protobuf.B0
    public final boolean r() {
        if (!super.r()) {
            return false;
        }
        try {
            Class<?> cls = this.f5360a.getClass();
            Class<?> cls2 = Long.TYPE;
            cls.getMethod("getByte", Object.class, cls2);
            cls.getMethod("putByte", Object.class, cls2, Byte.TYPE);
            cls.getMethod("getBoolean", Object.class, cls2);
            cls.getMethod("putBoolean", Object.class, cls2, Boolean.TYPE);
            cls.getMethod("getFloat", Object.class, cls2);
            cls.getMethod("putFloat", Object.class, cls2, Float.TYPE);
            cls.getMethod("getDouble", Object.class, cls2);
            cls.getMethod("putDouble", Object.class, cls2, Double.TYPE);
            return true;
        } catch (Throwable th) {
            C0.a(th);
            return false;
        }
    }

    @Override // androidx.datastore.preferences.protobuf.B0
    public final boolean s() {
        Unsafe unsafe = this.f5360a;
        if (unsafe != null) {
            try {
                Class<?> cls = unsafe.getClass();
                cls.getMethod("objectFieldOffset", Field.class);
                Class<?> cls2 = Long.TYPE;
                cls.getMethod("getLong", Object.class, cls2);
                if (C0.e() != null) {
                    try {
                        Class<?> cls3 = unsafe.getClass();
                        cls3.getMethod("getByte", cls2);
                        cls3.getMethod("putByte", cls2, Byte.TYPE);
                        cls3.getMethod("getInt", cls2);
                        cls3.getMethod("putInt", cls2, Integer.TYPE);
                        cls3.getMethod("getLong", cls2);
                        cls3.getMethod("putLong", cls2, cls2);
                        cls3.getMethod("copyMemory", cls2, cls2, cls2);
                        cls3.getMethod("copyMemory", Object.class, cls2, Object.class, cls2, cls2);
                        return true;
                    } catch (Throwable th) {
                        C0.a(th);
                        return false;
                    }
                }
            } catch (Throwable th2) {
                C0.a(th2);
            }
        }
        return false;
    }
}
