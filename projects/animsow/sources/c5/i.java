package c5;

import V4.y;
import d.AbstractC0628i;
import f5.C0710g;
import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.X509TrustManager;

/* JADX INFO: loaded from: classes.dex */
public class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final i f6262a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Logger f6263b;

    /* JADX WARN: Removed duplicated region for block: B:13:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:6:0x001d  */
    static {
        /*
            Method dump skipped, instruction units count: 328
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: c5.i.<clinit>():void");
    }

    public static ArrayList b(List list) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i6 = 0; i6 < size; i6++) {
            y yVar = (y) list.get(i6);
            if (yVar != y.f3981x) {
                arrayList.add(yVar.f3984w);
            }
        }
        return arrayList;
    }

    public static byte[] e(List list) {
        C0710g c0710g = new C0710g();
        int size = list.size();
        for (int i6 = 0; i6 < size; i6++) {
            y yVar = (y) list.get(i6);
            if (yVar != y.f3981x) {
                c0710g.X(yVar.f3984w.length());
                c0710g.c0(yVar.f3984w);
            }
        }
        return c0710g.O(c0710g.f8461x);
    }

    public com.bumptech.glide.c c(X509TrustManager x509TrustManager) {
        return new e5.a(d(x509TrustManager));
    }

    public e5.d d(X509TrustManager x509TrustManager) {
        return new e5.b(x509TrustManager.getAcceptedIssuers());
    }

    public void h(Socket socket, InetSocketAddress inetSocketAddress, int i6) throws IOException {
        socket.connect(inetSocketAddress, i6);
    }

    public SSLContext i() {
        try {
            return SSLContext.getInstance("TLS");
        } catch (NoSuchAlgorithmException e6) {
            throw new IllegalStateException("No TLS provider", e6);
        }
    }

    public String j(SSLSocket sSLSocket) {
        return null;
    }

    public Object k() {
        if (f6263b.isLoggable(Level.FINE)) {
            return new Throwable("response.body().close()");
        }
        return null;
    }

    public boolean l(String str) {
        return true;
    }

    public void m(int i6, String str, Throwable th) {
        f6263b.log(i6 == 5 ? Level.WARNING : Level.INFO, str, th);
    }

    public void n(Object obj, String str) {
        if (obj == null) {
            str = AbstractC0628i.i(str, " To see where this was allocated, set the OkHttpClient logger level to FINE: Logger.getLogger(OkHttpClient.class.getName()).setLevel(Level.FINE);");
        }
        m(5, str, (Throwable) obj);
    }

    public final String toString() {
        return getClass().getSimpleName();
    }

    public void a(SSLSocket sSLSocket) {
    }

    public void f(SSLSocketFactory sSLSocketFactory) {
    }

    public void g(SSLSocket sSLSocket, String str, List list) {
    }
}
