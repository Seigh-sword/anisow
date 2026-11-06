package Y4;

import V4.B;
import V4.C0170a;
import V4.C0175f;
import V4.C0177h;
import V4.F;
import V4.K;
import V4.m;
import V4.r;
import V4.y;
import b5.A;
import b5.EnumC0346b;
import b5.o;
import b5.s;
import b5.t;
import b5.z;
import d.AbstractC0628i;
import f5.G;
import f5.InterfaceC0711h;
import f5.x;
import java.io.IOException;
import java.net.ConnectException;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.net.Socket;
import java.net.SocketException;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSession;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import m2.P;
import s4.AbstractC1305a;
import v0.C1409s;
import x1.C1486b;

/* JADX INFO: loaded from: classes.dex */
public final class d extends o {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e f4860b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final K f4861c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Socket f4862d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Socket f4863e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public V4.o f4864f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public y f4865g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public s f4866h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public f5.y f4867i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public x f4868j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f4869k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f4870l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f4871m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f4872n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f4873o = 1;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final ArrayList f4874p = new ArrayList();

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public long f4875q = Long.MAX_VALUE;

    public d(e eVar, K k5) {
        this.f4860b = eVar;
        this.f4861c = k5;
    }

    @Override // b5.o
    public final void a(s sVar) {
        synchronized (this.f4860b) {
            this.f4873o = sVar.h();
        }
    }

