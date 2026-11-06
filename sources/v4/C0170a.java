package V4;

import d.AbstractC0628i;
import java.net.Proxy;
import java.net.ProxySelector;
import java.util.List;
import java.util.Objects;
import javax.net.SocketFactory;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSocketFactory;

/* JADX INFO: renamed from: V4.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0170a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final r f3809a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final InterfaceC0181l f3810b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final SocketFactory f3811c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final InterfaceC0171b f3812d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final List f3813e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final List f3814f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ProxySelector f3815g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Proxy f3816h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final SSLSocketFactory f3817i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final HostnameVerifier f3818j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final C0175f f3819k;

    public C0170a(String str, int i6, InterfaceC0181l interfaceC0181l, SocketFactory socketFactory, SSLSocketFactory sSLSocketFactory, HostnameVerifier hostnameVerifier, C0175f c0175f, InterfaceC0171b interfaceC0171b, List list, List list2, ProxySelector proxySelector) {
        q qVar = new q();
        String str2 = sSLSocketFactory != null ? "https" : "http";
        if (str2.equalsIgnoreCase("http")) {
            qVar.f3897e = "http";
        } else {
            if (!str2.equalsIgnoreCase("https")) {
                throw new IllegalArgumentException("unexpected scheme: ".concat(str2));
            }
            qVar.f3897e = "https";
        }
        if (str == null) {
            throw new NullPointerException("host == null");
        }
        String strA = W4.b.a(r.g(0, str.length(), str, false));
        if (strA == null) {
            throw new IllegalArgumentException("unexpected host: ".concat(str));
        }
        qVar.f3900h = strA;
        if (i6 <= 0 || i6 > 65535) {
            throw new IllegalArgumentException(AbstractC0628i.f("unexpected port: ", i6));
        }
        qVar.f3895c = i6;
        this.f3809a = qVar.a();
        if (interfaceC0181l == null) {
            throw new NullPointerException("dns == null");
        }
        this.f3810b = interfaceC0181l;
        if (socketFactory == null) {
            throw new NullPointerException("socketFactory == null");
        }
        this.f3811c = socketFactory;
        if (interfaceC0171b == null) {
            throw new NullPointerException("proxyAuthenticator == null");
        }
        this.f3812d = interfaceC0171b;
        if (list == null) {
            throw new NullPointerException("protocols == null");
        }
        this.f3813e = W4.b.j(list);
        if (list2 == null) {
            throw new NullPointerException("connectionSpecs == null");
        }
        this.f3814f = W4.b.j(list2);
        if (proxySelector == null) {
            throw new NullPointerException("proxySelector == null");
        }
        this.f3815g = proxySelector;
        this.f3816h = null;
        this.f3817i = sSLSocketFactory;
        this.f3818j = hostnameVerifier;
        this.f3819k = c0175f;
    }

    public final boolean a(C0170a c0170a) {
        return this.f3810b.equals(c0170a.f3810b) && this.f3812d.equals(c0170a.f3812d) && this.f3813e.equals(c0170a.f3813e) && this.f3814f.equals(c0170a.f3814f) && this.f3815g.equals(c0170a.f3815g) && Objects.equals(this.f3816h, c0170a.f3816h) && Objects.equals(this.f3817i, c0170a.f3817i) && Objects.equals(this.f3818j, c0170a.f3818j) && Objects.equals(this.f3819k, c0170a.f3819k) && this.f3809a.f3907e == c0170a.f3809a.f3907e;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C0170a) {
            C0170a c0170a = (C0170a) obj;
            if (this.f3809a.equals(c0170a.f3809a) && a(c0170a)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hashCode(this.f3819k) + ((Objects.hashCode(this.f3818j) + ((Objects.hashCode(this.f3817i) + ((Objects.hashCode(this.f3816h) + ((this.f3815g.hashCode() + ((this.f3814f.hashCode() + ((this.f3813e.hashCode() + ((this.f3812d.hashCode() + ((this.f3810b.hashCode() + AbstractC0628i.e(this.f3809a.f3911i, 527, 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Address{");
        r rVar = this.f3809a;
        sb.append(rVar.f3906d);
        sb.append(":");
        sb.append(rVar.f3907e);
        Object obj = this.f3816h;
        if (obj != null) {
            sb.append(", proxy=");
        } else {
            sb.append(", proxySelector=");
            obj = this.f3815g;
        }
        sb.append(obj);
        sb.append("}");
        return sb.toString();
    }
}
