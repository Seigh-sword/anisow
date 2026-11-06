package com.google.android.gms.internal.measurement;

import d.AbstractC0628i;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.ServiceConfigurationError;
import java.util.ServiceLoader;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes.dex */
public abstract class F2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final J2 f6592a = new J2();

    public static double a(double d6) {
        if (Double.isNaN(d6)) {
            return 0.0d;
        }
        if (Double.isInfinite(d6) || d6 == 0.0d || d6 == -0.0d) {
            return d6;
        }
        return Math.floor(Math.abs(d6)) * ((double) (d6 > 0.0d ? 1 : -1));
    }

    public static C0405e b(C0405e c0405e, P0.h hVar, C0465o c0465o, Boolean bool, Boolean bool2) {
        C0405e c0405e2 = new C0405e();
        Iterator itX = c0405e.x();
        while (itX.hasNext()) {
            int iIntValue = ((Integer) itX.next()).intValue();
            if (c0405e.w(iIntValue)) {
                InterfaceC0459n interfaceC0459nA = c0465o.a(hVar, Arrays.asList(c0405e.q(iIntValue), new C0417g(Double.valueOf(iIntValue)), c0405e));
                if (interfaceC0459nA.c().equals(bool)) {
                    return c0405e2;
                }
                if (bool2 == null || interfaceC0459nA.c().equals(bool2)) {
                    c0405e2.v(iIntValue, interfaceC0459nA);
                }
            }
        }
        return c0405e2;
    }

    public static InterfaceC0459n c(C0405e c0405e, P0.h hVar, ArrayList arrayList, boolean z5) {
        InterfaceC0459n interfaceC0459nA;
        s("reduce", 1, arrayList);
        u("reduce", 2, arrayList);
        InterfaceC0459n interfaceC0459nJ = hVar.j((InterfaceC0459n) arrayList.get(0));
        if (!(interfaceC0459nJ instanceof AbstractC0435j)) {
            throw new IllegalArgumentException("Callback should be a method");
        }
        if (arrayList.size() == 2) {
            interfaceC0459nA = hVar.j((InterfaceC0459n) arrayList.get(1));
            if (interfaceC0459nA instanceof C0423h) {
                throw new IllegalArgumentException("Failed to parse initial value");
            }
        } else {
            if (c0405e.s() == 0) {
                throw new IllegalStateException("Empty array with no initial value error");
            }
            interfaceC0459nA = null;
        }
        AbstractC0435j abstractC0435j = (AbstractC0435j) interfaceC0459nJ;
        int iS = c0405e.s();
        int i6 = z5 ? 0 : iS - 1;
        int i7 = z5 ? iS - 1 : 0;
        int i8 = z5 ? 1 : -1;
        if (interfaceC0459nA == null) {
            interfaceC0459nA = c0405e.q(i6);
            i6 += i8;
        }
        while ((i7 - i6) * i8 >= 0) {
            if (c0405e.w(i6)) {
                interfaceC0459nA = abstractC0435j.a(hVar, Arrays.asList(interfaceC0459nA, c0405e.q(i6), new C0417g(Double.valueOf(i6)), c0405e));
                if (interfaceC0459nA instanceof C0423h) {
                    throw new IllegalStateException("Reduce operation failed");
                }
                i6 += i8;
            } else {
                i6 += i8;
            }
        }
        return interfaceC0459nA;
    }

    public static InterfaceC0459n d(InterfaceC0429i interfaceC0429i, C0471p c0471p, P0.h hVar, ArrayList arrayList) {
        String str = c0471p.f6918w;
        if (interfaceC0429i.e(str)) {
            InterfaceC0459n interfaceC0459nB = interfaceC0429i.b(str);
            if (interfaceC0459nB instanceof AbstractC0435j) {
                return ((AbstractC0435j) interfaceC0459nB).a(hVar, arrayList);
            }
            throw new IllegalArgumentException(AbstractC0628i.i(str, " is not a function"));
        }
        if (!"hasOwnProperty".equals(str)) {
            throw new IllegalArgumentException(AbstractC0628i.q("Object has no function ", str));
        }
        n("hasOwnProperty", 1, arrayList);
        return interfaceC0429i.e(hVar.j((InterfaceC0459n) arrayList.get(0)).g()) ? InterfaceC0459n.f6890s : InterfaceC0459n.f6891t;
    }

    public static InterfaceC0459n e(O1 o12) {
        if (o12 == null) {
            return InterfaceC0459n.f6885n;
        }
        int i6 = AbstractC0468o2.f6916a[u.h.b(o12.q())];
        if (i6 == 1) {
            return o12.y() ? new C0471p(o12.t()) : InterfaceC0459n.f6892u;
        }
        if (i6 == 2) {
            return o12.x() ? new C0417g(Double.valueOf(o12.p())) : new C0417g(null);
        }
        if (i6 == 3) {
            return o12.w() ? new C0411f(Boolean.valueOf(o12.v())) : new C0411f(null);
        }
        if (i6 != 4) {
            if (i6 != 5) {
                throw new IllegalStateException("Invalid entity: ".concat(String.valueOf(o12)));
            }
            throw new IllegalArgumentException("Unknown type found. Cannot convert entity");
        }
        List listU = o12.u();
        ArrayList arrayList = new ArrayList();
        Iterator it = listU.iterator();
        while (it.hasNext()) {
            arrayList.add(e((O1) it.next()));
        }
        return new C0477q(o12.s(), arrayList);
    }

    public static InterfaceC0459n f(Object obj) {
        if (obj == null) {
            return InterfaceC0459n.f6886o;
        }
        if (obj instanceof String) {
            return new C0471p((String) obj);
        }
        if (obj instanceof Double) {
            return new C0417g((Double) obj);
        }
        if (obj instanceof Long) {
            return new C0417g(Double.valueOf(((Long) obj).doubleValue()));
        }
        if (obj instanceof Integer) {
            return new C0417g(Double.valueOf(((Integer) obj).doubleValue()));
        }
        if (obj instanceof Boolean) {
            return new C0411f((Boolean) obj);
        }
        if (!(obj instanceof Map)) {
            if (!(obj instanceof List)) {
                throw new IllegalArgumentException("Invalid value type");
            }
            C0405e c0405e = new C0405e();
            Iterator it = ((List) obj).iterator();
            while (it.hasNext()) {
                c0405e.r(f(it.next()));
            }
            return c0405e;
        }
        C0453m c0453m = new C0453m();
        Map map = (Map) obj;
        for (Object string : map.keySet()) {
            InterfaceC0459n interfaceC0459nF = f(map.get(string));
            if (string != null) {
                if (!(string instanceof String)) {
                    string = string.toString();
                }
                c0453m.l((String) string, interfaceC0459nF);
            }
        }
        return c0453m;
    }

    public static F g(String str) {
        F f6;
        if (str == null || str.isEmpty()) {
            f6 = null;
        } else {
            f6 = (F) F.f6542H0.get(Integer.valueOf(Integer.parseInt(str)));
        }
        if (f6 != null) {
            return f6;
        }
        throw new IllegalArgumentException(AbstractC0628i.q("Unsupported commandId ", str));
    }

    public static C2 h() {
        String str;
        ClassLoader classLoader = F2.class.getClassLoader();
        if (C2.class.equals(C2.class)) {
            str = "com.google.protobuf.BlazeGeneratedExtensionRegistryLiteLoader";
        } else {
            if (!C2.class.getPackage().equals(F2.class.getPackage())) {
                throw new IllegalArgumentException(C2.class.getName());
            }
            str = C2.class.getPackage().getName() + ".BlazeGenerated" + C2.class.getSimpleName() + "Loader";
        }
        try {
            try {
                try {
                    try {
                        AbstractC0628i.p(Class.forName(str, true, classLoader).getConstructor(new Class[0]).newInstance(new Object[0]));
                        throw null;
                    } catch (InstantiationException e6) {
                        throw new IllegalStateException(e6);
                    }
                } catch (IllegalAccessException e7) {
                    throw new IllegalStateException(e7);
                }
            } catch (NoSuchMethodException e8) {
                throw new IllegalStateException(e8);
            } catch (InvocationTargetException e9) {
                throw new IllegalStateException(e9);
            }
        } catch (ClassNotFoundException unused) {
            Iterator it = ServiceLoader.load(F2.class, classLoader).iterator();
            ArrayList arrayList = new ArrayList();
            while (it.hasNext()) {
                try {
                    AbstractC0628i.p(it.next());
                    throw null;
                } catch (ServiceConfigurationError e10) {
                    Logger.getLogger(A2.class.getName()).logp(Level.SEVERE, "com.google.protobuf.GeneratedExtensionRegistryLoader", "load", "Unable to load ".concat(C2.class.getSimpleName()), (Throwable) e10);
                }
            }
            if (arrayList.size() == 1) {
                return (C2) arrayList.get(0);
            }
            if (arrayList.size() == 0) {
                return null;
            }
            try {
                return (C2) C2.class.getMethod("combine", Collection.class).invoke(null, arrayList);
            } catch (IllegalAccessException e11) {
                throw new IllegalStateException(e11);
            } catch (NoSuchMethodException e12) {
                throw new IllegalStateException(e12);
            } catch (InvocationTargetException e13) {
                throw new IllegalStateException(e13);
            }
        }
    }

    public static Object i(InterfaceC0459n interfaceC0459n) {
        if (InterfaceC0459n.f6886o.equals(interfaceC0459n)) {
            return null;
        }
        if (InterfaceC0459n.f6885n.equals(interfaceC0459n)) {
            return "";
        }
        if (interfaceC0459n instanceof C0453m) {
            return k((C0453m) interfaceC0459n);
        }
        if (!(interfaceC0459n instanceof C0405e)) {
            return !interfaceC0459n.p().isNaN() ? interfaceC0459n.p() : interfaceC0459n.g();
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = ((C0405e) interfaceC0459n).iterator();
        while (true) {
            r rVar = (r) it;
            if (!rVar.hasNext()) {
                return arrayList;
            }
            Object objI = i((InterfaceC0459n) rVar.next());
            if (objI != null) {
                arrayList.add(objI);
            }
        }
    }

    public static String j(AbstractC0527y2 abstractC0527y2) {
        String str;
        StringBuilder sb = new StringBuilder(abstractC0527y2.j());
        for (int i6 = 0; i6 < abstractC0527y2.j(); i6++) {
            int iE = abstractC0527y2.e(i6);
            if (iE == 34) {
                str = "\\\"";
            } else if (iE == 39) {
                str = "\\'";
            } else if (iE != 92) {
                switch (iE) {
                    case Z.j.DOUBLE_FIELD_NUMBER /* 7 */:
                        str = "\\a";
                        break;
                    case Z.j.BYTES_FIELD_NUMBER /* 8 */:
                        str = "\\b";
                        break;
                    case 9:
                        str = "\\t";
                        break;
                    case 10:
                        str = "\\n";
                        break;
                    case 11:
                        str = "\\v";
                        break;
                    case 12:
                        str = "\\f";
                        break;
                    case 13:
                        str = "\\r";
                        break;
                    default:
                        if (iE < 32 || iE > 126) {
                            sb.append('\\');
                            sb.append((char) (((iE >>> 6) & 3) + 48));
                            sb.append((char) (((iE >>> 3) & 7) + 48));
                            iE = (iE & 7) + 48;
                        }
                        sb.append((char) iE);
                        continue;
                        break;
                }
            } else {
                str = "\\\\";
            }
            sb.append(str);
        }
        return sb.toString();
    }

    public static HashMap k(C0453m c0453m) {
        HashMap map = new HashMap();
        c0453m.getClass();
        for (String str : new ArrayList(c0453m.f6879w.keySet())) {
            Object objI = i(c0453m.b(str));
            if (objI != null) {
                map.put(str, objI);
            }
        }
        return map;
    }

    public static void l(P0.h hVar) {
        int iQ = q(hVar.k("runtime.counter").p().doubleValue() + 1.0d);
        if (iQ > 1000000) {
            throw new IllegalStateException("Instructions allowed exceeded");
        }
        hVar.n("runtime.counter", new C0417g(Double.valueOf(iQ)));
    }

    public static void m(F f6, int i6, ArrayList arrayList) {
        n(f6.name(), i6, arrayList);
    }

    public static void n(String str, int i6, List list) {
        if (list.size() == i6) {
            return;
        }
        throw new IllegalArgumentException(str + " operation requires " + i6 + " parameters found " + list.size());
    }

    public static boolean o(byte b6) {
        return b6 > -65;
    }

    public static boolean p(InterfaceC0459n interfaceC0459n, InterfaceC0459n interfaceC0459n2) {
        if (!interfaceC0459n.getClass().equals(interfaceC0459n2.getClass())) {
            return false;
        }
        if ((interfaceC0459n instanceof C0494t) || (interfaceC0459n instanceof C0447l)) {
            return true;
        }
        if (!(interfaceC0459n instanceof C0417g)) {
            return interfaceC0459n instanceof C0471p ? interfaceC0459n.g().equals(interfaceC0459n2.g()) : interfaceC0459n instanceof C0411f ? interfaceC0459n.c().equals(interfaceC0459n2.c()) : interfaceC0459n == interfaceC0459n2;
        }
        if (Double.isNaN(interfaceC0459n.p().doubleValue()) || Double.isNaN(interfaceC0459n2.p().doubleValue())) {
            return false;
        }
        return interfaceC0459n.p().equals(interfaceC0459n2.p());
    }

    public static int q(double d6) {
        if (Double.isNaN(d6) || Double.isInfinite(d6) || d6 == 0.0d) {
            return 0;
        }
        return (int) ((Math.floor(Math.abs(d6)) * ((double) (d6 > 0.0d ? 1 : -1))) % 4.294967296E9d);
    }

    public static void r(F f6, int i6, ArrayList arrayList) {
        s(f6.name(), i6, arrayList);
    }

    public static void s(String str, int i6, List list) {
        if (list.size() >= i6) {
            return;
        }
        throw new IllegalArgumentException(str + " operation requires at least " + i6 + " parameters found " + list.size());
    }

    public static boolean t(InterfaceC0459n interfaceC0459n) {
        if (interfaceC0459n == null) {
            return false;
        }
        Double dP = interfaceC0459n.p();
        return !dP.isNaN() && dP.doubleValue() >= 0.0d && dP.equals(Double.valueOf(Math.floor(dP.doubleValue())));
    }

    public static void u(String str, int i6, ArrayList arrayList) {
        if (arrayList.size() <= i6) {
            return;
        }
        throw new IllegalArgumentException(str + " operation requires at most " + i6 + " parameters found " + arrayList.size());
    }
}
