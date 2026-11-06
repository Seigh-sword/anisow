package S3;

import java.lang.reflect.Method;
import w1.C1474r;

/* JADX INFO: loaded from: classes.dex */
public final class x extends z {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Method f3291b;

    public x(Method method) {
        this.f3291b = method;
    }

    @Override // S3.z
    public final Object a(Class cls) {
        String strA = C1474r.a(cls);
        if (strA != null) {
            throw new AssertionError("UnsafeAllocator is used for non-instantiable type: ".concat(strA));
        }
        return this.f3291b.invoke(null, cls, Object.class);
    }
}
