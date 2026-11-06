package s4;

import C4.p;
import D4.r;
import M4.AbstractC0056a;
import M4.AbstractC0077w;
import M4.C0063h;
import M4.C0074t;
import M4.D;
import M4.H;
import M4.I;
import M4.InterfaceC0079y;
import M4.InterfaceC0080z;
import M4.J;
import M4.w0;
import M4.x0;
import P4.C0141b;
import P4.C0145f;
import P4.C0152m;
import P4.C0153n;
import P4.G;
import P4.InterfaceC0146g;
import P4.o0;
import Q4.A;
import Q4.o;
import R4.u;
import W.d0;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import d.AbstractC0628i;
import d2.AbstractC0650a;
import h0.C0733A;
import h5.C0796x;
import h5.C0797y;
import h5.InterfaceC0782i;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CancellationException;
import o0.C1186g0;
import q2.s;
import v4.C1425c;
import v4.C1428f;
import v4.C1433k;
import v4.InterfaceC1427e;
import v4.InterfaceC1429g;
import v4.InterfaceC1430h;
import v4.InterfaceC1431i;
import v4.InterfaceC1432j;
import w4.C1482b;
import w4.EnumC1481a;
import x4.AbstractC1492a;
import y4.AbstractC1509a;
import z4.AbstractC1533a;

