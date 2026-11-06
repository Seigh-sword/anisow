package x4;

import java.io.Serializable;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import m.V0;
import s4.AbstractC1305a;
import v4.InterfaceC1427e;
import w4.EnumC1481a;

/* JADX INFO: renamed from: x4.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1492a implements InterfaceC1427e, d, Serializable {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final InterfaceC1427e f13682w;

    public AbstractC1492a(InterfaceC1427e interfaceC1427e) {
        this.f13682w = interfaceC1427e;
    }

    public d e() {
        InterfaceC1427e interfaceC1427e = this.f13682w;
        if (interfaceC1427e instanceof d) {
            return (d) interfaceC1427e;
        }
        return null;
    }

    public InterfaceC1427e l(Object obj, InterfaceC1427e interfaceC1427e) {
        AbstractC1305a.o(interfaceC1427e, "completion");
        throw new UnsupportedOperationException("create(Any?;Continuation) has not been overridden");
    }

    public StackTraceElement m() {
        int iIntValue;
        String strC;
        e eVar = (e) getClass().getAnnotation(e.class);
        String str = null;
        if (eVar == null) {
            return null;
        }
        int iV = eVar.v();
        if (iV > 1) {
            throw new IllegalStateException(("Debug metadata version mismatch. Expected: 1, got " + iV + ". Please update the Kotlin standard library.").toString());
        }
        try {
            Field declaredField = getClass().getDeclaredField("label");
            declaredField.setAccessible(true);
            Object obj = declaredField.get(this);
            Integer num = obj instanceof Integer ? (Integer) obj : null;
            iIntValue = (num != null ? num.intValue() : 0) - 1;
        } catch (Exception unused) {
            iIntValue = -1;
        }
        int i6 = iIntValue >= 0 ? eVar.l()[iIntValue] : -1;
        V0 v02 = f.f13687b;
        V0 v03 = f.f13686a;
        if (v02 == null) {
            try {
                V0 v04 = new V0(Class.class.getDeclaredMethod("getModule", new Class[0]), getClass().getClassLoader().loadClass("java.lang.Module").getDeclaredMethod("getDescriptor", new Class[0]), getClass().getClassLoader().loadClass("java.lang.module.ModuleDescriptor").getDeclaredMethod("name", new Class[0]));
                f.f13687b = v04;
                v02 = v04;
            } catch (Exception unused2) {
                f.f13687b = v03;
                v02 = v03;
            }
        }
        if (v02 != v03) {
            Method method = v02.f10206a;
            Object objInvoke = method != null ? method.invoke(getClass(), new Object[0]) : null;
            if (objInvoke != null) {
                Method method2 = v02.f10207b;
                Object objInvoke2 = method2 != null ? method2.invoke(objInvoke, new Object[0]) : null;
                if (objInvoke2 != null) {
                    Method method3 = v02.f10208c;
                    Object objInvoke3 = method3 != null ? method3.invoke(objInvoke2, new Object[0]) : null;
                    if (objInvoke3 instanceof String) {
                        str = (String) objInvoke3;
                    }
                }
            }
        }
        if (str == null) {
            strC = eVar.c();
        } else {
            strC = str + '/' + eVar.c();
        }
        return new StackTraceElement(strC, eVar.m(), eVar.f(), i6);
    }

    public abstract Object n(Object obj);

    @Override // v4.InterfaceC1427e
    public final void o(Object obj) {
        InterfaceC1427e interfaceC1427e = this;
        while (true) {
            AbstractC1492a abstractC1492a = (AbstractC1492a) interfaceC1427e;
            InterfaceC1427e interfaceC1427e2 = abstractC1492a.f13682w;
            AbstractC1305a.l(interfaceC1427e2);
            try {
                obj = abstractC1492a.n(obj);
                if (obj == EnumC1481a.f13592w) {
                    return;
                }
            } catch (Throwable th) {
                obj = S3.a.m(th);
            }
            abstractC1492a.p();
            if (!(interfaceC1427e2 instanceof AbstractC1492a)) {
                interfaceC1427e2.o(obj);
                return;
            }
            interfaceC1427e = interfaceC1427e2;
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("Continuation at ");
        Object objM = m();
        if (objM == null) {
            objM = getClass().getName();
        }
        sb.append(objM);
        return sb.toString();
    }

    public void p() {
    }
}
