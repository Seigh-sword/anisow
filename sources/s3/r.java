package S3;

import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes.dex */
public final class r extends t {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Method f3285b;

    public r(Method method) {
        this.f3285b = method;
    }

    @Override // S3.t
    public final boolean a(Object obj, AccessibleObject accessibleObject) {
        try {
            return ((Boolean) this.f3285b.invoke(accessibleObject, obj)).booleanValue();
        } catch (Exception e6) {
            throw new RuntimeException("Failed invoking canAccess", e6);
        }
    }
}
