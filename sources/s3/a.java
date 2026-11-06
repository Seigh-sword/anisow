package S3;

import M4.A;
import M4.AbstractC0077w;
import M4.B;
import M4.C0057b;
import M4.C0058c;
import M4.C0060e;
import M4.C0063h;
import M4.C0070o;
import M4.C0072q;
import M4.C0074t;
import M4.C0078x;
import M4.F;
import M4.H;
import M4.InterfaceC0062g;
import M4.InterfaceC0079y;
import M4.InterfaceC0080z;
import M4.J;
import M4.K;
import M4.Q;
import M4.V;
import M4.X;
import M4.b0;
import M4.e0;
import M4.f0;
import M4.k0;
import M4.l0;
import M4.m0;
import M4.r0;
import M4.u0;
import M4.w0;
import M4.z0;
import P4.InterfaceC0146g;
import a0.C0257e;
import d.AbstractC0628i;
import j3.C0848A;
import java.io.Closeable;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import o0.AbstractC1171a0;
import o0.H0;
import o4.InterfaceC1228a;
import o4.InterfaceC1229b;
import s4.AbstractC1305a;
import s4.C1312h;
import s4.C1315k;
import s4.C1316l;
import s4.C1317m;
import s4.InterfaceC1306b;
import s4.InterfaceC1309e;
import t4.C1351h;
import v4.C1428f;
import v4.C1433k;
import v4.InterfaceC1427e;
import v4.InterfaceC1430h;
import v4.InterfaceC1432j;
import w4.EnumC1481a;

