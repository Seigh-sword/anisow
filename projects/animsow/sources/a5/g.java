package a5;

import V4.B;
import V4.F;
import V4.G;
import V4.p;
import V4.r;
import V4.x;
import V4.y;
import d.AbstractC0628i;
import f5.C;
import f5.E;
import f5.InterfaceC0711h;
import f5.i;
import java.io.EOFException;
import java.io.IOException;
import java.net.Proxy;
import m2.C1017B;
import x1.C1486b;

/* JADX INFO: loaded from: classes.dex */
public final class g implements Z4.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final x f5044a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Y4.d f5045b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final i f5046c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final InterfaceC0711h f5047d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f5048e = 0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public long f5049f = 262144;

    public g(x xVar, Y4.d dVar, i iVar, InterfaceC0711h interfaceC0711h) {
        this.f5044a = xVar;
        this.f5045b = dVar;
        this.f5046c = iVar;
        this.f5047d = interfaceC0711h;
    }

    @Override // Z4.c
    public final E a(G g4) {
        if (!Z4.e.b(g4)) {
            return i(0L);
        }
        if ("chunked".equalsIgnoreCase(g4.b("Transfer-Encoding"))) {
            r rVar = g4.f3786w.f3751a;
            if (this.f5048e == 4) {
                this.f5048e = 5;
                return new c(this, rVar);
            }
            throw new IllegalStateException("state: " + this.f5048e);
        }
        long jA = Z4.e.a(g4);
        if (jA != -1) {
            return i(jA);
        }
        if (this.f5048e == 4) {
            this.f5048e = 5;
            this.f5045b.h();
            return new f(this);
        }
        throw new IllegalStateException("state: " + this.f5048e);
    }

    @Override // Z4.c
    public final C b(B b6, long j6) {
        if ("chunked".equalsIgnoreCase(b6.f3753c.c("Transfer-Encoding"))) {
            if (this.f5048e == 1) {
                this.f5048e = 2;
                return new b(this);
            }
            throw new IllegalStateException("state: " + this.f5048e);
        }
        if (j6 == -1) {
            throw new IllegalStateException("Cannot stream a request body without chunked encoding or a known content length!");
        }
        if (this.f5048e == 1) {
            this.f5048e = 2;
            return new e(this);
        }
        throw new IllegalStateException("state: " + this.f5048e);
    }

    @Override // Z4.c
    public final void c() {
        this.f5047d.flush();
    }

    @Override // Z4.c
    public final void cancel() {
        Y4.d dVar = this.f5045b;
        if (dVar != null) {
            W4.b.d(dVar.f4862d);
        }
    }

    @Override // Z4.c
    public final void d() {
        this.f5047d.flush();
    }

    @Override // Z4.c
    public final F e(boolean z5) {
        int i6 = this.f5048e;
        if (i6 != 1 && i6 != 3) {
            throw new IllegalStateException("state: " + this.f5048e);
        }
        try {
            String strP = this.f5046c.p(this.f5049f);
            this.f5049f -= (long) strP.length();
            F.d dVarE = F.d.e(strP);
            F f6 = new F();
            f6.f3765b = (y) dVarE.f434y;
            f6.f3766c = dVarE.f433x;
            f6.f3767d = (String) dVarE.f435z;
            f6.f3769f = j().e();
            if (z5 && dVarE.f433x == 100) {
                return null;
            }
            if (dVarE.f433x == 100) {
                this.f5048e = 3;
                return f6;
            }
            this.f5048e = 4;
            return f6;
        } catch (EOFException e6) {
            Y4.d dVar = this.f5045b;
            throw new IOException(AbstractC0628i.q("unexpected end of stream on ", dVar != null ? dVar.f4861c.f3799a.f3809a.k() : "unknown"), e6);
        }
    }

    @Override // Z4.c
    public final void f(B b6) {
        Proxy.Type type = this.f5045b.f4861c.f3800b.type();
        StringBuilder sb = new StringBuilder();
        sb.append(b6.f3752b);
        sb.append(' ');
        r rVar = b6.f3751a;
        if (rVar.f3903a.equals("https") || type != Proxy.Type.HTTP) {
            sb.append(S3.a.H(rVar));
        } else {
            sb.append(rVar);
        }
        sb.append(" HTTP/1.1");
        k(b6.f3753c, sb.toString());
    }

    @Override // Z4.c
    public final Y4.d g() {
        return this.f5045b;
    }

    @Override // Z4.c
    public final long h(G g4) {
        if (!Z4.e.b(g4)) {
            return 0L;
        }
        if ("chunked".equalsIgnoreCase(g4.b("Transfer-Encoding"))) {
            return -1L;
        }
        return Z4.e.a(g4);
    }

    public final d i(long j6) {
        if (this.f5048e == 4) {
            this.f5048e = 5;
            return new d(this, j6);
        }
        throw new IllegalStateException("state: " + this.f5048e);
    }

    public final p j() {
        C1486b c1486b = new C1486b(2);
        while (true) {
            String strP = this.f5046c.p(this.f5049f);
            this.f5049f -= (long) strP.length();
            if (strP.length() == 0) {
                return new p(c1486b);
            }
            C1017B.f10489z.getClass();
            int iIndexOf = strP.indexOf(":", 1);
            if (iIndexOf != -1) {
                c1486b.b(strP.substring(0, iIndexOf), strP.substring(iIndexOf + 1));
            } else {
                if (strP.startsWith(":")) {
                    strP = strP.substring(1);
                }
                c1486b.b("", strP);
            }
        }
    }

    public final void k(p pVar, String str) {
        if (this.f5048e != 0) {
            throw new IllegalStateException("state: " + this.f5048e);
        }
        InterfaceC0711h interfaceC0711h = this.f5047d;
        interfaceC0711h.z(str).z("\r\n");
        int iG = pVar.g();
        for (int i6 = 0; i6 < iG; i6++) {
            interfaceC0711h.z(pVar.d(i6)).z(": ").z(pVar.h(i6)).z("\r\n");
        }
        interfaceC0711h.z("\r\n");
        this.f5048e = 1;
    }
}
