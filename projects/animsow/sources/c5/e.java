package c5;

import java.security.NoSuchAlgorithmException;
import java.security.Provider;
import java.util.List;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import org.conscrypt.Conscrypt;

/* JADX INFO: loaded from: classes.dex */
public final class e extends i {
    public static e o() {
        try {
            Class.forName("org.conscrypt.Conscrypt");
            if (Conscrypt.isAvailable()) {
                return new e();
            }
            return null;
        } catch (ClassNotFoundException unused) {
            return null;
        }
    }

    public static Provider p() {
        return Conscrypt.newProviderBuilder().provideTrustManager().build();
    }

    @Override // c5.i
    public final void f(SSLSocketFactory sSLSocketFactory) {
        if (Conscrypt.isConscrypt(sSLSocketFactory)) {
            Conscrypt.setUseEngineSocket(sSLSocketFactory, true);
        }
    }

    @Override // c5.i
    public final void g(SSLSocket sSLSocket, String str, List list) {
        if (Conscrypt.isConscrypt(sSLSocket)) {
            if (str != null) {
                Conscrypt.setUseSessionTickets(sSLSocket, true);
                Conscrypt.setHostname(sSLSocket, str);
            }
            Conscrypt.setApplicationProtocols(sSLSocket, (String[]) i.b(list).toArray(new String[0]));
        }
    }

    @Override // c5.i
    public final SSLContext i() {
        try {
            return SSLContext.getInstance("TLSv1.3", p());
        } catch (NoSuchAlgorithmException e6) {
            try {
                return SSLContext.getInstance("TLS", p());
            } catch (NoSuchAlgorithmException unused) {
                throw new IllegalStateException("No TLS provider", e6);
            }
        }
    }

    @Override // c5.i
    public final String j(SSLSocket sSLSocket) {
        if (Conscrypt.isConscrypt(sSLSocket)) {
            return Conscrypt.getApplicationProtocol(sSLSocket);
        }
        return null;
    }
}
