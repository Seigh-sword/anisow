package X4;

import V4.B;
import V4.C0173d;
import V4.F;
import V4.G;
import V4.p;
import V4.s;
import V4.x;
import V4.y;
import W4.b;
import Y4.c;
import Y4.i;
import Z4.f;
import a3.C0261b;
import com.bumptech.glide.d;
import d.AbstractC0628i;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import m2.C1017B;
import x1.C1486b;

/* JADX INFO: loaded from: classes.dex */
public final class a implements s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4699a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f4700b;

    public /* synthetic */ a(int i6, x xVar) {
        this.f4699a = i6;
        this.f4700b = xVar;
    }

    public static boolean b(String str) {
        return ("Connection".equalsIgnoreCase(str) || "Keep-Alive".equalsIgnoreCase(str) || "Proxy-Authenticate".equalsIgnoreCase(str) || "Proxy-Authorization".equalsIgnoreCase(str) || "TE".equalsIgnoreCase(str) || "Trailers".equalsIgnoreCase(str) || "Transfer-Encoding".equalsIgnoreCase(str) || "Upgrade".equalsIgnoreCase(str)) ? false : true;
    }

    public static G c(G g4) {
        if (g4 == null || g4.f3779C == null) {
            return g4;
        }
        F fG = g4.g();
        fG.f3770g = null;
        return fG.a();
    }

    @Override // V4.s
    public final G a(f fVar) {
        switch (this.f4699a) {
            case d.f6312l /* 0 */:
                Object obj = this.f4700b;
                AbstractC0628i.p(obj);
                System.currentTimeMillis();
                B b6 = fVar.f4973e;
                C0261b c0261b = new C0261b(b6, (Object) null, 15);
                if (b6 != null) {
                    C0173d c0173dA = b6.f3756f;
                    if (c0173dA == null) {
                        c0173dA = C0173d.a(b6.f3753c);
                        b6.f3756f = c0173dA;
                    }
                    if (c0173dA.f3833j) {
                        c0261b = new C0261b((Object) null, (Object) null, 15);
                    }
                }
                B b7 = (B) c0261b.f5011x;
                G g4 = (G) c0261b.f5012y;
                AbstractC0628i.p(obj);
                if (b7 == null && g4 == null) {
                    F f6 = new F();
                    f6.f3764a = fVar.f4973e;
                    f6.f3765b = y.f3982y;
                    f6.f3766c = 504;
                    f6.f3767d = "Unsatisfiable Request (only-if-cached)";
                    f6.f3770g = b.f4487d;
                    f6.f3774k = -1L;
                    f6.f3775l = System.currentTimeMillis();
                    return f6.a();
                }
                if (b7 == null) {
                    F fG = g4.g();
                    G gC = c(g4);
                    if (gC != null) {
                        F.b("cacheResponse", gC);
                    }
                    fG.f3772i = gC;
                    return fG.a();
                }
                G gA = fVar.a(b7);
                if (g4 != null) {
                    if (gA.f3788y == 304) {
                        F fG2 = g4.g();
                        ArrayList arrayList = new ArrayList(20);
                        p pVar = g4.f3778B;
                        int iG = pVar.g();
                        int i6 = 0;
                        while (true) {
                            p pVar2 = gA.f3778B;
                            if (i6 >= iG) {
                                int iG2 = pVar2.g();
                                for (int i7 = 0; i7 < iG2; i7++) {
                                    String strD = pVar2.d(i7);
                                    if (!"Content-Length".equalsIgnoreCase(strD) && !"Content-Encoding".equalsIgnoreCase(strD) && !"Content-Type".equalsIgnoreCase(strD) && b(strD)) {
                                        C1017B c1017b = C1017B.f10489z;
                                        String strH = pVar2.h(i7);
                                        c1017b.getClass();
                                        arrayList.add(strD);
                                        arrayList.add(strH.trim());
                                    }
                                }
                                String[] strArr = (String[]) arrayList.toArray(new String[arrayList.size()]);
                                C1486b c1486b = new C1486b(2);
                                Collections.addAll(c1486b.f13667a, strArr);
                                fG2.f3769f = c1486b;
                                fG2.f3774k = gA.f3783G;
                                fG2.f3775l = gA.f3784H;
                                G gC2 = c(g4);
                                if (gC2 != null) {
                                    F.b("cacheResponse", gC2);
                                }
                                fG2.f3772i = gC2;
                                G gC3 = c(gA);
                                if (gC3 != null) {
                                    F.b("networkResponse", gC3);
                                }
                                fG2.f3771h = gC3;
                                fG2.a();
                                gA.f3779C.close();
                                AbstractC0628i.p(obj);
                                throw null;
                            }
                            String strD2 = pVar.d(i6);
                            String strH2 = pVar.h(i6);
                            if ((!"Warning".equalsIgnoreCase(strD2) || !strH2.startsWith("1")) && ("Content-Length".equalsIgnoreCase(strD2) || "Content-Encoding".equalsIgnoreCase(strD2) || "Content-Type".equalsIgnoreCase(strD2) || !b(strD2) || pVar2.c(strD2) == null)) {
                                C1017B.f10489z.getClass();
                                arrayList.add(strD2);
                                arrayList.add(strH2.trim());
                            }
                            i6++;
                        }
                    } else {
                        b.c(g4.f3779C);
                    }
                }
                F fG3 = gA.g();
                G gC4 = c(g4);
                if (gC4 != null) {
                    F.b("cacheResponse", gC4);
                }
                fG3.f3772i = gC4;
                G gC5 = c(gA);
                if (gC5 != null) {
                    F.b("networkResponse", gC5);
                }
                fG3.f3771h = gC5;
                G gA2 = fG3.a();
                AbstractC0628i.p(obj);
                return gA2;
            default:
                B b8 = fVar.f4973e;
                i iVar = fVar.f4970b;
                boolean z5 = !b8.f3752b.equals("GET");
                synchronized (iVar.f4888b) {
                    if (iVar.f4901o) {
                        throw new IllegalStateException("released");
                    }
                    if (iVar.f4896j != null) {
                        throw new IllegalStateException("cannot make a new request because the previous response is still open: please call response.close()");
                    }
                }
                c cVar = iVar.f4894h;
                x xVar = iVar.f4887a;
                cVar.getClass();
                try {
                    J3.x xVar2 = new J3.x(iVar, iVar.f4889c, iVar.f4890d, iVar.f4894h, cVar.b(fVar.f4975g, fVar.f4976h, fVar.f4977i, xVar.f3972U, xVar.f3967P, z5).g(xVar, fVar));
                    synchronized (iVar.f4888b) {
                        iVar.f4896j = xVar2;
                        iVar.f4897k = false;
                        iVar.f4898l = false;
                        break;
                    }
                    return fVar.b(b8, iVar, xVar2);
                } catch (Y4.f e6) {
                    synchronized (cVar.f4853c) {
                        cVar.f4858h = true;
                        throw e6;
                    }
                } catch (IOException e7) {
                    synchronized (cVar.f4853c) {
                        cVar.f4858h = true;
                        throw new Y4.f(e7);
                    }
                }
        }
    }
}
