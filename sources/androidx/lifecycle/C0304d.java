package androidx.lifecycle;

import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: androidx.lifecycle.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0304d {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final C0304d f5615c = new C0304d();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HashMap f5616a = new HashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final HashMap f5617b = new HashMap();

    public static void c(HashMap map, C0303c c0303c, EnumC0313m enumC0313m, Class cls) {
        EnumC0313m enumC0313m2 = (EnumC0313m) map.get(c0303c);
        if (enumC0313m2 == null || enumC0313m == enumC0313m2) {
            if (enumC0313m2 == null) {
                map.put(c0303c, enumC0313m);
                return;
            }
            return;
        }
        throw new IllegalArgumentException("Method " + c0303c.f5609b.getName() + " in " + cls.getName() + " already declared with different @OnLifecycleEvent value: previous value " + enumC0313m2 + ", new value " + enumC0313m);
    }

    public final C0302b a(Class cls, Method[] methodArr) {
        int i6;
        Class superclass = cls.getSuperclass();
        HashMap map = new HashMap();
        if (superclass != null) {
            map.putAll(b(superclass).f5606b);
        }
        for (Class<?> cls2 : cls.getInterfaces()) {
            for (Map.Entry entry : b(cls2).f5606b.entrySet()) {
                c(map, (C0303c) entry.getKey(), (EnumC0313m) entry.getValue(), cls);
            }
        }
        if (methodArr == null) {
            try {
                methodArr = cls.getDeclaredMethods();
            } catch (NoClassDefFoundError e6) {
                throw new IllegalArgumentException("The observer class has some methods that use newer APIs which are not available in the current OS version. Lifecycles cannot access even other methods so you should make sure that your observer classes only access framework classes that are available in your min API level OR use lifecycle:compiler annotation processor.", e6);
            }
        }
        boolean z5 = false;
        for (Method method : methodArr) {
            G g4 = (G) method.getAnnotation(G.class);
            if (g4 != null) {
                Class<?>[] parameterTypes = method.getParameterTypes();
                if (parameterTypes.length <= 0) {
                    i6 = 0;
                } else {
                    if (!InterfaceC0321v.class.isAssignableFrom(parameterTypes[0])) {
                        throw new IllegalArgumentException("invalid parameter type. Must be one and instanceof LifecycleOwner");
                    }
                    i6 = 1;
                }
                EnumC0313m enumC0313mValue = g4.value();
                if (parameterTypes.length > 1) {
                    if (!EnumC0313m.class.isAssignableFrom(parameterTypes[1])) {
                        throw new IllegalArgumentException("invalid parameter type. second arg must be an event");
                    }
                    if (enumC0313mValue != EnumC0313m.ON_ANY) {
                        throw new IllegalArgumentException("Second arg is supported only for ON_ANY value");
                    }
                    i6 = 2;
                }
                if (parameterTypes.length > 2) {
                    throw new IllegalArgumentException("cannot have more than 2 params");
                }
                c(map, new C0303c(method, i6), enumC0313mValue, cls);
                z5 = true;
            }
        }
        C0302b c0302b = new C0302b(map);
        this.f5616a.put(cls, c0302b);
        this.f5617b.put(cls, Boolean.valueOf(z5));
        return c0302b;
    }

    public final C0302b b(Class cls) {
        C0302b c0302b = (C0302b) this.f5616a.get(cls);
        return c0302b != null ? c0302b : a(cls, null);
    }
}
