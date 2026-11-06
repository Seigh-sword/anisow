package c5;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.security.cert.TrustAnchor;
import java.security.cert.X509Certificate;
import javax.net.ssl.X509TrustManager;

/* JADX INFO: loaded from: classes.dex */
public final class c implements e5.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final X509TrustManager f6244a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Method f6245b;

    public c(X509TrustManager x509TrustManager, Method method) {
        this.f6245b = method;
        this.f6244a = x509TrustManager;
    }

    @Override // e5.d
    public final X509Certificate a(X509Certificate x509Certificate) {
        try {
            TrustAnchor trustAnchor = (TrustAnchor) this.f6245b.invoke(this.f6244a, x509Certificate);
            if (trustAnchor != null) {
                return trustAnchor.getTrustedCert();
            }
            return null;
        } catch (IllegalAccessException e6) {
            throw new AssertionError("unable to get issues and signature", e6);
        } catch (InvocationTargetException unused) {
            return null;
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return this.f6244a.equals(cVar.f6244a) && this.f6245b.equals(cVar.f6245b);
    }

    public final int hashCode() {
        return (this.f6245b.hashCode() * 31) + this.f6244a.hashCode();
    }
}