/* JADX INFO: renamed from: s4.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1305a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static Constructor f12628a;

    /* JADX WARN: Removed duplicated region for block: B:29:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object A(P4.InterfaceC0146g r4, C4.p r5, v4.InterfaceC1427e r6) throws java.lang.Throwable {
        /*
            boolean r0 = r6 instanceof P4.O
            if (r0 == 0) goto L13
            r0 = r6
            P4.O r0 = (P4.O) r0
            int r1 = r0.f2619C
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f2619C = r1
            goto L18
        L13:
            P4.O r0 = new P4.O
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.f2618B
            w4.a r1 = w4.EnumC1481a.f13592w
            int r2 = r0.f2619C
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            P4.N r4 = r0.f2617A
            D4.r r5 = r0.f2620z
            S3.a.O(r6)     // Catch: Q4.C0167a -> L2b
            goto L59
        L2b:
            r6 = move-exception
            goto L55
        L2d:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L35:
            S3.a.O(r6)
            D4.r r6 = new D4.r
            r6.<init>()
            P4.N r2 = new P4.N
            r2.<init>(r5, r6)
            r0.f2620z = r6     // Catch: Q4.C0167a -> L51
            r0.f2617A = r2     // Catch: Q4.C0167a -> L51
            r0.f2619C = r3     // Catch: Q4.C0167a -> L51
            java.lang.Object r4 = r4.d(r2, r0)     // Catch: Q4.C0167a -> L51
            if (r4 != r1) goto L4f
            goto L5b
        L4f:
            r5 = r6
            goto L59
        L51:
            r4 = move-exception
            r5 = r6
            r6 = r4
            r4 = r2
        L55:
            java.lang.Object r0 = r6.f2829w
            if (r0 != r4) goto L5c
        L59:
            java.lang.Object r1 = r5.f377w
        L5b:
            return r1
        L5c:
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: s4.AbstractC1305a.A(P4.g, C4.p, v4.e):java.lang.Object");
    }

    public static final InterfaceC1432j B(InterfaceC1432j interfaceC1432j, InterfaceC1432j interfaceC1432j2, boolean z5) {
        Boolean bool = Boolean.FALSE;
        C0074t c0074t = C0074t.f1920z;
        boolean zBooleanValue = ((Boolean) interfaceC1432j.g(bool, c0074t)).booleanValue();
        boolean zBooleanValue2 = ((Boolean) interfaceC1432j2.g(bool, c0074t)).booleanValue();
        if (!zBooleanValue && !zBooleanValue2) {
            return interfaceC1432j.k(interfaceC1432j2);
        }
        r rVar = new r();
        rVar.f377w = interfaceC1432j2;
        C1433k c1433k = C1433k.f13309w;
        InterfaceC1432j interfaceC1432j3 = (InterfaceC1432j) interfaceC1432j.g(c1433k, new K4.g(1, rVar, z5));
        if (zBooleanValue2) {
            rVar.f377w = ((InterfaceC1432j) rVar.f377w).g(c1433k, C0074t.f1919y);
        }
        return interfaceC1432j3.k((InterfaceC1432j) rVar.f377w);
    }

    public static InterfaceC1430h C(InterfaceC1430h interfaceC1430h, InterfaceC1431i interfaceC1431i) {
        o(interfaceC1431i, "key");
        if (c(interfaceC1430h.getKey(), interfaceC1431i)) {
            return interfaceC1430h;
        }
        return null;
    }

    public static final Class D(I4.b bVar) {
        o(bVar, "<this>");
        Class clsA = ((D4.c) bVar).a();
        m(clsA, "null cannot be cast to non-null type java.lang.Class<T of kotlin.jvm.JvmClassMappingKt.<get-java>>");
        return clsA;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static final Class E(I4.b bVar) {
        o(bVar, "<this>");
        Class clsA = ((D4.c) bVar).a();
        if (!clsA.isPrimitive()) {
            return clsA;
        }
        String name = clsA.getName();
        switch (name.hashCode()) {
            case -1325958191:
                if (!name.equals("double")) {
                }
                break;
            case 104431:
                if (!name.equals("int")) {
                }
                break;
            case 3039496:
                if (!name.equals("byte")) {
                }
                break;
            case 3052374:
                if (!name.equals("char")) {
                }
                break;
            case 3327612:
                if (!name.equals("long")) {
                }
                break;
            case 3625364:
                if (!name.equals("void")) {
                }
                break;
            case 64711720:
                if (!name.equals("boolean")) {
                }
                break;
            case 97526364:
                if (!name.equals("float")) {
                }
                break;
            case 109413500:
                if (!name.equals("short")) {
                }
                break;
        }
        return clsA;
    }

    public static final u F(Object obj) {
        if (obj != R4.a.f3002b) {
            return (u) obj;
        }
        throw new IllegalStateException("Does not contain segment".toString());
    }

    public static final void G(InterfaceC1432j interfaceC1432j, Throwable th) throws IllegalAccessException, InvocationTargetException {
        Throwable runtimeException;
        Iterator it = R4.f.f3012a.iterator();
        while (it.hasNext()) {
            try {
                ((N4.b) ((InterfaceC0079y) it.next())).J(interfaceC1432j, th);
            } catch (Throwable th2) {
                if (th == th2) {
                    runtimeException = th;
                } else {
                    runtimeException = new RuntimeException("Exception while trying to handle coroutine exception", th2);
                    b(runtimeException, th);
                }
                Thread threadCurrentThread = Thread.currentThread();
                threadCurrentThread.getUncaughtExceptionHandler().uncaughtException(threadCurrentThread, runtimeException);
            }
        }
        try {
            b(th, new R4.g(interfaceC1432j));
        } catch (Throwable unused) {
        }
        Thread threadCurrentThread2 = Thread.currentThread();
        threadCurrentThread2.getUncaughtExceptionHandler().uncaughtException(threadCurrentThread2, th);
    }

    public static InterfaceC1427e H(InterfaceC1427e interfaceC1427e) {
        o(interfaceC1427e, "<this>");
        x4.c cVar = interfaceC1427e instanceof x4.c ? (x4.c) interfaceC1427e : null;
        if (cVar == null) {
            return interfaceC1427e;
        }
        InterfaceC1427e interfaceC1427e2 = cVar.f13685y;
        if (interfaceC1427e2 != null) {
            return interfaceC1427e2;
        }
        InterfaceC1429g interfaceC1429g = (InterfaceC1429g) cVar.i().n(C1428f.f13308w);
        InterfaceC1427e hVar = interfaceC1429g != null ? new R4.h((AbstractC0077w) interfaceC1429g, cVar) : cVar;
        cVar.f13685y = hVar;
        return hVar;
    }

    public static Object I(Method method, Class cls, Object obj, Object[] objArr) throws NoSuchMethodException {
        Constructor declaredConstructor = f12628a;
        if (declaredConstructor == null) {
            declaredConstructor = AbstractC0650a.j().getDeclaredConstructor(Class.class, Integer.TYPE);
            declaredConstructor.setAccessible(true);
            f12628a = declaredConstructor;
        }
        return AbstractC0650a.o(declaredConstructor.newInstance(cls, -1)).unreflectSpecial(method, cls).bindTo(obj).invokeWithArguments(objArr);
    }

    public static final boolean J(int i6) {
        return i6 == 1 || i6 == 2;
    }

    public static final boolean K(Object obj) {
        return obj == R4.a.f3002b;
    }

    public static final boolean L(char c6) {
        return Character.isWhitespace(c6) || Character.isSpaceChar(c6);
    }

    public static int M(int i6) {
        if (i6 < 0) {
            return i6;
        }
        if (i6 < 3) {
            return i6 + 1;
        }
        if (i6 < 1073741824) {
            return (int) ((i6 / 0.75f) + 1.0f);
        }
        return Integer.MAX_VALUE;
    }

    public static InterfaceC1432j N(InterfaceC1430h interfaceC1430h, InterfaceC1431i interfaceC1431i) {
        o(interfaceC1431i, "key");
        return c(interfaceC1430h.getKey(), interfaceC1431i) ? C1433k.f13309w : interfaceC1430h;
    }

    public static final InterfaceC1432j O(InterfaceC0080z interfaceC0080z, InterfaceC1432j interfaceC1432j) {
        InterfaceC1432j interfaceC1432jB = B(interfaceC0080z.u(), interfaceC1432j, true);
        S4.e eVar = J.f1851a;
        return (interfaceC1432jB == eVar || interfaceC1432jB.n(C1428f.f13308w) != null) ? interfaceC1432jB : interfaceC1432jB.k(eVar);
    }

    public static InterfaceC1432j Q(InterfaceC1430h interfaceC1430h, InterfaceC1432j interfaceC1432j) {
        o(interfaceC1432j, "context");
        return interfaceC1432j == C1433k.f13309w ? interfaceC1430h : (InterfaceC1432j) interfaceC1432j.g(interfaceC1430h, C1425c.f13304z);
    }

    public static final Object R(Object obj) {
        return obj instanceof M4.r ? S3.a.m(((M4.r) obj).f1916a) : obj;
    }

    public static final void S(I i6, InterfaceC1427e interfaceC1427e, boolean z5) {
        Object objJ = i6.j();
        Throwable thF = i6.f(objJ);
        Object objM = thF != null ? S3.a.m(thF) : i6.g(objJ);
        if (!z5) {
            interfaceC1427e.o(objM);
            return;
        }
        m(interfaceC1427e, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<T of kotlinx.coroutines.DispatchedTaskKt.resume>");
        R4.h hVar = (R4.h) interfaceC1427e;
        InterfaceC1427e interfaceC1427e2 = hVar.f3015A;
        InterfaceC1432j interfaceC1432jI = interfaceC1427e2.i();
        Object objF = R4.a.f(interfaceC1432jI, hVar.f3017C);
        w0 w0VarY = objF != R4.a.f3006f ? Y(interfaceC1427e2, interfaceC1432jI, objF) : null;
        try {
            interfaceC1427e2.o(objM);
        } finally {
            if (w0VarY == null || w0VarY.g0()) {
                R4.a.b(interfaceC1432jI, objF);
            }
        }
    }

    public static void T(String str, RuntimeException runtimeException) {
        StackTraceElement[] stackTrace = runtimeException.getStackTrace();
        int length = stackTrace.length;
        int i6 = -1;
        for (int i7 = 0; i7 < length; i7++) {
            if (str.equals(stackTrace[i7].getClassName())) {
                i6 = i7;
            }
        }
        runtimeException.setStackTrace((StackTraceElement[]) Arrays.copyOfRange(stackTrace, i6 + 1, length));
    }

    public static void U(p pVar, AbstractC0056a abstractC0056a, AbstractC0056a abstractC0056a2) {
        try {
            R4.a.c(H(u(abstractC0056a, abstractC0056a2, pVar)), C1316l.f12640a, null);
        } catch (Throwable th) {
            abstractC0056a2.o(S3.a.m(th));
            throw th;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void V(java.lang.Throwable r4, v4.InterfaceC1427e r5) throws java.lang.Throwable {
        /*
            boolean r0 = r5 instanceof h5.C0798z
            if (r0 == 0) goto L13
            r0 = r5
            h5.z r0 = (h5.C0798z) r0
            int r1 = r0.f9133A
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f9133A = r1
            goto L18
        L13:
            h5.z r0 = new h5.z
            r0.<init>(r5)
        L18:
            java.lang.Object r5 = r0.f9134z
            int r1 = r0.f9133A
            r2 = 1
            if (r1 == 0) goto L32
            if (r1 == r2) goto L29
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L29:
            S3.a.O(r5)
            h0.A r4 = new h0.A
            r4.<init>()
            throw r4
        L32:
            S3.a.O(r5)
            r0.getClass()
            r0.f9133A = r2
            S4.e r5 = M4.J.f1851a
            v4.j r1 = r0.f13684x
            l(r1)
            m2.c1 r2 = new m2.c1
            r3 = 15
            r2.<init>(r0, r4, r3)
            r5.J(r1, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: s4.AbstractC1305a.V(java.lang.Throwable, v4.e):void");
    }

    public static void W(String str) {
        C0733A c0733a = new C0733A(AbstractC0628i.j("lateinit property ", str, " has not been initialized"));
        T(AbstractC1305a.class.getName(), c0733a);
        throw c0733a;
    }

    public static final Map X(Map map) {
        o(map, "<this>");
        Map.Entry entry = (Map.Entry) map.entrySet().iterator().next();
        Map mapSingletonMap = Collections.singletonMap(entry.getKey(), entry.getValue());
        n(mapSingletonMap, "with(...)");
        return mapSingletonMap;
    }

    public static final w0 Y(InterfaceC1427e interfaceC1427e, InterfaceC1432j interfaceC1432j, Object obj) {
        w0 w0Var = null;
        if (!(interfaceC1427e instanceof x4.d)) {
            return null;
        }
        if (interfaceC1432j.n(x0.f1931w) != null) {
            x4.d dVarE = (x4.d) interfaceC1427e;
            while (true) {
                if ((dVarE instanceof H) || (dVarE = dVarE.e()) == null) {
                    break;
                }
                if (dVarE instanceof w0) {
                    w0Var = (w0) dVarE;
                    break;
                }
            }
            if (w0Var != null) {
                w0Var.h0(interfaceC1432j, obj);
            }
        }
        return w0Var;
    }

    public static final Object Z(InterfaceC1432j interfaceC1432j, Object obj, Object obj2, p pVar, InterfaceC1427e interfaceC1427e) {
        Object objH;
        Object objF = R4.a.f(interfaceC1432j, obj2);
        try {
            A a6 = new A(interfaceC1427e, interfaceC1432j);
            if (pVar instanceof AbstractC1492a) {
                S3.a.f(2, pVar);
                objH = pVar.h(obj, a6);
            } else {
                objH = a0(obj, a6, pVar);
            }
            R4.a.b(interfaceC1432j, objF);
            if (objH == EnumC1481a.f13592w) {
                o(interfaceC1427e, "frame");
            }
            return objH;
        } catch (Throwable th) {
            R4.a.b(interfaceC1432j, objF);
            throw th;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object a(P4.s0 r4, C4.q r5, java.lang.Throwable r6, v4.InterfaceC1427e r7) throws java.lang.Throwable {
        /*
            boolean r0 = r7 instanceof P4.C0154o
            if (r0 == 0) goto L13
            r0 = r7
            P4.o r0 = (P4.C0154o) r0
            int r1 = r0.f2724B
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f2724B = r1
            goto L18
        L13:
            P4.o r0 = new P4.o
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.f2723A
            w4.a r1 = w4.EnumC1481a.f13592w
            int r2 = r0.f2724B
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            java.lang.Throwable r6 = r0.f2725z
            S3.a.O(r7)     // Catch: java.lang.Throwable -> L29
            goto L41
        L29:
            r4 = move-exception
            goto L44
        L2b:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L33:
            S3.a.O(r7)
            r0.f2725z = r6     // Catch: java.lang.Throwable -> L29
            r0.f2724B = r3     // Catch: java.lang.Throwable -> L29
            java.lang.Object r4 = r5.g(r4, r6, r0)     // Catch: java.lang.Throwable -> L29
            if (r4 != r1) goto L41
            goto L43
        L41:
            s4.l r1 = s4.C1316l.f12640a
        L43:
            return r1
        L44:
            if (r6 == 0) goto L4b
            if (r6 == r4) goto L4b
            b(r4, r6)
        L4b:
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: s4.AbstractC1305a.a(P4.s0, C4.q, java.lang.Throwable, v4.e):java.lang.Object");
    }

    public static Object a0(Object obj, InterfaceC1427e interfaceC1427e, p pVar) {
        o(pVar, "<this>");
        InterfaceC1432j interfaceC1432jI = interfaceC1427e.i();
        Object dVar = interfaceC1432jI == C1433k.f13309w ? new w4.d(interfaceC1427e) : new w4.e(interfaceC1427e, interfaceC1432jI);
        S3.a.f(2, pVar);
        return pVar.h(obj, dVar);
    }

    public static void b(Throwable th, Throwable th2) throws IllegalAccessException, InvocationTargetException {
        o(th, "<this>");
        o(th2, "exception");
        if (th != th2) {
            Integer num = AbstractC1533a.f14127a;
            if (num == null || num.intValue() >= 19) {
                th.addSuppressed(th2);
                return;
            }
            Method method = AbstractC1509a.f13837a;
            if (method != null) {
                method.invoke(th, th2);
            }
        }
    }

    public static boolean c(Object obj, Object obj2) {
        return obj == null ? obj2 == null : obj.equals(obj2);
    }

    public static final Object d(InterfaceC0782i interfaceC0782i, InterfaceC1427e interfaceC1427e) {
        C0063h c0063h = new C0063h(1, H(interfaceC1427e));
        c0063h.v();
        int i6 = 0;
        c0063h.x(new C0796x(interfaceC0782i, i6));
        interfaceC0782i.c(new C0797y(c0063h, i6));
        return c0063h.u();
    }

    public static final Object e(s sVar, N3.r rVar) throws Exception {
        if (!sVar.e()) {
            C0063h c0063h = new C0063h(1, H(rVar));
            c0063h.v();
            sVar.h(U4.a.f3638w, new T1.j(1, c0063h));
            return c0063h.u();
        }
        Exception excC = sVar.c();
        if (excC != null) {
            throw excC;
        }
        if (!sVar.f12377d) {
            return sVar.d();
        }
        throw new CancellationException("Task " + sVar + " was cancelled normally.");
    }

    public static final d0 f(C4.l lVar, Object obj, InterfaceC1432j interfaceC1432j) {
        return new d0(lVar, obj, interfaceC1432j, 3);
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0062  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void g(android.content.Context r5, android.graphics.Bitmap r6) throws java.lang.Throwable {
        /*
            r0 = 0
            android.renderscript.RenderScript r5 = android.renderscript.RenderScript.create(r5)     // Catch: java.lang.Throwable -> L4d
            android.renderscript.RenderScript$RSMessageHandler r1 = new android.renderscript.RenderScript$RSMessageHandler     // Catch: java.lang.Throwable -> L49
            r1.<init>()     // Catch: java.lang.Throwable -> L49
            r5.setMessageHandler(r1)     // Catch: java.lang.Throwable -> L49
            android.renderscript.Allocation$MipmapControl r1 = android.renderscript.Allocation.MipmapControl.MIPMAP_NONE     // Catch: java.lang.Throwable -> L49
            r2 = 1
            android.renderscript.Allocation r1 = android.renderscript.Allocation.createFromBitmap(r5, r6, r1, r2)     // Catch: java.lang.Throwable -> L49
            android.renderscript.Type r2 = r1.getType()     // Catch: java.lang.Throwable -> L44
            android.renderscript.Allocation r2 = android.renderscript.Allocation.createTyped(r5, r2)     // Catch: java.lang.Throwable -> L44
            android.renderscript.Element r3 = android.renderscript.Element.U8_4(r5)     // Catch: java.lang.Throwable -> L3f
            android.renderscript.ScriptIntrinsicBlur r0 = android.renderscript.ScriptIntrinsicBlur.create(r5, r3)     // Catch: java.lang.Throwable -> L3f
            r0.setInput(r1)     // Catch: java.lang.Throwable -> L3f
            r3 = 2
            float r3 = (float) r3     // Catch: java.lang.Throwable -> L3f
            r0.setRadius(r3)     // Catch: java.lang.Throwable -> L3f
            r0.forEach(r2)     // Catch: java.lang.Throwable -> L3f
            r2.copyTo(r6)     // Catch: java.lang.Throwable -> L3f
            android.renderscript.RenderScript.releaseAllContexts()
            r1.destroy()
            r2.destroy()
            r0.destroy()
            return
        L3f:
            r6 = move-exception
            r4 = r0
            r0 = r5
            r5 = r4
            goto L51
        L44:
            r6 = move-exception
            r2 = r0
        L46:
            r0 = r5
            r5 = r2
            goto L51
        L49:
            r6 = move-exception
            r1 = r0
            r2 = r1
            goto L46
        L4d:
            r6 = move-exception
            r5 = r0
            r1 = r5
            r2 = r1
        L51:
            if (r0 == 0) goto L56
            android.renderscript.RenderScript.releaseAllContexts()
        L56:
            if (r1 == 0) goto L5b
            r1.destroy()
        L5b:
            if (r2 == 0) goto L60
            r2.destroy()
        L60:
            if (r5 == 0) goto L65
            r5.destroy()
        L65:
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: s4.AbstractC1305a.g(android.content.Context, android.graphics.Bitmap):void");
    }

    public static InterfaceC0146g h(InterfaceC0146g interfaceC0146g, int i6) {
        O4.a aVar = O4.a.f2342w;
        if (i6 < 0 && i6 != -2 && i6 != -1) {
            throw new IllegalArgumentException(AbstractC0628i.f("Buffer size should be non-negative, BUFFERED, or CONFLATED, but was ", i6).toString());
        }
        if (i6 == -1) {
            aVar = O4.a.f2343x;
            i6 = 0;
        }
        int i7 = i6;
        O4.a aVar2 = aVar;
        return interfaceC0146g instanceof Q4.s ? S3.a.q((Q4.s) interfaceC0146g, null, i7, aVar2, 1) : new Q4.j(interfaceC0146g, null, i7, aVar2, 2);
    }

    public static final C0733A i(C4.l lVar, Object obj, C0733A c0733a) throws IllegalAccessException, InvocationTargetException {
        try {
            lVar.j(obj);
        } catch (Throwable th) {
            if (c0733a == null || c0733a.getCause() == th) {
                return new C0733A("Exception in undelivered element handler for " + obj, th);
            }
            b(c0733a, th);
        }
        return c0733a;
    }

    public static boolean j(Context context, Intent intent) {
        List<ResolveInfo> listQueryBroadcastReceivers = context.getPackageManager().queryBroadcastReceivers(intent, 0);
        return listQueryBroadcastReceivers != null && listQueryBroadcastReceivers.size() > 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:54:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.io.Serializable k(v4.InterfaceC1427e r4, P4.InterfaceC0146g r5, P4.InterfaceC0147h r6) throws java.lang.Throwable {
        /*
            boolean r0 = r4 instanceof P4.C0160v
            if (r0 == 0) goto L13
            r0 = r4
            P4.v r0 = (P4.C0160v) r0
            int r1 = r0.f2761B
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f2761B = r1
            goto L18
        L13:
            P4.v r0 = new P4.v
            r0.<init>(r4)
        L18:
            java.lang.Object r4 = r0.f2760A
            w4.a r1 = w4.EnumC1481a.f13592w
            int r2 = r0.f2761B
            r3 = 1
            if (r2 == 0) goto L34
            if (r2 != r3) goto L2c
            D4.r r5 = r0.f2762z
            S3.a.O(r4)     // Catch: java.lang.Throwable -> L29
            goto L4c
        L29:
            r4 = move-exception
            r1 = r4
            goto L51
        L2c:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L34:
            S3.a.O(r4)
            D4.r r4 = new D4.r
            r4.<init>()
            P4.x r2 = new P4.x     // Catch: java.lang.Throwable -> L4e
            r2.<init>(r6, r4)     // Catch: java.lang.Throwable -> L4e
            r0.f2762z = r4     // Catch: java.lang.Throwable -> L4e
            r0.f2761B = r3     // Catch: java.lang.Throwable -> L4e
            java.lang.Object r4 = r5.d(r2, r0)     // Catch: java.lang.Throwable -> L4e
            if (r4 != r1) goto L4c
            goto L90
        L4c:
            r1 = 0
            goto L90
        L4e:
            r5 = move-exception
            r1 = r5
            r5 = r4
        L51:
            java.lang.Object r4 = r5.f377w
            java.lang.Throwable r4 = (java.lang.Throwable) r4
            if (r4 == 0) goto L5d
            boolean r5 = c(r4, r1)
            if (r5 != 0) goto L8d
        L5d:
            v4.j r5 = r0.f13684x
            l(r5)
            M4.x r6 = M4.C0078x.f1930x
            v4.h r5 = r5.n(r6)
            M4.b0 r5 = (M4.b0) r5
            if (r5 == 0) goto L8e
            M4.k0 r5 = (M4.k0) r5
            java.lang.Object r6 = r5.K()
            boolean r0 = r6 instanceof M4.r
            if (r0 != 0) goto L82
            boolean r0 = r6 instanceof M4.i0
            if (r0 == 0) goto L8e
            M4.i0 r6 = (M4.i0) r6
            boolean r6 = r6.d()
            if (r6 == 0) goto L8e
        L82:
            java.util.concurrent.CancellationException r5 = r5.F()
            boolean r5 = c(r5, r1)
            if (r5 != 0) goto L8d
            goto L8e
        L8d:
            throw r1
        L8e:
            if (r4 != 0) goto L91
        L90:
            return r1
        L91:
            boolean r5 = r1 instanceof java.util.concurrent.CancellationException
            if (r5 == 0) goto L99
            b(r4, r1)
            throw r4
        L99:
            b(r1, r4)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: s4.AbstractC1305a.k(v4.e, P4.g, P4.h):java.io.Serializable");
    }

    public static void l(Object obj) {
        if (obj != null) {
            return;
        }
        NullPointerException nullPointerException = new NullPointerException();
        T(AbstractC1305a.class.getName(), nullPointerException);
        throw nullPointerException;
    }

    public static void m(Object obj, String str) {
        if (obj != null) {
            return;
        }
        NullPointerException nullPointerException = new NullPointerException(str);
        T(AbstractC1305a.class.getName(), nullPointerException);
        throw nullPointerException;
    }

    public static void n(Object obj, String str) {
        if (obj != null) {
            return;
        }
        NullPointerException nullPointerException = new NullPointerException(str.concat(" must not be null"));
        T(AbstractC1305a.class.getName(), nullPointerException);
        throw nullPointerException;
    }

    public static void o(Object obj, String str) {
        if (obj == null) {
            StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
            String name = AbstractC1305a.class.getName();
            int i6 = 0;
            while (!stackTrace[i6].getClassName().equals(name)) {
                i6++;
            }
            while (stackTrace[i6].getClassName().equals(name)) {
                i6++;
            }
            StackTraceElement stackTraceElement = stackTrace[i6];
            NullPointerException nullPointerException = new NullPointerException("Parameter specified as non-null is null: method " + stackTraceElement.getClassName() + "." + stackTraceElement.getMethodName() + ", parameter " + str);
            T(AbstractC1305a.class.getName(), nullPointerException);
            throw nullPointerException;
        }
    }

    public static void p(int i6) {
        if (new H4.c(2, 36, 1).c(i6)) {
            return;
        }
        StringBuilder sbL = H1.a.l("radix ", i6, " was not in valid range ");
        sbL.append(new H4.c(2, 36, 1));
        throw new IllegalArgumentException(sbL.toString());
    }

    public static final Object q(InterfaceC0146g interfaceC0146g, p pVar, InterfaceC1427e interfaceC1427e) {
        int i6 = G.f2592a;
        Object objD = h(new o(new C1186g0(1, pVar, null), interfaceC0146g, C1433k.f13309w, -2, O4.a.f2342w), 0).d(Q4.u.f2874w, interfaceC1427e);
        EnumC1481a enumC1481a = EnumC1481a.f13592w;
        C1316l c1316l = C1316l.f12640a;
        if (objD != enumC1481a) {
            objD = c1316l;
        }
        return objD == enumC1481a ? objD : c1316l;
    }

    public static final C0141b r(O4.g gVar) {
        return new C0141b(gVar, true);
    }

    public static final long s(long j6, L4.c cVar, L4.c cVar2) {
        o(cVar, "sourceUnit");
        o(cVar2, "targetUnit");
        return cVar2.f1750w.convert(j6, cVar.f1750w);
    }

    public static final void t(int i6, int i7) {
        if (i6 <= i7) {
            return;
        }
        throw new IndexOutOfBoundsException("toIndex (" + i6 + ") is greater than size (" + i7 + ").");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static InterfaceC1427e u(Object obj, InterfaceC1427e interfaceC1427e, p pVar) {
        o(pVar, "<this>");
        o(interfaceC1427e, "completion");
        if (pVar instanceof AbstractC1492a) {
            return ((AbstractC1492a) pVar).l(obj, interfaceC1427e);
        }
        InterfaceC1432j interfaceC1432jI = interfaceC1427e.i();
        return interfaceC1432jI == C1433k.f13309w ? new C1482b(obj, interfaceC1427e, pVar) : new w4.c(interfaceC1427e, interfaceC1432jI, pVar, obj);
    }

    public static final Object v(long j6, InterfaceC1427e interfaceC1427e) {
        C1316l c1316l = C1316l.f12640a;
        if (j6 <= 0) {
            return c1316l;
        }
        C0063h c0063h = new C0063h(1, H(interfaceC1427e));
        c0063h.v();
        if (j6 < Long.MAX_VALUE) {
            InterfaceC1430h interfaceC1430hN = c0063h.f1889A.n(C1428f.f13308w);
            M4.G g4 = interfaceC1430hN instanceof M4.G ? (M4.G) interfaceC1430hN : null;
            if (g4 == null) {
                g4 = D.f1848a;
            }
            g4.u(j6, c0063h);
        }
        Object objU = c0063h.u();
        return objU == EnumC1481a.f13592w ? objU : c1316l;
    }

    public static final InterfaceC0146g w(InterfaceC0146g interfaceC0146g) {
        if (interfaceC0146g instanceof o0) {
            return interfaceC0146g;
        }
        C0153n c0153n = C0153n.f2720x;
        C0152m c0152m = C0152m.f2718x;
        if (interfaceC0146g instanceof C0145f) {
            C0145f c0145f = (C0145f) interfaceC0146g;
            if (c0145f.f2683x == c0153n && c0145f.f2684y == c0152m) {
                return interfaceC0146g;
            }
        }
        return new C0145f(interfaceC0146g);
    }

    public static int x(int i6, int i7) {
        if (i7 < 0) {
            throw new AssertionError("cannot store more than MAX_VALUE elements");
        }
        int iHighestOneBit = i6 + (i6 >> 1) + 1;
        if (iHighestOneBit < i7) {
            iHighestOneBit = Integer.highestOneBit(i7 - 1) << 1;
        }
        if (iHighestOneBit < 0) {
            return Integer.MAX_VALUE;
        }
        return iHighestOneBit;
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object y(P4.InterfaceC0146g r5, v4.InterfaceC1427e r6) throws java.lang.Throwable {
        /*
            boolean r0 = r6 instanceof P4.K
            if (r0 == 0) goto L13
            r0 = r6
            P4.K r0 = (P4.K) r0
            int r1 = r0.f2603C
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f2603C = r1
            goto L18
        L13:
            P4.K r0 = new P4.K
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.f2602B
            w4.a r1 = w4.EnumC1481a.f13592w
            int r2 = r0.f2603C
            j3.A r3 = Q4.AbstractC0169c.f2835b
            r4 = 1
            if (r2 == 0) goto L37
            if (r2 != r4) goto L2f
            P4.H r5 = r0.f2601A
            D4.r r0 = r0.f2604z
            S3.a.O(r6)     // Catch: Q4.C0167a -> L2d
            goto L5d
        L2d:
            r6 = move-exception
            goto L59
        L2f:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L37:
            S3.a.O(r6)
            D4.r r6 = new D4.r
            r6.<init>()
            r6.f377w = r3
            P4.H r2 = new P4.H
            r2.<init>(r6)
            r0.f2604z = r6     // Catch: Q4.C0167a -> L55
            r0.f2601A = r2     // Catch: Q4.C0167a -> L55
            r0.f2603C = r4     // Catch: Q4.C0167a -> L55
            java.lang.Object r5 = r5.d(r2, r0)     // Catch: Q4.C0167a -> L55
            if (r5 != r1) goto L53
            goto L61
        L53:
            r0 = r6
            goto L5d
        L55:
            r5 = move-exception
            r0 = r6
            r6 = r5
            r5 = r2
        L59:
            java.lang.Object r1 = r6.f2829w
            if (r1 != r5) goto L6a
        L5d:
            java.lang.Object r1 = r0.f377w
            if (r1 == r3) goto L62
        L61:
            return r1
        L62:
            java.util.NoSuchElementException r5 = new java.util.NoSuchElementException
            java.lang.String r6 = "Expected at least one element"
            r5.<init>(r6)
            throw r5
        L6a:
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: s4.AbstractC1305a.y(P4.g, v4.e):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object z(Q4.B r5, P4.P r6, v4.InterfaceC1427e r7) throws java.lang.Throwable {
        /*
            boolean r0 = r7 instanceof P4.L
            if (r0 == 0) goto L13
            r0 = r7
            P4.L r0 = (P4.L) r0
            int r1 = r0.f2608D
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f2608D = r1
            goto L18
        L13:
            P4.L r0 = new P4.L
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.f2607C
            w4.a r1 = w4.EnumC1481a.f13592w
            int r2 = r0.f2608D
            j3.A r3 = Q4.AbstractC0169c.f2835b
            r4 = 1
            if (r2 == 0) goto L39
            if (r2 != r4) goto L31
            P4.J r5 = r0.f2606B
            D4.r r6 = r0.f2605A
            C4.p r0 = r0.f2609z
            S3.a.O(r7)     // Catch: Q4.C0167a -> L2f
            goto L5f
        L2f:
            r7 = move-exception
            goto L5b
        L31:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L39:
            S3.a.O(r7)
            D4.r r7 = new D4.r
            r7.<init>()
            r7.f377w = r3
            P4.J r2 = new P4.J
            r2.<init>(r6, r7)
            r0.f2609z = r6     // Catch: Q4.C0167a -> L59
            r0.f2605A = r7     // Catch: Q4.C0167a -> L59
            r0.f2606B = r2     // Catch: Q4.C0167a -> L59
            r0.f2608D = r4     // Catch: Q4.C0167a -> L59
            r5.d(r2, r0)     // Catch: Q4.C0167a -> L59
            goto L63
        L54:
            r0 = r6
            r6 = r7
            r7 = r5
            r5 = r2
            goto L5b
        L59:
            r5 = move-exception
            goto L54
        L5b:
            java.lang.Object r1 = r7.f2829w
            if (r1 != r5) goto L78
        L5f:
            java.lang.Object r1 = r6.f377w
            if (r1 == r3) goto L64
        L63:
            return r1
        L64:
            java.util.NoSuchElementException r5 = new java.util.NoSuchElementException
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            java.lang.String r7 = "Expected at least one element matching the predicate "
            r6.<init>(r7)
            r6.append(r0)
            java.lang.String r6 = r6.toString()
            r5.<init>(r6)
            throw r5
        L78:
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: s4.AbstractC1305a.z(Q4.B, P4.P, v4.e):java.lang.Object");
    }

    public abstract Object P(int i6, Object obj, InterfaceC1427e interfaceC1427e);
}
