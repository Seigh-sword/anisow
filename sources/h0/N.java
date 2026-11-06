package h0;

import android.content.Context;
import d.AbstractC0628i;
import java.lang.reflect.InvocationTargetException;

/* JADX INFO: loaded from: classes.dex */
public final class N {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final s.k f8669b = new s.k();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ W f8670a;

    public N(W w5) {
        this.f8670a = w5;
    }

    public static Class b(ClassLoader classLoader, String str) throws ClassNotFoundException {
        s.k kVar = f8669b;
        s.k kVar2 = (s.k) kVar.getOrDefault(classLoader, null);
        if (kVar2 == null) {
            kVar2 = new s.k();
            kVar.put(classLoader, kVar2);
        }
        Class cls = (Class) kVar2.getOrDefault(str, null);
        if (cls != null) {
            return cls;
        }
        Class<?> cls2 = Class.forName(str, false, classLoader);
        kVar2.put(str, cls2);
        return cls2;
    }

    public static Class c(ClassLoader classLoader, String str) {
        try {
            return b(classLoader, str);
        } catch (ClassCastException e6) {
            throw new C0733A(AbstractC0628i.j("Unable to instantiate fragment ", str, ": make sure class is a valid subclass of Fragment"), e6);
        } catch (ClassNotFoundException e7) {
            throw new C0733A(AbstractC0628i.j("Unable to instantiate fragment ", str, ": make sure class name exists"), e7);
        }
    }

    public final AbstractComponentCallbacksC0734B a(String str) {
        Context context = this.f8670a.f8717w.f8643y;
        Object obj = AbstractComponentCallbacksC0734B.f8589s0;
        try {
            return (AbstractComponentCallbacksC0734B) c(context.getClassLoader(), str).getConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (IllegalAccessException e6) {
            throw new C0733A(AbstractC0628i.j("Unable to instantiate fragment ", str, ": make sure class name exists, is public, and has an empty constructor that is public"), e6);
        } catch (InstantiationException e7) {
            throw new C0733A(AbstractC0628i.j("Unable to instantiate fragment ", str, ": make sure class name exists, is public, and has an empty constructor that is public"), e7);
        } catch (NoSuchMethodException e8) {
            throw new C0733A(AbstractC0628i.j("Unable to instantiate fragment ", str, ": could not find Fragment constructor"), e8);
        } catch (InvocationTargetException e9) {
            throw new C0733A(AbstractC0628i.j("Unable to instantiate fragment ", str, ": calling Fragment constructor caused an exception"), e9);
        }
    }
}
