package c5;

import android.os.Build;
import android.util.Log;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.nio.charset.StandardCharsets;
import java.security.NoSuchAlgorithmException;
import java.security.cert.X509Certificate;
import java.util.List;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.X509TrustManager;
import m.V0;

/* JADX INFO: loaded from: classes.dex */
public class d extends i {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Class f6246c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Method f6247d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Method f6248e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Method f6249f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Method f6250g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final V0 f6251h;

    public d(Class cls, Method method, Method method2, Method method3, Method method4) {
        Method method5;
        Method method6;
        Method method7;
        try {
            Class<?> cls2 = Class.forName("dalvik.system.CloseGuard");
            method5 = cls2.getMethod("get", new Class[0]);
            method7 = cls2.getMethod("open", String.class);
            method6 = cls2.getMethod("warnIfOpen", new Class[0]);
        } catch (Exception unused) {
            method5 = null;
            method6 = null;
            method7 = null;
        }
        this.f6251h = new V0(method5, method7, method6);
        this.f6246c = cls;
        this.f6247d = method;
        this.f6248e = method2;
        this.f6249f = method3;
        this.f6250g = method4;
    }

    public static boolean o(String str, Class cls, Object obj) {
        try {
            try {
                return ((Boolean) cls.getMethod("isCleartextTrafficPermitted", String.class).invoke(obj, str)).booleanValue();
            } catch (NoSuchMethodException unused) {
                return ((Boolean) cls.getMethod("isCleartextTrafficPermitted", new Class[0]).invoke(obj, new Object[0])).booleanValue();
            }
        } catch (NoSuchMethodException unused2) {
            return true;
        }
    }

    @Override // c5.i
    public final com.bumptech.glide.c c(X509TrustManager x509TrustManager) {
        try {
            Class<?> cls = Class.forName("android.net.http.X509TrustManagerExtensions");
            return new b(cls.getConstructor(X509TrustManager.class).newInstance(x509TrustManager), cls.getMethod("checkServerTrusted", X509Certificate[].class, String.class, String.class));
        } catch (Exception unused) {
            return super.c(x509TrustManager);
        }
    }

    @Override // c5.i
    public final e5.d d(X509TrustManager x509TrustManager) {
        try {
            Method declaredMethod = x509TrustManager.getClass().getDeclaredMethod("findTrustAnchorByIssuerAndSignature", X509Certificate.class);
            declaredMethod.setAccessible(true);
            return new c(x509TrustManager, declaredMethod);
        } catch (NoSuchMethodException unused) {
            return super.d(x509TrustManager);
        }
    }

    @Override // c5.i
    public void g(SSLSocket sSLSocket, String str, List list) {
        if (this.f6246c.isInstance(sSLSocket)) {
            if (str != null) {
                try {
                    this.f6247d.invoke(sSLSocket, Boolean.TRUE);
                    this.f6248e.invoke(sSLSocket, str);
                } catch (IllegalAccessException e6) {
                    e = e6;
                    throw new AssertionError(e);
                } catch (InvocationTargetException e7) {
                    e = e7;
                    throw new AssertionError(e);
                }
            }
            this.f6250g.invoke(sSLSocket, i.e(list));
        }
    }

    @Override // c5.i
    public final void h(Socket socket, InetSocketAddress inetSocketAddress, int i6) throws IOException {
        try {
            socket.connect(inetSocketAddress, i6);
        } catch (AssertionError e6) {
            if (!W4.b.m(e6)) {
                throw e6;
            }
            throw new IOException(e6);
        } catch (ClassCastException e7) {
            if (Build.VERSION.SDK_INT != 26) {
                throw e7;
            }
            throw new IOException("Exception in connect", e7);
        }
    }

    @Override // c5.i
    public final SSLContext i() {
        try {
            return SSLContext.getInstance("TLS");
        } catch (NoSuchAlgorithmException e6) {
            throw new IllegalStateException("No TLS provider", e6);
        }
    }

    @Override // c5.i
    public String j(SSLSocket sSLSocket) {
        if (!this.f6246c.isInstance(sSLSocket)) {
            return null;
        }
        try {
            byte[] bArr = (byte[]) this.f6249f.invoke(sSLSocket, new Object[0]);
            if (bArr != null) {
                return new String(bArr, StandardCharsets.UTF_8);
            }
            return null;
        } catch (IllegalAccessException | InvocationTargetException e6) {
            throw new AssertionError(e6);
        }
    }

    @Override // c5.i
    public final Object k() {
        V0 v02 = this.f6251h;
        Method method = v02.f10206a;
        if (method == null) {
            return null;
        }
        try {
            Object objInvoke = method.invoke(null, new Object[0]);
            v02.f10207b.invoke(objInvoke, "response.body().close()");
            return objInvoke;
        } catch (Exception unused) {
            return null;
        }
    }

    @Override // c5.i
    public final boolean l(String str) {
        try {
            Class<?> cls = Class.forName("android.security.NetworkSecurityPolicy");
            return o(str, cls, cls.getMethod("getInstance", new Class[0]).invoke(null, new Object[0]));
        } catch (ClassNotFoundException | NoSuchMethodException unused) {
            return true;
        } catch (IllegalAccessException e6) {
            e = e6;
            throw new AssertionError("unable to determine cleartext support", e);
        } catch (IllegalArgumentException e7) {
            e = e7;
            throw new AssertionError("unable to determine cleartext support", e);
        } catch (InvocationTargetException e8) {
            e = e8;
            throw new AssertionError("unable to determine cleartext support", e);
        }
    }

    @Override // c5.i
    public final void m(int i6, String str, Throwable th) {
        int iMin;
        int i7 = i6 != 5 ? 3 : 5;
        if (th != null) {
            str = str + '\n' + Log.getStackTraceString(th);
        }
        int length = str.length();
        int i8 = 0;
        while (i8 < length) {
            int iIndexOf = str.indexOf(10, i8);
            if (iIndexOf == -1) {
                iIndexOf = length;
            }
            while (true) {
                iMin = Math.min(iIndexOf, i8 + 4000);
                Log.println(i7, "OkHttp", str.substring(i8, iMin));
                if (iMin >= iIndexOf) {
                    break;
                } else {
                    i8 = iMin;
                }
            }
            i8 = iMin + 1;
        }
    }

    @Override // c5.i
    public final void n(Object obj, String str) {
        V0 v02 = this.f6251h;
        v02.getClass();
        if (obj != null) {
            try {
                v02.f10208c.invoke(obj, new Object[0]);
                return;
            } catch (Exception unused) {
            }
        }
        m(5, str, null);
    }
}
