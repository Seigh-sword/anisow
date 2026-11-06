package androidx.lifecycle;

import java.lang.reflect.InvocationTargetException;
import l0.C0921c;
import s4.AbstractC1305a;

/* JADX INFO: loaded from: classes.dex */
public class f0 implements e0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static f0 f5625a;

    @Override // androidx.lifecycle.e0
    public b0 a(Class cls) throws InvocationTargetException {
        try {
            Object objNewInstance = cls.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
            AbstractC1305a.n(objNewInstance, "{\n            modelClass…).newInstance()\n        }");
            return (b0) objNewInstance;
        } catch (IllegalAccessException e6) {
            throw new RuntimeException("Cannot create an instance of " + cls, e6);
        } catch (InstantiationException e7) {
            throw new RuntimeException("Cannot create an instance of " + cls, e7);
        } catch (NoSuchMethodException e8) {
            throw new RuntimeException("Cannot create an instance of " + cls, e8);
        }
    }

    @Override // androidx.lifecycle.e0
    public final b0 b(I4.b bVar, C0921c c0921c) {
        AbstractC1305a.o(bVar, "modelClass");
        return c(AbstractC1305a.D(bVar), c0921c);
    }

    @Override // androidx.lifecycle.e0
    public b0 c(Class cls, C0921c c0921c) {
        return a(cls);
    }
}
