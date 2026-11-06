package m1;

import android.util.Log;
import com.google.android.gms.internal.measurement.C0396c2;
import java.util.HashMap;
import java.util.NavigableMap;
import java.util.Queue;
import java.util.TreeMap;
import t0.AbstractC1332d;

/* JADX INFO: renamed from: m1.h, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1010h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C0396c2 f10451a = new C0396c2(22);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C1005c f10452b = new C1005c(1);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final HashMap f10453c = new HashMap();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final HashMap f10454d = new HashMap();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f10455e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f10456f;

    public C1010h(int i6) {
        this.f10455e = i6;
    }

    public final void a(int i6, Class cls) {
        NavigableMap navigableMapF = f(cls);
        Integer num = (Integer) navigableMapF.get(Integer.valueOf(i6));
        if (num == null) {
            throw new NullPointerException("Tried to decrement empty size, size: " + i6 + ", this: " + this);
        }
        int iIntValue = num.intValue();
        Integer numValueOf = Integer.valueOf(i6);
        if (iIntValue == 1) {
            navigableMapF.remove(numValueOf);
        } else {
            navigableMapF.put(numValueOf, Integer.valueOf(num.intValue() - 1));
        }
    }

    public final void b(int i6) {
        int i7;
        String str;
        while (this.f10456f > i6) {
            Object objO = this.f10451a.O();
            AbstractC1332d.k(objO);
            InterfaceC1003a interfaceC1003aD = d(objO.getClass());
            int i8 = this.f10456f;
            C1007e c1007e = (C1007e) interfaceC1003aD;
            int iA = c1007e.a(objO);
            int i9 = c1007e.f10443a;
            switch (i9) {
                case com.bumptech.glide.d.f6312l /* 0 */:
                    i7 = 1;
                    break;
                default:
                    i7 = 4;
                    break;
            }
            this.f10456f = i8 - (iA * i7);
            a(c1007e.a(objO), objO.getClass());
            String str2 = "ByteArrayPool";
            switch (i9) {
                case com.bumptech.glide.d.f6312l /* 0 */:
                    str = "ByteArrayPool";
                    break;
                default:
                    str = "IntegerArrayPool";
                    break;
            }
            if (Log.isLoggable(str, 2)) {
                switch (i9) {
                    case com.bumptech.glide.d.f6312l /* 0 */:
                        break;
                    default:
                        str2 = "IntegerArrayPool";
                        break;
                }
                Log.v(str2, "evicted: " + c1007e.a(objO));
            }
        }
    }

    public final synchronized Object c(int i6, Class cls) {
        C1009g c1009g;
        int i7;
        try {
            Integer num = (Integer) f(cls).ceilingKey(Integer.valueOf(i6));
            if (num == null || ((i7 = this.f10456f) != 0 && this.f10455e / i7 < 2 && num.intValue() > i6 * 8)) {
                C1005c c1005c = this.f10452b;
                InterfaceC1013k interfaceC1013kS = (InterfaceC1013k) ((Queue) c1005c.f1668w).poll();
                if (interfaceC1013kS == null) {
                    interfaceC1013kS = c1005c.s();
                }
                c1009g = (C1009g) interfaceC1013kS;
                c1009g.f10449b = i6;
            } else {
                C1005c c1005c2 = this.f10452b;
                int iIntValue = num.intValue();
                InterfaceC1013k interfaceC1013kS2 = (InterfaceC1013k) ((Queue) c1005c2.f1668w).poll();
                if (interfaceC1013kS2 == null) {
                    interfaceC1013kS2 = c1005c2.s();
                }
                c1009g = (C1009g) interfaceC1013kS2;
                c1009g.f10449b = iIntValue;
            }
            c1009g.f10450c = cls;
        } catch (Throwable th) {
            throw th;
        }
        return e(c1009g, cls);
    }

    public final InterfaceC1003a d(Class cls) {
        HashMap map = this.f10454d;
        InterfaceC1003a c1007e = (InterfaceC1003a) map.get(cls);
        if (c1007e == null) {
            if (cls.equals(int[].class)) {
                c1007e = new C1007e(1);
            } else {
                if (!cls.equals(byte[].class)) {
                    throw new IllegalArgumentException("No array pool found for: ".concat(cls.getSimpleName()));
                }
                c1007e = new C1007e(0);
            }
            map.put(cls, c1007e);
        }
        return c1007e;
    }

    public final Object e(C1009g c1009g, Class cls) {
        String str;
        Object obj;
        int i6;
        InterfaceC1003a interfaceC1003aD = d(cls);
        Object objE = this.f10451a.E(c1009g);
        if (objE != null) {
            int i7 = this.f10456f;
            C1007e c1007e = (C1007e) interfaceC1003aD;
            int iA = c1007e.a(objE);
            switch (c1007e.f10443a) {
                case com.bumptech.glide.d.f6312l /* 0 */:
                    i6 = 1;
                    break;
                default:
                    i6 = 4;
                    break;
            }
            this.f10456f = i7 - (iA * i6);
            a(c1007e.a(objE), cls);
        }
        if (objE != null) {
            return objE;
        }
        String str2 = "ByteArrayPool";
        int i8 = ((C1007e) interfaceC1003aD).f10443a;
        switch (i8) {
            case com.bumptech.glide.d.f6312l /* 0 */:
                str = "ByteArrayPool";
                break;
            default:
                str = "IntegerArrayPool";
                break;
        }
        if (Log.isLoggable(str, 2)) {
            switch (i8) {
                case com.bumptech.glide.d.f6312l /* 0 */:
                    break;
                default:
                    str2 = "IntegerArrayPool";
                    break;
            }
            Log.v(str2, "Allocated " + c1009g.f10449b + " bytes");
        }
        int i9 = c1009g.f10449b;
        switch (i8) {
            case com.bumptech.glide.d.f6312l /* 0 */:
                obj = new byte[i9];
                break;
            default:
                obj = new int[i9];
                break;
        }
        return obj;
    }

    public final NavigableMap f(Class cls) {
        HashMap map = this.f10453c;
        NavigableMap navigableMap = (NavigableMap) map.get(cls);
        if (navigableMap != null) {
            return navigableMap;
        }
        TreeMap treeMap = new TreeMap();
        map.put(cls, treeMap);
        return treeMap;
    }

    public final synchronized void g(Object obj) {
        int i6;
        Class<?> cls = obj.getClass();
        InterfaceC1003a interfaceC1003aD = d(cls);
        int iA = ((C1007e) interfaceC1003aD).a(obj);
        int iIntValue = 1;
        switch (((C1007e) interfaceC1003aD).f10443a) {
            case com.bumptech.glide.d.f6312l /* 0 */:
                i6 = 1;
                break;
            default:
                i6 = 4;
                break;
        }
        int i7 = i6 * iA;
        if (i7 <= this.f10455e / 2) {
            C1005c c1005c = this.f10452b;
            InterfaceC1013k interfaceC1013kS = (InterfaceC1013k) ((Queue) c1005c.f1668w).poll();
            if (interfaceC1013kS == null) {
                interfaceC1013kS = c1005c.s();
            }
            C1009g c1009g = (C1009g) interfaceC1013kS;
            c1009g.f10449b = iA;
            c1009g.f10450c = cls;
            this.f10451a.M(c1009g, obj);
            NavigableMap navigableMapF = f(cls);
            Integer num = (Integer) navigableMapF.get(Integer.valueOf(c1009g.f10449b));
            Integer numValueOf = Integer.valueOf(c1009g.f10449b);
            if (num != null) {
                iIntValue = 1 + num.intValue();
            }
            navigableMapF.put(numValueOf, Integer.valueOf(iIntValue));
            this.f10456f += i7;
            b(this.f10455e);
        }
    }
}
