package V3;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import m3.v0;

/* JADX INFO: loaded from: classes.dex */
public final class b extends v0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Method f3741a = Class.class.getMethod("isRecord", new Class[0]);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Method f3742b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Method f3743c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Method f3744d;

    public b() throws NoSuchMethodException {
        Method method = Class.class.getMethod("getRecordComponents", new Class[0]);
        this.f3742b = method;
        Class<?> componentType = method.getReturnType().getComponentType();
        this.f3743c = componentType.getMethod("getName", new Class[0]);
        this.f3744d = componentType.getMethod("getType", new Class[0]);
    }

    @Override // m3.v0
    public final Method b(Class cls, Field field) {
        try {
            return cls.getMethod(field.getName(), new Class[0]);
        } catch (ReflectiveOperationException e6) {
            throw new RuntimeException("Unexpected ReflectiveOperationException occurred (Gson 2.10.1). To support Java records, reflection is utilized to read out information about records. All these invocations happens after it is established that records exist in the JVM. This exception is unexpected behavior.", e6);
        }
    }

    @Override // m3.v0
    public final Constructor c(Class cls) {
        try {
            Object[] objArr = (Object[]) this.f3742b.invoke(cls, new Object[0]);
            Class<?>[] clsArr = new Class[objArr.length];
            for (int i6 = 0; i6 < objArr.length; i6++) {
                clsArr[i6] = (Class) this.f3744d.invoke(objArr[i6], new Object[0]);
            }
            return cls.getDeclaredConstructor(clsArr);
        } catch (ReflectiveOperationException e6) {
            throw new RuntimeException("Unexpected ReflectiveOperationException occurred (Gson 2.10.1). To support Java records, reflection is utilized to read out information about records. All these invocations happens after it is established that records exist in the JVM. This exception is unexpected behavior.", e6);
        }
    }

    @Override // m3.v0
    public final String[] d(Class cls) {
        try {
            Object[] objArr = (Object[]) this.f3742b.invoke(cls, new Object[0]);
            String[] strArr = new String[objArr.length];
            for (int i6 = 0; i6 < objArr.length; i6++) {
                strArr[i6] = (String) this.f3743c.invoke(objArr[i6], new Object[0]);
            }
            return strArr;
        } catch (ReflectiveOperationException e6) {
            throw new RuntimeException("Unexpected ReflectiveOperationException occurred (Gson 2.10.1). To support Java records, reflection is utilized to read out information about records. All these invocations happens after it is established that records exist in the JVM. This exception is unexpected behavior.", e6);
        }
    }

    @Override // m3.v0
    public final boolean f(Class cls) {
        try {
            return ((Boolean) this.f3741a.invoke(cls, new Object[0])).booleanValue();
        } catch (ReflectiveOperationException e6) {
            throw new RuntimeException("Unexpected ReflectiveOperationException occurred (Gson 2.10.1). To support Java records, reflection is utilized to read out information about records. All these invocations happens after it is established that records exist in the JVM. This exception is unexpected behavior.", e6);
        }
    }
}
