package androidx.datastore.preferences.protobuf;

import d.AbstractC0628i;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes.dex */
public abstract class C extends AbstractC0266b {
    private static final int MEMOIZED_SERIALIZED_SIZE_MASK = Integer.MAX_VALUE;
    private static final int MUTABLE_FLAG_MASK = Integer.MIN_VALUE;
    static final int UNINITIALIZED_HASH_CODE = 0;
    static final int UNINITIALIZED_SERIALIZED_SIZE = Integer.MAX_VALUE;
    private static Map<Object, C> defaultInstanceMap = new ConcurrentHashMap();
    private int memoizedSerializedSize;
    protected t0 unknownFields;

    public C() {
        this.memoizedHashCode = 0;
        this.memoizedSerializedSize = -1;
        this.unknownFields = t0.f5516f;
    }

    public static C g(Class cls) {
        C c6 = defaultInstanceMap.get(cls);
        if (c6 == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                c6 = defaultInstanceMap.get(cls);
            } catch (ClassNotFoundException e6) {
                throw new IllegalStateException("Class initialization cannot fail.", e6);
            }
        }
        if (c6 == null) {
            c6 = (C) ((C) C0.b(cls)).f(6);
            if (c6 == null) {
                throw new IllegalStateException();
            }
            defaultInstanceMap.put(cls, c6);
        }
        return c6;
    }

    public static Object h(Object obj, Method method, Object... objArr) {
        try {
            return method.invoke(obj, objArr);
        } catch (IllegalAccessException e6) {
            throw new RuntimeException("Couldn't use Java reflection to implement protocol message reflection.", e6);
        } catch (InvocationTargetException e7) {
            Throwable cause = e7.getCause();
            if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            }
            if (cause instanceof Error) {
                throw ((Error) cause);
            }
            throw new RuntimeException("Unexpected exception thrown by generated accessor method.", cause);
        }
    }

    public static final boolean i(C c6, boolean z5) {
        byte bByteValue = ((Byte) c6.f(1)).byteValue();
        if (bByteValue == 1) {
            return true;
        }
        if (bByteValue == 0) {
            return false;
        }
        C0277g0 c0277g0 = C0277g0.f5444c;
        c0277g0.getClass();
        boolean zA = c0277g0.a(c6.getClass()).a(c6);
        if (z5) {
            c6.f(2);
        }
        return zA;
    }

    public static void m(Class cls, C c6) {
        c6.k();
        defaultInstanceMap.put(cls, c6);
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0266b
    public final int a() {
        return b(null);
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0266b
    public final int b(InterfaceC0283j0 interfaceC0283j0) {
        if (j()) {
            if (interfaceC0283j0 == null) {
                C0277g0 c0277g0 = C0277g0.f5444c;
                c0277g0.getClass();
                interfaceC0283j0 = c0277g0.a(getClass());
            }
            int iF = interfaceC0283j0.f(this);
            if (iF >= 0) {
                return iF;
            }
            throw new IllegalStateException(AbstractC0628i.f("serialized size must be non-negative, was ", iF));
        }
        int i6 = this.memoizedSerializedSize;
        if ((i6 & Integer.MAX_VALUE) != Integer.MAX_VALUE) {
            return i6 & Integer.MAX_VALUE;
        }
        if (interfaceC0283j0 == null) {
            C0277g0 c0277g02 = C0277g0.f5444c;
            c0277g02.getClass();
            interfaceC0283j0 = c0277g02.a(getClass());
        }
        int iF2 = interfaceC0283j0.f(this);
        n(iF2);
        return iF2;
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0266b
    public final void c(AbstractC0292q abstractC0292q) {
        C0277g0 c0277g0 = C0277g0.f5444c;
        c0277g0.getClass();
        InterfaceC0283j0 interfaceC0283j0A = c0277g0.a(getClass());
        L3.c cVar = abstractC0292q.f5505c;
        if (cVar == null) {
            cVar = new L3.c(abstractC0292q);
        }
        interfaceC0283j0A.c(this, cVar);
    }

    public final void d() {
        this.memoizedHashCode = 0;
    }

    public final void e() {
        n(Integer.MAX_VALUE);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        C0277g0 c0277g0 = C0277g0.f5444c;
        c0277g0.getClass();
        return c0277g0.a(getClass()).e(this, (C) obj);
    }

    public abstract Object f(int i6);

    public final int hashCode() {
        if (j()) {
            C0277g0 c0277g0 = C0277g0.f5444c;
            c0277g0.getClass();
            return c0277g0.a(getClass()).i(this);
        }
        if (this.memoizedHashCode == 0) {
            C0277g0 c0277g02 = C0277g0.f5444c;
            c0277g02.getClass();
            this.memoizedHashCode = c0277g02.a(getClass()).i(this);
        }
        return this.memoizedHashCode;
    }

    public final boolean j() {
        return (this.memoizedSerializedSize & MUTABLE_FLAG_MASK) != 0;
    }

    public final void k() {
        this.memoizedSerializedSize &= Integer.MAX_VALUE;
    }

    public final C l() {
        return (C) f(4);
    }

    public final void n(int i6) {
        if (i6 < 0) {
            throw new IllegalStateException(AbstractC0628i.f("serialized size must be non-negative, was ", i6));
        }
        this.memoizedSerializedSize = (i6 & Integer.MAX_VALUE) | (this.memoizedSerializedSize & MUTABLE_FLAG_MASK);
    }

    public final String toString() {
        String string = super.toString();
        char[] cArr = Z.f5416a;
        StringBuilder sb = new StringBuilder();
        sb.append("# ");
        sb.append(string);
        Z.c(this, sb, 0);
        return sb.toString();
    }
}
