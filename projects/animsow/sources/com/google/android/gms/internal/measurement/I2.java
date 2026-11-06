package com.google.android.gms.internal.measurement;

import d.AbstractC0628i;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import p1.C1243i;

/* JADX INFO: loaded from: classes.dex */
public abstract class I2 extends AbstractC0474p2 {
    private static Map<Class<?>, I2> zzc = new ConcurrentHashMap();
    protected C0475p3 zzb;
    private int zzd;

    public I2() {
        this.zza = 0;
        this.zzd = -1;
        this.zzb = C0475p3.f6922f;
    }

    public static I2 d(Class cls) {
        I2 i22 = zzc.get(cls);
        if (i22 == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                i22 = zzc.get(cls);
            } catch (ClassNotFoundException e6) {
                throw new IllegalStateException("Class initialization cannot fail.", e6);
            }
        }
        if (i22 == null) {
            i22 = (I2) ((I2) AbstractC0492s3.b(cls)).e(6);
            if (i22 == null) {
                throw new IllegalStateException();
            }
            zzc.put(cls, i22);
        }
        return i22;
    }

    public static Object f(Object obj, Method method, Object... objArr) {
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

    public static void h(Class cls, I2 i22) {
        i22.n();
        zzc.put(cls, i22);
    }

    public static final boolean i(I2 i22, boolean z5) {
        byte bByteValue = ((Byte) i22.e(1)).byteValue();
        if (bByteValue == 1) {
            return true;
        }
        if (bByteValue == 0) {
            return false;
        }
        C0445k3 c0445k3 = C0445k3.f6859c;
        c0445k3.getClass();
        boolean zD = c0445k3.a(i22.getClass()).d(i22);
        if (z5) {
            i22.e(2);
        }
        return zD;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC0474p2
    public final int a(InterfaceC0457m3 interfaceC0457m3) {
        if (o()) {
            if (interfaceC0457m3 == null) {
                C0445k3 c0445k3 = C0445k3.f6859c;
                c0445k3.getClass();
                interfaceC0457m3 = c0445k3.a(getClass());
            }
            int iC = interfaceC0457m3.c(this);
            if (iC >= 0) {
                return iC;
            }
            throw new IllegalStateException(AbstractC0628i.f("serialized size must be non-negative, was ", iC));
        }
        int i6 = this.zzd;
        if ((i6 & Integer.MAX_VALUE) != Integer.MAX_VALUE) {
            return i6 & Integer.MAX_VALUE;
        }
        if (interfaceC0457m3 == null) {
            C0445k3 c0445k32 = C0445k3.f6859c;
            c0445k32.getClass();
            interfaceC0457m3 = c0445k32.a(getClass());
        }
        int iC2 = interfaceC0457m3.c(this);
        j(iC2);
        return iC2;
    }

    public abstract Object e(int i6);

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        C0445k3 c0445k3 = C0445k3.f6859c;
        c0445k3.getClass();
        return c0445k3.a(getClass()).g(this, (I2) obj);
    }

    public final void g(A2 a22) {
        C0445k3 c0445k3 = C0445k3.f6859c;
        c0445k3.getClass();
        InterfaceC0457m3 interfaceC0457m3A = c0445k3.a(getClass());
        C1243i c1243i = a22.f6443d;
        if (c1243i == null) {
            c1243i = new C1243i(a22);
        }
        interfaceC0457m3A.f(this, c1243i);
    }

    public final int hashCode() {
        if (o()) {
            C0445k3 c0445k3 = C0445k3.f6859c;
            c0445k3.getClass();
            return c0445k3.a(getClass()).h(this);
        }
        if (this.zza == 0) {
            C0445k3 c0445k32 = C0445k3.f6859c;
            c0445k32.getClass();
            this.zza = c0445k32.a(getClass()).h(this);
        }
        return this.zza;
    }

    public final void j(int i6) {
        if (i6 < 0) {
            throw new IllegalStateException(AbstractC0628i.f("serialized size must be non-negative, was ", i6));
        }
        this.zzd = (i6 & Integer.MAX_VALUE) | (this.zzd & Integer.MIN_VALUE);
    }

    public final H2 k() {
        return (H2) e(5);
    }

    public final H2 l() {
        H2 h22 = (H2) e(5);
        h22.d(this);
        return h22;
    }

    public final void m() {
        C0445k3 c0445k3 = C0445k3.f6859c;
        c0445k3.getClass();
        c0445k3.a(getClass()).i(this);
        n();
    }

    public final void n() {
        this.zzd &= Integer.MAX_VALUE;
    }

    public final boolean o() {
        return (this.zzd & Integer.MIN_VALUE) != 0;
    }

    public final String toString() {
        String string = super.toString();
        char[] cArr = AbstractC0409e3.f6792a;
        StringBuilder sb = new StringBuilder();
        sb.append("# ");
        sb.append(string);
        AbstractC0409e3.b(this, sb, 0);
        return sb.toString();
    }
}
