package androidx.lifecycle;

import android.app.Application;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import s4.AbstractC1305a;
import t4.C1350g;

/* JADX INFO: loaded from: classes.dex */
public abstract class Z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final List f5599a = S3.a.E(Application.class, Q.class);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final List f5600b = S3.a.D(Q.class);

    public static final Constructor a(Class cls, List list) {
        AbstractC1305a.o(list, "signature");
        Constructor<?>[] constructors = cls.getConstructors();
        AbstractC1305a.n(constructors, "modelClass.constructors");
        for (Constructor<?> constructor : constructors) {
            Class<?>[] parameterTypes = constructor.getParameterTypes();
            AbstractC1305a.n(parameterTypes, "constructor.parameterTypes");
            int length = parameterTypes.length;
            List arrayList = length != 0 ? length != 1 ? new ArrayList(new C1350g(parameterTypes, false)) : S3.a.D(parameterTypes[0]) : t4.p.f12756w;
            if (AbstractC1305a.c(list, arrayList)) {
                return constructor;
            }
            if (list.size() == arrayList.size() && arrayList.containsAll(list)) {
                throw new UnsupportedOperationException("Class " + cls.getSimpleName() + " must have parameters in the proper order: " + list);
            }
        }
        return null;
    }

    public static final b0 b(Class cls, Constructor constructor, Object... objArr) {
        try {
            return (b0) constructor.newInstance(Arrays.copyOf(objArr, objArr.length));
        } catch (IllegalAccessException e6) {
            throw new RuntimeException("Failed to access " + cls, e6);
        } catch (InstantiationException e7) {
            throw new RuntimeException("A " + cls + " cannot be instantiated.", e7);
        } catch (InvocationTargetException e8) {
            throw new RuntimeException("An exception happened in constructor of " + cls, e8.getCause());
        }
    }
}
