package T3;

import d.AbstractC0628i;
import h0.C0733A;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;
import m3.v0;

/* JADX INFO: loaded from: classes.dex */
public final class p extends n {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final HashMap f3495e;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Constructor f3496b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object[] f3497c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final HashMap f3498d;

    static {
        HashMap map = new HashMap();
        map.put(Byte.TYPE, (byte) 0);
        map.put(Short.TYPE, (short) 0);
        map.put(Integer.TYPE, 0);
        map.put(Long.TYPE, 0L);
        map.put(Float.TYPE, Float.valueOf(0.0f));
        map.put(Double.TYPE, Double.valueOf(0.0d));
        map.put(Character.TYPE, (char) 0);
        map.put(Boolean.TYPE, Boolean.FALSE);
        f3495e = map;
    }

    public p(Class cls, LinkedHashMap linkedHashMap) {
        super(linkedHashMap);
        this.f3498d = new HashMap();
        v0 v0Var = V3.c.f3745a;
        Constructor constructorC = v0Var.c(cls);
        this.f3496b = constructorC;
        V3.c.e(constructorC);
        String[] strArrD = v0Var.d(cls);
        for (int i6 = 0; i6 < strArrD.length; i6++) {
            this.f3498d.put(strArrD[i6], Integer.valueOf(i6));
        }
        Class<?>[] parameterTypes = this.f3496b.getParameterTypes();
        this.f3497c = new Object[parameterTypes.length];
        for (int i7 = 0; i7 < parameterTypes.length; i7++) {
            this.f3497c[i7] = f3495e.get(parameterTypes[i7]);
        }
    }

    @Override // T3.n
    public final Object d() {
        return (Object[]) this.f3497c.clone();
    }

    @Override // T3.n
    public final Object e(Object obj) {
        Object[] objArr = (Object[]) obj;
        Constructor constructor = this.f3496b;
        try {
            return constructor.newInstance(objArr);
        } catch (IllegalAccessException e6) {
            v0 v0Var = V3.c.f3745a;
            throw new RuntimeException("Unexpected IllegalAccessException occurred (Gson 2.10.1). Certain ReflectionAccessFilter features require Java >= 9 to work correctly. If you are not using ReflectionAccessFilter, report this to the Gson maintainers.", e6);
        } catch (IllegalArgumentException e7) {
            e = e7;
            throw new RuntimeException("Failed to invoke constructor '" + V3.c.b(constructor) + "' with args " + Arrays.toString(objArr), e);
        } catch (InstantiationException e8) {
            e = e8;
            throw new RuntimeException("Failed to invoke constructor '" + V3.c.b(constructor) + "' with args " + Arrays.toString(objArr), e);
        } catch (InvocationTargetException e9) {
            throw new RuntimeException("Failed to invoke constructor '" + V3.c.b(constructor) + "' with args " + Arrays.toString(objArr), e9.getCause());
        }
    }

    @Override // T3.n
    public final void f(Object obj, X3.a aVar, m mVar) {
        Object[] objArr = (Object[]) obj;
        HashMap map = this.f3498d;
        String str = mVar.f3482c;
        Integer num = (Integer) map.get(str);
        if (num == null) {
            throw new IllegalStateException("Could not find the index in the constructor '" + V3.c.b(this.f3496b) + "' for field with name '" + str + "', unable to determine which argument in the constructor the field corresponds to. This is unexpected behavior, as we expect the RecordComponents to have the same names as the fields in the Java class, and that the order of the RecordComponents is the same as the order of the canonical constructor parameters.");
        }
        int iIntValue = num.intValue();
        Object objB = mVar.f3488i.b(aVar);
        if (objB != null || !mVar.f3491l) {
            objArr[iIntValue] = objB;
        } else {
            StringBuilder sbN = AbstractC0628i.n("null is not allowed as value for record component '", str, "' of primitive type; at path ");
            sbN.append(aVar.u(false));
            throw new C0733A(sbN.toString());
        }
    }
}
