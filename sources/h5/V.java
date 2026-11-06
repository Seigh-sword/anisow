package h5;

import e1.InterfaceC0662c;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes.dex */
public final class V implements InvocationHandler {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ W f9088c;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Class f9087b = InterfaceC0662c.class;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object[] f9086a = new Object[0];

    public V(W w5) {
        this.f9088c = w5;
    }

    @Override // java.lang.reflect.InvocationHandler
    public final Object invoke(Object obj, Method method, Object[] objArr) {
        if (method.getDeclaringClass() == Object.class) {
            return method.invoke(this, objArr);
        }
        if (objArr == null) {
            objArr = this.f9086a;
        }
        B3.e eVar = O.f9030b;
        boolean zX = eVar.x(method);
        Class cls = this.f9087b;
        if (zX) {
            return eVar.v(method, cls, obj, objArr);
        }
        AbstractC0794v abstractC0794v = (AbstractC0794v) this.f9088c.b(cls, method);
        return abstractC0794v.b(new D(abstractC0794v.f9122a, obj, objArr, abstractC0794v.f9123b, abstractC0794v.f9124c), objArr);
    }
}
