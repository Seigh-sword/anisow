package O4;

import M4.y0;
import d.AbstractC0628i;
import h0.C0733A;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.LinkedHashMap;
import s4.AbstractC1305a;
import s4.C1316l;
import v4.InterfaceC1427e;

/* JADX INFO: loaded from: classes.dex */
public final class n extends c {

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public final a f2387H;

    public n(int i6, a aVar, C4.l lVar) {
        String str;
        String str2;
        super(i6, lVar);
        this.f2387H = aVar;
        if (aVar != a.f2342w) {
            if (i6 < 1) {
                throw new IllegalArgumentException(H1.a.j("Buffered channel capacity must be at least 1, but ", i6, " was specified").toString());
            }
            return;
        }
        StringBuilder sb = new StringBuilder("This implementation does not support suspension for senders, use ");
        Class cls = D4.s.a(c.class).f367a;
        AbstractC1305a.o(cls, "jClass");
        String simpleName = null;
        if (!cls.isAnonymousClass()) {
            if (cls.isLocalClass()) {
                String simpleName2 = cls.getSimpleName();
                Method enclosingMethod = cls.getEnclosingMethod();
                if (enclosingMethod == null) {
                    Constructor<?> enclosingConstructor = cls.getEnclosingConstructor();
                    if (enclosingConstructor == null) {
                        int iC0 = K4.h.c0(simpleName2, '$', false, 6);
                        if (iC0 == -1) {
                            simpleName = simpleName2;
                        } else {
                            String strSubstring = simpleName2.substring(iC0 + 1, simpleName2.length());
                            AbstractC1305a.n(strSubstring, "substring(...)");
                            simpleName = strSubstring;
                        }
                    } else {
                        str2 = enclosingConstructor.getName() + '$';
                    }
                } else {
                    str2 = enclosingMethod.getName() + '$';
                }
                simpleName = K4.h.j0(simpleName2, str2);
            } else {
                boolean zIsArray = cls.isArray();
                LinkedHashMap linkedHashMap = D4.d.f366d;
                if (zIsArray) {
                    Class<?> componentType = cls.getComponentType();
                    if (componentType.isPrimitive() && (str = (String) linkedHashMap.get(componentType.getName())) != null) {
                        simpleName = str.concat("Array");
                    }
                    if (simpleName == null) {
                        simpleName = "Array";
                    }
                } else {
                    simpleName = (String) linkedHashMap.get(cls.getName());
                    if (simpleName == null) {
                        simpleName = cls.getSimpleName();
                    }
                }
            }
        }
        throw new IllegalArgumentException(AbstractC0628i.m(sb, simpleName, " instead").toString());
    }

    public final Object G(Object obj, boolean z5) throws IllegalAccessException, InvocationTargetException {
        k kVar;
        C4.l lVar;
        C0733A c0733aI;
        a aVar = a.f2344y;
        C1316l c1316l = C1316l.f12640a;
        if (this.f2387H == aVar) {
            Object objM = super.m(obj);
            if ((!(objM instanceof i)) || (objM instanceof h)) {
                return objM;
            }
            if (!z5 || (lVar = this.f2359x) == null || (c0733aI = AbstractC1305a.i(lVar, obj, null)) == null) {
                return c1316l;
            }
            throw c0733aI;
        }
        S3.q qVar = e.f2364d;
        k kVar2 = (k) c.f2351C.get(this);
        while (true) {
            long andIncrement = c.f2356y.getAndIncrement(this);
            long j6 = andIncrement & 1152921504606846975L;
            boolean zV = v(false, andIncrement);
            int i6 = e.f2362b;
            long j7 = i6;
            long j8 = j6 / j7;
            int i7 = (int) (j6 % j7);
            if (kVar2.f3041c != j8) {
                k kVarC = c.c(this, j8, kVar2);
                if (kVarC != null) {
                    kVar = kVarC;
                } else if (zV) {
                    return new h(s());
                }
            } else {
                kVar = kVar2;
            }
            int iE = c.e(this, kVar, i7, obj, j6, qVar, zV);
            if (iE == 0) {
                kVar.a();
                return c1316l;
            }
            if (iE == 1) {
                return c1316l;
            }
            if (iE == 2) {
                if (zV) {
                    kVar.h();
                    return new h(s());
                }
                y0 y0Var = qVar instanceof y0 ? (y0) qVar : null;
                if (y0Var != null) {
                    y0Var.a(kVar, i7 + i6);
                }
                l((kVar.f3041c * j7) + ((long) i7));
                return c1316l;
            }
            if (iE == 3) {
                throw new IllegalStateException("unexpected".toString());
            }
            if (iE == 4) {
                if (j6 < c.f2357z.get(this)) {
                    kVar.a();
                }
                return new h(s());
            }
            if (iE == 5) {
                kVar.a();
            }
            kVar2 = kVar;
        }
    }

    @Override // O4.c, O4.r
    public final Object a(Object obj, InterfaceC1427e interfaceC1427e) throws Throwable {
        C0733A c0733aI;
        Object objG = G(obj, true);
        boolean z5 = objG instanceof h;
        if (!z5) {
            return C1316l.f12640a;
        }
        if (z5) {
        }
        C4.l lVar = this.f2359x;
        if (lVar == null || (c0733aI = AbstractC1305a.i(lVar, obj, null)) == null) {
            throw s();
        }
        AbstractC1305a.b(c0733aI, s());
        throw c0733aI;
    }

    @Override // O4.c, O4.r
    public final Object m(Object obj) {
        return G(obj, false);
    }

    @Override // O4.c
    public final boolean w() {
        return this.f2387H == a.f2343x;
    }
}
