package Z4;

import J3.x;
import V4.B;
import V4.E;
import V4.F;
import V4.G;
import V4.H;
import V4.J;
import V4.m;
import V4.s;
import Y4.i;
import f2.h;
import java.io.IOException;
import java.net.ProtocolException;

/* JADX INFO: loaded from: classes.dex */
public final class b implements s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f4967a;

    public b(boolean z5) {
        this.f4967a = z5;
    }

    @Override // V4.s
    public final G a(f fVar) throws IOException {
        boolean z5;
        G gA;
        E e6;
        F fD;
        x xVar = fVar.f4971c;
        if (xVar == null) {
            throw new IllegalStateException();
        }
        Object obj = xVar.f1448d;
        Object obj2 = xVar.f1450f;
        B b6 = fVar.f4973e;
        long jCurrentTimeMillis = System.currentTimeMillis();
        try {
            ((m) obj).getClass();
            ((c) obj2).f(b6);
            ((m) obj).getClass();
            F fD2 = null;
            if (!S3.a.F(b6.f3752b) || (e6 = b6.f3754d) == null) {
                ((i) xVar.f1446b).c(xVar, true, false, null);
                z5 = false;
            } else {
                if ("100-continue".equalsIgnoreCase(b6.f3753c.c("Expect"))) {
                    try {
                        ((c) xVar.f1450f).d();
                        ((m) obj).getClass();
                        fD = xVar.d(true);
                        z5 = true;
                    } catch (IOException e7) {
                        ((m) obj).getClass();
                        xVar.f(e7);
                        throw e7;
                    }
                } else {
                    fD = null;
                    z5 = false;
                }
                if (fD == null) {
                    xVar.f1445a = false;
                    long jA = e6.a();
                    ((m) obj).getClass();
                    f5.x xVar2 = new f5.x(new Y4.a(xVar, ((c) xVar.f1450f).b(b6, jA), jA));
                    e6.c(xVar2);
                    xVar2.close();
                } else {
                    ((i) xVar.f1446b).c(xVar, true, false, null);
                    if (xVar.b().f4866h == null) {
                        ((c) xVar.f1450f).g().h();
                    }
                }
                fD2 = fD;
            }
            try {
                ((c) obj2).c();
                if (!z5) {
                    ((m) obj).getClass();
                }
                if (fD2 == null) {
                    fD2 = xVar.d(false);
                }
                fD2.f3764a = b6;
                fD2.f3768e = xVar.b().f4864f;
                fD2.f3774k = jCurrentTimeMillis;
                fD2.f3775l = System.currentTimeMillis();
                G gA2 = fD2.a();
                int i6 = gA2.f3788y;
                if (i6 == 100) {
                    F fD3 = xVar.d(false);
                    fD3.f3764a = b6;
                    fD3.f3768e = xVar.b().f4864f;
                    fD3.f3774k = jCurrentTimeMillis;
                    fD3.f3775l = System.currentTimeMillis();
                    gA2 = fD3.a();
                    i6 = gA2.f3788y;
                }
                m mVar = (m) obj;
                mVar.getClass();
                if (this.f4967a && i6 == 101) {
                    F fG = gA2.g();
                    fG.f3770g = W4.b.f4487d;
                    gA = fG.a();
                } else {
                    F fG2 = gA2.g();
                    try {
                        ((m) obj).getClass();
                        String strB = gA2.b("Content-Type");
                        long jH = ((c) obj2).h(gA2);
                        fG2.f3770g = new H(strB, jH, h.d(new Y4.b(xVar, ((c) obj2).a(gA2), jH)));
                        gA = fG2.a();
                    } catch (IOException e8) {
                        mVar.getClass();
                        xVar.f(e8);
                        throw e8;
                    }
                }
                if ("close".equalsIgnoreCase(gA.f3786w.f3753c.c("Connection")) || "close".equalsIgnoreCase(gA.b("Connection"))) {
                    ((c) xVar.f1450f).g().h();
                }
                if (i6 == 204 || i6 == 205) {
                    J j6 = gA.f3779C;
                    if (j6.b() > 0) {
                        StringBuilder sbL = H1.a.l("HTTP ", i6, " had non-zero Content-Length: ");
                        sbL.append(j6.b());
                        throw new ProtocolException(sbL.toString());
                    }
                }
                return gA;
            } catch (IOException e9) {
                ((m) obj).getClass();
                xVar.f(e9);
                throw e9;
            }
        } catch (IOException e10) {
            ((m) obj).getClass();
            xVar.f(e10);
            throw e10;
        }
    }
}
