package c5;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.security.cert.X509Certificate;
import java.util.List;
import javax.net.ssl.SSLPeerUnverifiedException;

/* JADX INFO: loaded from: classes.dex */
public final class b extends com.bumptech.glide.c {

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final Object f6242x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final Method f6243y;

    public b(Object obj, Method method) {
        this.f6242x = obj;
        this.f6243y = method;
    }

    public final boolean equals(Object obj) {
        return obj instanceof b;
    }

    public final int hashCode() {
        return 0;
    }

    @Override // com.bumptech.glide.c
    public final List r(String str, List list) throws SSLPeerUnverifiedException {
        try {
            return (List) this.f6243y.invoke(this.f6242x, (X509Certificate[]) list.toArray(new X509Certificate[list.size()]), "RSA", str);
        } catch (IllegalAccessException e6) {
            throw new AssertionError(e6);
        } catch (InvocationTargetException e7) {
            SSLPeerUnverifiedException sSLPeerUnverifiedException = new SSLPeerUnverifiedException(e7.getMessage());
            sSLPeerUnverifiedException.initCause(e7);
            throw sSLPeerUnverifiedException;
        }
    }
}
