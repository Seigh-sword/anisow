package androidx.datastore.preferences.protobuf;

import java.util.Arrays;
import java.util.List;
import java.util.logging.Logger;

/* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.k0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0285k0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Class f5467a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final u0 f5468b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final u0 f5469c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final u0 f5470d;

    static {
        Class<?> cls;
        try {
            cls = Class.forName("androidx.datastore.preferences.protobuf.GeneratedMessageV3");
        } catch (Throwable unused) {
            cls = null;
        }
        f5467a = cls;
        f5468b = A(false);
        f5469c = A(true);
        f5470d = new u0();
    }

    public static u0 A(boolean z5) {
        Class<?> cls;
        try {
            cls = Class.forName("androidx.datastore.preferences.protobuf.UnknownFieldSetSchema");
        } catch (Throwable unused) {
            cls = null;
        }
        if (cls == null) {
            return null;
        }
        try {
            return (u0) cls.getConstructor(Boolean.TYPE).newInstance(Boolean.valueOf(z5));
        } catch (Throwable unused2) {
            return null;
        }
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public static void B(u0 u0Var, Object obj, Object obj2) {
        u0Var.getClass();
        C c6 = (C) obj;
        t0 t0Var = c6.unknownFields;
        t0 t0Var2 = ((C) obj2).unknownFields;
        t0 t0Var3 = t0.f5516f;
        if (!t0Var3.equals(t0Var2)) {
            if (t0Var3.equals(t0Var)) {
                int i6 = t0Var.f5517a + t0Var2.f5517a;
                int[] iArrCopyOf = Arrays.copyOf(t0Var.f5518b, i6);
                System.arraycopy(t0Var2.f5518b, 0, iArrCopyOf, t0Var.f5517a, t0Var2.f5517a);
                Object[] objArrCopyOf = Arrays.copyOf(t0Var.f5519c, i6);
                System.arraycopy(t0Var2.f5519c, 0, objArrCopyOf, t0Var.f5517a, t0Var2.f5517a);
                t0Var = new t0(i6, iArrCopyOf, objArrCopyOf, true);
            } else {
                t0Var.getClass();
                if (!t0Var2.equals(t0Var3)) {
                    if (!t0Var.f5521e) {
                        throw new UnsupportedOperationException();
                    }
                    int i7 = t0Var.f5517a + t0Var2.f5517a;
                    t0Var.a(i7);
                    System.arraycopy(t0Var2.f5518b, 0, t0Var.f5518b, t0Var.f5517a, t0Var2.f5517a);
                    System.arraycopy(t0Var2.f5519c, 0, t0Var.f5519c, t0Var.f5517a, t0Var2.f5517a);
                    t0Var.f5517a = i7;
                }
            }
        }
        c6.unknownFields = t0Var;
    }

    public static boolean C(Object obj, Object obj2) {
        return obj == obj2 || (obj != null && obj.equals(obj2));
    }

    public static void D(int i6, List list, L3.c cVar, boolean z5) {
        if (list == null || list.isEmpty()) {
            return;
        }
        int i7 = 0;
        if (!z5) {
            cVar.getClass();
            while (i7 < list.size()) {
                ((AbstractC0292q) cVar.f1734x).C(i6, ((Boolean) list.get(i7)).booleanValue());
                i7++;
            }
            return;
        }
        ((AbstractC0292q) cVar.f1734x).Q(i6, 2);
        int i8 = 0;
        for (int i9 = 0; i9 < list.size(); i9++) {
            ((Boolean) list.get(i9)).getClass();
            Logger logger = AbstractC0292q.f5503d;
            i8++;
        }
        ((AbstractC0292q) cVar.f1734x).S(i8);
        while (i7 < list.size()) {
            ((AbstractC0292q) cVar.f1734x).B(((Boolean) list.get(i7)).booleanValue() ? (byte) 1 : (byte) 0);
            i7++;
        }
    }

    public static void E(int i6, List list, L3.c cVar) {
        if (list == null || list.isEmpty()) {
            return;
        }
        cVar.getClass();
        for (int i7 = 0; i7 < list.size(); i7++) {
            ((AbstractC0292q) cVar.f1734x).E(i6, (AbstractC0280i) list.get(i7));
        }
    }

    public static void F(int i6, List list, L3.c cVar, boolean z5) {
        if (list == null || list.isEmpty()) {
            return;
        }
        int i7 = 0;
        if (!z5) {
            cVar.getClass();
            while (i7 < list.size()) {
                AbstractC0292q abstractC0292q = (AbstractC0292q) cVar.f1734x;
                double dDoubleValue = ((Double) list.get(i7)).doubleValue();
                abstractC0292q.getClass();
                abstractC0292q.I(i6, Double.doubleToRawLongBits(dDoubleValue));
                i7++;
            }
            return;
        }
        ((AbstractC0292q) cVar.f1734x).Q(i6, 2);
        int i8 = 0;
        for (int i9 = 0; i9 < list.size(); i9++) {
            ((Double) list.get(i9)).getClass();
            Logger logger = AbstractC0292q.f5503d;
            i8 += 8;
        }
        ((AbstractC0292q) cVar.f1734x).S(i8);
        while (i7 < list.size()) {
            AbstractC0292q abstractC0292q2 = (AbstractC0292q) cVar.f1734x;
            double dDoubleValue2 = ((Double) list.get(i7)).doubleValue();
            abstractC0292q2.getClass();
            abstractC0292q2.J(Double.doubleToRawLongBits(dDoubleValue2));
            i7++;
        }
    }

    public static void G(int i6, List list, L3.c cVar, boolean z5) {
        if (list == null || list.isEmpty()) {
            return;
        }
        int i7 = 0;
        if (!z5) {
            cVar.getClass();
            while (i7 < list.size()) {
                ((AbstractC0292q) cVar.f1734x).K(i6, ((Integer) list.get(i7)).intValue());
                i7++;
            }
            return;
        }
        ((AbstractC0292q) cVar.f1734x).Q(i6, 2);
        int iN = 0;
        for (int i8 = 0; i8 < list.size(); i8++) {
            iN += AbstractC0292q.n(((Integer) list.get(i8)).intValue());
        }
        ((AbstractC0292q) cVar.f1734x).S(iN);
        while (i7 < list.size()) {
            ((AbstractC0292q) cVar.f1734x).L(((Integer) list.get(i7)).intValue());
            i7++;
        }
    }

    public static void H(int i6, List list, L3.c cVar, boolean z5) {
        if (list == null || list.isEmpty()) {
            return;
        }
        int i7 = 0;
        if (!z5) {
            cVar.getClass();
            while (i7 < list.size()) {
                ((AbstractC0292q) cVar.f1734x).G(i6, ((Integer) list.get(i7)).intValue());
                i7++;
            }
            return;
        }
        ((AbstractC0292q) cVar.f1734x).Q(i6, 2);
        int i8 = 0;
        for (int i9 = 0; i9 < list.size(); i9++) {
            ((Integer) list.get(i9)).getClass();
            Logger logger = AbstractC0292q.f5503d;
            i8 += 4;
        }
        ((AbstractC0292q) cVar.f1734x).S(i8);
        while (i7 < list.size()) {
            ((AbstractC0292q) cVar.f1734x).H(((Integer) list.get(i7)).intValue());
            i7++;
        }
    }

    public static void I(int i6, List list, L3.c cVar, boolean z5) {
        if (list == null || list.isEmpty()) {
            return;
        }
        int i7 = 0;
        if (!z5) {
            cVar.getClass();
            while (i7 < list.size()) {
                ((AbstractC0292q) cVar.f1734x).I(i6, ((Long) list.get(i7)).longValue());
                i7++;
            }
            return;
        }
        ((AbstractC0292q) cVar.f1734x).Q(i6, 2);
        int i8 = 0;
        for (int i9 = 0; i9 < list.size(); i9++) {
            ((Long) list.get(i9)).getClass();
            Logger logger = AbstractC0292q.f5503d;
            i8 += 8;
        }
        ((AbstractC0292q) cVar.f1734x).S(i8);
        while (i7 < list.size()) {
            ((AbstractC0292q) cVar.f1734x).J(((Long) list.get(i7)).longValue());
            i7++;
        }
    }

    public static void J(int i6, List list, L3.c cVar, boolean z5) {
        if (list == null || list.isEmpty()) {
            return;
        }
        int i7 = 0;
        if (!z5) {
            cVar.getClass();
            while (i7 < list.size()) {
                AbstractC0292q abstractC0292q = (AbstractC0292q) cVar.f1734x;
                float fFloatValue = ((Float) list.get(i7)).floatValue();
                abstractC0292q.getClass();
                abstractC0292q.G(i6, Float.floatToRawIntBits(fFloatValue));
                i7++;
            }
            return;
        }
        ((AbstractC0292q) cVar.f1734x).Q(i6, 2);
        int i8 = 0;
        for (int i9 = 0; i9 < list.size(); i9++) {
            ((Float) list.get(i9)).getClass();
            Logger logger = AbstractC0292q.f5503d;
            i8 += 4;
        }
        ((AbstractC0292q) cVar.f1734x).S(i8);
        while (i7 < list.size()) {
            AbstractC0292q abstractC0292q2 = (AbstractC0292q) cVar.f1734x;
            float fFloatValue2 = ((Float) list.get(i7)).floatValue();
            abstractC0292q2.getClass();
            abstractC0292q2.H(Float.floatToRawIntBits(fFloatValue2));
            i7++;
        }
    }

    public static void K(int i6, List list, L3.c cVar, InterfaceC0283j0 interfaceC0283j0) {
        if (list == null || list.isEmpty()) {
            return;
        }
        cVar.getClass();
        for (int i7 = 0; i7 < list.size(); i7++) {
            cVar.x(i6, interfaceC0283j0, list.get(i7));
        }
    }

    public static void L(int i6, List list, L3.c cVar, boolean z5) {
        if (list == null || list.isEmpty()) {
            return;
        }
        int i7 = 0;
        if (!z5) {
            cVar.getClass();
            while (i7 < list.size()) {
                ((AbstractC0292q) cVar.f1734x).K(i6, ((Integer) list.get(i7)).intValue());
                i7++;
            }
            return;
        }
        ((AbstractC0292q) cVar.f1734x).Q(i6, 2);
        int iN = 0;
        for (int i8 = 0; i8 < list.size(); i8++) {
            iN += AbstractC0292q.n(((Integer) list.get(i8)).intValue());
        }
        ((AbstractC0292q) cVar.f1734x).S(iN);
        while (i7 < list.size()) {
            ((AbstractC0292q) cVar.f1734x).L(((Integer) list.get(i7)).intValue());
            i7++;
        }
    }

    public static void M(int i6, List list, L3.c cVar, boolean z5) {
        if (list == null || list.isEmpty()) {
            return;
        }
        int i7 = 0;
        if (!z5) {
            cVar.getClass();
            while (i7 < list.size()) {
                ((AbstractC0292q) cVar.f1734x).T(i6, ((Long) list.get(i7)).longValue());
                i7++;
            }
            return;
        }
        ((AbstractC0292q) cVar.f1734x).Q(i6, 2);
        int iZ = 0;
        for (int i8 = 0; i8 < list.size(); i8++) {
            iZ += AbstractC0292q.z(((Long) list.get(i8)).longValue());
        }
        ((AbstractC0292q) cVar.f1734x).S(iZ);
        while (i7 < list.size()) {
            ((AbstractC0292q) cVar.f1734x).U(((Long) list.get(i7)).longValue());
            i7++;
        }
    }

    public static void N(int i6, List list, L3.c cVar, InterfaceC0283j0 interfaceC0283j0) {
        if (list == null || list.isEmpty()) {
            return;
        }
        cVar.getClass();
        for (int i7 = 0; i7 < list.size(); i7++) {
            cVar.A(i6, interfaceC0283j0, list.get(i7));
        }
    }

    public static void O(int i6, List list, L3.c cVar, boolean z5) {
        if (list == null || list.isEmpty()) {
            return;
        }
        int i7 = 0;
        if (!z5) {
            cVar.getClass();
            while (i7 < list.size()) {
                ((AbstractC0292q) cVar.f1734x).G(i6, ((Integer) list.get(i7)).intValue());
                i7++;
            }
            return;
        }
        ((AbstractC0292q) cVar.f1734x).Q(i6, 2);
        int i8 = 0;
        for (int i9 = 0; i9 < list.size(); i9++) {
            ((Integer) list.get(i9)).getClass();
            Logger logger = AbstractC0292q.f5503d;
            i8 += 4;
        }
        ((AbstractC0292q) cVar.f1734x).S(i8);
        while (i7 < list.size()) {
            ((AbstractC0292q) cVar.f1734x).H(((Integer) list.get(i7)).intValue());
            i7++;
        }
    }

    public static void P(int i6, List list, L3.c cVar, boolean z5) {
        if (list == null || list.isEmpty()) {
            return;
        }
        int i7 = 0;
        if (!z5) {
            cVar.getClass();
            while (i7 < list.size()) {
                ((AbstractC0292q) cVar.f1734x).I(i6, ((Long) list.get(i7)).longValue());
                i7++;
            }
            return;
        }
        ((AbstractC0292q) cVar.f1734x).Q(i6, 2);
        int i8 = 0;
        for (int i9 = 0; i9 < list.size(); i9++) {
            ((Long) list.get(i9)).getClass();
            Logger logger = AbstractC0292q.f5503d;
            i8 += 8;
        }
        ((AbstractC0292q) cVar.f1734x).S(i8);
        while (i7 < list.size()) {
            ((AbstractC0292q) cVar.f1734x).J(((Long) list.get(i7)).longValue());
            i7++;
        }
    }

    public static void Q(int i6, List list, L3.c cVar, boolean z5) {
        if (list == null || list.isEmpty()) {
            return;
        }
        int i7 = 0;
        if (!z5) {
            cVar.getClass();
            while (i7 < list.size()) {
                AbstractC0292q abstractC0292q = (AbstractC0292q) cVar.f1734x;
                int iIntValue = ((Integer) list.get(i7)).intValue();
                abstractC0292q.R(i6, (iIntValue >> 31) ^ (iIntValue << 1));
                i7++;
            }
            return;
        }
        ((AbstractC0292q) cVar.f1734x).Q(i6, 2);
        int iX = 0;
        for (int i8 = 0; i8 < list.size(); i8++) {
            int iIntValue2 = ((Integer) list.get(i8)).intValue();
            iX += AbstractC0292q.x((iIntValue2 >> 31) ^ (iIntValue2 << 1));
        }
        ((AbstractC0292q) cVar.f1734x).S(iX);
        while (i7 < list.size()) {
            AbstractC0292q abstractC0292q2 = (AbstractC0292q) cVar.f1734x;
            int iIntValue3 = ((Integer) list.get(i7)).intValue();
            abstractC0292q2.S((iIntValue3 >> 31) ^ (iIntValue3 << 1));
            i7++;
        }
    }

    public static void R(int i6, List list, L3.c cVar, boolean z5) {
        if (list == null || list.isEmpty()) {
            return;
        }
        int i7 = 0;
        if (!z5) {
            cVar.getClass();
            while (i7 < list.size()) {
                AbstractC0292q abstractC0292q = (AbstractC0292q) cVar.f1734x;
                long jLongValue = ((Long) list.get(i7)).longValue();
                abstractC0292q.T(i6, (jLongValue >> 63) ^ (jLongValue << 1));
                i7++;
            }
            return;
        }
        ((AbstractC0292q) cVar.f1734x).Q(i6, 2);
        int iZ = 0;
        for (int i8 = 0; i8 < list.size(); i8++) {
            long jLongValue2 = ((Long) list.get(i8)).longValue();
            iZ += AbstractC0292q.z((jLongValue2 >> 63) ^ (jLongValue2 << 1));
        }
        ((AbstractC0292q) cVar.f1734x).S(iZ);
        while (i7 < list.size()) {
            AbstractC0292q abstractC0292q2 = (AbstractC0292q) cVar.f1734x;
            long jLongValue3 = ((Long) list.get(i7)).longValue();
            abstractC0292q2.U((jLongValue3 >> 63) ^ (jLongValue3 << 1));
            i7++;
        }
    }

    public static void S(int i6, List list, L3.c cVar) {
        if (list == null || list.isEmpty()) {
            return;
        }
        cVar.getClass();
        int i7 = 0;
        if (!(list instanceof K)) {
            while (i7 < list.size()) {
                ((AbstractC0292q) cVar.f1734x).O(i6, (String) list.get(i7));
                i7++;
            }
            return;
        }
        K k5 = (K) list;
        while (i7 < list.size()) {
            Object objM = k5.m(i7);
            if (objM instanceof String) {
                ((AbstractC0292q) cVar.f1734x).O(i6, (String) objM);
            } else {
                ((AbstractC0292q) cVar.f1734x).E(i6, (AbstractC0280i) objM);
            }
            i7++;
        }
    }

    public static void T(int i6, List list, L3.c cVar, boolean z5) {
        if (list == null || list.isEmpty()) {
            return;
        }
        int i7 = 0;
        if (!z5) {
            cVar.getClass();
            while (i7 < list.size()) {
                ((AbstractC0292q) cVar.f1734x).R(i6, ((Integer) list.get(i7)).intValue());
                i7++;
            }
            return;
        }
        ((AbstractC0292q) cVar.f1734x).Q(i6, 2);
        int iX = 0;
        for (int i8 = 0; i8 < list.size(); i8++) {
            iX += AbstractC0292q.x(((Integer) list.get(i8)).intValue());
        }
        ((AbstractC0292q) cVar.f1734x).S(iX);
        while (i7 < list.size()) {
            ((AbstractC0292q) cVar.f1734x).S(((Integer) list.get(i7)).intValue());
            i7++;
        }
    }

    public static void U(int i6, List list, L3.c cVar, boolean z5) {
        if (list == null || list.isEmpty()) {
            return;
        }
        int i7 = 0;
        if (!z5) {
            cVar.getClass();
            while (i7 < list.size()) {
                ((AbstractC0292q) cVar.f1734x).T(i6, ((Long) list.get(i7)).longValue());
                i7++;
            }
            return;
        }
        ((AbstractC0292q) cVar.f1734x).Q(i6, 2);
        int iZ = 0;
        for (int i8 = 0; i8 < list.size(); i8++) {
            iZ += AbstractC0292q.z(((Long) list.get(i8)).longValue());
        }
        ((AbstractC0292q) cVar.f1734x).S(iZ);
        while (i7 < list.size()) {
            ((AbstractC0292q) cVar.f1734x).U(((Long) list.get(i7)).longValue());
            i7++;
        }
    }

    public static int a(int i6, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return AbstractC0292q.d(i6) * size;
    }

    public static int b(List list) {
        return list.size();
    }

    public static int c(int i6, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iV = AbstractC0292q.v(i6) * size;
        for (int i7 = 0; i7 < list.size(); i7++) {
            iV += AbstractC0292q.f((AbstractC0280i) list.get(i7));
        }
        return iV;
    }

    public static int d(int i6, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (AbstractC0292q.v(i6) * size) + e(list);
    }

    public static int e(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        if (list instanceof D) {
            if (size <= 0) {
                return 0;
            }
            throw null;
        }
        int iN = 0;
        for (int i6 = 0; i6 < size; i6++) {
            iN += AbstractC0292q.n(((Integer) list.get(i6)).intValue());
        }
        return iN;
    }

    public static int f(int i6, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return AbstractC0292q.i(i6) * size;
    }

    public static int g(List list) {
        return list.size() * 4;
    }

    public static int h(int i6, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return AbstractC0292q.j(i6) * size;
    }

    public static int i(List list) {
        return list.size() * 8;
    }

    public static int j(int i6, List list, InterfaceC0283j0 interfaceC0283j0) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iL = 0;
        for (int i7 = 0; i7 < size; i7++) {
            iL += AbstractC0292q.l(i6, (AbstractC0266b) list.get(i7), interfaceC0283j0);
        }
        return iL;
    }

    public static int k(int i6, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (AbstractC0292q.v(i6) * size) + l(list);
    }

    public static int l(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        if (list instanceof D) {
            if (size <= 0) {
                return 0;
            }
            throw null;
        }
        int iN = 0;
        for (int i6 = 0; i6 < size; i6++) {
            iN += AbstractC0292q.n(((Integer) list.get(i6)).intValue());
        }
        return iN;
    }

    public static int m(int i6, List list) {
        if (list.size() == 0) {
            return 0;
        }
        return (AbstractC0292q.v(i6) * list.size()) + n(list);
    }

    public static int n(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        if (list instanceof O) {
            if (size <= 0) {
                return 0;
            }
            throw null;
        }
        int iZ = 0;
        for (int i6 = 0; i6 < size; i6++) {
            iZ += AbstractC0292q.z(((Long) list.get(i6)).longValue());
        }
        return iZ;
    }

    public static int o(int i6, InterfaceC0283j0 interfaceC0283j0, Object obj) {
        int iV = AbstractC0292q.v(i6);
        int iB = ((AbstractC0266b) obj).b(interfaceC0283j0);
        return AbstractC0292q.x(iB) + iB + iV;
    }

    public static int p(int i6, List list, InterfaceC0283j0 interfaceC0283j0) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iV = AbstractC0292q.v(i6) * size;
        for (int i7 = 0; i7 < size; i7++) {
            int iB = ((AbstractC0266b) list.get(i7)).b(interfaceC0283j0);
            iV += AbstractC0292q.x(iB) + iB;
        }
        return iV;
    }

    public static int q(int i6, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (AbstractC0292q.v(i6) * size) + r(list);
    }

    public static int r(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        if (list instanceof D) {
            if (size <= 0) {
                return 0;
            }
            throw null;
        }
        int iX = 0;
        for (int i6 = 0; i6 < size; i6++) {
            int iIntValue = ((Integer) list.get(i6)).intValue();
            iX += AbstractC0292q.x((iIntValue >> 31) ^ (iIntValue << 1));
        }
        return iX;
    }

    public static int s(int i6, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (AbstractC0292q.v(i6) * size) + t(list);
    }

    public static int t(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        if (list instanceof O) {
            if (size <= 0) {
                return 0;
            }
            throw null;
        }
        int iZ = 0;
        for (int i6 = 0; i6 < size; i6++) {
            long jLongValue = ((Long) list.get(i6)).longValue();
            iZ += AbstractC0292q.z((jLongValue >> 63) ^ (jLongValue << 1));
        }
        return iZ;
    }

    public static int u(int i6, List list) {
        int size = list.size();
        int i7 = 0;
        if (size == 0) {
            return 0;
        }
        int iV = AbstractC0292q.v(i6) * size;
        if (list instanceof K) {
            K k5 = (K) list;
            while (i7 < size) {
                Object objM = k5.m(i7);
                iV = (objM instanceof AbstractC0280i ? AbstractC0292q.f((AbstractC0280i) objM) : AbstractC0292q.u((String) objM)) + iV;
                i7++;
            }
        } else {
            while (i7 < size) {
                Object obj = list.get(i7);
                iV = (obj instanceof AbstractC0280i ? AbstractC0292q.f((AbstractC0280i) obj) : AbstractC0292q.u((String) obj)) + iV;
                i7++;
            }
        }
        return iV;
    }

    public static int v(int i6, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (AbstractC0292q.v(i6) * size) + w(list);
    }

    public static int w(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        if (list instanceof D) {
            if (size <= 0) {
                return 0;
            }
            throw null;
        }
        int iX = 0;
        for (int i6 = 0; i6 < size; i6++) {
            iX += AbstractC0292q.x(((Integer) list.get(i6)).intValue());
        }
        return iX;
    }

    public static int x(int i6, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (AbstractC0292q.v(i6) * size) + y(list);
    }

    public static int y(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        if (list instanceof O) {
            if (size <= 0) {
                return 0;
            }
            throw null;
        }
        int iZ = 0;
        for (int i6 = 0; i6 < size; i6++) {
            iZ += AbstractC0292q.z(((Long) list.get(i6)).longValue());
        }
        return iZ;
    }

    public static Object z(Object obj, int i6, List list, Object obj2, u0 u0Var) {
        return obj2;
    }
}
