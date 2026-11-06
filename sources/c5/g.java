package c5;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.List;
import javax.net.ssl.SSLSocket;

/* JADX INFO: loaded from: classes.dex */
public final class g extends i {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Method f6255c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Method f6256d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Method f6257e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Class f6258f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Class f6259g;

    public g(Method method, Method method2, Method method3, Class cls, Class cls2) {
        this.f6255c = method;
        this.f6256d = method2;
        this.f6257e = method3;
        this.f6258f = cls;
        this.f6259g = cls2;
    }

    @Override // c5.i
    public final void a(SSLSocket sSLSocket) {
        try {
            this.f6257e.invoke(null, sSLSocket);
        } catch (IllegalAccessException | InvocationTargetException e6) {
            throw new AssertionError("failed to remove ALPN", e6);
        }
    }

    @Override // c5.i
    public final void g(SSLSocket sSLSocket, String str, List list) {
        try {
            this.f6255c.invoke(null, sSLSocket, Proxy.newProxyInstance(i.class.getClassLoader(), new Class[]{this.f6258f, this.f6259g}, new f(i.b(list))));
        } catch (IllegalAccessException | InvocationTargetException e6) {
            throw new AssertionError("failed to set ALPN", e6);
        }
    }

    @Override // c5.i
    public final String j(SSLSocket sSLSocket) {
        try {
            f fVar = (f) Proxy.getInvocationHandler(this.f6256d.invoke(null, sSLSocket));
            boolean z5 = fVar.f6253b;
            if (!z5 && fVar.f6254c == null) {
                i.f6262a.m(4, "ALPN callback dropped: HTTP/2 is disabled. Is alpn-boot on the boot class path?", null);
                return null;
            }
            if (z5) {
                return null;
            }
            return fVar.f6254c;
        } catch (IllegalAccessException e6) {
            e = e6;
            throw new AssertionError("failed to get ALPN selected protocol", e);
        } catch (InvocationTargetException e7) {
            e = e7;
            throw new AssertionError("failed to get ALPN selected protocol", e);
        }
    }
}
