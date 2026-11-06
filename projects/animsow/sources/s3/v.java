package S3;

import java.lang.reflect.Method;
import w1.C1474r;

/* JADX INFO: loaded from: classes.dex */
public final class v extends z {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Method f3287b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f3288c;

    public v(Object obj, Method method) {
        this.f3287b = method;
        this.f3288c = obj;
    }

    @Override // S3.z
    public final Object a(Class cls) {
        String strA = C1474r.a(cls);
        if (strA != null) {
            throw new AssertionError("UnsafeAllocator is used for non-instantiable type: ".concat(strA));
        }
        return this.f3287b.invoke(this.f3288c, cls);
    }
}
