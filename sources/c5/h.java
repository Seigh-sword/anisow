package c5;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import javax.net.ssl.SSLParameters;
import javax.net.ssl.SSLSocket;

/* JADX INFO: loaded from: classes.dex */
public final class h extends i {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Method f6260c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Method f6261d;

    public h(Method method, Method method2) {
        this.f6260c = method;
        this.f6261d = method2;
    }

    @Override // c5.i
    public final void g(SSLSocket sSLSocket, String str, List list) {
        try {
            SSLParameters sSLParameters = sSLSocket.getSSLParameters();
            ArrayList arrayListB = i.b(list);
            this.f6260c.invoke(sSLParameters, arrayListB.toArray(new String[arrayListB.size()]));
            sSLSocket.setSSLParameters(sSLParameters);
        } catch (IllegalAccessException | InvocationTargetException e6) {
            throw new AssertionError("failed to set SSL parameters", e6);
        }
    }

    @Override // c5.i
    public final String j(SSLSocket sSLSocket) {
        try {
            String str = (String) this.f6261d.invoke(sSLSocket, new Object[0]);
            if (str != null) {
                if (!str.equals("")) {
                    return str;
                }
            }
            return null;
        } catch (IllegalAccessException e6) {
            throw new AssertionError("failed to get ALPN selected protocol", e6);
        } catch (InvocationTargetException e7) {
            if (e7.getCause() instanceof UnsupportedOperationException) {
                return null;
            }
            throw new AssertionError("failed to get ALPN selected protocol", e7);
        }
    }
}
