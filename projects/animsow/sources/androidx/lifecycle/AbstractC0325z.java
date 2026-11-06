package androidx.lifecycle;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;
import s4.AbstractC1305a;

/* JADX INFO: renamed from: androidx.lifecycle.z, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0325z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final HashMap f5653a = new HashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final HashMap f5654b = new HashMap();

    public static void a(Constructor constructor, Object obj) {
        try {
            Object objNewInstance = constructor.newInstance(obj);
            AbstractC1305a.n(objNewInstance, "{\n            constructo…tance(`object`)\n        }");
            H1.a.q(objNewInstance);
            throw null;
        } catch (IllegalAccessException e6) {
            throw new RuntimeException(e6);
        } catch (InstantiationException e7) {
            throw new RuntimeException(e7);
        } catch (InvocationTargetException e8) {
            throw new RuntimeException(e8);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:56:0x0103 A[PHI: r1
      0x0103: PHI (r1v6 java.util.List) = (r1v4 java.util.List), (r1v4 java.util.List), (r1v13 java.util.List) binds: [B:49:0x00e1, B:51:0x00e7, B:55:0x00f5] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x013b A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static int b(java.lang.Class r13) {
        /*
            Method dump skipped, instruction units count: 336
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.lifecycle.AbstractC0325z.b(java.lang.Class):int");
    }
}
