package V4;

import java.net.InetSocketAddress;
import java.net.Proxy;

/* JADX INFO: loaded from: classes.dex */
public final class K {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C0170a f3799a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Proxy f3800b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final InetSocketAddress f3801c;

    public K(C0170a c0170a, Proxy proxy, InetSocketAddress inetSocketAddress) {
        if (c0170a == null) {
            throw new NullPointerException("address == null");
        }
        if (inetSocketAddress == null) {
            throw new NullPointerException("inetSocketAddress == null");
        }
        this.f3799a = c0170a;
        this.f3800b = proxy;
        this.f3801c = inetSocketAddress;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof K) {
            K k5 = (K) obj;
            if (k5.f3799a.equals(this.f3799a) && k5.f3800b.equals(this.f3800b) && k5.f3801c.equals(this.f3801c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f3801c.hashCode() + ((this.f3800b.hashCode() + ((this.f3799a.hashCode() + 527) * 31)) * 31);
    }

    public final String toString() {
        return "Route{" + this.f3801c + "}";
    }
}