/* JADX INFO: loaded from: classes.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Type[] f3238a = new Type[0];

    public static boolean A(int i6, Object obj) {
        if (obj instanceof InterfaceC1306b) {
            return (obj instanceof D4.g ? ((D4.g) obj).f() : obj instanceof C4.a ? 0 : obj instanceof C4.l ? 1 : obj instanceof C4.p ? 2 : obj instanceof C4.q ? 3 : obj instanceof AbstractC1171a0 ? 4 : -1) == i6;
        }
        return false;
    }

    public static r0 B(InterfaceC0080z interfaceC0080z, InterfaceC1430h interfaceC1430h, A a6, C4.p pVar, int i6) {
        InterfaceC1432j interfaceC1432j = interfaceC1430h;
        if ((i6 & 1) != 0) {
            interfaceC1432j = C1433k.f13309w;
        }
        if ((i6 & 2) != 0) {
            a6 = A.f1832w;
        }
        InterfaceC1432j interfaceC1432jO = AbstractC1305a.O(interfaceC0080z, interfaceC1432j);
        a6.getClass();
        r0 l0Var = a6 == A.f1833x ? new l0(interfaceC1432jO, pVar) : new r0(interfaceC1432jO, true);
        l0Var.f0(a6, l0Var, pVar);
        return l0Var;
    }

    public static InterfaceC1309e C(C0257e c0257e) {
        C1315k c1315k = C1315k.f12639a;
        C1317m c1317m = new C1317m();
        c1317m.f12641w = c0257e;
        c1317m.f12642x = c1315k;
        return c1317m;
    }

    public static List D(Object obj) {
        List listSingletonList = Collections.singletonList(obj);
        AbstractC1305a.n(listSingletonList, "singletonList(...)");
        return listSingletonList;
    }

    public static List E(Object... objArr) {
        if (objArr.length <= 0) {
            return t4.p.f12756w;
        }
        List listAsList = Arrays.asList(objArr);
        AbstractC1305a.n(listAsList, "asList(...)");
        return listAsList;
    }

    public static boolean F(String str) {
        return (str.equals("GET") || str.equals("HEAD")) ? false : true;
    }

    public static final Object G(Object obj, Object obj2) {
        if (obj == null) {
            return obj2;
        }
        if (obj instanceof ArrayList) {
            ((ArrayList) obj).add(obj2);
            return obj;
        }
        ArrayList arrayList = new ArrayList(4);
        arrayList.add(obj);
        arrayList.add(obj2);
        return arrayList;
    }

    public static String H(V4.r rVar) {
        int length = rVar.f3903a.length() + 3;
        String str = rVar.f3911i;
        int iIndexOf = str.indexOf(47, length);
        String strSubstring = str.substring(iIndexOf, W4.b.g(iIndexOf, str.length(), str, "?#"));
        String strE = rVar.e();
        if (strE == null) {
            return strSubstring;
        }
        return strSubstring + '?' + strE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x013e A[EDGE_INSN: B:86:0x013e->B:80:0x013e BREAK  A[LOOP:0: B:3:0x0004->B:89:?], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:89:? A[LOOP:0: B:3:0x0004->B:89:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r11v0, types: [java.lang.reflect.Type] */
    /* JADX WARN: Type inference failed for: r11v1, types: [java.lang.reflect.Type] */
    /* JADX WARN: Type inference failed for: r11v10, types: [java.lang.Object, java.lang.reflect.Type] */
    /* JADX WARN: Type inference failed for: r11v17, types: [java.lang.reflect.Type[]] */
    /* JADX WARN: Type inference failed for: r11v18 */
    /* JADX WARN: Type inference failed for: r11v19 */
    /* JADX WARN: Type inference failed for: r11v2, types: [java.lang.reflect.WildcardType] */
    /* JADX WARN: Type inference failed for: r11v20 */
    /* JADX WARN: Type inference failed for: r11v3, types: [S3.d] */
    /* JADX WARN: Type inference failed for: r11v4, types: [S3.d] */
    /* JADX WARN: Type inference failed for: r11v5, types: [java.lang.reflect.ParameterizedType] */
    /* JADX WARN: Type inference failed for: r11v6, types: [java.lang.reflect.GenericArrayType] */
    /* JADX WARN: Type inference failed for: r11v7 */
    /* JADX WARN: Type inference failed for: r11v9 */
    /* JADX WARN: Type inference failed for: r12v0, types: [java.util.HashMap] */
    /* JADX WARN: Type inference failed for: r2v16 */
    /* JADX WARN: Type inference failed for: r4v5 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.reflect.Type I(java.lang.reflect.Type r9, java.lang.Class r10, java.lang.reflect.Type r11, java.util.HashMap r12) {
        /*
            Method dump skipped, instruction units count: 324
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: S3.a.I(java.lang.reflect.Type, java.lang.Class, java.lang.reflect.Type, java.util.HashMap):java.lang.reflect.Type");
    }

    public static Object J(C4.p pVar) throws Throwable {
        C1433k c1433k = C1433k.f13309w;
        Thread threadCurrentThread = Thread.currentThread();
        C1428f c1428f = C1428f.f13308w;
        Q qA = u0.a();
        InterfaceC1432j interfaceC1432jB = AbstractC1305a.B(c1433k, qA, true);
        S4.e eVar = J.f1851a;
        if (interfaceC1432jB != eVar && interfaceC1432jB.n(c1428f) == null) {
            interfaceC1432jB = interfaceC1432jB.k(eVar);
        }
        C0058c c0058c = new C0058c(interfaceC1432jB, threadCurrentThread, qA);
        c0058c.f0(A.f1832w, c0058c, pVar);
        Q q5 = c0058c.f1877A;
        if (q5 != null) {
            int i6 = Q.f1862B;
            q5.P(false);
        }
        while (!Thread.interrupted()) {
            try {
                long jR = q5 != null ? q5.R() : Long.MAX_VALUE;
                if (!(c0058c.K() instanceof V)) {
                    if (q5 != null) {
                        int i7 = Q.f1862B;
                        q5.M(false);
                    }
                    Object objT = B.t(c0058c.K());
                    M4.r rVar = objT instanceof M4.r ? (M4.r) objT : null;
                    if (rVar == null) {
                        return objT;
                    }
                    throw rVar.f1916a;
                }
                LockSupport.parkNanos(c0058c, jR);
            } catch (Throwable th) {
                if (q5 != null) {
                    int i8 = Q.f1862B;
                    q5.M(false);
                }
                throw th;
            }
        }
        InterruptedException interruptedException = new InterruptedException();
        c0058c.x(interruptedException);
        throw interruptedException;
    }

    public static final Object K(R4.t tVar, R4.t tVar2, C4.p pVar) throws Throwable {
        Object rVar;
        Object objT;
        try {
            f(2, pVar);
            rVar = pVar.h(tVar2, tVar);
        } catch (Throwable th) {
            rVar = new M4.r(th, false);
        }
        EnumC1481a enumC1481a = EnumC1481a.f13592w;
        if (rVar == enumC1481a || (objT = tVar.T(rVar)) == B.f1840e) {
            return enumC1481a;
        }
        if (objT instanceof M4.r) {
            throw ((M4.r) objT).f1916a;
        }
        return B.t(objT);
    }

    public static final long L(String str, long j6, long j7, long j8) {
        String property;
        String str2;
        Long lValueOf;
        long j9;
        int i6 = R4.w.f3043a;
        try {
            property = System.getProperty(str);
        } catch (SecurityException unused) {
            property = null;
        }
        if (property == null) {
            return j6;
        }
        AbstractC1305a.p(10);
        int length = property.length();
        if (length == 0) {
            str2 = property;
            lValueOf = null;
            break;
        }
        int i7 = 0;
        char cCharAt = property.charAt(0);
        boolean z5 = true;
        long j10 = -9223372036854775807L;
        if ((cCharAt < '0' ? (byte) -1 : cCharAt == '0' ? (byte) 0 : (byte) 1) < 0) {
            if (length != 1) {
                if (cCharAt == '-') {
                    j10 = Long.MIN_VALUE;
                    i7 = 1;
                } else if (cCharAt == '+') {
                    z5 = false;
                    i7 = 1;
                }
            }
            str2 = property;
            lValueOf = null;
            break;
        }
        z5 = false;
        long j11 = 0;
        long j12 = -256204778801521550L;
        while (i7 < length) {
            int iDigit = Character.digit((int) property.charAt(i7), 10);
            if (iDigit >= 0) {
                if (j11 >= j12) {
                    str2 = property;
                } else if (j12 == -256204778801521550L) {
                    str2 = property;
                    j12 = j10 / ((long) 10);
                    if (j11 < j12) {
                    }
                    lValueOf = null;
                    break;
                }
                long j13 = j11 * ((long) 10);
                long j14 = iDigit;
                if (j13 < j10 + j14) {
                    lValueOf = null;
                    break;
                }
                j11 = j13 - j14;
                i7++;
                property = str2;
            }
            str2 = property;
            lValueOf = null;
            break;
        }
        str2 = property;
        if (!z5) {
            j11 = -j11;
        }
        lValueOf = Long.valueOf(j11);
        if (lValueOf == null) {
            throw new IllegalStateException(("System property '" + str + "' has unrecognized value '" + str2 + '\'').toString());
        }
        long jLongValue = lValueOf.longValue();
        if (j7 <= jLongValue) {
            j9 = j8;
            if (jLongValue <= j9) {
                return jLongValue;
            }
        } else {
            j9 = j8;
        }
        throw new IllegalStateException(("System property '" + str + "' should be in range " + j7 + ".." + j9 + ", but is '" + jLongValue + '\'').toString());
    }

    public static int M(String str, int i6, int i7, int i8, int i9) {
        if ((i9 & 4) != 0) {
            i7 = 1;
        }
        if ((i9 & 8) != 0) {
            i8 = Integer.MAX_VALUE;
        }
        return (int) L(str, i6, i7, i8);
    }

    public static void N(Object obj, String str) {
        ClassCastException classCastException = new ClassCastException((obj == null ? "null" : obj.getClass().getName()) + " cannot be cast to " + str);
        AbstractC1305a.T(a.class.getName(), classCastException);
        throw classCastException;
    }

    public static final void O(Object obj) throws Throwable {
        if (obj instanceof C1312h) {
            throw ((C1312h) obj).f12634w;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0058 A[PHI: r2
      0x0058: PHI (r2v3 long) = (r2v1 long), (r2v2 long) binds: [B:11:0x0056, B:14:0x0061] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final long P(int r8, L4.c r9) {
        /*
            java.lang.String r0 = "unit"
            s4.AbstractC1305a.o(r9, r0)
            L4.c r0 = L4.c.SECONDS
            int r0 = r9.compareTo(r0)
            r1 = 1
            long r2 = (long) r8
            if (r0 > 0) goto L1b
            L4.c r8 = L4.c.NANOSECONDS
            long r8 = s4.AbstractC1305a.s(r2, r9, r8)
            long r8 = r8 << r1
            int r0 = L4.a.f1740z
            int r0 = L4.b.f1742a
            goto L6c
        L1b:
            L4.c r8 = L4.c.NANOSECONDS
            r4 = 4611686018426999999(0x3ffffffffffa14bf, double:1.9999999999138678)
            long r4 = s4.AbstractC1305a.s(r4, r8, r9)
            H4.f r0 = new H4.f
            long r6 = -r4
            r0.<init>(r6, r4)
            int r4 = (r6 > r2 ? 1 : (r6 == r2 ? 0 : -1))
            if (r4 > 0) goto L40
            long r4 = r0.f1069x
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 > 0) goto L40
            long r8 = s4.AbstractC1305a.s(r2, r9, r8)
            long r8 = r8 << r1
            int r0 = L4.a.f1740z
            int r0 = L4.b.f1742a
            goto L6c
        L40:
            L4.c r8 = L4.c.MILLISECONDS
            java.lang.String r0 = "targetUnit"
            s4.AbstractC1305a.o(r8, r0)
            java.util.concurrent.TimeUnit r8 = r8.f1750w
            java.util.concurrent.TimeUnit r9 = r9.f1750w
            long r8 = r8.convert(r2, r9)
            r2 = -4611686018427387903(0xc000000000000001, double:-2.0000000000000004)
            int r0 = (r8 > r2 ? 1 : (r8 == r2 ? 0 : -1))
            if (r0 >= 0) goto L5a
        L58:
            r8 = r2
            goto L64
        L5a:
            r2 = 4611686018427387903(0x3fffffffffffffff, double:1.9999999999999998)
            int r0 = (r8 > r2 ? 1 : (r8 == r2 ? 0 : -1))
            if (r0 <= 0) goto L64
            goto L58
        L64:
            long r8 = r8 << r1
            r0 = 1
            long r8 = r8 + r0
            int r0 = L4.a.f1740z
            int r0 = L4.b.f1742a
        L6c:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: S3.a.P(int, L4.c):long");
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0046 A[PHI: r9
      0x0046: PHI (r9v1 java.lang.String) = (r9v0 java.lang.String), (r9v2 java.lang.String) binds: [B:13:0x0044, B:28:0x0073] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.String Q(java.lang.String r13) {
        /*
            java.lang.String r0 = "<this>"
            s4.AbstractC1305a.o(r13, r0)
            java.lang.String r0 = "|"
            boolean r1 = K4.h.d0(r0)
            r2 = 1
            r1 = r1 ^ r2
            if (r1 == 0) goto L97
            java.util.List r1 = K4.h.f0(r13)
            int r13 = r13.length()
            r1.size()
            int r3 = u(r1)
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            java.util.Iterator r1 = r1.iterator()
            r5 = 0
            r6 = r5
        L2b:
            boolean r7 = r1.hasNext()
            if (r7 == 0) goto L85
            java.lang.Object r7 = r1.next()
            int r8 = r6 + 1
            if (r6 < 0) goto L7d
            java.lang.String r7 = (java.lang.String) r7
            r9 = 0
            if (r6 == 0) goto L40
            if (r6 != r3) goto L48
        L40:
            boolean r6 = K4.h.d0(r7)
            if (r6 == 0) goto L48
        L46:
            r7 = r9
            goto L76
        L48:
            int r6 = r7.length()
            r10 = r5
        L4d:
            r11 = -1
            if (r10 >= r6) goto L5f
            char r12 = r7.charAt(r10)
            boolean r12 = s4.AbstractC1305a.L(r12)
            r12 = r12 ^ r2
            if (r12 == 0) goto L5c
            goto L60
        L5c:
            int r10 = r10 + 1
            goto L4d
        L5f:
            r10 = r11
        L60:
            if (r10 != r11) goto L63
            goto L73
        L63:
            boolean r6 = r7.startsWith(r0, r10)
            if (r6 == 0) goto L73
            int r10 = r10 + r2
            java.lang.String r9 = r7.substring(r10)
            java.lang.String r6 = "substring(...)"
            s4.AbstractC1305a.n(r9, r6)
        L73:
            if (r9 == 0) goto L76
            goto L46
        L76:
            if (r7 == 0) goto L7b
            r4.add(r7)
        L7b:
            r6 = r8
            goto L2b
        L7d:
            java.lang.ArithmeticException r13 = new java.lang.ArithmeticException
            java.lang.String r0 = "Index overflow has happened."
            r13.<init>(r0)
            throw r13
        L85:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r13)
            t4.n.e0(r4, r0)
            java.lang.String r13 = r0.toString()
            java.lang.String r0 = "toString(...)"
            s4.AbstractC1305a.n(r13, r0)
            return r13
        L97:
            java.lang.IllegalArgumentException r13 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "marginPrefix must be non-blank string."
            java.lang.String r0 = r0.toString()
            r13.<init>(r0)
            throw r13
        */
        throw new UnsupportedOperationException("Method not decompiled: S3.a.Q(java.lang.String):java.lang.String");
    }

    public static String R(Type type) {
        return type instanceof Class ? ((Class) type).getName() : type.toString();
    }

    public static H4.c T(int i6, int i7) {
        if (i7 > Integer.MIN_VALUE) {
            return new H4.c(i6, i7 - 1, 1);
        }
        H4.c cVar = H4.c.f1067z;
        return H4.c.f1067z;
    }

    public static final Object U(InterfaceC1427e interfaceC1427e, InterfaceC1432j interfaceC1432j, C4.p pVar) throws Throwable {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        InterfaceC1432j interfaceC1432jI = interfaceC1427e.i();
        InterfaceC1432j interfaceC1432jK = !((Boolean) interfaceC1432j.g(Boolean.FALSE, C0074t.f1920z)).booleanValue() ? interfaceC1432jI.k(interfaceC1432j) : AbstractC1305a.B(interfaceC1432jI, interfaceC1432j, false);
        o(interfaceC1432jK);
        if (interfaceC1432jK == interfaceC1432jI) {
            R4.t tVar = new R4.t(interfaceC1427e, interfaceC1432jK);
            return K(tVar, tVar, pVar);
        }
        C1428f c1428f = C1428f.f13308w;
        if (AbstractC1305a.c(interfaceC1432jK.n(c1428f), interfaceC1432jI.n(c1428f))) {
            w0 w0Var = new w0(interfaceC1427e, interfaceC1432jK);
            InterfaceC1432j interfaceC1432j2 = w0Var.f1872y;
            Object objF = R4.a.f(interfaceC1432j2, null);
            try {
                return K(w0Var, w0Var, pVar);
            } finally {
                R4.a.b(interfaceC1432j2, objF);
            }
        }
        H h4 = new H(interfaceC1427e, interfaceC1432jK);
        AbstractC1305a.U(pVar, h4, h4);
        do {
            atomicIntegerFieldUpdater = H.f1849A;
            int i6 = atomicIntegerFieldUpdater.get(h4);
            if (i6 != 0) {
                if (i6 != 2) {
                    throw new IllegalStateException("Already suspended".toString());
                }
                Object objT = B.t(h4.K());
                if (objT instanceof M4.r) {
                    throw ((M4.r) objT).f1916a;
                }
                return objT;
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(h4, 0, 1));
        return EnumC1481a.f13592w;
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
    public static final Object V(InterfaceC1427e interfaceC1427e) {
        Object obj;
        InterfaceC1432j interfaceC1432jI = interfaceC1427e.i();
        o(interfaceC1432jI);
        InterfaceC1427e interfaceC1427eH = AbstractC1305a.H(interfaceC1427e);
        R4.h hVar = interfaceC1427eH instanceof R4.h ? (R4.h) interfaceC1427eH : null;
        C1316l c1316l = C1316l.f12640a;
        EnumC1481a enumC1481a = EnumC1481a.f13592w;
        if (hVar == null) {
            obj = c1316l;
        } else {
            AbstractC0077w abstractC0077w = hVar.f3018z;
            if (abstractC0077w.L()) {
                hVar.f3016B = c1316l;
                hVar.f1850y = 1;
                abstractC0077w.K(interfaceC1432jI, hVar);
            } else {
                z0 z0Var = new z0(z0.f1932y);
                InterfaceC1432j interfaceC1432jK = interfaceC1432jI.k(z0Var);
                hVar.f3016B = c1316l;
                hVar.f1850y = 1;
                abstractC0077w.K(interfaceC1432jK, hVar);
                if (z0Var.f1933x) {
                    Q qA = u0.a();
                    C1351h c1351h = qA.f1863A;
                    if (c1351h != null && !c1351h.isEmpty()) {
                        if (qA.Q()) {
                            hVar.f3016B = c1316l;
                            hVar.f1850y = 1;
                            qA.N(hVar);
                        } else {
                            qA.P(true);
                            try {
                                hVar.run();
                                do {
                                } while (qA.S());
                            } finally {
                                try {
                                } finally {
                                }
                            }
                        }
                    }
                    obj = c1316l;
                }
            }
            obj = enumC1481a;
        }
        return obj == enumC1481a ? obj : c1316l;
    }

    public static O4.c a(int i6, O4.a aVar, int i7) {
        O4.c nVar;
        int i8 = i7 & 2;
        O4.a aVar2 = O4.a.f2342w;
        if (i8 != 0) {
            aVar = aVar2;
        }
        if (i6 != -2) {
            if (i6 == -1) {
                if (aVar == aVar2) {
                    return new O4.n(1, O4.a.f2343x, null);
                }
                throw new IllegalArgumentException("CONFLATED capacity cannot be used with non-default onBufferOverflow".toString());
            }
            if (i6 != 0) {
                return i6 != Integer.MAX_VALUE ? aVar == aVar2 ? new O4.c(i6, null) : new O4.n(i6, aVar, null) : new O4.c(Integer.MAX_VALUE, null);
            }
            nVar = aVar == aVar2 ? new O4.c(0, null) : new O4.n(1, aVar, null);
        } else if (aVar == aVar2) {
            O4.g.f2382i.getClass();
            nVar = new O4.c(O4.f.f2381b, null);
        } else {
            nVar = new O4.n(1, aVar, null);
        }
        return nVar;
    }

    public static C0070o b() {
        C0070o c0070o = new C0070o(true);
        c0070o.N(null);
        return c0070o;
    }

    public static final R4.e c(InterfaceC1432j interfaceC1432j) {
        if (interfaceC1432j.n(C0078x.f1930x) == null) {
            interfaceC1432j = interfaceC1432j.k(d());
        }
        return new R4.e(interfaceC1432j);
    }

    public static e0 d() {
        return new e0(null);
    }

    public static F e(R4.e eVar, C4.p pVar) {
        C1433k c1433k = C1433k.f13309w;
        A a6 = A.f1832w;
        F f6 = new F(AbstractC1305a.O(eVar, c1433k), true);
        f6.f0(a6, f6, pVar);
        return f6;
    }

    public static void f(int i6, Object obj) {
        if (obj == null || A(i6, obj)) {
            return;
        }
        N(obj, "kotlin.jvm.functions.Function" + i6);
        throw null;
    }

    public static Type g(Type type) {
        if (type instanceof Class) {
            Class cls = (Class) type;
            return cls.isArray() ? new b(g(cls.getComponentType())) : cls;
        }
        if (type instanceof ParameterizedType) {
            ParameterizedType parameterizedType = (ParameterizedType) type;
            return new c(parameterizedType.getOwnerType(), parameterizedType.getRawType(), parameterizedType.getActualTypeArguments());
        }
        if (type instanceof GenericArrayType) {
            return new b(((GenericArrayType) type).getGenericComponentType());
        }
        if (!(type instanceof WildcardType)) {
            return type;
        }
        WildcardType wildcardType = (WildcardType) type;
        return new d(wildcardType.getUpperBounds(), wildcardType.getLowerBounds());
    }

    public static void h(boolean z5) {
        if (!z5) {
            throw new IllegalArgumentException();
        }
    }

    public static void i(Type type) {
        h(((type instanceof Class) && ((Class) type).isPrimitive()) ? false : true);
    }

    public static final void j(Closeable closeable, Throwable th) throws IllegalAccessException, IOException, InvocationTargetException {
        if (closeable != null) {
            if (th == null) {
                closeable.close();
                return;
            }
            try {
                closeable.close();
            } catch (Throwable th2) {
                AbstractC1305a.b(th, th2);
            }
        }
    }

    public static int k(int i6, H4.c cVar) {
        Integer numValueOf;
        AbstractC1305a.o(cVar, "range");
        if (cVar.isEmpty()) {
            throw new IllegalArgumentException("Cannot coerce value to an empty range: " + cVar + '.');
        }
        int i7 = cVar.f1060w;
        if (i6 < Integer.valueOf(i7).intValue()) {
            numValueOf = Integer.valueOf(i7);
        } else {
            int i8 = cVar.f1061x;
            if (i6 <= Integer.valueOf(i8).intValue()) {
                return i6;
            }
            numValueOf = Integer.valueOf(i8);
        }
        return numValueOf.intValue();
    }

    public static final Object l(C4.p pVar, InterfaceC1427e interfaceC1427e) {
        R4.t tVar = new R4.t(interfaceC1427e, interfaceC1427e.i());
        return K(tVar, tVar, pVar);
    }

    public static final C1312h m(Throwable th) {
        AbstractC1305a.o(th, "exception");
        return new C1312h(th);
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0066 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0073 A[Catch: all -> 0x0035, TRY_LEAVE, TryCatch #1 {all -> 0x0035, blocks: (B:13:0x002f, B:25:0x0056, B:29:0x006b, B:31:0x0073, B:20:0x0047, B:24:0x0052), top: B:52:0x0021 }] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:32:0x0085 -> B:14:0x0032). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object n(P4.InterfaceC0147h r7, O4.q r8, boolean r9, v4.InterfaceC1427e r10) throws java.lang.Throwable {
        /*
            boolean r0 = r10 instanceof P4.C0151l
            if (r0 == 0) goto L13
            r0 = r10
            P4.l r0 = (P4.C0151l) r0
            int r1 = r0.f2712E
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f2712E = r1
            goto L18
        L13:
            P4.l r0 = new P4.l
            r0.<init>(r10)
        L18:
            java.lang.Object r10 = r0.f2711D
            w4.a r1 = w4.EnumC1481a.f13592w
            int r2 = r0.f2712E
            r3 = 0
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L4b
            if (r2 == r5) goto L3f
            if (r2 != r4) goto L37
            boolean r9 = r0.f2710C
            O4.b r7 = r0.f2709B
            O4.q r8 = r0.f2708A
            P4.h r2 = r0.f2713z
            O(r10)     // Catch: java.lang.Throwable -> L35
        L32:
            r10 = r7
            r7 = r2
            goto L56
        L35:
            r7 = move-exception
            goto L90
        L37:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L3f:
            boolean r9 = r0.f2710C
            O4.b r7 = r0.f2709B
            O4.q r8 = r0.f2708A
            P4.h r2 = r0.f2713z
            O(r10)     // Catch: java.lang.Throwable -> L35
            goto L6b
        L4b:
            O(r10)
            boolean r10 = r7 instanceof P4.s0
            if (r10 != 0) goto Lab
            O4.b r10 = r8.iterator()     // Catch: java.lang.Throwable -> L35
        L56:
            r0.f2713z = r7     // Catch: java.lang.Throwable -> L35
            r0.f2708A = r8     // Catch: java.lang.Throwable -> L35
            r0.f2709B = r10     // Catch: java.lang.Throwable -> L35
            r0.f2710C = r9     // Catch: java.lang.Throwable -> L35
            r0.f2712E = r5     // Catch: java.lang.Throwable -> L35
            java.lang.Object r2 = r10.b(r0)     // Catch: java.lang.Throwable -> L35
            if (r2 != r1) goto L67
            return r1
        L67:
            r6 = r2
            r2 = r7
            r7 = r10
            r10 = r6
        L6b:
            java.lang.Boolean r10 = (java.lang.Boolean) r10     // Catch: java.lang.Throwable -> L35
            boolean r10 = r10.booleanValue()     // Catch: java.lang.Throwable -> L35
            if (r10 == 0) goto L88
            java.lang.Object r10 = r7.c()     // Catch: java.lang.Throwable -> L35
            r0.f2713z = r2     // Catch: java.lang.Throwable -> L35
            r0.f2708A = r8     // Catch: java.lang.Throwable -> L35
            r0.f2709B = r7     // Catch: java.lang.Throwable -> L35
            r0.f2710C = r9     // Catch: java.lang.Throwable -> L35
            r0.f2712E = r4     // Catch: java.lang.Throwable -> L35
            java.lang.Object r10 = r2.k(r10, r0)     // Catch: java.lang.Throwable -> L35
            if (r10 != r1) goto L32
            return r1
        L88:
            if (r9 == 0) goto L8d
            r8.b(r3)
        L8d:
            s4.l r7 = s4.C1316l.f12640a
            return r7
        L90:
            throw r7     // Catch: java.lang.Throwable -> L91
        L91:
            r10 = move-exception
            if (r9 == 0) goto Laa
            boolean r9 = r7 instanceof java.util.concurrent.CancellationException
            if (r9 == 0) goto L9b
            r3 = r7
            java.util.concurrent.CancellationException r3 = (java.util.concurrent.CancellationException) r3
        L9b:
            if (r3 != 0) goto La7
            java.util.concurrent.CancellationException r3 = new java.util.concurrent.CancellationException
            java.lang.String r9 = "Channel was consumed, consumer had failed"
            r3.<init>(r9)
            r3.initCause(r7)
        La7:
            r8.b(r3)
        Laa:
            throw r10
        Lab:
            P4.s0 r7 = (P4.s0) r7
            java.lang.Throwable r7 = r7.f2752w
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: S3.a.n(P4.h, O4.q, boolean, v4.e):java.lang.Object");
    }

    public static final void o(InterfaceC1432j interfaceC1432j) {
        b0 b0Var = (b0) interfaceC1432j.n(C0078x.f1930x);
        if (b0Var != null && !b0Var.c()) {
            throw ((k0) b0Var).F();
        }
    }

    public static boolean p(Type type, Type type2) {
        if (type == type2) {
            return true;
        }
        if (type instanceof Class) {
            return type.equals(type2);
        }
        if (type instanceof ParameterizedType) {
            if (!(type2 instanceof ParameterizedType)) {
                return false;
            }
            ParameterizedType parameterizedType = (ParameterizedType) type;
            ParameterizedType parameterizedType2 = (ParameterizedType) type2;
            return Objects.equals(parameterizedType.getOwnerType(), parameterizedType2.getOwnerType()) && parameterizedType.getRawType().equals(parameterizedType2.getRawType()) && Arrays.equals(parameterizedType.getActualTypeArguments(), parameterizedType2.getActualTypeArguments());
        }
        if (type instanceof GenericArrayType) {
            if (type2 instanceof GenericArrayType) {
                return p(((GenericArrayType) type).getGenericComponentType(), ((GenericArrayType) type2).getGenericComponentType());
            }
            return false;
        }
        if (type instanceof WildcardType) {
            if (!(type2 instanceof WildcardType)) {
                return false;
            }
            WildcardType wildcardType = (WildcardType) type;
            WildcardType wildcardType2 = (WildcardType) type2;
            return Arrays.equals(wildcardType.getUpperBounds(), wildcardType2.getUpperBounds()) && Arrays.equals(wildcardType.getLowerBounds(), wildcardType2.getLowerBounds());
        }
        if (!(type instanceof TypeVariable) || !(type2 instanceof TypeVariable)) {
            return false;
        }
        TypeVariable typeVariable = (TypeVariable) type;
        TypeVariable typeVariable2 = (TypeVariable) type2;
        return typeVariable.getGenericDeclaration() == typeVariable2.getGenericDeclaration() && typeVariable.getName().equals(typeVariable2.getName());
    }

    public static /* synthetic */ InterfaceC0146g q(Q4.s sVar, m0 m0Var, int i6, O4.a aVar, int i7) {
        InterfaceC1432j interfaceC1432j = m0Var;
        if ((i7 & 1) != 0) {
            interfaceC1432j = C1433k.f13309w;
        }
        if ((i7 & 2) != 0) {
            i6 = -3;
        }
        if ((i7 & 4) != 0) {
            aVar = O4.a.f2342w;
        }
        return sVar.b(interfaceC1432j, i6, aVar);
    }

    public static Object r(Class cls, Object obj) {
        if (obj instanceof InterfaceC1228a) {
            return cls.cast(obj);
        }
        if (obj instanceof InterfaceC1229b) {
            return r(cls, ((InterfaceC1229b) obj).c());
        }
        throw new IllegalStateException("Given component holder " + obj.getClass() + " does not implement " + InterfaceC1228a.class + " or " + InterfaceC1229b.class);
    }

    public static void s(List list) {
        Iterator it = list.iterator();
        if (it.hasNext()) {
            AbstractC0628i.p(it.next());
            throw null;
        }
    }

    public static Type t(Type type, Class cls, Class cls2) {
        if (cls2 == cls) {
            return type;
        }
        if (cls2.isInterface()) {
            Class<?>[] interfaces = cls.getInterfaces();
            int length = interfaces.length;
            for (int i6 = 0; i6 < length; i6++) {
                Class<?> cls3 = interfaces[i6];
                if (cls3 == cls2) {
                    return cls.getGenericInterfaces()[i6];
                }
                if (cls2.isAssignableFrom(cls3)) {
                    return t(cls.getGenericInterfaces()[i6], interfaces[i6], cls2);
                }
            }
        }
        if (!cls.isInterface()) {
            while (cls != Object.class) {
                Class<?> superclass = cls.getSuperclass();
                if (superclass == cls2) {
                    return cls.getGenericSuperclass();
                }
                if (cls2.isAssignableFrom(superclass)) {
                    return t(cls.getGenericSuperclass(), superclass, cls2);
                }
                cls = superclass;
            }
        }
        return cls2;
    }

    public static int u(List list) {
        AbstractC1305a.o(list, "<this>");
        return list.size() - 1;
    }

    public static final C0063h v(InterfaceC1427e interfaceC1427e) {
        C0063h c0063h;
        C0063h c0063h2;
        if (!(interfaceC1427e instanceof R4.h)) {
            return new C0063h(1, interfaceC1427e);
        }
        R4.h hVar = (R4.h) interfaceC1427e;
        loop0: while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = R4.h.f3014D;
            Object obj = atomicReferenceFieldUpdater.get(hVar);
            C0848A c0848a = R4.a.f3004d;
            c0063h = null;
            if (obj == null) {
                atomicReferenceFieldUpdater.set(hVar, c0848a);
                c0063h2 = null;
                break;
            }
            if (obj instanceof C0063h) {
                while (!atomicReferenceFieldUpdater.compareAndSet(hVar, obj, c0848a)) {
                    if (atomicReferenceFieldUpdater.get(hVar) != obj) {
                        break;
                    }
                }
                c0063h2 = (C0063h) obj;
                break loop0;
            }
            if (obj != c0848a && !(obj instanceof Throwable)) {
                throw new IllegalStateException(("Inconsistent state " + obj).toString());
            }
        }
        if (c0063h2 != null) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = C0063h.f1887C;
            Object obj2 = atomicReferenceFieldUpdater2.get(c0063h2);
            if (!(obj2 instanceof C0072q) || ((C0072q) obj2).f1913d == null) {
                C0063h.f1886B.set(c0063h2, 536870911);
                atomicReferenceFieldUpdater2.set(c0063h2, C0057b.f1875a);
                c0063h = c0063h2;
            } else {
                c0063h2.n();
            }
            if (c0063h != null) {
                return c0063h;
            }
        }
        return new C0063h(2, interfaceC1427e);
    }

    public static Class w(Type type) {
        if (type instanceof Class) {
            return (Class) type;
        }
        if (type instanceof ParameterizedType) {
            Type rawType = ((ParameterizedType) type).getRawType();
            h(rawType instanceof Class);
            return (Class) rawType;
        }
        if (type instanceof GenericArrayType) {
            return Array.newInstance((Class<?>) w(((GenericArrayType) type).getGenericComponentType()), 0).getClass();
        }
        if (type instanceof TypeVariable) {
            return Object.class;
        }
        if (type instanceof WildcardType) {
            return w(((WildcardType) type).getUpperBounds()[0]);
        }
        throw new IllegalArgumentException("Expected a Class, ParameterizedType, or GenericArrayType, but <" + type + "> is of type " + (type == null ? "null" : type.getClass().getName()));
    }

    public static final void x(InterfaceC1432j interfaceC1432j, Throwable th) throws IllegalAccessException, InvocationTargetException {
        try {
            InterfaceC0079y interfaceC0079y = (InterfaceC0079y) interfaceC1432j.n(C0078x.f1929w);
            if (interfaceC0079y != null) {
                ((N4.b) interfaceC0079y).J(interfaceC1432j, th);
            } else {
                AbstractC1305a.G(interfaceC1432j, th);
            }
        } catch (Throwable th2) {
            if (th != th2) {
                RuntimeException runtimeException = new RuntimeException("Exception while trying to handle coroutine exception", th2);
                AbstractC1305a.b(runtimeException, th);
                th = runtimeException;
            }
            AbstractC1305a.G(interfaceC1432j, th);
        }
    }

    public static final void y(InterfaceC0062g interfaceC0062g, C0060e c0060e) {
        if (!(interfaceC0062g instanceof C0063h)) {
            throw new UnsupportedOperationException("third-party implementation of CancellableContinuation is not supported");
        }
        ((C0063h) interfaceC0062g).y(c0060e);
    }

    public static K z(b0 b0Var, boolean z5, f0 f0Var, int i6) {
        if ((i6 & 1) != 0) {
            z5 = false;
        }
        boolean z6 = (i6 & 2) != 0;
        if (b0Var instanceof k0) {
            return ((k0) b0Var).P(z5, z6, f0Var);
        }
        H0 h02 = new H0(12, f0Var);
        k0 k0Var = (k0) b0Var;
        k0Var.getClass();
        return k0Var.P(z5, z6, new X(h02));
    }
}
