package y4;

import java.lang.reflect.Method;
import s4.AbstractC1305a;

/* JADX INFO: renamed from: y4.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1509a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Method f13837a;

    static {
        Method method;
        Method[] methods = Throwable.class.getMethods();
        AbstractC1305a.l(methods);
        int length = methods.length;
        int i6 = 0;
        while (true) {
            method = null;
            if (i6 >= length) {
                break;
            }
            Method method2 = methods[i6];
            if (AbstractC1305a.c(method2.getName(), "addSuppressed")) {
                Class<?>[] parameterTypes = method2.getParameterTypes();
                AbstractC1305a.n(parameterTypes, "getParameterTypes(...)");
                if (AbstractC1305a.c(parameterTypes.length == 1 ? parameterTypes[0] : null, Throwable.class)) {
                    method = method2;
                    break;
                }
            }
            i6++;
        }
        f13837a = method;
        int length2 = methods.length;
        for (int i7 = 0; i7 < length2 && !AbstractC1305a.c(methods[i7].getName(), "getSuppressed"); i7++) {
        }
    }
}
