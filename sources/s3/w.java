package S3;

import java.lang.reflect.Method;
import w1.C1474r;

/* JADX INFO: loaded from: classes.dex */
public final class w extends z {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Method f3289b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f3290c;

    public w(Method method, int i6) {
        this.f3289b = method;
        this.f3290c = i6;
    }

    @Override // S3.z
    public final Object a(Class cls) {
        String strA = C1474r.a(cls);
        if (strA != null) {
            throw new AssertionError("UnsafeAllocator is used for non-instantiable type: ".concat(strA));
        }
        return this.f3289b.invoke(null, cls, Integer.valueOf(this.f3290c));
    }
}
