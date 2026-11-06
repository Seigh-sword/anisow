package androidx.datastore.preferences.protobuf;

import java.lang.reflect.Field;
import sun.misc.Unsafe;

/* JADX INFO: loaded from: classes.dex */
public abstract class B0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Unsafe f5360a;

    public B0(Unsafe unsafe) {
        this.f5360a = unsafe;
    }

    public final int a(Class cls) {
        return this.f5360a.arrayBaseOffset(cls);
    }

    public final int b(Class cls) {
        return this.f5360a.arrayIndexScale(cls);
    }

    public abstract boolean c(long j6, Object obj);

    public abstract byte d(long j6, Object obj);

    public abstract double e(long j6, Object obj);

    public abstract float f(long j6, Object obj);

    public final int g(long j6, Object obj) {
        return this.f5360a.getInt(obj, j6);
    }

    public final long h(long j6, Object obj) {
        return this.f5360a.getLong(obj, j6);
    }

    public final Object i(long j6, Object obj) {
        return this.f5360a.getObject(obj, j6);
    }

    public final long j(Field field) {
        return this.f5360a.objectFieldOffset(field);
    }

    public abstract void k(Object obj, long j6, boolean z5);

    public abstract void l(Object obj, long j6, byte b6);

    public abstract void m(Object obj, long j6, double d6);

    public abstract void n(Object obj, long j6, float f6);

    public final void o(int i6, long j6, Object obj) {
        this.f5360a.putInt(obj, j6, i6);
    }

    public final void p(Object obj, long j6, long j7) {
        this.f5360a.putLong(obj, j6, j7);
    }

    public final void q(long j6, Object obj, Object obj2) {
        this.f5360a.putObject(obj, j6, obj2);
    }

    public boolean r() {
        Unsafe unsafe = this.f5360a;
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
            C0.a(th);
            return false;
        }
    }

    public abstract boolean s();
}
