package b5;

import V4.F;
import V4.G;
import f5.E;
import java.io.IOException;
import java.net.ProtocolException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
import m2.C1017B;
import x1.C1486b;

/* JADX INFO: loaded from: classes.dex */
public final class t implements Z4.c {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final List f6044g = W4.b.k("connection", "host", "keep-alive", "proxy-connection", "te", "transfer-encoding", "encoding", "upgrade", ":method", ":path", ":scheme", ":authority");

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final List f6045h = W4.b.k("connection", "host", "keep-alive", "proxy-connection", "te", "transfer-encoding", "encoding", "upgrade");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Z4.f f6046a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Y4.d f6047b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final s f6048c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public volatile z f6049d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final V4.y f6050e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public volatile boolean f6051f;

    public t(V4.x xVar, Y4.d dVar, Z4.f fVar, s sVar) {
        this.f6047b = dVar;
        this.f6046a = fVar;
        this.f6048c = sVar;
        V4.y yVar = V4.y.f3978B;
        this.f6050e = xVar.f3974x.contains(yVar) ? yVar : V4.y.f3977A;
    }

    @Override // Z4.c
    public final E a(G g4) {
        return this.f6049d.f6080g;
    }

    @Override // Z4.c
    public final f5.C b(V4.B b6, long j6) {
        return this.f6049d.f();
    }

    @Override // Z4.c
    public final void c() {
        this.f6049d.f().close();
    }

    @Override // Z4.c
    public final void cancel() {
        this.f6051f = true;
        if (this.f6049d != null) {
            this.f6049d.e(EnumC0346b.CANCEL);
        }
    }

    @Override // Z4.c
    public final void d() {
        this.f6048c.flush();
    }

    @Override // Z4.c
    public final F e(boolean z5) throws IOException {
        V4.p pVar;
        z zVar = this.f6049d;
        synchronized (zVar) {
            zVar.f6082i.h();
            while (zVar.f6078e.isEmpty() && zVar.f6084k == null) {
                try {
                    zVar.j();
                } catch (Throwable th) {
                    zVar.f6082i.l();
                    throw th;
                }
            }
            zVar.f6082i.l();
            if (zVar.f6078e.isEmpty()) {
                IOException iOException = zVar.f6085l;
                if (iOException != null) {
                    throw iOException;
                }
                throw new D(zVar.f6084k);
            }
            pVar = (V4.p) zVar.f6078e.removeFirst();
        }
        V4.y yVar = this.f6050e;
        ArrayList arrayList = new ArrayList(20);
        int iG = pVar.g();
        F.d dVarE = null;
        for (int i6 = 0; i6 < iG; i6++) {
            String strD = pVar.d(i6);
            String strH = pVar.h(i6);
            if (strD.equals(":status")) {
                dVarE = F.d.e("HTTP/1.1 " + strH);
            } else if (!f6045h.contains(strD)) {
                C1017B.f10489z.getClass();
                arrayList.add(strD);
                arrayList.add(strH.trim());
            }
        }
        if (dVarE == null) {
            throw new ProtocolException("Expected ':status' header not present");
        }
        F f6 = new F();
        f6.f3765b = yVar;
        f6.f3766c = dVarE.f433x;
        f6.f3767d = (String) dVarE.f435z;
        String[] strArr = (String[]) arrayList.toArray(new String[arrayList.size()]);
        C1486b c1486b = new C1486b(2);
        Collections.addAll(c1486b.f13667a, strArr);
        f6.f3769f = c1486b;
        if (z5) {
            C1017B.f10489z.getClass();
            if (f6.f3766c == 100) {
                return null;
            }
        }
        return f6;
    }

    @Override // Z4.c
    public final void f(V4.B b6) throws IOException {
        int i6;
        z zVar;
        boolean z5;
        if (this.f6049d != null) {
            return;
        }
        boolean z6 = b6.f3754d != null;
        V4.p pVar = b6.f3753c;
        ArrayList arrayList = new ArrayList(pVar.g() + 4);
        arrayList.add(new C0347c(C0347c.f5958f, b6.f3752b));
        f5.j jVar = C0347c.f5959g;
        V4.r rVar = b6.f3751a;
        arrayList.add(new C0347c(jVar, S3.a.H(rVar)));
        String strC = b6.f3753c.c("Host");
        if (strC != null) {
            arrayList.add(new C0347c(C0347c.f5961i, strC));
        }
        arrayList.add(new C0347c(C0347c.f5960h, rVar.f3903a));
        int iG = pVar.g();
        for (int i7 = 0; i7 < iG; i7++) {
            String lowerCase = pVar.d(i7).toLowerCase(Locale.US);
            if (!f6044g.contains(lowerCase) || (lowerCase.equals("te") && pVar.h(i7).equals("trailers"))) {
                arrayList.add(new C0347c(lowerCase, pVar.h(i7)));
            }
        }
        s sVar = this.f6048c;
        boolean z7 = !z6;
        synchronized (sVar.f6037Q) {
            synchronized (sVar) {
                try {
                    if (sVar.f6022B > 1073741823) {
                        sVar.n(EnumC0346b.REFUSED_STREAM);
                    }
                    if (sVar.f6023C) {
                        throw new C0345a();
                    }
                    i6 = sVar.f6022B;
                    sVar.f6022B = i6 + 2;
                    zVar = new z(i6, sVar, z7, false, null);
                    z5 = !z6 || sVar.f6033M == 0 || zVar.f6075b == 0;
                    if (zVar.h()) {
                        sVar.f6042y.put(Integer.valueOf(i6), zVar);
                    }
                } finally {
                }
            }
            A a6 = sVar.f6037Q;
            synchronized (a6) {
                if (a6.f5936A) {
                    throw new IOException("closed");
                }
                a6.f5937B.d(arrayList);
                long j6 = a6.f5940y.f8461x;
                int iMin = (int) Math.min(a6.f5941z, j6);
                long j7 = iMin;
                byte b7 = j6 == j7 ? (byte) 4 : (byte) 0;
                a6.g(i6, iMin, (byte) 1, z7 ? (byte) (b7 | 1) : b7);
                a6.f5938w.q(a6.f5940y, j7);
                if (j6 > j7) {
                    a6.u(i6, j6 - j7);
                }
            }
        }
        if (z5) {
            sVar.f6037Q.flush();
        }
        this.f6049d = zVar;
        if (this.f6051f) {
            this.f6049d.e(EnumC0346b.CANCEL);
            throw new IOException("Canceled");
        }
        y yVar = this.f6049d.f6082i;
        long j8 = this.f6046a.f4976h;
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        yVar.g(j8, timeUnit);
        this.f6049d.f6083j.g(this.f6046a.f4977i, timeUnit);
    }

    @Override // Z4.c
    public final Y4.d g() {
        return this.f6047b;
    }

    @Override // Z4.c
    public final long h(G g4) {
        return Z4.e.a(g4);
    }
}