    @Override // b5.o
    public final void b(z zVar) {
        zVar.c(EnumC0346b.REFUSED_STREAM, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00b9 A[ORIG_RETURN, RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void c(int r8, int r9, int r10, int r11, boolean r12, V4.m r13) {
        /*
            Method dump skipped, instruction units count: 301
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: Y4.d.c(int, int, int, int, boolean, V4.m):void");
    }

    public final void d(int i6, int i7, m mVar) throws IOException {
        K k5 = this.f4861c;
        Proxy proxy = k5.f3800b;
        InetSocketAddress inetSocketAddress = k5.f3801c;
        this.f4862d = (proxy.type() == Proxy.Type.DIRECT || proxy.type() == Proxy.Type.HTTP) ? k5.f3799a.f3811c.createSocket() : new Socket(proxy);
        mVar.getClass();
        this.f4862d.setSoTimeout(i7);
        try {
            c5.i.f6262a.h(this.f4862d, inetSocketAddress, i6);
            try {
                this.f4867i = f2.h.d(f2.h.H(this.f4862d));
                this.f4868j = new x(f2.h.G(this.f4862d));
            } catch (NullPointerException e6) {
                if ("throw with null exception".equals(e6.getMessage())) {
                    throw new IOException(e6);
                }
            }
        } catch (ConnectException e7) {
            ConnectException connectException = new ConnectException("Failed to connect to " + inetSocketAddress);
            connectException.initCause(e7);
            throw connectException;
        }
    }

    public final void e(int i6, int i7, int i8, m mVar) throws IOException {
        p.b bVar = new p.b(7);
        K k5 = this.f4861c;
        r rVar = k5.f3799a.f3809a;
        if (rVar == null) {
            throw new NullPointerException("url == null");
        }
        bVar.f12205a = rVar;
        bVar.c("CONNECT", null);
        C0170a c0170a = k5.f3799a;
        ((C1486b) bVar.f12207c).d("Host", W4.b.i(c0170a.f3809a, true));
        ((C1486b) bVar.f12207c).d("Proxy-Connection", "Keep-Alive");
        ((C1486b) bVar.f12207c).d("User-Agent", "okhttp/3.14.9");
        B bA = bVar.a();
        F f6 = new F();
        f6.f3764a = bA;
        f6.f3765b = y.f3982y;
        f6.f3766c = 407;
        f6.f3767d = "Preemptive Authenticate";
        f6.f3770g = W4.b.f4487d;
        f6.f3774k = -1L;
        f6.f3775l = -1L;
        f6.f3769f.d("Proxy-Authenticate", "OkHttp-Preemptive");
        f6.a();
        c0170a.f3812d.getClass();
        d(i6, i7, mVar);
        String str = "CONNECT " + W4.b.i(bA.f3751a, true) + " HTTP/1.1";
        f5.y yVar = this.f4867i;
        a5.g gVar = new a5.g(null, null, yVar, this.f4868j);
        G gD = yVar.f8497w.d();
        long j6 = i7;
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        gD.g(j6, timeUnit);
        this.f4868j.f8494w.d().g(i8, timeUnit);
        gVar.k(bA.f3753c, str);
        gVar.c();
        F fE = gVar.e(false);
        fE.f3764a = bA;
        V4.G gA = fE.a();
        long jA = Z4.e.a(gA);
        if (jA != -1) {
            a5.d dVarI = gVar.i(jA);
            W4.b.p(dVarI, Integer.MAX_VALUE, timeUnit);
            dVarI.close();
        }
        int i9 = gA.f3788y;
        if (i9 != 200) {
            if (i9 != 407) {
                throw new IOException(AbstractC0628i.f("Unexpected response code for CONNECT: ", i9));
            }
            c0170a.f3812d.getClass();
            throw new IOException("Failed to authenticate with proxy");
        }
        if (!this.f4867i.f8498x.E() || !this.f4868j.f8495x.E()) {
            throw new IOException("TLS tunnel buffered too many bytes!");
        }
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final void f(P p5, int i6, m mVar) throws Throwable {
        SSLSocket sSLSocket;
        K k5 = this.f4861c;
        C0170a c0170a = k5.f3799a;
        SSLSocketFactory sSLSocketFactory = c0170a.f3817i;
        y yVarA = y.f3982y;
        if (sSLSocketFactory == null) {
            y yVar = y.f3978B;
            if (!c0170a.f3813e.contains(yVar)) {
                this.f4863e = this.f4862d;
                this.f4865g = yVarA;
                return;
            } else {
                this.f4863e = this.f4862d;
                this.f4865g = yVar;
                i(i6);
                return;
            }
        }
        mVar.getClass();
        C0170a c0170a2 = k5.f3799a;
        SSLSocketFactory sSLSocketFactory2 = c0170a2.f3817i;
        r rVar = c0170a2.f3809a;
        SSLSocket sSLSocket2 = null;
        try {
            try {
                sSLSocket = (SSLSocket) sSLSocketFactory2.createSocket(this.f4862d, rVar.f3906d, rVar.f3907e, true);
            } catch (AssertionError e6) {
                e = e6;
            }
        } catch (Throwable th) {
            th = th;
        }
        try {
            C0177h c0177hA = p5.a(sSLSocket);
            String str = rVar.f3906d;
            boolean z5 = c0177hA.f3862b;
            if (z5) {
                c5.i.f6262a.g(sSLSocket, str, c0170a2.f3813e);
            }
            sSLSocket.startHandshake();
            SSLSession session = sSLSocket.getSession();
            V4.o oVarA = V4.o.a(session);
            boolean zVerify = c0170a2.f3818j.verify(str, session);
            List list = oVarA.f3890c;
            if (zVerify) {
                c0170a2.f3819k.a(str, list);
                String strJ = z5 ? c5.i.f6262a.j(sSLSocket) : null;
                this.f4863e = sSLSocket;
                this.f4867i = f2.h.d(f2.h.H(sSLSocket));
                this.f4868j = new x(f2.h.G(this.f4863e));
                this.f4864f = oVarA;
                if (strJ != null) {
                    yVarA = y.a(strJ);
                }
                this.f4865g = yVarA;
                c5.i.f6262a.a(sSLSocket);
                if (this.f4865g == y.f3977A) {
                    i(i6);
                    return;
                }
                return;
            }
            if (list.isEmpty()) {
                throw new SSLPeerUnverifiedException("Hostname " + str + " not verified (no certificates)");
            }
            X509Certificate x509Certificate = (X509Certificate) list.get(0);
            throw new SSLPeerUnverifiedException("Hostname " + str + " not verified:\n    certificate: " + C0175f.b(x509Certificate) + "\n    DN: " + x509Certificate.getSubjectDN().getName() + "\n    subjectAltNames: " + e5.c.a(x509Certificate));
        } catch (AssertionError e7) {
            e = e7;
            if (!W4.b.m(e)) {
                throw e;
            }
            throw new IOException(e);
        } catch (Throwable th2) {
            th = th2;
            sSLSocket2 = sSLSocket;
            if (sSLSocket2 != null) {
                c5.i.f6262a.a(sSLSocket2);
            }
            W4.b.d(sSLSocket2);
            throw th;
        }
    }

    public final Z4.c g(V4.x xVar, Z4.f fVar) throws SocketException {
        if (this.f4866h != null) {
            return new t(xVar, this, fVar, this.f4866h);
        }
        Socket socket = this.f4863e;
        int i6 = fVar.f4976h;
        socket.setSoTimeout(i6);
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        this.f4867i.f8497w.d().g(i6, timeUnit);
        this.f4868j.f8494w.d().g(fVar.f4977i, timeUnit);
        return new a5.g(xVar, this, this.f4867i, this.f4868j);
    }

    public final void h() {
        synchronized (this.f4860b) {
            this.f4869k = true;
        }
    }

    public final void i(int i6) throws SocketException {
        this.f4863e.setSoTimeout(0);
        b5.m mVar = new b5.m();
        mVar.f6006e = o.f6009a;
        mVar.f6007f = true;
        Socket socket = this.f4863e;
        String str = this.f4861c.f3799a.f3809a.f3906d;
        f5.y yVar = this.f4867i;
        x xVar = this.f4868j;
        mVar.f6002a = socket;
        mVar.f6003b = str;
        mVar.f6004c = yVar;
        mVar.f6005d = xVar;
        mVar.f6006e = this;
        mVar.f6008g = i6;
        s sVar = new s(mVar);
        this.f4866h = sVar;
        A a6 = sVar.f6037Q;
        synchronized (a6) {
            try {
                if (a6.f5936A) {
                    throw new IOException("closed");
                }
                if (a6.f5939x) {
                    Logger logger = A.f5935C;
                    if (logger.isLoggable(Level.FINE)) {
                        String strE = b5.g.f5983a.e();
                        byte[] bArr = W4.b.f4484a;
                        Locale locale = Locale.US;
                        logger.fine(">> CONNECTION " + strE);
                    }
                    InterfaceC0711h interfaceC0711h = a6.f5938w;
                    byte[] bArr2 = b5.g.f5983a.f8463w;
                    byte[] bArrCopyOf = Arrays.copyOf(bArr2, bArr2.length);
                    AbstractC1305a.n(bArrCopyOf, "copyOf(this, size)");
                    interfaceC0711h.e(bArrCopyOf);
                    a6.f5938w.flush();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        A a7 = sVar.f6037Q;
        C1409s c1409s = sVar.f6034N;
        synchronized (a7) {
            try {
                if (a7.f5936A) {
                    throw new IOException("closed");
                }
                a7.g(0, Integer.bitCount(c1409s.f13228a) * 6, (byte) 4, (byte) 0);
                int i7 = 0;
                while (i7 < 10) {
                    if (((1 << i7) & c1409s.f13228a) != 0) {
                        a7.f5938w.r(i7 == 4 ? 3 : i7 == 7 ? 4 : i7);
                        a7.f5938w.w(c1409s.f13229b[i7]);
                    }
                    i7++;
                }
                a7.f5938w.flush();
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (sVar.f6034N.a() != 65535) {
            sVar.f6037Q.n(0, r0 - 65535);
        }
        new Thread(sVar.f6038R).start();
    }

    public final boolean j(r rVar) {
        int i6 = rVar.f3907e;
        r rVar2 = this.f4861c.f3799a.f3809a;
        if (i6 != rVar2.f3907e) {
            return false;
        }
        String str = rVar.f3906d;
        if (str.equals(rVar2.f3906d)) {
            return true;
        }
        V4.o oVar = this.f4864f;
        return oVar != null && e5.c.c(str, (X509Certificate) oVar.f3890c.get(0));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Connection{");
        K k5 = this.f4861c;
        sb.append(k5.f3799a.f3809a.f3906d);
        sb.append(":");
        sb.append(k5.f3799a.f3809a.f3907e);
        sb.append(", proxy=");
        sb.append(k5.f3800b);
        sb.append(" hostAddress=");
        sb.append(k5.f3801c);
        sb.append(" cipherSuite=");
        V4.o oVar = this.f4864f;
        sb.append(oVar != null ? oVar.f3889b : "none");
        sb.append(" protocol=");
        sb.append(this.f4865g);
        sb.append('}');
        return sb.toString();
    }
}
