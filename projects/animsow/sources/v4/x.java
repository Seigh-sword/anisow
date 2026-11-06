package V4;

import java.net.ProxySelector;
import java.security.GeneralSecurityException;
import java.security.KeyStore;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import javax.net.SocketFactory;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.TrustManager;
import javax.net.ssl.TrustManagerFactory;
import javax.net.ssl.X509TrustManager;
import m2.C1017B;

/* JADX INFO: loaded from: classes.dex */
public final class x implements Cloneable, InterfaceC0174e {

    /* JADX INFO: renamed from: V, reason: collision with root package name */
    public static final List f3950V = W4.b.k(y.f3977A, y.f3982y);

    /* JADX INFO: renamed from: W, reason: collision with root package name */
    public static final List f3951W = W4.b.k(C0177h.f3859e, C0177h.f3860f);

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public final List f3952A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public final J3.G f3953B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public final ProxySelector f3954C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public final InterfaceC0179j f3955D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public final SocketFactory f3956E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public final SSLSocketFactory f3957F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public final com.bumptech.glide.c f3958G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public final HostnameVerifier f3959H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public final C0175f f3960I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    public final InterfaceC0171b f3961J;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    public final InterfaceC0171b f3962K;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public final K1.b f3963L;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    public final InterfaceC0181l f3964M;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    public final boolean f3965N;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public final boolean f3966O;

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    public final boolean f3967P;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    public final int f3968Q;

    /* JADX INFO: renamed from: R, reason: collision with root package name */
    public final int f3969R;

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    public final int f3970S;

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    public final int f3971T;

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    public final int f3972U;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final C0180k f3973w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final List f3974x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final List f3975y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final List f3976z;

    static {
        C1017B.f10489z = new C1017B(29);
    }

    public x(w wVar) {
        boolean z5;
        this.f3973w = wVar.f3928a;
        this.f3974x = wVar.f3929b;
        List list = wVar.f3930c;
        this.f3975y = list;
        this.f3976z = W4.b.j(wVar.f3931d);
        this.f3952A = W4.b.j(wVar.f3932e);
        this.f3953B = wVar.f3933f;
        this.f3954C = wVar.f3934g;
        this.f3955D = wVar.f3935h;
        this.f3956E = wVar.f3936i;
        Iterator it = list.iterator();
        loop0: while (true) {
            z5 = false;
            while (it.hasNext()) {
                z5 = (z5 || ((C0177h) it.next()).f3861a) ? true : z5;
            }
        }
        if (z5) {
            try {
                TrustManagerFactory trustManagerFactory = TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm());
                trustManagerFactory.init((KeyStore) null);
                TrustManager[] trustManagers = trustManagerFactory.getTrustManagers();
                if (trustManagers.length == 1) {
                    TrustManager trustManager = trustManagers[0];
                    if (trustManager instanceof X509TrustManager) {
                        X509TrustManager x509TrustManager = (X509TrustManager) trustManager;
                        try {
                            c5.i iVar = c5.i.f6262a;
                            SSLContext sSLContextI = iVar.i();
                            sSLContextI.init(null, new TrustManager[]{x509TrustManager}, null);
                            this.f3957F = sSLContextI.getSocketFactory();
                            this.f3958G = iVar.c(x509TrustManager);
                        } catch (GeneralSecurityException e6) {
                            throw new AssertionError("No System TLS", e6);
                        }
                    }
                }
                throw new IllegalStateException("Unexpected default trust managers:" + Arrays.toString(trustManagers));
            } catch (GeneralSecurityException e7) {
                throw new AssertionError("No System TLS", e7);
            }
        }
        this.f3957F = null;
        this.f3958G = null;
        SSLSocketFactory sSLSocketFactory = this.f3957F;
        if (sSLSocketFactory != null) {
            c5.i.f6262a.f(sSLSocketFactory);
        }
        this.f3959H = wVar.f3937j;
        com.bumptech.glide.c cVar = this.f3958G;
        C0175f c0175f = wVar.f3938k;
        this.f3960I = Objects.equals(c0175f.f3839b, cVar) ? c0175f : new C0175f(c0175f.f3838a, cVar);
        this.f3961J = wVar.f3939l;
        this.f3962K = wVar.f3940m;
        this.f3963L = wVar.f3941n;
        this.f3964M = wVar.f3942o;
        this.f3965N = wVar.f3943p;
        this.f3966O = wVar.f3944q;
        this.f3967P = wVar.f3945r;
        this.f3968Q = wVar.f3946s;
        this.f3969R = wVar.f3947t;
        this.f3970S = wVar.f3948u;
        this.f3971T = wVar.f3949v;
        this.f3972U = 0;
        if (this.f3976z.contains(null)) {
            throw new IllegalStateException("Null interceptor: " + this.f3976z);
        }
        if (this.f3952A.contains(null)) {
            throw new IllegalStateException("Null network interceptor: " + this.f3952A);
        }
    }
}
